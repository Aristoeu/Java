package Perimeter;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-39864.0f), 1.6451552E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2823376E7f + "'", float2 == 3.2823376E7f);
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 2.00002E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1486144.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.486144E8f + "'", float2 == 1.486144E8f);
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(958056.0f, 7.093296E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4378203E8f + "'", float2 == 1.4378203E8f);
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 1, 111280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 222562.0f + "'", float2 == 222562.0f);
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 3.4819108E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4819108E7f + "'", float2 == 3.4819108E7f);
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.496073E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0816029171328956E8d + "'", double1 == 4.0816029171328956E8d);
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1594520.0f), 6.496073E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2673242E8f + "'", float2 == 1.2673242E8f);
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 4209192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4209192.0f + "'", float2 == 4209192.0f);
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(30280.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 60560.0f + "'", float2 == 60560.0f);
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(356828.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 713656.0f + "'", float2 == 713656.0f);
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 158160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.1475024E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.34931555268129E8d + "'", double1 == 1.34931555268129E8d);
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2000002.0f), 36400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3927204.0f) + "'", float2 == (-3927204.0f));
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(222562.0f, (-4209192.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7973260.0f) + "'", float2 == (-7973260.0f));
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 4564880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3737376E8f + "'", float2 == 2.3737376E8f);
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 874400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8744000.0f + "'", float2 == 8744000.0f);
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(44572.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 280054.1355116085d + "'", double1 == 280054.1355116085d);
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.697976E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0668697855143565E9d + "'", double1 == 1.0668697855143565E9d);
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(12324.0f, 3.5935496E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.189564E7f + "'", float2 == 7.189564E7f);
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.6553288E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0400737393649286E10d + "'", double1 == 1.0400737393649286E10d);
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.569705E7f, 222562.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.183922E7f + "'", float2 == 9.183922E7f);
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3316.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20835.04247860751d + "'", double1 == 20835.04247860751d);
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.256646E8f, 20440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.65137E9f + "'", float2 == 1.65137E9f);
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4357600.0f), 1.2409408E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4731663E9f + "'", float2 == 2.4731663E9f);
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 3316.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3316.0f + "'", float2 == 3316.0f);
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1002200.0f, 336000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2676400.0f + "'", float2 == 2676400.0f);
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(170688.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1072464.3337118693d + "'", double1 == 1072464.3337118693d);
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(77568.0f, 2189816.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4534768.0f + "'", float2 == 4534768.0f);
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 21340.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 42680.0f + "'", float2 == 42680.0f);
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9702616.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.096333429240557E7d + "'", double1 == 6.096333429240557E7d);
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 628.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20096.0f + "'", float2 == 20096.0f);
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.8853757E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4412535385448895E9d + "'", double1 == 2.4412535385448895E9d);
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(428944.0f, 1976.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 861840.0f + "'", float2 == 861840.0f);
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.201344E8f, (-1472.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2402659E9f + "'", float2 == 1.2402659E9f);
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 2858864.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4866093E8f + "'", float2 == 1.4866093E8f);
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.5725456E7f), 384.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.1450144E7f) + "'", float2 == (-3.1450144E7f));
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8079600.0f, 2.258021E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5322015E9f + "'", float2 == 4.5322015E9f);
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(840.0f, (-3.097426E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.194835E8f) + "'", float2 == (-6.194835E8f));
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1185616.0f), (-168192.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2707616.0f) + "'", float2 == (-2707616.0f));
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1976.0f, 2004600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4013152.0f + "'", float2 == 4013152.0f);
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1060000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.06E7f + "'", float2 == 1.06E7f);
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(404.0f, 112000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 224808.0f + "'", float2 == 224808.0f);
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(530608.0f, 8176524.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7414264E7f + "'", float2 == 1.7414264E7f);
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.025089E7f), 80800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6034018E8f) + "'", float2 == (-1.6034018E8f));
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1084432.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6813687.209035373d + "'", double1 == 6813687.209035373d);
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.025089E9f), (-6.194835E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.7289144E10f) + "'", float2 == (-1.7289144E10f));
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1.6893936E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6893936E8f + "'", float2 == 1.6893936E8f);
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 92560.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4813120.0f + "'", float2 == 4813120.0f);
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(10608.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 66652.02973856105d + "'", double1 == 66652.02973856105d);
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8257416.0f, (-167480.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6179872E7f + "'", float2 == 1.6179872E7f);
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.14389E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.745275278519223E8d + "'", double1 == 5.745275278519223E8d);
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 42682.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1493870.0f + "'", float2 == 1493870.0f);
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 1136.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1136.0f + "'", float2 == 1136.0f);
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6360.0f, 4060.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20840.0f + "'", float2 == 20840.0f);
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-4.3576E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.3576E7f + "'", float2 == 4.3576E7f);
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 100, (-214.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-228.0f) + "'", float2 == (-228.0f));
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(341576.0f, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 683224.0f + "'", float2 == 683224.0f);
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(85492.0f, (-631208.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1091432.0f) + "'", float2 == (-1091432.0f));
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(36400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 228707.94518133695d + "'", double1 == 228707.94518133695d);
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 7.189564E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 999856.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 4.5848E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.447256E9f + "'", float2 == 4.447256E9f);
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(88120.0f, 2020000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4216240.0f + "'", float2 == 4216240.0f);
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.902104E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4517642519886693E8d + "'", double1 == 2.4517642519886693E8d);
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-159560.0f), (-572692.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1464504.0f) + "'", float2 == (-1464504.0f));
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-20020.0f), (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-40040.0f) + "'", float2 == (-40040.0f));
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(261244.0f, 4.04558E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.096385E8f + "'", float2 == 8.096385E8f);
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(487684.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3064208.9433465693d + "'", double1 == 3064208.9433465693d);
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.2554392E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.417134244267688E8d + "'", double1 == 1.417134244267688E8d);
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.250288E7f, 2612540.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.023084E7f + "'", float2 == 3.023084E7f);
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 2404400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2404400.0f) + "'", float2 == (-2404400.0f));
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(185120.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1163143.264065085d + "'", double1 == 1163143.264065085d);
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-100220.0f), (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-200240.0f) + "'", float2 == (-200240.0f));
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6360.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39961.058553662166d + "'", double1 == 39961.058553662166d);
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6360.0f, 5.715983E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1433238E8f + "'", float2 == 1.1433238E8f);
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-168192.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1681920.0f) + "'", float2 == (-1681920.0f));
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(42680.0f, 3200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 91760.0f + "'", float2 == 91760.0f);
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.7289144E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.086308975651314E11d) + "'", double1 == (-1.086308975651314E11d));
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(12800.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 80424.77193189871d + "'", double1 == 80424.77193189871d);
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.4378203E8f, 250756.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8806557E8f + "'", float2 == 2.8806557E8f);
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(106.0f, 250756.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 501724.0f + "'", float2 == 501724.0f);
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8744000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.49401723259783E7d + "'", double1 == 5.49401723259783E7d);
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 770.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 10600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10600.0f) + "'", float2 == (-10600.0f));
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.2500508E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.854300819788088E8d) + "'", double1 == (-7.854300819788088E8d));
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-341336.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.41336E7f) + "'", float2 == (-3.41336E7f));
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 4.128322E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4449126E10f + "'", float2 == 1.4449126E10f);
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-968.0f), 8744000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7486064E7f + "'", float2 == 1.7486064E7f);
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.7525528E7f, 680.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5052416E7f + "'", float2 == 3.5052416E7f);
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 20200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 707000.0f + "'", float2 == 707000.0f);
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(428944.0f, 9700.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 877288.0f + "'", float2 == 877288.0f);
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1152.0f, (-8019600.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6036896E7f) + "'", float2 == (-1.6036896E7f));
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6451552E7f, 38.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.290318E7f + "'", float2 == 3.290318E7f);
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 10, 58880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 117780.0f + "'", float2 == 117780.0f);
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 58880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5888000.0f + "'", float2 == 5888000.0f);
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.6516372E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0377542587831232E8d + "'", double1 == 1.0377542587831232E8d);
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(38400.0f, 1.6353052E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2706872E9f + "'", float2 == 3.2706872E9f);
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) '4', 3.2823376E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.5646856E7f + "'", float2 == 6.5646856E7f);
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(89310.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 561151.2797842089d + "'", double1 == 561151.2797842089d);
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1.6568216E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.7988756E9f + "'", float2 == 5.7988756E9f);
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1920.0f + "'", float2 == 1920.0f);
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(281376.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1767937.5489929633d + "'", double1 == 1767937.5489929633d);
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 80040.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-394.0f), 8176524.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.635226E7f + "'", float2 == 1.635226E7f);
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 3.3026533E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6116160.0f, (-764.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2230792E7f + "'", float2 == 1.2230792E7f);
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.176524E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.137461646591091E9d + "'", double1 == 5.137461646591091E9d);
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.5848E7f, 388.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.1696776E7f + "'", float2 == 9.1696776E7f);
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(341576.0f, 683224.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2049600.0f + "'", float2 == 2049600.0f);
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(877288.0f, (-399980.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 954616.0f + "'", float2 == 954616.0f);
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-38608.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-242581.21833958945d) + "'", double1 == (-242581.21833958945d));
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-8025752.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8025752.0f) + "'", float2 == (-8025752.0f));
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1.06E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.06E7f) + "'", float2 == (-1.06E7f));
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-76840.0f), (-1185616.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2524912.0f) + "'", float2 == (-2524912.0f));
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 3.902104E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0290941E9f + "'", float2 == 2.0290941E9f);
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 9.14389E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.14389E8f + "'", float2 == 9.14389E8f);
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.1696776E7f, 3.5052416E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5349838E8f + "'", float2 == 2.5349838E8f);
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9061312.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.693390242217007E7d + "'", double1 == 5.693390242217007E7d);
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.183922E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.770428125940924E8d + "'", double1 == 5.770428125940924E8d);
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1418496E9f, (-198680.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.283302E9f + "'", float2 == 2.283302E9f);
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1418496E8f, (-1.67384E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9489312E8f + "'", float2 == 1.9489312E8f);
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 624.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1248.0f + "'", float2 == 1248.0f);
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(476736.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2995420.630603567d + "'", double1 == 2995420.630603567d);
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(768.0f, 485524.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 972584.0f + "'", float2 == 972584.0f);
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-26740.0f), 1.6893936E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.373439E7f + "'", float2 == 3.373439E7f);
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 4.9618E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.9618E8f + "'", float2 == 4.9618E8f);
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19200.0f + "'", float2 == 19200.0f);
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-38608.0f), 388.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-76440.0f) + "'", float2 == (-76440.0f));
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(499928.0f, 3.328E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.755986E7f + "'", float2 == 6.755986E7f);
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(60560.0f, 255996.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 633112.0f + "'", float2 == 633112.0f);
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.3576E7f), (-242824.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.763765E7f) + "'", float2 == (-8.763765E7f));
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3028.0f, (-1.98E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.9593944E7f) + "'", float2 == (-3.9593944E7f));
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.1653535E9f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.330707E9f + "'", float2 == 6.330707E9f);
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3500.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21991.14857512855d + "'", double1 == 21991.14857512855d);
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(160004.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1005334.7818899625d + "'", double1 == 1005334.7818899625d);
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3328.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20910.440702293665d + "'", double1 == 20910.440702293665d);
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(10000.0f, (-2404400.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4788800.0f) + "'", float2 == (-4788800.0f));
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 2.7452624E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 1, 12800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 25602.0f + "'", float2 == 25602.0f);
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.4044E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5107290752582598E8d) + "'", double1 == (-1.5107290752582598E8d));
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3919064.0f), 3.8853757E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.69237E8f + "'", float2 == 7.69237E8f);
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 386.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3646240.0f, 43332.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7379144.0f + "'", float2 == 7379144.0f);
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(853600.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5363326.978208494d + "'", double1 == 5363326.978208494d);
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1418496E7f, 1002200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4841392E7f + "'", float2 == 2.4841392E7f);
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1.2409408E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2409407E10f + "'", float2 == 1.2409407E10f);
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(80002.0f, 9.14389E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.830378E8f + "'", float2 == 1.830378E8f);
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.3737376E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4914633211419735E9d + "'", double1 == 1.4914633211419735E9d);
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 4534768.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.534768E8f + "'", float2 == 4.534768E8f);
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1.65133E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.65133E12f + "'", float2 == 1.65133E12f);
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.992947E8f, (-382.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5985887E9f + "'", float2 == 1.5985887E9f);
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-192.0f), 632160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1263936.0f + "'", float2 == 1263936.0f);
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 3.96536E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.387876E11f + "'", float2 == 1.387876E11f);
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.4045066E8f), 2.8806557E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9522982E8f + "'", float2 == 2.9522982E8f);
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 2181256.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.634396E7f + "'", float2 == 7.634396E7f);
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.98268E8f, 4060.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9654413E8f + "'", float2 == 3.9654413E8f);
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(430.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2701.769682087222d + "'", double1 == 2701.769682087222d);
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1681920.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.056781503185149E7d) + "'", double1 == (-1.056781503185149E7d));
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2020000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2692034320502764E7d + "'", double1 == 1.2692034320502764E7d);
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.5646856E7f, 3.3026533E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.606619E11f + "'", float2 == 6.606619E11f);
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2666.0f, (-1980000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3954668.0f) + "'", float2 == (-3954668.0f));
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1.6568216E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6568216E9f + "'", float2 == 1.6568216E9f);
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 10L, (-7.751075E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5502149E8f) + "'", float2 == (-1.5502149E8f));
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 4000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 388000.0f + "'", float2 == 388000.0f);
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.5935496E7f, 1486144.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.484328E7f + "'", float2 == 7.484328E7f);
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.5985887E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0044228856134127E10d + "'", double1 == 1.0044228856134127E10d);
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 3028.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 30280.0f + "'", float2 == 30280.0f);
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(80000.0f, 3.3787976E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.773595E7f + "'", float2 == 6.773595E7f);
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.2409407E10f, 87440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.481899E10f + "'", float2 == 2.481899E10f);
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1.551913E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 20020.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.6893936E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0614773045563227E9d + "'", double1 == 1.0614773045563227E9d);
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 200640.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-200640.0f) + "'", float2 == (-200640.0f));
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.265167E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6798835883704296E8d + "'", double1 == 2.6798835883704296E8d);
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8025752.0f), 8009240.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33024.0f) + "'", float2 == (-33024.0f));
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9061312.0f, 2.5349838E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.251194E8f + "'", float2 == 5.251194E8f);
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(250756.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1575546.4148871244d + "'", double1 == 1575546.4148871244d);
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 2.5683182E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.5935496E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.257893804734108E8d + "'", double1 == 2.257893804734108E8d);
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-296.0f), 5888000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1775408E7f + "'", float2 == 1.1775408E7f);
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-485524.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.85524E7f) + "'", float2 == (-4.85524E7f));
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.9654413E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4915602386979413E9d + "'", double1 == 2.4915602386979413E9d);
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(628.0f, 4.8248416E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.649809E7f + "'", float2 == 9.649809E7f);
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.2673242E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.96283254154571E8d + "'", double1 == 7.96283254154571E8d);
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(290272.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1823832.765485633d + "'", double1 == 1823832.765485633d);
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(175760.0f, 12324.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 376168.0f + "'", float2 == 376168.0f);
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1780.0f), 3.96536E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.930684E8f + "'", float2 == 7.930684E8f);
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.484328E7f, 1486144.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5265885E8f + "'", float2 == 1.5265885E8f);
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.649809E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.063153686925228E8d + "'", double1 == 6.063153686925228E8d);
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.879806E10f), 1.7486064E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.756115E10f) + "'", float2 == (-7.756115E10f));
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(85360.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 536332.6978208495d + "'", double1 == 536332.6978208495d);
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.9998E7f), 214952.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.95661E7f) + "'", float2 == (-7.95661E7f));
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(125368.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 787710.3755904904d + "'", double1 == 787710.3755904904d);
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5324.0f, (-572692.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1134736.0f) + "'", float2 == (-1134736.0f));
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 2.2332318E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-88120.0f), 4.3576E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.697576E7f + "'", float2 == 8.697576E7f);
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(304.0f, 7700.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16008.0f + "'", float2 == 16008.0f);
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.2409408E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(20.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 125.66370614359172d + "'", double1 == 125.66370614359172d);
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 2175264.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1311373E8f + "'", float2 == 1.1311373E8f);
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1464504.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9201750.015105734d) + "'", double1 == (-9201750.015105734d));
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.751075E7f), 8574600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.378723E8f) + "'", float2 == (-1.378723E8f));
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.328E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0910440702293664E8d + "'", double1 == 2.0910440702293664E8d);
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(64.0f, 2984.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6096.0f + "'", float2 == 6096.0f);
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-16.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-832.0f) + "'", float2 == (-832.0f));
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(972584.0f, 3.9964736E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.012399E8f + "'", float2 == 8.012399E8f);
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.3026533E11f, 1.7525528E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.605657E11f + "'", float2 == 6.605657E11f);
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.510899E7f, 1152.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.022029E7f + "'", float2 == 9.022029E7f);
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.447256E9f, 80348.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.894673E9f + "'", float2 == 8.894673E9f);
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 4.3576E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.52516E10f + "'", float2 == 1.52516E10f);
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 640080.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 4045580.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.04558E7f + "'", float2 == 4.04558E7f);
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6283.185307179586d + "'", double1 == 6283.185307179586d);
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1418496E9f, 404.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2837E9f + "'", float2 == 2.2837E9f);
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-336058.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2111514.687960157d) + "'", double1 == (-2111514.687960157d));
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6893936E8f, (-2524912.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.328289E8f + "'", float2 == 3.328289E8f);
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1152000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7238229.473870884d + "'", double1 == 7238229.473870884d);
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-682568.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4288701.228750956d) + "'", double1 == (-4288701.228750956d));
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.0f), 6.755986E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.351197E8f + "'", float2 == 1.351197E8f);
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(37728.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 237052.01526927142d + "'", double1 == 237052.01526927142d);
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 3.5052416E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5052416E9f + "'", float2 == 3.5052416E9f);
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 348360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4836E7f + "'", float2 == 3.4836E7f);
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1758000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.758E8f + "'", float2 == 1.758E8f);
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-76840.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.4731663E9f, 633112.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.947599E9f + "'", float2 == 4.947599E9f);
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(85184.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 535226.8572067858d + "'", double1 == 535226.8572067858d);
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(788.0f, 2.258021E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.516044E9f + "'", float2 == 4.516044E9f);
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 17580.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 17580.0f + "'", float2 == 17580.0f);
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1248.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 43680.0f + "'", float2 == 43680.0f);
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-2707616.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 250756.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 250756.0f + "'", float2 == 250756.0f);
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 37728.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 377280.0f + "'", float2 == 377280.0f);
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 5888000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.888E8f + "'", float2 == 5.888E8f);
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 6096.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 60960.0f + "'", float2 == 60960.0f);
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 1.486144E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.486144E10f + "'", float2 == 1.486144E10f);
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.2480207E9f, 377280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.496796E9f + "'", float2 == 6.496796E9f);
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.2738432E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.003792877890627E8d + "'", double1 == 8.003792877890627E8d);
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 112000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1493870.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9386262.034836369d + "'", double1 == 9386262.034836369d);
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-968.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-50336.0f) + "'", float2 == (-50336.0f));
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1091432.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6857669.50618563d) + "'", double1 == (-6857669.50618563d));
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 3.023084E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.046168E7f + "'", float2 == 6.046168E7f);
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 19200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 5.251194E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.251194E10f + "'", float2 == 5.251194E10f);
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.5725456E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.880595408789907E7d) + "'", double1 == (-9.880595408789907E7d));
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-3.9593944E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9593944E7f + "'", float2 == 3.9593944E7f);
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4216240.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6491417219542857E7d + "'", double1 == 2.6491417219542857E7d);
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3938800.0f), 38400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7800800.0f) + "'", float2 == (-7800800.0f));
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(42680.0f, 38784.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 162928.0f + "'", float2 == 162928.0f);
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-74396.0f), 578656.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1008520.0f + "'", float2 == 1008520.0f);
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.201344E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.896419350556628E9d + "'", double1 == 3.896419350556628E9d);
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-296.0f), 1.6568216E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.313637E8f + "'", float2 == 3.313637E8f);
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8386528.0f), 7789670.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1193716.0f) + "'", float2 == (-1193716.0f));
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 315604.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(240440.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 480880.0f + "'", float2 == 480880.0f);
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-20000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-200000.0f) + "'", float2 == (-200000.0f));
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-572.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3593.9819957067234d) + "'", double1 == (-3593.9819957067234d));
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.2956704E7f, 80348.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.6074104E7f + "'", float2 == 8.6074104E7f);
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8019600.0f), 2000000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.20392E7f) + "'", float2 == (-1.20392E7f));
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.606619E11f, 44656.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.321324E12f + "'", float2 == 1.321324E12f);
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-1.5502149E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5502149E8f) + "'", float2 == (-1.5502149E8f));
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.201344E8f, 394232.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2410573E9f + "'", float2 == 1.2410573E9f);
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.336E9f), 20840.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2671958E10f) + "'", float2 == (-1.2671958E10f));
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(384.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2412.743157956961d + "'", double1 == 2412.743157956961d);
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-315604.0f), (-1681920.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3995048.0f) + "'", float2 == (-3995048.0f));
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.6074104E7f, (-4855240.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6243773E8f + "'", float2 == 1.6243773E8f);
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.484328E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.702541972371278E8d + "'", double1 == 4.702541972371278E8d);
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-1528.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-79456.0f) + "'", float2 == (-79456.0f));
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-1.6040736E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6040736E8f) + "'", float2 == (-1.6040736E8f));
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.7486064E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.098681804052019E8d + "'", double1 == 1.098681804052019E8d);
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.2080672E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0156880695484754E8d) + "'", double1 == (-2.0156880695484754E8d));
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-3995048.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3982669E8f) + "'", float2 == (-1.3982669E8f));
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7789670.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.894394009177761E7d + "'", double1 == 4.894394009177761E7d);
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (-4012876.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.012876E8f) + "'", float2 == (-4.012876E8f));
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 5324.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 532400.0f + "'", float2 == 532400.0f);
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(705952.0f, 8.697576E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7536342E8f + "'", float2 == 1.7536342E8f);
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-242824.0f), (-198680.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-883008.0f) + "'", float2 == (-883008.0f));
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 1758.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3516.0f + "'", float2 == 3516.0f);
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 3328.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 332800.0f + "'", float2 == 332800.0f);
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 4.8088E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.258021E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4187565124485193E10d + "'", double1 == 1.4187565124485193E10d);
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 7.189564E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.973877E9f + "'", float2 == 6.973877E9f);
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) ' ', (-2.4044E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.8087936E7f) + "'", float2 == (-4.8087936E7f));
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1091432.0f), 117780.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1947304.0f) + "'", float2 == (-1947304.0f));
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-332536.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.163876E7f) + "'", float2 == (-1.163876E7f));
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 89104.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 127888.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4476080.0f + "'", float2 == 4476080.0f);
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 5888000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5888000.0f + "'", float2 == 5888000.0f);
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 6.606619E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.606619E11f + "'", float2 == 6.606619E11f);
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(20096.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 126266.89193308096d + "'", double1 == 126266.89193308096d);
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-24640.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-154817.68596890502d) + "'", double1 == (-154817.68596890502d));
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(972584.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6110925.49879795d + "'", double1 == 6110925.49879795d);
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(255996.0f, (-4788800.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9065608.0f) + "'", float2 == (-9065608.0f));
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-2000400.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2000400.0f) + "'", float2 == (-2000400.0f));
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100000.0f + "'", float2 == 100000.0f);
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-8.025089E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.1730463E9f) + "'", float2 == (-4.1730463E9f));
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 4808800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.500576E8f + "'", float2 == 2.500576E8f);
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1492.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9374.512478311943d + "'", double1 == 9374.512478311943d);
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(874400.0f, 26740.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1802280.0f + "'", float2 == 1802280.0f);
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-578656.0f), 874400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 591488.0f + "'", float2 == 591488.0f);
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-572692.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3598329.9599392917d) + "'", double1 == (-3598329.9599392917d));
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1267304.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7962705.872529918d + "'", double1 == 7962705.872529918d);
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 60560.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 605600.0f + "'", float2 == 605600.0f);
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 68.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 136.0f + "'", float2 == 136.0f);
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(648480.0f, 37442.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1371844.0f + "'", float2 == 1371844.0f);
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(240440.0f, 1084432.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2649744.0f + "'", float2 == 2649744.0f);
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3771360.0f, (-10600.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7521520.0f + "'", float2 == 7521520.0f);
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4209192.0f), 1.65133E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3026516E12f + "'", float2 == 3.3026516E12f);
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 1982680.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1982680.0f) + "'", float2 == (-1982680.0f));
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(480880.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3021458.1505165193d + "'", double1 == 3021458.1505165193d);
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.4449126E10f, 4.1343034E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9725114E10f + "'", float2 == 2.9725114E10f);
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1117368.0f, 4012876.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0260488E7f + "'", float2 == 1.0260488E7f);
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.2409408E9f, (-2000400.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4778808E9f + "'", float2 == 2.4778808E9f);
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(60960.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 383022.9763256676d + "'", double1 == 383022.9763256676d);
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.0f) + "'", float2 == (-4.0f));
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 3.902104E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6116160.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.84289666483595E7d + "'", double1 == 3.84289666483595E7d);
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2000000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2566370614359172E7d + "'", double1 == 1.2566370614359172E7d);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5798524.0f, 60.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1597168E7f + "'", float2 == 1.1597168E7f);
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 224808.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.24808E7f + "'", float2 == 2.24808E7f);
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.1730463E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6220023022410946E10d) + "'", double1 == (-2.6220023022410946E10d));
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1332.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 133200.0f + "'", float2 == 133200.0f);
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7542720.0f, (-883008.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3319424E7f + "'", float2 == 1.3319424E7f);
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(33280.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 209104.40702293662d + "'", double1 == 209104.40702293662d);
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.65137E9f, 8447160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3196342E9f + "'", float2 == 3.3196342E9f);
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 1976.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1976.0f) + "'", float2 == (-1976.0f));
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 6.606619E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.1141182E13f + "'", float2 == 2.1141182E13f);
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.5848E7f, 2662.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.170133E7f + "'", float2 == 9.170133E7f);
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2594320.0f, 1.2841203E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5734292E9f + "'", float2 == 2.5734292E9f);
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 120.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1200.0f + "'", float2 == 1200.0f);
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2025600.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.272722015822297E7d + "'", double1 == 1.272722015822297E7d);
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 4.534768E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-20440.0f), (-1528.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-43936.0f) + "'", float2 == (-43936.0f));
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(341576.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2146185.3044851744d + "'", double1 == 2146185.3044851744d);
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(707000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4442212.012175968d + "'", double1 == 4442212.012175968d);
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1418496E7f, 1.2409407E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4841652E10f + "'", float2 == 2.4841652E10f);
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-198640.0f), (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-397282.0f) + "'", float2 == (-397282.0f));
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.93072E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.983018337935529E9d + "'", double1 == 4.983018337935529E9d);
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-39300.0f), 1.3628912E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7179224E7f + "'", float2 == 2.7179224E7f);
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-7.759605E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.526817E9f) + "'", float2 == (-7.526817E9f));
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(158160.0f, 4013152.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8342624.0f + "'", float2 == 8342624.0f);
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-382.0f), (-7.95661E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5913296E8f) + "'", float2 == (-1.5913296E8f));
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.8248416E7f, 1.1418496E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.293349E10f + "'", float2 == 2.293349E10f);
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2020000.0f, 6.2030464E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2446492E9f + "'", float2 == 1.2446492E9f);
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-1.378723E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.378723E8f + "'", float2 == 1.378723E8f);
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(200.0f, 40400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 81200.0f + "'", float2 == 81200.0f);
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1008520.0f, 83800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2184640.0f + "'", float2 == 2184640.0f);
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-52.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-3.9998E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.879806E9f) + "'", float2 == (-3.879806E9f));
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 2662.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(44656.0f, 60560.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 210432.0f + "'", float2 == 210432.0f);
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-79456.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.2837E9f, 4.3576E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.654552E9f + "'", float2 == 4.654552E9f);
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.1653536E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9888503231548008E8d + "'", double1 == 1.9888503231548008E8d);
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 1.1775408E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1775408E7f + "'", float2 == 1.1775408E7f);
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-768.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-768.0f) + "'", float2 == (-768.0f));
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.7536342E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.101840889093504E9d + "'", double1 == 1.101840889093504E9d);
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-341336.0f), (-2004992.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4692656.0f) + "'", float2 == (-4692656.0f));
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 4039800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4039800.0f) + "'", float2 == (-4039800.0f));
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 281376.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 562752.0f + "'", float2 == 562752.0f);
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 2.258021E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.258021E9f + "'", float2 == 2.258021E9f);
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(12324.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 77433.97572568122d + "'", double1 == 77433.97572568122d);
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 8.096385E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.096385E8f) + "'", float2 == (-8.096385E8f));
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 40000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1400000.0f + "'", float2 == 1400000.0f);
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.751075E7f), 7.093296E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3155584E7f) + "'", float2 == (-1.3155584E7f));
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 1.2738432E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2738432E8f + "'", float2 == 1.2738432E8f);
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(10400.0f, (-43936.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-67072.0f) + "'", float2 == (-67072.0f));
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1002200.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6297008.314855381d) + "'", double1 == (-6297008.314855381d));
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2237008.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4055535797643192E7d + "'", double1 == 1.4055535797643192E7d);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(705952.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4435627.233974043d + "'", double1 == 4435627.233974043d);
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 10000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 320000.0f + "'", float2 == 320000.0f);
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(60560.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 380509.7022027957d + "'", double1 == 380509.7022027957d);
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(170468.0f, 9704480.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9749896E7f + "'", float2 == 1.9749896E7f);
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.7409584E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0938764239290881E8d + "'", double1 == 1.0938764239290881E8d);
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 3.3196342E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.3196342E9f) + "'", float2 == (-3.3196342E9f));
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.1433238E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.183715552836144E8d + "'", double1 == 7.183715552836144E8d);
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(877288.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5512163.071764965d + "'", double1 == 5512163.071764965d);
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 7.484328E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.484328E8f + "'", float2 == 7.484328E8f);
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-26740.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-168012.37511398213d) + "'", double1 == (-168012.37511398213d));
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2404400.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5107290752582597E7d) + "'", double1 == (-1.5107290752582597E7d));
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-3.96E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.96E8f) + "'", float2 == (-3.96E8f));
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.879806E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.437753975231431E10d) + "'", double1 == (-2.437753975231431E10d));
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.5349838E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5927773217425687E9d + "'", double1 == 1.5927773217425687E9d);
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(70.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 439.822971502571d + "'", double1 == 439.822971502571d);
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 3.373439E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0795005E9f + "'", float2 == 1.0795005E9f);
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.888E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6995395088673406E9d + "'", double1 == 3.6995395088673406E9d);
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 1.2738432E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0762982E9f + "'", float2 == 4.0762982E9f);
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2020.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12692.034320502764d + "'", double1 == 12692.034320502764d);
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 640.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6400.0f + "'", float2 == 6400.0f);
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(335856.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2110245.484528107d + "'", double1 == 2110245.484528107d);
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-16.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.5322015E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.847666169804809E10d + "'", double1 == 2.847666169804809E10d);
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1248.0f, 2.5349838E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0699926E8f + "'", float2 == 5.0699926E8f);
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.0f), (-43936.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-87884.0f) + "'", float2 == (-87884.0f));
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.96536E9f, 1.06E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.95192E9f + "'", float2 == 7.95192E9f);
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(713656.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1427312.0f + "'", float2 == 1427312.0f);
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-20000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20000.0f + "'", float2 == 20000.0f);
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2707616.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7012453068684362E7d) + "'", double1 == (-1.7012453068684362E7d));
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 2.9522982E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.9522982E8f) + "'", float2 == (-2.9522982E8f));
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 2026656.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2026656.0f + "'", float2 == 2026656.0f);
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9577408.0f, 1212.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.915724E7f + "'", float2 == 1.915724E7f);
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-100000.0f), (-7.751075E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.552215E8f) + "'", float2 == (-1.552215E8f));
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 162928.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1629280.0f + "'", float2 == 1629280.0f);
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 2104440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.10444E8f + "'", float2 == 2.10444E8f);
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1283144.0f), 1780.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2562728.0f) + "'", float2 == (-2562728.0f));
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-1.20392E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.21372E8f) + "'", float2 == (-4.21372E8f));
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(713850.0f, (-4.3576E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.57243E7f) + "'", float2 == (-8.57243E7f));
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.973877E9f, (-1.2671958E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1396162E10f) + "'", float2 == (-1.1396162E10f));
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.00002E8f, 1.06E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.21204E8f + "'", float2 == 4.21204E8f);
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-7.756115E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.756115E10f + "'", float2 == 7.756115E10f);
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6116160.0f, 281376.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2795072E7f + "'", float2 == 1.2795072E7f);
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-7.7596047E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.0349945E11f) + "'", float2 == (-4.0349945E11f));
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.251194E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.299422448329478E9d + "'", double1 == 3.299422448329478E9d);
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7757908.0f), 578656.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4358504E7f) + "'", float2 == (-1.4358504E7f));
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1000.0f + "'", float2 == 1000.0f);
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3500.0f + "'", float2 == 3500.0f);
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 1283144.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1371844.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8619550.064542472d + "'", double1 == 8619550.064542472d);
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 304.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10640.0f + "'", float2 == 10640.0f);
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1.3319424E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3319424E9f + "'", float2 == 1.3319424E9f);
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(192.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 384.0f + "'", float2 == 384.0f);
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1344512.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.344512E7f + "'", float2 == 1.344512E7f);
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(713850.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4485251.831530147d + "'", double1 == 4485251.831530147d);
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-7.759605E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.759605E7f + "'", float2 == 7.759605E7f);
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(86136.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 541208.4496192208d + "'", double1 == 541208.4496192208d);
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-572692.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) 0, 4476080.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8952160.0f + "'", float2 == 8952160.0f);
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(520.0f, 788.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2616.0f + "'", float2 == 2616.0f);
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1947304.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3894608.0f) + "'", float2 == (-3894608.0f));
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.9749896E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2409225636552489E8d + "'", double1 == 1.2409225636552489E8d);
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1193716.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7500338.832145187d) + "'", double1 == (-7500338.832145187d));
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1.0341418E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0341418E8f) + "'", float2 == (-1.0341418E8f));
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1980000.0f), 40398.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3879204.0f) + "'", float2 == (-3879204.0f));
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6243773E8f, (-1.67384E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9139866E8f + "'", float2 == 2.9139866E8f);
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.4778808E9f, (-1.6040736E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.9236803E9f + "'", float2 == 4.9236803E9f);
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 9.577408E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.577408E8f + "'", float2 == 9.577408E8f);
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-100.0f), 2.8806557E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.7613094E8f + "'", float2 == 5.7613094E8f);
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-100000.0f), (-20440.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-240880.0f) + "'", float2 == (-240880.0f));
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(861840.0f, (-1.6040736E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.1909104E8f) + "'", float2 == (-3.1909104E8f));
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-214.0f), (-315604.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-631636.0f) + "'", float2 == (-631636.0f));
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-4357600.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.3576E7f) + "'", float2 == (-4.3576E7f));
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-1.5502149E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5502149E8f + "'", float2 == 1.5502149E8f);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.2956704E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6990493141766256E8d + "'", double1 == 2.6990493141766256E8d);
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4005400.0f, 1.2446492E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4973092E9f + "'", float2 == 2.4973092E9f);
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-3.097426E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.097426E10f) + "'", float2 == (-3.097426E10f));
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.5052416E7f, (-1.3982669E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0954854E8f) + "'", float2 == (-2.0954854E8f));
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1.378723E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-8386528.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.9352848E8f) + "'", float2 == (-2.9352848E8f));
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-83800.0f), (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-167602.0f) + "'", float2 == (-167602.0f));
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.98268E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2457545844838822E9d + "'", double1 == 1.2457545844838822E9d);
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.21372E8f), 250756.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.422425E8f) + "'", float2 == (-8.422425E8f));
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 3.1653536E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 388.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3880.0f + "'", float2 == 3880.0f);
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.189564E7f, 3771360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.51334E8f + "'", float2 == 1.51334E8f);
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-85584.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-537740.1313296577d) + "'", double1 == (-537740.1313296577d));
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.510675E7f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.02135E7f) + "'", float2 == (-9.02135E7f));
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8009240.0f, (-3919064.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8180352.0f + "'", float2 == 8180352.0f);
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.2841203E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.068365927274749E9d + "'", double1 == 8.068365927274749E9d);
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 6116160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-572692.0f), (-1.3155584E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.7456552E7f) + "'", float2 == (-2.7456552E7f));
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-397280.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.39048E7f) + "'", float2 == (-1.39048E7f));
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 6.973877E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3947754E10f + "'", float2 == 1.3947754E10f);
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.1450836E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9761143065371478E8d) + "'", double1 == (-1.9761143065371478E8d));
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 3.5052416E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5052415E11f + "'", float2 == 3.5052415E11f);
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(954616.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5998029.225198548d + "'", double1 == 5998029.225198548d);
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.2956704E7f, 4.8088E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.820894E8f + "'", float2 == 1.820894E8f);
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(202.0f, 8754832.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7510068E7f + "'", float2 == 1.7510068E7f);
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.947599E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1086680387572247E10d + "'", double1 == 3.1086680387572247E10d);
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(42664.0f, 3.999216E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.999285E8f + "'", float2 == 7.999285E8f);
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-8025752.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-3.1450144E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.1450144E7f) + "'", float2 == (-3.1450144E7f));
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1.5995194E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 770.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 77000.0f + "'", float2 == 77000.0f);
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(70.0f, 1.6515496E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3031132E7f + "'", float2 == 3.3031132E7f);
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2612540.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6415072942418957E7d + "'", double1 == 1.6415072942418957E7d);
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1780.0f, 683224.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1370008.0f + "'", float2 == 1370008.0f);
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 4005400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.082808E8f + "'", float2 == 2.082808E8f);
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.51334E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.508595652767155E8d + "'", double1 == 9.508595652767155E8d);
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.2823376E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0623535381523106E8d + "'", double1 == 2.0623535381523106E8d);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1418496E7f, 1.4866093E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2015885E8f + "'", float2 == 3.2015885E8f);
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.3628912E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.563297963124354E7d + "'", double1 == 8.563297963124354E7d);
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1.1418496E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1418496E12f + "'", float2 == 1.1418496E12f);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.484328E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.702541771309348E9d + "'", double1 == 4.702541771309348E9d);
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(705952.0f, 683224.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2778352.0f + "'", float2 == 2778352.0f);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.0954854E8f), 1000000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.170971E8f) + "'", float2 == (-4.170971E8f));
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 7.189564E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3516.0f, 4.128322E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.256714E8f + "'", float2 == 8.256714E8f);
    }
}

