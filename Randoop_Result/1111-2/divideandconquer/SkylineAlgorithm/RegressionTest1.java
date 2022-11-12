package divideandconquer.SkylineAlgorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int6 = point5.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean13 = point9.dominates(point12);
        int int14 = point9.getX();
        boolean boolean15 = point5.dominates(point9);
        int int16 = point9.getX();
        boolean boolean17 = point2.dominates(point9);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point20 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 100, 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point23 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int24 = point23.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean31 = point27.dominates(point30);
        int int32 = point27.getX();
        boolean boolean33 = point23.dominates(point27);
        int int34 = point27.getX();
        int int35 = point27.getY();
        int int36 = point27.getY();
        boolean boolean37 = point20.dominates(point27);
        boolean boolean38 = point2.dominates(point20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 10);
        int int3 = point2.getY();
        int int4 = point2.getY();
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) 100, 10);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm1 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point4 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean8 = point4.dominates(point7);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point4 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList10 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList10, pointArray9);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm12.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm1.produceFinalSkyLine(pointList10, pointList13);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm0.produceSubSkyLines(pointList10);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList17 = skylineAlgorithm16.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point21 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean25 = point21.dominates(point24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point21 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList27 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList27, pointArray26);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm29 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList30 = skylineAlgorithm29.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList31 = skylineAlgorithm18.produceFinalSkyLine(pointList27, pointList30);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm32 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point38 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean39 = point35.dominates(point38);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray40 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point35 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList41 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList41, pointArray40);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList44 = skylineAlgorithm43.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList45 = skylineAlgorithm32.produceFinalSkyLine(pointList41, pointList44);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = skylineAlgorithm16.produceFinalSkyLine(pointList31, pointList44);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList47 = skylineAlgorithm0.produceSubSkyLines(pointList46);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList48 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList50 = skylineAlgorithm0.produceSubSkyLines(pointList49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pointArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertNotNull(pointList17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(pointArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(pointList30);
        org.junit.Assert.assertNotNull(pointList31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(pointArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(pointList44);
        org.junit.Assert.assertNotNull(pointList45);
        org.junit.Assert.assertNotNull(pointList46);
        org.junit.Assert.assertNotNull(pointList47);
        org.junit.Assert.assertNotNull(pointList48);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) 0, (int) ' ');
        int int3 = point2.getX();
        int int4 = point2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        int int3 = point2.getY();
        int int4 = point2.getY();
        int int5 = point2.getY();
        int int6 = point2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) -1, (int) ' ');
        int int3 = point2.getY();
        int int4 = point2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean7 = point3.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point3 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList9 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList9, pointArray8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList12 = skylineAlgorithm11.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm0.produceFinalSkyLine(pointList9, pointList12);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point19 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList25 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList25, pointArray24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = skylineAlgorithm27.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList29 = skylineAlgorithm16.produceFinalSkyLine(pointList25, pointList28);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean38 = point34.dominates(point37);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point34 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList40 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList40, pointArray39);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList43 = skylineAlgorithm42.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList44 = skylineAlgorithm31.produceFinalSkyLine(pointList40, pointList43);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList45 = skylineAlgorithm30.produceSubSkyLines(pointList40);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = skylineAlgorithm0.produceFinalSkyLine(pointList29, pointList40);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList47 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm48 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point51 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point54 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean55 = point51.dominates(point54);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray56 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point51 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList57 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList57, pointArray56);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm59 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList60 = skylineAlgorithm59.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList61 = skylineAlgorithm48.produceFinalSkyLine(pointList57, pointList60);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm62 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm63 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point66 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point69 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean70 = point66.dominates(point69);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray71 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point66 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList72 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList72, pointArray71);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm74 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList75 = skylineAlgorithm74.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList76 = skylineAlgorithm63.produceFinalSkyLine(pointList72, pointList75);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList77 = skylineAlgorithm62.produceSubSkyLines(pointList72);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm78 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList79 = skylineAlgorithm78.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList80 = skylineAlgorithm48.produceFinalSkyLine(pointList77, pointList79);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList81 = skylineAlgorithm0.produceSubSkyLines(pointList77);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList82 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList83 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList84 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList85 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList86 = skylineAlgorithm0.getPoints();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pointArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pointList12);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pointArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(pointList28);
        org.junit.Assert.assertNotNull(pointList29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(pointArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(pointList43);
        org.junit.Assert.assertNotNull(pointList44);
        org.junit.Assert.assertNotNull(pointList45);
        org.junit.Assert.assertNotNull(pointList46);
        org.junit.Assert.assertNotNull(pointList47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(pointArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(pointList60);
        org.junit.Assert.assertNotNull(pointList61);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(pointArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(pointList75);
        org.junit.Assert.assertNotNull(pointList76);
        org.junit.Assert.assertNotNull(pointList77);
        org.junit.Assert.assertNotNull(pointList79);
        org.junit.Assert.assertNotNull(pointList80);
        org.junit.Assert.assertNotNull(pointList81);
        org.junit.Assert.assertNotNull(pointList82);
        org.junit.Assert.assertNotNull(pointList83);
        org.junit.Assert.assertNotNull(pointList84);
        org.junit.Assert.assertNotNull(pointList85);
        org.junit.Assert.assertNotNull(pointList86);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean7 = point3.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point3 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList9 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList9, pointArray8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList12 = skylineAlgorithm11.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm0.produceFinalSkyLine(pointList9, pointList12);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point19 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList25 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList25, pointArray24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = skylineAlgorithm27.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList29 = skylineAlgorithm16.produceFinalSkyLine(pointList25, pointList28);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean38 = point34.dominates(point37);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point34 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList40 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList40, pointArray39);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList43 = skylineAlgorithm42.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList44 = skylineAlgorithm31.produceFinalSkyLine(pointList40, pointList43);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList45 = skylineAlgorithm30.produceSubSkyLines(pointList40);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = skylineAlgorithm0.produceFinalSkyLine(pointList29, pointList40);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList47 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm48 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point51 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point54 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean55 = point51.dominates(point54);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray56 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point51 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList57 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList57, pointArray56);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm59 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList60 = skylineAlgorithm59.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList61 = skylineAlgorithm48.produceFinalSkyLine(pointList57, pointList60);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm62 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm63 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point66 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point69 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean70 = point66.dominates(point69);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray71 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point66 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList72 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList72, pointArray71);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm74 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList75 = skylineAlgorithm74.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList76 = skylineAlgorithm63.produceFinalSkyLine(pointList72, pointList75);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList77 = skylineAlgorithm62.produceSubSkyLines(pointList72);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm78 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList79 = skylineAlgorithm78.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList80 = skylineAlgorithm48.produceFinalSkyLine(pointList77, pointList79);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList81 = skylineAlgorithm0.produceSubSkyLines(pointList77);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList82 = skylineAlgorithm0.getPoints();
        java.lang.Class<?> wildcardClass83 = pointList82.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pointArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pointList12);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pointArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(pointList28);
        org.junit.Assert.assertNotNull(pointList29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(pointArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(pointList43);
        org.junit.Assert.assertNotNull(pointList44);
        org.junit.Assert.assertNotNull(pointList45);
        org.junit.Assert.assertNotNull(pointList46);
        org.junit.Assert.assertNotNull(pointList47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(pointArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(pointList60);
        org.junit.Assert.assertNotNull(pointList61);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(pointArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(pointList75);
        org.junit.Assert.assertNotNull(pointList76);
        org.junit.Assert.assertNotNull(pointList77);
        org.junit.Assert.assertNotNull(pointList79);
        org.junit.Assert.assertNotNull(pointList80);
        org.junit.Assert.assertNotNull(pointList81);
        org.junit.Assert.assertNotNull(pointList82);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean7 = point3.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point3 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList9 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList9, pointArray8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList12 = skylineAlgorithm11.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm0.produceFinalSkyLine(pointList9, pointList12);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point19 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList25 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList25, pointArray24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = skylineAlgorithm27.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList29 = skylineAlgorithm16.produceFinalSkyLine(pointList25, pointList28);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean38 = point34.dominates(point37);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point34 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList40 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList40, pointArray39);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList43 = skylineAlgorithm42.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList44 = skylineAlgorithm31.produceFinalSkyLine(pointList40, pointList43);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList45 = skylineAlgorithm30.produceSubSkyLines(pointList40);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = skylineAlgorithm0.produceFinalSkyLine(pointList29, pointList40);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList47 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList48 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList49 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList50 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList51 = skylineAlgorithm0.getPoints();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pointArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pointList12);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pointArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(pointList28);
        org.junit.Assert.assertNotNull(pointList29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(pointArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(pointList43);
        org.junit.Assert.assertNotNull(pointList44);
        org.junit.Assert.assertNotNull(pointList45);
        org.junit.Assert.assertNotNull(pointList46);
        org.junit.Assert.assertNotNull(pointList47);
        org.junit.Assert.assertNotNull(pointList48);
        org.junit.Assert.assertNotNull(pointList49);
        org.junit.Assert.assertNotNull(pointList50);
        org.junit.Assert.assertNotNull(pointList51);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((-1), (int) 'a');
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point5.getX();
        boolean boolean11 = point2.dominates(point5);
        int int12 = point5.getY();
        int int13 = point5.getX();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '#', (int) (short) 1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean17 = point13.dominates(point16);
        boolean boolean18 = point8.dominates(point16);
        boolean boolean19 = point2.dominates(point16);
        int int20 = point2.getY();
        int int21 = point2.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) 'a', 10);
        int int25 = point24.getY();
        int int26 = point24.getY();
        boolean boolean27 = point2.dominates(point24);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 1, (int) '4');
        int int3 = point2.getX();
        int int4 = point2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean7 = point3.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point3 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList9 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList9, pointArray8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList12 = skylineAlgorithm11.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm0.produceFinalSkyLine(pointList9, pointList12);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList16 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList17 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList18 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList19 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList20 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm21 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean28 = point24.dominates(point27);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray29 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point24 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList30 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList30, pointArray29);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm32 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList33 = skylineAlgorithm32.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList34 = skylineAlgorithm21.produceFinalSkyLine(pointList30, pointList33);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point38 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point41 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean42 = point38.dominates(point41);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point38 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList44 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList44, pointArray43);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm46 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList47 = skylineAlgorithm46.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList48 = skylineAlgorithm35.produceFinalSkyLine(pointList44, pointList47);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm49 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point52 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point55 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean56 = point52.dominates(point55);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray57 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point52 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList58 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList58, pointArray57);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm60 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList61 = skylineAlgorithm60.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList62 = skylineAlgorithm49.produceFinalSkyLine(pointList58, pointList61);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm63 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point66 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point69 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean70 = point66.dominates(point69);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray71 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point66 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList72 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList72, pointArray71);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm74 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList75 = skylineAlgorithm74.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList76 = skylineAlgorithm63.produceFinalSkyLine(pointList72, pointList75);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList77 = skylineAlgorithm35.produceFinalSkyLine(pointList62, pointList72);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm78 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point81 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point84 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean85 = point81.dominates(point84);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray86 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point81 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList87 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList87, pointArray86);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm89 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList90 = skylineAlgorithm89.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList91 = skylineAlgorithm78.produceFinalSkyLine(pointList87, pointList90);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList92 = skylineAlgorithm35.produceSubSkyLines(pointList87);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList93 = skylineAlgorithm0.produceFinalSkyLine(pointList30, pointList87);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pointArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pointList12);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertNotNull(pointList16);
        org.junit.Assert.assertNotNull(pointList17);
        org.junit.Assert.assertNotNull(pointList18);
        org.junit.Assert.assertNotNull(pointList19);
        org.junit.Assert.assertNotNull(pointList20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(pointArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(pointList33);
        org.junit.Assert.assertNotNull(pointList34);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(pointArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(pointList47);
        org.junit.Assert.assertNotNull(pointList48);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(pointArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(pointList61);
        org.junit.Assert.assertNotNull(pointList62);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(pointArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(pointList75);
        org.junit.Assert.assertNotNull(pointList76);
        org.junit.Assert.assertNotNull(pointList77);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(pointArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(pointList90);
        org.junit.Assert.assertNotNull(pointList91);
        org.junit.Assert.assertNotNull(pointList92);
        org.junit.Assert.assertNotNull(pointList93);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean17 = point13.dominates(point16);
        boolean boolean18 = point8.dominates(point16);
        int int19 = point16.getY();
        boolean boolean20 = point2.dominates(point16);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point23 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point29 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean30 = point26.dominates(point29);
        int int31 = point29.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean38 = point34.dominates(point37);
        boolean boolean39 = point29.dominates(point37);
        int int40 = point37.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int44 = point43.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point47 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point50 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean51 = point47.dominates(point50);
        int int52 = point47.getX();
        boolean boolean53 = point43.dominates(point47);
        boolean boolean54 = point37.dominates(point43);
        boolean boolean55 = point23.dominates(point37);
        boolean boolean56 = point16.dominates(point37);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point59 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 1, (int) (short) 10);
        boolean boolean60 = point37.dominates(point59);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (-1));
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (byte) -1);
        boolean boolean6 = point2.dominates(point5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, (int) 'a');
        int int3 = point2.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean10 = point6.dominates(point9);
        int int11 = point9.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point17 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean18 = point14.dominates(point17);
        boolean boolean19 = point9.dominates(point17);
        int int20 = point17.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point23 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int24 = point23.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean31 = point27.dominates(point30);
        int int32 = point27.getX();
        boolean boolean33 = point23.dominates(point27);
        boolean boolean34 = point17.dominates(point23);
        int int35 = point23.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point38 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point41 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean42 = point38.dominates(point41);
        int int43 = point41.getY();
        int int44 = point41.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point47 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean48 = point41.dominates(point47);
        boolean boolean49 = point23.dominates(point41);
        int int50 = point23.getX();
        boolean boolean51 = point2.dominates(point23);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point54 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) -1, (int) (byte) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point57 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point60 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean61 = point57.dominates(point60);
        int int62 = point60.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point65 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point68 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean69 = point65.dominates(point68);
        boolean boolean70 = point60.dominates(point68);
        int int71 = point68.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point74 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int75 = point74.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point78 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point81 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean82 = point78.dominates(point81);
        int int83 = point78.getX();
        boolean boolean84 = point74.dominates(point78);
        boolean boolean85 = point68.dominates(point74);
        boolean boolean86 = point54.dominates(point68);
        int int87 = point68.getX();
        boolean boolean88 = point2.dominates(point68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '#', (int) (short) 1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean17 = point13.dominates(point16);
        boolean boolean18 = point8.dominates(point16);
        boolean boolean19 = point2.dominates(point16);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        int int23 = point22.getX();
        int int24 = point22.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean31 = point27.dominates(point30);
        int int32 = point30.getY();
        int int33 = point30.getX();
        boolean boolean34 = point22.dominates(point30);
        boolean boolean35 = point16.dominates(point30);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point38 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        int int39 = point38.getX();
        boolean boolean40 = point30.dominates(point38);
        int int41 = point30.getY();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean14 = point10.dominates(point13);
        boolean boolean15 = point5.dominates(point13);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        int int19 = point18.getY();
        boolean boolean20 = point5.dominates(point18);
        int int21 = point18.getY();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean7 = point3.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point3 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList9 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList9, pointArray8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList12 = skylineAlgorithm11.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm0.produceFinalSkyLine(pointList9, pointList12);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList16 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList17 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList18 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList19 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm20 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm21 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean28 = point24.dominates(point27);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray29 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point24 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList30 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList30, pointArray29);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm32 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList33 = skylineAlgorithm32.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList34 = skylineAlgorithm21.produceFinalSkyLine(pointList30, pointList33);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList35 = skylineAlgorithm20.produceSubSkyLines(pointList30);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList36 = skylineAlgorithm0.produceSubSkyLines(pointList30);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point40 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean44 = point40.dominates(point43);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray45 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point40 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList46, pointArray45);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm48 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList49 = skylineAlgorithm48.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList50 = skylineAlgorithm37.produceFinalSkyLine(pointList46, pointList49);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm51 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point54 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point57 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean58 = point54.dominates(point57);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray59 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point54 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList60 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList60, pointArray59);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm62 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList63 = skylineAlgorithm62.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList64 = skylineAlgorithm51.produceFinalSkyLine(pointList60, pointList63);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm65 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point68 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point71 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean72 = point68.dominates(point71);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray73 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point68 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList74 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList74, pointArray73);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm76 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList77 = skylineAlgorithm76.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList78 = skylineAlgorithm65.produceFinalSkyLine(pointList74, pointList77);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList79 = skylineAlgorithm37.produceFinalSkyLine(pointList64, pointList74);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList80 = skylineAlgorithm0.produceSubSkyLines(pointList64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pointArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pointList12);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertNotNull(pointList16);
        org.junit.Assert.assertNotNull(pointList17);
        org.junit.Assert.assertNotNull(pointList18);
        org.junit.Assert.assertNotNull(pointList19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(pointArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(pointList33);
        org.junit.Assert.assertNotNull(pointList34);
        org.junit.Assert.assertNotNull(pointList35);
        org.junit.Assert.assertNotNull(pointList36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(pointArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(pointList49);
        org.junit.Assert.assertNotNull(pointList50);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(pointArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(pointList63);
        org.junit.Assert.assertNotNull(pointList64);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(pointArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(pointList77);
        org.junit.Assert.assertNotNull(pointList78);
        org.junit.Assert.assertNotNull(pointList79);
        org.junit.Assert.assertNotNull(pointList80);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        int int8 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean12 = point5.dominates(point11);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point15 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        boolean boolean16 = point11.dominates(point15);
        int int17 = point15.getY();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList1 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList2 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList3 = skylineAlgorithm0.getPoints();
        org.junit.Assert.assertNotNull(pointList1);
        org.junit.Assert.assertNotNull(pointList2);
        org.junit.Assert.assertNotNull(pointList3);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 100);
        int int3 = point2.getY();
        int int4 = point2.getY();
        int int5 = point2.getX();
        int int6 = point2.getY();
        int int7 = point2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, (int) (byte) 1);
        int int3 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean10 = point6.dominates(point9);
        int int11 = point9.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point17 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean18 = point14.dominates(point17);
        boolean boolean19 = point9.dominates(point17);
        boolean boolean20 = point2.dominates(point9);
        int int21 = point9.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) 'a');
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean7 = point3.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean14 = point10.dominates(point13);
        int int15 = point13.getY();
        int int16 = point13.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        int int24 = point22.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean31 = point27.dominates(point30);
        boolean boolean32 = point22.dominates(point30);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point38 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean39 = point35.dominates(point38);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point45 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean46 = point42.dominates(point45);
        int int47 = point45.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point50 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point53 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean54 = point50.dominates(point53);
        boolean boolean55 = point45.dominates(point53);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point58 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point61 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean62 = point58.dominates(point61);
        int int63 = point61.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point66 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point69 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean70 = point66.dominates(point69);
        boolean boolean71 = point61.dominates(point69);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray72 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point6, point13, point22, point38, point45, point61 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList73 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList73, pointArray72);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList75 = skylineAlgorithm0.produceSubSkyLines(pointList73);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList76 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList77 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList78 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList79 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList80 = skylineAlgorithm0.getPoints();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(pointArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(pointList75);
        org.junit.Assert.assertNotNull(pointList76);
        org.junit.Assert.assertNotNull(pointList77);
        org.junit.Assert.assertNotNull(pointList78);
        org.junit.Assert.assertNotNull(pointList79);
        org.junit.Assert.assertNotNull(pointList80);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 1, 52);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(97, 35);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        int int11 = point8.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(97, 1);
        boolean boolean15 = point8.dominates(point14);
        boolean boolean16 = point2.dominates(point14);
        int int17 = point14.getY();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList1 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point5 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList11 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList11, pointArray10);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm13.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm2.produceFinalSkyLine(pointList11, pointList14);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point19 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList25 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList25, pointArray24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = skylineAlgorithm27.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList29 = skylineAlgorithm16.produceFinalSkyLine(pointList25, pointList28);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList30 = skylineAlgorithm0.produceFinalSkyLine(pointList15, pointList28);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean38 = point34.dominates(point37);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point34 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList40 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList40, pointArray39);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList43 = skylineAlgorithm42.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList44 = skylineAlgorithm31.produceFinalSkyLine(pointList40, pointList43);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList45 = skylineAlgorithm31.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = skylineAlgorithm31.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm47 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point50 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point53 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean54 = point50.dominates(point53);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray55 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point50 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList56 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList56, pointArray55);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm58 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList59 = skylineAlgorithm58.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList60 = skylineAlgorithm47.produceFinalSkyLine(pointList56, pointList59);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm61 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm62 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point65 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point68 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean69 = point65.dominates(point68);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray70 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point65 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList71 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList71, pointArray70);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm73 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList74 = skylineAlgorithm73.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList75 = skylineAlgorithm62.produceFinalSkyLine(pointList71, pointList74);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList76 = skylineAlgorithm61.produceSubSkyLines(pointList71);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList77 = skylineAlgorithm31.produceFinalSkyLine(pointList60, pointList71);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList78 = skylineAlgorithm0.produceSubSkyLines(pointList77);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList79 = skylineAlgorithm0.getPoints();
        java.lang.Class<?> wildcardClass80 = skylineAlgorithm0.getClass();
        org.junit.Assert.assertNotNull(pointList1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(pointArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pointArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(pointList28);
        org.junit.Assert.assertNotNull(pointList29);
        org.junit.Assert.assertNotNull(pointList30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(pointArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(pointList43);
        org.junit.Assert.assertNotNull(pointList44);
        org.junit.Assert.assertNotNull(pointList45);
        org.junit.Assert.assertNotNull(pointList46);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(pointArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(pointList59);
        org.junit.Assert.assertNotNull(pointList60);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(pointArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(pointList74);
        org.junit.Assert.assertNotNull(pointList75);
        org.junit.Assert.assertNotNull(pointList76);
        org.junit.Assert.assertNotNull(pointList77);
        org.junit.Assert.assertNotNull(pointList78);
        org.junit.Assert.assertNotNull(pointList79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(10, 10);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(10, 1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean12 = point8.dominates(point11);
        int int13 = point11.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean20 = point16.dominates(point19);
        boolean boolean21 = point11.dominates(point19);
        int int22 = point19.getX();
        int int23 = point19.getX();
        int int24 = point19.getY();
        boolean boolean25 = point5.dominates(point19);
        boolean boolean26 = point2.dominates(point5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(35, (int) (short) 10);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean7 = point3.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point3 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList9 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList9, pointArray8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList12 = skylineAlgorithm11.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm0.produceFinalSkyLine(pointList9, pointList12);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList16 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList17 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList18 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList19 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList20 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList21 = skylineAlgorithm0.getPoints();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pointArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pointList12);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertNotNull(pointList16);
        org.junit.Assert.assertNotNull(pointList17);
        org.junit.Assert.assertNotNull(pointList18);
        org.junit.Assert.assertNotNull(pointList19);
        org.junit.Assert.assertNotNull(pointList20);
        org.junit.Assert.assertNotNull(pointList21);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) 10, 10);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) 0, (int) '4');
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm1 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point4 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean8 = point4.dominates(point7);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point4 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList10 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList10, pointArray9);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm12.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm1.produceFinalSkyLine(pointList10, pointList13);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm0.produceSubSkyLines(pointList10);
        java.lang.Class<?> wildcardClass16 = pointList15.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pointArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean7 = point3.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point3 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList9 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList9, pointArray8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList12 = skylineAlgorithm11.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm0.produceFinalSkyLine(pointList9, pointList12);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point17 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point20 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean21 = point17.dominates(point20);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point17 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList23 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList23, pointArray22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm25 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList26 = skylineAlgorithm25.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList27 = skylineAlgorithm14.produceFinalSkyLine(pointList23, pointList26);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm28 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean35 = point31.dominates(point34);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray36 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point31 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList37 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList37, pointArray36);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList40 = skylineAlgorithm39.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList41 = skylineAlgorithm28.produceFinalSkyLine(pointList37, pointList40);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList42 = skylineAlgorithm0.produceFinalSkyLine(pointList27, pointList37);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point46 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point49 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean50 = point46.dominates(point49);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray51 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point46 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList52 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList52, pointArray51);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm54 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList55 = skylineAlgorithm54.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList56 = skylineAlgorithm43.produceFinalSkyLine(pointList52, pointList55);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList57 = skylineAlgorithm0.produceSubSkyLines(pointList52);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList58 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList59 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList60 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList61 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList62 = skylineAlgorithm0.getPoints();
        java.lang.Class<?> wildcardClass63 = pointList62.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pointArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pointList12);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(pointArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(pointList26);
        org.junit.Assert.assertNotNull(pointList27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(pointArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(pointList40);
        org.junit.Assert.assertNotNull(pointList41);
        org.junit.Assert.assertNotNull(pointList42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(pointArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(pointList55);
        org.junit.Assert.assertNotNull(pointList56);
        org.junit.Assert.assertNotNull(pointList57);
        org.junit.Assert.assertNotNull(pointList58);
        org.junit.Assert.assertNotNull(pointList59);
        org.junit.Assert.assertNotNull(pointList60);
        org.junit.Assert.assertNotNull(pointList61);
        org.junit.Assert.assertNotNull(pointList62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(32, (int) (byte) 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean17 = point13.dominates(point16);
        boolean boolean18 = point8.dominates(point16);
        int int19 = point16.getX();
        int int20 = point16.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point23 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean27 = point23.dominates(point26);
        int int28 = point26.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean35 = point31.dominates(point34);
        boolean boolean36 = point26.dominates(point34);
        int int37 = point34.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point40 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int41 = point40.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point44 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point47 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean48 = point44.dominates(point47);
        int int49 = point44.getX();
        boolean boolean50 = point40.dominates(point44);
        boolean boolean51 = point34.dominates(point40);
        int int52 = point40.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point55 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point58 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean59 = point55.dominates(point58);
        int int60 = point58.getY();
        int int61 = point58.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point64 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean65 = point58.dominates(point64);
        boolean boolean66 = point40.dominates(point58);
        boolean boolean67 = point16.dominates(point58);
        int int68 = point58.getX();
        boolean boolean69 = point2.dominates(point58);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point72 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point75 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean76 = point72.dominates(point75);
        int int77 = point75.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point80 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point83 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean84 = point80.dominates(point83);
        boolean boolean85 = point75.dominates(point83);
        boolean boolean86 = point58.dominates(point83);
        int int87 = point58.getX();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        int int8 = point5.getY();
        int int9 = point5.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int13 = point12.getX();
        int int14 = point12.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point17 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int18 = point17.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point21 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean25 = point21.dominates(point24);
        int int26 = point21.getX();
        boolean boolean27 = point17.dominates(point21);
        int int28 = point17.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean35 = point31.dominates(point34);
        int int36 = point34.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean43 = point39.dominates(point42);
        boolean boolean44 = point34.dominates(point42);
        int int45 = point42.getX();
        int int46 = point42.getX();
        boolean boolean47 = point17.dominates(point42);
        int int48 = point17.getX();
        boolean boolean49 = point12.dominates(point17);
        boolean boolean50 = point5.dominates(point17);
        int int51 = point17.getX();
        int int52 = point17.getX();
        int int53 = point17.getX();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int3 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean10 = point6.dominates(point9);
        int int11 = point6.getX();
        boolean boolean12 = point2.dominates(point6);
        int int13 = point6.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 100, (int) (short) -1);
        boolean boolean17 = point6.dominates(point16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) 10, 52);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, 0);
        int int3 = point2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        int int8 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean12 = point5.dominates(point11);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point15 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 10);
        boolean boolean16 = point5.dominates(point15);
        int int17 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point20 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        int int21 = point20.getX();
        boolean boolean22 = point5.dominates(point20);
        int int23 = point20.getX();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 100, 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int6 = point5.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean13 = point9.dominates(point12);
        int int14 = point9.getX();
        boolean boolean15 = point5.dominates(point9);
        int int16 = point9.getX();
        int int17 = point9.getY();
        int int18 = point9.getY();
        boolean boolean19 = point2.dominates(point9);
        int int20 = point9.getX();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        int int3 = point2.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        boolean boolean7 = point2.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean14 = point10.dominates(point13);
        int int15 = point13.getY();
        int int16 = point13.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean20 = point13.dominates(point19);
        boolean boolean21 = point2.dominates(point13);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        int int25 = point24.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point28 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        boolean boolean29 = point24.dominates(point28);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point32 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean36 = point32.dominates(point35);
        int int37 = point35.getY();
        int int38 = point35.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point41 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean42 = point35.dominates(point41);
        boolean boolean43 = point24.dominates(point35);
        boolean boolean44 = point2.dominates(point24);
        int int45 = point24.getX();
        java.lang.Class<?> wildcardClass46 = point24.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean14 = point10.dominates(point13);
        boolean boolean15 = point5.dominates(point13);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point21 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean22 = point18.dominates(point21);
        boolean boolean23 = point13.dominates(point21);
        int int24 = point21.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean31 = point27.dominates(point30);
        int int32 = point30.getY();
        int int33 = point30.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point36 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean37 = point30.dominates(point36);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point40 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 10);
        boolean boolean41 = point30.dominates(point40);
        int int42 = point30.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point45 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point48 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean49 = point45.dominates(point48);
        boolean boolean50 = point30.dominates(point45);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point53 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int54 = point53.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point57 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point60 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean61 = point57.dominates(point60);
        int int62 = point57.getX();
        boolean boolean63 = point53.dominates(point57);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point66 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int67 = point66.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point70 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point73 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean74 = point70.dominates(point73);
        int int75 = point70.getX();
        boolean boolean76 = point66.dominates(point70);
        int int77 = point70.getX();
        boolean boolean78 = point53.dominates(point70);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point81 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int82 = point81.getX();
        int int83 = point81.getY();
        boolean boolean84 = point53.dominates(point81);
        boolean boolean85 = point30.dominates(point53);
        boolean boolean86 = point21.dominates(point53);
        int int87 = point21.getY();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 52 + "'", int83 == 52);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point2.getX();
        int int8 = point2.getX();
        int int9 = point2.getX();
        int int10 = point2.getX();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(97, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        int int3 = point2.getX();
        int int4 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean11 = point7.dominates(point10);
        int int12 = point10.getY();
        int int13 = point10.getX();
        boolean boolean14 = point2.dominates(point10);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point17 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, (-1));
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point20 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) ' ', 97);
        boolean boolean21 = point17.dominates(point20);
        int int22 = point20.getY();
        boolean boolean23 = point10.dominates(point20);
        int int24 = point10.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean7 = point3.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point3 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList9 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList9, pointArray8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList12 = skylineAlgorithm11.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm0.produceFinalSkyLine(pointList9, pointList12);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point19 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList25 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList25, pointArray24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = skylineAlgorithm27.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList29 = skylineAlgorithm16.produceFinalSkyLine(pointList25, pointList28);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean38 = point34.dominates(point37);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point34 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList40 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList40, pointArray39);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList43 = skylineAlgorithm42.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList44 = skylineAlgorithm31.produceFinalSkyLine(pointList40, pointList43);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList45 = skylineAlgorithm30.produceSubSkyLines(pointList40);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = skylineAlgorithm0.produceFinalSkyLine(pointList29, pointList40);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList47 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm48 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point51 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point54 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean55 = point51.dominates(point54);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray56 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point51 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList57 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList57, pointArray56);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm59 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList60 = skylineAlgorithm59.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList61 = skylineAlgorithm48.produceFinalSkyLine(pointList57, pointList60);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList62 = skylineAlgorithm48.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList63 = skylineAlgorithm48.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList64 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList65 = skylineAlgorithm0.produceFinalSkyLine(pointList63, pointList64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pointArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pointList12);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pointArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(pointList28);
        org.junit.Assert.assertNotNull(pointList29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(pointArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(pointList43);
        org.junit.Assert.assertNotNull(pointList44);
        org.junit.Assert.assertNotNull(pointList45);
        org.junit.Assert.assertNotNull(pointList46);
        org.junit.Assert.assertNotNull(pointList47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(pointArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(pointList60);
        org.junit.Assert.assertNotNull(pointList61);
        org.junit.Assert.assertNotNull(pointList62);
        org.junit.Assert.assertNotNull(pointList63);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (byte) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        int int11 = point8.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean15 = point8.dominates(point14);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 10);
        boolean boolean19 = point8.dominates(point18);
        int int20 = point18.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point23 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        int int24 = point23.getX();
        int int25 = point23.getX();
        int int26 = point23.getX();
        int int27 = point23.getY();
        boolean boolean28 = point18.dominates(point23);
        boolean boolean29 = point2.dominates(point23);
        int int30 = point2.getX();
        java.lang.Class<?> wildcardClass31 = point2.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) ' ', (int) (byte) -1);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        int int8 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean12 = point5.dominates(point11);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point15 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, (int) 'a');
        int int16 = point15.getY();
        boolean boolean17 = point11.dominates(point15);
        int int18 = point15.getY();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) ' ', (int) (short) -1);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '#', (-1));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, 10);
        int int3 = point2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '#', 35);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        int int3 = point2.getY();
        int int4 = point2.getY();
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, (-1));
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) ' ', 97);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        int int8 = point5.getX();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) 'a', (int) (byte) 100);
        int int3 = point2.getX();
        int int4 = point2.getX();
        int int5 = point2.getY();
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        int int3 = point2.getX();
        int int4 = point2.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(97, 1);
        boolean boolean8 = point2.dominates(point7);
        java.lang.Class<?> wildcardClass9 = point7.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        int int11 = point8.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean15 = point8.dominates(point14);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, (int) ' ');
        boolean boolean19 = point8.dominates(point18);
        int int20 = point18.getX();
        int int21 = point18.getY();
        int int22 = point18.getY();
        boolean boolean23 = point2.dominates(point18);
        int int24 = point2.getY();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) 'a', (int) (byte) 100);
        int int3 = point2.getX();
        int int4 = point2.getX();
        int int5 = point2.getY();
        int int6 = point2.getY();
        int int7 = point2.getX();
        int int8 = point2.getY();
        int int9 = point2.getX();
        int int10 = point2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(35, (int) (short) 0);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) '#');
        int int3 = point2.getY();
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        int int3 = point2.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        boolean boolean7 = point2.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(35, 0);
        boolean boolean11 = point2.dominates(point10);
        int int12 = point10.getY();
        java.lang.Class<?> wildcardClass13 = point10.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        int int8 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean12 = point5.dominates(point11);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point15 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 10);
        boolean boolean16 = point5.dominates(point15);
        int int17 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point20 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        int int21 = point20.getX();
        boolean boolean22 = point5.dominates(point20);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point25 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(35, (int) (short) -1);
        boolean boolean26 = point5.dominates(point25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        int int3 = point2.getX();
        int int4 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean11 = point7.dominates(point10);
        int int12 = point10.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point15 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean19 = point15.dominates(point18);
        boolean boolean20 = point10.dominates(point18);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point23 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean27 = point23.dominates(point26);
        boolean boolean28 = point18.dominates(point26);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '#', (int) (short) 1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean38 = point34.dominates(point37);
        int int39 = point37.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point45 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean46 = point42.dominates(point45);
        boolean boolean47 = point37.dominates(point45);
        boolean boolean48 = point31.dominates(point45);
        boolean boolean49 = point26.dominates(point45);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point52 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, (int) (byte) 1);
        int int53 = point52.getY();
        boolean boolean54 = point45.dominates(point52);
        boolean boolean55 = point2.dominates(point52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 10);
        int int3 = point2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point5.getX();
        boolean boolean11 = point2.dominates(point5);
        int int12 = point5.getY();
        int int13 = point5.getY();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) ' ', 97);
        int int3 = point2.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((-1), (int) (short) 10);
        boolean boolean7 = point2.dominates(point6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 100, 0);
        int int3 = point2.getY();
        int int4 = point2.getY();
        int int5 = point2.getX();
        int int6 = point2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) -1, (int) (byte) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean17 = point13.dominates(point16);
        boolean boolean18 = point8.dominates(point16);
        int int19 = point16.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int23 = point22.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point29 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean30 = point26.dominates(point29);
        int int31 = point26.getX();
        boolean boolean32 = point22.dominates(point26);
        boolean boolean33 = point16.dominates(point22);
        boolean boolean34 = point2.dominates(point16);
        int int35 = point16.getY();
        int int36 = point16.getX();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(100, (int) (byte) 0);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 100, 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int6 = point5.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean13 = point9.dominates(point12);
        int int14 = point9.getX();
        boolean boolean15 = point5.dominates(point9);
        int int16 = point9.getX();
        int int17 = point9.getY();
        int int18 = point9.getY();
        boolean boolean19 = point2.dominates(point9);
        java.lang.Class<?> wildcardClass20 = point2.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int3 = point2.getX();
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int3 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean10 = point6.dominates(point9);
        int int11 = point6.getX();
        boolean boolean12 = point2.dominates(point6);
        int int13 = point6.getX();
        int int14 = point6.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point17 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        int int18 = point17.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point21 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        boolean boolean22 = point17.dominates(point21);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point25 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point28 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean29 = point25.dominates(point28);
        int int30 = point28.getY();
        int int31 = point28.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean35 = point28.dominates(point34);
        boolean boolean36 = point17.dominates(point28);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        int int40 = point39.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        boolean boolean44 = point39.dominates(point43);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point47 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point50 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean51 = point47.dominates(point50);
        int int52 = point50.getY();
        int int53 = point50.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point56 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean57 = point50.dominates(point56);
        boolean boolean58 = point39.dominates(point50);
        boolean boolean59 = point17.dominates(point39);
        boolean boolean60 = point6.dominates(point39);
        int int61 = point6.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm1 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point4 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean8 = point4.dominates(point7);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point4 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList10 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList10, pointArray9);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm12.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm1.produceFinalSkyLine(pointList10, pointList13);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm0.produceSubSkyLines(pointList10);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point19 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList25 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList25, pointArray24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = skylineAlgorithm27.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList29 = skylineAlgorithm16.produceFinalSkyLine(pointList25, pointList28);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList30 = skylineAlgorithm0.produceSubSkyLines(pointList29);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList31 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm32 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point38 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean39 = point35.dominates(point38);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray40 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point35 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList41 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList41, pointArray40);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList44 = skylineAlgorithm43.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList45 = skylineAlgorithm32.produceFinalSkyLine(pointList41, pointList44);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm46 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm47 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point50 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point53 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean54 = point50.dominates(point53);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray55 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point50 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList56 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList56, pointArray55);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm58 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList59 = skylineAlgorithm58.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList60 = skylineAlgorithm47.produceFinalSkyLine(pointList56, pointList59);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList61 = skylineAlgorithm46.produceSubSkyLines(pointList56);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm62 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList63 = skylineAlgorithm62.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList64 = skylineAlgorithm32.produceFinalSkyLine(pointList61, pointList63);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList65 = skylineAlgorithm0.produceSubSkyLines(pointList64);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pointArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pointArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(pointList28);
        org.junit.Assert.assertNotNull(pointList29);
        org.junit.Assert.assertNotNull(pointList30);
        org.junit.Assert.assertNotNull(pointList31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(pointArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(pointList44);
        org.junit.Assert.assertNotNull(pointList45);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(pointArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(pointList59);
        org.junit.Assert.assertNotNull(pointList60);
        org.junit.Assert.assertNotNull(pointList61);
        org.junit.Assert.assertNotNull(pointList63);
        org.junit.Assert.assertNotNull(pointList64);
        org.junit.Assert.assertNotNull(pointList65);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean14 = point10.dominates(point13);
        boolean boolean15 = point5.dominates(point13);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point21 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean22 = point18.dominates(point21);
        boolean boolean23 = point13.dominates(point21);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '#', (int) (short) 1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point29 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point32 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean33 = point29.dominates(point32);
        int int34 = point32.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point40 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean41 = point37.dominates(point40);
        boolean boolean42 = point32.dominates(point40);
        boolean boolean43 = point26.dominates(point40);
        boolean boolean44 = point21.dominates(point40);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point47 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, (int) (byte) 1);
        int int48 = point47.getY();
        boolean boolean49 = point40.dominates(point47);
        int int50 = point47.getY();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) 10, 0);
        int int3 = point2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) 0);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 1, (-1));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(97, 10);
        int int3 = point2.getX();
        int int4 = point2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 10, (int) ' ');
        int int3 = point2.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int7 = point6.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean14 = point10.dominates(point13);
        int int15 = point10.getX();
        boolean boolean16 = point6.dominates(point10);
        int int17 = point10.getX();
        boolean boolean18 = point2.dominates(point10);
        java.lang.Class<?> wildcardClass19 = point10.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '#', 0);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) -1, (int) '#');
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 100);
        int int6 = point5.getY();
        int int7 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '#', (int) (short) 1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean17 = point13.dominates(point16);
        int int18 = point16.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point21 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean25 = point21.dominates(point24);
        boolean boolean26 = point16.dominates(point24);
        boolean boolean27 = point10.dominates(point24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        int int31 = point30.getX();
        int int32 = point30.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point38 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean39 = point35.dominates(point38);
        int int40 = point38.getY();
        int int41 = point38.getX();
        boolean boolean42 = point30.dominates(point38);
        boolean boolean43 = point24.dominates(point38);
        boolean boolean44 = point5.dominates(point24);
        int int45 = point5.getX();
        boolean boolean46 = point2.dominates(point5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean14 = point10.dominates(point13);
        boolean boolean15 = point5.dominates(point13);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        int int19 = point18.getY();
        boolean boolean20 = point5.dominates(point18);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point23 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point29 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean30 = point26.dominates(point29);
        int int31 = point26.getX();
        boolean boolean32 = point23.dominates(point26);
        boolean boolean33 = point18.dominates(point23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm1 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point4 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean8 = point4.dominates(point7);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point4 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList10 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList10, pointArray9);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm12.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm1.produceFinalSkyLine(pointList10, pointList13);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm0.produceSubSkyLines(pointList10);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList16 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList17 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList18 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point25 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean26 = point22.dominates(point25);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point22 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList28, pointArray27);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList31 = skylineAlgorithm30.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList32 = skylineAlgorithm19.produceFinalSkyLine(pointList28, pointList31);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList33 = skylineAlgorithm19.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList34 = skylineAlgorithm19.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList35 = skylineAlgorithm19.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList36 = skylineAlgorithm19.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList37 = skylineAlgorithm19.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList38 = skylineAlgorithm19.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm40 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point46 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean47 = point43.dominates(point46);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray48 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point43 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList49 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList49, pointArray48);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm51 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList52 = skylineAlgorithm51.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList53 = skylineAlgorithm40.produceFinalSkyLine(pointList49, pointList52);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList54 = skylineAlgorithm39.produceSubSkyLines(pointList49);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList55 = skylineAlgorithm19.produceSubSkyLines(pointList49);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm56 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm57 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point60 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point63 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean64 = point60.dominates(point63);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray65 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point60 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList66 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList66, pointArray65);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm68 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList69 = skylineAlgorithm68.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList70 = skylineAlgorithm57.produceFinalSkyLine(pointList66, pointList69);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList71 = skylineAlgorithm56.produceSubSkyLines(pointList66);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm72 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point75 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point78 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean79 = point75.dominates(point78);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray80 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point75 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList81 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList81, pointArray80);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm83 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList84 = skylineAlgorithm83.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList85 = skylineAlgorithm72.produceFinalSkyLine(pointList81, pointList84);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList86 = skylineAlgorithm56.produceSubSkyLines(pointList85);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList87 = skylineAlgorithm0.produceFinalSkyLine(pointList55, pointList86);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList88 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList89 = skylineAlgorithm0.getPoints();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pointArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertNotNull(pointList16);
        org.junit.Assert.assertNotNull(pointList17);
        org.junit.Assert.assertNotNull(pointList18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(pointArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(pointList31);
        org.junit.Assert.assertNotNull(pointList32);
        org.junit.Assert.assertNotNull(pointList33);
        org.junit.Assert.assertNotNull(pointList34);
        org.junit.Assert.assertNotNull(pointList35);
        org.junit.Assert.assertNotNull(pointList36);
        org.junit.Assert.assertNotNull(pointList37);
        org.junit.Assert.assertNotNull(pointList38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(pointArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(pointList52);
        org.junit.Assert.assertNotNull(pointList53);
        org.junit.Assert.assertNotNull(pointList54);
        org.junit.Assert.assertNotNull(pointList55);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(pointArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(pointList69);
        org.junit.Assert.assertNotNull(pointList70);
        org.junit.Assert.assertNotNull(pointList71);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(pointArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(pointList84);
        org.junit.Assert.assertNotNull(pointList85);
        org.junit.Assert.assertNotNull(pointList86);
        org.junit.Assert.assertNotNull(pointList87);
        org.junit.Assert.assertNotNull(pointList88);
        org.junit.Assert.assertNotNull(pointList89);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int3 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean10 = point6.dominates(point9);
        int int11 = point6.getX();
        boolean boolean12 = point2.dominates(point6);
        int int13 = point2.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean20 = point16.dominates(point19);
        int int21 = point19.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean28 = point24.dominates(point27);
        boolean boolean29 = point19.dominates(point27);
        int int30 = point27.getX();
        int int31 = point27.getX();
        boolean boolean32 = point2.dominates(point27);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point38 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean39 = point35.dominates(point38);
        int int40 = point38.getY();
        int int41 = point38.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point44 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        boolean boolean45 = point38.dominates(point44);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point48 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point51 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean52 = point48.dominates(point51);
        int int53 = point51.getY();
        int int54 = point51.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point57 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean58 = point51.dominates(point57);
        boolean boolean59 = point38.dominates(point51);
        boolean boolean60 = point2.dominates(point38);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point63 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point66 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean67 = point63.dominates(point66);
        int int68 = point66.getY();
        int int69 = point66.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point72 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        boolean boolean73 = point66.dominates(point72);
        int int74 = point66.getY();
        boolean boolean75 = point2.dominates(point66);
        int int76 = point2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean7 = point3.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point3 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList9 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList9, pointArray8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList12 = skylineAlgorithm11.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm0.produceFinalSkyLine(pointList9, pointList12);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point19 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList25 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList25, pointArray24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = skylineAlgorithm27.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList29 = skylineAlgorithm16.produceFinalSkyLine(pointList25, pointList28);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList30 = skylineAlgorithm0.produceSubSkyLines(pointList25);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList31 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm32 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList33 = skylineAlgorithm32.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point40 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean41 = point37.dominates(point40);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point37 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList43 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList43, pointArray42);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm45 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = skylineAlgorithm45.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList47 = skylineAlgorithm34.produceFinalSkyLine(pointList43, pointList46);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm48 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point51 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point54 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean55 = point51.dominates(point54);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray56 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point51 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList57 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList57, pointArray56);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm59 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList60 = skylineAlgorithm59.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList61 = skylineAlgorithm48.produceFinalSkyLine(pointList57, pointList60);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList62 = skylineAlgorithm32.produceFinalSkyLine(pointList47, pointList60);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm63 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm64 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point67 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point70 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean71 = point67.dominates(point70);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray72 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point67 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList73 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList73, pointArray72);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm75 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList76 = skylineAlgorithm75.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList77 = skylineAlgorithm64.produceFinalSkyLine(pointList73, pointList76);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList78 = skylineAlgorithm63.produceSubSkyLines(pointList73);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm79 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point82 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point85 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean86 = point82.dominates(point85);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray87 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point82 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList88 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList88, pointArray87);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm90 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList91 = skylineAlgorithm90.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList92 = skylineAlgorithm79.produceFinalSkyLine(pointList88, pointList91);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList93 = skylineAlgorithm63.produceSubSkyLines(pointList92);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList94 = skylineAlgorithm32.produceSubSkyLines(pointList92);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList95 = skylineAlgorithm0.produceSubSkyLines(pointList94);
        java.lang.Class<?> wildcardClass96 = pointList94.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pointArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pointList12);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pointArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(pointList28);
        org.junit.Assert.assertNotNull(pointList29);
        org.junit.Assert.assertNotNull(pointList30);
        org.junit.Assert.assertNotNull(pointList31);
        org.junit.Assert.assertNotNull(pointList33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(pointArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(pointList46);
        org.junit.Assert.assertNotNull(pointList47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(pointArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(pointList60);
        org.junit.Assert.assertNotNull(pointList61);
        org.junit.Assert.assertNotNull(pointList62);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(pointArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(pointList76);
        org.junit.Assert.assertNotNull(pointList77);
        org.junit.Assert.assertNotNull(pointList78);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(pointArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(pointList91);
        org.junit.Assert.assertNotNull(pointList92);
        org.junit.Assert.assertNotNull(pointList93);
        org.junit.Assert.assertNotNull(pointList94);
        org.junit.Assert.assertNotNull(pointList95);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(35, (int) (byte) 1);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int3 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean10 = point6.dominates(point9);
        int int11 = point6.getX();
        boolean boolean12 = point2.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point15 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int16 = point15.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        int int24 = point19.getX();
        boolean boolean25 = point15.dominates(point19);
        int int26 = point19.getX();
        boolean boolean27 = point2.dominates(point19);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int31 = point30.getX();
        int int32 = point30.getY();
        boolean boolean33 = point2.dominates(point30);
        int int34 = point30.getX();
        int int35 = point30.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 100);
        int int3 = point2.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 1, 1);
        boolean boolean7 = point2.dominates(point6);
        int int8 = point2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList1 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point5 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList11 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList11, pointArray10);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm13.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm2.produceFinalSkyLine(pointList11, pointList14);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point19 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList25 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList25, pointArray24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = skylineAlgorithm27.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList29 = skylineAlgorithm16.produceFinalSkyLine(pointList25, pointList28);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList30 = skylineAlgorithm0.produceFinalSkyLine(pointList15, pointList28);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList31 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm32 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList33 = skylineAlgorithm32.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point40 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean41 = point37.dominates(point40);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point37 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList43 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList43, pointArray42);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm45 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = skylineAlgorithm45.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList47 = skylineAlgorithm34.produceFinalSkyLine(pointList43, pointList46);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm48 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point51 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point54 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean55 = point51.dominates(point54);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray56 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point51 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList57 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList57, pointArray56);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm59 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList60 = skylineAlgorithm59.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList61 = skylineAlgorithm48.produceFinalSkyLine(pointList57, pointList60);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList62 = skylineAlgorithm32.produceFinalSkyLine(pointList47, pointList60);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm63 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm64 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point67 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point70 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean71 = point67.dominates(point70);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray72 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point67 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList73 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList73, pointArray72);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm75 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList76 = skylineAlgorithm75.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList77 = skylineAlgorithm64.produceFinalSkyLine(pointList73, pointList76);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList78 = skylineAlgorithm63.produceSubSkyLines(pointList73);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm79 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point82 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point85 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean86 = point82.dominates(point85);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray87 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point82 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList88 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList88, pointArray87);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm90 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList91 = skylineAlgorithm90.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList92 = skylineAlgorithm79.produceFinalSkyLine(pointList88, pointList91);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList93 = skylineAlgorithm63.produceSubSkyLines(pointList92);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList94 = skylineAlgorithm32.produceSubSkyLines(pointList92);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList95 = skylineAlgorithm0.produceSubSkyLines(pointList92);
        java.lang.Class<?> wildcardClass96 = pointList95.getClass();
        org.junit.Assert.assertNotNull(pointList1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(pointArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pointArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(pointList28);
        org.junit.Assert.assertNotNull(pointList29);
        org.junit.Assert.assertNotNull(pointList30);
        org.junit.Assert.assertNotNull(pointList31);
        org.junit.Assert.assertNotNull(pointList33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(pointArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(pointList46);
        org.junit.Assert.assertNotNull(pointList47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(pointArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(pointList60);
        org.junit.Assert.assertNotNull(pointList61);
        org.junit.Assert.assertNotNull(pointList62);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(pointArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(pointList76);
        org.junit.Assert.assertNotNull(pointList77);
        org.junit.Assert.assertNotNull(pointList78);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(pointArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(pointList91);
        org.junit.Assert.assertNotNull(pointList92);
        org.junit.Assert.assertNotNull(pointList93);
        org.junit.Assert.assertNotNull(pointList94);
        org.junit.Assert.assertNotNull(pointList95);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean7 = point3.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point3 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList9 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList9, pointArray8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList12 = skylineAlgorithm11.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm0.produceFinalSkyLine(pointList9, pointList12);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm15 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point21 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean22 = point18.dominates(point21);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray23 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point18 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList24 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList24, pointArray23);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList27 = skylineAlgorithm26.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = skylineAlgorithm15.produceFinalSkyLine(pointList24, pointList27);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList29 = skylineAlgorithm14.produceSubSkyLines(pointList24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList31 = skylineAlgorithm30.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList32 = skylineAlgorithm0.produceFinalSkyLine(pointList29, pointList31);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList33 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point40 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean41 = point37.dominates(point40);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point37 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList43 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList43, pointArray42);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm45 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = skylineAlgorithm45.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList47 = skylineAlgorithm34.produceFinalSkyLine(pointList43, pointList46);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm48 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point51 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point54 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean55 = point51.dominates(point54);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray56 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point51 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList57 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList57, pointArray56);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm59 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList60 = skylineAlgorithm59.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList61 = skylineAlgorithm48.produceFinalSkyLine(pointList57, pointList60);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm62 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point65 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point68 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean69 = point65.dominates(point68);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray70 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point65 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList71 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList71, pointArray70);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm73 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList74 = skylineAlgorithm73.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList75 = skylineAlgorithm62.produceFinalSkyLine(pointList71, pointList74);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList76 = skylineAlgorithm34.produceFinalSkyLine(pointList61, pointList71);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList77 = skylineAlgorithm0.produceSubSkyLines(pointList76);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pointArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pointList12);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(pointArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(pointList27);
        org.junit.Assert.assertNotNull(pointList28);
        org.junit.Assert.assertNotNull(pointList29);
        org.junit.Assert.assertNotNull(pointList31);
        org.junit.Assert.assertNotNull(pointList32);
        org.junit.Assert.assertNotNull(pointList33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(pointArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(pointList46);
        org.junit.Assert.assertNotNull(pointList47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(pointArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(pointList60);
        org.junit.Assert.assertNotNull(pointList61);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(pointArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(pointList74);
        org.junit.Assert.assertNotNull(pointList75);
        org.junit.Assert.assertNotNull(pointList76);
        org.junit.Assert.assertNotNull(pointList77);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean14 = point10.dominates(point13);
        boolean boolean15 = point5.dominates(point13);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        int int19 = point18.getY();
        boolean boolean20 = point5.dominates(point18);
        int int21 = point18.getX();
        java.lang.Class<?> wildcardClass22 = point18.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int3 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean10 = point6.dominates(point9);
        int int11 = point6.getX();
        boolean boolean12 = point2.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point15 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int16 = point15.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        int int24 = point19.getX();
        boolean boolean25 = point15.dominates(point19);
        int int26 = point19.getX();
        boolean boolean27 = point2.dominates(point19);
        int int28 = point2.getY();
        int int29 = point2.getY();
        int int30 = point2.getY();
        java.lang.Class<?> wildcardClass31 = point2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) 'a', (int) 'a');
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '#', (int) (short) 1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        boolean boolean6 = point2.dominates(point5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        int int8 = point5.getY();
        int int9 = point5.getX();
        java.lang.Class<?> wildcardClass10 = point5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((-1), (int) '4');
        int int3 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        int int7 = point6.getY();
        boolean boolean8 = point2.dominates(point6);
        int int9 = point6.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean14 = point10.dominates(point13);
        boolean boolean15 = point5.dominates(point13);
        int int16 = point13.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int20 = point19.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point23 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean27 = point23.dominates(point26);
        int int28 = point23.getX();
        boolean boolean29 = point19.dominates(point23);
        boolean boolean30 = point13.dominates(point19);
        int int31 = point13.getX();
        int int32 = point13.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        int int36 = point35.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        boolean boolean40 = point35.dominates(point39);
        boolean boolean41 = point13.dominates(point35);
        int int42 = point35.getY();
        int int43 = point35.getY();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList1 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean10 = point6.dominates(point9);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point6 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList12 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList12, pointArray11);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm14.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList16 = skylineAlgorithm3.produceFinalSkyLine(pointList12, pointList15);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList17 = skylineAlgorithm2.produceSubSkyLines(pointList12);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList18 = skylineAlgorithm2.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList19 = skylineAlgorithm2.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm20 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point23 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean27 = point23.dominates(point26);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray28 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point23 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList29 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList29, pointArray28);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList32 = skylineAlgorithm31.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList33 = skylineAlgorithm20.produceFinalSkyLine(pointList29, pointList32);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point40 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean41 = point37.dominates(point40);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point37 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList43 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList43, pointArray42);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm45 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = skylineAlgorithm45.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList47 = skylineAlgorithm34.produceFinalSkyLine(pointList43, pointList46);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm48 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm49 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point52 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point55 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean56 = point52.dominates(point55);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray57 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point52 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList58 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList58, pointArray57);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm60 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList61 = skylineAlgorithm60.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList62 = skylineAlgorithm49.produceFinalSkyLine(pointList58, pointList61);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList63 = skylineAlgorithm48.produceSubSkyLines(pointList58);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm64 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point67 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point70 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean71 = point67.dominates(point70);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray72 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point67 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList73 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList73, pointArray72);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm75 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList76 = skylineAlgorithm75.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList77 = skylineAlgorithm64.produceFinalSkyLine(pointList73, pointList76);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList78 = skylineAlgorithm48.produceSubSkyLines(pointList77);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList79 = skylineAlgorithm20.produceFinalSkyLine(pointList43, pointList77);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList80 = skylineAlgorithm2.produceSubSkyLines(pointList79);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList81 = skylineAlgorithm0.produceSubSkyLines(pointList80);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList82 = skylineAlgorithm0.getPoints();
        org.junit.Assert.assertNotNull(pointList1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(pointArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertNotNull(pointList16);
        org.junit.Assert.assertNotNull(pointList17);
        org.junit.Assert.assertNotNull(pointList18);
        org.junit.Assert.assertNotNull(pointList19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(pointArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(pointList32);
        org.junit.Assert.assertNotNull(pointList33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(pointArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(pointList46);
        org.junit.Assert.assertNotNull(pointList47);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(pointArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(pointList61);
        org.junit.Assert.assertNotNull(pointList62);
        org.junit.Assert.assertNotNull(pointList63);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(pointArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(pointList76);
        org.junit.Assert.assertNotNull(pointList77);
        org.junit.Assert.assertNotNull(pointList78);
        org.junit.Assert.assertNotNull(pointList79);
        org.junit.Assert.assertNotNull(pointList80);
        org.junit.Assert.assertNotNull(pointList81);
        org.junit.Assert.assertNotNull(pointList82);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean14 = point10.dominates(point13);
        boolean boolean15 = point5.dominates(point13);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 10, (-1));
        boolean boolean19 = point13.dominates(point18);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        int int23 = point22.getX();
        int int24 = point22.getX();
        int int25 = point22.getX();
        int int26 = point22.getY();
        int int27 = point22.getY();
        boolean boolean28 = point13.dominates(point22);
        int int29 = point22.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point32 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int36 = point35.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean43 = point39.dominates(point42);
        int int44 = point39.getX();
        boolean boolean45 = point35.dominates(point39);
        int int46 = point39.getX();
        boolean boolean47 = point32.dominates(point39);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point50 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean51 = point39.dominates(point50);
        boolean boolean52 = point22.dominates(point39);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point55 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point58 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean59 = point55.dominates(point58);
        int int60 = point58.getY();
        int int61 = point58.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point64 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean65 = point58.dominates(point64);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point68 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 10);
        boolean boolean69 = point58.dominates(point68);
        int int70 = point58.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point73 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        int int74 = point73.getX();
        boolean boolean75 = point58.dominates(point73);
        int int76 = point58.getY();
        boolean boolean77 = point39.dominates(point58);
        int int78 = point39.getX();
        java.lang.Class<?> wildcardClass79 = point39.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int3 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean10 = point6.dominates(point9);
        int int11 = point6.getX();
        boolean boolean12 = point2.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point15 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int16 = point15.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        int int24 = point19.getX();
        boolean boolean25 = point15.dominates(point19);
        int int26 = point19.getX();
        boolean boolean27 = point2.dominates(point19);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point33 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean34 = point30.dominates(point33);
        int int35 = point33.getY();
        int int36 = point33.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        boolean boolean40 = point33.dominates(point39);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point46 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean47 = point43.dominates(point46);
        int int48 = point46.getY();
        int int49 = point46.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point52 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean53 = point46.dominates(point52);
        boolean boolean54 = point33.dominates(point46);
        boolean boolean55 = point19.dominates(point46);
        int int56 = point46.getY();
        int int57 = point46.getY();
        int int58 = point46.getX();
        int int59 = point46.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point62 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point65 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean66 = point62.dominates(point65);
        int int67 = point65.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point70 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point73 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean74 = point70.dominates(point73);
        boolean boolean75 = point65.dominates(point73);
        int int76 = point73.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point79 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int80 = point79.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point83 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point86 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean87 = point83.dominates(point86);
        int int88 = point83.getX();
        boolean boolean89 = point79.dominates(point83);
        boolean boolean90 = point73.dominates(point79);
        int int91 = point79.getX();
        boolean boolean92 = point46.dominates(point79);
        int int93 = point46.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int3 = point2.getX();
        int int4 = point2.getY();
        int int5 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 100, 0);
        int int9 = point8.getY();
        boolean boolean10 = point2.dominates(point8);
        int int11 = point8.getX();
        int int12 = point8.getX();
        int int13 = point8.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) 0, 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, 1);
        boolean boolean6 = point2.dominates(point5);
        java.lang.Class<?> wildcardClass7 = point5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList1 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point5 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList11 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList11, pointArray10);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm13.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm2.produceFinalSkyLine(pointList11, pointList14);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point19 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList25 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList25, pointArray24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = skylineAlgorithm27.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList29 = skylineAlgorithm16.produceFinalSkyLine(pointList25, pointList28);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList30 = skylineAlgorithm0.produceFinalSkyLine(pointList15, pointList28);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList31 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm32 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList33 = skylineAlgorithm32.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point40 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean41 = point37.dominates(point40);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point37 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList43 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList43, pointArray42);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm45 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = skylineAlgorithm45.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList47 = skylineAlgorithm34.produceFinalSkyLine(pointList43, pointList46);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm48 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point51 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point54 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean55 = point51.dominates(point54);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray56 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point51 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList57 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList57, pointArray56);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm59 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList60 = skylineAlgorithm59.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList61 = skylineAlgorithm48.produceFinalSkyLine(pointList57, pointList60);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList62 = skylineAlgorithm32.produceFinalSkyLine(pointList47, pointList60);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm63 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm64 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point67 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point70 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean71 = point67.dominates(point70);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray72 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point67 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList73 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList73, pointArray72);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm75 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList76 = skylineAlgorithm75.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList77 = skylineAlgorithm64.produceFinalSkyLine(pointList73, pointList76);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList78 = skylineAlgorithm63.produceSubSkyLines(pointList73);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm79 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point82 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point85 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean86 = point82.dominates(point85);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray87 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point82 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList88 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList88, pointArray87);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm90 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList91 = skylineAlgorithm90.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList92 = skylineAlgorithm79.produceFinalSkyLine(pointList88, pointList91);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList93 = skylineAlgorithm63.produceSubSkyLines(pointList92);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList94 = skylineAlgorithm32.produceSubSkyLines(pointList92);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList95 = skylineAlgorithm0.produceSubSkyLines(pointList92);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList96 = skylineAlgorithm0.getPoints();
        org.junit.Assert.assertNotNull(pointList1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(pointArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pointArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(pointList28);
        org.junit.Assert.assertNotNull(pointList29);
        org.junit.Assert.assertNotNull(pointList30);
        org.junit.Assert.assertNotNull(pointList31);
        org.junit.Assert.assertNotNull(pointList33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(pointArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(pointList46);
        org.junit.Assert.assertNotNull(pointList47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(pointArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(pointList60);
        org.junit.Assert.assertNotNull(pointList61);
        org.junit.Assert.assertNotNull(pointList62);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(pointArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(pointList76);
        org.junit.Assert.assertNotNull(pointList77);
        org.junit.Assert.assertNotNull(pointList78);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(pointArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(pointList91);
        org.junit.Assert.assertNotNull(pointList92);
        org.junit.Assert.assertNotNull(pointList93);
        org.junit.Assert.assertNotNull(pointList94);
        org.junit.Assert.assertNotNull(pointList95);
        org.junit.Assert.assertNotNull(pointList96);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) 'a', 0);
        int int3 = point2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        int int3 = point2.getX();
        int int4 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        int int8 = point7.getX();
        boolean boolean9 = point2.dominates(point7);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) 'a');
        boolean boolean13 = point7.dominates(point12);
        int int14 = point12.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point17 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int18 = point17.getX();
        int int19 = point17.getY();
        int int20 = point17.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point23 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 100, 0);
        int int24 = point23.getY();
        boolean boolean25 = point17.dominates(point23);
        int int26 = point23.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point29 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '#', (int) (byte) -1);
        int int30 = point29.getX();
        boolean boolean31 = point23.dominates(point29);
        boolean boolean32 = point12.dominates(point29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) 0, (int) ' ');
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        int int11 = point8.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        boolean boolean15 = point8.dominates(point14);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 100, 0);
        boolean boolean19 = point8.dominates(point18);
        int int20 = point18.getX();
        boolean boolean21 = point2.dominates(point18);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        int int25 = point24.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point28 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        boolean boolean29 = point24.dominates(point28);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point32 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean36 = point32.dominates(point35);
        int int37 = point35.getY();
        int int38 = point35.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point41 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean42 = point35.dominates(point41);
        boolean boolean43 = point24.dominates(point35);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point46 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        int int47 = point46.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point50 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        boolean boolean51 = point46.dominates(point50);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point54 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point57 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean58 = point54.dominates(point57);
        int int59 = point57.getY();
        int int60 = point57.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point63 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean64 = point57.dominates(point63);
        boolean boolean65 = point46.dominates(point57);
        boolean boolean66 = point24.dominates(point46);
        boolean boolean67 = point2.dominates(point24);
        int int68 = point24.getY();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int3 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean10 = point6.dominates(point9);
        int int11 = point6.getX();
        boolean boolean12 = point2.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point15 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int16 = point15.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        int int24 = point19.getX();
        boolean boolean25 = point15.dominates(point19);
        int int26 = point19.getX();
        boolean boolean27 = point2.dominates(point19);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point33 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean34 = point30.dominates(point33);
        int int35 = point33.getY();
        int int36 = point33.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        boolean boolean40 = point33.dominates(point39);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point46 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean47 = point43.dominates(point46);
        int int48 = point46.getY();
        int int49 = point46.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point52 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean53 = point46.dominates(point52);
        boolean boolean54 = point33.dominates(point46);
        boolean boolean55 = point19.dominates(point46);
        int int56 = point46.getY();
        int int57 = point46.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point60 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int61 = point60.getX();
        int int62 = point60.getY();
        int int63 = point60.getY();
        boolean boolean64 = point46.dominates(point60);
        int int65 = point60.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point68 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point71 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean72 = point68.dominates(point71);
        int int73 = point71.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point76 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point79 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean80 = point76.dominates(point79);
        boolean boolean81 = point71.dominates(point79);
        boolean boolean82 = point60.dominates(point79);
        int int83 = point60.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 52 + "'", int62 == 52);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 52 + "'", int63 == 52);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 52 + "'", int83 == 52);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        int int3 = point2.getX();
        int int4 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean11 = point7.dominates(point10);
        int int12 = point10.getY();
        int int13 = point10.getX();
        boolean boolean14 = point2.dominates(point10);
        int int15 = point2.getX();
        int int16 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        int int24 = point22.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean31 = point27.dominates(point30);
        boolean boolean32 = point22.dominates(point30);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        int int36 = point35.getY();
        boolean boolean37 = point22.dominates(point35);
        boolean boolean38 = point2.dominates(point35);
        java.lang.Class<?> wildcardClass39 = point2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '#', (int) (short) 1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean17 = point13.dominates(point16);
        boolean boolean18 = point8.dominates(point16);
        boolean boolean19 = point2.dominates(point16);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        int int23 = point22.getX();
        int int24 = point22.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean31 = point27.dominates(point30);
        int int32 = point30.getY();
        int int33 = point30.getX();
        boolean boolean34 = point22.dominates(point30);
        boolean boolean35 = point16.dominates(point30);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point38 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        int int39 = point38.getX();
        boolean boolean40 = point30.dominates(point38);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point46 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean47 = point43.dominates(point46);
        int int48 = point46.getY();
        int int49 = point46.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point52 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean53 = point46.dominates(point52);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point56 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, (int) 'a');
        int int57 = point56.getY();
        boolean boolean58 = point52.dominates(point56);
        boolean boolean59 = point38.dominates(point56);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 97 + "'", int57 == 97);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, (int) ' ');
        int int3 = point2.getX();
        int int4 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 100, 0);
        boolean boolean8 = point2.dominates(point7);
        int int9 = point7.getY();
        int int10 = point7.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm1 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point4 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean8 = point4.dominates(point7);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point4 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList10 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList10, pointArray9);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm12.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm1.produceFinalSkyLine(pointList10, pointList13);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm0.produceSubSkyLines(pointList10);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList16 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList17 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point21 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean25 = point21.dominates(point24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point21 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList27 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList27, pointArray26);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm29 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList30 = skylineAlgorithm29.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList31 = skylineAlgorithm18.produceFinalSkyLine(pointList27, pointList30);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm32 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point38 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean39 = point35.dominates(point38);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray40 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point35 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList41 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList41, pointArray40);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList44 = skylineAlgorithm43.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList45 = skylineAlgorithm32.produceFinalSkyLine(pointList41, pointList44);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm46 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm47 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point50 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point53 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean54 = point50.dominates(point53);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray55 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point50 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList56 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList56, pointArray55);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm58 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList59 = skylineAlgorithm58.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList60 = skylineAlgorithm47.produceFinalSkyLine(pointList56, pointList59);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList61 = skylineAlgorithm46.produceSubSkyLines(pointList56);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm62 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point65 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point68 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean69 = point65.dominates(point68);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray70 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point65 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList71 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList71, pointArray70);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm73 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList74 = skylineAlgorithm73.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList75 = skylineAlgorithm62.produceFinalSkyLine(pointList71, pointList74);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList76 = skylineAlgorithm46.produceSubSkyLines(pointList75);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList77 = skylineAlgorithm18.produceFinalSkyLine(pointList41, pointList75);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList78 = skylineAlgorithm0.produceSubSkyLines(pointList77);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList79 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList80 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList81 = skylineAlgorithm0.getPoints();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pointArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertNotNull(pointList16);
        org.junit.Assert.assertNotNull(pointList17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(pointArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(pointList30);
        org.junit.Assert.assertNotNull(pointList31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(pointArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(pointList44);
        org.junit.Assert.assertNotNull(pointList45);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(pointArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(pointList59);
        org.junit.Assert.assertNotNull(pointList60);
        org.junit.Assert.assertNotNull(pointList61);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(pointArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(pointList74);
        org.junit.Assert.assertNotNull(pointList75);
        org.junit.Assert.assertNotNull(pointList76);
        org.junit.Assert.assertNotNull(pointList77);
        org.junit.Assert.assertNotNull(pointList78);
        org.junit.Assert.assertNotNull(pointList79);
        org.junit.Assert.assertNotNull(pointList80);
        org.junit.Assert.assertNotNull(pointList81);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(100, (int) 'a');
        int int3 = point2.getY();
        int int4 = point2.getX();
        int int5 = point2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean14 = point10.dominates(point13);
        boolean boolean15 = point5.dominates(point13);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 10, (-1));
        boolean boolean19 = point13.dominates(point18);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        int int23 = point22.getX();
        int int24 = point22.getX();
        int int25 = point22.getX();
        int int26 = point22.getY();
        int int27 = point22.getY();
        boolean boolean28 = point13.dominates(point22);
        int int29 = point22.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point32 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int36 = point35.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean43 = point39.dominates(point42);
        int int44 = point39.getX();
        boolean boolean45 = point35.dominates(point39);
        int int46 = point39.getX();
        boolean boolean47 = point32.dominates(point39);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point50 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean51 = point39.dominates(point50);
        boolean boolean52 = point22.dominates(point39);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point55 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point58 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean59 = point55.dominates(point58);
        int int60 = point58.getY();
        int int61 = point58.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point64 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean65 = point58.dominates(point64);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point68 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 10);
        boolean boolean69 = point58.dominates(point68);
        int int70 = point58.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point73 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        int int74 = point73.getX();
        boolean boolean75 = point58.dominates(point73);
        int int76 = point58.getY();
        boolean boolean77 = point39.dominates(point58);
        int int78 = point39.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point79 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = point39.dominates(point79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((-1), (int) (short) 1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) ' ', 97);
        int int6 = point5.getY();
        boolean boolean7 = point2.dominates(point5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(10, (int) 'a');
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        int int11 = point8.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean15 = point8.dominates(point14);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 10);
        boolean boolean19 = point8.dominates(point18);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point25 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean26 = point22.dominates(point25);
        int int27 = point25.getY();
        int int28 = point25.getY();
        boolean boolean29 = point8.dominates(point25);
        boolean boolean30 = point2.dominates(point25);
        int int31 = point25.getY();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(10, (int) 'a');
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        int int11 = point8.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean15 = point8.dominates(point14);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 10);
        boolean boolean19 = point8.dominates(point18);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point25 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean26 = point22.dominates(point25);
        int int27 = point25.getY();
        int int28 = point25.getY();
        boolean boolean29 = point8.dominates(point25);
        boolean boolean30 = point2.dominates(point25);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point33 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point36 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean37 = point33.dominates(point36);
        int int38 = point36.getY();
        int int39 = point36.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(97, 1);
        boolean boolean43 = point36.dominates(point42);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point46 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(10, 10);
        boolean boolean47 = point36.dominates(point46);
        boolean boolean48 = point25.dominates(point36);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(97, 35);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        int int11 = point8.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(97, 1);
        boolean boolean15 = point8.dominates(point14);
        boolean boolean16 = point2.dominates(point14);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = point2.dominates(point17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        int int3 = point2.getX();
        int int4 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        int int8 = point7.getX();
        boolean boolean9 = point2.dominates(point7);
        java.lang.Class<?> wildcardClass10 = point7.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean7 = point3.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point3 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList9 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList9, pointArray8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList12 = skylineAlgorithm11.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm0.produceFinalSkyLine(pointList9, pointList12);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm15 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point21 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean22 = point18.dominates(point21);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray23 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point18 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList24 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList24, pointArray23);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList27 = skylineAlgorithm26.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = skylineAlgorithm15.produceFinalSkyLine(pointList24, pointList27);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList29 = skylineAlgorithm14.produceSubSkyLines(pointList24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList31 = skylineAlgorithm30.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList32 = skylineAlgorithm0.produceFinalSkyLine(pointList29, pointList31);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm33 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point36 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean40 = point36.dominates(point39);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray41 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point36 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList42 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList42, pointArray41);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm44 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList45 = skylineAlgorithm44.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = skylineAlgorithm33.produceFinalSkyLine(pointList42, pointList45);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList47 = skylineAlgorithm33.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList48 = skylineAlgorithm33.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList49 = skylineAlgorithm33.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm50 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList51 = skylineAlgorithm50.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm52 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point55 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point58 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean59 = point55.dominates(point58);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray60 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point55 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList61 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList61, pointArray60);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm63 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList64 = skylineAlgorithm63.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList65 = skylineAlgorithm52.produceFinalSkyLine(pointList61, pointList64);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm66 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point69 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point72 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean73 = point69.dominates(point72);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray74 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point69 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList75 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList75, pointArray74);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm77 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList78 = skylineAlgorithm77.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList79 = skylineAlgorithm66.produceFinalSkyLine(pointList75, pointList78);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList80 = skylineAlgorithm50.produceFinalSkyLine(pointList65, pointList78);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList81 = skylineAlgorithm33.produceSubSkyLines(pointList80);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList82 = skylineAlgorithm0.produceSubSkyLines(pointList81);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList83 = skylineAlgorithm0.getPoints();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pointArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pointList12);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(pointArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(pointList27);
        org.junit.Assert.assertNotNull(pointList28);
        org.junit.Assert.assertNotNull(pointList29);
        org.junit.Assert.assertNotNull(pointList31);
        org.junit.Assert.assertNotNull(pointList32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(pointArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(pointList45);
        org.junit.Assert.assertNotNull(pointList46);
        org.junit.Assert.assertNotNull(pointList47);
        org.junit.Assert.assertNotNull(pointList48);
        org.junit.Assert.assertNotNull(pointList49);
        org.junit.Assert.assertNotNull(pointList51);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(pointArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(pointList64);
        org.junit.Assert.assertNotNull(pointList65);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(pointArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(pointList78);
        org.junit.Assert.assertNotNull(pointList79);
        org.junit.Assert.assertNotNull(pointList80);
        org.junit.Assert.assertNotNull(pointList81);
        org.junit.Assert.assertNotNull(pointList82);
        org.junit.Assert.assertNotNull(pointList83);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '#', (int) (short) 1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean17 = point13.dominates(point16);
        boolean boolean18 = point8.dominates(point16);
        boolean boolean19 = point2.dominates(point16);
        int int20 = point2.getY();
        int int21 = point2.getY();
        int int22 = point2.getY();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm1 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point4 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean8 = point4.dominates(point7);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point4 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList10 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList10, pointArray9);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm12.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm1.produceFinalSkyLine(pointList10, pointList13);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm0.produceSubSkyLines(pointList10);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList16 = skylineAlgorithm0.getPoints();
        java.lang.Class<?> wildcardClass17 = pointList16.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pointArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertNotNull(pointList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int3 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean10 = point6.dominates(point9);
        int int11 = point6.getX();
        boolean boolean12 = point2.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point15 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int16 = point15.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        int int24 = point19.getX();
        boolean boolean25 = point15.dominates(point19);
        int int26 = point19.getX();
        boolean boolean27 = point2.dominates(point19);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int31 = point30.getX();
        int int32 = point30.getY();
        boolean boolean33 = point2.dominates(point30);
        int int34 = point30.getX();
        int int35 = point30.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point38 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 100);
        boolean boolean39 = point30.dominates(point38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((-1), (int) 'a');
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '#', (int) (short) 1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean12 = point8.dominates(point11);
        int int13 = point11.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean20 = point16.dominates(point19);
        boolean boolean21 = point11.dominates(point19);
        boolean boolean22 = point5.dominates(point19);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point25 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '#', (int) (short) -1);
        boolean boolean26 = point19.dominates(point25);
        boolean boolean27 = point2.dominates(point19);
        int int28 = point2.getY();
        int int29 = point2.getY();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) 10, 97);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((-1), (int) (byte) 100);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean17 = point13.dominates(point16);
        boolean boolean18 = point8.dominates(point16);
        int int19 = point16.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int23 = point22.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point29 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean30 = point26.dominates(point29);
        int int31 = point26.getX();
        boolean boolean32 = point22.dominates(point26);
        boolean boolean33 = point16.dominates(point22);
        boolean boolean34 = point2.dominates(point16);
        int int35 = point2.getY();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) ' ');
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 10);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, (int) (byte) 1);
        int int3 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean10 = point6.dominates(point9);
        int int11 = point9.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point17 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean18 = point14.dominates(point17);
        boolean boolean19 = point9.dominates(point17);
        boolean boolean20 = point2.dominates(point9);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point23 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean27 = point23.dominates(point26);
        int int28 = point26.getY();
        int int29 = point26.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point32 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(97, 1);
        boolean boolean33 = point26.dominates(point32);
        int int34 = point32.getX();
        boolean boolean35 = point2.dominates(point32);
        java.lang.Class<?> wildcardClass36 = point32.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm1 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point4 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean8 = point4.dominates(point7);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point4 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList10 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList10, pointArray9);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm12.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm1.produceFinalSkyLine(pointList10, pointList13);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm0.produceSubSkyLines(pointList10);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList16 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList17 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList18 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point25 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean26 = point22.dominates(point25);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point22 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList28, pointArray27);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList31 = skylineAlgorithm30.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList32 = skylineAlgorithm19.produceFinalSkyLine(pointList28, pointList31);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList33 = skylineAlgorithm19.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList34 = skylineAlgorithm19.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList35 = skylineAlgorithm19.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList36 = skylineAlgorithm19.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList37 = skylineAlgorithm19.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList38 = skylineAlgorithm19.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm40 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point46 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean47 = point43.dominates(point46);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray48 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point43 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList49 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList49, pointArray48);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm51 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList52 = skylineAlgorithm51.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList53 = skylineAlgorithm40.produceFinalSkyLine(pointList49, pointList52);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList54 = skylineAlgorithm39.produceSubSkyLines(pointList49);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList55 = skylineAlgorithm19.produceSubSkyLines(pointList49);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm56 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm57 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point60 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point63 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean64 = point60.dominates(point63);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray65 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point60 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList66 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList66, pointArray65);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm68 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList69 = skylineAlgorithm68.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList70 = skylineAlgorithm57.produceFinalSkyLine(pointList66, pointList69);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList71 = skylineAlgorithm56.produceSubSkyLines(pointList66);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm72 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point75 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point78 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean79 = point75.dominates(point78);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray80 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point75 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList81 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList81, pointArray80);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm83 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList84 = skylineAlgorithm83.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList85 = skylineAlgorithm72.produceFinalSkyLine(pointList81, pointList84);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList86 = skylineAlgorithm56.produceSubSkyLines(pointList85);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList87 = skylineAlgorithm0.produceFinalSkyLine(pointList55, pointList86);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList88 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList89 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList90 = skylineAlgorithm0.produceSubSkyLines(pointList89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pointArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertNotNull(pointList16);
        org.junit.Assert.assertNotNull(pointList17);
        org.junit.Assert.assertNotNull(pointList18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(pointArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(pointList31);
        org.junit.Assert.assertNotNull(pointList32);
        org.junit.Assert.assertNotNull(pointList33);
        org.junit.Assert.assertNotNull(pointList34);
        org.junit.Assert.assertNotNull(pointList35);
        org.junit.Assert.assertNotNull(pointList36);
        org.junit.Assert.assertNotNull(pointList37);
        org.junit.Assert.assertNotNull(pointList38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(pointArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(pointList52);
        org.junit.Assert.assertNotNull(pointList53);
        org.junit.Assert.assertNotNull(pointList54);
        org.junit.Assert.assertNotNull(pointList55);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(pointArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(pointList69);
        org.junit.Assert.assertNotNull(pointList70);
        org.junit.Assert.assertNotNull(pointList71);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(pointArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(pointList84);
        org.junit.Assert.assertNotNull(pointList85);
        org.junit.Assert.assertNotNull(pointList86);
        org.junit.Assert.assertNotNull(pointList87);
        org.junit.Assert.assertNotNull(pointList88);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 1, (int) '4');
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 100);
        int int6 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 1, 1);
        boolean boolean10 = point5.dominates(point9);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean17 = point13.dominates(point16);
        int int18 = point16.getY();
        int int19 = point16.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean23 = point16.dominates(point22);
        int int24 = point16.getY();
        boolean boolean25 = point5.dominates(point16);
        boolean boolean26 = point2.dominates(point16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int3 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean10 = point6.dominates(point9);
        int int11 = point6.getX();
        boolean boolean12 = point2.dominates(point6);
        int int13 = point2.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean20 = point16.dominates(point19);
        int int21 = point19.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean28 = point24.dominates(point27);
        boolean boolean29 = point19.dominates(point27);
        int int30 = point27.getX();
        int int31 = point27.getX();
        boolean boolean32 = point2.dominates(point27);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point38 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean39 = point35.dominates(point38);
        int int40 = point38.getY();
        int int41 = point38.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point44 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        boolean boolean45 = point38.dominates(point44);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point48 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point51 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean52 = point48.dominates(point51);
        int int53 = point51.getY();
        int int54 = point51.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point57 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean58 = point51.dominates(point57);
        boolean boolean59 = point38.dominates(point51);
        boolean boolean60 = point2.dominates(point38);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point63 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '#', (int) (short) -1);
        boolean boolean64 = point38.dominates(point63);
        int int65 = point38.getY();
        java.lang.Class<?> wildcardClass66 = point38.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        int int3 = point2.getX();
        int int4 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        int int8 = point7.getX();
        boolean boolean9 = point2.dominates(point7);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        int int13 = point12.getY();
        boolean boolean14 = point7.dominates(point12);
        int int15 = point12.getY();
        int int16 = point12.getY();
        int int17 = point12.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) 0, 32);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(97, (int) 'a');
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        int int3 = point2.getX();
        int int4 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        int int8 = point7.getX();
        int int9 = point7.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point15 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean16 = point12.dominates(point15);
        int int17 = point15.getY();
        int int18 = point15.getX();
        boolean boolean19 = point7.dominates(point15);
        int int20 = point7.getX();
        int int21 = point7.getX();
        boolean boolean22 = point2.dominates(point7);
        int int23 = point7.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (byte) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) 1, 0);
        boolean boolean6 = point2.dominates(point5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(32, (int) '#');
        int int3 = point2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(100, (int) 'a');
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        int int6 = point5.getX();
        int int7 = point5.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        int int11 = point10.getX();
        boolean boolean12 = point5.dominates(point10);
        boolean boolean13 = point2.dominates(point5);
        int int14 = point2.getY();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        int int3 = point2.getX();
        int int4 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        int int8 = point7.getX();
        int int9 = point7.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point15 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean16 = point12.dominates(point15);
        int int17 = point15.getY();
        int int18 = point15.getX();
        boolean boolean19 = point7.dominates(point15);
        int int20 = point7.getX();
        int int21 = point7.getX();
        boolean boolean22 = point2.dominates(point7);
        int int23 = point2.getX();
        int int24 = point2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (-1));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, (-1));
        int int3 = point2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(10, 100);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        int int8 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean12 = point5.dominates(point11);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point15 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 10);
        boolean boolean16 = point5.dominates(point15);
        int int17 = point15.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point20 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        int int21 = point20.getX();
        int int22 = point20.getX();
        int int23 = point20.getX();
        int int24 = point20.getY();
        boolean boolean25 = point15.dominates(point20);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point28 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int29 = point28.getX();
        int int30 = point28.getX();
        boolean boolean31 = point20.dominates(point28);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = point28.dominates(point32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(100, (int) (byte) -1);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '#', (int) (short) 1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean17 = point13.dominates(point16);
        boolean boolean18 = point8.dominates(point16);
        boolean boolean19 = point2.dominates(point16);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        int int23 = point22.getX();
        int int24 = point22.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean31 = point27.dominates(point30);
        int int32 = point30.getY();
        int int33 = point30.getX();
        boolean boolean34 = point22.dominates(point30);
        boolean boolean35 = point16.dominates(point30);
        java.lang.Class<?> wildcardClass36 = point16.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean17 = point13.dominates(point16);
        boolean boolean18 = point8.dominates(point16);
        int int19 = point16.getY();
        boolean boolean20 = point2.dominates(point16);
        int int21 = point2.getY();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 100, 32);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 100);
        int int3 = point2.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) 'a', 10);
        int int7 = point6.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 10, (int) ' ');
        int int11 = point10.getY();
        boolean boolean12 = point6.dominates(point10);
        int int13 = point6.getY();
        boolean boolean14 = point2.dominates(point6);
        int int15 = point2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(97, (int) (byte) 10);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int3 = point2.getX();
        int int4 = point2.getY();
        int int5 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 100, 0);
        int int9 = point8.getY();
        boolean boolean10 = point2.dominates(point8);
        int int11 = point8.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point17 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean18 = point14.dominates(point17);
        int int19 = point17.getY();
        int int20 = point17.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point23 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        boolean boolean24 = point17.dominates(point23);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean31 = point27.dominates(point30);
        int int32 = point30.getY();
        int int33 = point30.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point36 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean37 = point30.dominates(point36);
        boolean boolean38 = point17.dominates(point30);
        boolean boolean39 = point8.dominates(point30);
        int int40 = point30.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int3 = point2.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean10 = point6.dominates(point9);
        int int11 = point6.getX();
        boolean boolean12 = point2.dominates(point6);
        int int13 = point2.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        int int17 = point16.getX();
        int int18 = point16.getX();
        int int19 = point16.getX();
        boolean boolean20 = point2.dominates(point16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        int int8 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean12 = point5.dominates(point11);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point15 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 10);
        boolean boolean16 = point5.dominates(point15);
        int int17 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point20 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        int int21 = point20.getX();
        boolean boolean22 = point5.dominates(point20);
        int int23 = point5.getX();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean7 = point3.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point3 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList9 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList9, pointArray8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList12 = skylineAlgorithm11.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm0.produceFinalSkyLine(pointList9, pointList12);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point19 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList25 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList25, pointArray24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = skylineAlgorithm27.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList29 = skylineAlgorithm16.produceFinalSkyLine(pointList25, pointList28);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean38 = point34.dominates(point37);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point34 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList40 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList40, pointArray39);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList43 = skylineAlgorithm42.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList44 = skylineAlgorithm31.produceFinalSkyLine(pointList40, pointList43);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList45 = skylineAlgorithm30.produceSubSkyLines(pointList40);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = skylineAlgorithm0.produceFinalSkyLine(pointList29, pointList40);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList47 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm48 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList49 = skylineAlgorithm48.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm50 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point53 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point56 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean57 = point53.dominates(point56);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray58 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point53 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList59 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList59, pointArray58);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm61 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList62 = skylineAlgorithm61.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList63 = skylineAlgorithm50.produceFinalSkyLine(pointList59, pointList62);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm64 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point67 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point70 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean71 = point67.dominates(point70);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray72 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point67 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList73 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList73, pointArray72);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm75 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList76 = skylineAlgorithm75.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList77 = skylineAlgorithm64.produceFinalSkyLine(pointList73, pointList76);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList78 = skylineAlgorithm48.produceFinalSkyLine(pointList63, pointList76);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm79 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm80 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point83 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point86 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean87 = point83.dominates(point86);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray88 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point83 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList89 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList89, pointArray88);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm91 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList92 = skylineAlgorithm91.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList93 = skylineAlgorithm80.produceFinalSkyLine(pointList89, pointList92);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList94 = skylineAlgorithm79.produceSubSkyLines(pointList89);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList95 = skylineAlgorithm79.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList96 = skylineAlgorithm79.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList97 = skylineAlgorithm0.produceFinalSkyLine(pointList63, pointList96);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList98 = skylineAlgorithm0.getPoints();
        java.lang.Class<?> wildcardClass99 = skylineAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pointArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pointList12);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pointArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(pointList28);
        org.junit.Assert.assertNotNull(pointList29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(pointArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(pointList43);
        org.junit.Assert.assertNotNull(pointList44);
        org.junit.Assert.assertNotNull(pointList45);
        org.junit.Assert.assertNotNull(pointList46);
        org.junit.Assert.assertNotNull(pointList47);
        org.junit.Assert.assertNotNull(pointList49);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(pointArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(pointList62);
        org.junit.Assert.assertNotNull(pointList63);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(pointArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(pointList76);
        org.junit.Assert.assertNotNull(pointList77);
        org.junit.Assert.assertNotNull(pointList78);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(pointArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(pointList92);
        org.junit.Assert.assertNotNull(pointList93);
        org.junit.Assert.assertNotNull(pointList94);
        org.junit.Assert.assertNotNull(pointList95);
        org.junit.Assert.assertNotNull(pointList96);
        org.junit.Assert.assertNotNull(pointList97);
        org.junit.Assert.assertNotNull(pointList98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean17 = point13.dominates(point16);
        boolean boolean18 = point8.dominates(point16);
        int int19 = point16.getY();
        boolean boolean20 = point2.dominates(point16);
        int int21 = point16.getY();
        int int22 = point16.getY();
        int int23 = point16.getX();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (byte) 10);
        int int3 = point2.getY();
        int int4 = point2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(97, 100);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean14 = point10.dominates(point13);
        boolean boolean15 = point5.dominates(point13);
        int int16 = point13.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int20 = point19.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point23 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean27 = point23.dominates(point26);
        int int28 = point23.getX();
        boolean boolean29 = point19.dominates(point23);
        boolean boolean30 = point13.dominates(point19);
        int int31 = point19.getY();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(97, 35);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        int int11 = point8.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(97, 1);
        boolean boolean15 = point8.dominates(point14);
        boolean boolean16 = point2.dominates(point14);
        int int17 = point2.getY();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean7 = point3.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point3 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList9 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList9, pointArray8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList12 = skylineAlgorithm11.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm0.produceFinalSkyLine(pointList9, pointList12);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point17 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point20 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean21 = point17.dominates(point20);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point17 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList23 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList23, pointArray22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm25 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList26 = skylineAlgorithm25.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList27 = skylineAlgorithm14.produceFinalSkyLine(pointList23, pointList26);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm28 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean35 = point31.dominates(point34);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray36 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point31 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList37 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList37, pointArray36);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList40 = skylineAlgorithm39.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList41 = skylineAlgorithm28.produceFinalSkyLine(pointList37, pointList40);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList42 = skylineAlgorithm0.produceFinalSkyLine(pointList27, pointList37);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList43 = skylineAlgorithm0.getPoints();
        java.lang.Class<?> wildcardClass44 = pointList43.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pointArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pointList12);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(pointArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(pointList26);
        org.junit.Assert.assertNotNull(pointList27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(pointArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(pointList40);
        org.junit.Assert.assertNotNull(pointList41);
        org.junit.Assert.assertNotNull(pointList42);
        org.junit.Assert.assertNotNull(pointList43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        int int3 = point2.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 10, (int) (short) 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean13 = point9.dominates(point12);
        int int14 = point12.getY();
        int int15 = point12.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int19 = point18.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point25 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean26 = point22.dominates(point25);
        int int27 = point22.getX();
        boolean boolean28 = point18.dominates(point22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int32 = point31.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point38 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean39 = point35.dominates(point38);
        int int40 = point35.getX();
        boolean boolean41 = point31.dominates(point35);
        int int42 = point35.getX();
        boolean boolean43 = point18.dominates(point35);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point46 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int47 = point46.getX();
        int int48 = point46.getY();
        boolean boolean49 = point18.dominates(point46);
        boolean boolean50 = point12.dominates(point46);
        boolean boolean51 = point6.dominates(point46);
        boolean boolean52 = point2.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point53 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = point6.dominates(point53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, 52);
        int int3 = point2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        int int10 = point8.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean17 = point13.dominates(point16);
        boolean boolean18 = point8.dominates(point16);
        int int19 = point16.getY();
        boolean boolean20 = point2.dominates(point16);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point23 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point29 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean30 = point26.dominates(point29);
        int int31 = point29.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean38 = point34.dominates(point37);
        boolean boolean39 = point29.dominates(point37);
        int int40 = point37.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int44 = point43.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point47 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point50 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean51 = point47.dominates(point50);
        int int52 = point47.getX();
        boolean boolean53 = point43.dominates(point47);
        boolean boolean54 = point37.dominates(point43);
        boolean boolean55 = point23.dominates(point37);
        boolean boolean56 = point16.dominates(point37);
        int int57 = point16.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point60 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int61 = point60.getX();
        int int62 = point60.getY();
        boolean boolean63 = point16.dominates(point60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 52 + "'", int62 == 52);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 10, (int) '4');
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList1 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point5 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList11 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList11, pointArray10);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm13.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm2.produceFinalSkyLine(pointList11, pointList14);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point19 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList25 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList25, pointArray24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = skylineAlgorithm27.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList29 = skylineAlgorithm16.produceFinalSkyLine(pointList25, pointList28);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList30 = skylineAlgorithm0.produceFinalSkyLine(pointList15, pointList28);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean38 = point34.dominates(point37);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point34 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList40 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList40, pointArray39);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList43 = skylineAlgorithm42.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList44 = skylineAlgorithm31.produceFinalSkyLine(pointList40, pointList43);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList45 = skylineAlgorithm31.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = skylineAlgorithm31.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm47 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point50 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point53 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean54 = point50.dominates(point53);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray55 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point50 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList56 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList56, pointArray55);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm58 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList59 = skylineAlgorithm58.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList60 = skylineAlgorithm47.produceFinalSkyLine(pointList56, pointList59);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm61 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm62 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point65 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point68 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean69 = point65.dominates(point68);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray70 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point65 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList71 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList71, pointArray70);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm73 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList74 = skylineAlgorithm73.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList75 = skylineAlgorithm62.produceFinalSkyLine(pointList71, pointList74);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList76 = skylineAlgorithm61.produceSubSkyLines(pointList71);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList77 = skylineAlgorithm31.produceFinalSkyLine(pointList60, pointList71);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList78 = skylineAlgorithm0.produceSubSkyLines(pointList77);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList79 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList80 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList81 = skylineAlgorithm0.getPoints();
        java.lang.Class<?> wildcardClass82 = pointList81.getClass();
        org.junit.Assert.assertNotNull(pointList1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(pointArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pointArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(pointList28);
        org.junit.Assert.assertNotNull(pointList29);
        org.junit.Assert.assertNotNull(pointList30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(pointArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(pointList43);
        org.junit.Assert.assertNotNull(pointList44);
        org.junit.Assert.assertNotNull(pointList45);
        org.junit.Assert.assertNotNull(pointList46);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(pointArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(pointList59);
        org.junit.Assert.assertNotNull(pointList60);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(pointArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(pointList74);
        org.junit.Assert.assertNotNull(pointList75);
        org.junit.Assert.assertNotNull(pointList76);
        org.junit.Assert.assertNotNull(pointList77);
        org.junit.Assert.assertNotNull(pointList78);
        org.junit.Assert.assertNotNull(pointList79);
        org.junit.Assert.assertNotNull(pointList80);
        org.junit.Assert.assertNotNull(pointList81);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm1 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point4 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean8 = point4.dominates(point7);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point4 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList10 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList10, pointArray9);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm12.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm1.produceFinalSkyLine(pointList10, pointList13);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm0.produceSubSkyLines(pointList10);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList17 = skylineAlgorithm16.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point21 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean25 = point21.dominates(point24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point21 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList27 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList27, pointArray26);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm29 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList30 = skylineAlgorithm29.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList31 = skylineAlgorithm18.produceFinalSkyLine(pointList27, pointList30);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm32 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point38 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean39 = point35.dominates(point38);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray40 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point35 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList41 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList41, pointArray40);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList44 = skylineAlgorithm43.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList45 = skylineAlgorithm32.produceFinalSkyLine(pointList41, pointList44);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = skylineAlgorithm16.produceFinalSkyLine(pointList31, pointList44);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList47 = skylineAlgorithm0.produceSubSkyLines(pointList46);
        java.lang.Class<?> wildcardClass48 = skylineAlgorithm0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pointArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertNotNull(pointList17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(pointArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(pointList30);
        org.junit.Assert.assertNotNull(pointList31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(pointArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(pointList44);
        org.junit.Assert.assertNotNull(pointList45);
        org.junit.Assert.assertNotNull(pointList46);
        org.junit.Assert.assertNotNull(pointList47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 10, (int) (short) 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 100);
        boolean boolean6 = point2.dominates(point5);
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(32, 52);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean7 = point3.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point3 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList9 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList9, pointArray8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList12 = skylineAlgorithm11.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm0.produceFinalSkyLine(pointList9, pointList12);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point19 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList25 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList25, pointArray24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = skylineAlgorithm27.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList29 = skylineAlgorithm16.produceFinalSkyLine(pointList25, pointList28);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean38 = point34.dominates(point37);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point34 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList40 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList40, pointArray39);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList43 = skylineAlgorithm42.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList44 = skylineAlgorithm31.produceFinalSkyLine(pointList40, pointList43);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList45 = skylineAlgorithm30.produceSubSkyLines(pointList40);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = skylineAlgorithm0.produceFinalSkyLine(pointList29, pointList40);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList47 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList48 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList49 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm50 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point53 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point56 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean57 = point53.dominates(point56);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray58 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point53 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList59 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList59, pointArray58);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm61 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList62 = skylineAlgorithm61.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList63 = skylineAlgorithm50.produceFinalSkyLine(pointList59, pointList62);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm64 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm65 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point68 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point71 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean72 = point68.dominates(point71);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray73 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point68 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList74 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList74, pointArray73);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm76 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList77 = skylineAlgorithm76.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList78 = skylineAlgorithm65.produceFinalSkyLine(pointList74, pointList77);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList79 = skylineAlgorithm64.produceSubSkyLines(pointList74);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm80 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList81 = skylineAlgorithm80.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList82 = skylineAlgorithm50.produceFinalSkyLine(pointList79, pointList81);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList83 = skylineAlgorithm0.produceSubSkyLines(pointList79);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pointArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pointList12);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pointArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(pointList28);
        org.junit.Assert.assertNotNull(pointList29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(pointArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(pointList43);
        org.junit.Assert.assertNotNull(pointList44);
        org.junit.Assert.assertNotNull(pointList45);
        org.junit.Assert.assertNotNull(pointList46);
        org.junit.Assert.assertNotNull(pointList47);
        org.junit.Assert.assertNotNull(pointList48);
        org.junit.Assert.assertNotNull(pointList49);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(pointArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(pointList62);
        org.junit.Assert.assertNotNull(pointList63);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(pointArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(pointList77);
        org.junit.Assert.assertNotNull(pointList78);
        org.junit.Assert.assertNotNull(pointList79);
        org.junit.Assert.assertNotNull(pointList81);
        org.junit.Assert.assertNotNull(pointList82);
        org.junit.Assert.assertNotNull(pointList83);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 1, (int) '4');
        int int3 = point2.getX();
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((-1), (-1));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList1 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point5 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList11 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList11, pointArray10);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm13.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm2.produceFinalSkyLine(pointList11, pointList14);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point19 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList25 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList25, pointArray24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = skylineAlgorithm27.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList29 = skylineAlgorithm16.produceFinalSkyLine(pointList25, pointList28);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList30 = skylineAlgorithm0.produceFinalSkyLine(pointList15, pointList28);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean38 = point34.dominates(point37);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point34 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList40 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList40, pointArray39);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm42 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList43 = skylineAlgorithm42.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList44 = skylineAlgorithm31.produceFinalSkyLine(pointList40, pointList43);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList45 = skylineAlgorithm31.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = skylineAlgorithm31.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm47 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point50 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point53 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean54 = point50.dominates(point53);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray55 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point50 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList56 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList56, pointArray55);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm58 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList59 = skylineAlgorithm58.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList60 = skylineAlgorithm47.produceFinalSkyLine(pointList56, pointList59);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm61 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm62 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point65 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point68 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean69 = point65.dominates(point68);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray70 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point65 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList71 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList71, pointArray70);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm73 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList74 = skylineAlgorithm73.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList75 = skylineAlgorithm62.produceFinalSkyLine(pointList71, pointList74);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList76 = skylineAlgorithm61.produceSubSkyLines(pointList71);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList77 = skylineAlgorithm31.produceFinalSkyLine(pointList60, pointList71);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList78 = skylineAlgorithm0.produceSubSkyLines(pointList77);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList79 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList80 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList81 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList82 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList83 = skylineAlgorithm0.getPoints();
        org.junit.Assert.assertNotNull(pointList1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(pointArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pointArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(pointList28);
        org.junit.Assert.assertNotNull(pointList29);
        org.junit.Assert.assertNotNull(pointList30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(pointArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(pointList43);
        org.junit.Assert.assertNotNull(pointList44);
        org.junit.Assert.assertNotNull(pointList45);
        org.junit.Assert.assertNotNull(pointList46);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(pointArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(pointList59);
        org.junit.Assert.assertNotNull(pointList60);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(pointArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(pointList74);
        org.junit.Assert.assertNotNull(pointList75);
        org.junit.Assert.assertNotNull(pointList76);
        org.junit.Assert.assertNotNull(pointList77);
        org.junit.Assert.assertNotNull(pointList78);
        org.junit.Assert.assertNotNull(pointList79);
        org.junit.Assert.assertNotNull(pointList80);
        org.junit.Assert.assertNotNull(pointList81);
        org.junit.Assert.assertNotNull(pointList82);
        org.junit.Assert.assertNotNull(pointList83);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) -1, 1);
        int int3 = point2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) '4');
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int6 = point5.getX();
        int int7 = point5.getX();
        int int8 = point5.getX();
        int int9 = point5.getY();
        boolean boolean10 = point2.dominates(point5);
        int int11 = point5.getX();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        int int8 = point5.getY();
        int int9 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point15 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean16 = point12.dominates(point15);
        int int17 = point15.getY();
        int int18 = point15.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point21 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean22 = point15.dominates(point21);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point25 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 10);
        boolean boolean26 = point15.dominates(point25);
        int int27 = point25.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 0);
        int int31 = point30.getX();
        int int32 = point30.getX();
        int int33 = point30.getX();
        int int34 = point30.getY();
        boolean boolean35 = point25.dominates(point30);
        boolean boolean36 = point5.dominates(point25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point2.getX();
        int int8 = point2.getY();
        int int9 = point2.getY();
        int int10 = point2.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = point2.dominates(point11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean14 = point10.dominates(point13);
        boolean boolean15 = point5.dominates(point13);
        int int16 = point13.getY();
        int int17 = point13.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point20 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int21 = point20.getX();
        int int22 = point20.getX();
        int int23 = point20.getX();
        int int24 = point20.getX();
        int int25 = point20.getY();
        boolean boolean26 = point13.dominates(point20);
        int int27 = point13.getY();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(10, (int) (byte) 1);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean7 = point3.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point3 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList9 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList9, pointArray8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList12 = skylineAlgorithm11.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm0.produceFinalSkyLine(pointList9, pointList12);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point17 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point20 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean21 = point17.dominates(point20);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point17 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList23 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList23, pointArray22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm25 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList26 = skylineAlgorithm25.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList27 = skylineAlgorithm14.produceFinalSkyLine(pointList23, pointList26);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm28 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean35 = point31.dominates(point34);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray36 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point31 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList37 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList37, pointArray36);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList40 = skylineAlgorithm39.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList41 = skylineAlgorithm28.produceFinalSkyLine(pointList37, pointList40);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList42 = skylineAlgorithm0.produceFinalSkyLine(pointList27, pointList37);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point46 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point49 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean50 = point46.dominates(point49);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray51 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point46 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList52 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList52, pointArray51);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm54 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList55 = skylineAlgorithm54.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList56 = skylineAlgorithm43.produceFinalSkyLine(pointList52, pointList55);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList57 = skylineAlgorithm0.produceSubSkyLines(pointList52);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList58 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList59 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList60 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList61 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList62 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList63 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList64 = skylineAlgorithm0.getPoints();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pointArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pointList12);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(pointArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(pointList26);
        org.junit.Assert.assertNotNull(pointList27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(pointArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(pointList40);
        org.junit.Assert.assertNotNull(pointList41);
        org.junit.Assert.assertNotNull(pointList42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(pointArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(pointList55);
        org.junit.Assert.assertNotNull(pointList56);
        org.junit.Assert.assertNotNull(pointList57);
        org.junit.Assert.assertNotNull(pointList58);
        org.junit.Assert.assertNotNull(pointList59);
        org.junit.Assert.assertNotNull(pointList60);
        org.junit.Assert.assertNotNull(pointList61);
        org.junit.Assert.assertNotNull(pointList62);
        org.junit.Assert.assertNotNull(pointList63);
        org.junit.Assert.assertNotNull(pointList64);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean6 = point2.dominates(point5);
        int int7 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean14 = point10.dominates(point13);
        boolean boolean15 = point5.dominates(point13);
        int int16 = point13.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int20 = point19.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point23 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean27 = point23.dominates(point26);
        int int28 = point23.getX();
        boolean boolean29 = point19.dominates(point23);
        boolean boolean30 = point13.dominates(point19);
        int int31 = point19.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point37 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean38 = point34.dominates(point37);
        int int39 = point37.getY();
        int int40 = point37.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        boolean boolean44 = point37.dominates(point43);
        boolean boolean45 = point19.dominates(point37);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point48 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) ' ', 10);
        boolean boolean49 = point37.dominates(point48);
        int int50 = point48.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point53 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((-1), (int) '4');
        int int54 = point53.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point57 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(52, (int) (short) 0);
        int int58 = point57.getY();
        boolean boolean59 = point53.dominates(point57);
        boolean boolean60 = point48.dominates(point57);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '4', (int) (short) 100);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        int int6 = point5.getX();
        int int7 = point5.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(97, 1);
        boolean boolean11 = point5.dominates(point10);
        boolean boolean12 = point2.dominates(point10);
        int int13 = point2.getX();
        int int14 = point2.getX();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean7 = point3.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point3 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList9 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList9, pointArray8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList12 = skylineAlgorithm11.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm0.produceFinalSkyLine(pointList9, pointList12);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm15 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point21 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean22 = point18.dominates(point21);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray23 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point18 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList24 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList24, pointArray23);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm26 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList27 = skylineAlgorithm26.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = skylineAlgorithm15.produceFinalSkyLine(pointList24, pointList27);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList29 = skylineAlgorithm14.produceSubSkyLines(pointList24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm30 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList31 = skylineAlgorithm30.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList32 = skylineAlgorithm0.produceFinalSkyLine(pointList29, pointList31);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList33 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList34 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point38 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point41 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean42 = point38.dominates(point41);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point38 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList44 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList44, pointArray43);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm46 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList47 = skylineAlgorithm46.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList48 = skylineAlgorithm35.produceFinalSkyLine(pointList44, pointList47);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm49 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point52 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point55 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean56 = point52.dominates(point55);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray57 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point52 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList58 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList58, pointArray57);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm60 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList61 = skylineAlgorithm60.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList62 = skylineAlgorithm49.produceFinalSkyLine(pointList58, pointList61);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm63 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm64 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point67 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point70 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean71 = point67.dominates(point70);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray72 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point67 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList73 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList73, pointArray72);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm75 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList76 = skylineAlgorithm75.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList77 = skylineAlgorithm64.produceFinalSkyLine(pointList73, pointList76);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList78 = skylineAlgorithm63.produceSubSkyLines(pointList73);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm79 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point82 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point85 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean86 = point82.dominates(point85);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray87 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point82 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList88 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList88, pointArray87);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm90 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList91 = skylineAlgorithm90.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList92 = skylineAlgorithm79.produceFinalSkyLine(pointList88, pointList91);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList93 = skylineAlgorithm63.produceSubSkyLines(pointList92);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList94 = skylineAlgorithm35.produceFinalSkyLine(pointList58, pointList92);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList95 = skylineAlgorithm0.produceSubSkyLines(pointList94);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList96 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList97 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList98 = skylineAlgorithm0.produceSubSkyLines(pointList97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pointArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pointList12);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(pointArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(pointList27);
        org.junit.Assert.assertNotNull(pointList28);
        org.junit.Assert.assertNotNull(pointList29);
        org.junit.Assert.assertNotNull(pointList31);
        org.junit.Assert.assertNotNull(pointList32);
        org.junit.Assert.assertNotNull(pointList33);
        org.junit.Assert.assertNotNull(pointList34);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(pointArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(pointList47);
        org.junit.Assert.assertNotNull(pointList48);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(pointArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(pointList61);
        org.junit.Assert.assertNotNull(pointList62);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(pointArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(pointList76);
        org.junit.Assert.assertNotNull(pointList77);
        org.junit.Assert.assertNotNull(pointList78);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(pointArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(pointList91);
        org.junit.Assert.assertNotNull(pointList92);
        org.junit.Assert.assertNotNull(pointList93);
        org.junit.Assert.assertNotNull(pointList94);
        org.junit.Assert.assertNotNull(pointList95);
        org.junit.Assert.assertNotNull(pointList96);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(35, 0);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (short) 0, 52);
        int int6 = point5.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point9 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point12 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean13 = point9.dominates(point12);
        int int14 = point9.getX();
        boolean boolean15 = point5.dominates(point9);
        int int16 = point9.getX();
        boolean boolean17 = point2.dominates(point9);
        int int18 = point9.getY();
        int int19 = point9.getX();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList1 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point5 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean9 = point5.dominates(point8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point5 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList11 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList11, pointArray10);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList14 = skylineAlgorithm13.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList15 = skylineAlgorithm2.produceFinalSkyLine(pointList11, pointList14);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm16 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point19 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean23 = point19.dominates(point22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray24 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point19 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList25 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList25, pointArray24);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList28 = skylineAlgorithm27.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList29 = skylineAlgorithm16.produceFinalSkyLine(pointList25, pointList28);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList30 = skylineAlgorithm0.produceFinalSkyLine(pointList15, pointList28);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm32 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point38 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean39 = point35.dominates(point38);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray40 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point35 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList41 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList41, pointArray40);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList44 = skylineAlgorithm43.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList45 = skylineAlgorithm32.produceFinalSkyLine(pointList41, pointList44);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList46 = skylineAlgorithm31.produceSubSkyLines(pointList41);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm47 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point50 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point53 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean54 = point50.dominates(point53);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray55 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point50 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList56 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList56, pointArray55);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm58 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList59 = skylineAlgorithm58.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList60 = skylineAlgorithm47.produceFinalSkyLine(pointList56, pointList59);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList61 = skylineAlgorithm31.produceSubSkyLines(pointList60);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList62 = skylineAlgorithm0.produceSubSkyLines(pointList60);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList63 = skylineAlgorithm0.getPoints();
        org.junit.Assert.assertNotNull(pointList1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(pointArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(pointList14);
        org.junit.Assert.assertNotNull(pointList15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(pointArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(pointList28);
        org.junit.Assert.assertNotNull(pointList29);
        org.junit.Assert.assertNotNull(pointList30);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(pointArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(pointList44);
        org.junit.Assert.assertNotNull(pointList45);
        org.junit.Assert.assertNotNull(pointList46);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(pointArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(pointList59);
        org.junit.Assert.assertNotNull(pointList60);
        org.junit.Assert.assertNotNull(pointList61);
        org.junit.Assert.assertNotNull(pointList62);
        org.junit.Assert.assertNotNull(pointList63);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm0 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point3 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point6 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean7 = point3.dominates(point6);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray8 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point3 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList9 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList9, pointArray8);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm11 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList12 = skylineAlgorithm11.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList13 = skylineAlgorithm0.produceFinalSkyLine(pointList9, pointList12);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm14 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point17 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point20 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean21 = point17.dominates(point20);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray22 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point17 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList23 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList23, pointArray22);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm25 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList26 = skylineAlgorithm25.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList27 = skylineAlgorithm14.produceFinalSkyLine(pointList23, pointList26);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm28 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point31 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point34 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean35 = point31.dominates(point34);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray36 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point31 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList37 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList37, pointArray36);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm39 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList40 = skylineAlgorithm39.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList41 = skylineAlgorithm28.produceFinalSkyLine(pointList37, pointList40);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList42 = skylineAlgorithm0.produceFinalSkyLine(pointList27, pointList37);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm43 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point46 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point49 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean50 = point46.dominates(point49);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray51 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point46 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList52 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList52, pointArray51);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm54 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList55 = skylineAlgorithm54.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList56 = skylineAlgorithm43.produceFinalSkyLine(pointList52, pointList55);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList57 = skylineAlgorithm0.produceSubSkyLines(pointList52);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList58 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList59 = skylineAlgorithm0.getPoints();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm60 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm61 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point64 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point67 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean68 = point64.dominates(point67);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray69 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point64 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList70 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList70, pointArray69);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm72 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList73 = skylineAlgorithm72.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList74 = skylineAlgorithm61.produceFinalSkyLine(pointList70, pointList73);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList75 = skylineAlgorithm60.produceSubSkyLines(pointList70);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm76 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point79 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point82 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean83 = point79.dominates(point82);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] pointArray84 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point[] { point79 };
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList85 = new java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point>) pointList85, pointArray84);
        com.thealgorithms.divideandconquer.SkylineAlgorithm skylineAlgorithm87 = new com.thealgorithms.divideandconquer.SkylineAlgorithm();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList88 = skylineAlgorithm87.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList89 = skylineAlgorithm76.produceFinalSkyLine(pointList85, pointList88);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList90 = skylineAlgorithm60.produceSubSkyLines(pointList89);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList91 = skylineAlgorithm0.produceSubSkyLines(pointList90);
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList92 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList93 = skylineAlgorithm0.getPoints();
        java.util.ArrayList<com.thealgorithms.divideandconquer.SkylineAlgorithm.Point> pointList94 = skylineAlgorithm0.getPoints();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(pointArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pointList12);
        org.junit.Assert.assertNotNull(pointList13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(pointArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(pointList26);
        org.junit.Assert.assertNotNull(pointList27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(pointArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(pointList40);
        org.junit.Assert.assertNotNull(pointList41);
        org.junit.Assert.assertNotNull(pointList42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(pointArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(pointList55);
        org.junit.Assert.assertNotNull(pointList56);
        org.junit.Assert.assertNotNull(pointList57);
        org.junit.Assert.assertNotNull(pointList58);
        org.junit.Assert.assertNotNull(pointList59);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(pointArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(pointList73);
        org.junit.Assert.assertNotNull(pointList74);
        org.junit.Assert.assertNotNull(pointList75);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(pointArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(pointList88);
        org.junit.Assert.assertNotNull(pointList89);
        org.junit.Assert.assertNotNull(pointList90);
        org.junit.Assert.assertNotNull(pointList91);
        org.junit.Assert.assertNotNull(pointList92);
        org.junit.Assert.assertNotNull(pointList93);
        org.junit.Assert.assertNotNull(pointList94);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, 100);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point2 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(1, (int) (byte) 100);
        int int3 = point2.getY();
        int int4 = point2.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point7 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) '#', (int) (short) 1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point10 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point13 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean14 = point10.dominates(point13);
        int int15 = point13.getY();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point18 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point21 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean22 = point18.dominates(point21);
        boolean boolean23 = point13.dominates(point21);
        boolean boolean24 = point7.dominates(point21);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point27 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point((int) (byte) -1, (int) (short) 1);
        int int28 = point27.getX();
        int int29 = point27.getX();
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point32 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        com.thealgorithms.divideandconquer.SkylineAlgorithm.Point point35 = new com.thealgorithms.divideandconquer.SkylineAlgorithm.Point(0, (int) (short) -1);
        boolean boolean36 = point32.dominates(point35);
        int int37 = point35.getY();
        int int38 = point35.getX();
        boolean boolean39 = point27.dominates(point35);
        boolean boolean40 = point21.dominates(point35);
        boolean boolean41 = point2.dominates(point21);
        int int42 = point2.getX();
        int int43 = point2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }
}

