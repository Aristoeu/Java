package Perimeter;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02001");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8754832.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.500823178922567E7d + "'", double1 == 5.500823178922567E7d);
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(162928.0f, 89104.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 504064.0f + "'", float2 == 504064.0f);
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-1.2500508E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2125493E10f) + "'", float2 == (-1.2125493E10f));
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.270452E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0548855954236093E8d + "'", double1 == 2.0548855954236093E8d);
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(23520.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 147780.51842486387d + "'", double1 == 147780.51842486387d);
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 3.516E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.032E8f + "'", float2 == 7.032E8f);
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.6337306E8f, (-168028.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3264101E9f + "'", float2 == 1.3264101E9f);
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2649744.0f, 26740.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5352968.0f + "'", float2 == 5352968.0f);
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 8.176524E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.1765243E9f + "'", float2 == 8.1765243E9f);
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-382.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3820.0f) + "'", float2 == (-3820.0f));
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4855240.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0506372630830616E7d) + "'", double1 == (-3.0506372630830616E7d));
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.7536342E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.54352E8f, 6.859429E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0458926E9f + "'", float2 == 1.0458926E9f);
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.5322015E9f, 1629280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.067661E9f + "'", float2 == 9.067661E9f);
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 1.344512E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(38784.0f, 3771360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7620288.0f + "'", float2 == 7620288.0f);
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 1.9154816E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9154816E9f + "'", float2 == 1.9154816E9f);
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-2.7574346E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.514869E8f) + "'", float2 == (-5.514869E8f));
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9700.0f, 1.1600113E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.320042E9f + "'", float2 == 2.320042E9f);
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.907264E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8266878448892152E8d + "'", double1 == 1.8266878448892152E8d);
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-382.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-38200.0f) + "'", float2 == (-38200.0f));
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-1.5512214E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.066351E12f) + "'", float2 == (-8.066351E12f));
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1486144.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9337718.1451531d + "'", double1 == 9337718.1451531d);
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.244737E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.820913380499244E9d + "'", double1 == 7.820913380499244E9d);
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 1.915724E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8582523E9f + "'", float2 == 1.8582523E9f);
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 1.6513299E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6513299E9f + "'", float2 == 1.6513299E9f);
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 40398.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4039800.0f + "'", float2 == 4039800.0f);
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35000.0f + "'", float2 == 35000.0f);
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 707000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 222562.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.802364E8f, 1493870.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.6346054E8f + "'", float2 == 5.6346054E8f);
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1.2673242E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2673242E8f) + "'", float2 == (-1.2673242E8f));
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.283302E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4346408874537008E10d + "'", double1 == 1.4346408874537008E10d);
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(158160.0f, 7.69237E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5387903E9f + "'", float2 == 1.5387903E9f);
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 2.4778808E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.477881E10f + "'", float2 == 2.477881E10f);
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 100, 2.778352E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.556706E8f + "'", float2 == 5.556706E8f);
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 4.759155E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.759155E7f) + "'", float2 == (-4.759155E7f));
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 1.7464512E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.7464512E7f) + "'", float2 == (-1.7464512E7f));
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-1980000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.98E7f) + "'", float2 == (-1.98E7f));
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1104.0f, 8.317362E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6634944E8f + "'", float2 == 1.6634944E8f);
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-1.6036896E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6036896E7f + "'", float2 == 1.6036896E7f);
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.21204E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6465027841252704E9d + "'", double1 == 2.6465027841252704E9d);
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(200640.0f, (-4.759155E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.478182E7f) + "'", float2 == (-9.478182E7f));
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 4.119547E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.1421645E9f + "'", float2 == 2.1421645E9f);
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1944.0f, 1263936.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2531760.0f + "'", float2 == 2531760.0f);
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.7525528E7f, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5051056E7f + "'", float2 == 3.5051056E7f);
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.7456552E7f), 6.4107E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2815909E11f + "'", float2 == 1.2815909E11f);
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8952160.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.624808017952081E7d + "'", double1 == 5.624808017952081E7d);
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.3947754E10f, (-1.194676E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5506157E10f + "'", float2 == 2.5506157E10f);
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-7.93072E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.983018337935529E9d) + "'", double1 == (-4.983018337935529E9d));
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 4045580.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4045580.0f + "'", float2 == 4045580.0f);
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.6309226E8f, 3.5935496E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.980555E8f + "'", float2 == 7.980555E8f);
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(10608.0f, 8754832.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.753088E7f + "'", float2 == 1.753088E7f);
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1248.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-1002200.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0022E8f) + "'", float2 == (-1.0022E8f));
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 8.083215E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.083215E8f) + "'", float2 == (-8.083215E8f));
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.759605E7f, 6.6337306E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4819382E9f + "'", float2 == 1.4819382E9f);
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.207509E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.785248521425832E10d + "'", double1 == 5.785248521425832E10d);
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 170468.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 340936.0f + "'", float2 == 340936.0f);
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.13654E7f, (-2567720.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3759536E8f + "'", float2 == 1.3759536E8f);
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-3.172963E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.172963E10f) + "'", float2 == (-3.172963E10f));
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.52516E10f, 320000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0503842E10f + "'", float2 == 3.0503842E10f);
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 2016000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.016E7f + "'", float2 == 2.016E7f);
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7998412.0f), (-1.8375389E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.835046E8f) + "'", float2 == (-3.835046E8f));
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1428992.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.001472E7f + "'", float2 == 5.001472E7f);
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.999216E8f, 4809464.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0946214E8f + "'", float2 == 8.0946214E8f);
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 2404400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.250288E8f + "'", float2 == 1.250288E8f);
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-8.083215E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.3115459E9f, 12800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.6231173E9f + "'", float2 == 6.6231173E9f);
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1.0458926E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0458926E11f + "'", float2 == 1.0458926E11f);
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.3264101E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.33408052701283E9d + "'", double1 == 8.33408052701283E9d);
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 214.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2140.0f + "'", float2 == 2140.0f);
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.012876E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.521364352273359E8d) + "'", double1 == (-2.521364352273359E8d));
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7490.0f, 42682.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100344.0f + "'", float2 == 100344.0f);
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2984.0f, (-3.097426E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.194852E11f) + "'", float2 == (-6.194852E11f));
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1134736.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.2409407E10f, 377280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4819569E10f + "'", float2 == 2.4819569E10f);
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1944968.0f, 4060.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3898056.0f + "'", float2 == 3898056.0f);
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-631208.0f), (-1681920.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4626256.0f) + "'", float2 == (-4626256.0f));
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 7.756115E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(170688.0f, 1688720.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3718816.0f + "'", float2 == 3718816.0f);
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-1.0341418E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.3092536E9f) + "'", float2 == (-3.3092536E9f));
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-168388.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-336776.0f) + "'", float2 == (-336776.0f));
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7757908.0f), 2616.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5510584E7f) + "'", float2 == (-1.5510584E7f));
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40212.385965949354d + "'", double1 == 40212.385965949354d);
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7143688.0f, 9.577408E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.929769E9f + "'", float2 == 1.929769E9f);
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.096573E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.889971713708218E9d) + "'", double1 == (-6.889971713708218E9d));
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.201344E8f, 110192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2404892E9f + "'", float2 == 1.2404892E9f);
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.285224E8f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6570447E9f + "'", float2 == 1.6570447E9f);
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.9131254E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2020521253275621E10d + "'", double1 == 1.2020521253275621E10d);
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 322816.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 645632.0f + "'", float2 == 645632.0f);
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.5502149E8f), 640080.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.087628E8f) + "'", float2 == (-3.087628E8f));
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.2062915E8f), 2.10444E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.203703E8f) + "'", float2 == (-2.203703E8f));
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1446668.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9089683.121966878d + "'", double1 == 9089683.121966878d);
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 8079600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.585472E8f + "'", float2 == 2.585472E8f);
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.5542823E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.765843397917993E11d + "'", double1 == 9.765843397917993E11d);
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.087628E8f), (-801960.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.1912954E8f) + "'", float2 == (-6.1912954E8f));
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.1909104E8f), (-1.67384E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.716589E8f) + "'", float2 == (-6.716589E8f));
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.087628E8f), 6360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.175129E8f) + "'", float2 == (-6.175129E8f));
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6096.0f, 1.486144E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9722892E10f + "'", float2 == 2.9722892E10f);
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-74396.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-74396.0f) + "'", float2 == (-74396.0f));
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.0290941E9f), (-1.6192524E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.296693E9f) + "'", float2 == (-7.296693E9f));
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 3.248021E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.248021E11f) + "'", float2 == (-3.248021E11f));
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.150912E7f, 480880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.398E7f + "'", float2 == 8.398E7f);
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-85360.0f), 5.4528704E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0888669E8f + "'", float2 == 1.0888669E8f);
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 2616.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2616.0f) + "'", float2 == (-2616.0f));
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.5971842E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.003540404697197E9d + "'", double1 == 1.003540404697197E9d);
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 8.6074104E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.4758533E9f + "'", float2 == 4.4758533E9f);
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.238967E9f), 1.9427952E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.4390781E9f) + "'", float2 == (-2.4390781E9f));
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 2.7179224E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7179223E9f + "'", float2 == 2.7179223E9f);
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-200.0f), (-799960.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1600320.0f) + "'", float2 == (-1600320.0f));
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 640080.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.208776E7f + "'", float2 == 6.208776E7f);
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-3.087628E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.88041E9f) + "'", float2 == (-9.88041E9f));
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 349280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-349280.0f) + "'", float2 == (-349280.0f));
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1084432.0f, (-296.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2168272.0f + "'", float2 == 2168272.0f);
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4060.0f, 1944968.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3898056.0f + "'", float2 == 3898056.0f);
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(524.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3292.3891009621034d + "'", double1 == 3292.3891009621034d);
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-100.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10000.0f) + "'", float2 == (-10000.0f));
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.784847E8f, 9.022029E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9374099E9f + "'", float2 == 1.9374099E9f);
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.0572787E9f), 2.4973092E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.800609E8f + "'", float2 == 8.800609E8f);
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-4.510675E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.02135E7f) + "'", float2 == (-9.02135E7f));
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-67072.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-134144.0f) + "'", float2 == (-134144.0f));
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.189564E7f, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4379128E8f + "'", float2 == 1.4379128E8f);
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 4.1343034E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.1498378E10f + "'", float2 == 2.1498378E10f);
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.5502149E8f), 240440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.095621E8f) + "'", float2 == (-3.095621E8f));
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-3879204.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3879204.0f) + "'", float2 == (-3879204.0f));
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-485524.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3050637.263083061d) + "'", double1 == (-3050637.263083061d));
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 4.012876E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.894673E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.58868780523157E10d + "'", double1 == 5.58868780523157E10d);
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 24640.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2464000.0f + "'", float2 == 2464000.0f);
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(326736.0f, 1371844.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3397160.0f + "'", float2 == 3397160.0f);
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 21280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 744800.0f + "'", float2 == 744800.0f);
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.097426E8f), 200876.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.1908346E8f) + "'", float2 == (-6.1908346E8f));
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-76840.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-768400.0f) + "'", float2 == (-768400.0f));
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.373439E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1195943616103658E8d + "'", double1 == 2.1195943616103658E8d);
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1.2673242E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2673241E10f + "'", float2 == 1.2673241E10f);
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 2.7452624E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 8.252644E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.252644E10f + "'", float2 == 8.252644E10f);
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(85360.0f, 1.2402659E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4807025E9f + "'", float2 == 2.4807025E9f);
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1.5946522E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 3.3026533E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3026532E12f + "'", float2 == 3.3026532E12f);
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-2562728.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2562728.0f) + "'", float2 == (-2562728.0f));
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1.8985292E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.8985292E9f) + "'", float2 == (-1.8985292E9f));
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5.779655E13f, 2.8342208E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1559877E14f + "'", float2 == 1.1559877E14f);
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-3.9998E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.9998E7f) + "'", float2 == (-3.9998E7f));
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.52982E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2178513160988647E8d + "'", double1 == 2.2178513160988647E8d);
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.2402659E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.792820203415712E9d + "'", double1 == 7.792820203415712E9d);
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0458926E11f, 2.2554392E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0962961E11f + "'", float2 == 2.0962961E11f);
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 1L, 64.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 130.0f + "'", float2 == 130.0f);
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.2673242E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.96283254154571E8d) + "'", double1 == (-7.96283254154571E8d));
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(852.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5353.2738817170075d + "'", double1 == 5353.2738817170075d);
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1872.0f, (-2.10444E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.2085056E7f) + "'", float2 == (-4.2085056E7f));
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-1.1396162E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.9886566E11f) + "'", float2 == (-3.9886566E11f));
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.759605E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8755034868880194E8d + "'", double1 == 4.8755034868880194E8d);
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1.5512263E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.429292E12f + "'", float2 == 5.429292E12f);
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-881200.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 881200.0f + "'", float2 == 881200.0f);
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-100000.0f), 2616.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-194768.0f) + "'", float2 == (-194768.0f));
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 2.2332318E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2332318E10f + "'", float2 == 2.2332318E10f);
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-764.0f), 3.9964736E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.992932E8f + "'", float2 == 7.992932E8f);
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 2.8975222E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.4888733E10f), 1.77296E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.9742E10f) + "'", float2 == (-6.9742E10f));
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.486144E8f, 1.720268E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3163418E8f + "'", float2 == 3.3163418E8f);
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.577408E8f, (-7998412.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8994848E9f + "'", float2 == 1.8994848E9f);
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(476736.0f, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 953470.0f + "'", float2 == 953470.0f);
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1.250288E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.250288E9f + "'", float2 == 1.250288E9f);
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.180352E8f, 222562.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6365156E9f + "'", float2 == 1.6365156E9f);
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 624.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6240.0f + "'", float2 == 6240.0f);
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6240.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39207.076316800616d + "'", double1 == 39207.076316800616d);
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-7.84375E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.879806E10f), (-168388.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.759646E10f) + "'", float2 == (-7.759646E10f));
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 5.0699926E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.0699926E8f) + "'", float2 == (-5.0699926E8f));
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.053217E8f, 2128000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4148995E9f + "'", float2 == 1.4148995E9f);
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-5.356288E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.8747007E10f) + "'", float2 == (-1.8747007E10f));
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.13654E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.4840203272099406E8d + "'", double1 == 4.4840203272099406E8d);
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 2219360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-8.763765E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.506435822693764E8d) + "'", double1 == (-5.506435822693764E8d));
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 6.4107E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.28214E9f + "'", float2 == 1.28214E9f);
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 713656.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.13656E7f + "'", float2 == 7.13656E7f);
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5.429292E12f, (-3.8798062E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.098972E12f + "'", float2 == 3.098972E12f);
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.313637E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.082019606570888E9d + "'", double1 == 2.082019606570888E9d);
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 1.6515496E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6515496E8f) + "'", float2 == (-1.6515496E8f));
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-3.9274344E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0422659E9f) + "'", float2 == (-2.0422659E9f));
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.605303E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.150234392402206E13d + "'", double1 == 4.150234392402206E13d);
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-167480.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 167480.0f + "'", float2 == 167480.0f);
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.516E8f, (-7.93072E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.82944E8f) + "'", float2 == (-8.82944E8f));
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.4E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.021238596594935E8d + "'", double1 == 4.021238596594935E8d);
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.4358504E7f), 9702616.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9311776.0f) + "'", float2 == (-9311776.0f));
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1002200.0f, 2206.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2008812.0f + "'", float2 == 2008812.0f);
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 680.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 680.0f + "'", float2 == 680.0f);
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(10400.0f, (-10600.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-400.0f) + "'", float2 == (-400.0f));
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3397160.0f, 874400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8543120.0f + "'", float2 == 8543120.0f);
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1200.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7539.822368615503d + "'", double1 == 7539.822368615503d);
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(12800.0f, 4.012876E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.028312E7f + "'", float2 == 8.028312E7f);
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.8305633E9f, 1.4148995E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0490925E10f + "'", float2 == 1.0490925E10f);
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4534768.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8492787669068158E7d + "'", double1 == 2.8492787669068158E7d);
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.95661E7f), 8.72328E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5333408E7f + "'", float2 == 1.5333408E7f);
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.7179223E9f, 3.4836E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.5055165E9f + "'", float2 == 5.5055165E9f);
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.0572787E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2926263426277225E10d) + "'", double1 == (-1.2926263426277225E10d));
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3516.0f, 1.6036896E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2080824E7f + "'", float2 == 3.2080824E7f);
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.341878E8f), 1370008.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6656356E9f) + "'", float2 == (-1.6656356E9f));
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.0589768E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5503303190880882E10d + "'", double1 == 2.5503303190880882E10d);
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2206.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13860.706787638168d + "'", double1 == 13860.706787638168d);
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5324.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33451.678575424114d + "'", double1 == 33451.678575424114d);
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8009240.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.032353908967503E7d + "'", double1 == 5.032353908967503E7d);
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.7525528E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-1.67384E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.67384E8f) + "'", float2 == (-1.67384E8f));
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.428992E7f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.857984E7f + "'", float2 == 2.857984E7f);
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.9742E10f), (-20440.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3948404E11f) + "'", float2 == (-1.3948404E11f));
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1.5512263E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5512264E12f + "'", float2 == 1.5512264E12f);
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(80348.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 504841.3730612654d + "'", double1 == 504841.3730612654d);
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (-948304.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.48304E7f) + "'", float2 == (-9.48304E7f));
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 838000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.3576E7f + "'", float2 == 4.3576E7f);
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.28214E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.055923410809164E9d + "'", double1 == 8.055923410809164E9d);
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 4.567484E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-5.58082E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.116164E8f) + "'", float2 == (-1.116164E8f));
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-832.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-80704.0f) + "'", float2 == (-80704.0f));
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(117972.0f, 1.5725456E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1686856E7f + "'", float2 == 3.1686856E7f);
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 2.0256E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0256E7f) + "'", float2 == (-2.0256E7f));
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-83800.0f), 240440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 313280.0f + "'", float2 == 313280.0f);
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5.0699926E8f), (-3.095621E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6331228E9f) + "'", float2 == (-1.6331228E9f));
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-42592.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-267613.4286033929d) + "'", double1 == (-267613.4286033929d));
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 2.2837844E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.30811E10f + "'", float2 == 7.30811E10f);
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(633112.0f, 4.567484E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.134969E12f + "'", float2 == 9.134969E12f);
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 8.137232E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.137232E7f + "'", float2 == 8.137232E7f);
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.9489312E8f, (-3919064.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.819481E8f + "'", float2 == 3.819481E8f);
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-30.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.689432E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0615014319879022E8d + "'", double1 == 1.0615014319879022E8d);
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1193716.0f), (-9.478182E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9195107E8f) + "'", float2 == (-1.9195107E8f));
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-4692656.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4692656.0f) + "'", float2 == (-4692656.0f));
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 5.75949E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 4.568726E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.568726E10f + "'", float2 == 4.568726E10f);
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-8226192.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.1686688708438255E7d) + "'", double1 == (-5.1686688708438255E7d));
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1104.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11040.0f + "'", float2 == 11040.0f);
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-168192.0f), 1493870.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2651356.0f + "'", float2 == 2651356.0f);
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 1.1433238E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1433238E8f) + "'", float2 == (-1.1433238E8f));
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 4.3576E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.3576E7f) + "'", float2 == (-4.3576E7f));
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5.356288E8f), 1428992.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0683996E9f) + "'", float2 == (-1.0683996E9f));
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6036896E7f, 852.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2075496E7f + "'", float2 == 3.2075496E7f);
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 322816.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.22816E7f + "'", float2 == 3.22816E7f);
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-9.478182E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.955317639444815E8d) + "'", double1 == (-5.955317639444815E8d));
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 2168272.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-1.98268E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.98268E9f) + "'", float2 == (-1.98268E9f));
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 2.9725114E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9725114E10f + "'", float2 == 2.9725114E10f);
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 2662.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2662.0f) + "'", float2 == (-2662.0f));
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6622022E8f, (-877288.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.306859E8f + "'", float2 == 3.306859E8f);
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.534768E8f, 2049600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.110528E8f + "'", float2 == 9.110528E8f);
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-1.0022E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0022E8f) + "'", float2 == (-1.0022E8f));
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.6034018E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.007447037993789E9d) + "'", double1 == (-1.007447037993789E9d));
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1681920.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3363840.0f) + "'", float2 == (-3363840.0f));
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.2672E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.962052421257971E10d) + "'", double1 == (-7.962052421257971E10d));
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4692656.0f), 155264.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9074784.0f) + "'", float2 == (-9074784.0f));
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1200.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7539.822368615503d) + "'", double1 == (-7539.822368615503d));
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.9251536E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2096096813583887E8d + "'", double1 == 1.2096096813583887E8d);
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-588800.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3699539.50886734d) + "'", double1 == (-3699539.50886734d));
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 8543120.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8543120.0f + "'", float2 == 8543120.0f);
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-20020.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1941940.0f) + "'", float2 == (-1941940.0f));
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(79760.0f, 4808800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9777120.0f + "'", float2 == 9777120.0f);
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 2.7179223E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7179223E9f + "'", float2 == 2.7179223E9f);
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 4.996333E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.996333E11f + "'", float2 == 4.996333E11f);
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-20440.0f), 4.568726E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.137448E10f + "'", float2 == 9.137448E10f);
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1872.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11762.122895040186d + "'", double1 == 11762.122895040186d);
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 5324.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5324.0f + "'", float2 == 5324.0f);
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 1.6179872E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.2738432E8f, (-2030560.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5070752E8f + "'", float2 == 2.5070752E8f);
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.097426E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9461701030621212E9d) + "'", double1 == (-1.9461701030621212E9d));
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-8.252644E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.252644E8f + "'", float2 == 8.252644E8f);
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.256646E8f, 89310.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6515077E9f + "'", float2 == 1.6515077E9f);
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-1.2500508E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2500508E9f) + "'", float2 == (-1.2500508E9f));
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(167480.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1052307.875246437d + "'", double1 == 1052307.875246437d);
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28160.0f + "'", float2 == 28160.0f);
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-167480.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.624556E7f) + "'", float2 == (-1.624556E7f));
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.835046E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4096305182212667E9d) + "'", double1 == (-2.4096305182212667E9d));
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-8.57243E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.386216873609962E8d) + "'", double1 == (-5.386216873609962E8d));
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-9065608.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9065608.0f) + "'", float2 == (-9065608.0f));
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 40400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2100800.0f + "'", float2 == 2100800.0f);
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-4.759155E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.759155E9f) + "'", float2 == (-4.759155E9f));
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (-200240.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0024E7f) + "'", float2 == (-2.0024E7f));
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-397282.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2496196.4252069206d) + "'", double1 == (-2496196.4252069206d));
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(158160.0f, 3.328E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.687632E7f + "'", float2 == 6.687632E7f);
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-6.9742E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.764974E12f) + "'", float2 == (-6.764974E12f));
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2676400.0f, (-1.2841203E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.5147126E8f) + "'", float2 == (-2.5147126E8f));
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 874400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1263936.0f, 5.75949E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1519005E12f + "'", float2 == 1.1519005E12f);
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1.7525528E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7525528E8f + "'", float2 == 1.7525528E8f);
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.083215E8f), 27714.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6165875E9f) + "'", float2 == (-1.6165875E9f));
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-9.061478E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.693494794420519E8d) + "'", double1 == (-5.693494794420519E8d));
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1920.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19200.0f + "'", float2 == 19200.0f);
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.2409407E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.797060679940594E10d + "'", double1 == 7.797060679940594E10d);
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 2707700.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 8004000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.004E8f + "'", float2 == 8.004E8f);
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(170984.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1074324.1565627945d + "'", double1 == 1074324.1565627945d);
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 1.5265885E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.93826E9f + "'", float2 == 7.93826E9f);
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3646240.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2910001594450496E7d) + "'", double1 == (-2.2910001594450496E7d));
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.1597168E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.286715558249326E7d + "'", double1 == 7.286715558249326E7d);
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 9777120.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.6243773E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.020626345901234E9d + "'", double1 == 1.020626345901234E9d);
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-881200.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.8975222E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8205669165594082E9d + "'", double1 == 1.8205669165594082E9d);
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2008812.0f, 2184640.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8386904.0f + "'", float2 == 8386904.0f);
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.496796E9f, 13320.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2993619E10f + "'", float2 == 1.2993619E10f);
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.9712963E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8669205381100774E9d + "'", double1 == 1.8669205381100774E9d);
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(304.0f, (-1.1433238E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.2866416E8f) + "'", float2 == (-2.2866416E8f));
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.51334E8f, 5.6346054E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4295891E9f + "'", float2 == 1.4295891E9f);
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-74396.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-467443.8541129325d) + "'", double1 == (-467443.8541129325d));
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4476080.0f, (-134144.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8683872.0f + "'", float2 == 8683872.0f);
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(42664.0f, (-7973260.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5861192E7f) + "'", float2 == (-1.5861192E7f));
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 85492.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2992220.0f + "'", float2 == 2992220.0f);
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-200640.0f), 2.481899E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.9637577E10f + "'", float2 == 4.9637577E10f);
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.0422659E9f), 1.0260488E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.0640108E9f) + "'", float2 == (-4.0640108E9f));
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.30192E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.180204615123247E7d + "'", double1 == 8.180204615123247E7d);
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.8806557E8f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.7613114E8f + "'", float2 == 5.7613114E8f);
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.10444E7f), 1.3726208E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4636384E7f) + "'", float2 == (-1.4636384E7f));
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-832.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1664.0f) + "'", float2 == (-1664.0f));
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 6.046168E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-76440.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-480286.6848808076d) + "'", double1 == (-480286.6848808076d));
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.9510816E7f, 11520.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.904467E7f + "'", float2 == 3.904467E7f);
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-9.061478E7f), 6.4107E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1009105E9f + "'", float2 == 1.1009105E9f);
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.6074104E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.408195455814476E8d + "'", double1 == 5.408195455814476E8d);
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-3.879806E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.879806E10f + "'", float2 == 3.879806E10f);
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 1.3264101E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3264101E9f) + "'", float2 == (-1.3264101E9f));
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-296.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1859.8228509251576d) + "'", double1 == (-1859.8228509251576d));
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 6.617316E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3160606E11f + "'", float2 == 2.3160606E11f);
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1.1519005E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0316514E13f + "'", float2 == 4.0316514E13f);
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.2672E10f), 3646240.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.5336707E10f) + "'", float2 == (-2.5336707E10f));
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(30280.0f, 28160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 116880.0f + "'", float2 == 116880.0f);
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 214.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21400.0f + "'", float2 == 21400.0f);
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-344944.0f), 3.3026533E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.6052994E11f + "'", float2 == 6.6052994E11f);
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.566370614359172d + "'", double1 == 12.566370614359172d);
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 193616.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4000.0f, 7070000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4148E7f + "'", float2 == 1.4148E7f);
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.5512264E12f, (-1.2389663E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0999747E12f + "'", float2 == 3.0999747E12f);
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 1.4866093E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4866093E10f + "'", float2 == 1.4866093E10f);
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.256646E8f, (-1.5861192E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6196068E9f + "'", float2 == 1.6196068E9f);
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.021598E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.668437451415486E8d + "'", double1 == 5.668437451415486E8d);
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 7.032E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4612E10f + "'", float2 == 2.4612E10f);
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4809464.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0218753540209163E7d + "'", double1 == 3.0218753540209163E7d);
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.6690323E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.305320996459103E9d + "'", double1 == 2.305320996459103E9d);
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-19864.0f), (-3.41336E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.830693E7f) + "'", float2 == (-6.830693E7f));
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(174256.0f, 5.779655E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.155931E14f + "'", float2 == 1.155931E14f);
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.568726E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.870615153286215E11d + "'", double1 == 2.870615153286215E11d);
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3980760.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.501185274340821E7d + "'", double1 == 2.501185274340821E7d);
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.556706E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4913812992861824E9d + "'", double1 == 3.4913812992861824E9d);
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-214.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1344.6016557364314d) + "'", double1 == (-1344.6016557364314d));
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.580136E10f, 7.484328E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.1752407E10f + "'", float2 == 5.1752407E10f);
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 8.276644E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6553288E9f + "'", float2 == 1.6553288E9f);
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.3788823E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4946958340002321E10d + "'", double1 == 1.4946958340002321E10d);
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.5845338E8f), (-520.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.1690778E8f) + "'", float2 == (-5.1690778E8f));
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 2.3788823E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3788823E9f + "'", float2 == 2.3788823E9f);
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 683224.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6832240.0f + "'", float2 == 6832240.0f);
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-8.422425E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.291965675949461E9d) + "'", double1 == (-5.291965675949461E9d));
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(163120.0f, (-1.116164E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.2290656E8f) + "'", float2 == (-2.2290656E8f));
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.4287056E7f, 1.830378E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.946497E8f + "'", float2 == 3.946497E8f);
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-3.172963E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8386528.0f), (-7.759605E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.7196515E8f) + "'", float2 == (-1.7196515E8f));
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.5734292E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6169332840099812E10d + "'", double1 == 1.6169332840099812E10d);
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1428992.0f, 8.028312E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6342422E8f + "'", float2 == 1.6342422E8f);
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-8.066351E12f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.06823795627543E13d) + "'", double1 == (-5.06823795627543E13d));
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 683224.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1036904.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6515059.977755742d) + "'", double1 == (-6515059.977755742d));
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.5683246E9f, (-4.759155E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.041466E9f + "'", float2 == 3.041466E9f);
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 111280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1128E7f + "'", float2 == 1.1128E7f);
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1780.0f, 4011000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8025560.0f + "'", float2 == 8025560.0f);
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.828E8f, (-7.759646E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5462733E11f) + "'", float2 == (-1.5462733E11f));
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.5913296E8f), (-344944.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.189558E8f) + "'", float2 == (-3.189558E8f));
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 1.2230792E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2230792E7f + "'", float2 == 1.2230792E7f);
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 178744.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5719808.0f + "'", float2 == 5719808.0f);
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.52982E7f, 8.285224E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7276411E9f + "'", float2 == 1.7276411E9f);
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(21400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 134460.16557364314d + "'", double1 == 134460.16557364314d);
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.467426E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.806966602740405E11d + "'", double1 == 2.806966602740405E11d);
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.2836992E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4348905105042213E13d + "'", double1 == 1.4348905105042213E13d);
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.534768E8f, 5519824.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.179932E8f + "'", float2 == 9.179932E8f);
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-167602.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-167602.0f) + "'", float2 == (-167602.0f));
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2080000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.306902543893354E7d + "'", double1 == 1.306902543893354E7d);
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1.1775408E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1775408E7f) + "'", float2 == (-1.1775408E7f));
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 1.929769E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.929769E10f + "'", float2 == 1.929769E10f);
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.1539299E8f), 1.0888669E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3012608E7f) + "'", float2 == (-1.3012608E7f));
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 8.894673E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.894673E9f + "'", float2 == 8.894673E9f);
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 1.98268E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0309936E10f + "'", float2 == 1.0309936E10f);
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.14389E7f, 4209192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9129618E8f + "'", float2 == 1.9129618E8f);
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(140000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 879645.943005142d + "'", double1 == 879645.943005142d);
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.0422659E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.283193481977374E10d) + "'", double1 == (-1.283193481977374E10d));
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.194835E8f), 8.285224E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.180777E8f + "'", float2 == 4.180777E8f);
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(857460.0f, (-9.478182E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.8784874E8f) + "'", float2 == (-1.8784874E8f));
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 4000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40000.0f + "'", float2 == 40000.0f);
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 861840.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8618400.0f + "'", float2 == 8618400.0f);
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.6515496E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0376992180798323E9d) + "'", double1 == (-1.0376992180798323E9d));
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(861840.0f, (-8714412.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5705144E7f) + "'", float2 == (-1.5705144E7f));
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.697576E7f, (-7.95661E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4819328E7f + "'", float2 == 1.4819328E7f);
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 75000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8543120.0f, 2.4612E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.9241084E10f + "'", float2 == 4.9241084E10f);
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.2554392E7f, (-100220.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.4908344E7f + "'", float2 == 4.4908344E7f);
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 322816.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3228160.0f + "'", float2 == 3228160.0f);
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 576.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57600.0f + "'", float2 == 57600.0f);
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(332800.0f, 1.1597168E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3859936E7f + "'", float2 == 2.3859936E7f);
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 2.500576E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.752016E9f + "'", float2 == 8.752016E9f);
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(37728.0f, 2.00002E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0007946E8f + "'", float2 == 4.0007946E8f);
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-6.194835E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.194835E10f) + "'", float2 == (-6.194835E10f));
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 4660.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 46600.0f + "'", float2 == 46600.0f);
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 332.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33200.0f + "'", float2 == 33200.0f);
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1152.0f, 3.271256E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.542514E9f + "'", float2 == 6.542514E9f);
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(38400.0f, 110192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 297184.0f + "'", float2 == 297184.0f);
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(320.0f, 1.5542823E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1085645E11f + "'", float2 == 3.1085645E11f);
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 341576.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3132872E7f + "'", float2 == 3.3132872E7f);
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6309529E10f, 20200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2619098E10f + "'", float2 == 3.2619098E10f);
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(91760.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 576545.0837867989d + "'", double1 == 576545.0837867989d);
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.139762E8f, 3.5051056E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8980545E9f + "'", float2 == 1.8980545E9f);
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.1775408E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.398707053164496E7d + "'", double1 == 7.398707053164496E7d);
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-3.097426E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0840991E13f) + "'", float2 == (-1.0840991E13f));
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 1885680.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.88568E8f + "'", float2 == 1.88568E8f);
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.947304E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2235271881412036E9d) + "'", double1 == (-1.2235271881412036E9d));
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 2.9722892E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9722893E11f + "'", float2 == 2.9722893E11f);
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 200876.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2008760.0f + "'", float2 == 2008760.0f);
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(185120.0f, 6360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 382960.0f + "'", float2 == 382960.0f);
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.8067968E7f, 40398.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.6216732E7f + "'", float2 == 3.6216732E7f);
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 3.3106583E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.3106583E9f) + "'", float2 == (-3.3106583E9f));
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.3160606E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4552237870128337E12d + "'", double1 == 1.4552237870128337E12d);
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.293964E7f, 5.146266E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0458411E10f + "'", float2 == 1.0458411E10f);
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-9.02135E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.02135E7f + "'", float2 == 9.02135E7f);
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-4357600.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4357600.0f + "'", float2 == 4357600.0f);
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(21280.0f, 1.65133E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3026602E11f + "'", float2 == 3.3026602E11f);
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4692656.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.948482723084813E7d) + "'", double1 == (-2.948482723084813E7d));
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(547928.0f, 8004000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7103856E7f + "'", float2 == 1.7103856E7f);
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(26740.0f, 7.30811E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4616225E11f + "'", float2 == 1.4616225E11f);
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.20392E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.564452455019647E7d) + "'", double1 == (-7.564452455019647E7d));
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.2015885E8f, 3500.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.403247E8f + "'", float2 == 6.403247E8f);
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 4.21204E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.21204E9f + "'", float2 == 4.21204E9f);
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 3.946497E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 77568.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-77568.0f) + "'", float2 == (-77568.0f));
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-33024.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-207495.91158429865d) + "'", double1 == (-207495.91158429865d));
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3960020.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4881539480137303E7d) + "'", double1 == (-2.4881539480137303E7d));
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(92560.0f, (-1.6353052E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.2704253E9f) + "'", float2 == (-3.2704253E9f));
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.879806E9f), 3.3031132E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.6935496E9f) + "'", float2 == (-7.6935496E9f));
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.032E8f, 2219360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4108388E9f + "'", float2 == 1.4108388E9f);
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 3.9964736E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.992947E8f + "'", float2 == 7.992947E8f);
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 7.484328E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.259798E10f + "'", float2 == 7.259798E10f);
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 1.1518982E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1518982E14f + "'", float2 == 1.1518982E14f);
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.9374099E9f, (-4.893934E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.913048E9f) + "'", float2 == (-5.913048E9f));
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 4.996333E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1.8470669E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8470669E9f + "'", float2 == 1.8470669E9f);
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(37442.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 235255.02427141808d + "'", double1 == 235255.02427141808d);
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 2531760.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2531760.0f + "'", float2 == 2531760.0f);
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8079600.0f, 2.59432E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.350232E8f + "'", float2 == 5.350232E8f);
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.6309529E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.024757903157488E11d + "'", double1 == 1.024757903157488E11d);
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-332536.0f), 2.1421645E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.283664E9f + "'", float2 == 4.283664E9f);
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4209192.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6447133329497855E7d) + "'", double1 == (-2.6447133329497855E7d));
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.5387903E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.668504427861279E9d + "'", double1 == 9.668504427861279E9d);
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.0962961E11f, 8034800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.1927528E11f + "'", float2 == 4.1927528E11f);
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1605516.0f, (-39864.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3131304.0f + "'", float2 == 3131304.0f);
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1418496E7f, 1.6516372E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.5869736E7f + "'", float2 == 5.5869736E7f);
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(170468.0f, 1084432.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2509800.0f + "'", float2 == 2509800.0f);
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.6470367E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0348636939595451E11d + "'", double1 == 1.0348636939595451E11d);
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4626256.0f), 1.8375388E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.665825E9f + "'", float2 == 3.665825E9f);
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 1.9129618E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.947401E9f + "'", float2 == 9.947401E9f);
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 5.5055165E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.505517E11f + "'", float2 == 5.505517E11f);
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.2500508E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.854300920319053E9d) + "'", double1 == (-7.854300920319053E9d));
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.3012608E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.176062739368755E7d) + "'", double1 == (-8.176062739368755E7d));
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.021722E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.668514860258471E10d + "'", double1 == 5.668514860258471E10d);
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1036904.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.036904E7f + "'", float2 == 1.036904E7f);
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 5.4528704E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.4528707E9f + "'", float2 == 5.4528707E9f);
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(522240.0f, (-8.763765E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.7423082E8f) + "'", float2 == (-1.7423082E8f));
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.1686856E7f, 3.270452E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2878275E8f + "'", float2 == 1.2878275E8f);
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.2704253E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0548688469648544E10d) + "'", double1 == (-2.0548688469648544E10d));
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.4295891E9f, 356828.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.859892E9f + "'", float2 == 2.859892E9f);
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.0309936E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.477923919740959E10d + "'", double1 == 6.477923919740959E10d);
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-3995048.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.8751965E8f) + "'", float2 == (-3.8751965E8f));
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1181616.0f), 2.283302E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5642404E9f + "'", float2 == 4.5642404E9f);
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 4.516044E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5160438E11f + "'", float2 == 4.5160438E11f);
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 1.655774E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.655774E9f) + "'", float2 == (-1.655774E9f));
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-200000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.94E7f) + "'", float2 == (-1.94E7f));
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-10000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1000000.0f) + "'", float2 == (-1000000.0f));
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.6365156E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-1.7423082E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.7423081E9f) + "'", float2 == (-1.7423081E9f));
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.568726E7f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.137452E7f + "'", float2 == 9.137452E7f);
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 84320.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8179040.0f + "'", float2 == 8179040.0f);
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.947401E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.250136516499155E10d + "'", double1 == 6.250136516499155E10d);
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1181616.0f), 1.689432E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1425408E7f + "'", float2 == 3.1425408E7f);
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.6036896E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0076278931996708E8d) + "'", double1 == (-1.0076278931996708E8d));
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(214.0f, 9.02135E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8042744E8f + "'", float2 == 1.8042744E8f);
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) '#', (-7.422246E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4844486E8f) + "'", float2 == (-1.4844486E8f));
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2008812.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2621738043286039E7d + "'", double1 == 1.2621738043286039E7d);
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8438384.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.3019930365139306E7d + "'", double1 == 5.3019930365139306E7d);
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.999216E8f, (-1.8747007E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.669417E10f) + "'", float2 == (-3.669417E10f));
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.046168E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7989193942339385E8d + "'", double1 == 3.7989193942339385E8d);
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-705952.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 20728.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20728.0f + "'", float2 == 20728.0f);
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.04558E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.541912982032924E9d + "'", double1 == 2.541912982032924E9d);
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(11040.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 69366.36579126264d + "'", double1 == 69366.36579126264d);
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.484328E8f, 3.665825E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.828515E9f + "'", float2 == 8.828515E9f);
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-200640.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3397160.0f, 37728.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6869776.0f + "'", float2 == 6869776.0f);
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 5.1752407E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.1752407E10f + "'", float2 == 5.1752407E10f);
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 3.3132872E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3132872E7f + "'", float2 == 3.3132872E7f);
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 8.784847E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-50336.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 50336.0f + "'", float2 == 50336.0f);
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 3.7728E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.7728E7f) + "'", float2 == (-3.7728E7f));
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(80800.0f, 3.270452E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.557064E7f + "'", float2 == 6.557064E7f);
    }
}

