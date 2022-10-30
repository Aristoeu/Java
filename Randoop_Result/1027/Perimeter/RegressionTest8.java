package Perimeter;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04001");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 1.6056689E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6056688E12f + "'", float2 == 1.6056688E12f);
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1472.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9248.84877216835d) + "'", double1 == (-9248.84877216835d));
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 16008.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 832416.0f + "'", float2 == 832416.0f);
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 7.931228E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.931228E10f + "'", float2 == 7.931228E10f);
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.7236624E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.711327557339749E8d + "'", double1 == 1.711327557339749E8d);
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.1419427E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3458223027124279E9d) + "'", double1 == (-1.3458223027124279E9d));
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0477905E9f, 1.0795005E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2545823E9f + "'", float2 == 4.2545823E9f);
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.894673E9f, (-1.0840991E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.1664193E13f) + "'", float2 == (-2.1664193E13f));
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(214.0f, 1.7874651E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5749307E9f + "'", float2 == 3.5749307E9f);
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 1370008.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1370008.0f + "'", float2 == 1370008.0f);
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 4.467426E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.467426E14f + "'", float2 == 4.467426E14f);
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.0438949E10f, 4.04558E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.095881E10f + "'", float2 == 6.095881E10f);
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.94615E10f, (-5.0699926E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.7909E10f + "'", float2 == 7.7909E10f);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1267304.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2534608.0f + "'", float2 == 2534608.0f);
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0458926E9f, 1297160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0943795E9f + "'", float2 == 2.0943795E9f);
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 902560.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.693312E7f + "'", float2 == 4.693312E7f);
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-1.0683996E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0683996E10f) + "'", float2 == (-1.0683996E10f));
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1018059E12f, 46600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2036118E12f + "'", float2 == 2.2036118E12f);
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-52.0f) + "'", float2 == (-52.0f));
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.3432925E12f, 1941940.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.6865887E12f + "'", float2 == 8.6865887E12f);
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-794560.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4992367.717672612d) + "'", double1 == (-4992367.717672612d));
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3363840.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.113563006370298E7d) + "'", double1 == (-2.113563006370298E7d));
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-4855240.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.85524E8f) + "'", float2 == (-4.85524E8f));
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-5.4796006E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.1686856E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.990943880499153E8d + "'", double1 == 1.990943880499153E8d);
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1000000.0f, (-9074784.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6149568E7f) + "'", float2 == (-1.6149568E7f));
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.1424812E9f, 120.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2849626E9f + "'", float2 == 4.2849626E9f);
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-1.9087127E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9087127E11f) + "'", float2 == (-1.9087127E11f));
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.116071E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.471159219912644E11d + "'", double1 == 4.471159219912644E11d);
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.025089E7f), 3.5052416E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.8499814E9f + "'", float2 == 6.8499814E9f);
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.6346054E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5403270112362165E9d + "'", double1 == 3.5403270112362165E9d);
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-5.230609E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.286488689314456E11d) + "'", double1 == (-3.286488689314456E11d));
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.0683996E10f), 4000000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.1359993E10f) + "'", float2 == (-2.1359993E10f));
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.577408E8f, 38400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9155584E9f + "'", float2 == 1.9155584E9f);
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.7728E7f), 3.3257728E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.5760896E9f + "'", float2 == 6.5760896E9f);
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.201199E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.896328101253793E13d + "'", double1 == 3.896328101253793E13d);
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-37728.0f), 130.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-75196.0f) + "'", float2 == (-75196.0f));
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.2843494E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6919361452231087E10d + "'", double1 == 2.6919361452231087E10d);
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-5880980.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.88098E8f) + "'", float2 == (-5.88098E8f));
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-4039800.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.918606E8f) + "'", float2 == (-3.918606E8f));
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-2.4846618E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2920241E11f) + "'", float2 == (-1.2920241E11f));
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(50336.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 316270.4156221917d + "'", double1 == 316270.4156221917d);
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.5116963E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5781453413921037E9d + "'", double1 == 1.5781453413921037E9d);
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.1633232E7f, 1054864.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.537619E7f + "'", float2 == 6.537619E7f);
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7760364.0f, 1.013996E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0435128E9f + "'", float2 == 2.0435128E9f);
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3999216.0f, 1.618088E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.036019E7f + "'", float2 == 4.036019E7f);
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 5.146266E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.146266E10f + "'", float2 == 5.146266E10f);
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 3.6216732E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.6216732E7f) + "'", float2 == (-3.6216732E7f));
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-8.57243E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0003507E9f) + "'", float2 == (-3.0003507E9f));
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 5.6250565E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.6250565E11f + "'", float2 == 5.6250565E11f);
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 240440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-240440.0f) + "'", float2 == (-240440.0f));
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.348683E7f, (-2.6263875E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.5830384E8f) + "'", float2 == (-3.5830384E8f));
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 2.0981852E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0981852E11f + "'", float2 == 2.0981852E11f);
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-4.0349945E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4122481E13f) + "'", float2 == (-1.4122481E13f));
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.328289E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0912256291520026E9d + "'", double1 == 2.0912256291520026E9d);
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4011000.0f, 5352968.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8727936E7f + "'", float2 == 1.8727936E7f);
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(64000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 402123.8596594935d + "'", double1 == 402123.8596594935d);
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.6912976E7f), 3.1364758E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.267569E10f + "'", float2 == 6.267569E10f);
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.0436457E10f, 1.0826304E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.108944E10f + "'", float2 == 8.108944E10f);
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6541376.0f, 1.250288E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.6314035E8f + "'", float2 == 2.6314035E8f);
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.858487E10f, 4.9241084E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7565191E11f + "'", float2 == 1.7565191E11f);
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.5090136E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2047782694213346E8d + "'", double1 == 2.2047782694213346E8d);
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1396162E10f, 1872.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2792327E10f + "'", float2 == 2.2792327E10f);
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1486144.0f), (-7.759996E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5519995E13f) + "'", float2 == (-1.5519995E13f));
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 1117368.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.117368E7f + "'", float2 == 1.117368E7f);
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 487684.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4876840.0f + "'", float2 == 4876840.0f);
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2623536.0f, (-1.6067117E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.2081764E9f) + "'", float2 == (-3.2081764E9f));
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.189564E7f, 5.5822426E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1178865E11f + "'", float2 == 1.1178865E11f);
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-1.6132702E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.646446E14f) + "'", float2 == (-5.646446E14f));
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 8025560.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8025560.0f + "'", float2 == 8025560.0f);
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 4.969204E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.938408E9f + "'", float2 == 9.938408E9f);
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 2.258021E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2580212E10f + "'", float2 == 2.2580212E10f);
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.5929004E9f, 1.2404437E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7994675E10f + "'", float2 == 2.7994675E10f);
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.542514E9f, (-799960.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3083429E10f + "'", float2 == 1.3083429E10f);
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-3104.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3104.0f + "'", float2 == 3104.0f);
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 590720.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 590720.0f + "'", float2 == 590720.0f);
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 9.134969E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.134969E12f + "'", float2 == 9.134969E12f);
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (-4.8991702E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.8991703E10f) + "'", float2 == (-4.8991703E10f));
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1267304.0f, 562752.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3660112.0f + "'", float2 == 3660112.0f);
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 1.6515077E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6019625E11f + "'", float2 == 1.6019625E11f);
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(42678.0f, 2651356.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5388068.0f + "'", float2 == 5388068.0f);
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 6.450307E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 8.276644E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.648526E10f + "'", float2 == 2.648526E10f);
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 2.24808E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.7967867E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3855914332536644E10d + "'", double1 == 2.3855914332536644E10d);
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4000000.0f, 3.0182067E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0444134E9f + "'", float2 == 6.0444134E9f);
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-74396.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-148792.0f) + "'", float2 == (-148792.0f));
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.3340794E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.382267994213089E10d + "'", double1 == 8.382267994213089E10d);
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6056688E12f, 1.6617801E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.214661E12f + "'", float2 == 3.214661E12f);
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1181616.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2363232.0f) + "'", float2 == (-2363232.0f));
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 104.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 104.0f + "'", float2 == 104.0f);
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 38.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1330.0f + "'", float2 == 1330.0f);
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-6.650176E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.178428813335831E8d) + "'", double1 == (-4.178428813335831E8d));
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.2996756E10f, 302640.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.599412E10f + "'", float2 == 8.599412E10f);
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8361600.0f, 3.4037414E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.974715E8f + "'", float2 == 6.974715E8f);
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 4813120.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5028224E8f + "'", float2 == 2.5028224E8f);
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-3.266225E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.266225E9f) + "'", float2 == (-3.266225E9f));
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 7.270057E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4540114E10f + "'", float2 == 1.4540114E10f);
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.2704924E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.05491097949225E8d + "'", double1 == 2.05491097949225E8d);
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.557064E7f, 1.6411408E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.639641E8f + "'", float2 == 1.639641E8f);
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 3.3106583E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.6213166E9f + "'", float2 == 6.6213166E9f);
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-1.3948404E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3948404E12f) + "'", float2 == (-1.3948404E12f));
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(200876.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1262141.1317650066d + "'", double1 == 1262141.1317650066d);
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(768.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4825.486315913922d + "'", double1 == 4825.486315913922d);
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 6.605657E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.4074876E13f + "'", float2 == 6.4074876E13f);
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1347584.0f, 3.2075496E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.684616E7f + "'", float2 == 6.684616E7f);
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 5.0699677E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.0699677E8f) + "'", float2 == (-5.0699677E8f));
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(522240.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3281330.694821467d + "'", double1 == 3281330.694821467d);
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.835046E8f), (-2.4799996E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.0367E10f) + "'", float2 == (-5.0367E10f));
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.6437028E9f, 6.070575E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.408817E9f + "'", float2 == 5.408817E9f);
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.759155E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.9902654027227325E10d) + "'", double1 == (-2.9902654027227325E10d));
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 6.920168E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-2176.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4352.0f) + "'", float2 == (-4352.0f));
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 40400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40400.0f + "'", float2 == 40400.0f);
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(180384.0f, (-1982680.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3604592.0f) + "'", float2 == (-3604592.0f));
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.885121E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.326049286464551E9d + "'", double1 == 4.326049286464551E9d);
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.2813837E8f), 1.267304E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.0281594E8f) + "'", float2 == (-4.0281594E8f));
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 6116160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.140656E8f + "'", float2 == 2.140656E8f);
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1493870.0f, 2.1475024E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5937788E7f + "'", float2 == 4.5937788E7f);
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.5506157E10f, 2.4683152E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.106168E10f + "'", float2 == 5.106168E10f);
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.056926E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5490417533921955E10d + "'", double1 == 2.5490417533921955E10d);
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.8784874E8f), 1446668.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.7280413E8f) + "'", float2 == (-3.7280413E8f));
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1486144.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9337718.1451531d) + "'", double1 == (-9337718.1451531d));
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 1, 1.7153152E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4306304E7f + "'", float2 == 3.4306304E7f);
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-5.867085E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.867085E9f) + "'", float2 == (-5.867085E9f));
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 2006400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.043328E8f + "'", float2 == 1.043328E8f);
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-7.317253E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.0977356E11f) + "'", float2 == (-7.0977356E11f));
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2006400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2606583000325121E7d + "'", double1 == 1.2606583000325121E7d);
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 6.5646856E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.29764E9f + "'", float2 == 2.29764E9f);
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2509800.0f, 1772960.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8565520.0f + "'", float2 == 8565520.0f);
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 4.119547E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.1195471E9f + "'", float2 == 4.1195471E9f);
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.2288E7f, 3.5090136E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.475627E7f + "'", float2 == 9.475627E7f);
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-399980.0f), 2.9743E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.940601E8f + "'", float2 == 5.940601E8f);
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.5929004E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000848808748759E10d + "'", double1 == 1.000848808748759E10d);
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 4.036019E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0360192E9f + "'", float2 == 4.0360192E9f);
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(562752.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3535875.0979859265d + "'", double1 == 3535875.0979859265d);
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.256714E8f, 2.580136E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.3254062E10f + "'", float2 == 5.3254062E10f);
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-682568.0f), (-652816.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2670768.0f) + "'", float2 == (-2670768.0f));
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.0503842E10f, 3660112.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.1015003E10f + "'", float2 == 6.1015003E10f);
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.6360864E11f, 2.1475024E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.272602E11f + "'", float2 == 9.272602E11f);
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-168192.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1056781.503185149d) + "'", double1 == (-1056781.503185149d));
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-3.1450144E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 3180.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 318000.0f + "'", float2 == 318000.0f);
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 472128.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-472128.0f) + "'", float2 == (-472128.0f));
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-38200.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-38200.0f) + "'", float2 == (-38200.0f));
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.566370614359172d) + "'", double1 == (-12.566370614359172d));
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(840.0f, (-8226192.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6450704E7f) + "'", float2 == (-1.6450704E7f));
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1614080.0f), (-1.3628912E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0485984E7f) + "'", float2 == (-3.0485984E7f));
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.2404892E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.794223293986836E10d + "'", double1 == 7.794223293986836E10d);
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.272602E11f, 4012876.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8545284E12f + "'", float2 == 1.8545284E12f);
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 117972.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.17972E7f + "'", float2 == 1.17972E7f);
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.035768E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.164066230159355E11d + "'", double1 == 3.164066230159355E11d);
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 5764528.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2464.0f, 2.4044E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8088493E8f + "'", float2 == 4.8088493E8f);
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.9087208E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1992846285006136E10d) + "'", double1 == (-1.1992846285006136E10d));
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-3.172963E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 3.3044886E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3044886E11f + "'", float2 == 3.3044886E11f);
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(81200.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 162400.0f + "'", float2 == 162400.0f);
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-4855240.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.85524E8f) + "'", float2 == (-4.85524E8f));
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8180352.0f, 1.7149842E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.430132E11f + "'", float2 == 3.430132E11f);
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.4352E7f), 1.6559052E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1431063E9f + "'", float2 == 3.1431063E9f);
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-42592.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4259200.0f) + "'", float2 == (-4259200.0f));
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 6.9201684E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-1.624556E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.1985792E8f) + "'", float2 == (-5.1985792E8f));
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-485524.0f), 5.3149016E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.05326984E8f + "'", float2 == 1.05326984E8f);
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.3486951E13f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.474101384206895E13d) + "'", double1 == (-8.474101384206895E13d));
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.759646E10f), 1.4275364E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5233784E11f) + "'", float2 == (-1.5233784E11f));
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6243773E8f, 4.265167E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.101788E8f + "'", float2 == 4.101788E8f);
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-1.6243773E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6243773E8f + "'", float2 == 1.6243773E8f);
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.0114304E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.355004628514771E8d + "'", double1 == 6.355004628514771E8d);
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.0014715E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1425172167679222E10d + "'", double1 == 3.1425172167679222E10d);
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 9061312.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.5682153E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.613657293520016E11d + "'", double1 == 1.613657293520016E11d);
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-161408.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1014156.3740612427d) + "'", double1 == (-1014156.3740612427d));
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3358560.0f, (-3784816.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-852512.0f) + "'", float2 == (-852512.0f));
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3927204.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.46753504710969E7d + "'", double1 == 2.46753504710969E7d);
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1436.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 50260.0f + "'", float2 == 50260.0f);
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.3043392E7f, 436800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.6960384E7f + "'", float2 == 6.6960384E7f);
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(547928.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3442733.1589922966d + "'", double1 == 3442733.1589922966d);
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.9734593E9f), 4.220992E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.8624988E9f) + "'", float2 == (-3.8624988E9f));
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.894608E8f), 4.8317854E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.585679E10f + "'", float2 == 9.585679E10f);
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1680280.0f), 2930536.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2500512.0f + "'", float2 == 2500512.0f);
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(320080.0f, 4.265167E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.59435E7f + "'", float2 == 8.59435E7f);
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1999712.0f, (-7.912595E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5785196E9f) + "'", float2 == (-1.5785196E9f));
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.2409407E11f, 4.48343E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.57155E11f + "'", float2 == 2.57155E11f);
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 5.3254062E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.6516593E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9227237141570606E10d + "'", double1 == 2.9227237141570606E10d);
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(22276.0f, 2.8958085E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.7916616E9f + "'", float2 == 5.7916616E9f);
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 8022000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8022000.0f) + "'", float2 == (-8022000.0f));
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-156.0f), 2.0982605E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.1965207E9f + "'", float2 == 4.1965207E9f);
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 4.567484E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.567484E13f + "'", float2 == 4.567484E13f);
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.252644E8f), 4.2062241E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.7619195E9f + "'", float2 == 6.7619195E9f);
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6304718E10f, (-4.7095827E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.166752E10f + "'", float2 == 3.166752E10f);
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 320080.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3200800.0f + "'", float2 == 3200800.0f);
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.2277826E8f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.455565E8f + "'", float2 == 4.455565E8f);
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(832416.0f, 4813120.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1291072E7f + "'", float2 == 1.1291072E7f);
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.618088E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0166746747323602E8d + "'", double1 == 1.0166746747323602E8d);
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.3234654E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.315578486530809E10d + "'", double1 == 8.315578486530809E10d);
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.8934326E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1896788143782256E9d) + "'", double1 == (-1.1896788143782256E9d));
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.7103856E7f, (-2662.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4202388E7f + "'", float2 == 3.4202388E7f);
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-83800.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4357600.0f) + "'", float2 == (-4357600.0f));
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6470367E10f, 2531760.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2945797E10f + "'", float2 == 3.2945797E10f);
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 162928.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.62928E7f + "'", float2 == 1.62928E7f);
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.7595165E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1055368497000204E10d + "'", double1 == 1.1055368497000204E10d);
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1969552E7f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3939104E7f + "'", float2 == 2.3939104E7f);
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 6.503883E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.503883E11f + "'", float2 == 6.503883E11f);
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 9.630565E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.630565E9f + "'", float2 == 9.630565E9f);
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.0838817E9f, 96896.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.1679575E9f + "'", float2 == 6.1679575E9f);
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.3947754E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.763632611741522E10d + "'", double1 == 8.763632611741522E10d);
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.4390781E9f), 5.367219E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.02466224E11f + "'", float2 == 1.02466224E11f);
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 2004600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4009200.0f + "'", float2 == 4009200.0f);
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1986400.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 168640.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1686400.0f + "'", float2 == 1686400.0f);
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(85128.0f, (-68.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 170120.0f + "'", float2 == 170120.0f);
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(382960.0f, 2.8834496E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.843491E7f + "'", float2 == 5.843491E7f);
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.2497379E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.852335017193948E10d) + "'", double1 == (-7.852335017193948E10d));
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-1.94768E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.89536E7f) + "'", float2 == (-3.89536E7f));
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-75196.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7519600.0f) + "'", float2 == (-7519600.0f));
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.8125248E7f), (-4.8579334E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0078372E9f) + "'", float2 == (-1.0078372E9f));
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.05326984E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.617889583183393E8d + "'", double1 == 6.617889583183393E8d);
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1.6205367E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.6718787E10f + "'", float2 == 5.6718787E10f);
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1686400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0595963702027654E7d + "'", double1 == 1.0595963702027654E7d);
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 4.180777E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.180777E8f + "'", float2 == 4.180777E8f);
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 6.070575E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.8884577E9f + "'", float2 == 5.8884577E9f);
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(291616.0f, 2612540.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5808312.0f + "'", float2 == 5808312.0f);
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-43936.0f), 5.146266E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0292523E11f + "'", float2 == 1.0292523E11f);
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-377280.0f), 38784.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-676992.0f) + "'", float2 == (-676992.0f));
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-1.947304E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.947304E11f) + "'", float2 == (-1.947304E11f));
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 2.10214E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.726848E8f + "'", float2 == 6.726848E8f);
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 1.4819382E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4819382E9f + "'", float2 == 1.4819382E9f);
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 2.8806557E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8806557E8f + "'", float2 == 2.8806557E8f);
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2000.0f, 1.451964E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.903928E11f + "'", float2 == 2.903928E11f);
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2128000.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4256000.0f + "'", float2 == 4256000.0f);
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.684616E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.200068103533758E8d + "'", double1 == 4.200068103533758E8d);
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-332344.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.2237368E7f) + "'", float2 == (-3.2237368E7f));
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.8609195E14f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7721839E15f + "'", float2 == 1.7721839E15f);
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 5.146266E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.146266E9f + "'", float2 == 5.146266E9f);
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.4616225E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.183645256912101E11d + "'", double1 == 9.183645256912101E11d);
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(210432.0f, 394368.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1209600.0f + "'", float2 == 1209600.0f);
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(155264.0f, 4.455565E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.9142355E8f + "'", float2 == 8.9142355E8f);
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0139989E9f, (-1.804268E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6671442E9f + "'", float2 == 1.6671442E9f);
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-794560.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.513993E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2079068935804504E10d + "'", double1 == 2.2079068935804504E10d);
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.034105E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.419658335750552E12d + "'", double1 == 4.419658335750552E12d);
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 2.49632E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.49632E9f + "'", float2 == 2.49632E9f);
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.137448E10f, 11360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8274897E11f + "'", float2 == 1.8274897E11f);
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4011000.0f, 5285920.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.859384E7f + "'", float2 == 1.859384E7f);
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.148365E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.748087129607891E8d + "'", double1 == 5.748087129607891E8d);
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.4616225E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-5.913048E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 40040.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 400400.0f + "'", float2 == 400400.0f);
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2404400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5107290752582597E7d + "'", double1 == 1.5107290752582597E7d);
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1.51334E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.51334E11f + "'", float2 == 1.51334E11f);
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 5.4528707E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.2892844E11f + "'", float2 == 5.2892844E11f);
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.1680968E15f), (-1.6353052E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.3361968E15f) + "'", float2 == (-4.3361968E15f));
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.3252027E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.326494058276493E9d + "'", double1 == 8.326494058276493E9d);
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7620288.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.787968159807692E7d + "'", double1 == 4.787968159807692E7d);
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(25602.0f, 5407040.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0865284E7f + "'", float2 == 1.0865284E7f);
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6596749E9f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3193498E9f + "'", float2 == 3.3193498E9f);
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.186743E7f), 5285920.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3316302E8f) + "'", float2 == (-1.3316302E8f));
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 26740.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-26740.0f) + "'", float2 == (-26740.0f));
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.735482E14f), 8565520.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.470964E14f) + "'", float2 == (-9.470964E14f));
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 1754576.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.6132702E13f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.013647591255086E14d) + "'", double1 == (-1.013647591255086E14d));
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.5472464E7f), (-1.9734593E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.9778637E9f) + "'", float2 == (-3.9778637E9f));
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 8.9142355E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.646808E10f + "'", float2 == 8.646808E10f);
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2008760.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4017720.0f + "'", float2 == 4017720.0f);
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.5433948E11f, 2.3939104E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0872682E11f + "'", float2 == 3.0872682E11f);
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.2282363E13f, 1976.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.456473E13f + "'", float2 == 8.456473E13f);
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5407040.0f, 6.070575E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3222558E8f + "'", float2 == 1.3222558E8f);
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-2.3650173E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3650173E10f + "'", float2 == 2.3650173E10f);
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.376008E10f, (-1.9991605E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.7536947E10f + "'", float2 == 4.7536947E10f);
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 4457200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4457200.0f) + "'", float2 == (-4457200.0f));
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9061312.0f, (-4.9618E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.742374E8f) + "'", float2 == (-9.742374E8f));
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(83800.0f, (-4.2085056E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.400251E7f) + "'", float2 == (-8.400251E7f));
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-877288.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5512163.071764965d) + "'", double1 == (-5512163.071764965d));
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.484328E8f, 2072800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5010112E9f + "'", float2 == 1.5010112E9f);
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (-8.422425E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.4224246E10f) + "'", float2 == (-8.4224246E10f));
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.0360192E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5359056536934708E10d + "'", double1 == 2.5359056536934708E10d);
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-1.3486951E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3486951E13f) + "'", float2 == (-1.3486951E13f));
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-315604.0f), (-8.763765E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.759065E8f) + "'", float2 == (-1.759065E8f));
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.099988E7f), 1.6559052E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2298104E9f + "'", float2 == 3.2298104E9f);
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.2815909E11f, 133200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5631844E11f + "'", float2 == 2.5631844E11f);
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.5052416E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2024082519234665E10d + "'", double1 == 2.2024082519234665E10d);
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.1419427E8f), 2.5070752E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.30265E7f + "'", float2 == 7.30265E7f);
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8112.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50969.1992118408d + "'", double1 == 50969.1992118408d);
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.0943795E9f, (-1.7423082E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.8402975E9f + "'", float2 == 3.8402975E9f);
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 4.973703E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.973703E12f + "'", float2 == 4.973703E12f);
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.5862463E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.966679366308519E11d + "'", double1 == 9.966679366308519E11d);
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-7519600.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.724704023586762E7d) + "'", double1 == (-4.724704023586762E7d));
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 1.6547232E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6547232E9f + "'", float2 == 1.6547232E9f);
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1683880.0f), 9.137448E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8274558E11f + "'", float2 == 1.8274558E11f);
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 5.408817E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.408817E9f + "'", float2 == 5.408817E9f);
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.0022E8f), (-297656.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0103531E8f) + "'", float2 == (-2.0103531E8f));
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-9.470964E14f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.8941928E15f) + "'", float2 == (-1.8941928E15f));
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.8437504E8f), (-1.1555496E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.79986E9f) + "'", float2 == (-1.79986E9f));
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 917600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.5913296E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.998618761599969E8d) + "'", double1 == (-9.998618761599969E8d));
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.1097646E10f), 2020000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.2191251E10f) + "'", float2 == (-2.2191251E10f));
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 1.9742276E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9742276E10f + "'", float2 == 1.9742276E10f);
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 6.726848E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.726848E8f) + "'", float2 == (-6.726848E8f));
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0086656E11f, (-1.0840991E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.148025E13f) + "'", float2 == (-2.148025E13f));
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 3.0076518E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0076518E10f + "'", float2 == 3.0076518E10f);
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(853600.0f, 7.992932E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6002936E9f + "'", float2 == 1.6002936E9f);
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.3576E8f, 38784.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.715976E8f + "'", float2 == 8.715976E8f);
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.9427952E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 3.270452E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1723384E9f + "'", float2 == 3.1723384E9f);
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.004E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.029061519866541E8d + "'", double1 == 5.029061519866541E8d);
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 1.0795005E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0795005E9f + "'", float2 == 1.0795005E9f);
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-7.4887994E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.705351410716789E9d) + "'", double1 == (-4.705351410716789E9d));
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(335856.0f, (-2339360.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4007008.0f) + "'", float2 == (-4007008.0f));
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.9269445E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2107349445548738E10d + "'", double1 == 1.2107349445548738E10d);
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(33200.0f, 1.4732173E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9470986E8f + "'", float2 == 2.9470986E8f);
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.9618E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1175908857163672E9d + "'", double1 == 3.1175908857163672E9d);
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.0972828E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.894431267311841E9d) + "'", double1 == (-6.894431267311841E9d));
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8857312.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.5652132619505435E7d + "'", double1 == 5.5652132619505435E7d);
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.1653534E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9888502041261384E12d + "'", double1 == 1.9888502041261384E12d);
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.0853574E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3102686744677003E11d + "'", double1 == 1.3102686744677003E11d);
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-1181616.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.181616E7f) + "'", float2 == (-1.181616E7f));
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.4843616E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.326518995661582E7d) + "'", double1 == (-9.326518995661582E7d));
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1177504E7f, 1.4107242E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8438034E9f + "'", float2 == 2.8438034E9f);
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2219360.0f, 5.0014715E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0007382E10f + "'", float2 == 1.0007382E10f);
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 917600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9176000.0f + "'", float2 == 9176000.0f);
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.398E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2766190209694165E8d + "'", double1 == 5.2766190209694165E8d);
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 4.467426E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.467426E10f) + "'", float2 == (-4.467426E10f));
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.7280413E8f), 8438384.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.287315E8f) + "'", float2 == (-7.287315E8f));
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1386432.0f, 1.6411408E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.559568E7f + "'", float2 == 3.559568E7f);
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 2.481899E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-3.879806E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.879806E7f) + "'", float2 == (-3.879806E7f));
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 80348.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8034800.0f + "'", float2 == 8034800.0f);
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-24640.0f), 1.4540114E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9080179E10f + "'", float2 == 2.9080179E10f);
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.4287056E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.976822034205195E7d + "'", double1 == 8.976822034205195E7d);
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 1686400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6864E7f + "'", float2 == 1.6864E7f);
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1.65133E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(100344.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 630479.9464636284d + "'", double1 == 630479.9464636284d);
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.3650173E10f), (-8.82944E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.9066234E10f) + "'", float2 == (-4.9066234E10f));
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 7.056059E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4696206E11f + "'", float2 == 2.4696206E11f);
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 1.3234654E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 2606560.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.60656E8f + "'", float2 == 2.60656E8f);
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.894608E8f), 4.9604755E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.843059E10f + "'", float2 == 9.843059E10f);
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.0946214E8f, 10608.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6189455E9f + "'", float2 == 1.6189455E9f);
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1342516.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8435276.80585351d + "'", double1 == 8435276.80585351d);
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 3.290318E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.290318E7f) + "'", float2 == (-3.290318E7f));
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.2480208E7f, (-8.44088E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6232156E9f) + "'", float2 == (-1.6232156E9f));
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-4.534768E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5871688E10f) + "'", float2 == (-1.5871688E10f));
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.947304E11f), (-3892000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.894686E11f) + "'", float2 == (-3.894686E11f));
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3516.0f, 2.0981852E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.1963713E10f + "'", float2 == 4.1963713E10f);
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-8.82944E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.82944E10f) + "'", float2 == (-8.82944E10f));
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-336058.0f), 1.7276411E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4546102E9f + "'", float2 == 3.4546102E9f);
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-245296.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.3793712E7f) + "'", float2 == (-2.3793712E7f));
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.59435E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.3999896158033E8d + "'", double1 == 5.3999896158033E8d);
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7542720.0f, 44572.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5174584E7f + "'", float2 == 1.5174584E7f);
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 3028.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 293716.0f + "'", float2 == 293716.0f);
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 1.5512264E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5512264E12f + "'", float2 == 1.5512264E12f);
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.9195107E8f), 89104.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.8372394E8f) + "'", float2 == (-3.8372394E8f));
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-6.790563E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.790563E7f) + "'", float2 == (-6.790563E7f));
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8079600.0f, 3316.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6165832E7f + "'", float2 == 1.6165832E7f);
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1418496E9f, 1.344512E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3105894E9f + "'", float2 == 2.3105894E9f);
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6451552E7f, (-4457200.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3988704E7f + "'", float2 == 2.3988704E7f);
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-1.5233784E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.874811E12f) + "'", float2 == (-4.874811E12f));
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.0962961E11f, 9.272602E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2737796E12f + "'", float2 == 2.2737796E12f);
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.4107242E9f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8214484E9f + "'", float2 == 2.8214484E9f);
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(57600.0f, 1.6451552E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3018304E7f + "'", float2 == 3.3018304E7f);
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.3511971E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.489821891487372E8d + "'", double1 == 8.489821891487372E8d);
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (-3.8926917E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.8926916E11f) + "'", float2 == (-3.8926916E11f));
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(290272.0f, 4.265167E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.588389E7f + "'", float2 == 8.588389E7f);
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 6837000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3674E7f + "'", float2 == 1.3674E7f);
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 6116160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.1546898E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.255129935444653E9d) + "'", double1 == (-7.255129935444653E9d));
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-631208.0f), 2290368.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3318320.0f + "'", float2 == 3318320.0f);
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 2704.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2704.0f + "'", float2 == 2704.0f);
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.635808E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0278084790966825E8d + "'", double1 == 1.0278084790966825E8d);
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5016248.0f, 3.6410336E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.382392E8f + "'", float2 == 7.382392E8f);
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 1.2815909E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2815909E11f + "'", float2 == 1.2815909E11f);
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 6.4503074E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.980555E8f, 6.201199E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2403993E13f + "'", float2 == 1.2403993E13f);
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-3.3306493E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.3306493E10f) + "'", float2 == (-3.3306493E10f));
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 4.04558E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0455803E9f + "'", float2 == 4.0455803E9f);
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.8958085E9f, (-1.3486951E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.696811E13f) + "'", float2 == (-2.696811E13f));
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.4887994E8f), (-148792.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4980575E9f) + "'", float2 == (-1.4980575E9f));
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.2996756E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7015658857151468E11d + "'", double1 == 2.7015658857151468E11d);
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.7470934E10f, 2.5336707E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0561528E11f + "'", float2 == 1.0561528E11f);
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-2930536.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 1.3759536E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3759536E10f + "'", float2 == 1.3759536E10f);
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.54229E8f, 8.981531E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.867152E10f + "'", float2 == 1.867152E10f);
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.3600115E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9961130935956907E9d + "'", double1 == 3.9961130935956907E9d);
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-881200.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1762400.0f) + "'", float2 == (-1762400.0f));
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-1.3148335E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3148335E10f) + "'", float2 == (-1.3148335E10f));
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-2181256.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4362512.0f) + "'", float2 == (-4362512.0f));
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(21400.0f, 1916112.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3875024.0f + "'", float2 == 3875024.0f);
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.6896E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.061606989501063E8d + "'", double1 == 1.061606989501063E8d);
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.2837E9f, 1.4107242E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.388848E9f + "'", float2 == 7.388848E9f);
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.3257728E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0896446791977512E10d + "'", double1 == 2.0896446791977512E10d);
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 1.929769E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.929769E11f + "'", float2 == 1.929769E11f);
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-7.7570775E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.873915565714537E12d) + "'", double1 == (-4.873915565714537E12d));
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.879883E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.2077134144023415E10d + "'", double1 == 6.2077134144023415E10d);
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 7.189564E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.189564E8f + "'", float2 == 7.189564E8f);
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.773595E7f, 1.3784E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.630399E8f + "'", float2 == 1.630399E8f);
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.650176E7f, 4.1927528E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.386835E11f + "'", float2 == 8.386835E11f);
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-9.081546E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.706103790164001E9d) + "'", double1 == (-5.706103790164001E9d));
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 2557968.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.557968E8f + "'", float2 == 2.557968E8f);
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1982680.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3965360.0f + "'", float2 == 3965360.0f);
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 485524.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.2580212E10f, 1054864.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5162533E10f + "'", float2 == 4.5162533E10f);
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.2409408E9f, 3917588.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4897167E9f + "'", float2 == 2.4897167E9f);
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 1.8274558E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8274558E11f + "'", float2 == 1.8274558E11f);
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.4819382E9f, 3.96536E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0894596E10f + "'", float2 == 1.0894596E10f);
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-6.194852E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.8923403090679507E12d) + "'", double1 == (-3.8923403090679507E12d));
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 5299488.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5299488.0f) + "'", float2 == (-5299488.0f));
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1.05326984E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.6864445E9f + "'", float2 == 3.6864445E9f);
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4012876.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5213643522733588E7d) + "'", double1 == (-2.5213643522733588E7d));
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-4.3576E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-43936.0f), 1.697976E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3958643E9f + "'", float2 == 3.3958643E9f);
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.828515E9f, 1.06E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7678232E10f + "'", float2 == 1.7678232E10f);
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.9593944E7f), 2.4683152E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.9821584E7f) + "'", float2 == (-2.9821584E7f));
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.0165331E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.387065963845423E9d + "'", double1 == 6.387065963845423E9d);
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 3.0838817E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0838817E9f) + "'", float2 == (-3.0838817E9f));
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(84320.0f, (-2.4799996E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.9599824E10f) + "'", float2 == (-4.9599824E10f));
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 6.687632E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.687632E9f + "'", float2 == 6.687632E9f);
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.095621E8f), 1688720.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.157468E8f) + "'", float2 == (-6.157468E8f));
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 2.8579916E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.772252E9f + "'", float2 == 2.772252E9f);
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3784816.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3780700281578213E7d) + "'", double1 == (-2.3780700281578213E7d));
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 5232.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 272064.0f + "'", float2 == 272064.0f);
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.7569709E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1039373618358387E10d + "'", double1 == 1.1039373618358387E10d);
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.3425507E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.435494958047374E8d + "'", double1 == 8.435494958047374E8d);
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.501465E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.433982942653945E12d + "'", double1 == 9.433982942653945E12d);
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.098972E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9471415313633504E13d + "'", double1 == 1.9471415313633504E13d);
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 20.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.681064E7f), (-3.4836E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6329328E8f) + "'", float2 == (-1.6329328E8f));
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(740016.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4649657.658277809d + "'", double1 == 4649657.658277809d);
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.751075E7f), (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.550215E8f) + "'", float2 == (-1.550215E8f));
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-4.85524E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.85524E9f) + "'", float2 == (-4.85524E9f));
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.7464512E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0973276519546157E8d) + "'", double1 == (-1.0973276519546157E8d));
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 713656.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7136560.0f + "'", float2 == 7136560.0f);
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.270452E7f, 2.7179224E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1976749E8f + "'", float2 == 1.1976749E8f);
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-6.716589E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.716589E9f) + "'", float2 == (-6.716589E9f));
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.15731096E8f), 3.166752E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.310358E10f + "'", float2 == 6.310358E10f);
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 1.6056689E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2113377E11f + "'", float2 == 3.2113377E11f);
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.266225E9f), 4.693312E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.4385833E9f) + "'", float2 == (-6.4385833E9f));
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.0438949E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9125355626827554E11d + "'", double1 == 1.9125355626827554E11d);
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.4107E8f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.28214E9f + "'", float2 == 1.28214E9f);
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-9.478182E7f), (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.8956363E8f) + "'", float2 == (-1.8956363E8f));
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.4580512E9f, 404.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9161032E9f + "'", float2 == 2.9161032E9f);
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.2813837E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.061754172539488E9d) + "'", double1 == (-2.061754172539488E9d));
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.4799996E10f), 178744.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.9599635E10f) + "'", float2 == (-4.9599635E10f));
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 25602.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2483394.0f + "'", float2 == 2483394.0f);
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.60656E8f, 5407040.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.3212608E8f + "'", float2 == 5.3212608E8f);
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.29764E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4436497487064245E10d + "'", double1 == 1.4436497487064245E10d);
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 388800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3608E7f + "'", float2 == 1.3608E7f);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.7888886E9f), 3.1328E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.515121E9f) + "'", float2 == (-5.515121E9f));
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6399920.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.021188331112478E7d + "'", double1 == 4.021188331112478E7d);
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 1.9903314E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9903314E11f + "'", float2 == 1.9903314E11f);
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.8349195E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1529139367921019E9d + "'", double1 == 1.1529139367921019E9d);
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 100344.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100344.0f) + "'", float2 == (-100344.0f));
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.6718833E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1920678895582184E10d + "'", double1 == 4.1920678895582184E10d);
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3604592.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.264831949277708E7d) + "'", double1 == (-2.264831949277708E7d));
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.49632E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5684841146018545E10d + "'", double1 == 1.5684841146018545E10d);
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.2623167E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4745824.0f), (-336058.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0163764E7f) + "'", float2 == (-1.0163764E7f));
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.826247E8f, 2.7179224E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.196079E8f + "'", float2 == 8.196079E8f);
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(38200.0f, (-3.4888733E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.977739E10f) + "'", float2 == (-6.977739E10f));
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 2109728.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-167602.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-167602.0f) + "'", float2 == (-167602.0f));
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(881200.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5536742.892686651d + "'", double1 == 5536742.892686651d);
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.025089E7f), 2.8975222E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.190027E8f + "'", float2 == 4.190027E8f);
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-4.85524E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4380296.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.752221146829751E7d + "'", double1 == 2.752221146829751E7d);
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.8545284E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-1681920.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1681920.0f + "'", float2 == 1681920.0f);
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 6.201344E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.201344E10f + "'", float2 == 6.201344E10f);
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-8714412.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.714412E8f) + "'", float2 == (-8.714412E8f));
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8952160.0f, 3270624.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4445568E7f + "'", float2 == 2.4445568E7f);
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 3.88E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.88E7f) + "'", float2 == (-3.88E7f));
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 7.804208E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.731473E9f + "'", float2 == 2.731473E9f);
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 1.1418496E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1418496E10f + "'", float2 == 1.1418496E10f);
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.3726208E7f, 2.4299053E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.1343347E8f + "'", float2 == 5.1343347E8f);
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-1.5705144E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5705144E7f + "'", float2 == 1.5705144E7f);
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(40470.0f, 7.093296E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4194686E8f + "'", float2 == 1.4194686E8f);
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.3311792E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.364045590663075E7d + "'", double1 == 8.364045590663075E7d);
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6515496E8f, 3.22816E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9487312E8f + "'", float2 == 3.9487312E8f);
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 3.6750904E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.6750904E9f + "'", float2 == 3.6750904E9f);
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(861840.0f, 1.2409407E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.482054E10f + "'", float2 == 2.482054E10f);
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(547928.0f, 2000020.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5095896.0f + "'", float2 == 5095896.0f);
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.430132E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.155215471868478E12d + "'", double1 == 2.155215471868478E12d);
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 499928.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 999856.0f + "'", float2 == 999856.0f);
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.7319126E8f, 3.3257728E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2115372E9f + "'", float2 == 1.2115372E9f);
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-1.1775408E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1422145E9f) + "'", float2 == (-1.1422145E9f));
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.8375388E9f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.6750776E9f + "'", float2 == 3.6750776E9f);
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.6254778E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2779548593138356E9d) + "'", double1 == (-2.2779548593138356E9d));
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2290368.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4390806565634295E7d) + "'", double1 == (-1.4390806565634295E7d));
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 2.4897167E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4897167E11f + "'", float2 == 2.4897167E11f);
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.6229244E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0197134684424667E11d + "'", double1 == 1.0197134684424667E11d);
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 7.95192E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.95192E11f + "'", float2 == 7.95192E11f);
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-336776.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 336776.0f + "'", float2 == 336776.0f);
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2362880.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4846412898628501E7d + "'", double1 == 1.4846412898628501E7d);
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.034105E11f, 1036904.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.406823E12f + "'", float2 == 1.406823E12f);
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 3.96536E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.96536E9f + "'", float2 == 3.96536E9f);
    }
}

