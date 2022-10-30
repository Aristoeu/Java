package Perimeter;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

    public static boolean debug = false;

    @Test
    public void test12001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12001");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(20096.0f, (-3.9998E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.999198E8f) + "'", float2 == (-7.999198E8f));
    }

    @Test
    public void test12002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12002");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.620213E9f, 2.6825797E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.3664836E13f + "'", float2 == 5.3664836E13f);
    }

    @Test
    public void test12003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12003");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 1.5512214E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5512214E11f + "'", float2 == 1.5512214E11f);
    }

    @Test
    public void test12004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12004");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.5443678E17f, (-2.4895672E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0887356E17f + "'", float2 == 7.0887356E17f);
    }

    @Test
    public void test12005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12005");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 3.236132E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.236132E9f + "'", float2 == 3.236132E9f);
    }

    @Test
    public void test12006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12006");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.594758E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0020160134638067E10d + "'", double1 == 1.0020160134638067E10d);
    }

    @Test
    public void test12007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12007");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.0532698E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.617889482652429E9d + "'", double1 == 6.617889482652429E9d);
    }

    @Test
    public void test12008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12008");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 4.681064E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5406323E10f + "'", float2 == 4.5406323E10f);
    }

    @Test
    public void test12009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12009");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.8484073E11f, 4.012876E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.7048405E11f + "'", float2 == 3.7048405E11f);
    }

    @Test
    public void test12010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12010");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 8.022064E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.022064E9f + "'", float2 == 8.022064E9f);
    }

    @Test
    public void test12011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12011");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.086478E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9392913241926025E14d + "'", double1 == 1.9392913241926025E14d);
    }

    @Test
    public void test12012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12012");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 640.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-640.0f) + "'", float2 == (-640.0f));
    }

    @Test
    public void test12013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12013");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1.0458411E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0458411E12f + "'", float2 == 1.0458411E12f);
    }

    @Test
    public void test12014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12014");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-7.32643E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.603331735018593E12d) + "'", double1 == (-4.603331735018593E12d));
    }

    @Test
    public void test12015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12015");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.9618E8f, 2.189816E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0361563E9f + "'", float2 == 1.0361563E9f);
    }

    @Test
    public void test12016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12016");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.220992E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6521274916122575E9d + "'", double1 == 2.6521274916122575E9d);
    }

    @Test
    public void test12017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12017");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3166360.0f, 1.0865284E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8063288E7f + "'", float2 == 2.8063288E7f);
    }

    @Test
    public void test12018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12018");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.654552E10f), (-3.3653427E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.661596E11f) + "'", float2 == (-7.661596E11f));
    }

    @Test
    public void test12019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12019");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.919136E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.975739896075692E8d + "'", double1 == 4.975739896075692E8d);
    }

    @Test
    public void test12020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12020");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1.0121106E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.542387E14f + "'", float2 == 3.542387E14f);
    }

    @Test
    public void test12021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12021");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-8.837402E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.595449E11f) + "'", float2 == (-4.595449E11f));
    }

    @Test
    public void test12022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12022");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.954691E13f, 6321600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5909384E14f + "'", float2 == 1.5909384E14f);
    }

    @Test
    public void test12023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12023");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 3.5738563E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.5738563E11f) + "'", float2 == (-3.5738563E11f));
    }

    @Test
    public void test12024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12024");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 8272320.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8272320.0f) + "'", float2 == (-8272320.0f));
    }

    @Test
    public void test12025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12025");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1992320.0f, 2.4087728E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.817546E13f + "'", float2 == 4.817546E13f);
    }

    @Test
    public void test12026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12026");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 2.97184E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.97184E7f) + "'", float2 == (-2.97184E7f));
    }

    @Test
    public void test12027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12027");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.8132193E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.280871957628157E10d + "'", double1 == 4.280871957628157E10d);
    }

    @Test
    public void test12028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12028");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.0561528E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.636003634459423E11d + "'", double1 == 6.636003634459423E11d);
    }

    @Test
    public void test12029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12029");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.2730312E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.056506134471844E10d) + "'", double1 == (-2.056506134471844E10d));
    }

    @Test
    public void test12030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12030");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 2.1347636E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.8312435E12f + "'", float2 == 6.8312435E12f);
    }

    @Test
    public void test12031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12031");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.7176489E9f, (-7.759573E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5515711E13f) + "'", float2 == (-1.5515711E13f));
    }

    @Test
    public void test12032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12032");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.8098296E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1371494751218708E8d) + "'", double1 == (-1.1371494751218708E8d));
    }

    @Test
    public void test12033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12033");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.617316E13f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3234632E14f + "'", float2 == 1.3234632E14f);
    }

    @Test
    public void test12034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12034");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5.0014716E11f, (-1.3012608E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0002683E12f + "'", float2 == 1.0002683E12f);
    }

    @Test
    public void test12035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12035");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.951707E9f, (-1.25261736E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.765289E10f + "'", float2 == 1.765289E10f);
    }

    @Test
    public void test12036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12036");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.6744634E8f), 8.694769E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.729605E11f + "'", float2 == 1.729605E11f);
    }

    @Test
    public void test12037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12037");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 5.7525574E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.013395E13f + "'", float2 == 2.013395E13f);
    }

    @Test
    public void test12038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12038");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0330112E8f, 8820536.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2424331E8f + "'", float2 == 2.2424331E8f);
    }

    @Test
    public void test12039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12039");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5.908997E12f, (-1.6875343E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.193269E13f) + "'", float2 == (-2.193269E13f));
    }

    @Test
    public void test12040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12040");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.620213E9f, 2.0853574E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.172039E13f + "'", float2 == 4.172039E13f);
    }

    @Test
    public void test12041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12041");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 125368.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1253680.0f + "'", float2 == 1253680.0f);
    }

    @Test
    public void test12042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12042");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.484328E7f, (-1.5968781E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.1936065E12f) + "'", float2 == (-3.1936065E12f));
    }

    @Test
    public void test12043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12043");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1818304E11f, (-1040000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.36364E11f + "'", float2 == 2.36364E11f);
    }

    @Test
    public void test12044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12044");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 3.238881E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.238881E9f + "'", float2 == 3.238881E9f);
    }

    @Test
    public void test12045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12045");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-198640.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 198640.0f + "'", float2 == 198640.0f);
    }

    @Test
    public void test12046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12046");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 5.2832174E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8491261E11f + "'", float2 == 1.8491261E11f);
    }

    @Test
    public void test12047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12047");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.799915E14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1309199039337265E15d + "'", double1 == 1.1309199039337265E15d);
    }

    @Test
    public void test12048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12048");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-6.194835E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.194835E10f) + "'", float2 == (-6.194835E10f));
    }

    @Test
    public void test12049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12049");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-2.7060033E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7060033E13f + "'", float2 == 2.7060033E13f);
    }

    @Test
    public void test12050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12050");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.2730317E11f, 2.311862E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.63027E14f + "'", float2 == 4.63027E14f);
    }

    @Test
    public void test12051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12051");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 1.7188728E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.938139E9f + "'", float2 == 8.938139E9f);
    }

    @Test
    public void test12052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12052");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.6879552E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6888920369358475E14d + "'", double1 == 1.6888920369358475E14d);
    }

    @Test
    public void test12053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12053");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.6015235E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0062668647842672E10d + "'", double1 == 1.0062668647842672E10d);
    }

    @Test
    public void test12054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12054");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.6723937E15f), 2.5734292E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.7344782E16f) + "'", float2 == (-1.7344782E16f));
    }

    @Test
    public void test12055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12055");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.8603813E10f, 3026400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.721368E10f + "'", float2 == 7.721368E10f);
    }

    @Test
    public void test12056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12056");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.7393925E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.234485201071452E11d + "'", double1 == 4.234485201071452E11d);
    }

    @Test
    public void test12057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12057");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 4.190027E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.190027E10f + "'", float2 == 4.190027E10f);
    }

    @Test
    public void test12058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12058");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-7.661596E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.813922855073518E12d) + "'", double1 == (-4.813922855073518E12d));
    }

    @Test
    public void test12059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12059");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.108716E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.466537992411244E8d + "'", double1 == 4.466537992411244E8d);
    }

    @Test
    public void test12060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12060");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.284256E15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.320196031401816E16d + "'", double1 == 3.320196031401816E16d);
    }

    @Test
    public void test12061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12061");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 2.7751639E17f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12062");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.7103856E7f, 3.5475885E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.095519E11f + "'", float2 == 7.095519E11f);
    }

    @Test
    public void test12063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12063");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-6.0444134E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.863081E11f) + "'", float2 == (-5.863081E11f));
    }

    @Test
    public void test12064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12064");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1.0144478E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5505672E12f + "'", float2 == 3.5505672E12f);
    }

    @Test
    public void test12065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12065");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.332729E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.722333894146349E9d + "'", double1 == 2.722333894146349E9d);
    }

    @Test
    public void test12066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12066");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.04952435E9f), 87440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0988739E9f) + "'", float2 == (-2.0988739E9f));
    }

    @Test
    public void test12067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12067");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 6.605657E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.1138103E13f + "'", float2 == 2.1138103E13f);
    }

    @Test
    public void test12068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12068");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 332800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.328E7f + "'", float2 == 3.328E7f);
    }

    @Test
    public void test12069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12069");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.459029E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5450534961142664E12d + "'", double1 == 1.5450534961142664E12d);
    }

    @Test
    public void test12070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12070");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.802364E8f, 3.4836E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.3014483E8f + "'", float2 == 6.3014483E8f);
    }

    @Test
    public void test12071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12071");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.98268E8f, (-3.720616E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.044696E9f) + "'", float2 == (-7.044696E9f));
    }

    @Test
    public void test12072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12072");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1.3508438E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3508437E15f + "'", float2 == 1.3508437E15f);
    }

    @Test
    public void test12073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12073");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.663018E10f, 2.1141182E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.245562E13f + "'", float2 == 4.245562E13f);
    }

    @Test
    public void test12074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12074");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-2.0572787E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0572787E9f) + "'", float2 == (-2.0572787E9f));
    }

    @Test
    public void test12075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12075");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0024E7f, 1.6451552E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.2951104E7f + "'", float2 == 5.2951104E7f);
    }

    @Test
    public void test12076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12076");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.93072E8f), 7.2551846E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3510707E8f) + "'", float2 == (-1.3510707E8f));
    }

    @Test
    public void test12077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12077");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.7510068E7f, 1.6505312E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3014127E11f + "'", float2 == 3.3014127E11f);
    }

    @Test
    public void test12078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12078");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.9236803E9f, (-1.04952435E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.748312E9f + "'", float2 == 7.748312E9f);
    }

    @Test
    public void test12079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12079");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1629280.0f), (-7.3585065E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4720271E10f) + "'", float2 == (-1.4720271E10f));
    }

    @Test
    public void test12080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12080");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-5.1149114E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.2137935904677954E9d) + "'", double1 == (-3.2137935904677954E9d));
    }

    @Test
    public void test12081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12081");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.9876192E11f, 7.125716E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.822667E12f + "'", float2 == 1.822667E12f);
    }

    @Test
    public void test12082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12082");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.973877E9f, (-6.093354E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2729084E10f + "'", float2 == 1.2729084E10f);
    }

    @Test
    public void test12083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12083");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.7967867E9f, 5.29959E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1358537E11f + "'", float2 == 1.1358537E11f);
    }

    @Test
    public void test12084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12084");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.080538E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9355591288806602E12d) + "'", double1 == (-1.9355591288806602E12d));
    }

    @Test
    public void test12085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12085");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.02903654E9f, 1400000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0608731E9f + "'", float2 == 2.0608731E9f);
    }

    @Test
    public void test12086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12086");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.0867436E11f, 7.002368E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.174888E11f + "'", float2 == 6.174888E11f);
    }

    @Test
    public void test12087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12087");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.9234402E11f, 6.618436E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.979249E11f + "'", float2 == 9.979249E11f);
    }

    @Test
    public void test12088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12088");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.1038707E13f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.950219498821748E14d) + "'", double1 == (-1.950219498821748E14d));
    }

    @Test
    public void test12089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12089");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-8.824536E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test12090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12090");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-9.4709955E14f), 1.3734816E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.8941991E15f) + "'", float2 == (-1.8941991E15f));
    }

    @Test
    public void test12091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12091");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.9346024E14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.613776228679244E15d + "'", double1 == 5.613776228679244E15d);
    }

    @Test
    public void test12092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12092");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.4526828E10f, (-6.439936E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2892486E11f + "'", float2 == 1.2892486E11f);
    }

    @Test
    public void test12093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12093");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.3018304E7f, 5.7988756E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1663788E10f + "'", float2 == 1.1663788E10f);
    }

    @Test
    public void test12094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12094");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.2115372E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12095");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(386.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 772.0f + "'", float2 == 772.0f);
    }

    @Test
    public void test12096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12096");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.488159E13f, (-4.1730463E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.975483E13f + "'", float2 == 8.975483E13f);
    }

    @Test
    public void test12097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12097");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 8820536.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0871875E8f + "'", float2 == 3.0871875E8f);
    }

    @Test
    public void test12098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12098");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.98746E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8770764777786726E8d + "'", double1 == 1.8770764777786726E8d);
    }

    @Test
    public void test12099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12099");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-7373824.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.373824E7f) + "'", float2 == (-7.373824E7f));
    }

    @Test
    public void test12100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12100");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.093516E8f, (-2.8568294E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.04733734E9f + "'", float2 == 1.04733734E9f);
    }

    @Test
    public void test12101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12101");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.7409664E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7221999811952925E9d) + "'", double1 == (-1.7221999811952925E9d));
    }

    @Test
    public void test12102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12102");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-2.9821584E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.9821584E8f) + "'", float2 == (-2.9821584E8f));
    }

    @Test
    public void test12103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12103");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-3587616.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.8655603E8f) + "'", float2 == (-1.8655603E8f));
    }

    @Test
    public void test12104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12104");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.4280785E14f), 1.557142E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.8530428E14f) + "'", float2 == (-2.8530428E14f));
    }

    @Test
    public void test12105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12105");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 3.430132E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.430132E11f) + "'", float2 == (-3.430132E11f));
    }

    @Test
    public void test12106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12106");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-6.44893E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.2554617E13f) + "'", float2 == (-6.2554617E13f));
    }

    @Test
    public void test12107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12107");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-6.8438823E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.8438823E10f + "'", float2 == 6.8438823E10f);
    }

    @Test
    public void test12108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12108");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-5.502885E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test12109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12109");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.99483E12f, 3.8853757E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.990437E12f + "'", float2 == 9.990437E12f);
    }

    @Test
    public void test12110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12110");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) -1, 2.3650967E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.7301934E9f + "'", float2 == 4.7301934E9f);
    }

    @Test
    public void test12111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12111");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.5070665E10f), 1152.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0141327E10f) + "'", float2 == (-3.0141327E10f));
    }

    @Test
    public void test12112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12112");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-6.336E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test12113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12113");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.1363104E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.13964903486472E11d + "'", double1 == 7.13964903486472E11d);
    }

    @Test
    public void test12114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12114");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-3.4634555E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.926911E10f) + "'", float2 == (-6.926911E10f));
    }

    @Test
    public void test12115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12115");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 194400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-194400.0f) + "'", float2 == (-194400.0f));
    }

    @Test
    public void test12116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12116");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 1.205777E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.205777E12f) + "'", float2 == (-1.205777E12f));
    }

    @Test
    public void test12117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12117");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-1.3948331E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3948331E13f) + "'", float2 == (-1.3948331E13f));
    }

    @Test
    public void test12118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12118");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 8769280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12119");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 1428992.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.430758E7f + "'", float2 == 7.430758E7f);
    }

    @Test
    public void test12120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12120");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 1.4150975E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4150975E9f) + "'", float2 == (-1.4150975E9f));
    }

    @Test
    public void test12121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12121");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.3234653E12f, 3.2730312E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.6534766E12f + "'", float2 == 2.6534766E12f);
    }

    @Test
    public void test12122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12122");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.1275533E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9650996816317322E9d + "'", double1 == 1.9650996816317322E9d);
    }

    @Test
    public void test12123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12123");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.7288832E8f), 1427312.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.42922E8f) + "'", float2 == (-9.42922E8f));
    }

    @Test
    public void test12124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12124");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.5713787E9f, (-1.3550306E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.6969183E12f) + "'", float2 == (-2.6969183E12f));
    }

    @Test
    public void test12125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12125");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.42561E7f, 3026400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.74565E8f + "'", float2 == 1.74565E8f);
    }

    @Test
    public void test12126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12126");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2676400.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6816317156135444E7d) + "'", double1 == (-1.6816317156135444E7d));
    }

    @Test
    public void test12127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12127");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1.668062E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.838217E11f + "'", float2 == 5.838217E11f);
    }

    @Test
    public void test12128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12128");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-9.02135E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.668281306720781E10d) + "'", double1 == (-5.668281306720781E10d));
    }

    @Test
    public void test12129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12129");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-52.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-520.0f) + "'", float2 == (-520.0f));
    }

    @Test
    public void test12130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12130");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.246841E16f, 5.942154E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4493694E17f + "'", float2 == 1.4493694E17f);
    }

    @Test
    public void test12131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12131");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-2.2191251E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2191251E11f + "'", float2 == 2.2191251E11f);
    }

    @Test
    public void test12132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12132");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.669417E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3055626986346855E12d) + "'", double1 == (-2.3055626986346855E12d));
    }

    @Test
    public void test12133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12133");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 3.5867365E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5867365E11f + "'", float2 == 3.5867365E11f);
    }

    @Test
    public void test12134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12134");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.8983294E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.077711128564651E11d) + "'", double1 == (-3.077711128564651E11d));
    }

    @Test
    public void test12135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12135");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 2.895312E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5055622E10f + "'", float2 == 1.5055622E10f);
    }

    @Test
    public void test12136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12136");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.759065E8f), 8.908404E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7781627E11f + "'", float2 == 1.7781627E11f);
    }

    @Test
    public void test12137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12137");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.5157668E14f, 504064.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0315335E14f + "'", float2 == 3.0315335E14f);
    }

    @Test
    public void test12138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12138");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 9.128481E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.8546266E11f + "'", float2 == 8.8546266E11f);
    }

    @Test
    public void test12139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12139");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.7594512E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1054957794069273E14d + "'", double1 == 1.1054957794069273E14d);
    }

    @Test
    public void test12140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12140");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.5070752E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5752418060634322E9d) + "'", double1 == (-1.5752418060634322E9d));
    }

    @Test
    public void test12141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12141");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.3510707E8f), 4.5848E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.7851814E8f) + "'", float2 == (-1.7851814E8f));
    }

    @Test
    public void test12142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12142");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 1.378723E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.4119137E9f + "'", float2 == 4.4119137E9f);
    }

    @Test
    public void test12143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12143");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.2815909E11f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5631818E11f + "'", float2 == 2.5631818E11f);
    }

    @Test
    public void test12144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12144");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-8.752016E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.4990540752143814E10d) + "'", double1 == (-5.4990540752143814E10d));
    }

    @Test
    public void test12145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12145");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 3.1878374E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1878375E11f + "'", float2 == 3.1878375E11f);
    }

    @Test
    public void test12146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12146");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.7782272E10f, 5.7988756E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.7162294E10f + "'", float2 == 4.7162294E10f);
    }

    @Test
    public void test12147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12147");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.1342532E10f), 1.3313834E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.6604984E13f + "'", float2 == 2.6604984E13f);
    }

    @Test
    public void test12148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12148");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5.88098E8f), 1.4449126E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7722058E10f + "'", float2 == 2.7722058E10f);
    }

    @Test
    public void test12149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12149");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6515496E7f, 8.064005E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.612834E12f + "'", float2 == 1.612834E12f);
    }

    @Test
    public void test12150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12150");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.070575E9f, 4.3556848E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.9254845E10f + "'", float2 == 9.9254845E10f);
    }

    @Test
    public void test12151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12151");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.0943647E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5725651949345566E10d) + "'", double1 == (-2.5725651949345566E10d));
    }

    @Test
    public void test12152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12152");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.6272743E10f, 4.312241E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4116997E11f + "'", float2 == 1.4116997E11f);
    }

    @Test
    public void test12153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12153");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-3.189558E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test12154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12154");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 5.2842467E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7478084E15f + "'", float2 == 2.7478084E15f);
    }

    @Test
    public void test12155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12155");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-74396.0f), 4.623723E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.247446E14f + "'", float2 == 9.247446E14f);
    }

    @Test
    public void test12156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12156");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 1.523504E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.523504E13f + "'", float2 == 1.523504E13f);
    }

    @Test
    public void test12157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12157");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 7.116226E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.116226E10f + "'", float2 == 7.116226E10f);
    }

    @Test
    public void test12158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12158");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.4302938E9f, (-6.740543E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.512479E9f + "'", float2 == 3.512479E9f);
    }

    @Test
    public void test12159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12159");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.5521698E10f, (-5.230609E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.356879E10f) + "'", float2 == (-7.356879E10f));
    }

    @Test
    public void test12160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12160");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.973877E9f, 6.9056323E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7759018E10f + "'", float2 == 2.7759018E10f);
    }

    @Test
    public void test12161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12161");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5.1690778E8f), (-1.0E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0338156E9f) + "'", float2 == (-3.0338156E9f));
    }

    @Test
    public void test12162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12162");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.02135E9f, 2.8298202E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.370234E10f + "'", float2 == 2.370234E10f);
    }

    @Test
    public void test12163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12163");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-1.1381551E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1381551E11f) + "'", float2 == (-1.1381551E11f));
    }

    @Test
    public void test12164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12164");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.5346492E10f, 3.8603813E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.27900615E11f + "'", float2 == 1.27900615E11f);
    }

    @Test
    public void test12165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12165");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 4.514864E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.029728E7f + "'", float2 == 9.029728E7f);
    }

    @Test
    public void test12166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12166");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(400400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2515787.3969947062d + "'", double1 == 2515787.3969947062d);
    }

    @Test
    public void test12167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12167");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.999285E8f, (-1.9435362E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.8869127E13f) + "'", float2 == (-3.8869127E13f));
    }

    @Test
    public void test12168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12168");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.288335E11f, 3.3775132E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.64422E11f + "'", float2 == 4.64422E11f);
    }

    @Test
    public void test12169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12169");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-499928.0f), 7.311071E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4621143E10f + "'", float2 == 1.4621143E10f);
    }

    @Test
    public void test12170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12170");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.937865E16f, 9.208768E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3877572E17f + "'", float2 == 1.3877572E17f);
    }

    @Test
    public void test12171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12171");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-4.9427046E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.9427046E9f) + "'", float2 == (-4.9427046E9f));
    }

    @Test
    public void test12172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12172");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-8.180352E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test12173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12173");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 3.086478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12174");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-10608.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-66652.02973856105d) + "'", double1 == (-66652.02973856105d));
    }

    @Test
    public void test12175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12175");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0317879E11f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0635758E11f + "'", float2 == 2.0635758E11f);
    }

    @Test
    public void test12176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12176");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.05859E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.550087307597219E11d + "'", double1 == 2.550087307597219E11d);
    }

    @Test
    public void test12177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12177");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 394368.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.8253696E7f + "'", float2 == 3.8253696E7f);
    }

    @Test
    public void test12178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12178");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.3319424E7f, (-4.889421E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.114957E7f) + "'", float2 == (-7.114957E7f));
    }

    @Test
    public void test12179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12179");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 2.2206578E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2206579E16f + "'", float2 == 2.2206579E16f);
    }

    @Test
    public void test12180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12180");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 1.0561528E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0561528E11f) + "'", float2 == (-1.0561528E11f));
    }

    @Test
    public void test12181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12181");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.6718673E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9354207911107635E11d + "'", double1 == 2.9354207911107635E11d);
    }

    @Test
    public void test12182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12182");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.04E10f, 1.5333408E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.083067E10f + "'", float2 == 8.083067E10f);
    }

    @Test
    public void test12183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12183");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(328232.0f, 1.626432E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3185104E7f + "'", float2 == 3.3185104E7f);
    }

    @Test
    public void test12184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12184");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-6.194835E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.1948355E9f) + "'", float2 == (-6.1948355E9f));
    }

    @Test
    public void test12185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12185");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(40398.0f, (-1.8940365E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.787265E8f) + "'", float2 == (-3.787265E8f));
    }

    @Test
    public void test12186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12186");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 2.9589168E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9589168E10f + "'", float2 == 2.9589168E10f);
    }

    @Test
    public void test12187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12187");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.35382516E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.506334335706478E11d + "'", double1 == 8.506334335706478E11d);
    }

    @Test
    public void test12188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12188");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.929769E11f, 3516.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.859538E11f + "'", float2 == 3.859538E11f);
    }

    @Test
    public void test12189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12189");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.4743044E11f, 1.1976749E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.3439588E11f + "'", float2 == 5.3439588E11f);
    }

    @Test
    public void test12190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12190");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.65133E12f, 5.502614E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3136653E12f + "'", float2 == 3.3136653E12f);
    }

    @Test
    public void test12191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12191");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.3350672E7f), (-1.7289144E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.460499E10f) + "'", float2 == (-3.460499E10f));
    }

    @Test
    public void test12192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12192");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 388800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-388800.0f) + "'", float2 == (-388800.0f));
    }

    @Test
    public void test12193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12193");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4534768.0f, (-38784.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8991968.0f + "'", float2 == 8991968.0f);
    }

    @Test
    public void test12194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12194");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.904467E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4532490943404618E8d + "'", double1 == 2.4532490943404618E8d);
    }

    @Test
    public void test12195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12195");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 9.6220555E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3677193E15f + "'", float2 == 3.3677193E15f);
    }

    @Test
    public void test12196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12196");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-3.2629696E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.2629696E9f) + "'", float2 == (-3.2629696E9f));
    }

    @Test
    public void test12197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12197");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.3312516E11f, (-1.2396539E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.4126828E13f) + "'", float2 == (-2.4126828E13f));
    }

    @Test
    public void test12198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12198");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.426656E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.781349993913836E8d + "'", double1 == 2.781349993913836E8d);
    }

    @Test
    public void test12199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12199");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 3.177109E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.177109E12f + "'", float2 == 3.177109E12f);
    }

    @Test
    public void test12200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12200");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.328347E9f, (-6601680.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6643491E10f + "'", float2 == 1.6643491E10f);
    }

    @Test
    public void test12201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12201");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.6318313E14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.910265444370246E15d + "'", double1 == 2.910265444370246E15d);
    }

    @Test
    public void test12202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12202");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 854920.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 854920.0f + "'", float2 == 854920.0f);
    }

    @Test
    public void test12203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12203");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.5212749E11f, (-7.935999E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2829448E12f) + "'", float2 == (-1.2829448E12f));
    }

    @Test
    public void test12204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12204");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.899907E7f, (-2438368.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.531214E8f + "'", float2 == 1.531214E8f);
    }

    @Test
    public void test12205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12205");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.3869727E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.756416223570877E10d + "'", double1 == 2.756416223570877E10d);
    }

    @Test
    public void test12206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12206");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 4.9639085E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.9639085E14f + "'", float2 == 4.9639085E14f);
    }

    @Test
    public void test12207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12207");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 6.231373E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.044432E11f + "'", float2 == 6.044432E11f);
    }

    @Test
    public void test12208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12208");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.948969E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7378474362339425E9d + "'", double1 == 3.7378474362339425E9d);
    }

    @Test
    public void test12209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12209");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.238967E11f), 3.5052416E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.477233E11f) + "'", float2 == (-2.477233E11f));
    }

    @Test
    public void test12210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12210");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 9.0872454E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.0872454E8f) + "'", float2 == (-9.0872454E8f));
    }

    @Test
    public void test12211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12211");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 1.247272E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.247272E7f + "'", float2 == 1.247272E7f);
    }

    @Test
    public void test12212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12212");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-9.799848E8f), (-4.9722467E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.946453E12f) + "'", float2 == (-9.946453E12f));
    }

    @Test
    public void test12213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12213");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6479200.0f, 8.045145E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6103249E10f + "'", float2 == 1.6103249E10f);
    }

    @Test
    public void test12214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12214");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.007486E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7746148270941887E9d + "'", double1 == 3.7746148270941887E9d);
    }

    @Test
    public void test12215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12215");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.8374016E8f), 6.364507E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.9457894E8f) + "'", float2 == (-4.9457894E8f));
    }

    @Test
    public void test12216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12216");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.801203E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.529959063174196E10d + "'", double1 == 5.529959063174196E10d);
    }

    @Test
    public void test12217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12217");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.1249609E11f, (-2.1162783E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2075963E11f + "'", float2 == 4.2075963E11f);
    }

    @Test
    public void test12218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12218");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.563985E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.610999359038171E13d + "'", double1 == 1.610999359038171E13d);
    }

    @Test
    public void test12219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12219");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 5.598887E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9596105E12f + "'", float2 == 1.9596105E12f);
    }

    @Test
    public void test12220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12220");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3200.0f + "'", float2 == 3200.0f);
    }

    @Test
    public void test12221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12221");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.929769E9f, 3.549901E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.930536E9f + "'", float2 == 3.930536E9f);
    }

    @Test
    public void test12222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12222");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 1.6189455E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6189455E12f + "'", float2 == 1.6189455E12f);
    }

    @Test
    public void test12223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12223");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1.06284E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.06284E11f + "'", float2 == 1.06284E11f);
    }

    @Test
    public void test12224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12224");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 3.5115686E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5115686E12f + "'", float2 == 3.5115686E12f);
    }

    @Test
    public void test12225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12225");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(543040.0f, (-7.356879E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.471365E11f) + "'", float2 == (-1.471365E11f));
    }

    @Test
    public void test12226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12226");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.8431127E15f, (-1528.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.6862255E15f + "'", float2 == 3.6862255E15f);
    }

    @Test
    public void test12227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12227");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-6953800.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.369201398906541E7d) + "'", double1 == (-4.369201398906541E7d));
    }

    @Test
    public void test12228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12228");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0179327E13f, (-1.8282912E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.035829E13f + "'", float2 == 2.035829E13f);
    }

    @Test
    public void test12229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12229");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-5.913048E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.913048E9f) + "'", float2 == (-5.913048E9f));
    }

    @Test
    public void test12230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12230");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-9.986745E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.274857032516859E11d) + "'", double1 == (-6.274857032516859E11d));
    }

    @Test
    public void test12231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12231");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-4.9599635E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.7359873E12f) + "'", float2 == (-1.7359873E12f));
    }

    @Test
    public void test12232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12232");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-8.672394E17f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.672394E19f) + "'", float2 == (-8.672394E19f));
    }

    @Test
    public void test12233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12233");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.14389E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.745275479581152E10d + "'", double1 == 5.745275479581152E10d);
    }

    @Test
    public void test12234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12234");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.9922636E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8800946545984943E11d) + "'", double1 == (-1.8800946545984943E11d));
    }

    @Test
    public void test12235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12235");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.5201876E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5834806001249079E10d + "'", double1 == 1.5834806001249079E10d);
    }

    @Test
    public void test12236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12236");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1091432.0f), (-6.450307E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2900832E11f) + "'", float2 == (-1.2900832E11f));
    }

    @Test
    public void test12237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12237");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.8048015E9f, (-3.8103048E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0110065E9f) + "'", float2 == (-2.0110065E9f));
    }

    @Test
    public void test12238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12238");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-5.3522128E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test12239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12239");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.0687857E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2998563662012637E13d + "'", double1 == 1.2998563662012637E13d);
    }

    @Test
    public void test12240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12240");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 4.288937E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.501128E12f + "'", float2 == 1.501128E12f);
    }

    @Test
    public void test12241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12241");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.356073E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7370014262672465E13d + "'", double1 == 2.7370014262672465E13d);
    }

    @Test
    public void test12242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12242");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.5020262E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12243");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7997632.0f), 1.328736E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.6573121E11f + "'", float2 == 2.6573121E11f);
    }

    @Test
    public void test12244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12244");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1181460.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7423332.113020394d + "'", double1 == 7423332.113020394d);
    }

    @Test
    public void test12245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12245");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 8.9346024E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.9346024E14f) + "'", float2 == (-8.9346024E14f));
    }

    @Test
    public void test12246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12246");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6753517E9f, 1.6516372E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.383736E9f + "'", float2 == 3.383736E9f);
    }

    @Test
    public void test12247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12247");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 1.057184E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.114368E8f + "'", float2 == 2.114368E8f);
    }

    @Test
    public void test12248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12248");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.257224E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0465741898567947E11d) + "'", double1 == (-2.0465741898567947E11d));
    }

    @Test
    public void test12249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12249");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2577920.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6197549067084398E7d + "'", double1 == 1.6197549067084398E7d);
    }

    @Test
    public void test12250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12250");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 9160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12251");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-167602.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1676020.0f) + "'", float2 == (-1676020.0f));
    }

    @Test
    public void test12252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12252");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.6213166E9f, 3.4316914E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.9958094E11f + "'", float2 == 6.9958094E11f);
    }

    @Test
    public void test12253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12253");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.0245465E14f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4049093E15f + "'", float2 == 1.4049093E15f);
    }

    @Test
    public void test12254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12254");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.5742505E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.502404881500572E11d + "'", double1 == 3.502404881500572E11d);
    }

    @Test
    public void test12255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12255");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-7.617122E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.785978772649184E10d) + "'", double1 == (-4.785978772649184E10d));
    }

    @Test
    public void test12256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12256");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-7.296693E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4593386E10f) + "'", float2 == (-1.4593386E10f));
    }

    @Test
    public void test12257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12257");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3104.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-19503.007193485435d) + "'", double1 == (-19503.007193485435d));
    }

    @Test
    public void test12258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12258");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 1.0330112E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.371658E9f + "'", float2 == 5.371658E9f);
    }

    @Test
    public void test12259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12259");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.5433947E13f), 3.0871875E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0867278E13f) + "'", float2 == (-3.0867278E13f));
    }

    @Test
    public void test12260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12260");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 9.72584E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0574367E9f + "'", float2 == 5.0574367E9f);
    }

    @Test
    public void test12261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12261");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 7.075487E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.075487E7f + "'", float2 == 7.075487E7f);
    }

    @Test
    public void test12262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12262");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(852.0f, (-38784.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-75864.0f) + "'", float2 == (-75864.0f));
    }

    @Test
    public void test12263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12263");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-4.231553E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.463106E9f) + "'", float2 == (-8.463106E9f));
    }

    @Test
    public void test12264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12264");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-3.2255992E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2255992E7f + "'", float2 == 3.2255992E7f);
    }

    @Test
    public void test12265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12265");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 3.6565824E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.6565824E8f + "'", float2 == 3.6565824E8f);
    }

    @Test
    public void test12266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12266");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.6744634E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.937051950250132E9d) + "'", double1 == (-2.937051950250132E9d));
    }

    @Test
    public void test12267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12267");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1.6205367E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test12268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12268");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(340936.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2142164.0658885795d + "'", double1 == 2142164.0658885795d);
    }

    @Test
    public void test12269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12269");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6949177E10f, (-1.1177504E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3875999E10f + "'", float2 == 3.3875999E10f);
    }

    @Test
    public void test12270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12270");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.617122E9f), 8.663018E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5802612E11f + "'", float2 == 1.5802612E11f);
    }

    @Test
    public void test12271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12271");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.5647E8f, 6.7619195E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4436779E10f + "'", float2 == 1.4436779E10f);
    }

    @Test
    public void test12272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12272");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 8.058241E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.816494E11f + "'", float2 == 7.816494E11f);
    }

    @Test
    public void test12273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12273");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5.146266E12f, 3.5867365E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1009879E13f + "'", float2 == 1.1009879E13f);
    }

    @Test
    public void test12274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12274");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-631208.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.31208E7f) + "'", float2 == (-6.31208E7f));
    }

    @Test
    public void test12275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12275");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 3.113712E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12276");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(708384.0f, 4.173518E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.361204E8f + "'", float2 == 8.361204E8f);
    }

    @Test
    public void test12277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12277");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 5.7264087E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.7264087E10f + "'", float2 == 5.7264087E10f);
    }

    @Test
    public void test12278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12278");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 9.558119E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12279");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 9.600058E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12280");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1152000.0f, 1024000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4352000.0f + "'", float2 == 4352000.0f);
    }

    @Test
    public void test12281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12281");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0865284E9f, 1.5611576E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.2953723E9f + "'", float2 == 5.2953723E9f);
    }

    @Test
    public void test12282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12282");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.0139899E12f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.371086443118056E12d) + "'", double1 == (-6.371086443118056E12d));
    }

    @Test
    public void test12283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12283");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.3504601E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.485191113544305E10d) + "'", double1 == (-8.485191113544305E10d));
    }

    @Test
    public void test12284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12284");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 3.2704924E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.540985E7f + "'", float2 == 6.540985E7f);
    }

    @Test
    public void test12285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12285");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.408817E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3984600458667334E11d + "'", double1 == 3.3984600458667334E11d);
    }

    @Test
    public void test12286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12286");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 4.691455E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.691455E9f + "'", float2 == 4.691455E9f);
    }

    @Test
    public void test12287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12287");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 7.484328E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12288");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.0744178E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3033951230796776E11d) + "'", double1 == (-1.3033951230796776E11d));
    }

    @Test
    public void test12289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12289");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 6.294067E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12290");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.7145117E8f), 4.71872E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0084166E8f + "'", float2 == 4.0084166E8f);
    }

    @Test
    public void test12291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12291");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1.2604422E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2604422E12f + "'", float2 == 1.2604422E12f);
    }

    @Test
    public void test12292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12292");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.3196342E9f), (-3587616.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.6464435E9f) + "'", float2 == (-6.6464435E9f));
    }

    @Test
    public void test12293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12293");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.4794644E11f, 7.980555E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.311854E12f + "'", float2 == 1.311854E12f);
    }

    @Test
    public void test12294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12294");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.171351E10f, 1.2409407E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.824583E10f + "'", float2 == 8.824583E10f);
    }

    @Test
    public void test12295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12295");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2778352.0f, 2.9535533E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9076624E10f + "'", float2 == 5.9076624E10f);
    }

    @Test
    public void test12296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12296");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 3.4410044E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.882009E11f + "'", float2 == 6.882009E11f);
    }

    @Test
    public void test12297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12297");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1.5078023E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.277308E11f + "'", float2 == 5.277308E11f);
    }

    @Test
    public void test12298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12298");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.6868317E12f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.373663E12f) + "'", float2 == (-9.373663E12f));
    }

    @Test
    public void test12299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12299");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.064438E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2971246931413264E12d + "'", double1 == 1.2971246931413264E12d);
    }

    @Test
    public void test12300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12300");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1446400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9087999.228304554d + "'", double1 == 9087999.228304554d);
    }

    @Test
    public void test12301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12301");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-2.4044E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.4044E7f) + "'", float2 == (-2.4044E7f));
    }

    @Test
    public void test12302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12302");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.8985292E9f), (-4.2704813E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.6511544E9f) + "'", float2 == (-4.6511544E9f));
    }

    @Test
    public void test12303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12303");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 8.860154E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.860154E9f) + "'", float2 == (-8.860154E9f));
    }

    @Test
    public void test12304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12304");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 178000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-178000.0f) + "'", float2 == (-178000.0f));
    }

    @Test
    public void test12305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12305");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.8360169E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1536034165925291E13d + "'", double1 == 1.1536034165925291E13d);
    }

    @Test
    public void test12306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12306");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.5682417E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6136738288531252E10d + "'", double1 == 1.6136738288531252E10d);
    }

    @Test
    public void test12307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12307");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.4001364E9f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.800273E9f) + "'", float2 == (-2.800273E9f));
    }

    @Test
    public void test12308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12308");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.5755772E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12309");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-3.3953797E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.2935182E11f) + "'", float2 == (-3.2935182E11f));
    }

    @Test
    public void test12310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12310");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 3318320.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3318320.0f) + "'", float2 == (-3318320.0f));
    }

    @Test
    public void test12311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12311");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 1.498967E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12312");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 9.105235E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.105235E11f + "'", float2 == 9.105235E11f);
    }

    @Test
    public void test12313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12313");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-9.0872454E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.70968470313427E9d) + "'", double1 == (-5.70968470313427E9d));
    }

    @Test
    public void test12314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12314");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.4831612E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.560216196719843E8d) + "'", double1 == (-1.560216196719843E8d));
    }

    @Test
    public void test12315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12315");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-3.468954E14f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.468954E15f) + "'", float2 == (-3.468954E15f));
    }

    @Test
    public void test12316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12316");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.8334458E8f, (-3960020.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.587691E8f + "'", float2 == 5.587691E8f);
    }

    @Test
    public void test12317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12317");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-4.9558366E15f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5858677E17f) + "'", float2 == (-1.5858677E17f));
    }

    @Test
    public void test12318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12318");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 2.48459E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.48459E13f + "'", float2 == 2.48459E13f);
    }

    @Test
    public void test12319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12319");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.2551846E8f, 1297160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4536312E9f + "'", float2 == 1.4536312E9f);
    }

    @Test
    public void test12320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12320");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.5697465E13f), 1.5244576E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.13949E13f) + "'", float2 == (-7.13949E13f));
    }

    @Test
    public void test12321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12321");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.193269E13f), 3.5904907E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.66844E13f) + "'", float2 == (-3.66844E13f));
    }

    @Test
    public void test12322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12322");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.693184E10f, 8.0898376E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5566043E11f + "'", float2 == 3.5566043E11f);
    }

    @Test
    public void test12323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12323");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 2.1285071E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.1285072E11f + "'", float2 == 2.1285072E11f);
    }

    @Test
    public void test12324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12324");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 1.8431831E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.8431831E15f) + "'", float2 == (-1.8431831E15f));
    }

    @Test
    public void test12325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12325");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.598887E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.517884526883484E11d + "'", double1 == 3.517884526883484E11d);
    }

    @Test
    public void test12326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12326");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 2.2720563E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1814693E13f + "'", float2 == 1.1814693E13f);
    }

    @Test
    public void test12327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12327");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.2707592E12f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4267600987955957E13d) + "'", double1 == (-1.4267600987955957E13d));
    }

    @Test
    public void test12328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12328");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.016E7f, 1.7194771E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.8421542E8f + "'", float2 == 3.8421542E8f);
    }

    @Test
    public void test12329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12329");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 1.4411507E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4411507E11f + "'", float2 == 1.4411507E11f);
    }

    @Test
    public void test12330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12330");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.309758E9f), 9.137452E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6812953E11f + "'", float2 == 1.6812953E11f);
    }

    @Test
    public void test12331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12331");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.2389612E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.784622763771964E11d) + "'", double1 == (-7.784622763771964E11d));
    }

    @Test
    public void test12332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12332");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-1.5510584E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.963387E8f) + "'", float2 == (-4.963387E8f));
    }

    @Test
    public void test12333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12333");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.1983283E8f, 2.873412E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.747264E12f + "'", float2 == 5.747264E12f);
    }

    @Test
    public void test12334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12334");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.653677E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.180628430848169E8d + "'", double1 == 4.180628430848169E8d);
    }

    @Test
    public void test12335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12335");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.6090848E8f, (-2.1766064E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.301031E10f) + "'", float2 == (-4.301031E10f));
    }

    @Test
    public void test12336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12336");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-7.3689976E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.630077745700411E12d) + "'", double1 == (-4.630077745700411E12d));
    }

    @Test
    public void test12337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12337");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(220.0f, (-1.3657215E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.731443E10f) + "'", float2 == (-2.731443E10f));
    }

    @Test
    public void test12338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12338");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.751075E8f), 5.7613094E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.9795315E8f) + "'", float2 == (-3.9795315E8f));
    }

    @Test
    public void test12339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12339");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.4720415E12f, (-5.3666928E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9430097E12f + "'", float2 == 2.9430097E12f);
    }

    @Test
    public void test12340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12340");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3660112.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.299716194103169E7d + "'", double1 == 2.299716194103169E7d);
    }

    @Test
    public void test12341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12341");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.6880585E10f), 1.6694489E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.037219E10f) + "'", float2 == (-4.037219E10f));
    }

    @Test
    public void test12342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12342");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(958056.0f, 2.5028224E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0248058E8f + "'", float2 == 5.0248058E8f);
    }

    @Test
    public void test12343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12343");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-382300.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-764600.0f) + "'", float2 == (-764600.0f));
    }

    @Test
    public void test12344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12344");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.9618E8f, 8.456473E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6913044E14f + "'", float2 == 1.6913044E14f);
    }

    @Test
    public void test12345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12345");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-8019600.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.038863288945741E7d) + "'", double1 == (-5.038863288945741E7d));
    }

    @Test
    public void test12346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12346");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.758E10f, 9.600058E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.4360113E10f + "'", float2 == 5.4360113E10f);
    }

    @Test
    public void test12347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12347");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.8386622E10f, 6717120.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.678668E10f + "'", float2 == 7.678668E10f);
    }

    @Test
    public void test12348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12348");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 2.6421225E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.6421224E15f + "'", float2 == 2.6421224E15f);
    }

    @Test
    public void test12349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12349");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.1423415E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12350");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.231E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.658415640736361E12d + "'", double1 == 2.658415640736361E12d);
    }

    @Test
    public void test12351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12351");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.4781824E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.955317639444815E9d + "'", double1 == 5.955317639444815E9d);
    }

    @Test
    public void test12352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12352");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-1.4150975E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4150975E9f + "'", float2 == 1.4150975E9f);
    }

    @Test
    public void test12353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12353");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-2.189816E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test12354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12354");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5408.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33979.4661412272d + "'", double1 == 33979.4661412272d);
    }

    @Test
    public void test12355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12355");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6238087E11f, 1.6159304E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2479406E11f + "'", float2 == 3.2479406E11f);
    }

    @Test
    public void test12356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12356");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-4.3576E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.394432E9f) + "'", float2 == (-1.394432E9f));
    }

    @Test
    public void test12357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12357");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-9.668521E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.378465E14f) + "'", float2 == (-9.378465E14f));
    }

    @Test
    public void test12358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12358");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 3.223806E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12359");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.2406032E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12360");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.5897155E8f, (-4.953552E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.38916E9f) + "'", float2 == (-9.38916E9f));
    }

    @Test
    public void test12361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12361");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-4.281608E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.281608E10f) + "'", float2 == (-4.281608E10f));
    }

    @Test
    public void test12362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12362");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.8248416E12f, (-1.75464E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.649332E12f + "'", float2 == 9.649332E12f);
    }

    @Test
    public void test12363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12363");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-794560.0f), (-5.1885737E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.037715E13f) + "'", float2 == (-1.037715E13f));
    }

    @Test
    public void test12364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12364");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1.4508607E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4508607E11f + "'", float2 == 1.4508607E11f);
    }

    @Test
    public void test12365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12365");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.8534656E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7928853261142017E12d) + "'", double1 == (-1.7928853261142017E12d));
    }

    @Test
    public void test12366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12366");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 3100672.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3100672.0f) + "'", float2 == (-3100672.0f));
    }

    @Test
    public void test12367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12367");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.0717164E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.186653366506885E10d + "'", double1 == 3.186653366506885E10d);
    }

    @Test
    public void test12368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12368");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.1522627E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.237262101890927E10d + "'", double1 == 3.237262101890927E10d);
    }

    @Test
    public void test12369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12369");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.1128E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.991928609829444E7d + "'", double1 == 6.991928609829444E7d);
    }

    @Test
    public void test12370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12370");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1136.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2472.0f + "'", float2 == 2472.0f);
    }

    @Test
    public void test12371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12371");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.5349838E8f, (-867368.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.05262E8f + "'", float2 == 5.05262E8f);
    }

    @Test
    public void test12372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12372");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4040.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25384.068641005528d + "'", double1 == 25384.068641005528d);
    }

    @Test
    public void test12373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12373");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.064438E11f, 1.6568216E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.1321896E11f + "'", float2 == 4.1321896E11f);
    }

    @Test
    public void test12374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12374");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 2543928.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12375");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-4.0480688E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.0480687E15f) + "'", float2 == (-4.0480687E15f));
    }

    @Test
    public void test12376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12376");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.920168E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.348069942888501E11d + "'", double1 == 4.348069942888501E11d);
    }

    @Test
    public void test12377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12377");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.668062E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12378");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.929769E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.212509597572323E11d) + "'", double1 == (-1.212509597572323E11d));
    }

    @Test
    public void test12379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12379");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.146272E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6051795309970117E8d + "'", double1 == 2.6051795309970117E8d);
    }

    @Test
    public void test12380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12380");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.567484E12f), (-1.620881E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.13821E12f) + "'", float2 == (-9.13821E12f));
    }

    @Test
    public void test12381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12381");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1.5909384E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5909384E15f + "'", float2 == 1.5909384E15f);
    }

    @Test
    public void test12382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12382");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-9311776.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test12383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12383");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.3955462E11f), (-1.5333408E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.8217593E11f) + "'", float2 == (-2.8217593E11f));
    }

    @Test
    public void test12384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12384");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-3885360.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.88536E7f) + "'", float2 == (-3.88536E7f));
    }

    @Test
    public void test12385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12385");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.064222E9f, 1.4909276E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.11103E10f + "'", float2 == 1.11103E10f);
    }

    @Test
    public void test12386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12386");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 2072800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2072800.0f + "'", float2 == 2072800.0f);
    }

    @Test
    public void test12387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12387");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.3114987E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.080675991727103E12d) + "'", double1 == (-2.080675991727103E12d));
    }

    @Test
    public void test12388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12388");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.1997202E12f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.538064553328306E12d) + "'", double1 == (-7.538064553328306E12d));
    }

    @Test
    public void test12389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12389");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6002936E9f, 3.946497E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9898867E9f + "'", float2 == 3.9898867E9f);
    }

    @Test
    public void test12390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12390");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.1022988E9f), 1.5725456E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.1731466E9f) + "'", float2 == (-2.1731466E9f));
    }

    @Test
    public void test12391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12391");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.7587703E12f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.9900235544957645E13d) + "'", double1 == (-2.9900235544957645E13d));
    }

    @Test
    public void test12392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12392");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 9.600058E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.600058E9f + "'", float2 == 9.600058E9f);
    }

    @Test
    public void test12393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12393");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.9222084E10f, 4.6718673E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7188151E11f + "'", float2 == 1.7188151E11f);
    }

    @Test
    public void test12394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12394");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.6508563E11f, 2.0943795E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.3436003E11f + "'", float2 == 5.3436003E11f);
    }

    @Test
    public void test12395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12395");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.8397984E10f, 1.8388255E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3357248E11f + "'", float2 == 1.3357248E11f);
    }

    @Test
    public void test12396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12396");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.7840938E11f), 2.4087728E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.761864E13f + "'", float2 == 4.761864E13f);
    }

    @Test
    public void test12397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12397");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.0435128E9f, 1.0905773E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.305141E9f + "'", float2 == 4.305141E9f);
    }

    @Test
    public void test12398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12398");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-8914400.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.9144E7f) + "'", float2 == (-8.9144E7f));
    }

    @Test
    public void test12399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12399");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.1028448E8f, 7.113452E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4308961E11f + "'", float2 == 1.4308961E11f);
    }

    @Test
    public void test12400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12400");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.793492E8f, (-1.1422145E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.278842E11f) + "'", float2 == (-2.278842E11f));
    }

    @Test
    public void test12401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12401");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7521520.0f, 1.321324E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.642663E12f + "'", float2 == 2.642663E12f);
    }

    @Test
    public void test12402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12402");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.647572E10f, (-3.468953E14f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.937177E14f) + "'", float2 == (-6.937177E14f));
    }

    @Test
    public void test12403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12403");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.181256E8f), (-2.8217593E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.6478813E11f) + "'", float2 == (-5.6478813E11f));
    }

    @Test
    public void test12404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12404");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-168388.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 168388.0f + "'", float2 == 168388.0f);
    }

    @Test
    public void test12405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12405");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-8386528.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8386528.0f) + "'", float2 == (-8386528.0f));
    }

    @Test
    public void test12406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12406");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-76840.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-768400.0f) + "'", float2 == (-768400.0f));
    }

    @Test
    public void test12407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12407");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 8.6723937E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.672394E17f + "'", float2 == 8.672394E17f);
    }

    @Test
    public void test12408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12408");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 480880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 480880.0f + "'", float2 == 480880.0f);
    }

    @Test
    public void test12409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12409");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.9589168E10f, (-1.19237335E14f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.384155E14f) + "'", float2 == (-2.384155E14f));
    }

    @Test
    public void test12410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12410");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.440179E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.046483932504358E8d + "'", double1 == 4.046483932504358E8d);
    }

    @Test
    public void test12411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12411");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.624339E7f, (-1.1546898E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.216893E9f) + "'", float2 == (-2.216893E9f));
    }

    @Test
    public void test12412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12412");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.6139924E12f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0141013506492777E13d) + "'", double1 == (-1.0141013506492777E13d));
    }

    @Test
    public void test12413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12413");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.0561528E11f), 1.5756785E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.080792E11f) + "'", float2 == (-2.080792E11f));
    }

    @Test
    public void test12414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12414");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-4.874811E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.7285667E14f) + "'", float2 == (-4.7285667E14f));
    }

    @Test
    public void test12415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12415");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 8.981531E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12416");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 2.7337984E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12417");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.6669064E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5606223278958755E12d + "'", double1 == 3.5606223278958755E12d);
    }

    @Test
    public void test12418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12418");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.9558886E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.857239555778851E14d + "'", double1 == 1.857239555778851E14d);
    }

    @Test
    public void test12419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12419");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8179040.0f, 3.257566E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.515148E12f + "'", float2 == 6.515148E12f);
    }

    @Test
    public void test12420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12420");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 1.0317879E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0317879E13f + "'", float2 == 1.0317879E13f);
    }

    @Test
    public void test12421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12421");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.3361812E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.395474385162483E9d) + "'", double1 == (-8.395474385162483E9d));
    }

    @Test
    public void test12422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12422");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 8.022064E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.022064E10f + "'", float2 == 8.022064E10f);
    }

    @Test
    public void test12423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12423");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.4E7f, 2.839969E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.807938E9f + "'", float2 == 5.807938E9f);
    }

    @Test
    public void test12424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12424");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.17848E8f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.35696E8f) + "'", float2 == (-6.35696E8f));
    }

    @Test
    public void test12425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12425");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.022064E7f, (-8.422425E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5240438E9f) + "'", float2 == (-1.5240438E9f));
    }

    @Test
    public void test12426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12426");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(81200.0f, 1.427312E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.856248E8f + "'", float2 == 2.856248E8f);
    }

    @Test
    public void test12427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12427");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 1.0502495E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0502495E12f + "'", float2 == 1.0502495E12f);
    }

    @Test
    public void test12428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12428");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.8607188E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.797442644070586E12d) + "'", double1 == (-1.797442644070586E12d));
    }

    @Test
    public void test12429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12429");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.7135275E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.076641053337952E13d + "'", double1 == 1.076641053337952E13d);
    }

    @Test
    public void test12430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12430");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 6.83728E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.83728E7f) + "'", float2 == (-6.83728E7f));
    }

    @Test
    public void test12431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12431");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-1.5041409E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5041408E14f) + "'", float2 == (-1.5041408E14f));
    }

    @Test
    public void test12432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12432");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 6.267569E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0795417E13f + "'", float2 == 6.0795417E13f);
    }

    @Test
    public void test12433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12433");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.9600679E10f, (-357280.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9200645E10f + "'", float2 == 3.9200645E10f);
    }

    @Test
    public void test12434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12434");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(532400.0f, 1.03439276E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0687866E12f + "'", float2 == 2.0687866E12f);
    }

    @Test
    public void test12435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12435");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.852496E9f, 5.8208595E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0869164E10f + "'", float2 == 1.0869164E10f);
    }

    @Test
    public void test12436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12436");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1.1396162E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.13961615E11f + "'", float2 == 1.13961615E11f);
    }

    @Test
    public void test12437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12437");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.01477E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1508728183526756E14d + "'", double1 == 3.1508728183526756E14d);
    }

    @Test
    public void test12438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12438");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 1.0826304E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0826304E9f) + "'", float2 == (-1.0826304E9f));
    }

    @Test
    public void test12439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12439");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-6.6464435E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3292887E10f) + "'", float2 == (-1.3292887E10f));
    }

    @Test
    public void test12440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12440");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.0662682E9f, 1.3508743E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7025618E13f + "'", float2 == 2.7025618E13f);
    }

    @Test
    public void test12441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12441");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 5.9463893E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9463896E12f + "'", float2 == 5.9463896E12f);
    }

    @Test
    public void test12442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12442");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.0029316E15f, 6.7671997E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0058766E15f + "'", float2 == 6.0058766E15f);
    }

    @Test
    public void test12443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12443");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 4.6994052E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6447919E16f + "'", float2 == 1.6447919E16f);
    }

    @Test
    public void test12444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12444");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.36364E11f, (-9.934088E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5285982E11f + "'", float2 == 4.5285982E11f);
    }

    @Test
    public void test12445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12445");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 633112.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 633112.0f + "'", float2 == 633112.0f);
    }

    @Test
    public void test12446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12446");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.0404778E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.537514712409735E12d + "'", double1 == 6.537514712409735E12d);
    }

    @Test
    public void test12447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12447");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-394.0f), 3.984824E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.969648E10f + "'", float2 == 7.969648E10f);
    }

    @Test
    public void test12448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12448");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 2.0981852E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0981853E13f + "'", float2 == 2.0981853E13f);
    }

    @Test
    public void test12449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12449");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.756115E10f, (-3.3399584E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.550555E11f + "'", float2 == 1.550555E11f);
    }

    @Test
    public void test12450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12450");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.8034304E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9030399234878525E10d + "'", double1 == 4.9030399234878525E10d);
    }

    @Test
    public void test12451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12451");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.912595E8f), 1.992412E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.826572E10f + "'", float2 == 3.826572E10f);
    }

    @Test
    public void test12452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12452");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1044480.0f, 3.2704224E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.5617344E8f + "'", float2 == 6.5617344E8f);
    }

    @Test
    public void test12453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12453");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 8.348683E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.348683E7f) + "'", float2 == (-8.348683E7f));
    }

    @Test
    public void test12454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12454");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.1078835E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3244222762109987E11d + "'", double1 == 1.3244222762109987E11d);
    }

    @Test
    public void test12455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12455");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.087628E10f), 2.97184E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.1693125E10f) + "'", float2 == (-6.1693125E10f));
    }

    @Test
    public void test12456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12456");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-161408.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-161408.0f) + "'", float2 == (-161408.0f));
    }

    @Test
    public void test12457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12457");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.3758392E7f), (-2.7888886E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.625294E9f) + "'", float2 == (-5.625294E9f));
    }

    @Test
    public void test12458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12458");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.966574E11f), 6.580636E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.9318317E11f) + "'", float2 == (-3.9318317E11f));
    }

    @Test
    public void test12459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12459");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 2.189816E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.007411E8f + "'", float2 == 7.007411E8f);
    }

    @Test
    public void test12460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12460");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.2277826E8f, (-7997632.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2956125E8f + "'", float2 == 4.2956125E8f);
    }

    @Test
    public void test12461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12461");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-4.518295E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.518295E12f) + "'", float2 == (-4.518295E12f));
    }

    @Test
    public void test12462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12462");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.20672E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0148415988238922E10d) + "'", double1 == (-2.0148415988238922E10d));
    }

    @Test
    public void test12463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12463");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.9871728E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12464");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-572.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-18304.0f) + "'", float2 == (-18304.0f));
    }

    @Test
    public void test12465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12465");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.8161357E10f, 3.5765436E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0785359E11f + "'", float2 == 1.0785359E11f);
    }

    @Test
    public void test12466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12466");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 8.0067936E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0067936E8f + "'", float2 == 8.0067936E8f);
    }

    @Test
    public void test12467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12467");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 4.814856E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.814856E8f) + "'", float2 == (-4.814856E8f));
    }

    @Test
    public void test12468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12468");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.0f + "'", float2 == 20.0f);
    }

    @Test
    public void test12469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12469");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.12825E9f, (-1.1228236E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.010853E9f + "'", float2 == 4.010853E9f);
    }

    @Test
    public void test12470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12470");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 6.094267E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.094267E11f) + "'", float2 == (-6.094267E11f));
    }

    @Test
    public void test12471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12471");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.9922636E10f, 4.946388E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.9738045E10f + "'", float2 == 6.9738045E10f);
    }

    @Test
    public void test12472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12472");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3200.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20106.192982974677d + "'", double1 == 20106.192982974677d);
    }

    @Test
    public void test12473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12473");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-6.1677635E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.8753200724898384E10d) + "'", double1 == (-3.8753200724898384E10d));
    }

    @Test
    public void test12474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12474");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.52982E7f, (-2.5754718E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.44498E8f) + "'", float2 == (-4.44498E8f));
    }

    @Test
    public void test12475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12475");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.6653878E8f, 20.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.330776E8f + "'", float2 == 7.330776E8f);
    }

    @Test
    public void test12476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12476");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.915773E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0886712234640774E10d) + "'", double1 == (-3.0886712234640774E10d));
    }

    @Test
    public void test12477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12477");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-2290368.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2290368.0f) + "'", float2 == (-2290368.0f));
    }

    @Test
    public void test12478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12478");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-1.6243773E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.6853207E9f) + "'", float2 == (-5.6853207E9f));
    }

    @Test
    public void test12479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12479");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.1375713E12f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.2751426E12f + "'", float2 == 8.2751426E12f);
    }

    @Test
    public void test12480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12480");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.570082E9f, 2.5707322E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.156605E12f + "'", float2 == 5.156605E12f);
    }

    @Test
    public void test12481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12481");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5.684352E9f), 8.9349614E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7869809E15f + "'", float2 == 1.7869809E15f);
    }

    @Test
    public void test12482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12482");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.9513693E11f, 2.0853574E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.03198104E12f + "'", float2 == 1.03198104E12f);
    }

    @Test
    public void test12483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12483");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.2512256E11f, (-2.2324048E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5020047E11f + "'", float2 == 2.5020047E11f);
    }

    @Test
    public void test12484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12484");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.4689035E14f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1795763410711228E15d) + "'", double1 == (-2.1795763410711228E15d));
    }

    @Test
    public void test12485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12485");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 7.330776E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.330776E8f) + "'", float2 == (-7.330776E8f));
    }

    @Test
    public void test12486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12486");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.5250427E10f), 3.9200645E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.2099564E10f) + "'", float2 == (-5.2099564E10f));
    }

    @Test
    public void test12487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12487");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.0024E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2581450259096403E8d) + "'", double1 == (-1.2581450259096403E8d));
    }

    @Test
    public void test12488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12488");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.9473095E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.25007889787631E14d + "'", double1 == 6.25007889787631E14d);
    }

    @Test
    public void test12489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12489");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 266200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2662000.0f + "'", float2 == 2662000.0f);
    }

    @Test
    public void test12490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12490");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.752195E12f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.985892299958352E13d) + "'", double1 == (-2.985892299958352E13d));
    }

    @Test
    public void test12491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12491");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 1.6190858E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5705132E11f + "'", float2 == 1.5705132E11f);
    }

    @Test
    public void test12492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12492");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.180777E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6268596367666935E10d + "'", double1 == 2.6268596367666935E10d);
    }

    @Test
    public void test12493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12493");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-2.2249382E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2249382E10f + "'", float2 == 2.2249382E10f);
    }

    @Test
    public void test12494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12494");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-6.937177E14f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.9371766E16f) + "'", float2 == (-6.9371766E16f));
    }

    @Test
    public void test12495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12495");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.881689E15f, 1002200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.763378E15f + "'", float2 == 3.763378E15f);
    }

    @Test
    public void test12496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12496");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.4281984E9f, 2.7526156E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.790871E10f + "'", float2 == 6.790871E10f);
    }

    @Test
    public void test12497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12497");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.7624E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1073485785373303E8d) + "'", double1 == (-1.1073485785373303E8d));
    }

    @Test
    public void test12498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12498");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.00868555E11f, 3131304.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0174337E11f + "'", float2 == 2.0174337E11f);
    }

    @Test
    public void test12499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12499");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 9.637847E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.348712E11f + "'", float2 == 9.348712E11f);
    }

    @Test
    public void test12500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12500");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5.9972907E10f), (-8.837402E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.20122565E11f) + "'", float2 == (-1.20122565E11f));
    }
}

