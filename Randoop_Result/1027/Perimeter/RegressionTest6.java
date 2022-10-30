package Perimeter;

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
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 2.5734292E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.1468585E9f + "'", float2 == 5.1468585E9f);
    }

    @Test
    public void test03002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03002");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1976.0f, 8574600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7153152E7f + "'", float2 == 1.7153152E7f);
    }

    @Test
    public void test03003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03003");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 60560.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-60560.0f) + "'", float2 == (-60560.0f));
    }

    @Test
    public void test03004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03004");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(178744.0f, 2703520.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5764528.0f + "'", float2 == 5764528.0f);
    }

    @Test
    public void test03005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03005");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-7.13654E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.4840203272099406E8d) + "'", double1 == (-4.4840203272099406E8d));
    }

    @Test
    public void test03006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03006");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.1653535E9f, 214.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.3307075E9f + "'", float2 == 6.3307075E9f);
    }

    @Test
    public void test03007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03007");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1772960.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1772960.0f) + "'", float2 == (-1772960.0f));
    }

    @Test
    public void test03008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03008");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.3026532E12f, 1.51334E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.635573E12f + "'", float2 == 6.635573E12f);
    }

    @Test
    public void test03009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03009");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-60560.0f), 2703520.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5285920.0f + "'", float2 == 5285920.0f);
    }

    @Test
    public void test03010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03010");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 2.3737376E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03011");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 1.5876517E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5400221E12f + "'", float2 == 1.5400221E12f);
    }

    @Test
    public void test03012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03012");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-2.5336707E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5336707E10f + "'", float2 == 2.5336707E10f);
    }

    @Test
    public void test03013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03013");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test03014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03014");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.8143789E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1400078720472953E9d + "'", double1 == 1.1400078720472953E9d);
    }

    @Test
    public void test03015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03015");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 9.021722E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.886951E9f + "'", float2 == 2.886951E9f);
    }

    @Test
    public void test03016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03016");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.012876E7f), 1.6547232E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.7163056E7f) + "'", float2 == (-4.7163056E7f));
    }

    @Test
    public void test03017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03017");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.590605E7f), 3.3818478E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.6718833E9f + "'", float2 == 6.6718833E9f);
    }

    @Test
    public void test03018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03018");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.52982E7f, (-5.7742726E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0842582E9f) + "'", float2 == (-1.0842582E9f));
    }

    @Test
    public void test03019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03019");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0826304E7f, (-2.1680968E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.3361914E13f) + "'", float2 == (-4.3361914E13f));
    }

    @Test
    public void test03020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03020");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.2500508E9f), (-1.0044896E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.5201915E9f) + "'", float2 == (-2.5201915E9f));
    }

    @Test
    public void test03021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03021");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4953552.0f, 394.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9907892.0f + "'", float2 == 9907892.0f);
    }

    @Test
    public void test03022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03022");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(640156.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4022218.773502855d + "'", double1 == 4022218.773502855d);
    }

    @Test
    public void test03023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03023");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1.6229244E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6229244E10f + "'", float2 == 1.6229244E10f);
    }

    @Test
    public void test03024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03024");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 2085076.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2085076.0f + "'", float2 == 2085076.0f);
    }

    @Test
    public void test03025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03025");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6837000.0f, 3.2480207E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.5097155E9f + "'", float2 == 6.5097155E9f);
    }

    @Test
    public void test03026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03026");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 2.258021E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.174171E11f + "'", float2 == 1.174171E11f);
    }

    @Test
    public void test03027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03027");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-7.751075E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.8701441811484075E8d) + "'", double1 == (-4.8701441811484075E8d));
    }

    @Test
    public void test03028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03028");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 320000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.104E7f + "'", float2 == 3.104E7f);
    }

    @Test
    public void test03029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03029");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 3.902104E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.804208E7f + "'", float2 == 7.804208E7f);
    }

    @Test
    public void test03030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03030");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 6.542514E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03031");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 2176.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2176.0f) + "'", float2 == (-2176.0f));
    }

    @Test
    public void test03032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03032");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.6192524E9f), 2.24808E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.7888886E9f) + "'", float2 == (-2.7888886E9f));
    }

    @Test
    public void test03033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03033");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.193276E7f, 2509800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.888512E7f + "'", float2 == 2.888512E7f);
    }

    @Test
    public void test03034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03034");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.1421645E9f, 1.0698913E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5682153E10f + "'", float2 == 2.5682153E10f);
    }

    @Test
    public void test03035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03035");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.6309226E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.281375928049889E9d + "'", double1 == 2.281375928049889E9d);
    }

    @Test
    public void test03036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03036");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-588800.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1177600.0f) + "'", float2 == (-1177600.0f));
    }

    @Test
    public void test03037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03037");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(398680.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2504980.3182663573d + "'", double1 == 2504980.3182663573d);
    }

    @Test
    public void test03038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03038");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 9.170133E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.170133E7f + "'", float2 == 9.170133E7f);
    }

    @Test
    public void test03039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03039");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.908404E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.597315517405154E11d + "'", double1 == 5.597315517405154E11d);
    }

    @Test
    public void test03040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03040");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 45760.0f + "'", float2 == 45760.0f);
    }

    @Test
    public void test03041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03041");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (-3.097426E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.097426E12f) + "'", float2 == (-3.097426E12f));
    }

    @Test
    public void test03042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03042");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.172963E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9936313747842224E9d) + "'", double1 == (-1.9936313747842224E9d));
    }

    @Test
    public void test03043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03043");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 5.5055165E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03044");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-25.132741228718345d) + "'", double1 == (-25.132741228718345d));
    }

    @Test
    public void test03045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03045");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-10.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test03046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03046");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 1.2409407E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2409407E11f + "'", float2 == 1.2409407E11f);
    }

    @Test
    public void test03047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03047");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 4.568726E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.137452E10f + "'", float2 == 9.137452E10f);
    }

    @Test
    public void test03048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03048");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 2.1285071E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2570143E9f + "'", float2 == 4.2570143E9f);
    }

    @Test
    public void test03049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03049");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.96536E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4915091689677644E9d + "'", double1 == 2.4915091689677644E9d);
    }

    @Test
    public void test03050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03050");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.1775408E7f), (-4.759155E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1873392E8f) + "'", float2 == (-1.1873392E8f));
    }

    @Test
    public void test03051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03051");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 6.450307E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.450307E10f) + "'", float2 == (-6.450307E10f));
    }

    @Test
    public void test03052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03052");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.4503074E11f, (-1.5995194E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2900295E12f + "'", float2 == 1.2900295E12f);
    }

    @Test
    public void test03053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03053");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 5200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52000.0f + "'", float2 == 52000.0f);
    }

    @Test
    public void test03054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03054");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.7423081E9f), 1492.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.484613E9f) + "'", float2 == (-3.484613E9f));
    }

    @Test
    public void test03055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03055");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.2500508E8f), (-3960020.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.579302E8f) + "'", float2 == (-2.579302E8f));
    }

    @Test
    public void test03056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03056");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-4209192.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4732173E8f) + "'", float2 == (-1.4732173E8f));
    }

    @Test
    public void test03057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03057");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1844320.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1588204325737454E7d + "'", double1 == 1.1588204325737454E7d);
    }

    @Test
    public void test03058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03058");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 1.2410573E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.453498E10f + "'", float2 == 6.453498E10f);
    }

    @Test
    public void test03059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03059");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.1927528E11f, 60560.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.385507E11f + "'", float2 == 8.385507E11f);
    }

    @Test
    public void test03060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03060");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.946497E8f, 4039800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.97379E8f + "'", float2 == 7.97379E8f);
    }

    @Test
    public void test03061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03061");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.24808E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4125103225364283E8d + "'", double1 == 1.4125103225364283E8d);
    }

    @Test
    public void test03062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03062");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.2738432E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03063");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8342624.0f, 42682.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6770612E7f + "'", float2 == 1.6770612E7f);
    }

    @Test
    public void test03064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03064");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 3.0999747E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0999747E12f) + "'", float2 == (-3.0999747E12f));
    }

    @Test
    public void test03065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03065");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.2230792E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.684833258956963E7d + "'", double1 == 7.684833258956963E7d);
    }

    @Test
    public void test03066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03066");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.1177504E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.023032890374105E7d + "'", double1 == 7.023032890374105E7d);
    }

    @Test
    public void test03067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03067");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 9.134969E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.8609195E14f + "'", float2 == 8.8609195E14f);
    }

    @Test
    public void test03068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03068");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 106.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-106.0f) + "'", float2 == (-106.0f));
    }

    @Test
    public void test03069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03069");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(210432.0f, (-8.066351E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6132702E13f) + "'", float2 == (-1.6132702E13f));
    }

    @Test
    public void test03070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03070");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 8.800609E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.800609E8f + "'", float2 == 8.800609E8f);
    }

    @Test
    public void test03071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03071");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 4564880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03072");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-39300.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-246929.18257215773d) + "'", double1 == (-246929.18257215773d));
    }

    @Test
    public void test03073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03073");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(332536.0f, (-1.6721872E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.2778672E7f) + "'", float2 == (-3.2778672E7f));
    }

    @Test
    public void test03074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03074");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1411904.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03075");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 4.0054E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0054E9f + "'", float2 == 4.0054E9f);
    }

    @Test
    public void test03076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03076");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 1.06E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.06E8f + "'", float2 == 1.06E8f);
    }

    @Test
    public void test03077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03077");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-32.0f), (-877288.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1754640.0f) + "'", float2 == (-1754640.0f));
    }

    @Test
    public void test03078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03078");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 2.3859936E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.3859936E7f) + "'", float2 == (-2.3859936E7f));
    }

    @Test
    public void test03079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03079");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(16008.0f, 4.21204E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.424112E9f + "'", float2 == 8.424112E9f);
    }

    @Test
    public void test03080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03080");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-572.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03081");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8361600.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.253748226451283E7d + "'", double1 == 5.253748226451283E7d);
    }

    @Test
    public void test03082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03082");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.194835E10f), 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.238967E11f) + "'", float2 == (-1.238967E11f));
    }

    @Test
    public void test03083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03083");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.773595E7f, (-1.94768E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.65183E7f + "'", float2 == 9.65183E7f);
    }

    @Test
    public void test03084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03084");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-1681920.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03085");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.39048E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.736643505927071E7d) + "'", double1 == (-8.736643505927071E7d));
    }

    @Test
    public void test03086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03086");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 713654.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.13654E7f + "'", float2 == 7.13654E7f);
    }

    @Test
    public void test03087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03087");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6096.0f, 1.9131254E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.826263E9f + "'", float2 == 3.826263E9f);
    }

    @Test
    public void test03088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03088");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 6.557064E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03089");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1091432.0f), 1.8994848E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.7967867E9f + "'", float2 == 3.7967867E9f);
    }

    @Test
    public void test03090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03090");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(861840.0f, 6837000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.539768E7f + "'", float2 == 1.539768E7f);
    }

    @Test
    public void test03091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03091");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.568726E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8706152578384185E9d + "'", double1 == 2.8706152578384185E9d);
    }

    @Test
    public void test03092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03092");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-3.41336E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.41336E9f) + "'", float2 == (-3.41336E9f));
    }

    @Test
    public void test03093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03093");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 1.7153152E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.7153152E7f) + "'", float2 == (-1.7153152E7f));
    }

    @Test
    public void test03094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03094");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.820894E8f, 4.757852E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.879883E9f + "'", float2 == 9.879883E9f);
    }

    @Test
    public void test03095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03095");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3954668.0f), 8.176524E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6273955E9f + "'", float2 == 1.6273955E9f);
    }

    @Test
    public void test03096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03096");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8683872.0f, (-3.1450144E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.5532544E7f) + "'", float2 == (-4.5532544E7f));
    }

    @Test
    public void test03097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03097");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 17580.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 175800.0f + "'", float2 == 175800.0f);
    }

    @Test
    public void test03098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03098");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.3026532E12f, 1.6365156E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.6085795E12f + "'", float2 == 6.6085795E12f);
    }

    @Test
    public void test03099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03099");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-85360.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-536332.6978208495d) + "'", double1 == (-536332.6978208495d));
    }

    @Test
    public void test03100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03100");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 3.5475886E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5475885E11f + "'", float2 == 3.5475885E11f);
    }

    @Test
    public void test03101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03101");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2509800.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5769538483959325E7d + "'", double1 == 1.5769538483959325E7d);
    }

    @Test
    public void test03102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03102");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 7.759605E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03103");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 1.2446492E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2446493E10f + "'", float2 == 1.2446493E10f);
    }

    @Test
    public void test03104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03104");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.290318E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0673677713548523E8d + "'", double1 == 2.0673677713548523E8d);
    }

    @Test
    public void test03105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03105");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2184640.0f, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4369278.0f + "'", float2 == 4369278.0f);
    }

    @Test
    public void test03106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03106");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.021722E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.668514860258471E8d + "'", double1 == 5.668514860258471E8d);
    }

    @Test
    public void test03107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03107");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 591488.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-591488.0f) + "'", float2 == (-591488.0f));
    }

    @Test
    public void test03108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03108");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 3166360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3166360.0f) + "'", float2 == (-3166360.0f));
    }

    @Test
    public void test03109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03109");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1.2409407E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.3432925E12f + "'", float2 == 4.3432925E12f);
    }

    @Test
    public void test03110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03110");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 5.350232E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.350232E8f + "'", float2 == 5.350232E8f);
    }

    @Test
    public void test03111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03111");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.2837E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4348910084944092E10d + "'", double1 == 1.4348910084944092E10d);
    }

    @Test
    public void test03112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03112");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.1141182E13f, 44572.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2282363E13f + "'", float2 == 4.2282363E13f);
    }

    @Test
    public void test03113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03113");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 2.1141182E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03114");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (short) 0, (-5.7742726E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1548545E9f) + "'", float2 == (-1.1548545E9f));
    }

    @Test
    public void test03115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03115");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 3180.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3180.0f) + "'", float2 == (-3180.0f));
    }

    @Test
    public void test03116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03116");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.908404E10f, 1.2356279E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0288065E11f + "'", float2 == 2.0288065E11f);
    }

    @Test
    public void test03117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03117");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.9743E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8688079064453893E9d + "'", double1 == 1.8688079064453893E9d);
    }

    @Test
    public void test03118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03118");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.830693E7f), 1.2404436E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3442734E9f + "'", float2 == 2.3442734E9f);
    }

    @Test
    public void test03119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03119");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.170971E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.620698294988991E9d) + "'", double1 == (-2.620698294988991E9d));
    }

    @Test
    public void test03120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03120");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.4799996E10f), 6.4107E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.8317854E10f) + "'", float2 == (-4.8317854E10f));
    }

    @Test
    public void test03121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03121");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7521520.0f, 400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.504384E7f + "'", float2 == 1.504384E7f);
    }

    @Test
    public void test03122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03122");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 1.3628912E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.087034E8f + "'", float2 == 7.087034E8f);
    }

    @Test
    public void test03123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03123");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-877288.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-877288.0f) + "'", float2 == (-877288.0f));
    }

    @Test
    public void test03124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03124");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1258.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7904.2471164319195d + "'", double1 == 7904.2471164319195d);
    }

    @Test
    public void test03125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03125");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.0f), (-1.0E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0000012E7f) + "'", float2 == (-2.0000012E7f));
    }

    @Test
    public void test03126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03126");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(22276.0f, 1.7525528E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.509561E7f + "'", float2 == 3.509561E7f);
    }

    @Test
    public void test03127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03127");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.5705144E7f), (-1036904.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.3484096E7f) + "'", float2 == (-3.3484096E7f));
    }

    @Test
    public void test03128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03128");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 4.9241084E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.924108E12f + "'", float2 == 4.924108E12f);
    }

    @Test
    public void test03129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03129");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.13656E7f, 1.6204143E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.38356E9f + "'", float2 == 3.38356E9f);
    }

    @Test
    public void test03130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03130");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.3787872E8f, 10240.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.757779E8f + "'", float2 == 6.757779E8f);
    }

    @Test
    public void test03131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03131");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 1.1269213E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1269213E9f + "'", float2 == 1.1269213E9f);
    }

    @Test
    public void test03132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03132");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1834656.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.152748362292887E7d + "'", double1 == 1.152748362292887E7d);
    }

    @Test
    public void test03133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03133");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 4.5642404E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.128481E9f + "'", float2 == 9.128481E9f);
    }

    @Test
    public void test03134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03134");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.2409407E11f, 5.1468585E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5848186E11f + "'", float2 == 2.5848186E11f);
    }

    @Test
    public void test03135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03135");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(10400.0f, 2.5506157E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.1012334E10f + "'", float2 == 5.1012334E10f);
    }

    @Test
    public void test03136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03136");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.453498E10f, (-2.4799996E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.946997E10f + "'", float2 == 7.946997E10f);
    }

    @Test
    public void test03137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03137");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-520.0f), (-1091432.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2183904.0f) + "'", float2 == (-2183904.0f));
    }

    @Test
    public void test03138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03138");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.137232E7f, (-3180.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6273827E8f + "'", float2 == 1.6273827E8f);
    }

    @Test
    public void test03139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03139");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6400.0f, 1.8375388E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.6750904E9f + "'", float2 == 3.6750904E9f);
    }

    @Test
    public void test03140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03140");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 2.10444E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03141");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.2389663E9f), 1.7276411E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.773496E8f + "'", float2 == 9.773496E8f);
    }

    @Test
    public void test03142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03142");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 52000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-52000.0f) + "'", float2 == (-52000.0f));
    }

    @Test
    public void test03143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03143");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.8991702E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0782394469339485E9d) + "'", double1 == (-3.0782394469339485E9d));
    }

    @Test
    public void test03144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03144");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 1944968.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3889936.0f + "'", float2 == 3889936.0f);
    }

    @Test
    public void test03145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03145");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(19440.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 122145.12237157115d + "'", double1 == 122145.12237157115d);
    }

    @Test
    public void test03146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03146");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 4.220992E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.441984E7f + "'", float2 == 8.441984E7f);
    }

    @Test
    public void test03147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03147");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 2.6437028E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.6437028E9f) + "'", float2 == (-2.6437028E9f));
    }

    @Test
    public void test03148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03148");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.06416E8f, 1.830378E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.789076E8f + "'", float2 == 7.789076E8f);
    }

    @Test
    public void test03149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03149");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-4.590605E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6067117E9f) + "'", float2 == (-1.6067117E9f));
    }

    @Test
    public void test03150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03150");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.2035735E14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0128645895138998E15d + "'", double1 == 2.0128645895138998E15d);
    }

    @Test
    public void test03151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03151");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.5333408E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.634264385458992E7d + "'", double1 == 9.634264385458992E7d);
    }

    @Test
    public void test03152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03152");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.183922E8f, 5.7613114E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9890468E9f + "'", float2 == 2.9890468E9f);
    }

    @Test
    public void test03153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03153");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.8088E7f, 1.6516372E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.29208744E8f + "'", float2 == 1.29208744E8f);
    }

    @Test
    public void test03154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03154");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 624.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19968.0f + "'", float2 == 19968.0f);
    }

    @Test
    public void test03155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03155");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 7143688.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03156");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 20096.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03157");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 1920.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 192000.0f + "'", float2 == 192000.0f);
    }

    @Test
    public void test03158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03158");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.1826431E10f), 1344512.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.3650173E10f) + "'", float2 == (-2.3650173E10f));
    }

    @Test
    public void test03159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03159");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-3784816.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3784816.0f) + "'", float2 == (-3784816.0f));
    }

    @Test
    public void test03160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03160");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-1.5512214E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.9639085E12f) + "'", float2 == (-4.9639085E12f));
    }

    @Test
    public void test03161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03161");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 8.894673E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.894673E9f + "'", float2 == 8.894673E9f);
    }

    @Test
    public void test03162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03162");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-37728.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-37728.0f) + "'", float2 == (-37728.0f));
    }

    @Test
    public void test03163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03163");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.4819328E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.311258395187505E7d + "'", double1 == 9.311258395187505E7d);
    }

    @Test
    public void test03164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03164");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0458411E10f, (-7.759996E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5499075E13f) + "'", float2 == (-1.5499075E13f));
    }

    @Test
    public void test03165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03165");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 524.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-524.0f) + "'", float2 == (-524.0f));
    }

    @Test
    public void test03166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03166");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.2878275E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.091658951845524E8d) + "'", double1 == (-8.091658951845524E8d));
    }

    @Test
    public void test03167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03167");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 57600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2016000.0f + "'", float2 == 2016000.0f);
    }

    @Test
    public void test03168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03168");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-1.7123752E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.7123752E8f) + "'", float2 == (-1.7123752E8f));
    }

    @Test
    public void test03169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03169");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-591488.0f), (-1.6227702E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.2456587E10f) + "'", float2 == (-3.2456587E10f));
    }

    @Test
    public void test03170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03170");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.032E8f, 2.857984E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4635597E9f + "'", float2 == 1.4635597E9f);
    }

    @Test
    public void test03171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03171");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-97.0f) + "'", float2 == (-97.0f));
    }

    @Test
    public void test03172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03172");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1947304.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2235271881412037E7d) + "'", double1 == (-1.2235271881412037E7d));
    }

    @Test
    public void test03173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03173");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-8.113852E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.113852E10f) + "'", float2 == (-8.113852E10f));
    }

    @Test
    public void test03174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03174");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-357280.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3572800.0f) + "'", float2 == (-3572800.0f));
    }

    @Test
    public void test03175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03175");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 2.5070752E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.5070752E8f) + "'", float2 == (-2.5070752E8f));
    }

    @Test
    public void test03176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03176");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-9074784.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03177");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.996333E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1392885546477437E12d + "'", double1 == 3.1392885546477437E12d);
    }

    @Test
    public void test03178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03178");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.669417E10f), (-1.163876E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.341162E10f) + "'", float2 == (-7.341162E10f));
    }

    @Test
    public void test03179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03179");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 2.9722893E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5455904E13f + "'", float2 == 1.5455904E13f);
    }

    @Test
    public void test03180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03180");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1.635226E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.635226E9f + "'", float2 == 1.635226E9f);
    }

    @Test
    public void test03181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03181");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.373439E7f, (-3.8751965E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.075705E8f) + "'", float2 == (-7.075705E8f));
    }

    @Test
    public void test03182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03182");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4011000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.520185626709732E7d + "'", double1 == 2.520185626709732E7d);
    }

    @Test
    public void test03183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03183");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(83800.0f, 167480.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 502560.0f + "'", float2 == 502560.0f);
    }

    @Test
    public void test03184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03184");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.534768E8f), 6.046168E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.860302E8f) + "'", float2 == (-7.860302E8f));
    }

    @Test
    public void test03185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03185");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 255996.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2559960.0f + "'", float2 == 2559960.0f);
    }

    @Test
    public void test03186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03186");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-3.894608E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.894608E8f + "'", float2 == 3.894608E8f);
    }

    @Test
    public void test03187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03187");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(180384.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1133386.0984502826d + "'", double1 == 1133386.0984502826d);
    }

    @Test
    public void test03188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03188");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1766240.0f, (-168388.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3195704.0f + "'", float2 == 3195704.0f);
    }

    @Test
    public void test03189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03189");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.486144E8f, 640000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.985088E8f + "'", float2 == 2.985088E8f);
    }

    @Test
    public void test03190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03190");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.7613114E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.619938688723884E9d + "'", double1 == 3.619938688723884E9d);
    }

    @Test
    public void test03191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03191");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1136.0f, 4660.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11592.0f + "'", float2 == 11592.0f);
    }

    @Test
    public void test03192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03192");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 4.814856E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5407539E10f + "'", float2 == 1.5407539E10f);
    }

    @Test
    public void test03193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03193");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5519824.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4682077055017255E7d + "'", double1 == 3.4682077055017255E7d);
    }

    @Test
    public void test03194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03194");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 1.5971842E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5971842E10f + "'", float2 == 1.5971842E10f);
    }

    @Test
    public void test03195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03195");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.9154816E9f, (-1.6515496E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5006533E9f + "'", float2 == 3.5006533E9f);
    }

    @Test
    public void test03196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03196");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (-2.1680968E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.1680968E15f) + "'", float2 == (-2.1680968E15f));
    }

    @Test
    public void test03197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03197");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(501724.0f, 1.0426285E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0853574E10f + "'", float2 == 2.0853574E10f);
    }

    @Test
    public void test03198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03198");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(222562.0f, 224808.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 894740.0f + "'", float2 == 894740.0f);
    }

    @Test
    public void test03199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03199");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 92560.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03200");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.5280742E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.58843589202272E10d + "'", double1 == 1.58843589202272E10d);
    }

    @Test
    public void test03201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03201");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-5.7742726E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.628082501129708E9d) + "'", double1 == (-3.628082501129708E9d));
    }

    @Test
    public void test03202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03202");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.888512E7f, 3.0076518E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0210807E10f + "'", float2 == 6.0210807E10f);
    }

    @Test
    public void test03203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03203");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.05859E9f, 1.3735467E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5588112E10f + "'", float2 == 3.5588112E10f);
    }

    @Test
    public void test03204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03204");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.778352E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7456900464573019E9d + "'", double1 == 1.7456900464573019E9d);
    }

    @Test
    public void test03205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03205");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-2.7888886E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.7888884E11f) + "'", float2 == (-2.7888884E11f));
    }

    @Test
    public void test03206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03206");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.1857446E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.450253300114948E8d) + "'", double1 == (-7.450253300114948E8d));
    }

    @Test
    public void test03207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03207");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 57600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-57600.0f) + "'", float2 == (-57600.0f));
    }

    @Test
    public void test03208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03208");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (-1L), 1.5542823E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1085645E11f + "'", float2 == 3.1085645E11f);
    }

    @Test
    public void test03209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03209");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.2813837E8f), 1.9749896E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.1677696E8f) + "'", float2 == (-6.1677696E8f));
    }

    @Test
    public void test03210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03210");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 877288.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1754576.0f + "'", float2 == 1754576.0f);
    }

    @Test
    public void test03211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03211");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 64.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03212");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-80704.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-161408.0f) + "'", float2 == (-161408.0f));
    }

    @Test
    public void test03213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03213");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.8014E9f, 1.1128E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.625056E9f + "'", float2 == 5.625056E9f);
    }

    @Test
    public void test03214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03214");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.984422E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6450790817175156E10d + "'", double1 == 5.6450790817175156E10d);
    }

    @Test
    public void test03215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03215");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-1.98268E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.98268E8f) + "'", float2 == (-1.98268E8f));
    }

    @Test
    public void test03216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03216");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 1.7536342E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7536342E8f + "'", float2 == 1.7536342E8f);
    }

    @Test
    public void test03217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03217");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 2290368.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2290368.0f) + "'", float2 == (-2290368.0f));
    }

    @Test
    public void test03218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03218");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 1.9154816E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9154816E9f + "'", float2 == 1.9154816E9f);
    }

    @Test
    public void test03219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03219");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-4163432.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4572013E8f) + "'", float2 == (-1.4572013E8f));
    }

    @Test
    public void test03220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03220");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-399980.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.079896E7f) + "'", float2 == (-2.079896E7f));
    }

    @Test
    public void test03221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03221");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.144403E7f), 2184640.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1851878E8f) + "'", float2 == (-1.1851878E8f));
    }

    @Test
    public void test03222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03222");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 4953552.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5851366E8f + "'", float2 == 1.5851366E8f);
    }

    @Test
    public void test03223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03223");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.879806E9f), 1267304.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.7570775E9f) + "'", float2 == (-7.7570775E9f));
    }

    @Test
    public void test03224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03224");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5.58082E7f), (-4.21372E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.543604E8f) + "'", float2 == (-9.543604E8f));
    }

    @Test
    public void test03225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03225");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.605657E11f, (-764.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3211314E12f + "'", float2 == 1.3211314E12f);
    }

    @Test
    public void test03226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03226");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.4247504E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.151834139403741E8d) + "'", double1 == (-2.151834139403741E8d));
    }

    @Test
    public void test03227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03227");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-400.0f), 2.778352E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.556696E8f + "'", float2 == 5.556696E8f);
    }

    @Test
    public void test03228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03228");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 7490.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 389480.0f + "'", float2 == 389480.0f);
    }

    @Test
    public void test03229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03229");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.7163056E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.9633422050088805E8d) + "'", double1 == (-2.9633422050088805E8d));
    }

    @Test
    public void test03230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03230");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 4.376008E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.376008E10f) + "'", float2 == (-4.376008E10f));
    }

    @Test
    public void test03231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03231");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1228800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2288E7f + "'", float2 == 1.2288E7f);
    }

    @Test
    public void test03232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03232");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2184640.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3726497949476812E7d + "'", double1 == 1.3726497949476812E7d);
    }

    @Test
    public void test03233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03233");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6770612E7f, 1.5273248E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3900618E8f + "'", float2 == 3.3900618E8f);
    }

    @Test
    public void test03234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03234");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 9.183922E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.183922E9f + "'", float2 == 9.183922E9f);
    }

    @Test
    public void test03235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03235");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-20020.0f), 4.969204E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.938369E9f + "'", float2 == 9.938369E9f);
    }

    @Test
    public void test03236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03236");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-1.5913296E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5913296E8f) + "'", float2 == (-1.5913296E8f));
    }

    @Test
    public void test03237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03237");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 7.804208E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4973466E9f + "'", float2 == 2.4973466E9f);
    }

    @Test
    public void test03238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03238");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2594320.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6300593306122145E7d + "'", double1 == 1.6300593306122145E7d);
    }

    @Test
    public void test03239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03239");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.6634944E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0452043572655522E9d + "'", double1 == 1.0452043572655522E9d);
    }

    @Test
    public void test03240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03240");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 2.7376016E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7376016E7f + "'", float2 == 2.7376016E7f);
    }

    @Test
    public void test03241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03241");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(341576.0f, 1.2E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4683152E7f + "'", float2 == 2.4683152E7f);
    }

    @Test
    public void test03242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03242");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 2.5349838E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.534984E9f + "'", float2 == 2.534984E9f);
    }

    @Test
    public void test03243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03243");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1.7525528E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7525528E9f + "'", float2 == 1.7525528E9f);
    }

    @Test
    public void test03244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03244");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 1944.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 194400.0f + "'", float2 == 194400.0f);
    }

    @Test
    public void test03245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03245");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 1.6513299E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6513299E10f + "'", float2 == 1.6513299E10f);
    }

    @Test
    public void test03246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03246");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 4.2956704E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2956704E8f + "'", float2 == 4.2956704E8f);
    }

    @Test
    public void test03247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03247");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.0E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.2831853071795866E7d) + "'", double1 == (-6.2831853071795866E7d));
    }

    @Test
    public void test03248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03248");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-1.20392E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.20392E7f + "'", float2 == 1.20392E7f);
    }

    @Test
    public void test03249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03249");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.248021E11f), (-1.5502149E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.499142E11f) + "'", float2 == (-6.499142E11f));
    }

    @Test
    public void test03250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03250");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 4.0589768E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03251");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-3954668.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.954668E7f) + "'", float2 == (-3.954668E7f));
    }

    @Test
    public void test03252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03252");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 4256002.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.128322E8f + "'", float2 == 4.128322E8f);
    }

    @Test
    public void test03253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03253");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.22816E7f, (-832.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.4561536E7f + "'", float2 == 6.4561536E7f);
    }

    @Test
    public void test03254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03254");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 640000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.048E7f + "'", float2 == 2.048E7f);
    }

    @Test
    public void test03255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03255");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.7988756E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.64354102696751E10d + "'", double1 == 3.64354102696751E10d);
    }

    @Test
    public void test03256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03256");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 3.902104E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.785041E9f + "'", float2 == 3.785041E9f);
    }

    @Test
    public void test03257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03257");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.635226E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0274427876587082E10d + "'", double1 == 1.0274427876587082E10d);
    }

    @Test
    public void test03258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03258");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-3.2080672E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1228236E9f) + "'", float2 == (-1.1228236E9f));
    }

    @Test
    public void test03259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03259");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0458926E9f, 9.137448E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8484073E11f + "'", float2 == 1.8484073E11f);
    }

    @Test
    public void test03260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03260");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1177600.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7399079.01773468d) + "'", double1 == (-7399079.01773468d));
    }

    @Test
    public void test03261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03261");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(75000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 471238.89803846896d + "'", double1 == 471238.89803846896d);
    }

    @Test
    public void test03262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03262");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 2140.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21400.0f + "'", float2 == 21400.0f);
    }

    @Test
    public void test03263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03263");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.2404892E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.794223615685925E9d + "'", double1 == 7.794223615685925E9d);
    }

    @Test
    public void test03264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03264");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.4841652E10f, 3.5052415E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.507316E11f + "'", float2 == 7.507316E11f);
    }

    @Test
    public void test03265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03265");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3682960.0f), (-1.0341418E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.1419427E8f) + "'", float2 == (-2.1419427E8f));
    }

    @Test
    public void test03266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03266");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(640000.0f, 2559960.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6399920.0f + "'", float2 == 6399920.0f);
    }

    @Test
    public void test03267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03267");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.4044E8f, (-6.3325504E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.54229E8f + "'", float2 == 3.54229E8f);
    }

    @Test
    public void test03268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03268");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 394232.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-394232.0f) + "'", float2 == (-394232.0f));
    }

    @Test
    public void test03269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03269");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.8991702E8f), 1.5611576E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.1424812E9f + "'", float2 == 2.1424812E9f);
    }

    @Test
    public void test03270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03270");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2030560.0f), (-8.57243E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.7550973E8f) + "'", float2 == (-1.7550973E8f));
    }

    @Test
    public void test03271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03271");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.3847042E10f), (-2.4390781E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.257224E10f) + "'", float2 == (-3.257224E10f));
    }

    @Test
    public void test03272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03272");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(902560.0f, 7.507316E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.501465E12f + "'", float2 == 1.501465E12f);
    }

    @Test
    public void test03273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03273");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.2332318E10f, (-7.6935496E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9277536E10f + "'", float2 == 2.9277536E10f);
    }

    @Test
    public void test03274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03274");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.6437028E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6610874488978567E10d) + "'", double1 == (-1.6610874488978567E10d));
    }

    @Test
    public void test03275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03275");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-768.0f), 4.814856E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.6296966E8f + "'", float2 == 9.6296966E8f);
    }

    @Test
    public void test03276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03276");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-315604.0f), 1.0826304E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.10214E7f + "'", float2 == 2.10214E7f);
    }

    @Test
    public void test03277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03277");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-77568.0f), (-1.94E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.8955136E7f) + "'", float2 == (-3.8955136E7f));
    }

    @Test
    public void test03278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03278");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-5.78656E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.78656E9f) + "'", float2 == (-5.78656E9f));
    }

    @Test
    public void test03279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03279");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 20020.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2002000.0f + "'", float2 == 2002000.0f);
    }

    @Test
    public void test03280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03280");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-7.526817E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.526817E11f) + "'", float2 == (-7.526817E11f));
    }

    @Test
    public void test03281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03281");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6205367E9f, (-7.16936E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1097646E10f) + "'", float2 == (-1.1097646E10f));
    }

    @Test
    public void test03282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03282");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 8.1765243E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03283");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(80208.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 503961.7271182602d + "'", double1 == 503961.7271182602d);
    }

    @Test
    public void test03284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03284");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.0256E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.272722015822297E8d + "'", double1 == 1.272722015822297E8d);
    }

    @Test
    public void test03285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03285");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-6.450307E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.450307E10f + "'", float2 == 6.450307E10f);
    }

    @Test
    public void test03286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03286");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.1677696E8f), (-1.2673242E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4870188E9f) + "'", float2 == (-1.4870188E9f));
    }

    @Test
    public void test03287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03287");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.828E8f, 20200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.656404E8f + "'", float2 == 5.656404E8f);
    }

    @Test
    public void test03288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03288");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-194768.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1223763.4359087537d) + "'", double1 == (-1223763.4359087537d));
    }

    @Test
    public void test03289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03289");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.980555E8f, 2176.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5961153E9f + "'", float2 == 1.5961153E9f);
    }

    @Test
    public void test03290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03290");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 9.290086E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.290086E8f + "'", float2 == 9.290086E8f);
    }

    @Test
    public void test03291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03291");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.259798E10f, 224808.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.451964E11f + "'", float2 == 1.451964E11f);
    }

    @Test
    public void test03292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03292");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03293");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-397280.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3972800.0f) + "'", float2 == (-3972800.0f));
    }

    @Test
    public void test03294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03294");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 12800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12800.0f + "'", float2 == 12800.0f);
    }

    @Test
    public void test03295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03295");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03296");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.837712E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7829870344407198E9d + "'", double1 == 1.7829870344407198E9d);
    }

    @Test
    public void test03297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03297");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.9639085E12f), (-3999216.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.927825E12f) + "'", float2 == (-9.927825E12f));
    }

    @Test
    public void test03298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03298");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.010764E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.033311566939282E9d + "'", double1 == 5.033311566939282E9d);
    }

    @Test
    public void test03299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03299");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-168388.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1683880.0f) + "'", float2 == (-1683880.0f));
    }

    @Test
    public void test03300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03300");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(194400.0f, 1117368.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2623536.0f + "'", float2 == 2623536.0f);
    }

    @Test
    public void test03301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03301");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-799960.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5026296.918331382d) + "'", double1 == (-5026296.918331382d));
    }

    @Test
    public void test03302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03302");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 9.947401E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03303");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4380296.0f, 1.3308472E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5377536E7f + "'", float2 == 3.5377536E7f);
    }

    @Test
    public void test03304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03304");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2703520.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5407040.0f + "'", float2 == 5407040.0f);
    }

    @Test
    public void test03305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03305");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 1.01397914E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03306");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.542514E9f, 3.1653536E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3148335E10f + "'", float2 == 1.3148335E10f);
    }

    @Test
    public void test03307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03307");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3195704.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0079200418895032E7d + "'", double1 == 2.0079200418895032E7d);
    }

    @Test
    public void test03308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03308");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-384.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-768.0f) + "'", float2 == (-768.0f));
    }

    @Test
    public void test03309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03309");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 4.3432925E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.3432925E12f) + "'", float2 == (-4.3432925E12f));
    }

    @Test
    public void test03310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03310");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1944968.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2220594360534465E7d + "'", double1 == 1.2220594360534465E7d);
    }

    @Test
    public void test03311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03311");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 522240.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 522240.0f + "'", float2 == 522240.0f);
    }

    @Test
    public void test03312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03312");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.9139866E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8309117539110787E9d + "'", double1 == 1.8309117539110787E9d);
    }

    @Test
    public void test03313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03313");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 1.3319424E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3319424E7f + "'", float2 == 1.3319424E7f);
    }

    @Test
    public void test03314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03314");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(323960.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2035500.7121138987d + "'", double1 == 2035500.7121138987d);
    }

    @Test
    public void test03315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03315");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.95192E9f, 8.697576E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6077792E10f + "'", float2 == 1.6077792E10f);
    }

    @Test
    public void test03316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03316");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.8376379E8f, 9.938369E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0244265E10f + "'", float2 == 2.0244265E10f);
    }

    @Test
    public void test03317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03317");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.2837844E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.434944088843884E10d + "'", double1 == 1.434944088843884E10d);
    }

    @Test
    public void test03318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03318");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.9890468E9f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9780936E9f + "'", float2 == 5.9780936E9f);
    }

    @Test
    public void test03319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03319");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.2659015E10f, (-948304.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2531613E11f + "'", float2 == 1.2531613E11f);
    }

    @Test
    public void test03320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03320");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 1.5851366E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5851366E8f + "'", float2 == 1.5851366E8f);
    }

    @Test
    public void test03321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03321");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2651356.0f, (-3.669417E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.338304E10f) + "'", float2 == (-7.338304E10f));
    }

    @Test
    public void test03322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03322");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 140000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03323");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.496796E9f, 1.5333408E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3024259E10f + "'", float2 == 1.3024259E10f);
    }

    @Test
    public void test03324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03324");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3646240.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2910001594450496E7d + "'", double1 == 2.2910001594450496E7d);
    }

    @Test
    public void test03325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03325");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5324.0f, 1.6516372E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3043392E7f + "'", float2 == 3.3043392E7f);
    }

    @Test
    public void test03326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03326");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.3196342E9f), 5.0699926E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.62527E9f) + "'", float2 == (-5.62527E9f));
    }

    @Test
    public void test03327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03327");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(167480.0f, (-1036904.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1738848.0f) + "'", float2 == (-1738848.0f));
    }

    @Test
    public void test03328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03328");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.9129618E8f, 1.529599E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.885121E8f + "'", float2 == 6.885121E8f);
    }

    @Test
    public void test03329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03329");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.5502149E8f), (-198640.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.1044026E8f) + "'", float2 == (-3.1044026E8f));
    }

    @Test
    public void test03330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03330");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.0853574E10f, (-1.1228236E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.94615E10f + "'", float2 == 3.94615E10f);
    }

    @Test
    public void test03331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03331");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-4.8317854E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03332");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1.2356279E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.23562795E11f + "'", float2 == 1.23562795E11f);
    }

    @Test
    public void test03333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03333");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.93072E8f, 3.96536E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.516865E9f + "'", float2 == 9.516865E9f);
    }

    @Test
    public void test03334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03334");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.179932E8f, 2.8014E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.4387866E9f + "'", float2 == 7.4387866E9f);
    }

    @Test
    public void test03335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03335");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.980555E8f, (-3.41336E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.2306094E9f) + "'", float2 == (-5.2306094E9f));
    }

    @Test
    public void test03336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03336");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.2409407E10f, (-170468.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4818475E10f + "'", float2 == 2.4818475E10f);
    }

    @Test
    public void test03337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03337");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 4.654552E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03338");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.7452624E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7248992376032567E8d + "'", double1 == 1.7248992376032567E8d);
    }

    @Test
    public void test03339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03339");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.894608E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4470543762824073E9d) + "'", double1 == (-2.4470543762824073E9d));
    }

    @Test
    public void test03340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03340");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.097426E11f), 6.6085795E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2597674E13f + "'", float2 == 1.2597674E13f);
    }

    @Test
    public void test03341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03341");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 1000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32000.0f + "'", float2 == 32000.0f);
    }

    @Test
    public void test03342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03342");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-40040.0f), 1.6515496E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2950912E7f + "'", float2 == 3.2950912E7f);
    }

    @Test
    public void test03343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03343");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-5.2306094E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.230609E10f) + "'", float2 == (-5.230609E10f));
    }

    @Test
    public void test03344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03344");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.1421645E9f, 10260.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2843494E9f + "'", float2 == 4.2843494E9f);
    }

    @Test
    public void test03345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03345");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-5.356288E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.356288E8f) + "'", float2 == (-5.356288E8f));
    }

    @Test
    public void test03346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03346");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.2500508E8f), 1428992.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.4715218E8f) + "'", float2 == (-2.4715218E8f));
    }

    @Test
    public void test03347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03347");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-2.1419427E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.1419428E9f) + "'", float2 == (-2.1419428E9f));
    }

    @Test
    public void test03348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03348");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.5512214E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.746611454375826E11d) + "'", double1 == (-9.746611454375826E11d));
    }

    @Test
    public void test03349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03349");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1982680.0f, 532400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5030160.0f + "'", float2 == 5030160.0f);
    }

    @Test
    public void test03350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03350");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.266093E8f, 5.3149016E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7595165E9f + "'", float2 == 1.7595165E9f);
    }

    @Test
    public void test03351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03351");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.8479116E13f, 77568.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.695823E13f + "'", float2 == 3.695823E13f);
    }

    @Test
    public void test03352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03352");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.8798062E12f), 1.9749896E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.759573E12f) + "'", float2 == (-7.759573E12f));
    }

    @Test
    public void test03353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03353");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 852.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03354");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-8025752.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8025752.0f + "'", float2 == 8025752.0f);
    }

    @Test
    public void test03355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03355");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-1.1097646E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.770776E11f) + "'", float2 == (-5.770776E11f));
    }

    @Test
    public void test03356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03356");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 2.4731663E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.6560825E10f + "'", float2 == 8.6560825E10f);
    }

    @Test
    public void test03357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03357");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1976.0f, (-198680.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-393408.0f) + "'", float2 == (-393408.0f));
    }

    @Test
    public void test03358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03358");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.9998E7f), 3.665825E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.251654E9f + "'", float2 == 7.251654E9f);
    }

    @Test
    public void test03359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03359");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5.0699677E8f, 1.5961153E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2062241E9f + "'", float2 == 4.2062241E9f);
    }

    @Test
    public void test03360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03360");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.859429E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.30990622518045E8d + "'", double1 == 4.30990622518045E8d);
    }

    @Test
    public void test03361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03361");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 1.605536E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.605536E7f) + "'", float2 == (-1.605536E7f));
    }

    @Test
    public void test03362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03362");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-9.48304E7f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.896608E8f) + "'", float2 == (-1.896608E8f));
    }

    @Test
    public void test03363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03363");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.5646856E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1247136108173406E8d + "'", double1 == 4.1247136108173406E8d);
    }

    @Test
    public void test03364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03364");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.9489312E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.224549588054388E9d + "'", double1 == 1.224549588054388E9d);
    }

    @Test
    public void test03365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03365");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 6650176.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.650176E7f + "'", float2 == 6.650176E7f);
    }

    @Test
    public void test03366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03366");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(281376.0f, (-2.0572787E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.1139948E9f) + "'", float2 == (-4.1139948E9f));
    }

    @Test
    public void test03367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03367");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.0683996E9f), 1.0260488E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.1162783E9f) + "'", float2 == (-2.1162783E9f));
    }

    @Test
    public void test03368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03368");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-9.543604E8f), 4000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9087127E9f) + "'", float2 == (-1.9087127E9f));
    }

    @Test
    public void test03369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03369");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2189816.0f, 8.828515E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.766141E10f + "'", float2 == 1.766141E10f);
    }

    @Test
    public void test03370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03370");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.3361914E13f), 6116160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.672382E13f) + "'", float2 == (-8.672382E13f));
    }

    @Test
    public void test03371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03371");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 2649744.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03372");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 173960.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03373");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-578656.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-578656.0f) + "'", float2 == (-578656.0f));
    }

    @Test
    public void test03374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03374");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 1.9489312E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9489312E8f) + "'", float2 == (-1.9489312E8f));
    }

    @Test
    public void test03375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03375");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-167480.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03376");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1597168E7f, 852.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.319604E7f + "'", float2 == 2.319604E7f);
    }

    @Test
    public void test03377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03377");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-1.947304E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.947304E8f) + "'", float2 == (-1.947304E8f));
    }

    @Test
    public void test03378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03378");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.51334E10f, 8.6074104E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0438949E10f + "'", float2 == 3.0438949E10f);
    }

    @Test
    public void test03379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03379");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-198680.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1248343.2568304401d) + "'", double1 == (-1248343.2568304401d));
    }

    @Test
    public void test03380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03380");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 1.6653247E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6653246E10f + "'", float2 == 1.6653246E10f);
    }

    @Test
    public void test03381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03381");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(38400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 241274.3157956961d + "'", double1 == 241274.3157956961d);
    }

    @Test
    public void test03382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03382");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.2738432E8f, (-1.5995194E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2277826E8f + "'", float2 == 2.2277826E8f);
    }

    @Test
    public void test03383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03383");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.0466092E7f, 158160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.21248504E8f + "'", float2 == 1.21248504E8f);
    }

    @Test
    public void test03384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03384");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.02135E7f, 3.894608E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.593486E8f + "'", float2 == 9.593486E8f);
    }

    @Test
    public void test03385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03385");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 8.503587E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03386");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1766240.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.76624E8f + "'", float2 == 1.76624E8f);
    }

    @Test
    public void test03387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03387");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 4012876.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03388");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1738848.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03389");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 4045580.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.415953E8f + "'", float2 == 1.415953E8f);
    }

    @Test
    public void test03390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03390");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(32000.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 64000.0f + "'", float2 == 64000.0f);
    }

    @Test
    public void test03391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03391");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-1.6036684E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6036685E8f) + "'", float2 == (-1.6036685E8f));
    }

    @Test
    public void test03392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03392");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-200240.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1258145.0259096404d) + "'", double1 == (-1258145.0259096404d));
    }

    @Test
    public void test03393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03393");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(40110.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 252018.56267097322d + "'", double1 == 252018.56267097322d);
    }

    @Test
    public void test03394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03394");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-300744.0f), 440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-600608.0f) + "'", float2 == (-600608.0f));
    }

    @Test
    public void test03395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03395");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6513299E10f, (-1.6132702E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.223238E13f) + "'", float2 == (-3.223238E13f));
    }

    @Test
    public void test03396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03396");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.5126547E8f, 5.505517E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1018059E12f + "'", float2 == 1.1018059E12f);
    }

    @Test
    public void test03397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03397");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1267304.0f, 117972.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2770552.0f + "'", float2 == 2770552.0f);
    }

    @Test
    public void test03398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03398");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2984.0f, (-4.012876E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.025693E8f) + "'", float2 == (-8.025693E8f));
    }

    @Test
    public void test03399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03399");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 6.496073E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.496073E7f) + "'", float2 == (-6.496073E7f));
    }

    @Test
    public void test03400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03400");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.5322015E9f, 3.6750904E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6414584E10f + "'", float2 == 1.6414584E10f);
    }

    @Test
    public void test03401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03401");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.9604755E10f, 8.285224E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0086656E11f + "'", float2 == 1.0086656E11f);
    }

    @Test
    public void test03402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03402");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 1486144.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1486144.0f) + "'", float2 == (-1486144.0f));
    }

    @Test
    public void test03403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03403");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-296.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-296.0f) + "'", float2 == (-296.0f));
    }

    @Test
    public void test03404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03404");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-1.6191963E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.41982E10f) + "'", float2 == (-8.41982E10f));
    }

    @Test
    public void test03405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03405");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4692656.0f), (-1.6656356E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.3406564E9f) + "'", float2 == (-3.3406564E9f));
    }

    @Test
    public void test03406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03406");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 60.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5820.0f + "'", float2 == 5820.0f);
    }

    @Test
    public void test03407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03407");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 3.904467E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.808934E7f + "'", float2 == 7.808934E7f);
    }

    @Test
    public void test03408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03408");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3228160.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0283127481224854E7d + "'", double1 == 2.0283127481224854E7d);
    }

    @Test
    public void test03409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03409");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 5299488.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5299488.0f) + "'", float2 == (-5299488.0f));
    }

    @Test
    public void test03410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03410");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 168640.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8769280.0f + "'", float2 == 8769280.0f);
    }

    @Test
    public void test03411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03411");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7700.0f, 2.4044E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.81034E7f + "'", float2 == 4.81034E7f);
    }

    @Test
    public void test03412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03412");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-83800.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 83800.0f + "'", float2 == 83800.0f);
    }

    @Test
    public void test03413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03413");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.75949E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.618794170228503E12d + "'", double1 == 3.618794170228503E12d);
    }

    @Test
    public void test03414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03414");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-62656.0f), (-2.9272768E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.867085E7f) + "'", float2 == (-5.867085E7f));
    }

    @Test
    public void test03415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03415");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.0762982E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5612137209250008E10d + "'", double1 == 2.5612137209250008E10d);
    }

    @Test
    public void test03416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03416");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.021722E9f, 6.223683E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.928818E10f + "'", float2 == 1.928818E10f);
    }

    @Test
    public void test03417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03417");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 2181256.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2181256.0f) + "'", float2 == (-2181256.0f));
    }

    @Test
    public void test03418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03418");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.238967E9f), (-3363840.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.4846618E9f) + "'", float2 == (-2.4846618E9f));
    }

    @Test
    public void test03419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03419");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.551913E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.750956708293581E8d) + "'", double1 == (-9.750956708293581E8d));
    }

    @Test
    public void test03420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03420");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-40040.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1281280.0f) + "'", float2 == (-1281280.0f));
    }

    @Test
    public void test03421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03421");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(633112.0f, 1002200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3270624.0f + "'", float2 == 3270624.0f);
    }

    @Test
    public void test03422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03422");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-8.422425E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03423");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 2.778352E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.6950015E10f + "'", float2 == 2.6950015E10f);
    }

    @Test
    public void test03424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03424");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.1044026E8f), (-1200.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.2088294E8f) + "'", float2 == (-6.2088294E8f));
    }

    @Test
    public void test03425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03425");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-3.095621E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.095621E8f + "'", float2 == 3.095621E8f);
    }

    @Test
    public void test03426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03426");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.321324E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03427");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 605600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03428");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1.2404892E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2404892E10f + "'", float2 == 1.2404892E10f);
    }

    @Test
    public void test03429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03429");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.010764E8f, 4.4758533E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0553859E10f + "'", float2 == 1.0553859E10f);
    }

    @Test
    public void test03430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03430");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1.6513299E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.65133E11f + "'", float2 == 1.65133E11f);
    }

    @Test
    public void test03431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03431");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0458411E10f, 4256772.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0925336E10f + "'", float2 == 2.0925336E10f);
    }

    @Test
    public void test03432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03432");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1198144.0f, 394232.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3184752.0f + "'", float2 == 3184752.0f);
    }

    @Test
    public void test03433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03433");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.879806E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4377541039110657E11d + "'", double1 == 2.4377541039110657E11d);
    }

    @Test
    public void test03434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03434");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 954616.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03435");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.5377536E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2228361439941686E8d + "'", double1 == 2.2228361439941686E8d);
    }

    @Test
    public void test03436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03436");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.7888884E11f), 4357600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.5776897E11f) + "'", float2 == (-5.5776897E11f));
    }

    @Test
    public void test03437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03437");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.5995194E7f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.1990388E7f) + "'", float2 == (-3.1990388E7f));
    }

    @Test
    public void test03438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03438");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.9400194E10f, 8.180352E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0436457E10f + "'", float2 == 4.0436457E10f);
    }

    @Test
    public void test03439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03439");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.2597674E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.915351925735766E13d + "'", double1 == 7.915351925735766E13d);
    }

    @Test
    public void test03440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03440");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.1097646E10f), 6.859429E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0823407E10f) + "'", float2 == (-2.0823407E10f));
    }

    @Test
    public void test03441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03441");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6077792E10f, 1.5407539E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.2970663E10f + "'", float2 == 6.2970663E10f);
    }

    @Test
    public void test03442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03442");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.5322015E9f, (-5.867085E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.947061E9f + "'", float2 == 8.947061E9f);
    }

    @Test
    public void test03443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03443");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-4.9639085E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.9639085E12f + "'", float2 == 4.9639085E12f);
    }

    @Test
    public void test03444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03444");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6342422E8f, 96896.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2704224E8f + "'", float2 == 3.2704224E8f);
    }

    @Test
    public void test03445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03445");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-499928.0f), 377280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-245296.0f) + "'", float2 == (-245296.0f));
    }

    @Test
    public void test03446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03446");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 80208.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03447");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2184640.0f, (-332536.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3704208.0f + "'", float2 == 3704208.0f);
    }

    @Test
    public void test03448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03448");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-499928.0f), (-2.0000012E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.099988E7f) + "'", float2 == (-4.099988E7f));
    }

    @Test
    public void test03449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03449");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.4715218E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5529029208806632E9d) + "'", double1 == (-1.5529029208806632E9d));
    }

    @Test
    public void test03450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03450");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-400.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2513.2741228718346d) + "'", double1 == (-2513.2741228718346d));
    }

    @Test
    public void test03451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03451");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.9562976E8f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.912595E8f) + "'", float2 == (-7.912595E8f));
    }

    @Test
    public void test03452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03452");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-39300.0f), 6.6052994E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3210597E12f + "'", float2 == 1.3210597E12f);
    }

    @Test
    public void test03453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03453");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1152.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7238.229473870883d + "'", double1 == 7238.229473870883d);
    }

    @Test
    public void test03454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03454");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-3.3953797E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03455");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 6.2659015E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0050885E12f + "'", float2 == 2.0050885E12f);
    }

    @Test
    public void test03456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03456");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(645632.0f, 1.1418496E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2838284E10f + "'", float2 == 2.2838284E10f);
    }

    @Test
    public void test03457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03457");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.4045066E8f), (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.8090112E8f) + "'", float2 == (-2.8090112E8f));
    }

    @Test
    public void test03458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03458");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.503883E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.086510312057783E11d + "'", double1 == 4.086510312057783E11d);
    }

    @Test
    public void test03459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03459");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.569705E7f, 4350528.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0009515E8f + "'", float2 == 1.0009515E8f);
    }

    @Test
    public void test03460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03460");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 2.1285071E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03461");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-203056.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1275838.475734658d) + "'", double1 == (-1275838.475734658d));
    }

    @Test
    public void test03462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03462");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-2562728.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2562728.0f + "'", float2 == 2562728.0f);
    }

    @Test
    public void test03463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03463");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5.0699926E8f, 1267304.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0165331E9f + "'", float2 == 1.0165331E9f);
    }

    @Test
    public void test03464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03464");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.963798E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.118846147514203E11d + "'", double1 == 3.118846147514203E11d);
    }

    @Test
    public void test03465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03465");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.96536E9f, 6.2659015E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.33248745E11f + "'", float2 == 1.33248745E11f);
    }

    @Test
    public void test03466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03466");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 8952160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8952160.0f + "'", float2 == 8952160.0f);
    }

    @Test
    public void test03467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03467");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.630565E8f, (-161408.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9257902E9f + "'", float2 == 1.9257902E9f);
    }

    @Test
    public void test03468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03468");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.4572013E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.155865672099286E8d) + "'", double1 == (-9.155865672099286E8d));
    }

    @Test
    public void test03469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03469");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 92560.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 185120.0f + "'", float2 == 185120.0f);
    }

    @Test
    public void test03470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03470");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-2.5336707E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.5336707E11f) + "'", float2 == (-2.5336707E11f));
    }

    @Test
    public void test03471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03471");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 1.3735467E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7470934E10f + "'", float2 == 2.7470934E10f);
    }

    @Test
    public void test03472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03472");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.7550973E8f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.5101946E8f) + "'", float2 == (-3.5101946E8f));
    }

    @Test
    public void test03473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03473");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-3.095621E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03474");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3327120.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0904911499223344E7d) + "'", double1 == (-2.0904911499223344E7d));
    }

    @Test
    public void test03475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03475");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.755986E7f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3511971E8f + "'", float2 == 1.3511971E8f);
    }

    @Test
    public void test03476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03476");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(788736.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4955774.446443598d + "'", double1 == 4955774.446443598d);
    }

    @Test
    public void test03477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03477");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.285224E8f, (-5.251194E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0336684E11f) + "'", float2 == (-1.0336684E11f));
    }

    @Test
    public void test03478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03478");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.764974E12f), 2.1498378E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3486951E13f) + "'", float2 == (-1.3486951E13f));
    }

    @Test
    public void test03479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03479");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 40000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4000000.0f + "'", float2 == 4000000.0f);
    }

    @Test
    public void test03480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03480");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 8543120.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7337984E8f + "'", float2 == 2.7337984E8f);
    }

    @Test
    public void test03481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03481");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.083215E8f), (-1.6036684E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6487163E9f) + "'", float2 == (-1.6487163E9f));
    }

    @Test
    public void test03482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03482");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1000.0f, 5200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12400.0f + "'", float2 == 12400.0f);
    }

    @Test
    public void test03483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03483");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.2255992E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0267037500290227E8d) + "'", double1 == (-2.0267037500290227E8d));
    }

    @Test
    public void test03484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03484");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1267304.0f, 4660.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2543928.0f + "'", float2 == 2543928.0f);
    }

    @Test
    public void test03485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03485");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.7789397E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1177407780371913E11d + "'", double1 == 1.1177407780371913E11d);
    }

    @Test
    public void test03486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03486");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1885680.0f, 175800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4122960.0f + "'", float2 == 4122960.0f);
    }

    @Test
    public void test03487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03487");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 2.0853574E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0853573E11f + "'", float2 == 2.0853573E11f);
    }

    @Test
    public void test03488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03488");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8361600.0f, 4.220992E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0114304E8f + "'", float2 == 1.0114304E8f);
    }

    @Test
    public void test03489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03489");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(75000.0f, (-1594520.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3039040.0f) + "'", float2 == (-3039040.0f));
    }

    @Test
    public void test03490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03490");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1.7510068E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7510067E8f + "'", float2 == 1.7510067E8f);
    }

    @Test
    public void test03491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03491");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-203056.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-406112.0f) + "'", float2 == (-406112.0f));
    }

    @Test
    public void test03492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03492");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4053310.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.546769783744409E7d + "'", double1 == 2.546769783744409E7d);
    }

    @Test
    public void test03493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03493");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2049600.0f, 1.6365156E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2771302E9f + "'", float2 == 3.2771302E9f);
    }

    @Test
    public void test03494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03494");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-5.251194E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.2994225367967267E11d) + "'", double1 == (-3.2994225367967267E11d));
    }

    @Test
    public void test03495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03495");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.655774E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0403534567217077E10d) + "'", double1 == (-1.0403534567217077E10d));
    }

    @Test
    public void test03496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03496");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(82340.0f, (-1.3012608E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.5860536E7f) + "'", float2 == (-2.5860536E7f));
    }

    @Test
    public void test03497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03497");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(291616.0f, 8034800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6652832E7f + "'", float2 == 1.6652832E7f);
    }

    @Test
    public void test03498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03498");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 4851360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03499");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 3.098972E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.098972E12f + "'", float2 == 3.098972E12f);
    }

    @Test
    public void test03500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03500");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.3529948E13f), (-6.790563E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.7060033E13f) + "'", float2 == (-2.7060033E13f));
    }
}

