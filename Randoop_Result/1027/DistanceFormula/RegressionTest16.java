package DistanceFormula;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test08001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08001");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(619.6523847451149d, 1728.289644995628d, 2263.9596978345935d, 874.806609068789d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1663.986243353519d + "'", double4 == 1663.986243353519d);
    }

    @Test
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08002");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2517.0790138401185d, 439.40340754804583d, 293.3508435673762d, 1203.6305447770274d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2582.6563565733513d + "'", double4 == 2582.6563565733513d);
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08003");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(721.2584480765205d, 935.5627697630805d, 1538.914391985074d, 2023.1110291729233d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1905.2042033183961d + "'", double4 == 1905.2042033183961d);
    }

    @Test
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08004");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(560.0246542664447d, 1493.3640711629396d, 2466.4210784519755d, 1755.8394358664898d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2250.4044787638827d + "'", double4 == 2250.4044787638827d);
    }

    @Test
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08005");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(342.4995047812538d, 477.162046554999d, 1689.921502333886d, 2082.3547958602935d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2200.6004801836375d + "'", double4 == 2200.6004801836375d);
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08006");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1659.1829627330644d, 1602.853044473853d, 377.9272290901831d, 567.8266350960342d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1683.0552245443828d + "'", double4 == 1683.0552245443828d);
    }

    @Test
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08007");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1801.0139155351121d, 0.0d, 483.69245455426403d, 3513.393075096301d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2160.4578722252836d + "'", double4 == 2160.4578722252836d);
    }

    @Test
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08008");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2179.1280774226193d, 965.3587408087419d, 3204.7597357909353d, 1332.3079864386434d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1330.0468281761555d + "'", double4 == 1330.0468281761555d);
    }

    @Test
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08009");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(583.1158393744522d, 0.0d, 280.4959535280503d, 2443.903954000642d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1885.2350524122394d + "'", double4 == 1885.2350524122394d);
    }

    @Test
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08010");
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
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray62);
        int[] intArray69 = new int[] { 1, 1, 100 };
        int[] intArray71 = new int[] { (byte) -1 };
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray71);
        int[] intArray76 = new int[] { 1, 1, 100 };
        int[] intArray78 = new int[] { (byte) -1 };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray76, intArray78);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray78);
        int[] intArray84 = new int[] { 1, 1, 100 };
        int[] intArray86 = new int[] { (byte) -1 };
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray86);
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray78, intArray86);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray78);
        java.lang.Class<?> wildcardClass90 = intArray78.getClass();
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
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[-1]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08011");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2616.4903071402678d, 685.41824613244d, 0.0d, 592.9366778909589d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2708.9718753817488d + "'", double4 == 2708.9718753817488d);
    }

    @Test
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08012");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(637.8514798973449d, 2078.3960986302786d, 2263.7956266772335d, 1083.5757595569657d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2620.764485853201d + "'", double4 == 2620.764485853201d);
    }

    @Test
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08013");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(883.48852566761d, 1080.5482089392854d, 71.53615965246802d, 536.1815974651743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 883.113099809418d + "'", double4 == 883.113099809418d);
    }

    @Test
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08014");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1081.995014688306d, 220.78840830511703d, 1688.9205020268969d, 1815.3200360754631d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2201.457115108937d + "'", double4 == 2201.457115108937d);
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08015");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(483.6996920353407d, 519.8878381495481d, 193.95294102512952d, 729.9405993671058d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 499.79951222776896d + "'", double4 == 499.79951222776896d);
    }

    @Test
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08016");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1384.9317178207016d, 693.417905157533d, 1079.189784843851d, 1572.2845848438903d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 358.57945613521935d + "'", double4 == 358.57945613521935d);
    }

    @Test
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08017");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1073.0984655358986d, 660.6069347512115d, 2131.69335381138d, 397.8625759407711d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1255.6140506064362d + "'", double4 == 1255.6140506064362d);
    }

    @Test
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08018");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(513.8338591778103d, 2554.207583117756d, 938.0820197110341d, 29.016284593150402d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 644.231776880011d + "'", double4 == 644.231776880011d);
    }

    @Test
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08019");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1024.4480608974482d, 1697.2068556798629d, 428.196971756117d, 4922.123454010138d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3821.167687471606d + "'", double4 == 3821.167687471606d);
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08020");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(524.6435521795014d, 1461.5954009104728d, 1029.189112501497d, 264.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1702.1409612324683d + "'", double4 == 1702.1409612324683d);
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08021");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(709.9839372762594d, 986.8203513827043d, 2213.6714436564234d, 1337.2300857820032d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1629.267887015234d + "'", double4 == 1629.267887015234d);
    }

    @Test
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08022");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(150.00535004535024d, 2946.137368079651d, 2026.971687400784d, 1416.077305551973d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3407.0263998831115d + "'", double4 == 3407.0263998831115d);
    }

    @Test
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08023");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray9 = new int[] { 'a', 10 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray9);
        int[] intArray14 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray18 = new int[] { 1, 1, 100 };
        int[] intArray20 = new int[] { (byte) -1 };
        int int21 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray18, intArray20);
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray18);
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
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray50);
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray18, intArray28);
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray9, intArray18);
        java.lang.Class<?> wildcardClass56 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 72 + "'", int22 == 72);
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08024");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(810.4677820566644d, 2352.8594294575623d, 1154.1347672817092d, 1739.9040086647174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 990.9382907452346d + "'", double4 == 990.9382907452346d);
    }

    @Test
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08025");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(358.666116899047d, 22.409854457620142d, 195.8747027899148d, 630.521265834824d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 770.902825486336d + "'", double4 == 770.902825486336d);
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08026");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(275.0065142587339d, 593.2676291862059d, 623.3432627627512d, 109.59014554237986d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 832.0142321478434d + "'", double4 == 832.0142321478434d);
    }

    @Test
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08027");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(247.19697154451043d, 2324.882277663795d, 1657.867787300058d, 383.6847775335497d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1417.258293892868d + "'", double4 == 1417.258293892868d);
    }

    @Test
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08028");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(565.4446936464491d, 877.6746020583363d, 406.6144590385233d, 553.0556919454142d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 159.31268244793628d + "'", double4 == 159.31268244793628d);
    }

    @Test
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08029");
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
        double[] doubleArray52 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray53 = new double[] {};
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray53, 0);
        double[] doubleArray60 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray61 = new double[] {};
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray61, 0);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray52, doubleArray61, (int) (short) 100);
        double[] doubleArray68 = new double[] { (byte) 0, 132.0d };
        double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray68, (int) '4');
        double double72 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray68, (int) (byte) 100);
        java.lang.Class<?> wildcardClass73 = doubleArray43.getClass();
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
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08030");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(376.5906109081539d, 468.9509167769467d, 776.4995539649813d, 1945.4738519253194d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1619.0496554094177d + "'", double4 == 1619.0496554094177d);
    }

    @Test
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08031");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2088.692003539712d, 3434.4191331233d, 254.1750580513463d, 1930.0453444676884d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1841.3639471105864d + "'", double4 == 1841.3639471105864d);
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08032");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(391.3939305386865d, 0.0d, 4255.508539484552d, 1173.0068643841632d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5037.1214733300285d + "'", double4 == 5037.1214733300285d);
    }

    @Test
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08033");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(97.10956325067855d, 2249.932525395105d, 2518.037835024068d, 216.8310642801902d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4454.029732888304d + "'", double4 == 4454.029732888304d);
    }

    @Test
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08034");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1452.2325537115544d, 1133.7080286287198d, 4286.591150191658d, 956.2873335560257d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3011.779291552798d + "'", double4 == 3011.779291552798d);
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08035");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 641.156637911209d, 1022.8560353026392d, 76.81533377227437d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1025.7363523135855d + "'", double4 == 1025.7363523135855d);
    }

    @Test
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08036");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(831.8376803062826d, 0.0d, 489.5472968394182d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 342.29038346686434d + "'", double4 == 342.29038346686434d);
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08037");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(628.8349589675499d, 503.49232769329114d, 504.0523441952501d, 839.8033335171348d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 245.1088656281247d + "'", double4 == 245.1088656281247d);
    }

    @Test
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08038");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2542.2569925311673d, 983.8233062270116d, (double) 1, 2414.1871763777594d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2544.482065155524d + "'", double4 == 2544.482065155524d);
    }

    @Test
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08039");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(875.7516736593531d, 324.8116635053653d, 669.6524997733757d, 599.1954026113349d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 480.482912991947d + "'", double4 == 480.482912991947d);
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08040");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2294.6287863299817d, 479.72399948775677d, 447.9009765711399d, 1307.4820858336075d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2094.006258738872d + "'", double4 == 2094.006258738872d);
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08041");
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
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray68);
        java.lang.Class<?> wildcardClass75 = intArray68.getClass();
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
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08042");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1476.509392687204d, 831.510166037374d, 967.2183354736177d, 1485.4608430563756d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1163.2417342325878d + "'", double4 == 1163.2417342325878d);
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08043");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1008.9473944400337d, 7777.302188270409d, 971.96603736562d, 1346.146104841173d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 339.22056403947073d + "'", double4 == 339.22056403947073d);
    }

    @Test
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08044");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1435.8224345457372d, 145.26167378243554d, 617.4713644682606d, 463.53642524090617d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1136.6258215359471d + "'", double4 == 1136.6258215359471d);
    }

    @Test
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08045");
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
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray60, doubleArray69, 1);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray60, 100);
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
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08046");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(923.0475533712627d, 670.5758606104857d, 383.9382500295667d, 1340.3135896538652d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 681.7255943446476d + "'", double4 == 681.7255943446476d);
    }

    @Test
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08047");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(927.1665824228618d, 2461.6937112763135d, 53.46463868523314d, 6992.612267866089d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5404.6205003274035d + "'", double4 == 5404.6205003274035d);
    }

    @Test
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08048");
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
        int[] intArray97 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int98 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray97);
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
    }

    @Test
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08049");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(913.9919598167148d, 428.1565388515537d, 2668.977638529901d, 1289.5240065737935d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2616.353146435426d + "'", double4 == 2616.353146435426d);
    }

    @Test
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08050");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(901.3253854204611d, 482.7855959125905d, 487.2323783182032d, 1815.6999920845078d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1003.7698639842804d + "'", double4 == 1003.7698639842804d);
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08051");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2151.8932710964295d, 215.05196722620533d, 1162.0581563550118d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2278.1658302998844d + "'", double4 == 2278.1658302998844d);
    }

    @Test
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08052");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3435.252021644794d, 928.4610636634484d, 1359.661242426394d, 1423.2820867654536d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2890.691976263611d + "'", double4 == 2890.691976263611d);
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08053");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2079.017019307611d, 1117.0694893632d, 143.38926349619703d, 2852.8794446187608d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2084.5905742797518d + "'", double4 == 2084.5905742797518d);
    }

    @Test
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08054");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2604.8075925860267d, 2621.569511336641d, 357.47422719117975d, 1593.7210318732734d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2464.305843127203d + "'", double4 == 2464.305843127203d);
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08055");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1310.2481478583418d, 1710.3363869090706d, 0.0d, 1423.5278319700874d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1597.056702797325d + "'", double4 == 1597.056702797325d);
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08056");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(881.5814085104663d, 466.4346434120471d, 1546.4555243494597d, 652.042545403267d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 850.4820178302133d + "'", double4 == 850.4820178302133d);
    }

    @Test
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08057");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1280.4340264025495d, 231.99599871083882d, 762.2907433365718d, 422.59981641014514d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1002.1736344664442d + "'", double4 == 1002.1736344664442d);
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08058");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(956.5579343315898d, 1546.538813930864d, 188.71611826075284d, 1095.4592052939295d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 780.3041827274247d + "'", double4 == 780.3041827274247d);
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08059");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(632.5257915100306d, 682.3932453456185d, 718.8178596048987d, 497.6952949381995d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 270.99001850228717d + "'", double4 == 270.99001850228717d);
    }

    @Test
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08060");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1555.206631700226d, 394.8787896067389d, 1650.5689502464306d, 1633.3131113488175d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1333.7966402882835d + "'", double4 == 1333.7966402882835d);
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08061");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 748.0414034714805d, 3596.772336640385d, 1072.4424828297465d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3921.1734159986513d + "'", double4 == 3921.1734159986513d);
    }

    @Test
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08062");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(324.709131047698d, 1140.588688718335d, 2366.4119285405027d, 1173.9814545455977d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2211.2923354340705d + "'", double4 == 2211.2923354340705d);
    }

    @Test
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08063");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(353.7118870524356d, 1117.6888075212794d, 5005.431884226412d, 1080.9689928527675d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4688.439811842489d + "'", double4 == 4688.439811842489d);
    }

    @Test
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08064");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2529.031550540857d, 1667.8117226088834d, 799.5015552494838d, 490.3301173206524d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2673.4953784188024d + "'", double4 == 2673.4953784188024d);
    }

    @Test
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08065");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(803.6708840159037d, 227.28555892292607d, 997.1396625330085d, 607.089723914349d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 275.81573698354066d + "'", double4 == 275.81573698354066d);
    }

    @Test
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08066");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(657.7348045524657d, 549.3125341897686d, 2212.0898829125053d, 280.6078266587642d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1599.4513018778912d + "'", double4 == 1599.4513018778912d);
    }

    @Test
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08067");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1496.5843769624714d, 2578.655020382087d, 1376.2526188277607d, 419.24830980945603d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1084.0353931512184d + "'", double4 == 1084.0353931512184d);
    }

    @Test
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08068");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2267.38503150545d, 434.59128451792674d, 3221.30025411899d, 490.974661774162d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2016.3303433769702d + "'", double4 == 2016.3303433769702d);
    }

    @Test
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08069");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(722.7045671883419d, 842.6558508680938d, 148.6542972722118d, 2351.3306832640114d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2082.725102312048d + "'", double4 == 2082.725102312048d);
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08070");
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
        double[] doubleArray48 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray49 = new double[] {};
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray48, doubleArray49, 0);
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray49, (int) (byte) 1);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray41, (int) (short) -1);
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
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray68, (int) ' ');
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray41, doubleArray68, (int) (short) 10);
        double[] doubleArray90 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray91 = new double[] {};
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray90, doubleArray91, 0);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray91, 26);
        double double97 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray68, (int) '4');
        java.lang.Class<?> wildcardClass98 = doubleArray68.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
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
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08071");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1254.822632409213d, 1957.2966026233007d, 652.042545403267d, 530.1671498841977d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2029.909539745049d + "'", double4 == 2029.909539745049d);
    }

    @Test
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08072");
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
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray22, 100);
        java.lang.Class<?> wildcardClass48 = doubleArray22.getClass();
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
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08073");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1569.3096664183115d, 483.149981034691d, 1174.9292440036095d, 1965.6148333606066d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 559.1007985409778d + "'", double4 == 559.1007985409778d);
    }

    @Test
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08074");
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
        java.lang.Class<?> wildcardClass68 = doubleArray29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08075");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(294.23064380680285d, 1044.516798678362d, 1905.2979125530956d, 1490.599607119517d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2057.150077187448d + "'", double4 == 2057.150077187448d);
    }

    @Test
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08076");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1825.0950574246006d, 1118.24077114537d, 761.1212448568324d, 1495.4363159892928d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1441.169357411691d + "'", double4 == 1441.169357411691d);
    }

    @Test
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08077");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(579.8474205792834d, 7690.748078427935d, 779.9841197127514d, 461.9675493191503d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 232.27217308223956d + "'", double4 == 232.27217308223956d);
    }

    @Test
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08078");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(554.8297199276109d, 804.1091708217295d, 861.2748438407554d, 2048.4408348797183d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1550.7767879711332d + "'", double4 == 1550.7767879711332d);
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08079");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(96.05767204529039d, 277.1976496143225d, (double) (short) 1, 760.7465171934783d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 671.45157820881d + "'", double4 == 671.45157820881d);
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08080");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(457.93935464055545d, 101.79250162264779d, 1424.5798640010707d, 1353.448044776758d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1317.6986333931648d + "'", double4 == 1317.6986333931648d);
    }

    @Test
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08081");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 0.0d, 293.6673919614228d, 962.5824041711725d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1256.2497961325953d + "'", double4 == 1256.2497961325953d);
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08082");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(729.8639875131913d, 712.8367414396928d, 1768.7133071730161d, 1172.5423842121045d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1498.5549624322364d + "'", double4 == 1498.5549624322364d);
    }

    @Test
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08083");
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
        int[] intArray51 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray55 = new int[] { 1, 1, 100 };
        int[] intArray57 = new int[] { (byte) -1 };
        int int58 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray55, intArray57);
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray55);
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray22, intArray51);
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray15, intArray22);
        int[] intArray65 = new int[] { 1, 1, 100 };
        int[] intArray67 = new int[] { (byte) -1 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray67);
        int[] intArray71 = new int[] { 'a', 10 };
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray71);
        int int73 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray22, intArray67);
        // The following exception was thrown during execution in test generation
        try {
            int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray22);
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
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 72 + "'", int59 == 72);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08084");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1487.5038290332905d, 3444.010671130158d, 1609.8435490307822d, 1466.7318327413238d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2099.6185583863257d + "'", double4 == 2099.6185583863257d);
    }

    @Test
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08085");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(439.2591763903302d, 527.1907224716535d, 842.0424252196623d, 486.1444817768018d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 405.50286977861737d + "'", double4 == 405.50286977861737d);
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08086");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1601.7171523612824d, 582.1574183122069d, 1207.3033873692275d, 4501.066758889818d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4313.323105569665d + "'", double4 == 4313.323105569665d);
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08087");
        double[] doubleArray0 = null;
        double[] doubleArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray1, 136);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08088");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1463.7224374719767d, 2517.26858663469d, 287.0d, 2781.3051071353293d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1766.5502501336318d + "'", double4 == 1766.5502501336318d);
    }

    @Test
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08089");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(441.24776911836136d, 887.7178164262006d, 534.0054007349432d, 2090.8965702991927d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1652.254564363637d + "'", double4 == 1652.254564363637d);
    }

    @Test
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08090");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(478.8997982639517d, 1937.6771195947044d, 765.2293621740017d, 2854.24679880065d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2392.542160992698d + "'", double4 == 2392.542160992698d);
    }

    @Test
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08091");
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
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray32);
        int[] intArray38 = new int[] { 1, 1, 100 };
        int[] intArray40 = new int[] { (byte) -1 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray40);
        int[] intArray44 = new int[] { 'a', 10 };
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray40, intArray44);
        int[] intArray49 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray40, intArray49);
        int[] intArray54 = new int[] { (byte) -1, '#', (-1) };
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray40, intArray54);
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray40);
        int[] intArray60 = new int[] { 1, 1, 100 };
        int[] intArray62 = new int[] { (byte) -1 };
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray62);
        int[] intArray66 = new int[] { 'a', 10 };
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray66);
        int[] intArray71 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray71);
        int[] intArray76 = new int[] { (byte) -1, '#', (-1) };
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray76);
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray62);
        int[] intArray82 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray86 = new int[] { 1, 1, 100 };
        int[] intArray88 = new int[] { (byte) -1 };
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray86, intArray88);
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray82, intArray86);
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray19, intArray82);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray19);
        java.lang.Class<?> wildcardClass93 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
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
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[-1]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 72 + "'", int90 == 72);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 72 + "'", int91 == 72);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 101 + "'", int92 == 101);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08092");
        int[] intArray3 = new int[] { 1, 1, 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        int int6 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray5);
        int[] intArray9 = new int[] { 'a', 10 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray9);
        int[] intArray14 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray18 = new int[] { 1, 1, 100 };
        int[] intArray20 = new int[] { (byte) -1 };
        int int21 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray18, intArray20);
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray18);
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
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray50);
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray18, intArray28);
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray9, intArray18);
        int[] intArray56 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray18, intArray56);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 72 + "'", int22 == 72);
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08093");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(120.09017554298981d, 2446.974580808893d, 0.0d, 730.0568549278582d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1837.0079014240243d + "'", double4 == 1837.0079014240243d);
    }

    @Test
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08094");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 72.09748128251067d, 383.03856616313067d, 381.95109733675724d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 692.8921822173772d + "'", double4 == 692.8921822173772d);
    }

    @Test
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08095");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 1, 1, 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        int int7 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray6);
        int[] intArray13 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int14 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray13);
        int[] intArray18 = new int[] { 1, 1, 100 };
        int[] intArray20 = new int[] { (byte) -1 };
        int int21 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray18, intArray20);
        int[] intArray24 = new int[] { 'a', 10 };
        int int25 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray20, intArray24);
        int[] intArray29 = new int[] { 1, 1, 100 };
        int[] intArray31 = new int[] { (byte) -1 };
        int int32 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray29, intArray31);
        int[] intArray36 = new int[] { 1, 1, 100 };
        int[] intArray38 = new int[] { (byte) -1 };
        int int39 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray38);
        int[] intArray42 = new int[] { 'a', 10 };
        int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray42);
        int[] intArray47 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray47);
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray31, intArray38);
        int[] intArray53 = new int[] { 1, 1, 100 };
        int[] intArray55 = new int[] { (byte) -1 };
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray55);
        int[] intArray59 = new int[] { 'a', 10 };
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray55, intArray59);
        int[] intArray64 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray55, intArray64);
        int[] intArray69 = new int[] { (byte) -1, '#', (-1) };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray55, intArray69);
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray55);
        int[] intArray75 = new int[] { 1, 1, 100 };
        int[] intArray77 = new int[] { (byte) -1 };
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray75, intArray77);
        int[] intArray81 = new int[] { 'a', 10 };
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray77, intArray81);
        int[] intArray86 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray77, intArray86);
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray77);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray77);
        int int90 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray13, intArray24);
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray24);
        int[] intArray92 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10]");
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
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
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
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[-1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[-1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08096");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1353.5313151960477d, 704.8977144889124d, 1013.2681792786382d, 204.83607191297912d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 840.3247784933427d + "'", double4 == 840.3247784933427d);
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08097");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 952.4965584854033d, 555.8500408038165d, 1986.6053402063276d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1589.9588225247408d + "'", double4 == 1589.9588225247408d);
    }

    @Test
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08098");
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
        int[] intArray43 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray43);
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray43);
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
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray51);
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray43);
        int[] intArray82 = new int[] { 1, 1, 100 };
        int[] intArray84 = new int[] { (byte) -1 };
        int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray82, intArray84);
        int[] intArray91 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray91);
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray91);
        int[] intArray94 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray43, intArray94);
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
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[10, 100, 32, -1, 100]");
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
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[-1]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08099");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(253.75693821022156d, 1071.1929184505884d, 0.0d, 743.8342550840093d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 581.1156015768006d + "'", double4 == 581.1156015768006d);
    }

    @Test
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08100");
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
        int[] intArray30 = new int[] { 1, 1, 100 };
        int[] intArray32 = new int[] { (byte) -1 };
        int int33 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray30, intArray32);
        int int34 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray23, intArray32);
        int[] intArray38 = new int[] { 1, 1, 100 };
        int[] intArray40 = new int[] { (byte) -1 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray38, intArray40);
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray32, intArray38);
        int[] intArray46 = new int[] { 1, 1, 100 };
        int[] intArray48 = new int[] { (byte) -1 };
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray48);
        int[] intArray52 = new int[] { 'a', 10 };
        int int53 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray52);
        int[] intArray57 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int58 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray57);
        int[] intArray62 = new int[] { (byte) -1, '#', (-1) };
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray48, intArray62);
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
        int[] intArray91 = new int[] { 1, 1, 100 };
        int[] intArray93 = new int[] { (byte) -1 };
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray91, intArray93);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray91);
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray91);
        int int97 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray32, intArray91);
        int int98 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray32);
        java.lang.Class<?> wildcardClass99 = intArray5.getClass();
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
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
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
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[-1, 35, -1]");
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
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[-1]");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 137 + "'", int96 == 137);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08101");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1121.6440574775736d, 0.0d, (double) (short) 10, 454.12565181325886d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1296.6623818195048d + "'", double4 == 1296.6623818195048d);
    }

    @Test
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08102");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(461.64162256804593d, 2645.0825816388333d, 531.456436414794d, 1697.2068556798629d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1017.6905398057185d + "'", double4 == 1017.6905398057185d);
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08103");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1626.811134785038d, 2542.2569925311673d, 528.2494549877163d, 855.8783938449538d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2784.940278483535d + "'", double4 == 2784.940278483535d);
    }

    @Test
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08104");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(579.8474205792834d, 995.1855896142233d, 299.99895788797414d, 1331.809401837636d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 616.4722749147219d + "'", double4 == 616.4722749147219d);
    }

    @Test
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08105");
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
        int[] intArray92 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray66, intArray92);
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
    }

    @Test
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08106");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2963.7812627724106d, 199.9966375835254d, 3011.779291552798d, 186.9180422268371d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2777.27801208045d + "'", double4 == 2777.27801208045d);
    }

    @Test
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08107");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2702.4820989532677d, 546.0643392889106d, 3121.2384170008627d, 1034.27708889396d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1719.9606999846694d + "'", double4 == 1719.9606999846694d);
    }

    @Test
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08108");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(325.5506232284013d, 272.6868131092915d, 1445.1084098135627d, 468.42069516739264d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1315.2916686432627d + "'", double4 == 1315.2916686432627d);
    }

    @Test
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08109");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(348.8122642567162d, 1635.4100237188457d, 223.31249474929078d, 564.2705912764261d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1196.639201949845d + "'", double4 == 1196.639201949845d);
    }

    @Test
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08110");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1331.4045796481614d, 349.57519522850913d, 418.14210302332083d, 1082.4838795872572d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 946.5779767825512d + "'", double4 == 946.5779767825512d);
    }

    @Test
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08111");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1234.2601729389798d, 1252.2573738538003d, 2524.6120648378205d, 1674.5290943546784d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1712.6236123997187d + "'", double4 == 1712.6236123997187d);
    }

    @Test
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08112");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 490.7494344988548d, 934.6872967421768d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1425.4367312410316d + "'", double4 == 1425.4367312410316d);
    }

    @Test
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08113");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(372.9132654675304d, 806.8449379314189d, 2781.415712343024d, 1697.2899362799615d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3298.947445224036d + "'", double4 == 3298.947445224036d);
    }

    @Test
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08114");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(245.15320761350827d, 167.58795437292852d, 911.4620494470176d, 846.4686300214333d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1345.1895174820143d + "'", double4 == 1345.1895174820143d);
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08115");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3007.5267939633395d, 139.7258162177311d, 1778.5870698779736d, 3166.988720473382d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1239.2420875040152d + "'", double4 == 1239.2420875040152d);
    }

    @Test
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08116");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 768.2951175647257d, 2078.842028800691d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2078.842028800691d + "'", double4 == 2078.842028800691d);
    }

    @Test
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08117");
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
        java.lang.Class<?> wildcardClass97 = doubleArray21.getClass();
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
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08118");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1493.8850460277881d, 1138.0023060837207d, 182.75554978600516d, 871.2181639675185d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1451.4732522268157d + "'", double4 == 1451.4732522268157d);
    }

    @Test
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08119");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(563.0454989197568d, 1484.6134823750838d, 0.0d, 817.604629462954d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1230.0543518318866d + "'", double4 == 1230.0543518318866d);
    }

    @Test
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08120");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2556.052118094403d, 293.3881188378761d, 697.906298565561d, 590.7679441815164d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2704.6344985718433d + "'", double4 == 2704.6344985718433d);
    }

    @Test
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08121");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2636.152833222345d, 852.4982074660716d, 2748.697165542276d, 332.8889793328518d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2306.0118402495727d + "'", double4 == 2306.0118402495727d);
    }

    @Test
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08122");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3318.4993704250633d, 1764.1220424573223d, 533.3857283874163d, 2473.3265223462904d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2910.528326987008d + "'", double4 == 2910.528326987008d);
    }

    @Test
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08123");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2044.7962219626638d, 11.193079426714434d, 1493.8850460277881d, 91.17760003365332d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2029.810051142164d + "'", double4 == 2029.810051142164d);
    }

    @Test
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08124");
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
        // The following exception was thrown during execution in test generation
        try {
            double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray34, 72);
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
    }

    @Test
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08125");
        double[] doubleArray1 = new double[] { '4' };
        double[] doubleArray6 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray7 = new double[] {};
        double double9 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray6, doubleArray7, 0);
        double[] doubleArray14 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray15 = new double[] {};
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray15, 0);
        double[] doubleArray22 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double double25 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray23, 0);
        double double27 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray14, doubleArray23, 1);
        double double29 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray7, doubleArray23, (int) (short) 10);
        double[] doubleArray34 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray35 = new double[] {};
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray34, doubleArray35, 0);
        double[] doubleArray42 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray43 = new double[] {};
        double double45 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray43, 0);
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray34, doubleArray43, 1);
        double double49 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray34, (int) '#');
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray1, doubleArray34, (int) (short) 10);
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
        double double89 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray56, doubleArray75, (int) (short) -1);
        double double91 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray1, doubleArray56, (int) 'a');
        double[] doubleArray92 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double94 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray56, doubleArray92, 137);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"p2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[52.0]");
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
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
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
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-1.0d) + "'", double89 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + (-1.0d) + "'", double91 == (-1.0d));
    }

    @Test
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08126");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1044.1164386029313d, 722.8002263242752d, 3494.9507443505227d, 2037.2610224755904d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3765.2951018989065d + "'", double4 == 3765.2951018989065d);
    }

    @Test
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08127");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1605.6695960650438d, 638.3992424182584d, 941.1476765326927d, 1485.0085145417966d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 675.3876502671043d + "'", double4 == 675.3876502671043d);
    }

    @Test
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08128");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(582.9950023482578d, 1056.2430224255363d, 924.308574861357d, 2123.350569823472d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1577.7167771921372d + "'", double4 == 1577.7167771921372d);
    }

    @Test
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08129");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 4286.591150191658d, 1144.4853157912107d, 630.521265834824d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4800.555200148045d + "'", double4 == 4800.555200148045d);
    }

    @Test
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08130");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(531.3759037767397d, 4457.43820845232d, 1315.1216138303466d, 1609.4585955754324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3631.725322930495d + "'", double4 == 3631.725322930495d);
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08131");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1485.433309273223d, 513.8338591778103d, 1017.7487734401778d, 858.8263355548762d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 781.8984106454211d + "'", double4 == 781.8984106454211d);
    }

    @Test
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08132");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1472.5331850067023d, 964.1458647014654d, 1634.984457121407d, 852.8844890532351d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 273.71264776293503d + "'", double4 == 273.71264776293503d);
    }

    @Test
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08133");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(709.9839372762594d, 244.78806928058148d, 4589.879710412303d, 22.852491343023306d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3940.271670124947d + "'", double4 == 3940.271670124947d);
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08134");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(416.2672975563163d, 298.84861683750034d, 98.0d, 789.1575818830274d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 808.5762626018434d + "'", double4 == 808.5762626018434d);
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08135");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2212.4387145239366d, 867.8695677646739d, 326.1374322058475d, 209.09663124837564d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2751.638063099457d + "'", double4 == 2751.638063099457d);
    }

    @Test
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08136");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1361.3723511334356d, 989.4943589404776d, 202.19892660646443d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2148.6677834674488d + "'", double4 == 2148.6677834674488d);
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08137");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(553.0556919454142d, 0.0d, 296.6349750306253d, 1371.8996740341013d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1628.3203909488902d + "'", double4 == 1628.3203909488902d);
    }

    @Test
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08138");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(266.09479742842706d, 678.9147893657296d, 2447.7290027244976d, 392.5814609524481d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2185.297847380822d + "'", double4 == 2185.297847380822d);
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08139");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(160.6408171889707d, 1308.3276272455305d, 0.0d, 2227.5550258835465d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1079.8682158269867d + "'", double4 == 1079.8682158269867d);
    }

    @Test
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08140");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1708.5085390970207d, (double) (short) 100, 722.6232885111716d, 624.5779542195635d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1465.2219081611868d + "'", double4 == 1465.2219081611868d);
    }

    @Test
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08141");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(277.1877858489132d, 668.1928114195907d, 2208.8912135328146d, 200.43152753590826d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2399.464711567584d + "'", double4 == 2399.464711567584d);
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08142");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(5145.520067039724d, 102.40020118002643d, 792.5519397365484d, 439.22202415293077d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4689.78995027608d + "'", double4 == 4689.78995027608d);
    }

    @Test
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08143");
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
        double[] doubleArray58 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray59 = new double[] {};
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray59, 0);
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray59, 1);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray50, (int) ' ');
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray50, (int) (short) 10);
        double[] doubleArray72 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray73 = new double[] {};
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray72, doubleArray73, 0);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray73, 26);
        java.lang.Class<?> wildcardClass78 = doubleArray73.getClass();
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
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08144");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(442.3555344923879d, 2616.353146435426d, 1345.5447390578754d, 675.735493822986d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 932.8541926050337d + "'", double4 == 932.8541926050337d);
    }

    @Test
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08145");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1074.3386094041782d, 511.69956635914673d, 622.7592060348951d, 542.6335399780827d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 482.5133769882191d + "'", double4 == 482.5133769882191d);
    }

    @Test
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08146");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(335.7483604141366d, 1319.885752410512d, 644.231776880011d, 2206.808205666772d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1896.319319827564d + "'", double4 == 1896.319319827564d);
    }

    @Test
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08147");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(275.8473488733406d, 248.3998793528227d, 1219.6414556396414d, 495.98534344978606d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1191.3795708632642d + "'", double4 == 1191.3795708632642d);
    }

    @Test
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08148");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(284.03695697436626d, 185.09060898709973d, 23.120346888421807d, 3372.7378330028796d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3448.5638341017243d + "'", double4 == 3448.5638341017243d);
    }

    @Test
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08149");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(275.49796277521034d, 0.0d, 0.0d, 2647.4474325505535d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2387.8951850240037d + "'", double4 == 2387.8951850240037d);
    }

    @Test
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08150");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(467.94163262749527d, 88.87071783022412d, 621.5258907893251d, 1211.5004068235132d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 759.254749763875d + "'", double4 == 759.254749763875d);
    }

    @Test
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08151");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1144.4853157912107d, 2342.044242288626d, 193.6820285826737d, 3143.3273252643467d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1752.086370184258d + "'", double4 == 1752.086370184258d);
    }

    @Test
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08152");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(697.6691737578252d, 1561.947855251425d, 1606.2044434854495d, 2292.421543981604d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1835.3940881111628d + "'", double4 == 1835.3940881111628d);
    }

    @Test
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08153");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(736.7759336248794d, 2703.5681390212585d, 609.373237025105d, 2548.771376073314d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 282.1994595477188d + "'", double4 == 282.1994595477188d);
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08154");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1270.7574896807998d, 502.35991799348886d, 362.7416955949157d, 781.6772405233141d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1031.3545328476368d + "'", double4 == 1031.3545328476368d);
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08155");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2154.6557680866545d, 270.6964756353487d, 2762.794125559439d, 761.0206976815485d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1520.5429856773997d + "'", double4 == 1520.5429856773997d);
    }

    @Test
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08156");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3235.435494709517d, 582.1574183122069d, 1018.7301548803165d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3921.9670325046727d + "'", double4 == 3921.9670325046727d);
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08157");
        double[] doubleArray3 = new double[] { 1267.400893421706d, 100.4987562112089d, 800.5533158928175d };
        double[] doubleArray8 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray9 = new double[] {};
        double double11 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray8, doubleArray9, 0);
        double[] doubleArray16 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray17 = new double[] {};
        double double19 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray16, doubleArray17, 0);
        double double21 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray8, doubleArray17, (int) (short) 100);
        double[] doubleArray26 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray27 = new double[] {};
        double double29 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray26, doubleArray27, 0);
        double double31 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray17, doubleArray26, (int) (short) 100);
        double[] doubleArray36 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray37 = new double[] {};
        double double39 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray36, doubleArray37, 0);
        double[] doubleArray45 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray37, doubleArray45, (int) (byte) -1);
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
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray45, doubleArray70, (int) (short) 100);
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray26, doubleArray45, (int) (short) 1);
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray3, doubleArray45, (int) (short) 100);
        java.lang.Class<?> wildcardClass82 = doubleArray45.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1267.400893421706, 100.4987562112089, 800.5533158928175]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
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
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08158");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2362.5995916725246d, 266.0d, 475.4702622333558d, 1459.082093944009d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2092.2717258356106d + "'", double4 == 2092.2717258356106d);
    }

    @Test
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08159");
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
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray20, intArray50);
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray20);
        java.lang.Class<?> wildcardClass56 = intArray3.getClass();
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08160");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(449.8093480445713d, 2386.244584635255d, 874.2773969027894d, 269.3598320793501d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2541.352801414123d + "'", double4 == 2541.352801414123d);
    }

    @Test
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08161");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1407.3407591082284d, 396.8323688689596d, 258.6060791269869d, 1450.4812376309014d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2202.3835487431834d + "'", double4 == 2202.3835487431834d);
    }

    @Test
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08162");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3495.9851218538834d, 1124.7473473308323d, 409.4502386714465d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4663.540453059856d + "'", double4 == 4663.540453059856d);
    }

    @Test
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08163");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(838.270500800099d, 815.1974480831736d, 281.88511874515d, 454.00499987500626d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 676.1839014392784d + "'", double4 == 676.1839014392784d);
    }

    @Test
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08164");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 303.938625096827d, 398.293151952033d, 814.9296334970577d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 907.0544319077737d + "'", double4 == 907.0544319077737d);
    }

    @Test
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08165");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1696.2964783565853d, 576.8366664256379d, 784.9970752297284d, 167.76644024403632d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1320.3696293084586d + "'", double4 == 1320.3696293084586d);
    }

    @Test
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08166");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1649.5050308100826d, 667.9934772906911d, 1441.169357411691d, 469.82663509603424d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 406.50251559304854d + "'", double4 == 406.50251559304854d);
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08167");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2041.370728626327d, 2871.605586910417d, 2636.152833222345d, 1666.3855043568901d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1800.002187149545d + "'", double4 == 1800.002187149545d);
    }

    @Test
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08168");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2315.992307992693d, 2598.4422681814644d, 814.2659300497917d, 640.0893013294542d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3460.079344794912d + "'", double4 == 3460.079344794912d);
    }

    @Test
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08169");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 2102.830054721476d, 1633.5358564520893d, 532.7588288478117d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1718.2174961366077d + "'", double4 == 1718.2174961366077d);
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08170");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1693.9328890565873d, 806.8449379314189d, 913.8595240793304d, 1392.0681707335123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 836.4429226882191d + "'", double4 == 836.4429226882191d);
    }

    @Test
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08171");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2067.429468691161d, 115.82660080517897d, 2542.0576644491184d, 3535.79630516587d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1543.1698191278876d + "'", double4 == 1543.1698191278876d);
    }

    @Test
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08172");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(803.8248080837866d, 1120.1155305273528d, 37.36418845665748d, 2045.0741961156473d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1458.8221018097686d + "'", double4 == 1458.8221018097686d);
    }

    @Test
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08173");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(670.4778620079396d, 2645.0825816388333d, 271.1972782796054d, 532.3985198594888d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 422.4818212309119d + "'", double4 == 422.4818212309119d);
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08174");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3815.184164453953d, 936.0649003385682d, 1255.6140506064362d, 2029.810051142164d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3120.730666396132d + "'", double4 == 3120.730666396132d);
    }

    @Test
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08175");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(456.673285986374d, 889.4250209799401d, 709.9839372762594d, 2636.4735994589255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2000.3592297688706d + "'", double4 == 2000.3592297688706d);
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08176");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2213.6714436564234d, 524.6435521795014d, 2527.724339630948d, 124.03725353519542d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 714.6591946188307d + "'", double4 == 714.6591946188307d);
    }

    @Test
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08177");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1617.9215357334556d, 632.9603820390164d, 3419.624114901072d, 2472.9981664614866d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3641.7403635900864d + "'", double4 == 3641.7403635900864d);
    }

    @Test
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08178");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3583.5966182809866d, 632.2046947919624d, 633.8945645939809d, 924.734217421653d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3971.182628919098d + "'", double4 == 3971.182628919098d);
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08179");
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
        int int58 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray25, intArray47);
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray9, intArray25);
        java.lang.Class<?> wildcardClass60 = intArray9.getClass();
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08180");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(792.295117462914d, 448.9204830274926d, 449.8093480445713d, 1011.2943098145563d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 406.5183249310489d + "'", double4 == 406.5183249310489d);
    }

    @Test
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08181");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2177.4089821789926d, 1715.9504518257918d, 1891.1585887149004d, 560.0246542664447d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1442.1761910234393d + "'", double4 == 1442.1761910234393d);
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08182");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(614.8081602340345d, 731.0416687290287d, 1953.9703565202085d, 251.12978742411298d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1819.07407759109d + "'", double4 == 1819.07407759109d);
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08183");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(586.9333963249293d, 206.8413115591487d, 4910.532964260617d, 2312.181998186525d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4655.1042912140065d + "'", double4 == 4655.1042912140065d);
    }

    @Test
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08184");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2067.4470081851714d, 297.8808495775337d, 877.9120720243004d, 500.4832062519777d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1967.3253215765246d + "'", double4 == 1967.3253215765246d);
    }

    @Test
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08185");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3532.144422700154d, 266.03145706509156d, 526.1603102497103d, 704.8977144889124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4126.6529334796d + "'", double4 == 4126.6529334796d);
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08186");
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
        java.lang.Class<?> wildcardClass56 = intArray5.getClass();
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
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08187");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(417.3513100069032d, 872.8412118524546d, 877.5814493297255d, 2704.6344985718433d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2333.125835833315d + "'", double4 == 2333.125835833315d);
    }

    @Test
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08188");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(465.26773014275807d, 1285.3436588924824d, 798.048088330784d, 354.643471884476d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1263.4805451960324d + "'", double4 == 1263.4805451960324d);
    }

    @Test
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08189");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(584.992216057528d, 2293.073839008447d, 0.0d, 1434.4355742326059d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1031.3922200577485d + "'", double4 == 1031.3922200577485d);
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08190");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3958.859477478818d, 1046.97858332577d, 709.3003293844439d, 1506.0801443208015d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4071.3340705634705d + "'", double4 == 4071.3340705634705d);
    }

    @Test
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08191");
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
        int[] intArray67 = new int[] { 'a', 10 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray63, intArray67);
        int int69 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray67);
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray25, intArray67);
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray17, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray17);
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
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08192");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3264.137257453245d, 711.0139590919035d, 357.47422719117975d, 869.2638972501098d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3064.9129684202717d + "'", double4 == 3064.9129684202717d);
    }

    @Test
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08193");
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
        java.lang.Class<?> wildcardClass86 = doubleArray69.getClass();
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
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08194");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2026.3794624230661d, 1588.5624567367206d, 1042.9665700189937d, 499.025369914194d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2072.9499792265988d + "'", double4 == 2072.9499792265988d);
    }

    @Test
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08195");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(574.5536640965004d, 167.29384278124112d, 2001.6207512712501d, 1545.3091620356831d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2805.082406429192d + "'", double4 == 2805.082406429192d);
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08196");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(727.4426034836936d, 944.756764334282d, 1538.7497989088488d, 988.8896848456425d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 852.3930676051469d + "'", double4 == 852.3930676051469d);
    }

    @Test
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08197");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1587.6176728432806d, 2199.033873292094d, 396.492155809011d, 1044.1164386029313d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2346.0429517234325d + "'", double4 == 2346.0429517234325d);
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08198");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(614.9700265474353d, 540.8496103563548d, 11.193079426714434d, 1154.3996351784397d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1217.3269719428058d + "'", double4 == 1217.3269719428058d);
    }

    @Test
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08199");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1008.2500310819237d, 3142.8561197592185d, 555.5147953355564d, 855.8783938449538d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2739.712961660632d + "'", double4 == 2739.712961660632d);
    }

    @Test
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08200");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(757.6551509679047d, 2390.39501278206d, 0.0d, 2000.4631476266463d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1455.5456174050723d + "'", double4 == 1455.5456174050723d);
    }

    @Test
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08201");
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
        double[] doubleArray58 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray58, 136);
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
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08202");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1046.97858332577d, 0.0d, 631.4274613930837d, 2278.168553768032d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2693.719675700718d + "'", double4 == 2693.719675700718d);
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08203");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1082.04669754179d, 590.3802649016793d, 631.4274613930837d, 72.09748128251067d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 968.902019767875d + "'", double4 == 968.902019767875d);
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08204");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(179.00448264521654d, 0.0d, 2170.47752829324d, 184.15598769385065d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2175.629033341874d + "'", double4 == 2175.629033341874d);
    }

    @Test
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08205");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(483.6996920353407d, 490.7322591768047d, 395.0094394147251d, 1613.5602924740228d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1133.3361978396206d + "'", double4 == 1133.3361978396206d);
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08206");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1536.4400323820114d, 2553.0694971770213d, 1170.9018505716544d, 1225.4763630447624d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1693.1313159426159d + "'", double4 == 1693.1313159426159d);
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08207");
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
        int[] intArray56 = new int[] { 'a', 10 };
        int int57 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray56);
        int[] intArray61 = new int[] { 1, 1, 100 };
        int[] intArray63 = new int[] { (byte) -1 };
        int int64 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray61, intArray63);
        int[] intArray68 = new int[] { 1, 1, 100 };
        int[] intArray70 = new int[] { (byte) -1 };
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray68, intArray70);
        int[] intArray74 = new int[] { 'a', 10 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray70, intArray74);
        int int76 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray61, intArray74);
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray61);
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray52);
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray52);
        int[] intArray83 = new int[] { 1, 1, 100 };
        int[] intArray85 = new int[] { (byte) -1 };
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray83, intArray85);
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray5, intArray85);
        java.lang.Class<?> wildcardClass88 = intArray5.getClass();
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
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[97, 10]");
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
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[-1]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08208");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(843.7240123150117d, 784.8892445297196d, 1247.0963954995636d, 503.49232769329114d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 684.7693000209804d + "'", double4 == 684.7693000209804d);
    }

    @Test
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08209");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance((double) 'a', 1422.7257031240092d, 500.5657799793145d, 479.9130054702595d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 556.316194738729d + "'", double4 == 556.316194738729d);
    }

    @Test
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08210");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(4749.244548691682d, 613.5466995285793d, 1493.3640711629396d, 483.9615733572178d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5365.9478700068275d + "'", double4 == 5365.9478700068275d);
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08211");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(718.8178596048987d, 561.2648143618683d, 2824.5150470238427d, 1173.9814545455977d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2718.4138276026733d + "'", double4 == 2718.4138276026733d);
    }

    @Test
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08212");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(540.8496103563548d, 61.482131604661696d, 837.9080286695323d, 837.7108581071841d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1073.2871448156998d + "'", double4 == 1073.2871448156998d);
    }

    @Test
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08213");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(460.2476947640703d, 159.6408171889707d, 88.2375286553044d, 3117.935617381412d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3330.3049663012075d + "'", double4 == 3330.3049663012075d);
    }

    @Test
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08214");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2143.0401578270967d, 426.8068410495756d, 485.6444048742231d, 2594.4723220201163d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3825.061233923414d + "'", double4 == 3825.061233923414d);
    }

    @Test
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08215");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2249.932525395105d, 1076.409245327592d, 601.720563037279d, 669.3836487949504d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2055.237558890468d + "'", double4 == 2055.237558890468d);
    }

    @Test
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08216");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1040.2062944463478d, 2795.1815413676823d, 415.375979454456d, 1761.9620695681383d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1658.0497867914357d + "'", double4 == 1658.0497867914357d);
    }

    @Test
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08217");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(431.73003928204906d, 1478.5225712644478d, 1428.1155278730532d, 1306.4636735575757d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1168.4443862978762d + "'", double4 == 1168.4443862978762d);
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08218");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1011.2943098145563d, 743.8342550840093d, 1698.0489310175412d, 1619.4469115045783d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 917.3230056452295d + "'", double4 == 917.3230056452295d);
    }

    @Test
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08219");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1630.5222277005653d, 1163.2417342325878d, 725.1616906289017d, 2595.144315651455d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2337.263118490531d + "'", double4 == 2337.263118490531d);
    }

    @Test
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08220");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(714.9565770654988d, 649.5369668695829d, 883.2477228774341d, 460.08781329172984d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 305.4177409815338d + "'", double4 == 305.4177409815338d);
    }

    @Test
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08221");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2548.771376073314d, 667.7052720987249d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3604.507047431217d + "'", double4 == 3604.507047431217d);
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08222");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1065.1983414653037d, 682.0897894458582d, 1188.3397197262136d, 1652.1847358221971d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1093.2363246372488d + "'", double4 == 1093.2363246372488d);
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08223");
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
        int[] intArray76 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int77 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray69, intArray76);
        int int78 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray76);
        java.lang.Class<?> wildcardClass79 = intArray16.getClass();
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
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08224");
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
            double double40 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray38, (int) (byte) 10);
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
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08225");
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
        int int74 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray68);
        int[] intArray78 = new int[] { 1, 1, 100 };
        int[] intArray80 = new int[] { (byte) -1 };
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray78, intArray80);
        int[] intArray87 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int88 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray80, intArray87);
        int int89 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray46, intArray80);
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
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08226");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(901.109490665229d, 759.4458766521755d, 1543.1698191278876d, 1028.732704283299d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 911.3471560937821d + "'", double4 == 911.3471560937821d);
    }

    @Test
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08227");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1267.6191239137813d, 758.9251817337416d, 1293.1858818371782d, 2148.6677834674488d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 881.4195366634596d + "'", double4 == 881.4195366634596d);
    }

    @Test
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08228");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2202.3835487431834d, 831.8376803062826d, 838.5805349679069d, 4143.126503318541d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4675.091836787535d + "'", double4 == 4675.091836787535d);
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08229");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1436.3225815746284d, 1699.41369357641d, 1189.2434628753945d, 2440.6299281759552d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1034.2540003957383d + "'", double4 == 1034.2540003957383d);
    }

    @Test
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08230");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(168.11849816664136d, 0.0d, 1024.8280187223447d, 1179.088709169527d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2035.7982297252304d + "'", double4 == 2035.7982297252304d);
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08231");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(667.2675745509722d, 285.734443294704d, 792.0828056013817d, 1675.5899469743117d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1514.670734730017d + "'", double4 == 1514.670734730017d);
    }

    @Test
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08232");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1198.0072810727606d, 810.4677820566644d, 0.0d, 1002.602929337322d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1390.1424283534184d + "'", double4 == 1390.1424283534184d);
    }

    @Test
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08233");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1180.3578280495476d, 412.7484808105533d, 1602.853044473853d, 1448.0494747739556d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.16099970654045d + "'", double4 == 500.16099970654045d);
    }

    @Test
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08234");
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
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray69, (int) (byte) 1);
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
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08235");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1575.2733450425137d, 633.3114486657719d, 1931.9464762233035d, 911.0474342832409d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 753.9308874361723d + "'", double4 == 753.9308874361723d);
    }

    @Test
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08236");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1244.073074075367d, 651.6870125299818d, 0.0d, 497.1944702364713d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1451.049779474044d + "'", double4 == 1451.049779474044d);
    }

    @Test
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08237");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(639.7228865487252d, 378.4868806683438d, 237.65150738269148d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 780.5582598343776d + "'", double4 == 780.5582598343776d);
    }

    @Test
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08238");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(7.706157218758875d, 1581.441263965389d, 1237.7331348218322d, 401.95720447510644d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1291.6656896790587d + "'", double4 == 1291.6656896790587d);
    }

    @Test
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08239");
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
        double[] doubleArray35 = new double[] { 221.38186019448963d, 364.34654754189563d, 1789.0559517170952d, 896.632439101549d, 5328.628649866165d, 2634.3844687894953d };
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray35, 137);
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
        double[] doubleArray90 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray91 = new double[] {};
        double double93 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray90, doubleArray91, 0);
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray42, doubleArray90, 100);
        double double97 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray90, 136);
        // The following exception was thrown during execution in test generation
        try {
            double double99 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray22, 101);
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
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[221.38186019448963, 364.34654754189563, 1789.0559517170952, 896.632439101549, 5328.628649866165, 2634.3844687894953]");
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
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + Double.POSITIVE_INFINITY + "'", double83 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[]");
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + (-1.0d) + "'", double97 == (-1.0d));
    }

    @Test
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08240");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(426.6564716110722d, 461.980404764096d, 403.4830412703007d, 365.6064430735291d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 65.30018268116424d + "'", double4 == 65.30018268116424d);
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08241");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray8 = new int[] { 1, 1, 100 };
        int[] intArray10 = new int[] { (byte) -1 };
        int int11 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray8, intArray10);
        int int12 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray4, intArray8);
        int[] intArray16 = new int[] { 1, 1, 100 };
        int[] intArray18 = new int[] { (byte) -1 };
        int int19 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray16, intArray18);
        int[] intArray22 = new int[] { 'a', 10 };
        int int23 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray18, intArray22);
        int[] intArray27 = new int[] { 1, 1, 100 };
        int[] intArray29 = new int[] { (byte) -1 };
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray29);
        int[] intArray34 = new int[] { 1, 1, 100 };
        int[] intArray36 = new int[] { (byte) -1 };
        int int37 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray36);
        int[] intArray40 = new int[] { 'a', 10 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray40);
        int int42 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray27, intArray40);
        int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray18, intArray40);
        int int44 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray8, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 72 + "'", int12 == 72);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 10]");
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08242");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(145.74368975806703d, 1578.6485640769192d, 621.8669731042609d, 1217.1020423865575d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 837.6698050365555d + "'", double4 == 837.6698050365555d);
    }

    @Test
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08243");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(282.94370701765916d, 1899.572686546501d, 1065.4951610287171d, 3478.5359995125696d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3290.0147230715697d + "'", double4 == 3290.0147230715697d);
    }

    @Test
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08244");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(433.8341894155431d, 589.9455872024135d, 2196.4637884351705d, 2730.292105859858d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3902.9761176770717d + "'", double4 == 3902.9761176770717d);
    }

    @Test
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08245");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(877.0514440450277d, 980.0554403934175d, 775.270960288489d, 473.29036453633444d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 608.5455596136217d + "'", double4 == 608.5455596136217d);
    }

    @Test
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08246");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(51.402702719722015d, 799.9078566364301d, 933.2155331100303d, 780.9621260792533d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 900.7585609474851d + "'", double4 == 900.7585609474851d);
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08247");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(284.69002088953687d, 333.87755885756354d, 316.0932484033621d, 79.79641068403973d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 285.48437568734903d + "'", double4 == 285.48437568734903d);
    }

    @Test
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08248");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(688.5904808382277d, (double) 215, 1467.7645001472401d, 163.99057517747818d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 939.3174188661832d + "'", double4 == 939.3174188661832d);
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08249");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(793.9326124997559d, 1495.9264068942746d, 378.54655938727063d, 445.4371447615443d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 542.2127480560036d + "'", double4 == 542.2127480560036d);
    }

    @Test
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08250");
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
        double[] doubleArray46 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray47 = new double[] {};
        double double49 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray46, doubleArray47, 0);
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray46, (int) (byte) 0);
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray46, (int) (short) 100);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray46, 69);
        java.lang.Class<?> wildcardClass56 = doubleArray46.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + Double.POSITIVE_INFINITY + "'", double51 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08251");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(464.55529344788846d, 1362.3830907872932d, 365.22539616275867d, 434.59128451792674d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 103.75100156542712d + "'", double4 == 103.75100156542712d);
    }

    @Test
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08252");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2675.513953551034d, 600.5503288932999d, 618.7629008472783d, 395.0094394147251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2262.291942182331d + "'", double4 == 2262.291942182331d);
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08253");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(575.7760047012375d, 2132.458031827953d, 709.5343721658978d, 1055.9880049600702d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1210.2283943325433d + "'", double4 == 1210.2283943325433d);
    }

    @Test
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08254");
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
        double[] doubleArray46 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray47 = new double[] {};
        double double49 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray46, doubleArray47, 0);
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray39, doubleArray47, (int) (byte) 1);
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray20, doubleArray39, (int) (short) -1);
        double[] doubleArray58 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray59 = new double[] {};
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray59, 0);
        double[] doubleArray66 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray67 = new double[] {};
        double double69 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray66, doubleArray67, 0);
        double[] doubleArray74 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray75 = new double[] {};
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray74, doubleArray75, 0);
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray66, doubleArray75, 1);
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray59, doubleArray66, (int) ' ');
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray39, doubleArray66, (int) (short) 10);
        double double85 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray66, (int) (byte) 0);
        java.lang.Class<?> wildcardClass86 = doubleArray66.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08255");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(968.3647166170351d, 1955.6700749521685d, 934.56337512867d, 1689.921502333886d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 722.3480640940672d + "'", double4 == 722.3480640940672d);
    }

    @Test
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08256");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(662.47774618419d, 1484.6134823750838d, 997.8364812996736d, 1286.838136978442d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 533.1340805121254d + "'", double4 == 533.1340805121254d);
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08257");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(911.7728162024935d, 1382.320804600945d, 287.0d, 2767.8890554335558d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1958.4454461135385d + "'", double4 == 1958.4454461135385d);
    }

    @Test
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08258");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1047.2170983367917d, 3084.0340604846488d, 88.2375286553044d, 2177.4089821789926d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1865.6046479871434d + "'", double4 == 1865.6046479871434d);
    }

    @Test
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08259");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1587.5845320356902d, 593.8639215535189d, 574.2264568926857d, 286.88848007544675d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1648.8495407533399d + "'", double4 == 1648.8495407533399d);
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08260");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1764.3965242897048d, 605.3095499030369d, 150.40770846134703d, 1365.8442637174244d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1662.469188293816d + "'", double4 == 1662.469188293816d);
    }

    @Test
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08261");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2541.352801414123d, 1988.3507842223764d, 1150.6684461804387d, 855.8409738812244d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2523.194165574836d + "'", double4 == 2523.194165574836d);
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08262");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3448.5638341017243d, 1206.1433496654447d, 793.3634741754175d, 966.5648019122918d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2894.7789076794597d + "'", double4 == 2894.7789076794597d);
    }

    @Test
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08263");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1811.6274415144944d, 1109.648630442865d, 296.3262775730056d, 183.58184974459016d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2224.111073288348d + "'", double4 == 2224.111073288348d);
    }

    @Test
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08264");
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
        double double46 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray42, (int) (short) 100);
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
        double double74 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray69, (int) (byte) 0);
        double double76 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray33, doubleArray69, (int) (short) 1);
        double double78 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray69, 72);
        // The following exception was thrown during execution in test generation
        try {
            double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray69, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + Double.POSITIVE_INFINITY + "'", double74 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1.0d) + "'", double78 == (-1.0d));
    }

    @Test
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08265");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(432.74512740028047d, 738.4224216616659d, 1605.6695960650438d, 449.8093480445713d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1461.5375422818581d + "'", double4 == 1461.5375422818581d);
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08266");
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
        double[] doubleArray76 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray77 = new double[] {};
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray76, doubleArray77, 0);
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray68, doubleArray77, 1);
        double double83 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray61, doubleArray77, (int) (short) 10);
        double[] doubleArray90 = new double[] { 221.38186019448963d, 364.34654754189563d, 1789.0559517170952d, 896.632439101549d, 5328.628649866165d, 2634.3844687894953d };
        double double92 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray77, doubleArray90, 137);
        double double94 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray90, (int) (short) 1);
        java.lang.Class<?> wildcardClass95 = doubleArray5.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[221.38186019448963, 364.34654754189563, 1789.0559517170952, 896.632439101549, 5328.628649866165, 2634.3844687894953]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-1.0d) + "'", double92 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + (-1.0d) + "'", double94 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08267");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1020.8521420982823d, 2057.692927264412d, 650.8900422812455d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2427.6550270814487d + "'", double4 == 2427.6550270814487d);
    }

    @Test
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08268");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(863.5160259266543d, 2065.7056734216267d, 2016.1358892422704d, 309.189347980773d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2909.13618875647d + "'", double4 == 2909.13618875647d);
    }

    @Test
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08269");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(951.9825489532838d, 1404.1067534121478d, 1069.8300750248936d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1521.9542794837575d + "'", double4 == 1521.9542794837575d);
    }

    @Test
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08270");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(760.7465171934783d, 1728.6060689590258d, 1086.2697910773807d, 945.0166996675451d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 374.06002458044077d + "'", double4 == 374.06002458044077d);
    }

    @Test
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08271");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(419.0413653100427d, 2931.81100696862d, 1978.061686919199d, 339.74650298461927d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4151.084825593157d + "'", double4 == 4151.084825593157d);
    }

    @Test
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08272");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1886.8301301214929d, 2781.3051071353293d, 0.0d, 889.4413484722809d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3778.6938887845413d + "'", double4 == 3778.6938887845413d);
    }

    @Test
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08273");
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
        java.lang.Class<?> wildcardClass90 = intArray5.getClass();
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
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08274");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(494.4154703863096d, 1442.0733329544876d, 2035.3472909522595d, 979.2071259338247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2003.7980275866128d + "'", double4 == 2003.7980275866128d);
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08275");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(784.9484205212476d, 716.9743457110927d, 374.4096930671966d, 224.75210127375607d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 902.7609718913877d + "'", double4 == 902.7609718913877d);
    }

    @Test
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08276");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(234.50390780179015d, 434.3267617642323d, 1065.5430455474684d, 252.50093186255893d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1012.8649676473517d + "'", double4 == 1012.8649676473517d);
    }

    @Test
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08277");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1451.4732522268157d, 444.3546768000051d, 1439.5642048562368d, 209.37889920555605d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 246.884824965028d + "'", double4 == 246.884824965028d);
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08278");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(215.4582954651218d, 981.552780344625d, 494.4154703863096d, 349.2734453742829d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 309.39230724958475d + "'", double4 == 309.39230724958475d);
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08279");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1698.0489310175412d, 1899.572686546501d, 1004.528663934579d, 601.2924739091515d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1991.8004797203116d + "'", double4 == 1991.8004797203116d);
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08280");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(837.1104194170482d, 629.6281185279596d, 3592.397480517376d, 1624.6202329304876d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2865.620089168635d + "'", double4 == 2865.620089168635d);
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08281");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 1571.5467800520205d, 1579.576090222139d, 607.2508295319844d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1692.2807671213257d + "'", double4 == 1692.2807671213257d);
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08282");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2016.875379137935d, 582.1853565419128d, 1225.8057226466149d, 770.9184926930953d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1475.8725433792088d + "'", double4 == 1475.8725433792088d);
    }

    @Test
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08283");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(564.0509668837087d, 1628.1810072730027d, (double) 100.0f, 711.113777837032d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1381.1181963196796d + "'", double4 == 1381.1181963196796d);
    }

    @Test
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08284");
        double[] doubleArray3 = new double[] { 1267.400893421706d, 100.4987562112089d, 800.5533158928175d };
        double[] doubleArray8 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray9 = new double[] {};
        double double11 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray8, doubleArray9, 0);
        double[] doubleArray16 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray17 = new double[] {};
        double double19 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray16, doubleArray17, 0);
        double double21 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray8, doubleArray17, (int) (short) 100);
        double[] doubleArray26 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray27 = new double[] {};
        double double29 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray26, doubleArray27, 0);
        double double31 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray17, doubleArray26, (int) (short) 100);
        double[] doubleArray36 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray37 = new double[] {};
        double double39 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray36, doubleArray37, 0);
        double[] doubleArray45 = new double[] { 232.4213562373095d, (short) 0, 1.0f, 75.85073476263909d, (-1L) };
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray37, doubleArray45, (int) (byte) -1);
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
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray45, doubleArray70, (int) (short) 100);
        double double79 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray26, doubleArray45, (int) (short) 1);
        double double81 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray3, doubleArray45, (int) (short) 100);
        java.lang.Class<?> wildcardClass82 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1267.400893421706, 100.4987562112089, 800.5533158928175]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[232.4213562373095, 0.0, 1.0, 75.85073476263909, -1.0]");
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
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08285");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(599.6630787121707d, 1572.2845848438903d, 268.5218799278748d, 127.97315542808013d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 576.3209845737458d + "'", double4 == 576.3209845737458d);
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08286");
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
            double double90 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray88, (int) (short) 100);
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
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08287");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(924.243760289229d, 1194.5686548890772d, 811.908097157059d, 1741.486649791941d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 659.2536580350339d + "'", double4 == 659.2536580350339d);
    }

    @Test
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08288");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(430.6095975138101d, 215.05196722620533d, 1110.3542554132914d, 2865.620089168635d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3330.312779841911d + "'", double4 == 3330.312779841911d);
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08289");
        int[] intArray3 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray7 = new int[] { 1, 1, 100 };
        int[] intArray9 = new int[] { (byte) -1 };
        int int10 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray7, intArray9);
        int int11 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray3, intArray7);
        int[] intArray15 = new int[] { 1, 1, 100 };
        int[] intArray17 = new int[] { (byte) -1 };
        int int18 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray15, intArray17);
        int[] intArray22 = new int[] { 1, 1, 100 };
        int[] intArray24 = new int[] { (byte) -1 };
        int int25 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray22, intArray24);
        int[] intArray28 = new int[] { 'a', 10 };
        int int29 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray24, intArray28);
        int int30 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray15, intArray28);
        int[] intArray34 = new int[] { 1, 1, 100 };
        int[] intArray36 = new int[] { (byte) -1 };
        int int37 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray34, intArray36);
        int[] intArray40 = new int[] { 'a', 10 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray40);
        int[] intArray45 = new int[] { 1, 1, 100 };
        int[] intArray47 = new int[] { (byte) -1 };
        int int48 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray47);
        int[] intArray52 = new int[] { 1, 1, 100 };
        int[] intArray54 = new int[] { (byte) -1 };
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray54);
        int[] intArray58 = new int[] { 'a', 10 };
        int int59 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray54, intArray58);
        int int60 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray45, intArray58);
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray45);
        int[] intArray65 = new int[] { 1, 1, 100 };
        int[] intArray67 = new int[] { (byte) -1 };
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray67);
        int[] intArray72 = new int[] { 1, 1, 100 };
        int[] intArray74 = new int[] { (byte) -1 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray72, intArray74);
        int[] intArray78 = new int[] { 'a', 10 };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray78);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray65, intArray78);
        int int81 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray78);
        int int82 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray15, intArray36);
        int[] intArray86 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray90 = new int[] { 1, 1, 100 };
        int[] intArray92 = new int[] { (byte) -1 };
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray90, intArray92);
        int int94 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray86, intArray90);
        int int95 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray15, intArray90);
        int int96 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray7, intArray15);
        java.lang.Class<?> wildcardClass97 = intArray15.getClass();
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
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 10]");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[-1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[-1]");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 72 + "'", int94 == 72);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08290");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(254.31495806857387d, 1428.177684253231d, 913.2535436628222d, 696.3812201968626d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1390.7350496506167d + "'", double4 == 1390.7350496506167d);
    }

    @Test
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08291");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(255.41977514636133d, 1914.7704322181469d, 1019.9383054881366d, 1331.809401837636d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1347.4795607222864d + "'", double4 == 1347.4795607222864d);
    }

    @Test
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08292");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(535.9469777784859d, 567.9905593254381d, 3012.4109095894482d, 646.6367003341174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2478.936429245424d + "'", double4 == 2478.936429245424d);
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08293");
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
            int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray71);
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
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08294");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(756.3850322363193d, 536.2470998730795d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1069.6899709646134d + "'", double4 == 1069.6899709646134d);
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08295");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1308.050118617758d, 632.9603820390164d, 1790.6731119766525d, 604.2826343560215d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 511.3007410418894d + "'", double4 == 511.3007410418894d);
    }

    @Test
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08296");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(455.7720019217035d, 184.15598769385065d, 1547.1675039199513d, 1262.2848394186638d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1357.058251818766d + "'", double4 == 1357.058251818766d);
    }

    @Test
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08297");
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
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray51, doubleArray59, (int) (byte) 1);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray59, 136);
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
        double double95 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray22, doubleArray78, 100);
        java.lang.Class<?> wildcardClass96 = doubleArray78.getClass();
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
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
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
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08298");
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
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray39, 100);
        java.lang.Class<?> wildcardClass78 = doubleArray5.getClass();
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
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08299");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(965.2547078895686d, 1235.2618483312194d, 2178.5182711837206d, 777.6320980383734d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1227.6851052874254d + "'", double4 == 1227.6851052874254d);
    }

    @Test
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08300");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1043.0173537839164d, 597.3891584399416d, 1786.0894626301626d, 273.71264776293503d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1069.5727603352827d + "'", double4 == 1069.5727603352827d);
    }

    @Test
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08301");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(515.3008802650451d, 576.3209845737458d, 1967.3253215765246d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1540.749809465458d + "'", double4 == 1540.749809465458d);
    }

    @Test
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08302");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2891.2808052049877d, 941.046156559536d, 455.7720019217035d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3376.55495984282d + "'", double4 == 3376.55495984282d);
    }

    @Test
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08303");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 676.4407711774177d, 450.43188969295863d, 198.49180880215567d };
        // The following exception was thrown during execution in test generation
        try {
            double double6 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[676.4407711774177, 450.43188969295863, 198.49180880215567]");
    }

    @Test
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08304");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1654.8457461226537d, 4468.174762211916d, 520.4111800001816d, 1589.9588225247408d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4012.650505809647d + "'", double4 == 4012.650505809647d);
    }

    @Test
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08305");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(31.18538151458436d, 768.8357377606628d, 449.8093480445713d, 731.0416687290287d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 456.418035561621d + "'", double4 == 456.418035561621d);
    }

    @Test
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08306");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(538.8680053645919d, 555.4700417755369d, 134.1343052388362d, 1365.8442637174244d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 920.7057618461697d + "'", double4 == 920.7057618461697d);
    }

    @Test
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08307");
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
        int[] intArray51 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray51);
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
    }

    @Test
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08308");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 642.2306558158326d, 1179.7222842655474d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1821.95294008138d + "'", double4 == 1821.95294008138d);
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08309");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(280.65128386416546d, 1024.7226070955976d, 431.05208884769894d, 849.002860991156d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 326.12055108797506d + "'", double4 == 326.12055108797506d);
    }

    @Test
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08310");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 0.0d, 1775.7883314772268d, 160.0457809614037d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1782.9859366282783d + "'", double4 == 1782.9859366282783d);
    }

    @Test
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08311");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1324.8639334077811d, 3335.4871916086254d, 462.4018036256481d, 855.04990166477d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3342.8994197259885d + "'", double4 == 3342.8994197259885d);
    }

    @Test
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08312");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(497.1944702364713d, 451.7036253361123d, 1128.8123100893647d, 1003.1058407037573d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 809.2511417282788d + "'", double4 == 809.2511417282788d);
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08313");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2144.0301465973585d, 403.80355079152525d, 1407.5881372261192d, 448.28604210226746d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1848.7549597219763d + "'", double4 == 1848.7549597219763d);
    }

    @Test
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08314");
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
        double[] doubleArray31 = new double[] { 574.5536640965004d, 292.0641734589212d, 590.3802649016793d };
        double[] doubleArray36 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray37 = new double[] {};
        double double39 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray36, doubleArray37, 0);
        double[] doubleArray44 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray45 = new double[] {};
        double double47 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray44, doubleArray45, 0);
        double double49 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray36, doubleArray45, (int) (short) 100);
        double[] doubleArray54 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray55 = new double[] {};
        double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray54, doubleArray55, 0);
        double[] doubleArray62 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray63 = new double[] {};
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray62, doubleArray63, 0);
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray55, doubleArray63, (int) (byte) 1);
        double double69 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray45, doubleArray63, 0);
        double double71 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray31, doubleArray45, (int) (short) -1);
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray31, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[574.5536640965004, 292.0641734589212, 590.3802649016793]");
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
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
    }

    @Test
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08315");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(721.4255057983173d, 1528.7429140467852d, 299.80915355137904d, 312.84842138098065d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 587.1078115584784d + "'", double4 == 587.1078115584784d);
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08316");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2037.2610224755904d, 1550.7767879711332d, 1181.7433642758228d, 627.8912927284904d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1778.4031534424103d + "'", double4 == 1778.4031534424103d);
    }

    @Test
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08317");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2244.8764906742254d, 0.0d, 0.0d, 2832.966633342281d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2320.629327205265d + "'", double4 == 2320.629327205265d);
    }

    @Test
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08318");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1203.8870203132117d, 2326.2899495091287d, 735.44709088251d, 4749.244548691682d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2891.3945286132553d + "'", double4 == 2891.3945286132553d);
    }

    @Test
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08319");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2430.0340804928896d, 2446.974580808893d, 942.8343298028784d, 966.2253882053817d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2086.7436320901747d + "'", double4 == 2086.7436320901747d);
    }

    @Test
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08320");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(807.8330280746628d, 942.7215473271511d, 2592.017907401038d, 1798.5358107378138d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2040.7860464030477d + "'", double4 == 2040.7860464030477d);
    }

    @Test
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08321");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(385.46876585804614d, 1885.2350524122394d, 277.1976496143225d, 704.9496923240522d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 337.32876691477037d + "'", double4 == 337.32876691477037d);
    }

    @Test
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08322");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(880.8610059744032d, 1325.5166823792426d, 699.56173032996d, 163.1242822947696d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1343.6916757289164d + "'", double4 == 1343.6916757289164d);
    }

    @Test
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08323");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 711.2291099866812d, 2739.712961660632d, 459.0053851712383d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2991.936686476075d + "'", double4 == 2991.936686476075d);
    }

    @Test
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08324");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(753.8539938166764d, 353.7118870524356d, 1746.5794883063772d, 38.29271353676356d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1223.7368398661736d + "'", double4 == 1223.7368398661736d);
    }

    @Test
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08325");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(146.11801342590982d, 1940.6273563036116d, 466.01744543728313d, 415.0418892831276d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 417.91829058712847d + "'", double4 == 417.91829058712847d);
    }

    @Test
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08326");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(281.1492652373609d, 1078.2317336065362d, 962.5824041711725d, 682.5704654502064d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 790.8793225375845d + "'", double4 == 790.8793225375845d);
    }

    @Test
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08327");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(533.7322743943777d, 3444.010671130158d, 1539.204981315194d, 4639.072921645695d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4226.676850001255d + "'", double4 == 4226.676850001255d);
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08328");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(549.748738211362d, 849.0960875882956d, 5469.272046802893d, 391.5798783907461d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4922.065315697499d + "'", double4 == 4922.065315697499d);
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08329");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(837.4731729207292d, 1813.720231278971d, 1985.300842144798d, 804.1681721557534d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1148.3107511959963d + "'", double4 == 1148.3107511959963d);
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08330");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(6992.612267866089d, 1399.955444303588d, 761.6427530252773d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7630.924959144399d + "'", double4 == 7630.924959144399d);
    }

    @Test
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08331");
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
        int int22 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray20);
        int[] intArray26 = new int[] { 1, 1, 100 };
        int[] intArray28 = new int[] { (byte) -1 };
        int int29 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray26, intArray28);
        int[] intArray35 = new int[] { (byte) 10, (byte) 100, ' ', (short) -1, (short) 100 };
        int int36 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray35);
        int[] intArray40 = new int[] { 1, 1, 100 };
        int[] intArray42 = new int[] { (byte) -1 };
        int int43 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray40, intArray42);
        int[] intArray47 = new int[] { 1, 1, 100 };
        int[] intArray49 = new int[] { (byte) -1 };
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray47, intArray49);
        int[] intArray53 = new int[] { 'a', 10 };
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray49, intArray53);
        int int55 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray40, intArray53);
        int int56 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray53);
        int[] intArray60 = new int[] { 1, 1, 100 };
        int[] intArray62 = new int[] { (byte) -1 };
        int int63 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray62);
        int[] intArray66 = new int[] { 'a', 10 };
        int int67 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray66);
        int int68 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray28, intArray62);
        int[] intArray72 = new int[] { 1, 1, 100 };
        int[] intArray74 = new int[] { (byte) -1 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray72, intArray74);
        int[] intArray78 = new int[] { 'a', 10 };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray78);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray78);
        int[] intArray84 = new int[] { 1, 1, 100 };
        int[] intArray86 = new int[] { (byte) -1 };
        int int87 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray86);
        int[] intArray90 = new int[] { 'a', 10 };
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray86, intArray90);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray62, intArray90);
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray12, intArray62);
        java.lang.Class<?> wildcardClass94 = intArray12.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, 100, 32, -1, 100]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[-1]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[97, 10]");
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
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08332");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(538.2473168613194d, 1181.117299054622d, 561.5070327524744d, 521.0206739506303d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 683.3563409951466d + "'", double4 == 683.3563409951466d);
    }

    @Test
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08333");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(392.5814609524481d, 840.3247784933427d, 580.7352867136476d, 1955.6700749521685d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1303.4991222200256d + "'", double4 == 1303.4991222200256d);
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08334");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(457.93935464055545d, 0.0d, 746.3563275325728d, 657.7348045524657d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 350.85976124043816d + "'", double4 == 350.85976124043816d);
    }

    @Test
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08335");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1997.3898007645857d, 60.259378594770354d, 0.0d, 792.0828056013817d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2729.213227771197d + "'", double4 == 2729.213227771197d);
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08336");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(587.5796262549627d, 1753.9289474798077d, 676.1839014392784d, 1325.5166823792426d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 517.0165402848808d + "'", double4 == 517.0165402848808d);
    }

    @Test
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08337");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(206.77820008724825d, 2669.2960561997807d, 316.85210118166225d, 345.02253292181524d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2434.3474243723795d + "'", double4 == 2434.3474243723795d);
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08338");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(583.8736067388763d, 3378.074899990158d, 472.094228345875d, 1755.8394358664898d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1177.28438963434d + "'", double4 == 1177.28438963434d);
    }

    @Test
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08339");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(808.5762626018434d, 0.0d, 50.91168824543142d, 560.3844877706626d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1318.0490621270746d + "'", double4 == 1318.0490621270746d);
    }

    @Test
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08340");
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
        int[] intArray72 = new int[] { 1, 1, 100 };
        int[] intArray74 = new int[] { (byte) -1 };
        int int75 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray72, intArray74);
        int[] intArray78 = new int[] { 'a', 10 };
        int int79 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray78);
        int int80 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray67, intArray74);
        int[] intArray84 = new int[] { (byte) -1, (short) -1, ' ' };
        int[] intArray88 = new int[] { 1, 1, 100 };
        int[] intArray90 = new int[] { (byte) -1 };
        int int91 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray88, intArray90);
        int int92 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray84, intArray88);
        int int93 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray74, intArray88);
        java.lang.Class<?> wildcardClass94 = intArray74.getClass();
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
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[-1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[97, 10]");
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
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08341");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(360.37692385789285d, 3390.414859565335d, 1395.7652132288606d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4425.803148936303d + "'", double4 == 4425.803148936303d);
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08342");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1555.206631700226d, 4082.6246903113088d, 1315.6598360158976d, 1954.6977934931683d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2367.473692502469d + "'", double4 == 2367.473692502469d);
    }

    @Test
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08343");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2707.6792351089543d, 708.244107469713d, 1789.0559517170952d, 6474.065541033065d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3876.794364193477d + "'", double4 == 3876.794364193477d);
    }

    @Test
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08344");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(661.4062218796978d, 670.1381944953195d, 1203.7619052769378d, 1003.1058407037573d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 641.0213076160533d + "'", double4 == 641.0213076160533d);
    }

    @Test
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08345");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(675.2179454893541d, 2631.174919184032d, 2206.808205666772d, 2772.6861160494195d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2597.141014959126d + "'", double4 == 2597.141014959126d);
    }

    @Test
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08346");
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
        java.lang.Class<?> wildcardClass58 = doubleArray50.getClass();
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
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08347");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(679.9542693129016d, 0.0d, 774.6257855868183d, 703.755100043443d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.6174960602164d + "'", double4 == 97.6174960602164d);
    }

    @Test
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08348");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1110.874708700701d, 281.3657130012615d, 384.1743828869851d, 91.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 917.0660388149773d + "'", double4 == 917.0660388149773d);
    }

    @Test
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08349");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray5 = new double[] {};
        double double7 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray5, 0);
        double[] doubleArray12 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double double15 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray12, doubleArray13, 0);
        double double17 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray13, 1);
        double[] doubleArray19 = new double[] { (short) 0 };
        double[] doubleArray24 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray25 = new double[] {};
        double double27 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray24, doubleArray25, 0);
        double[] doubleArray32 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray33 = new double[] {};
        double double35 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray32, doubleArray33, 0);
        double double37 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray24, doubleArray33, (int) (short) 100);
        double double39 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray19, doubleArray24, 1);
        double double41 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray24, 215);
        double[] doubleArray42 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double44 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray24, doubleArray42, (int) (short) 100);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0]");
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
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
    }

    @Test
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08350");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(374.4096930671966d, 1149.3550069927487d, 1122.114587663264d, 2201.457115108937d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1974.1238288902462d + "'", double4 == 1974.1238288902462d);
    }

    @Test
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08351");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(5001.463974819821d, 1590.0495067670295d, 635.2249546953902d, 235.11229898487548d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6463.911468963026d + "'", double4 == 6463.911468963026d);
    }

    @Test
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08352");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(233.65447025960663d, 2445.441733457353d, 1882.2195019689325d, 1818.3430093357147d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2275.6637558309644d + "'", double4 == 2275.6637558309644d);
    }

    @Test
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08353");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(535.8788384307745d, 1034.622409003104d, 822.5426568831847d, 269.3598320793501d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 391.41860655347875d + "'", double4 == 391.41860655347875d);
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08354");
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
        double[] doubleArray70 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray71 = new double[] {};
        double double73 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray70, doubleArray71, 0);
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray71, (int) (byte) 1);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray49, doubleArray63, 0);
        double[] doubleArray78 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double80 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray63, doubleArray78, (-1));
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
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
    }

    @Test
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08355");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(277.515023655668d, 920.0062552712888d, 942.8343298028784d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 720.8774982525197d + "'", double4 == 720.8774982525197d);
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08356");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2151.333495320436d, 1800.842185861806d, 2322.68957635252d, 1165.2355501668776d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 806.9627167270121d + "'", double4 == 806.9627167270121d);
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08357");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(822.4577778541553d, 1342.345765585628d, 936.56791087011d, 651.5649556301087d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 205.48839175150138d + "'", double4 == 205.48839175150138d);
    }

    @Test
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08358");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(933.2155331100303d, 1050.0839693995063d, 231.28754390542792d, 1289.3873572486573d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 941.2313770537534d + "'", double4 == 941.2313770537534d);
    }

    @Test
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08359");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(124.12768977003863d, 372.94976380494643d, 434.59128451792674d, 391.3939305386865d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 328.9077614816282d + "'", double4 == 328.9077614816282d);
    }

    @Test
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08360");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1390.7100996295824d, 1942.5997531126466d, 1473.8700990129196d, 2532.8482272740534d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 673.4084735447441d + "'", double4 == 673.4084735447441d);
    }

    @Test
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08361");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(670.8717094183469d, 1917.3819868756013d, 681.7255943446476d, 323.9871688990332d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1604.248702902869d + "'", double4 == 1604.248702902869d);
    }

    @Test
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08362");
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
        int[] intArray40 = new int[] { 'a', 10 };
        int int41 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray40);
        int[] intArray45 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int46 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray36, intArray45);
        int int47 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray36);
        int[] intArray51 = new int[] { 1, 1, 100 };
        int[] intArray53 = new int[] { (byte) -1 };
        int int54 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray51, intArray53);
        int[] intArray58 = new int[] { 1, 1, 100 };
        int[] intArray60 = new int[] { (byte) -1 };
        int int61 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray58, intArray60);
        int[] intArray64 = new int[] { 'a', 10 };
        int int65 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray64);
        int[] intArray69 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int int70 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray60, intArray69);
        int int71 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray53, intArray60);
        int int72 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray14, intArray53);
        java.lang.Class<?> wildcardClass73 = intArray14.getClass();
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
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[1, 1, -1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08363");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(430.6095975138101d, 1480.2548055494044d, 924.734217421653d, 224.76550746286068d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 535.2858389757511d + "'", double4 == 535.2858389757511d);
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08364");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(409.09203605141266d, 2737.695928669476d, 2592.0288495957343d, 1769.5082666957385d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3151.1244755180587d + "'", double4 == 3151.1244755180587d);
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08365");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 8172.5759013812385d, 2154.6557680866545d, 174.15406001316165d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2161.682473345278d + "'", double4 == 2161.682473345278d);
    }

    @Test
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08366");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(3406.249642244902d, 1853.2363306232926d, 699.3261970700897d, 283.2880399328444d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4276.871735865261d + "'", double4 == 4276.871735865261d);
    }

    @Test
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08367");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(282.2613666245667d, 3925.9570397594252d, 564.2721358127096d, 4710.023177978803d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1066.0769074075206d + "'", double4 == 1066.0769074075206d);
    }

    @Test
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08368");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2223.519951796883d, 1050.7876424943584d, 970.9092167777051d, 1431.888062124217d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1481.7944196925569d + "'", double4 == 1481.7944196925569d);
    }

    @Test
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08369");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2293.4820982246774d, 567.3390230270919d, 413.8437306383785d, 374.4096930671966d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2072.5676975461943d + "'", double4 == 2072.5676975461943d);
    }

    @Test
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08370");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1957.3647360529133d, 472.0621371770095d, 708.244107469713d, 2173.3639994839323d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1267.6584818297208d + "'", double4 == 1267.6584818297208d);
    }

    @Test
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08371");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 2429.070196532499d, 0.0d, 1215.5878100538368d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1213.482386478662d + "'", double4 == 1213.482386478662d);
    }

    @Test
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08372");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1174.617141190017d, 1543.3137699551608d, 486.76902224492216d, 1118.24077114537d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 690.1545695246222d + "'", double4 == 690.1545695246222d);
    }

    @Test
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08373");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1117.6888075212794d, 748.0414034714805d, 1437.4131975506234d, 2821.2205411473697d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2392.9035277052335d + "'", double4 == 2392.9035277052335d);
    }

    @Test
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08374");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3316.8635662472766d, 396.492155809011d, 974.2643330499437d, 483.08021801149255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3676.6967827270096d + "'", double4 == 3676.6967827270096d);
    }

    @Test
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08375");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(923.5849164617041d, 0.0d, 895.9961052333194d, 697.1357361279265d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 228.1235932095476d + "'", double4 == 228.1235932095476d);
    }

    @Test
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08376");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(883.2477228774341d, 91.0d, 776.614861614777d, 961.3449985909297d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 976.9778598535867d + "'", double4 == 976.9778598535867d);
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08377");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(696.9969025729727d, 518.4053939931825d, 784.2182474956893d, 917.9383163743634d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 486.75426730389745d + "'", double4 == 486.75426730389745d);
    }

    @Test
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08378");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 3228.153530269311d, 730.5393088107734d, 862.4888449137374d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1130.2984956719863d + "'", double4 == 1130.2984956719863d);
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08379");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1409.250586878226d, 2123.350569823472d, 5641.229016831588d, 996.1563978294703d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5359.1726019473645d + "'", double4 == 5359.1726019473645d);
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08380");
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
        java.lang.Class<?> wildcardClass87 = intArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08381");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 2704.6344985718433d, 423.56359629095886d, 1238.4679205642392d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1889.730174298563d + "'", double4 == 1889.730174298563d);
    }

    @Test
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08382");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 2257.019647438485d, 697.906298565561d, 2037.5590268821259d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 917.3669191219203d + "'", double4 == 917.3669191219203d);
    }

    @Test
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08383");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(556.5964737618754d, 687.4990900244022d, 762.1889468010093d, 2303.9220847063584d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1759.3791676704761d + "'", double4 == 1759.3791676704761d);
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08384");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 66.35060455587607d, 2645.398768597145d, 1898.5040154974722d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4477.552179538741d + "'", double4 == 4477.552179538741d);
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08385");
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
        int[] intArray84 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int85 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray79, intArray84);
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
    }

    @Test
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08386");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2307.993341657062d, 1084.160743128407d, 733.1466438217658d, 490.25700073760834d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2405.0587366594564d + "'", double4 == 2405.0587366594564d);
    }

    @Test
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08387");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(756.4894873073506d, 1156.3046134577464d, 901.5793529400635d, 976.9778598535867d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 324.41661923687263d + "'", double4 == 324.41661923687263d);
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08388");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1580.7540211106561d, 871.2992730721038d, 0.0d, 1174.1652512854043d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1632.2063910564498d + "'", double4 == 1632.2063910564498d);
    }

    @Test
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08389");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(313.0954068750014d, 1342.9344883792328d, 3374.934207353143d, 666.1719514049422d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3738.601337452432d + "'", double4 == 3738.601337452432d);
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08390");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1576.8234015285955d, 920.7057618461697d, 1728.289644995628d, 161.7345274581286d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1423.172000999189d + "'", double4 == 1423.172000999189d);
    }

    @Test
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08391");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2151.333495320436d, 741.7997315206958d, 1354.941382160785d, 1442.1761910234393d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1496.7685726623947d + "'", double4 == 1496.7685726623947d);
    }

    @Test
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08392");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1016.1452225999025d, 1236.6752907573918d, 1986.6053402063276d, 170.41777368493752d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2036.7176346788797d + "'", double4 == 2036.7176346788797d);
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08393");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(298.5992668050363d, 2315.1572318891826d, 817.604629462954d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2734.1625945471005d + "'", double4 == 2734.1625945471005d);
    }

    @Test
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08394");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(551.7540975753784d, 797.7701193098305d, 576.0783876630139d, 167.76644024403632d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 384.7573158122918d + "'", double4 == 384.7573158122918d);
    }

    @Test
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08395");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(976.014742685227d, Double.POSITIVE_INFINITY, 238.45762724844747d, 2084.5905742797518d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1331.5145034609707d + "'", double4 == 1331.5145034609707d);
    }

    @Test
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08396");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2478.936429245424d, 2173.3639994839323d, 206.8986500189719d, 1588.8878282789594d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2856.5139504314247d + "'", double4 == 2856.5139504314247d);
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08397");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(534.0054007349432d, 2319.802136420398d, 633.8945645939809d, 2399.464711567584d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1868.131763401246d + "'", double4 == 1868.131763401246d);
    }

    @Test
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08398");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(257.74051779498967d, 2818.2341148988494d, 4071.2522367299543d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3822.2116379090708d + "'", double4 == 3822.2116379090708d);
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08399");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(522.5141120440348d, 448.6208835583424d, 3046.4238466477655d, 1107.9470250878358d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3183.235876133224d + "'", double4 == 3183.235876133224d);
    }

    @Test
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08400");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2038.3903224657363d, 163.1242822947696d, 186.9180422268371d, 4041.3260499355197d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5729.674047879649d + "'", double4 == 5729.674047879649d);
    }

    @Test
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08401");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(874.806609068789d, 3434.4191331233d, 1738.557185860107d, 1987.7658535560795d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2310.4038563585386d + "'", double4 == 2310.4038563585386d);
    }

    @Test
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08402");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(521.0374488241554d, 1005.9416819900712d, 548.6842561828317d, 2483.9847999350486d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1963.1420348997674d + "'", double4 == 1963.1420348997674d);
    }

    @Test
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08403");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(747.5394850438378d, 511.3007410418894d, 35.27174468428022d, 1428.1155278730532d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1629.0825271907215d + "'", double4 == 1629.0825271907215d);
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08404");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1942.0649060649096d, 1310.8434542107746d, 3166.988720473382d, 30.10864641105329d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2505.6586222081933d + "'", double4 == 2505.6586222081933d);
    }

    @Test
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08405");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1966.05622276884d, 503.41416381475506d, 392.85683806393797d, 546.5855220111873d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2118.9274112968815d + "'", double4 == 2118.9274112968815d);
    }

    @Test
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08406");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1853.2363306232926d, 692.1018639959708d, 2187.097140768588d, 5247.81076182208d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4889.569707971405d + "'", double4 == 4889.569707971405d);
    }

    @Test
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08407");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1135.3728010417708d, 1474.186498648268d, 0.0d, 460.63617381552586d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2148.923125874513d + "'", double4 == 2148.923125874513d);
    }

    @Test
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08408");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2107.8507437815388d, 391.7745645456948d, 901.5528166013252d, 1080.72251526962d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1895.245877904139d + "'", double4 == 1895.245877904139d);
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08409");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1779.4420649611448d, 2423.8587341111115d, 601.712149954323d, 475.24329446565264d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1757.265542160299d + "'", double4 == 1757.265542160299d);
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08410");
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
            double double57 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray0, doubleArray21, 26);
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
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08411");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(800.1499560891493d, 0.0d, 1121.2573802880665d, 511.3007410418894d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 832.4081652408066d + "'", double4 == 832.4081652408066d);
    }

    @Test
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08412");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 225.5711237600251d, 1234.2601729389798d, 323.8151627101534d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1332.504211889108d + "'", double4 == 1332.504211889108d);
    }

    @Test
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08413");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(5629.366662844536d, 762.1889468010093d, 1132.1883291955473d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5259.367280449998d + "'", double4 == 5259.367280449998d);
    }

    @Test
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08414");
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
        double[] doubleArray58 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray59 = new double[] {};
        double double61 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray58, doubleArray59, 0);
        double double63 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray59, 1);
        double double65 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray43, doubleArray50, (int) ' ');
        double double67 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray23, doubleArray50, (int) (short) 10);
        double[] doubleArray72 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray73 = new double[] {};
        double double75 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray72, doubleArray73, 0);
        double double77 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray50, doubleArray73, 26);
        java.lang.Class<?> wildcardClass78 = doubleArray50.getClass();
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
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08415");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2063.761199868312d, 2324.882277663795d, 1394.2206254847506d, 264.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1920.2668974122569d + "'", double4 == 1920.2668974122569d);
    }

    @Test
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08416");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(980.0794169329689d, 709.0125940535077d, 602.8273726292666d, 1179.7222842655474d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 847.961734515742d + "'", double4 == 847.961734515742d);
    }

    @Test
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08417");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(429.07839943364144d, 1723.9017761651673d, 640.5702084085508d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1934.3935851400768d + "'", double4 == 1934.3935851400768d);
    }

    @Test
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08418");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(254.49072408390177d, 0.0d, 478.8997982639517d, 150.40770846134703d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 247.37159642010667d + "'", double4 == 247.37159642010667d);
    }

    @Test
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08419");
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
            double double60 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray13, doubleArray58, (int) (byte) 10);
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
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08420");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1029.189112501497d, 877.9120720243004d, 1323.034446010632d, 1144.2961908081043d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 315.58631070022386d + "'", double4 == 315.58631070022386d);
    }

    @Test
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08421");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(651.5649556301087d, 1929.1707615310613d, 949.0648802097436d, 1008.5430500138841d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 464.69297928283805d + "'", double4 == 464.69297928283805d);
    }

    @Test
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08422");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(886.9991318016976d, 483.08021801149255d, 269.58674802344547d, 340.1389565506388d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 760.3536452391058d + "'", double4 == 760.3536452391058d);
    }

    @Test
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08423");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2160.4578722252836d, 831.249681825333d, 1331.809401837636d, 687.8385619858715d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1689.7532128585494d + "'", double4 == 1689.7532128585494d);
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08424");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1412.7994102768505d, 1786.0894626301626d, 1696.1463301774907d, 1649.5050308100826d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 419.93135172072016d + "'", double4 == 419.93135172072016d);
    }

    @Test
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08425");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1569.3096664183115d, 1422.7257031240092d, 1052.2993384942952d, 730.8697129395732d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 985.0285451546711d + "'", double4 == 985.0285451546711d);
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08426");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(987.8418305031446d, 1258.774095768958d, 926.6709616030677d, 233.0127717563659d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1086.932192912669d + "'", double4 == 1086.932192912669d);
    }

    @Test
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08427");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1814.0416132949465d, 1033.7006669989464d, 1412.7994102768505d, 619.9042501456235d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1259.7457471855314d + "'", double4 == 1259.7457471855314d);
    }

    @Test
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08428");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(773.0465405509034d, 981.552780344625d, 1157.288178707074d, 3410.638310960629d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2813.3271687721744d + "'", double4 == 2813.3271687721744d);
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08429");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1759.5059694863512d, 883.2477228774341d, 0.0d, 1325.685821029144d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1812.197885956591d + "'", double4 == 1812.197885956591d);
    }

    @Test
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08430");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1337.2300857820032d, 3192.3595341483306d, 0.0d, 5371.076989047547d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4249.718242578625d + "'", double4 == 4249.718242578625d);
    }

    @Test
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08431");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(777.6320980383734d, 109.46229341113029d, 182.05164476463364d, 98.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 607.04274668487d + "'", double4 == 607.04274668487d);
    }

    @Test
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08432");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1103.9192087255542d, 2217.627036983625d, 892.4112024342124d, 991.2194913901131d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1437.9155518848538d + "'", double4 == 1437.9155518848538d);
    }

    @Test
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08433");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(3502.6530561004865d, 803.6708840159037d, 3828.430775369757d, 2627.0857509200846d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 934.2104839238098d + "'", double4 == 934.2104839238098d);
    }

    @Test
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08434");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(417.07297918251146d, 0.0d, 231.9064967234238d, 994.6653104625752d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1179.8317929216628d + "'", double4 == 1179.8317929216628d);
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08435");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1184.5932558920372d, 423.2002675066391d, 2892.8435022798885d, 774.0897884912134d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2059.139767372426d + "'", double4 == 2059.139767372426d);
    }

    @Test
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08436");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1635.4100237188457d, 3934.1061388673024d, 373.46632795706125d, 1495.059977215628d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1269.724390104548d + "'", double4 == 1269.724390104548d);
    }

    @Test
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08437");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1975.916667095315d, 6767.7038775323745d, 2067.429468691161d, 512.4630791739673d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6346.753599954253d + "'", double4 == 6346.753599954253d);
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08438");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2721.196879148509d, 1056.5692706321804d, 2408.5985110711144d, 1283.9922191100031d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1470.8075926378162d + "'", double4 == 1470.8075926378162d);
    }

    @Test
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08439");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 686.3437606194915d, 1154.3996351784397d, 1019.2959049426091d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1540.0008634844614d + "'", double4 == 1540.0008634844614d);
    }

    @Test
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08440");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(608.7160566860049d, 317.3503151641939d, 92.73111061416752d, 383.6847775335497d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 582.3194084411932d + "'", double4 == 582.3194084411932d);
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08441");
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
        double[] doubleArray46 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double[] doubleArray47 = new double[] {};
        double double49 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray46, doubleArray47, 0);
        double double51 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray28, doubleArray46, (int) (byte) 0);
        double double53 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray21, doubleArray46, (int) (short) 100);
        double double55 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray46, 69);
        java.lang.Class<?> wildcardClass56 = doubleArray4.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[97.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + Double.POSITIVE_INFINITY + "'", double51 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08442");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 1024.0280124554229d, 559.1559393434495d, 975.664086463798d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 607.5198653350744d + "'", double4 == 607.5198653350744d);
    }

    @Test
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08443");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(416.8908179751387d, 4380.026043519007d, 1173.0068643841632d, 468.62856294459226d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 757.8840741774023d + "'", double4 == 757.8840741774023d);
    }

    @Test
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08444");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 933.2272834879382d, 431.87538762457024d, 641.6856807393737d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 723.4169903731347d + "'", double4 == 723.4169903731347d);
    }

    @Test
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08445");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(753.9308874361723d, 965.3587408087419d, 37.59251283876873d, 803.522103591273d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 718.0528919519732d + "'", double4 == 718.0528919519732d);
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08446");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 1196.639201949845d, 952.4965584854033d, 788.5542416635808d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1360.5815187716676d + "'", double4 == 1360.5815187716676d);
    }

    @Test
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08447");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(358.666116899047d, 1065.4951610287171d, 1699.047402491374d, 333.91416128859964d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1340.6098053023038d + "'", double4 == 1340.6098053023038d);
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08448");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1055.21852147466d, 1997.3898007645857d, 0.0d, 997.1396625330085d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2055.4686597062373d + "'", double4 == 2055.4686597062373d);
    }

    @Test
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08449");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(828.6293915546679d, 727.4426034836936d, 2463.827628031723d, 500.4991107935749d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1667.7957769853074d + "'", double4 == 1667.7957769853074d);
    }

    @Test
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08450");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1274.4124809626742d, 2587.009217682258d, 1264.9091074325117d, 1135.1586081280889d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 139.57777476333635d + "'", double4 == 139.57777476333635d);
    }

    @Test
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08451");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(0.0d, 1.0d, 254.3727246655306d, 417.66795450539934d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 671.0406791709299d + "'", double4 == 671.0406791709299d);
    }

    @Test
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08452");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1500.4121299557346d, 972.8176660596337d, 1480.1193106454605d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 993.1104853699078d + "'", double4 == 993.1104853699078d);
    }

    @Test
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08453");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1986.6053402063276d, 2794.6266212459095d, 628.8349589675499d, 2812.549650455464d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1375.693410448332d + "'", double4 == 1375.693410448332d);
    }

    @Test
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08454");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(878.1086993790781d, 630.1930244036126d, 0.0d, 1140.588688718335d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 916.4991176912024d + "'", double4 == 916.4991176912024d);
    }

    @Test
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08455");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 799.3090405533982d, 1524.4128875948586d, 2276.8197473129762d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2740.026060755558d + "'", double4 == 2740.026060755558d);
    }

    @Test
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08456");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1080.5482089392854d, 692.9587392176101d, 1063.5821345880852d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 709.9248135688102d + "'", double4 == 709.9248135688102d);
    }

    @Test
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08457");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1538.914391985074d, 1028.706376682715d, 1294.856623393348d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1272.764145274441d + "'", double4 == 1272.764145274441d);
    }

    @Test
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08458");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 669.205282796098d, 407.95790549631715d, 704.1606736837927d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 813.8009013387456d + "'", double4 == 813.8009013387456d);
    }

    @Test
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08459");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(374.59237691164697d, 378.87782726636954d, 538.0178637417789d, 582.0571490761524d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 264.10134690102547d + "'", double4 == 264.10134690102547d);
    }

    @Test
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08460");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(630.5679322081731d, 257.15421187030165d, 630.4713680990789d, 1259.7457471855314d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 629.1778223875267d + "'", double4 == 629.1778223875267d);
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08461");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(572.2631809460208d, 1828.8034906289192d, 512.2965450848703d, 796.6050949282106d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 232.21819865311176d + "'", double4 == 232.21819865311176d);
    }

    @Test
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08462");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1604.6597302396287d, 607.2508295319844d, 531.5678854568765d, 986.8203513827043d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1238.2453736661246d + "'", double4 == 1238.2453736661246d);
    }

    @Test
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08463");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 799.9078566364301d, 2079.6908311254906d, 1800.2522642591275d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2750.6403196415104d + "'", double4 == 2750.6403196415104d);
    }

    @Test
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08464");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(268.5218799278748d, 1337.2300857820032d, 1427.8503003439218d, 897.1389304235197d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1318.7879975789174d + "'", double4 == 1318.7879975789174d);
    }

    @Test
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08465");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2520.200507853767d, 1521.9542794837575d, 4675.814059739997d, 555.7197088172657d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2916.479829324842d + "'", double4 == 2916.479829324842d);
    }

    @Test
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08466");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1076.409245327592d, 538.2473168613194d, 2378.9323427446407d, 787.494038320702d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1551.7698188764311d + "'", double4 == 1551.7698188764311d);
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08467");
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
        double[] doubleArray68 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double70 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray4, doubleArray68, (int) (short) 1);
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
    }

    @Test
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08468");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(212.0862081751727d, 542.814174340953d, 415.78775792499863d, 2108.6613560561427d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1769.5487314650159d + "'", double4 == 1769.5487314650159d);
    }

    @Test
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08469");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(378.87782726636954d, 1046.97858332577d, 833.2404484695342d, 555.8500408038165d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 945.4911637251181d + "'", double4 == 945.4911637251181d);
    }

    @Test
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08470");
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
        int[] intArray35 = new int[] { 1, 1, 100 };
        int[] intArray37 = new int[] { (byte) -1 };
        int int38 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray37);
        int[] intArray42 = new int[] { 1, 1, 100 };
        int[] intArray44 = new int[] { (byte) -1 };
        int int45 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray42, intArray44);
        int[] intArray48 = new int[] { 'a', 10 };
        int int49 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray44, intArray48);
        int int50 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray35, intArray48);
        int int51 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray6, intArray48);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray0, intArray6);
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
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[97, 10]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08471");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1072.0657401859485d, 823.2048226688985d, 629.4714697471602d, 674.0323645383281d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 595.2480628735241d + "'", double4 == 595.2480628735241d);
    }

    @Test
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08472");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(2326.068532273016d, 1433.8281107537164d, 247.80706871775823d, 2660.7680153550314d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3305.2013681565727d + "'", double4 == 3305.2013681565727d);
    }

    @Test
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08473");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1200.1361291561295d, 0.0d, 357.47422719117975d, 934.47648493516d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1777.1383869001097d + "'", double4 == 1777.1383869001097d);
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08474");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(623.7929307540486d, 1405.4091582399142d, 1774.440361367622d, 1402.5527564683646d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1389.4086424534037d + "'", double4 == 1389.4086424534037d);
    }

    @Test
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08475");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(524.6384328164221d, 0.0d, 349.48898822337424d, 392.93748583554736d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 219.14029154154267d + "'", double4 == 219.14029154154267d);
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08476");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(1609.8435490307822d, (double) 136, 2092.8269635231545d, 3825.061233923414d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4172.0446484157865d + "'", double4 == 4172.0446484157865d);
    }

    @Test
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08477");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(96.9568383829882d, 159.6408171889707d, 773.2622329181976d, 1056.5692706321804d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1573.2338479784191d + "'", double4 == 1573.2338479784191d);
    }

    @Test
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08478");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(508.47268495000185d, 1835.0188225969866d, 974.201188346456d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 689.5270192067638d + "'", double4 == 689.5270192067638d);
    }

    @Test
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08479");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(425.71130297188733d, 1226.838413794197d, 485.6155795664205d, 367.32273218396386d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 919.4199582047664d + "'", double4 == 919.4199582047664d);
    }

    @Test
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08480");
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
        double[] doubleArray56 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double58 = com.thealgorithms.maths.DistanceFormula.minkowskiDistance(doubleArray5, doubleArray56, (int) (short) 100);
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
    }

    @Test
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08481");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2119.267425485545d, 428.1565388515537d, 542.2127480560036d, 1603.5794709054107d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1659.2273870996216d + "'", double4 == 1659.2273870996216d);
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08482");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(Double.POSITIVE_INFINITY, 442.2044982103387d, 1728.6060689590258d, 460.068664272141d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08483");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(884.5268766213604d, 292.74081038022285d, 978.4438663763432d, 289.94401876488206d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 96.71378137032355d + "'", double4 == 96.71378137032355d);
    }

    @Test
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08484");
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
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08485");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(673.1782704198858d, 0.0d, 459.7280589510255d, 2315.992307992693d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2529.4425194615533d + "'", double4 == 2529.4425194615533d);
    }

    @Test
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08486");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(727.9250066104931d, 2350.6942557688576d, 161.7345274581286d, 2420.428990198968d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 635.9252135824752d + "'", double4 == 635.9252135824752d);
    }

    @Test
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08487");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(649.0599082104769d, 1650.5689502464306d, 881.5814085104663d, 480.22375577838454d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 287.3532572807044d + "'", double4 == 287.3532572807044d);
    }

    @Test
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08488");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(837.7108581071841d, 0.0d, 609.9293586384213d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 868.1266574013914d + "'", double4 == 868.1266574013914d);
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08489");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(2125.1529151718755d, 1498.134067021529d, 328.9077614816282d, 535.9469777784859d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2398.347798715212d + "'", double4 == 2398.347798715212d);
    }

    @Test
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08490");
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
        int int86 = com.thealgorithms.maths.DistanceFormula.hammingDistance(intArray52, intArray81);
        java.lang.Class<?> wildcardClass87 = intArray52.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08491");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1633.5686689676313d, 889.1857289890074d, 775.270960288489d, 703.865287100714d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1265.3155080764043d + "'", double4 == 1265.3155080764043d);
    }

    @Test
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08492");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 742.0165151702342d, 259.02662195501057d, 687.7936017637178d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 734.9522634215991d + "'", double4 == 734.9522634215991d);
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08493");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(1756.3197263345141d, 1889.730174298563d, 0.0d, 2082.725102312048d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1786.3928600895094d + "'", double4 == 1786.3928600895094d);
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08494");
        double double4 = com.thealgorithms.maths.DistanceFormula.manhattanDistance(791.3427433400091d, 933.2272834879382d, 3333.744814787238d, 217.47976508146692d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3258.1495898537005d + "'", double4 == 3258.1495898537005d);
    }

    @Test
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08495");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(954.4706861730292d, 802.1167756651582d, 1317.6986333931648d, 669.073592772389d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 461.9372712428467d + "'", double4 == 461.9372712428467d);
    }

    @Test
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08496");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(145.91161607703185d, 496.82364336259616d, 629.5444608483646d, 250.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 494.7071054768743d + "'", double4 == 494.7071054768743d);
    }

    @Test
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08497");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(346.8788951708699d, 4501.066758889818d, 228.29858276560483d, 405.08428040763397d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 132.09525866090112d + "'", double4 == 132.09525866090112d);
    }

    @Test
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08498");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(230.52569704296738d, 3330.3049663012075d, 706.5032237784504d, 547.3555045049396d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 571.7829420799626d + "'", double4 == 571.7829420799626d);
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08499");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(0.0d, 689.3330009868114d, 418.14210302332083d, 2092.2717258356106d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2133.645657800725d + "'", double4 == 2133.645657800725d);
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08500");
        double double4 = com.thealgorithms.maths.DistanceFormula.euclideanDistance(553.8418281886552d, 1103.170679368263d, 2201.457115108937d, 600.5503288932999d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1648.2772272076925d + "'", double4 == 1648.2772272076925d);
    }
}

