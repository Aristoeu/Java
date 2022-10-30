package Perimeter;

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
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.0f), (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 192.0f + "'", float2 == 192.0f);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 628.3185307179587d + "'", double1 == 628.3185307179587d);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.283185307179586d + "'", double1 == 6.283185307179586d);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 219.9114857512855d + "'", double1 == 219.9114857512855d);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) '4', (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 106.0f + "'", float2 == 106.0f);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        com.thealgorithms.maths.Perimeter perimeter0 = new com.thealgorithms.maths.Perimeter();
        java.lang.Class<?> wildcardClass1 = perimeter0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (short) 100, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 220.0f + "'", float2 == 220.0f);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 106.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (short) 100, 220.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 640.0f + "'", float2 == 640.0f);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 609.4689747964198d + "'", double1 == 609.4689747964198d);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 220.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.283185307179586d + "'", double1 == 6.283185307179586d);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 'a', (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 214.0f + "'", float2 == 214.0f);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 62.83185307179586d + "'", double1 == 62.83185307179586d);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) 10, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 214.0f + "'", float2 == 214.0f);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.283185307179586d + "'", double1 == 6.283185307179586d);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10000.0f + "'", float2 == 10000.0f);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 1, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(192.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1206.3715789784806d + "'", double1 == 1206.3715789784806d);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 220.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21340.0f + "'", float2 == 21340.0f);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (short) 10, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 214.0f + "'", float2 == 214.0f);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) 100, 10000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20200.0f + "'", float2 == 20200.0f);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(214.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 628.0f + "'", float2 == 628.0f);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.0f + "'", float2 == 20.0f);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-192.0f) + "'", float2 == (-192.0f));
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(10000.0f, 220.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20440.0f + "'", float2 == 20440.0f);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(20440.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 128428.30767875075d + "'", double1 == 128428.30767875075d);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(640.0f, 10000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21280.0f + "'", float2 == 21280.0f);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-192.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1206.3715789784806d) + "'", double1 == (-1206.3715789784806d));
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 628.3185307179587d + "'", double1 == 628.3185307179587d);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(21280.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 42664.0f + "'", float2 == 42664.0f);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 62.83185307179586d + "'", double1 == 62.83185307179586d);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(640.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4021.238596594935d + "'", double1 == 4021.238596594935d);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(10000.0f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20020.0f + "'", float2 == 20020.0f);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(21340.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 134083.17445521237d + "'", double1 == 134083.17445521237d);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.283185307179586d + "'", double1 == 6.283185307179586d);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) -1, 20200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40398.0f + "'", float2 == 40398.0f);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 100, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 200.0f + "'", float2 == 200.0f);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100.0f) + "'", float2 == (-100.0f));
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(20020.0f, 42664.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 125368.0f + "'", float2 == 125368.0f);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) 10, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.0f + "'", float2 == 20.0f);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (short) 0, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 104.0f + "'", float2 == 104.0f);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) '4', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 104.0f + "'", float2 == 104.0f);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.283185307179586d) + "'", double1 == (-6.283185307179586d));
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) 1, (-192.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-382.0f) + "'", float2 == (-382.0f));
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(21340.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 42682.0f + "'", float2 == 42682.0f);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 326.7256359733385d + "'", double1 == 326.7256359733385d);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.283185307179586d) + "'", double1 == (-6.283185307179586d));
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 62.83185307179586d + "'", double1 == 62.83185307179586d);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 62.83185307179586d + "'", double1 == 62.83185307179586d);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 20440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-52.0f) + "'", float2 == (-52.0f));
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) -1, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 68.0f + "'", float2 == 68.0f);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 106.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10600.0f + "'", float2 == 10600.0f);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 10000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10000.0f) + "'", float2 == (-10000.0f));
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 21280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2128000.0f + "'", float2 == 2128000.0f);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(106.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 666.0176425610362d + "'", double1 == 666.0176425610362d);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-10000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1000000.0f) + "'", float2 == (-1000000.0f));
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 2128000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.06416E8f + "'", float2 == 2.06416E8f);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 0, 220.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 440.0f + "'", float2 == 440.0f);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.283185307179586d + "'", double1 == 6.283185307179586d);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 10000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1000000.0f + "'", float2 == 1000000.0f);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1000000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6283185.307179586d + "'", double1 == 6283185.307179586d);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-382.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2400.176787342602d) + "'", double1 == (-2400.176787342602d));
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 1000000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 214.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11128.0f + "'", float2 == 11128.0f);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 1L, 192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 386.0f + "'", float2 == 386.0f);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.06416E8f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.128322E8f + "'", float2 == 4.128322E8f);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) '#', 20020.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40110.0f + "'", float2 == 40110.0f);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(11128.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22276.0f + "'", float2 == 22276.0f);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 201.06192982974676d + "'", double1 == 201.06192982974676d);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(21340.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 42682.0f + "'", float2 == 42682.0f);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.128322E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.593901163105142E9d + "'", double1 == 2.593901163105142E9d);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) -1, (-1000000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2000002.0f) + "'", float2 == (-2000002.0f));
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (short) -1, 20.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(11128.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 69919.28609829444d + "'", double1 == 69919.28609829444d);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20000.0f + "'", float2 == 20000.0f);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) 1, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 40110.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40110.0f + "'", float2 == 40110.0f);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-382.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-19864.0f) + "'", float2 == (-19864.0f));
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(20000.0f, 200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40400.0f + "'", float2 == 40400.0f);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) 0, 440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 880.0f + "'", float2 == 880.0f);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 38.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1976.0f + "'", float2 == 1976.0f);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-382.0f), (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-764.0f) + "'", float2 == (-764.0f));
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2000002.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2566383180729786E7d) + "'", double1 == (-1.2566383180729786E7d));
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 320.0f + "'", float2 == 320.0f);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-764.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(10000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 62831.853071795864d + "'", double1 == 62831.853071795864d);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(220.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 440.0f + "'", float2 == 440.0f);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (short) 0, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.0f + "'", float2 == 20.0f);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-0.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 628.3185307179587d + "'", double1 == 628.3185307179587d);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-19864.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-124809.1929418153d) + "'", double1 == (-124809.1929418153d));
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-10000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100000.0f) + "'", float2 == (-100000.0f));
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(42664.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 268065.81794550986d + "'", double1 == 268065.81794550986d);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-100000.0f), (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-200000.0f) + "'", float2 == (-200000.0f));
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 384.0f + "'", float2 == 384.0f);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-100.0f), 42664.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 85128.0f + "'", float2 == 85128.0f);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 'a', 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 394.0f + "'", float2 == 394.0f);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-32.0f) + "'", float2 == (-32.0f));
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(125368.0f, 20440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 291616.0f + "'", float2 == 291616.0f);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(20000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 125663.70614359173d + "'", double1 == 125663.70614359173d);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 10, 68.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 156.0f + "'", float2 == 156.0f);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(40400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 253840.6864100553d + "'", double1 == 253840.6864100553d);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) -1, 880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1758.0f + "'", float2 == 1758.0f);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10000.0f + "'", float2 == 10000.0f);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(85128.0f, 106.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 170468.0f + "'", float2 == 170468.0f);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 640.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(42664.0f, 21280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127888.0f + "'", float2 == 127888.0f);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(880.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5529.203070318036d + "'", double1 == 5529.203070318036d);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.06416E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2969499783667815E9d + "'", double1 == 1.2969499783667815E9d);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 4.128322E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.128322E8f + "'", float2 == 4.128322E8f);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 85128.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(100.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 200.0f + "'", float2 == 200.0f);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 326.7256359733385d + "'", double1 == 326.7256359733385d);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(22276.0f, 22276.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 89104.0f + "'", float2 == 89104.0f);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100.0f) + "'", float2 == (-100.0f));
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(100.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 202.0f + "'", float2 == 202.0f);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 64.0f + "'", float2 == 64.0f);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(200.0f, 20000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40400.0f + "'", float2 == 40400.0f);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) 1, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 202.0f + "'", float2 == 202.0f);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(22276.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 139964.23590273247d + "'", double1 == 139964.23590273247d);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-52.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-520.0f) + "'", float2 == (-520.0f));
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(20020.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 125789.36984973532d + "'", double1 == 125789.36984973532d);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-19864.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-198640.0f) + "'", float2 == (-198640.0f));
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-764.0f), 42664.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 83800.0f + "'", float2 == 83800.0f);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(220.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1382.300767579509d + "'", double1 == 1382.300767579509d);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 106.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 106.0f + "'", float2 == 106.0f);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 42682.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.283185307179586d) + "'", double1 == (-6.283185307179586d));
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(10000.0f, 40110.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100220.0f + "'", float2 == 100220.0f);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1000000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 127888.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1278880.0f + "'", float2 == 1278880.0f);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(100220.0f, 20000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 240440.0f + "'", float2 == 240440.0f);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(202.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1269.2034320502764d + "'", double1 == 1269.2034320502764d);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-0.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 240440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2404400.0f + "'", float2 == 2404400.0f);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(89104.0f, 125368.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 428944.0f + "'", float2 == 428944.0f);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 11128.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 111280.0f + "'", float2 == 111280.0f);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(20000.0f, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40000.0f + "'", float2 == 40000.0f);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(394.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2475.5750110287568d + "'", double1 == 2475.5750110287568d);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 85128.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8257416.0f + "'", float2 == 8257416.0f);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 628.3185307179587d + "'", double1 == 628.3185307179587d);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(104.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 653.451271946677d + "'", double1 == 653.451271946677d);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-32.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-201.06192982974676d) + "'", double1 == (-201.06192982974676d));
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) 100, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 400.0f + "'", float2 == 400.0f);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1758.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 17580.0f + "'", float2 == 17580.0f);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 10L, 156.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 332.0f + "'", float2 == 332.0f);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(386.0f, 2128000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4256772.0f + "'", float2 == 4256772.0f);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1000.0f + "'", float2 == 1000.0f);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(40000.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 80002.0f + "'", float2 == 80002.0f);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(38.0f, 628.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1332.0f + "'", float2 == 1332.0f);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(17580.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 110458.39770021713d + "'", double1 == 110458.39770021713d);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 40398.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4039800.0f + "'", float2 == 4039800.0f);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(20200.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40470.0f + "'", float2 == 40470.0f);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(111280.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 222562.0f + "'", float2 == 222562.0f);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(104.0f, 320.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 848.0f + "'", float2 == 848.0f);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 2404400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2404400.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4808800.0f + "'", float2 == 4808800.0f);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 1L, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 202.0f + "'", float2 == 202.0f);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4808800.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0214581505165193E7d + "'", double1 == 3.0214581505165193E7d);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(202.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 404.0f + "'", float2 == 404.0f);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.0f), (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(20200.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 126920.34320502765d + "'", double1 == 126920.34320502765d);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 214.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7490.0f + "'", float2 == 7490.0f);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(880.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1780.0f + "'", float2 == 1780.0f);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 20440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1982680.0f + "'", float2 == 1982680.0f);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(10600.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 66601.76425610362d + "'", double1 == 66601.76425610362d);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.128322E8f, 1000000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.276644E8f + "'", float2 == 8.276644E8f);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(21280.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 133706.1833367816d + "'", double1 == 133706.1833367816d);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-198640.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-198640.0f) + "'", float2 == (-198640.0f));
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(404.0f, 42664.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 86136.0f + "'", float2 == 86136.0f);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 40470.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2104440.0f + "'", float2 == 2104440.0f);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1332.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2662.0f + "'", float2 == 2662.0f);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(332.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2086.017521983623d + "'", double1 == 2086.017521983623d);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(40110.0f, 1982680.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4045580.0f + "'", float2 == 4045580.0f);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-19864.0f), 1000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-37728.0f) + "'", float2 == (-37728.0f));
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.128322E8f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.256646E8f + "'", float2 == 8.256646E8f);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(220.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 634.0f + "'", float2 == 634.0f);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1332.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8369.202829163209d + "'", double1 == 8369.202829163209d);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-200000.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1256637.0614359172d) + "'", double1 == (-1256637.0614359172d));
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1780.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(200.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1256.6370614359173d + "'", double1 == 1256.6370614359173d);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 4039800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-520.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3267.2563597333847d) + "'", double1 == (-3267.2563597333847d));
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 10, (-200000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-399980.0f) + "'", float2 == (-399980.0f));
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(85128.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 534874.9988295839d + "'", double1 == 534874.9988295839d);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(40110.0f, 64.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 80348.0f + "'", float2 == 80348.0f);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-10000.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-20000.0f) + "'", float2 == (-20000.0f));
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2662.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16725.839287712057d + "'", double1 == 16725.839287712057d);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(634.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3983.539484751858d + "'", double1 == 3983.539484751858d);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(320.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2010.6192982974676d + "'", double1 == 2010.6192982974676d);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-399980.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-198640.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-397280.0f) + "'", float2 == (-397280.0f));
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 42664.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1982680.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.98268E8f + "'", float2 == 1.98268E8f);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 4808800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 4256772.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4256772.0f + "'", float2 == 4256772.0f);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1278880.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8035440.025645829d + "'", double1 == 8035440.025645829d);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 1780.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 178000.0f + "'", float2 == 178000.0f);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 1.98268E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 220.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-198640.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1248091.929418153d) + "'", double1 == (-1248091.929418153d));
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 18.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 576.0f + "'", float2 == 576.0f);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(22276.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44656.0f + "'", float2 == 44656.0f);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (short) 1, 214.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 430.0f + "'", float2 == 430.0f);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-200.0f) + "'", float2 == (-200.0f));
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(42682.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 268178.9152810391d + "'", double1 == 268178.9152810391d);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(20200.0f, 222562.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 485524.0f + "'", float2 == 485524.0f);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(628.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3945.84037290878d + "'", double1 == 3945.84037290878d);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 44656.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1428992.0f + "'", float2 == 1428992.0f);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(40000.0f, 20.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 80040.0f + "'", float2 == 80040.0f);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1428992.0f, 4.128322E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.285224E8f + "'", float2 == 8.285224E8f);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 89104.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 89104.0f + "'", float2 == 89104.0f);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 21280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 212800.0f + "'", float2 == 212800.0f);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(44656.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 89310.0f + "'", float2 == 89310.0f);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(89310.0f, 89104.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 356828.0f + "'", float2 == 356828.0f);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(44656.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 280581.9230774116d + "'", double1 == 280581.9230774116d);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-32.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-32.0f) + "'", float2 == (-32.0f));
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-100.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-628.3185307179587d) + "'", double1 == (-628.3185307179587d));
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 8.285224E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 40470.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 628.3185307179587d + "'", double1 == 628.3185307179587d);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 21280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(386.0f, 21280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 43332.0f + "'", float2 == 43332.0f);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.0f), 356828.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 713654.0f + "'", float2 == 713654.0f);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-0.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 83800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-83800.0f) + "'", float2 == (-83800.0f));
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(640.0f, 332.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1944.0f + "'", float2 == 1944.0f);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-19864.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-399980.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.879806E7f) + "'", float2 == (-3.879806E7f));
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2128000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.337061833367816E7d + "'", double1 == 1.337061833367816E7d);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(20440.0f, 44656.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 130192.0f + "'", float2 == 130192.0f);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1982680.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2457545844838822E7d + "'", double1 == 1.2457545844838822E7d);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 356828.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1418496E7f + "'", float2 == 1.1418496E7f);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5200.0f + "'", float2 == 5200.0f);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2000002.0f), 394.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3999216.0f) + "'", float2 == (-3999216.0f));
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2404400.0f, 21280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4851360.0f + "'", float2 == 4851360.0f);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(68.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 427.2566008882119d + "'", double1 == 427.2566008882119d);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4256772.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.674608728641346E7d + "'", double1 == 2.674608728641346E7d);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 20200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1332.0f, (-100.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2464.0f + "'", float2 == 2464.0f);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(576.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3619.1147369354417d + "'", double1 == 3619.1147369354417d);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(356828.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 713850.0f + "'", float2 == 713850.0f);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1000000.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2000020.0f + "'", float2 == 2000020.0f);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(130192.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 818020.4615123246d + "'", double1 == 818020.4615123246d);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(100220.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 200640.0f + "'", float2 == 200640.0f);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(220.0f, 386.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1212.0f + "'", float2 == 1212.0f);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 1000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1000.0f) + "'", float2 == (-1000.0f));
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(634.0f, 880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3028.0f + "'", float2 == 3028.0f);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-399980.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2513148.459165691d) + "'", double1 == (-2513148.459165691d));
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 44656.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-200.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1256.6370614359173d) + "'", double1 == (-1256.6370614359173d));
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 100220.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1002200.0f + "'", float2 == 1002200.0f);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(40398.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 253828.12003944092d + "'", double1 == 253828.12003944092d);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(21340.0f, 178000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 398680.0f + "'", float2 == 398680.0f);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1944.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19440.0f + "'", float2 == 19440.0f);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 222562.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(89104.0f, (-83800.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10608.0f + "'", float2 == 10608.0f);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(10000.0f, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20000.0f + "'", float2 == 20000.0f);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 80002.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 160004.0f + "'", float2 == 160004.0f);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 634.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 2000020.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.00002E8f + "'", float2 == 2.00002E8f);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(713654.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4484020.32720994d + "'", double1 == 4484020.32720994d);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(404.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2538.406864100553d + "'", double1 == 2538.406864100553d);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0f, 1332.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2666.0f + "'", float2 == 2666.0f);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4045580.0f, 178000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8447160.0f + "'", float2 == 8447160.0f);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 19440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1885680.0f + "'", float2 == 1885680.0f);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(332.0f, 386.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1436.0f + "'", float2 == 1436.0f);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 80002.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1000000.0f), 10000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1980000.0f) + "'", float2 == (-1980000.0f));
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4039800.0f, (-0.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8079600.0f + "'", float2 == 8079600.0f);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 4256772.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (short) 10, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(640.0f, 106.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1492.0f + "'", float2 == 1492.0f);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2104440.0f, 178000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4564880.0f + "'", float2 == 4564880.0f);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-3.879806E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.879806E7f + "'", float2 == 3.879806E7f);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 83800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4357600.0f + "'", float2 == 4357600.0f);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-20000.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-125663.70614359173d) + "'", double1 == (-125663.70614359173d));
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(40470.0f, (-2000002.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3919064.0f) + "'", float2 == (-3919064.0f));
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(214.0f, (-19864.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-39300.0f) + "'", float2 == (-39300.0f));
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(21340.0f, 86136.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 214952.0f + "'", float2 == 214952.0f);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 170468.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-170468.0f) + "'", float2 == (-170468.0f));
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(10.0f, 1000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2020.0f + "'", float2 == 2020.0f);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 8257416.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8257416.0f + "'", float2 == 8257416.0f);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 1885680.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3771360.0f + "'", float2 == 3771360.0f);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1428992.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.428992E7f + "'", float2 == 1.428992E7f);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (short) -1, 21340.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 42678.0f + "'", float2 == 42678.0f);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 214.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-214.0f) + "'", float2 == (-214.0f));
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-10000.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-62831.853071795864d) + "'", double1 == (-62831.853071795864d));
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(848.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5328.141140488289d + "'", double1 == 5328.141140488289d);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1000.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6283.185307179586d) + "'", double1 == (-6283.185307179586d));
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-764.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1528.0f) + "'", float2 == (-1528.0f));
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 240440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.250288E7f + "'", float2 == 1.250288E7f);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 291616.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) 100, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 202.0f + "'", float2 == 202.0f);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(332.0f, 8257416.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6515496E7f + "'", float2 == 1.6515496E7f);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3771360.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3696153740084805E7d + "'", double1 == 2.3696153740084805E7d);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(628.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1258.0f + "'", float2 == 1258.0f);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.00002E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2566496278065317E9d + "'", double1 == 1.2566496278065317E9d);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(428944.0f, (-214.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 857460.0f + "'", float2 == 857460.0f);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1980000.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.244070690821558E7d) + "'", double1 == (-1.244070690821558E7d));
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 5200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5200.0f + "'", float2 == 5200.0f);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.256646E8f, 404.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6513299E9f + "'", float2 == 1.6513299E9f);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4045580.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.541912881501959E7d + "'", double1 == 2.541912881501959E7d);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 3028.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96896.0f + "'", float2 == 96896.0f);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) 0, 1.98268E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.96536E8f + "'", float2 == 3.96536E8f);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-764.0f), 11128.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20728.0f + "'", float2 == 20728.0f);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 384.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 384.0f + "'", float2 == 384.0f);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1428992.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8978621.538477171d + "'", double1 == 8978621.538477171d);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 394.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-394.0f) + "'", float2 == (-394.0f));
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(10000.0f, 19440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 58880.0f + "'", float2 == 58880.0f);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-3999216.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3999216.0f + "'", float2 == 3999216.0f);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 200.0f + "'", float2 == 200.0f);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-10000.0f), 178000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 336000.0f + "'", float2 == 336000.0f);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.283185307179586d) + "'", double1 == (-6.283185307179586d));
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 640.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6400.0f + "'", float2 == 6400.0f);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(100220.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 629700.8314855382d + "'", double1 == 629700.8314855382d);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1000.0f + "'", float2 == 1000.0f);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-200.0f), 192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-16.0f) + "'", float2 == (-16.0f));
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-397280.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(485524.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3050637.263083061d + "'", double1 == 3050637.263083061d);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3771360.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7542720.0f + "'", float2 == 7542720.0f);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 200640.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2006400.0f + "'", float2 == 2006400.0f);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(430.0f, 130192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 261244.0f + "'", float2 == 261244.0f);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(83800.0f, 240440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 648480.0f + "'", float2 == 648480.0f);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 18.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(64.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 402.1238596594935d + "'", double1 == 402.1238596594935d);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 857460.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8574600.0f + "'", float2 == 8574600.0f);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 21280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-21280.0f) + "'", float2 == (-21280.0f));
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(160004.0f, 398680.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1117368.0f + "'", float2 == 1117368.0f);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0f, 192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 386.0f + "'", float2 == 386.0f);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 160004.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 320008.0f + "'", float2 == 320008.0f);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1.1418496E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1418496E8f + "'", float2 == 1.1418496E8f);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.276644E8f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6553288E9f + "'", float2 == 1.6553288E9f);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-399980.0f), (-1000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-801960.0f) + "'", float2 == (-801960.0f));
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1428992.0f, 440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2858864.0f + "'", float2 == 2858864.0f);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-399980.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.9998E7f) + "'", float2 == (-3.9998E7f));
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-382.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3820.0f) + "'", float2 == (-3820.0f));
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2464.0f, 42664.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 90256.0f + "'", float2 == 90256.0f);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1976.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12415.574166986862d + "'", double1 == 12415.574166986862d);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(96896.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 608815.5235244732d + "'", double1 == 608815.5235244732d);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2104440.0f, 156.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4209192.0f + "'", float2 == 4209192.0f);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-10000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-20000.0f) + "'", float2 == (-20000.0f));
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-200.0f), 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-296.0f) + "'", float2 == (-296.0f));
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.879806E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.43775400539072E8d) + "'", double1 == (-2.43775400539072E8d));
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.6515496E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(336000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2111150.263212341d + "'", double1 == 2111150.263212341d);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 96896.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96896.0f + "'", float2 == 96896.0f);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(38.0f, (-3.879806E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.759605E7f) + "'", float2 == (-7.759605E7f));
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-764.0f), 1332.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1136.0f + "'", float2 == 1136.0f);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4357600.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7379608294565763E7d + "'", double1 == 2.7379608294565763E7d);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2104440.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3222586487841008E7d + "'", double1 == 1.3222586487841008E7d);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(40000.0f, 640.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 81280.0f + "'", float2 == 81280.0f);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4039800.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.538281200394409E7d + "'", double1 == 2.538281200394409E7d);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-1980000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.336E7f) + "'", float2 == (-6.336E7f));
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(38.0f, 2006400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4012876.0f + "'", float2 == 4012876.0f);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(576.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1152.0f + "'", float2 == 1152.0f);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(40470.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 254280.50938155784d + "'", double1 == 254280.50938155784d);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(127888.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 803544.002564583d + "'", double1 == 803544.002564583d);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) 10, 2020.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4060.0f + "'", float2 == 4060.0f);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-3.9998E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(386.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2425.3095285713202d + "'", double1 == 2425.3095285713202d);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-83800.0f), (-214.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-168028.0f) + "'", float2 == (-168028.0f));
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(222562.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1398398.288336503d + "'", double1 == 1398398.288336503d);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(100.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 304.0f + "'", float2 == 304.0f);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-83800.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-526530.9287416494d) + "'", double1 == (-526530.9287416494d));
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 96896.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3100672.0f + "'", float2 == 3100672.0f);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 394.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4045580.0f, 42682.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8176524.0f + "'", float2 == 8176524.0f);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4012876.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5213643522733588E7d + "'", double1 == 2.5213643522733588E7d);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 430.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13760.0f + "'", float2 == 13760.0f);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4851360.0f, (-52.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9702616.0f + "'", float2 == 9702616.0f);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(222562.0f, 8.276644E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.655774E9f + "'", float2 == 1.655774E9f);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-801960.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-37728.0f), 6400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-62656.0f) + "'", float2 == (-62656.0f));
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7542720.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.739230748016961E7d + "'", double1 == 4.739230748016961E7d);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 2662.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 85184.0f + "'", float2 == 85184.0f);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 3100672.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.100672E8f + "'", float2 == 3.100672E8f);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 17580.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1758000.0f + "'", float2 == 1758000.0f);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(10.0f, 20.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 60.0f + "'", float2 == 60.0f);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 6400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 332800.0f + "'", float2 == 332800.0f);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1980000.0f), (-10.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3960020.0f) + "'", float2 == (-3960020.0f));
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-397280.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2496183.858836306d) + "'", double1 == (-2496183.858836306d));
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 100220.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100220.0f) + "'", float2 == (-100220.0f));
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(40400.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 80800.0f + "'", float2 == 80800.0f);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(220.0f, 200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 840.0f + "'", float2 == 840.0f);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8447160.0f, 840.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6896E7f + "'", float2 == 1.6896E7f);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 320.0f + "'", float2 == 320.0f);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 3.879806E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.879806E7f) + "'", float2 == (-3.879806E7f));
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 11128.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 578656.0f + "'", float2 == 578656.0f);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 1780.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 92560.0f + "'", float2 == 92560.0f);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 178000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 4357600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.3576E7f + "'", float2 == 4.3576E7f);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 857460.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.317362E7f + "'", float2 == 8.317362E7f);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-801960.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8019600.0f) + "'", float2 == (-8019600.0f));
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(170468.0f, 320.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 341576.0f + "'", float2 == 341576.0f);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(106.0f, 18.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 248.0f + "'", float2 == 248.0f);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 1.6513299E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.65133E11f + "'", float2 == 1.65133E11f);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 3999216.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.999216E8f + "'", float2 == 3.999216E8f);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(20020.0f, 1982680.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4005400.0f + "'", float2 == 4005400.0f);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-801960.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5038863.288945741d) + "'", double1 == (-5038863.288945741d));
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1492.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2984.0f + "'", float2 == 2984.0f);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(40000.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 80000.0f + "'", float2 == 80000.0f);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 80348.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8034800.0f + "'", float2 == 8034800.0f);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 1117368.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(60.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 120.0f + "'", float2 == 120.0f);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(68.0f, (-20000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-39864.0f) + "'", float2 == (-39864.0f));
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-3999216.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3999216.0f) + "'", float2 == (-3999216.0f));
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(648480.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4074520.0079998183d + "'", double1 == 4074520.0079998183d);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-394.0f), (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-768.0f) + "'", float2 == (-768.0f));
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(20200.0f, 58880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 158160.0f + "'", float2 == 158160.0f);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8079600.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6159304E7f + "'", float2 == 1.6159304E7f);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(648480.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1297160.0f + "'", float2 == 1297160.0f);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 2464.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 24640.0f + "'", float2 == 24640.0f);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1258.0f, 80800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 164116.0f + "'", float2 == 164116.0f);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1944.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12214.512237157116d + "'", double1 == 12214.512237157116d);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 1.1418496E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1418496E8f + "'", float2 == 1.1418496E8f);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.96536E8f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.93072E8f + "'", float2 == 7.93072E8f);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 83800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 838000.0f + "'", float2 == 838000.0f);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 10, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(20.0f, (-100.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-160.0f) + "'", float2 == (-160.0f));
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4005400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5166670429377116E7d + "'", double1 == 2.5166670429377116E7d);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-198640.0f), 356828.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 316376.0f + "'", float2 == 316376.0f);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(440.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2764.601535159018d + "'", double1 == 2764.601535159018d);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 21280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21280.0f + "'", float2 == 21280.0f);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(428944.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2695134.6384028406d + "'", double1 == 2695134.6384028406d);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 8176524.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.176524E8f + "'", float2 == 8.176524E8f);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(104.0f, 40000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 80208.0f + "'", float2 == 80208.0f);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 4012876.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.012876E7f + "'", float2 == 4.012876E7f);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(20440.0f, 19440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 79760.0f + "'", float2 == 79760.0f);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 58880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 588800.0f + "'", float2 == 588800.0f);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-100220.0f), 20440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-159560.0f) + "'", float2 == (-159560.0f));
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) -1, 386.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 770.0f + "'", float2 == 770.0f);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 634.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(38.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 238.76104167282426d + "'", double1 == 238.76104167282426d);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-62656.0f), 4851360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9577408.0f + "'", float2 == 9577408.0f);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(18.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 113.09733552923255d + "'", double1 == 113.09733552923255d);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-62656.0f), (-200.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-125712.0f) + "'", float2 == (-125712.0f));
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2000020.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2566496278065316E7d + "'", double1 == 1.2566496278065316E7d);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.256646E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.187803532581862E9d + "'", double1 == 5.187803532581862E9d);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(304.0f, 248.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1104.0f + "'", float2 == 1104.0f);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-83800.0f), (-394.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-168388.0f) + "'", float2 == (-168388.0f));
    }
}

