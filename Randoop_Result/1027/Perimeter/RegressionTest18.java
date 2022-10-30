package Perimeter;

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
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 1.6634944E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6634943E10f + "'", float2 == 1.6634943E10f);
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09002");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-3.1758352E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1758352E7f + "'", float2 == 3.1758352E7f);
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09003");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 3.373439E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3734392E9f + "'", float2 == 3.3734392E9f);
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09004");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1.501465E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.501465E12f) + "'", float2 == (-1.501465E12f));
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09005");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.008812E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.262173804328604E9d + "'", double1 == 1.262173804328604E9d);
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09006");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1738848.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.092550420501861E7d) + "'", double1 == (-1.092550420501861E7d));
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09007");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 8.028312E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8099092E9f + "'", float2 == 2.8099092E9f);
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09008");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.9666254E12f, 8.72328E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5933425E13f + "'", float2 == 1.5933425E13f);
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09009");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.605303E12f, 3568280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3210614E13f + "'", float2 == 1.3210614E13f);
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09010");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.6851768E11f, 3.2035735E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.4165174E14f + "'", float2 == 6.4165174E14f);
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09011");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 6.553097E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.553097E7f) + "'", float2 == (-6.553097E7f));
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09012");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.172278E11f), 2.3788823E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4296979E12f) + "'", float2 == (-1.4296979E12f));
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09013");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-242824.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-242824.0f) + "'", float2 == (-242824.0f));
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09014");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.0699792E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.185561881714611E9d + "'", double1 == 3.185561881714611E9d);
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09015");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.789076E8f, (-3.3443744E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4909276E9f + "'", float2 == 1.4909276E9f);
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09016");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(332800.0f, 5.4934374E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0993531E9f + "'", float2 == 1.0993531E9f);
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09017");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.5631844E11f, (-1.6094806E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9074076E11f + "'", float2 == 1.9074076E11f);
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09018");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.534768E8f), 5.9661317E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.102531E10f + "'", float2 == 1.102531E10f);
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09019");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.2482198E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0409167173177226E9d + "'", double1 == 2.0409167173177226E9d);
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09020");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.6085795E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.152292937143797E13d + "'", double1 == 4.152292937143797E13d);
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09021");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.1997202E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.53806434744089E11d) + "'", double1 == (-7.53806434744089E11d));
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09022");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.60656E8f, (-139264.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.2103347E8f + "'", float2 == 5.2103347E8f);
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09023");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.94E7f, (-1.5292275E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.054575E10f) + "'", float2 == (-3.054575E10f));
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09024");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-7.751075E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.751075E8f) + "'", float2 == (-7.751075E8f));
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09025");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.8E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.759291886010284E8d + "'", double1 == 1.759291886010284E8d);
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09026");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-1.06E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.06E10f) + "'", float2 == (-1.06E10f));
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09027");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.2818445E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6903622646063104E11d) + "'", double1 == (-2.6903622646063104E11d));
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09028");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-9.79836E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.79836E10f) + "'", float2 == (-9.79836E10f));
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09029");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-4.7095827E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5070665E10f) + "'", float2 == (-1.5070665E10f));
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09030");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 4.180777E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09031");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.4003225E12f, 1.3217159E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9234964E13f + "'", float2 == 2.9234964E13f);
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09032");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-1.3982669E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3982669E8f) + "'", float2 == (-1.3982669E8f));
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09033");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.8282912E9f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.6565824E9f + "'", float2 == 3.6565824E9f);
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09034");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-6.4385833E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.045481196447911E10d) + "'", double1 == (-4.045481196447911E10d));
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09035");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.5174584E7f, 2651356.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.565188E7f + "'", float2 == 3.565188E7f);
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09036");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 8.114621E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5966787E10f + "'", float2 == 2.5966787E10f);
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09037");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.4747607E9f, 80000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.949681E9f + "'", float2 == 4.949681E9f);
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09038");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-2.4491647E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.8983294E10f) + "'", float2 == (-4.8983294E10f));
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09039");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1075188.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1075188.0f) + "'", float2 == (-1075188.0f));
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09040");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(672000.0f, 6.416296E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2832605E12f + "'", float2 == 1.2832605E12f);
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09041");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 3166360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3166360.0f) + "'", float2 == (-3166360.0f));
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09042");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.4906793E9f), 2085076.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.9771884E9f) + "'", float2 == (-4.9771884E9f));
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09043");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9787712.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9575424E7f + "'", float2 == 1.9575424E7f);
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09044");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 5.656404E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09045");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.76624E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1097613216952872E9d + "'", double1 == 1.1097613216952872E9d);
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09046");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.8985292E9f, 1.8479116E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.6962027E13f + "'", float2 == 3.6962027E13f);
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09047");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 5.1162944E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0232589E8f + "'", float2 == 1.0232589E8f);
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09048");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.951664E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8545851876530927E8d + "'", double1 == 1.8545851876530927E8d);
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09049");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-3.468954E14f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.468954E14f) + "'", float2 == (-3.468954E14f));
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09050");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-2.8777208E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.8777208E7f) + "'", float2 == (-2.8777208E7f));
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09051");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 7.219102E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.219102E11f + "'", float2 == 7.219102E11f);
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09052");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.9903314E11f, (-5.0403727E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.8798554E11f + "'", float2 == 3.8798554E11f);
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09053");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.5927172E10f), (-7.800361E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5613907E14f) + "'", float2 == (-1.5613907E14f));
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09054");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-7.7522035E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.7522033E9f) + "'", float2 == (-7.7522033E9f));
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09055");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.171351E10f, 364000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.3427748E10f + "'", float2 == 6.3427748E10f);
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09056");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.8777208E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8081253048725083E8d) + "'", double1 == (-1.8081253048725083E8d));
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09057");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.1653534E11f, (-8618400.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.3305345E11f + "'", float2 == 6.3305345E11f);
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09058");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2183904.0f), 3.5052416E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.5737024E7f + "'", float2 == 6.5737024E7f);
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09059");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.250532E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.812280818559801E12d + "'", double1 == 5.812280818559801E12d);
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09060");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.3361936E15f), (-1.1548545E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.6723894E15f) + "'", float2 == (-8.6723894E15f));
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09061");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.3222558E8f, 6.4281984E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3120848E10f + "'", float2 == 1.3120848E10f);
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09062");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.1037133E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9501205678594162E11d) + "'", double1 == (-1.9501205678594162E11d));
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09063");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 1.847548E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.847548E10f + "'", float2 == 1.847548E10f);
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09064");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 1.3471813E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0053427E9f + "'", float2 == 7.0053427E9f);
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09065");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.6161184E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2720741999901754E8d) + "'", double1 == (-2.2720741999901754E8d));
    }

    @Test
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09066");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 3.042624E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09067");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.41633E9f, 4.939247E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.885327E12f + "'", float2 == 9.885327E12f);
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09068");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.592272E9f, (-1.79986E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5848238E9f + "'", float2 == 1.5848238E9f);
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09069");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-1.5070665E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5070665E10f + "'", float2 == 1.5070665E10f);
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09070");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5.2045824E8f, 2.2580213E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5264516E11f + "'", float2 == 4.5264516E11f);
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09071");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.42704E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.294865391101466E8d + "'", double1 == 5.294865391101466E8d);
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09072");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-2.9272768E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.9272768E7f) + "'", float2 == (-2.9272768E7f));
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09073");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 1.820894E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.820894E10f + "'", float2 == 1.820894E10f);
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09074");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-6.450307E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.450307E12f + "'", float2 == 6.450307E12f);
    }

    @Test
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09075");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.84375E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9283737266464E8d + "'", double1 == 4.9283737266464E8d);
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09076");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-2.5336707E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.107746E11f) + "'", float2 == (-8.107746E11f));
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09077");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.889936E8f, 1.5961153E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.970218E9f + "'", float2 == 3.970218E9f);
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09078");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 3.509561E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.509561E8f + "'", float2 == 3.509561E8f);
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09079");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2649744.0f, 2.197391E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.395312E10f + "'", float2 == 4.395312E10f);
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09080");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 80002.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-80002.0f) + "'", float2 == (-80002.0f));
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09081");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 5.2335747E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09082");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 1.7781952E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.6902246E8f + "'", float2 == 5.6902246E8f);
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09083");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-4.21372E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.0873083E10f) + "'", float2 == (-4.0873083E10f));
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09084");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.6165875E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0157318953433886E10d) + "'", double1 == (-1.0157318953433886E10d));
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09085");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.183922E7f, 7.010483E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.238881E8f + "'", float2 == 3.238881E8f);
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09086");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.231553E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6587631786948147E10d) + "'", double1 == (-2.6587631786948147E10d));
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09087");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (-200640.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0064E7f) + "'", float2 == (-2.0064E7f));
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09088");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.3044886E11f, 1.5294422E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.612036E11f + "'", float2 == 6.612036E11f);
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09089");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 8.285224E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.308316E10f + "'", float2 == 4.308316E10f);
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09090");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.2080993E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0157082175623398E12d + "'", double1 == 2.0157082175623398E12d);
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09091");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 9.879883E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09092");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 5.925862E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0814485E12f + "'", float2 == 3.0814485E12f);
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09093");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 2.9234964E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9234965E15f + "'", float2 == 2.9234965E15f);
    }

    @Test
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09094");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.290318E7f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.580636E7f + "'", float2 == 6.580636E7f);
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09095");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 4.87904E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09096");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.7145117E8f), 3.7728E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.6744634E8f) + "'", float2 == (-4.6744634E8f));
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09097");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.054575E10f), 3.9654413E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.029841E10f) + "'", float2 == (-6.029841E10f));
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09098");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 8.503587E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.2484794E12f + "'", float2 == 8.2484794E12f);
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09099");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 12800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 448000.0f + "'", float2 == 448000.0f);
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09100");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.315262E10f), 1.4798586E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.873412E12f + "'", float2 == 2.873412E12f);
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09101");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1270912.0f), 2.084784E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.1441498E8f + "'", float2 == 4.1441498E8f);
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09102");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1.3324875E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3324875E13f) + "'", float2 == (-1.3324875E13f));
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09103");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.2277827E10f, 2.4262492E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.940815E10f + "'", float2 == 4.940815E10f);
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09104");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.03642906E9f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0728581E9f) + "'", float2 == (-2.0728581E9f));
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09105");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1.8125248E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09106");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.860938E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.310854660039384E12d + "'", double1 == 4.310854660039384E12d);
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09107");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.7122007E9f, 1.928818E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.4000763E10f + "'", float2 == 5.4000763E10f);
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09108");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.8372393E9f), 1.4779993E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.879254E11f + "'", float2 == 2.879254E11f);
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09109");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(320000.0f, 42664.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 725328.0f + "'", float2 == 725328.0f);
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09110");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5.7459553E9f), 3.738953E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.328715E10f + "'", float2 == 6.328715E10f);
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09111");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 840.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-840.0f) + "'", float2 == (-840.0f));
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09112");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.766141E10f, (-3.248021E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.142814E11f) + "'", float2 == (-6.142814E11f));
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09113");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.65418E14f), 4.969204E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.3082607E14f) + "'", float2 == (-7.3082607E14f));
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09114");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-1.0426285E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0426285E11f) + "'", float2 == (-1.0426285E11f));
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09115");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.0943795E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3159374627721834E10d + "'", double1 == 1.3159374627721834E10d);
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09116");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.720616E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3377319382733425E10d + "'", double1 == 2.3377319382733425E10d);
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09117");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1.013996E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.013996E11f + "'", float2 == 1.013996E11f);
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09118");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2072800.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3023786504721846E7d + "'", double1 == 1.3023786504721846E7d);
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09119");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.253511E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.415922665184727E10d + "'", double1 == 1.415922665184727E10d);
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09120");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.9235825E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9785336918030624E10d + "'", double1 == 4.9785336918030624E10d);
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09121");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(640080.0f, 6.797832E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3608465E9f + "'", float2 == 1.3608465E9f);
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09122");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.468958E15f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1796106639857836E16d) + "'", double1 == (-2.1796106639857836E16d));
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09123");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.720616E9f), 6.5737024E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.309758E9f) + "'", float2 == (-7.309758E9f));
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09124");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.324306E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.7170416707090054E11d) + "'", double1 == (-2.7170416707090054E11d));
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09125");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-40.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09126");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.4994759E10f), 3.5739846E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.147919E15f + "'", float2 == 7.147919E15f);
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09127");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.3766936E9f, 1008520.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7554043E9f + "'", float2 == 2.7554043E9f);
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09128");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.653116E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5519576074592395E11d + "'", double1 == 3.5519576074592395E11d);
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09129");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 2.8818342E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7953793E10f + "'", float2 == 2.7953793E10f);
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09130");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.311071E9f, 1.8376379E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.498967E10f + "'", float2 == 1.498967E10f);
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09131");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3927204.0f, 3.1431063E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.294067E9f + "'", float2 == 6.294067E9f);
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09132");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 2.1239744E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.1239744E7f + "'", float2 == 2.1239744E7f);
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09133");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(398680.0f, 7.116071E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4232222E11f + "'", float2 == 1.4232222E11f);
    }

    @Test
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09134");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 3.029956E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.029956E9f) + "'", float2 == (-3.029956E9f));
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09135");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.028312E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.044337240197742E10d + "'", double1 == 5.044337240197742E10d);
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09136");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.4238147E9f, 4808800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2857247E10f + "'", float2 == 1.2857247E10f);
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09137");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.8941991E15f), 1.3313819E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.7617705E15f) + "'", float2 == (-3.7617705E15f));
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09138");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.4520657E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.123597805954314E10d + "'", double1 == 9.123597805954314E10d);
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09139");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-4.321136E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09140");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.1431064E10f, (-2.4772973E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3316182E10f + "'", float2 == 1.3316182E10f);
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09141");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8019600.0f, 4.558698E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.119E10f + "'", float2 == 9.119E10f);
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09142");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.753088E7f, (-2.696811E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.3936187E13f) + "'", float2 == (-5.3936187E13f));
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09143");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-335856.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09144");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0458411E11f, (-8180352.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0915185E11f + "'", float2 == 2.0915185E11f);
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09145");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.5336707E11f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.0673415E11f) + "'", float2 == (-5.0673415E11f));
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09146");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.087628E10f), 5.7573824E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.0601086E10f) + "'", float2 == (-6.0601086E10f));
    }

    @Test
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09147");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 7.469264E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.469264E8f + "'", float2 == 7.469264E8f);
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09148");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.399212E12f), 1.98268E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.7587703E12f) + "'", float2 == (-4.7587703E12f));
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09149");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.509561E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2051221858523083E9d + "'", double1 == 2.2051221858523083E9d);
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09150");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.766014E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3662564559276807E12d + "'", double1 == 2.3662564559276807E12d);
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09151");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.685609E11f, (-4256002.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.371133E11f + "'", float2 == 9.371133E11f);
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09152");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.590384E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.99267738800748E12d + "'", double1 == 9.99267738800748E12d);
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09153");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 6.3305345E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.3305345E11f) + "'", float2 == (-6.3305345E11f));
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09154");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.899907E7f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5799814E8f + "'", float2 == 1.5799814E8f);
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09155");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 8.1444623E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09156");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 609.4689747964198d + "'", double1 == 609.4689747964198d);
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09157");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.655706E10f), (-1.1177504E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.313648E10f) + "'", float2 == (-9.313648E10f));
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09158");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.4014583E11f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.8029166E11f + "'", float2 == 6.8029166E11f);
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09159");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(867368.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5449833.873517743d + "'", double1 == 5449833.873517743d);
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09160");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1.0317879E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0317879E14f + "'", float2 == 1.0317879E14f);
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09161");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0648E7f, (-4.8991702E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.5853805E8f) + "'", float2 == (-9.5853805E8f));
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09162");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.2793257E9f, 6.4337994E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3523464E11f + "'", float2 == 1.3523464E11f);
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09163");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.3026516E12f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.605303E12f + "'", float2 == 6.605303E12f);
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09164");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6422226E10f, 4.946388E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.273723E10f + "'", float2 == 4.273723E10f);
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09165");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 6.4960424E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.4960424E13f + "'", float2 == 6.4960424E13f);
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09166");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 3.2629696E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.2629696E9f) + "'", float2 == (-3.2629696E9f));
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09167");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.44088E8f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.688176E9f) + "'", float2 == (-1.688176E9f));
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09168");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2534608.0f, (-3.0581094E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.1157118E10f) + "'", float2 == (-6.1157118E10f));
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09169");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.05859E9f, 1297160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.119774E9f + "'", float2 == 8.119774E9f);
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09170");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.7868373E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1227029602147439E14d + "'", double1 == 1.1227029602147439E14d);
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09171");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.8926916E11f), (-2.2866416E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.789956E11f) + "'", float2 == (-7.789956E11f));
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09172");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 1.6015235E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09173");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.4051537E10f, 3.3787872E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8778832E10f + "'", float2 == 2.8778832E10f);
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09174");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-2.3955932E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.3845764E13f) + "'", float2 == (-8.3845764E13f));
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09175");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.6293146E8f, 590720.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9270444E9f + "'", float2 == 1.9270444E9f);
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09176");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 1.35742824E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3574283E13f + "'", float2 == 1.3574283E13f);
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09177");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.977739E10f), 7.010562E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2625576E12f + "'", float2 == 1.2625576E12f);
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09178");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 5.4018714E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0803743E13f + "'", float2 == 1.0803743E13f);
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09179");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.3037962E12f, 7.372889E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.622338E12f + "'", float2 == 4.622338E12f);
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09180");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 9.454826E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0255445E11f + "'", float2 == 3.0255445E11f);
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09181");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.2954866E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0706152774012183E11d + "'", double1 == 2.0706152774012183E11d);
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09182");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-200640.0f), 1.3759536E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.751867E10f + "'", float2 == 2.751867E10f);
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09183");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.1149583E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.585504575641136E11d + "'", double1 == 2.585504575641136E11d);
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09184");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.5737024E7f, 8.686589E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7373179E15f + "'", float2 == 1.7373179E15f);
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09185");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.252644E10f, 123060.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6505312E11f + "'", float2 == 1.6505312E11f);
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09186");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.5613907E14f), 167736.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.1227815E14f) + "'", float2 == (-3.1227815E14f));
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09187");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-349280.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2194590.964091686d) + "'", double1 == (-2194590.964091686d));
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09188");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.7101952E7f, 2.00002E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.542079E8f + "'", float2 == 4.542079E8f);
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09189");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.859892E9f, 1.095414E20f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.190828E20f + "'", float2 == 2.190828E20f);
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09190");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.3211314E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.300913501623288E13d + "'", double1 == 8.300913501623288E13d);
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09191");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.6666317E9f, 1.536672E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3640598E10f + "'", float2 == 1.3640598E10f);
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09192");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 8.490789E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.236065E11f + "'", float2 == 8.236065E11f);
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09193");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.8E7f, (-1920.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.599616E7f + "'", float2 == 5.599616E7f);
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09194");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.0351447E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.278719107568099E14d + "'", double1 == 1.278719107568099E14d);
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09195");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-1.4150974E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.3585065E9f) + "'", float2 == (-7.3585065E9f));
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09196");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.21204E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6465027439128845E10d + "'", double1 == 2.6465027439128845E10d);
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09197");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.4316914E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1561952900819153E12d + "'", double1 == 2.1561952900819153E12d);
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09198");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 3.2704224E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2704223E10f + "'", float2 == 3.2704223E10f);
    }

    @Test
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09199");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 3.4828058E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.4828058E9f) + "'", float2 == (-3.4828058E9f));
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09200");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 1.3784E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3784E7f + "'", float2 == 1.3784E7f);
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09201");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.9154019E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2034824798963709E10d + "'", double1 == 1.2034824798963709E10d);
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09202");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1.635226E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.635226E8f + "'", float2 == 1.635226E8f);
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09203");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5808312.0f, (-1933920.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7748784.0f + "'", float2 == 7748784.0f);
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09204");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1775408E7f, (-1.68028E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.1250518E8f) + "'", float2 == (-3.1250518E8f));
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09205");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-6.33255E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.978858602175877E10d) + "'", double1 == (-3.978858602175877E10d));
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09206");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.174171E11f, (-3.0003507E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.288335E11f + "'", float2 == 2.288335E11f);
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09207");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.3038013E14f, 5.6684513E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.607716E14f + "'", float2 == 4.607716E14f);
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09208");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.6205367E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09209");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 3829056.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.829056E7f + "'", float2 == 3.829056E7f);
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09210");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.7565191E11f, 9.478182E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.514934E11f + "'", float2 == 3.514934E11f);
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09211");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.202152E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.896926830867519E9d + "'", double1 == 3.896926830867519E9d);
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09212");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.0712576E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.7309100125244665E9d) + "'", double1 == (-6.7309100125244665E9d));
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09213");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.2841203E9f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5682406E9f + "'", float2 == 2.5682406E9f);
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09214");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.2073368E7f), (-1134736.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.641621E7f) + "'", float2 == (-6.641621E7f));
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09215");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.9599824E10f), (-6.4385833E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1207682E11f) + "'", float2 == (-1.1207682E11f));
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09216");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 1.5174584E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5174584E7f) + "'", float2 == (-1.5174584E7f));
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09217");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 1.9753587E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09218");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.1433238E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09219");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-3.680452E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.6804518E14f) + "'", float2 == (-3.6804518E14f));
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09220");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9061312.0f, (-2016000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4090624E7f + "'", float2 == 1.4090624E7f);
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09221");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.1909706E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6332644645414205E9d) + "'", double1 == (-2.6332644645414205E9d));
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09222");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.5876517E11f, (-7.159675E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.160984E11f + "'", float2 == 3.160984E11f);
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09223");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.484328E8f, 1.4148E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.3264655E9f + "'", float2 == 4.3264655E9f);
    }

    @Test
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09224");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.7264087E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5980087031878094E11d + "'", double1 == 3.5980087031878094E11d);
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09225");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.2277826E8f, 2.408379E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8212135E11f + "'", float2 == 4.8212135E11f);
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09226");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1754640.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.102472826738959E7d) + "'", double1 == (-1.102472826738959E7d));
    }

    @Test
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09227");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1.0859834E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0859834E14f + "'", float2 == 1.0859834E14f);
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09228");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-1.1396162E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1054277E12f) + "'", float2 == (-1.1054277E12f));
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09229");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.6769654E9f, (-8.069963E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6066386E12f) + "'", float2 == (-1.6066386E12f));
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09230");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0419038E10f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0838076E10f + "'", float2 == 2.0838076E10f);
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09231");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.2665061E9f), 5.138545E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.00237885E11f + "'", float2 == 1.00237885E11f);
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09232");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1.590773E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.590773E12f + "'", float2 == 1.590773E12f);
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09233");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(42678.0f, 2.144042E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2889373E8f + "'", float2 == 4.2889373E8f);
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09234");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.3761772E10f, 1.6505312E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.976298E11f + "'", float2 == 3.976298E11f);
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09235");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 1.5862463E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09236");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(11620.0f, 1.475351E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.950702E12f + "'", float2 == 2.950702E12f);
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09237");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.7985336E9f, (-8.6723894E15f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.7344763E16f) + "'", float2 == (-1.7344763E16f));
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09238");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.256128E10f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2512256E11f + "'", float2 == 1.2512256E11f);
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09239");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 1.0561528E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0561528E13f + "'", float2 == 1.0561528E13f);
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09240");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.970218E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4945615303368958E10d + "'", double1 == 2.4945615303368958E10d);
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09241");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 6.6960384E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.48194E9f + "'", float2 == 3.48194E9f);
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09242");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-4928000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9856000.0f) + "'", float2 == (-9856000.0f));
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09243");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.2168704E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0212192832380917E11d + "'", double1 == 2.0212192832380917E11d);
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09244");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.937736E9f, 2206.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9875475E10f + "'", float2 == 1.9875475E10f);
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09245");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.4612E10f, 1885680.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.922777E10f + "'", float2 == 4.922777E10f);
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09246");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.3282611E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.345710753281901E9d) + "'", double1 == (-8.345710753281901E9d));
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09247");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(409512.0f, 1.3254295E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.651678E9f + "'", float2 == 2.651678E9f);
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09248");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1976.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09249");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.947401E9f, 2.9080187E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.805518E10f + "'", float2 == 7.805518E10f);
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09250");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 1.8415018E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.8415018E12f) + "'", float2 == (-1.8415018E12f));
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09251");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.3016065E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.702779077314785E11d + "'", double1 == 2.702779077314785E11d);
    }

    @Test
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09252");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.3497026E14f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.6994052E14f + "'", float2 == 4.6994052E14f);
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09253");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 3.3009609E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09254");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.4677648E13f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.222238276583839E13d) + "'", double1 == (-9.222238276583839E13d));
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09255");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-3.437063E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09256");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.1826431E10f), 2.24808E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.3203246E10f) + "'", float2 == (-2.3203246E10f));
    }

    @Test
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09257");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5.0699494E9f, 7.912595E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1722418E10f + "'", float2 == 1.1722418E10f);
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09258");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(713850.0f, 1.6179872E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3787444E7f + "'", float2 == 3.3787444E7f);
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09259");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.159675E8f), 2.557968E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.203414E8f) + "'", float2 == (-9.203414E8f));
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09260");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3965360.0f, (-7.759646E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5518499E11f) + "'", float2 == (-1.5518499E11f));
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09261");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(33200.0f, 2.9234965E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.846993E15f + "'", float2 == 5.846993E15f);
    }

    @Test
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09262");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.054575E10f), 4.624339E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.0999012E10f) + "'", float2 == (-6.0999012E10f));
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09263");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.847685E9f, 3.223806E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.6142982E10f + "'", float2 == 2.6142982E10f);
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09264");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1982680.0f), 2.304243E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.608486E14f + "'", float2 == 4.608486E14f);
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09265");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5.0518053E12f, (-6.775153E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.74858E12f + "'", float2 == 8.74858E12f);
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09266");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.6295213E11f), 3.4389843E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.2521646E11f) + "'", float2 == (-7.2521646E11f));
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09267");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.6616986E9f, 7.389488E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.471187E9f + "'", float2 == 9.471187E9f);
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09268");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.2151727E10f, 2.5970407E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.198512E13f + "'", float2 == 5.198512E13f);
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09269");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.619277E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0174217806512217E10d + "'", double1 == 1.0174217806512217E10d);
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09270");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-353824.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2223141.75812751d) + "'", double1 == (-2223141.75812751d));
    }

    @Test
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09271");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 1.4483464E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09272");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-8.441984E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6883968E8f) + "'", float2 == (-1.6883968E8f));
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09273");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.421296E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.034619268025105E8d + "'", double1 == 4.034619268025105E8d);
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09274");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.1684703E12f, (-3.8624988E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.329216E12f + "'", float2 == 6.329216E12f);
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09275");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 2.1397985E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09276");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.537619E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.107707290137516E8d + "'", double1 == 4.107707290137516E8d);
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09277");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8447160.0f, (-8.42561E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5161787E8f) + "'", float2 == (-1.5161787E8f));
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09278");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.7447252E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7245617350478447E10d + "'", double1 == 1.7245617350478447E10d);
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09279");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-161406.0f), 7.044301E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4085373E9f + "'", float2 == 1.4085373E9f);
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09280");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 3.974455E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.974455E13f + "'", float2 == 3.974455E13f);
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09281");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 6360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 636000.0f + "'", float2 == 636000.0f);
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09282");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1193716.0f), 2.6966528E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.390918E9f + "'", float2 == 5.390918E9f);
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09283");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(10640.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 66853.0916683908d + "'", double1 == 66853.0916683908d);
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09284");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1780.0f), 3.238881E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.477726E8f + "'", float2 == 6.477726E8f);
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09285");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-1.1396162E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09286");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.2920241E11f), 7.931228E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.978026E10f) + "'", float2 == (-9.978026E10f));
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09287");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 1.8349195E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8349195E8f + "'", float2 == 1.8349195E8f);
    }

    @Test
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09288");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0f, (-9.11543E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.823086E8f) + "'", float2 == (-1.823086E8f));
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09289");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.243949E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.808144540369435E12d + "'", double1 == 5.808144540369435E12d);
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09290");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-228.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 228.0f + "'", float2 == 228.0f);
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09291");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(118200.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 742672.503308627d + "'", double1 == 742672.503308627d);
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09292");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.29696E8f, 1427312.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.6224662E8f + "'", float2 == 2.6224662E8f);
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09293");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(522240.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1044480.0f + "'", float2 == 1044480.0f);
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09294");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-4.21372E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.21372E8f) + "'", float2 == (-4.21372E8f));
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09295");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.048E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2867963509103793E8d + "'", double1 == 1.2867963509103793E8d);
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09296");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-170468.0f), 4580736.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8820536.0f + "'", float2 == 8820536.0f);
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09297");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.050348E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09298");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 972584.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.72584E7f + "'", float2 == 9.72584E7f);
    }

    @Test
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09299");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.3210614E13f, (-1185616.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.6421225E13f + "'", float2 == 2.6421225E13f);
    }

    @Test
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09300");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-852512.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5356490.872594283d) + "'", double1 == (-5356490.872594283d));
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09301");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.080678E9f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8161357E10f + "'", float2 == 1.8161357E10f);
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09302");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.603776E7f, 2.7236624E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.654877E7f + "'", float2 == 8.654877E7f);
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09303");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.4064E9f), (-9.934088E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.2680977E10f) + "'", float2 == (-2.2680977E10f));
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09304");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.926834E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8389840847796097E11d) + "'", double1 == (-1.8389840847796097E11d));
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09305");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-3.9778637E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.8585277E11f) + "'", float2 == (-3.8585277E11f));
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09306");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.0054E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5166670831500973E10d + "'", double1 == 2.5166670831500973E10d);
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09307");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-1.552215E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.4327526E9f) + "'", float2 == (-5.4327526E9f));
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09308");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.978971E8f, 7.259798E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.611539E10f + "'", float2 == 1.611539E10f);
    }

    @Test
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09309");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3784816.0f), (-3.4691172E14f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.9382345E14f) + "'", float2 == (-6.9382345E14f));
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09310");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.4825792E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.315319846170065E7d + "'", double1 == 9.315319846170065E7d);
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09311");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1.1269213E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1269213E11f + "'", float2 == 1.1269213E11f);
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09312");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1746265E10f, 4.567484E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.137317E13f + "'", float2 == 9.137317E13f);
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09313");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.7691945E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8815288705887714E11d + "'", double1 == 4.8815288705887714E11d);
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09314");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-794560.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-794560.0f) + "'", float2 == (-794560.0f));
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09315");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.5041409E12f), 66560.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0082814E12f) + "'", float2 == (-3.0082814E12f));
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09316");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 2.592272E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.592272E9f) + "'", float2 == (-2.592272E9f));
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09317");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 1.1824686E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09318");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 1.5157668E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5157668E14f + "'", float2 == 1.5157668E14f);
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09319");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-7199392.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.199392E8f) + "'", float2 == (-7.199392E8f));
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09320");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.9105395E8f, (-680.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5821065E9f + "'", float2 == 1.5821065E9f);
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09321");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.8579334E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0523296013464384E9d) + "'", double1 == (-3.0523296013464384E9d));
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09322");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 1.4232222E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4232222E13f + "'", float2 == 1.4232222E13f);
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09323");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-1.1923734E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.19237335E14f) + "'", float2 == (-1.19237335E14f));
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09324");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.5258923E8f, 1.101036E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.23259E10f + "'", float2 == 2.23259E10f);
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09325");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 1.3784E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09326");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.036019E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5359055250138358E11d) + "'", double1 == (-2.5359055250138358E11d));
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09327");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.7574346E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7325472715025066E10d) + "'", double1 == (-1.7325472715025066E10d));
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09328");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.720616E10f), (-5.770507E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.8982247E11f) + "'", float2 == (-1.8982247E11f));
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09329");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-7.338304E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.610792580261171E11d) + "'", double1 == (-4.610792580261171E11d));
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09330");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.6274856E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0225793408504423E10d + "'", double1 == 1.0225793408504423E10d);
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09331");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.9272768E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8392622579807677E9d) + "'", double1 == (-1.8392622579807677E9d));
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09332");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 2.0853574E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0853574E10f) + "'", float2 == (-2.0853574E10f));
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09333");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.6314035E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6533595934124644E9d + "'", double1 == 1.6533595934124644E9d);
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09334");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0258545E11f, (-1.5733472E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0513943E11f + "'", float2 == 2.0513943E11f);
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09335");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-7.95661E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.9992852533684045E8d) + "'", double1 == (-4.9992852533684045E8d));
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09336");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1104.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09337");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.0050885E12f, (-4.3892576E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9223917E12f + "'", float2 == 3.9223917E12f);
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09338");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.2115372E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.612312496888419E11d + "'", double1 == 7.612312496888419E11d);
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09339");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-3.2704253E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1446489E11f) + "'", float2 == (-1.1446489E11f));
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09340");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 4350528.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.350528E7f + "'", float2 == 4.350528E7f);
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09341");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 3.4634555E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4634555E10f + "'", float2 == 3.4634555E10f);
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09342");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(520000.0f, (-1.501465E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.002929E12f) + "'", float2 == (-3.002929E12f));
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09343");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.756858E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8737775310699745E10d + "'", double1 == 4.8737775310699745E10d);
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09344");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.2619098E10f, 2.3859936E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.5285915E10f + "'", float2 == 6.5285915E10f);
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09345");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-4.036019E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.036019E10f + "'", float2 == 4.036019E10f);
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09346");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.0838076E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3092949556689665E11d + "'", double1 == 1.3092949556689665E11d);
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09347");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6634944E8f, 2.7809952E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.888979E8f + "'", float2 == 8.888979E8f);
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09348");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2524912.0f), (-9.892447E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9785399E11f) + "'", float2 == (-1.9785399E11f));
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09349");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-7.91516E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.1158833E9f) + "'", float2 == (-4.1158833E9f));
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09350");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4426656.0f, 2.5073845E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.01477E13f + "'", float2 == 5.01477E13f);
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09351");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-1.0022E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0022E8f + "'", float2 == 1.0022E8f);
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09352");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 4098400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09353");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-4.961635E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09354");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.172963E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.993631398911654E11d) + "'", double1 == (-1.993631398911654E11d));
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09355");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 2649744.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.274104E7f + "'", float2 == 9.274104E7f);
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09356");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 1.2446492E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2446492E11f + "'", float2 == 1.2446492E11f);
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09357");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 7.715882E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.715882E9f) + "'", float2 == (-7.715882E9f));
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09358");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-3.9008158E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9008158E11f + "'", float2 == 3.9008158E11f);
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09359");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.5162533E10f, 3.5006533E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.7326375E10f + "'", float2 == 9.7326375E10f);
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09360");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.0838076E10f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.1676153E10f + "'", float2 == 4.1676153E10f);
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09361");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 6.0603577E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9393145E14f + "'", float2 == 1.9393145E14f);
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09362");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 64000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-64000.0f) + "'", float2 == (-64000.0f));
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09363");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 50336.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 50336.0f + "'", float2 == 50336.0f);
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09364");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.4932434E11f, 183512.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4986491E12f + "'", float2 == 1.4986491E12f);
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09365");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.0988768E13f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9470817087157153E14d) + "'", double1 == (-1.9470817087157153E14d));
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09366");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.045006E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.565966526070248E10d) + "'", double1 == (-6.565966526070248E10d));
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09367");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 3.4589606E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4589605E13f + "'", float2 == 3.4589605E13f);
    }

    @Test
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09368");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-8386528.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09369");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.583098E9f, 2.9080179E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.332655E10f + "'", float2 == 7.332655E10f);
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09370");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.053365E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.546804215599892E8d) + "'", double1 == (-2.546804215599892E8d));
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09371");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.310663E9f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.621326E9f + "'", float2 == 6.621326E9f);
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09372");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5.0094694E9f, 7.032E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1425339E10f + "'", float2 == 1.1425339E10f);
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09373");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 4.8176266E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8176267E11f + "'", float2 == 4.8176267E11f);
    }

    @Test
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09374");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.1422145E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.176745314787305E11d) + "'", double1 == (-7.176745314787305E11d));
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09375");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 4.012876E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.012876E8f + "'", float2 == 4.012876E8f);
    }

    @Test
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09376");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.14389E8f, (-1.9087208E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9886636E9f) + "'", float2 == (-1.9886636E9f));
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09377");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-5.514869E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.465094543005013E10d) + "'", double1 == (-3.465094543005013E10d));
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09378");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.20577696E11f, 7.3148685E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4261837E11f + "'", float2 == 2.4261837E11f);
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09379");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-700776.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4403105.466824082d) + "'", double1 == (-4403105.466824082d));
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09380");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 3.3009609E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1553362E12f + "'", float2 == 1.1553362E12f);
    }

    @Test
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09381");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-2.058343E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.07033834E12f) + "'", float2 == (-1.07033834E12f));
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09382");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.0964876E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.317262026595993E12d) + "'", double1 == (-1.317262026595993E12d));
    }

    @Test
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09383");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.617316E11f, 5.515121E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3344934E12f + "'", float2 == 1.3344934E12f);
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09384");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.8956364E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1910634635491454E11d + "'", double1 == 1.1910634635491454E11d);
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09385");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.10444E7f, 4.601536E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3411952E8f + "'", float2 == 1.3411952E8f);
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09386");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.208776E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9010890138769245E8d + "'", double1 == 3.9010890138769245E8d);
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09387");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.087034E8f, 3.1410288E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4802275E9f + "'", float2 == 1.4802275E9f);
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09388");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 4.0436457E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0872915E10f + "'", float2 == 8.0872915E10f);
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09389");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.3315456E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.606545959283714E9d + "'", double1 == 4.606545959283714E9d);
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09390");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 8.022064E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.022064E7f + "'", float2 == 8.022064E7f);
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09391");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-7.2521646E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.556669411023341E12d) + "'", double1 == (-4.556669411023341E12d));
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09392");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.2673242E8f), 1.5174584E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.2311566E8f) + "'", float2 == (-2.2311566E8f));
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09393");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 2.1065652E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2131305E15f + "'", float2 == 4.2131305E15f);
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09394");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 5.4000763E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.4000763E10f + "'", float2 == 5.4000763E10f);
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09395");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.490525E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4497984752065134E8d + "'", double1 == 3.4497984752065134E8d);
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09396");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 1.1518983E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1518983E15f) + "'", float2 == (-1.1518983E15f));
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09397");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.984422E9f, (-4.3432925E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.668616E12f) + "'", float2 == (-8.668616E12f));
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09398");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(36.0f, (-1003440.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2006808.0f) + "'", float2 == (-2006808.0f));
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09399");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.951707E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6245231534098976E10d + "'", double1 == 5.6245231534098976E10d);
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09400");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.1491397E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.220257754334981E9d) + "'", double1 == (-7.220257754334981E9d));
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09401");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.954691E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9980799580015544E14d + "'", double1 == 4.9980799580015544E14d);
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09402");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.3159157E14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.455132722185123E15d + "'", double1 == 1.455132722185123E15d);
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09403");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.350805E8f, (-3.918606E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.1356022E8f) + "'", float2 == (-5.1356022E8f));
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09404");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.954668E7f), 6.787133E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3566357E11f + "'", float2 == 1.3566357E11f);
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09405");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.202152E8f, (-7.89142E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.378537E8f) + "'", float2 == (-3.378537E8f));
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09406");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-1.03208154E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.302661E10f) + "'", float2 == (-3.302661E10f));
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09407");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 7.116071E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.116071E10f) + "'", float2 == (-7.116071E10f));
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09408");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.1269213E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.080655598797964E11d + "'", double1 == 7.080655598797964E11d);
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09409");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 4.693312E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.693312E9f + "'", float2 == 4.693312E9f);
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09410");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.309218E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.079243021744711E10d + "'", double1 == 2.079243021744711E10d);
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09411");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-2.2045091E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09412");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 222562.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-222562.0f) + "'", float2 == (-222562.0f));
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09413");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.05349E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.175201393702323E11d + "'", double1 == 3.175201393702323E11d);
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09414");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.8941928E15f), 4.9453245E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.7883756E15f) + "'", float2 == (-3.7883756E15f));
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09415");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-20728.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-130237.86504721847d) + "'", double1 == (-130237.86504721847d));
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09416");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.752016E9f), 1820000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.7500393E10f) + "'", float2 == (-1.7500393E10f));
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09417");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 1.3266756E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09418");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.1956187E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.512293934280478E10d + "'", double1 == 7.512293934280478E10d);
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09419");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-1.1422145E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1422145E11f + "'", float2 == 1.1422145E11f);
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09420");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-4.012876E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09421");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.8176266E9f, 1296960.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.637847E9f + "'", float2 == 9.637847E9f);
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09422");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.2720544E8f), 1.4823542E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.5794003E8f) + "'", float2 == (-3.5794003E8f));
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09423");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.5927172E10f), 1.0317879E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0622572E14f + "'", float2 == 2.0622572E14f);
    }

    @Test
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09424");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.6292813E9f, 7.756115E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6238087E11f + "'", float2 == 1.6238087E11f);
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09425");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-4.281608E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4985628E12f) + "'", float2 == (-1.4985628E12f));
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09426");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8618400.0f), (-83800.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.74044E7f) + "'", float2 == (-1.74044E7f));
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09427");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-382300.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-382300.0f) + "'", float2 == (-382300.0f));
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09428");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.5929004E9f, 1.7046388E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4124635E12f + "'", float2 == 3.4124635E12f);
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09429");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 1944968.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1944968.0f) + "'", float2 == (-1944968.0f));
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09430");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.0241996E13f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2718421384489681E14d) + "'", double1 == (-1.2718421384489681E14d));
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09431");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 8.022064E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.022064E7f) + "'", float2 == (-8.022064E7f));
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09432");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1.3766936E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09433");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 8.276644E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.276644E9f + "'", float2 == 8.276644E9f);
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09434");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.3024963E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0750196467433335E12d) + "'", double1 == (-2.0750196467433335E12d));
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09435");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 8.599412E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.599412E10f) + "'", float2 == (-8.599412E10f));
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09436");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 6.503883E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09437");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-3.587616E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.587616E8f) + "'", float2 == (-3.587616E8f));
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09438");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.0444134E9f, 1258.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2088829E10f + "'", float2 == 1.2088829E10f);
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09439");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 92560.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 92560.0f + "'", float2 == 92560.0f);
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09440");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-3.4836E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.4836E8f) + "'", float2 == (-3.4836E8f));
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09441");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-4362512.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4362512.0f) + "'", float2 == (-4362512.0f));
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09442");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.3321608E9f), 1.39048E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.3862257E9f) + "'", float2 == (-4.3862257E9f));
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09443");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.07732584E8f), 2.57155E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.1430786E13f + "'", float2 == 5.1430786E13f);
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09444");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 120.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09445");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.4864855E9f, 2.48459E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.970477E13f + "'", float2 == 4.970477E13f);
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09446");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5.629678E9f, 1.5512264E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.113712E12f + "'", float2 == 3.113712E12f);
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09447");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.150912E7f, 6.4007303E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2809762E11f + "'", float2 == 1.2809762E11f);
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09448");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.6883968E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0608509966449031E9d) + "'", double1 == (-1.0608509966449031E9d));
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09449");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.288791E8f), 3.2387616E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0005888E7f) + "'", float2 == (-1.0005888E7f));
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09450");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-1.0481219E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.6684264E11f) + "'", float2 == (-3.6684264E11f));
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09451");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.7456552E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7251460411221227E8d) + "'", double1 == (-1.7251460411221227E8d));
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09452");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 2987460.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.98746E7f + "'", float2 == 2.98746E7f);
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09453");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.9008158E11f, (-4.253631E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.9509054E11f + "'", float2 == 6.9509054E11f);
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09454");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 8.686589E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.686589E14f + "'", float2 == 8.686589E14f);
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09455");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.0153481E15f), 4660.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0306962E15f) + "'", float2 == (-2.0306962E15f));
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09456");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-336776.0f), (-1.568748E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.1442317E8f) + "'", float2 == (-3.1442317E8f));
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09457");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 6.7963095E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09458");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(50260.0f, 1.0458926E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0917862E11f + "'", float2 == 2.0917862E11f);
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09459");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 2.2249382E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.2249382E10f) + "'", float2 == (-2.2249382E10f));
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09460");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1084432.0f, 7.311077E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4622371E11f + "'", float2 == 1.4622371E11f);
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09461");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.4691172E14f), 6.503883E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.925227E14f) + "'", float2 == (-6.925227E14f));
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09462");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 797360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.146272E7f + "'", float2 == 4.146272E7f);
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09463");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 3.0029317E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0029316E15f + "'", float2 == 3.0029316E15f);
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09464");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.4333015E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298799579211718E13d + "'", double1 == 5.298799579211718E13d);
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09465");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.32667556E11f, (-1.4296979E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.5940606E12f) + "'", float2 == (-2.5940606E12f));
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09466");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4009200.0f), 3.902104E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.002368E7f + "'", float2 == 7.002368E7f);
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09467");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-4007008.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0836442E8f) + "'", float2 == (-2.0836442E8f));
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09468");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.208821E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.016161787540109E12d) + "'", double1 == (-2.016161787540109E12d));
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09469");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.174171E11f, 3.035976E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.306786E12f + "'", float2 == 6.306786E12f);
    }

    @Test
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09470");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-8.939746E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09471");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3954668.0f, (-9.978026E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9955261E11f) + "'", float2 == (-1.9955261E11f));
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09472");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 2.4696206E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4696206E12f + "'", float2 == 2.4696206E12f);
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09473");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.669417E11f), 4.8248416E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.337869E11f) + "'", float2 == (-7.337869E11f));
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09474");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 9.128481E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.128481E10f + "'", float2 == 9.128481E10f);
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09475");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5.0367E10f), 4.332729E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.986745E10f) + "'", float2 == (-9.986745E10f));
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09476");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 8685076.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8685076.0f) + "'", float2 == (-8685076.0f));
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09477");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.669417E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3055628015783936E11d + "'", double1 == 2.3055628015783936E11d);
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09478");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 7.4932434E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09479");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6451552E7f, 364000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3631104E7f + "'", float2 == 3.3631104E7f);
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09480");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.8274558E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.148224319603341E13d + "'", double1 == 1.148224319603341E13d);
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09481");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 2.23259E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.23259E10f) + "'", float2 == (-2.23259E10f));
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09482");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-9.7276E7f), (-5.1752407E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.03699366E11f) + "'", float2 == (-1.03699366E11f));
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09483");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.89962E8f, (-1.2390874E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.4201824E10f) + "'", float2 == (-2.4201824E10f));
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09484");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-2.0422659E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09485");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-705952.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4435627.233974043d) + "'", double1 == (-4435627.233974043d));
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09486");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(162400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1020389.2938859648d + "'", double1 == 1020389.2938859648d);
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09487");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.8926916E11f), 2.0925336E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.366876E11f) + "'", float2 == (-7.366876E11f));
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09488");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.42561E7f, 3316.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6851882E8f + "'", float2 == 1.6851882E8f);
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09489");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.67381E8f, 5.2045824E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5756785E9f + "'", float2 == 1.5756785E9f);
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09490");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.797177E7f, (-1.045006E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0744178E10f) + "'", float2 == (-2.0744178E10f));
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09491");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.985868E11f, 8.0872915E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.5891945E11f + "'", float2 == 5.5891945E11f);
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09492");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 1.02466224E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.02466224E11f + "'", float2 == 1.02466224E11f);
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09493");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 1.6043149E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2086298E9f + "'", float2 == 3.2086298E9f);
    }

    @Test
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09494");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 2.5734292E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5734293E11f + "'", float2 == 2.5734293E11f);
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09495");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.951664E7f, (-1.6165875E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.1741417E9f) + "'", float2 == (-3.1741417E9f));
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09496");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-4.21372E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09497");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.928818E10f, (-3.0003507E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.257566E10f + "'", float2 == 3.257566E10f);
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09498");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 1.7149842E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.4879495E12f + "'", float2 == 5.4879495E12f);
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09499");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.565188E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2400736858932975E8d + "'", double1 == 2.2400736858932975E8d);
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09500");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.4124483E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.285697127950774E10d + "'", double1 == 5.285697127950774E10d);
    }
}

