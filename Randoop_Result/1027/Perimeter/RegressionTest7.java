package Perimeter;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 112000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3920000.0f + "'", float2 == 3920000.0f);
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.6360864E11f, (-3.3484096E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.271503E11f + "'", float2 == 9.271503E11f);
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-7.7570775E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.7570775E11f) + "'", float2 == (-7.7570775E11f));
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-5.356288E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.3654550062622333E9d) + "'", double1 == (-3.3654550062622333E9d));
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.4572013E8f), 1.6055068E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2080993E11f + "'", float2 == 3.2080993E11f);
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(104.0f, (-7.84375E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.568748E8f) + "'", float2 == (-1.568748E8f));
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1427312.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.427312E7f + "'", float2 == 1.427312E7f);
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.52982E7f, 6837000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.42704E7f + "'", float2 == 8.42704E7f);
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5.58082E7f), (-8.025089E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.7211818E8f) + "'", float2 == (-2.7211818E8f));
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.94E7f), 4.04558E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.70316E8f + "'", float2 == 7.70316E8f);
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5.0699926E8f, 2.837712E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5815409E9f + "'", float2 == 1.5815409E9f);
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3228160.0f, 8.266093E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6596749E9f + "'", float2 == 1.6596749E9f);
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (-6.1912954E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.1912953E10f) + "'", float2 == (-6.1912953E10f));
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.004E8f, 3.9593944E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6799878E9f + "'", float2 == 1.6799878E9f);
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.2900295E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.105494389974069E12d + "'", double1 == 8.105494389974069E12d);
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(672000.0f, 79760.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1503520.0f + "'", float2 == 1503520.0f);
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.82944E8f), 1.174171E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3306831E11f + "'", float2 == 2.3306831E11f);
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.137452E7f, 40040.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8282912E8f + "'", float2 == 1.8282912E8f);
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 2.4841652E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4841652E10f + "'", float2 == 2.4841652E10f);
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.5935496E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.257893804734108E8d) + "'", double1 == (-2.257893804734108E8d));
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1464504.0f), (-7.759605E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.581211E8f) + "'", float2 == (-1.581211E8f));
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-134144.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.114621E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.098566618389386E9d + "'", double1 == 5.098566618389386E9d);
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 5.0699926E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0139985E9f + "'", float2 == 1.0139985E9f);
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-9.543604E8f), (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9087208E9f) + "'", float2 == (-1.9087208E9f));
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1.4E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4E8f) + "'", float2 == (-1.4E8f));
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 33280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 66560.0f + "'", float2 == 66560.0f);
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 1.6553288E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6056689E11f + "'", float2 == 1.6056689E11f);
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.2837844E9f, 1.250288E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8176266E9f + "'", float2 == 4.8176266E9f);
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.7510068E7f, 35000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5090136E7f + "'", float2 == 3.5090136E7f);
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 9.6296966E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3703938E10f + "'", float2 == 3.3703938E10f);
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1400000.0f, 332536.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3465072.0f + "'", float2 == 3465072.0f);
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5.356288E8f), (-1.3012608E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0972828E9f) + "'", float2 == (-1.0972828E9f));
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 1.65133E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.65133E12f) + "'", float2 == (-1.65133E12f));
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.4287056E7f, 130192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8834496E7f + "'", float2 == 2.8834496E7f);
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-4.0349945E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.7525528E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1011614003016444E8d + "'", double1 == 1.1011614003016444E8d);
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.194835E8f), 2.4818475E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8397984E10f + "'", float2 == 4.8397984E10f);
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(389480.0f, 1.697976E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4037414E8f + "'", float2 == 3.4037414E8f);
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.590605E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.884362063042808E8d) + "'", double1 == (-2.884362063042808E8d));
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 476736.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.624339E7f + "'", float2 == 4.624339E7f);
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.1222256E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3334336708440381E8d + "'", double1 == 1.3334336708440381E8d);
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 6.5646856E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.564686E9f + "'", float2 == 6.564686E9f);
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-7.84375E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.8437504E8f) + "'", float2 == (-7.8437504E8f));
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.0589768E9f, 64000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.1180815E9f + "'", float2 == 8.1180815E9f);
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 1.6353052E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.2329767E10f + "'", float2 == 5.2329767E10f);
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.507316E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.71698570647932E12d + "'", double1 == 4.71698570647932E12d);
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.5387903E9f, (-10000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0775606E9f + "'", float2 == 3.0775606E9f);
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 2072800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.010616E8f + "'", float2 == 2.010616E8f);
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1000000.0f), 1370008.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 740016.0f + "'", float2 == 740016.0f);
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.7517197E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7289564598513096E12d) + "'", double1 == (-1.7289564598513096E12d));
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 81280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 81280.0f + "'", float2 == 81280.0f);
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3316.0f, 8543120.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7092872E7f + "'", float2 == 1.7092872E7f);
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.2531613E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.873844590277227E11d + "'", double1 == 7.873844590277227E11d);
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 8618400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8618400.0f) + "'", float2 == (-8618400.0f));
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 7.259798E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.2597976E11f + "'", float2 == 7.2597976E11f);
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1.2738432E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2738432E8f) + "'", float2 == (-1.2738432E8f));
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.888512E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8149056158011922E8d + "'", double1 == 1.8149056158011922E8d);
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.9374099E9f, (-4.85524E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.777715E9f + "'", float2 == 3.777715E9f);
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.6617801E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0441272282950682E10d + "'", double1 == 1.0441272282950682E10d);
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 6.617316E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.617316E11f + "'", float2 == 6.617316E11f);
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.8582523E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.167574347299445E10d + "'", double1 == 1.167574347299445E10d);
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8386904.0f, (-1.896608E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.6254778E8f) + "'", float2 == (-3.6254778E8f));
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6243773E8f, (-26740.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2482198E8f + "'", float2 == 3.2482198E8f);
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2184640.0f, (-1.5641128E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.6912976E7f) + "'", float2 == (-2.6912976E7f));
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.3628912E7f, (-10600.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7236624E7f + "'", float2 == 2.7236624E7f);
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-9065608.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.6960894986249715E7d) + "'", double1 == (-5.6960894986249715E7d));
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 2.7452624E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4275364E9f + "'", float2 == 1.4275364E9f);
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.250288E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.855791191342951E9d + "'", double1 == 7.855791191342951E9d);
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 52000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52000.0f + "'", float2 == 52000.0f);
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 5.2329767E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.232977E11f + "'", float2 == 5.232977E11f);
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 1.1518982E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1518982E14f) + "'", float2 == (-1.1518982E14f));
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.65133E11f), 8176524.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.3024963E11f) + "'", float2 == (-3.3024963E11f));
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-10.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 5.625056E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.6250565E10f + "'", float2 == 5.6250565E10f);
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.681064E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.94119925467673E8d) + "'", double1 == (-2.94119925467673E8d));
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.5971842E8f, 1.2230792E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4389843E8f + "'", float2 == 3.4389843E8f);
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 499928.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8493016E7f + "'", float2 == 4.8493016E7f);
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 4.376008E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4003225E12f + "'", float2 == 1.4003225E12f);
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1.1433238E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 68.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-68.0f) + "'", float2 == (-68.0f));
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-52000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3358560.0f, 21340.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6759800.0f + "'", float2 == 6759800.0f);
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-336058.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-672116.0f) + "'", float2 == (-672116.0f));
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-1.3529948E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.735482E14f) + "'", float2 == (-4.735482E14f));
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-20020.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-125789.36984973532d) + "'", double1 == (-125789.36984973532d));
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-1.6040736E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6040736E9f) + "'", float2 == (-1.6040736E9f));
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(33200.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 208601.75219836226d + "'", double1 == 208601.75219836226d);
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(200640.0f, 2.9725114E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.945063E10f + "'", float2 == 5.945063E10f);
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 4.8397984E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.516695E12f + "'", float2 == 2.516695E12f);
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-1.0840991E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 2016000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.9236803E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0936395441749424E10d + "'", double1 == 3.0936395441749424E10d);
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 8272320.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.895312E8f + "'", float2 == 2.895312E8f);
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-3.087628E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.087628E10f) + "'", float2 == (-3.087628E10f));
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 1.6799878E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6799878E9f + "'", float2 == 1.6799878E9f);
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5299488.0f, 80800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0760576E7f + "'", float2 == 1.0760576E7f);
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(140000.0f, 3.5377536E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.103507E7f + "'", float2 == 7.103507E7f);
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.4387866E9f, 4.0203034E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5681634E10f + "'", float2 == 1.5681634E10f);
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 3397160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7665232E8f + "'", float2 == 1.7665232E8f);
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.758E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.104583928747308E11d + "'", double1 == 1.104583928747308E11d);
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(66560.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 418208.81404587324d + "'", double1 == 418208.81404587324d);
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.0f), 7.716974E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5433948E11f + "'", float2 == 1.5433948E11f);
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-2.2866416E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.317253E9f) + "'", float2 == (-7.317253E9f));
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.4037414E8f, 40040.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.8082835E8f + "'", float2 == 6.8082835E8f);
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-5880980.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6951287127817005E7d) + "'", double1 == (-3.6951287127817005E7d));
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-200.0f), 1.9131254E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.826247E8f + "'", float2 == 3.826247E8f);
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 9.183922E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-6.3325504E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.3325504E8f) + "'", float2 == (-6.3325504E8f));
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 43680.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 436800.0f + "'", float2 == 436800.0f);
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.7196515E10f), 1.1199168E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.4370634E10f) + "'", float2 == (-3.4370634E10f));
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 19200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 192000.0f + "'", float2 == 192000.0f);
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-2.7456552E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.7456552E7f) + "'", float2 == (-2.7456552E7f));
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.828E8f, (-2.2324048E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.209519E8f + "'", float2 == 5.209519E8f);
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 5798524.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5798524.0f + "'", float2 == 5798524.0f);
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(200640.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1260658.3000325123d + "'", double1 == 1260658.3000325123d);
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-3166360.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0132352E8f) + "'", float2 == (-1.0132352E8f));
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-8.096385E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.087108903256108E9d) + "'", double1 == (-5.087108903256108E9d));
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 1.1433238E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2866477E8f + "'", float2 == 2.2866477E8f);
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-8.252644E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.185289052087412E9d) + "'", double1 == (-5.185289052087412E9d));
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1.3266756E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.32667556E11f + "'", float2 == 1.32667556E11f);
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-8.41982E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.290329144435328E11d) + "'", double1 == (-5.290329144435328E11d));
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.6216732E7f, (-2.3650173E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.7227912E10f) + "'", float2 == (-4.7227912E10f));
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(20440.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40880.0f + "'", float2 == 40880.0f);
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1681920.0f), (-948304.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5260448.0f) + "'", float2 == (-5260448.0f));
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.0946214E8f, 8.42704E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7874651E9f + "'", float2 == 1.7874651E9f);
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.0132352E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.366344521357169E8d) + "'", double1 == (-6.366344521357169E8d));
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(46600.0f, 6.6085795E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3217159E13f + "'", float2 == 1.3217159E13f);
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-20440.0f), (-1.605536E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.21516E7f) + "'", float2 == (-3.21516E7f));
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 2.0925336E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0925336E10f + "'", float2 == 2.0925336E10f);
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-43936.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0795005E9f, 3.5475886E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.311077E10f + "'", float2 == 7.311077E10f);
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 1.28214E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.28214E11f + "'", float2 == 1.28214E11f);
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 3.1653535E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1653534E11f + "'", float2 == 3.1653534E11f);
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.4758533E9f, 7542720.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.966792E9f + "'", float2 == 8.966792E9f);
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 1.4148E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8296E7f + "'", float2 == 2.8296E7f);
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 377280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-377280.0f) + "'", float2 == (-377280.0f));
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 117780.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.4888733E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1921237251082678E11d) + "'", double1 == (-2.1921237251082678E11d));
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.6191024E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 1.4843616E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4843616E7f) + "'", float2 == (-1.4843616E7f));
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.2843494E9f, 2.06416E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.981531E9f + "'", float2 == 8.981531E9f);
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5519824.0f, 2140.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1043928E7f + "'", float2 == 1.1043928E7f);
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 1.1418496E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1418496E10f + "'", float2 == 1.1418496E10f);
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.0050885E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2598342407965746E13d + "'", double1 == 1.2598342407965746E13d);
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 80000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2800000.0f + "'", float2 == 2800000.0f);
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-520.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.1085645E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9531686795835986E12d + "'", double1 == 1.9531686795835986E12d);
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.552215E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.752854732911174E8d) + "'", double1 == (-9.752854732911174E8d));
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 5820.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 302640.0f + "'", float2 == 302640.0f);
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5016248.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1518015730768986E7d + "'", double1 == 3.1518015730768986E7d);
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5.78656E7f), 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.15731096E8f) + "'", float2 == (-1.15731096E8f));
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.8014E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7601715721656754E10d + "'", double1 == 1.7601715721656754E10d);
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-336776.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2116026.015010712d) + "'", double1 == (-2116026.015010712d));
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 6.659101E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 2.828E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.828E8f + "'", float2 == 2.828E8f);
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.5349838E8f, 8180352.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.2335747E8f + "'", float2 == 5.2335747E8f);
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 2.802364E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.802364E8f + "'", float2 == 2.802364E8f);
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 158160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.3234496E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4598664388692287E8d) + "'", double1 == (-1.4598664388692287E8d));
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.5475885E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.229015610298474E12d + "'", double1 == 2.229015610298474E12d);
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.0999747E12f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9477715468567562E13d) + "'", double1 == (-1.9477715468567562E13d));
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.422425E8f), 7.980555E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.837402E7f) + "'", float2 == (-8.837402E7f));
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.250288E9f, 79760.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5007355E9f + "'", float2 == 2.5007355E9f);
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4369278.0f, (-26740.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8685076.0f + "'", float2 == 8685076.0f);
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-1.4045066E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.915773E9f) + "'", float2 == (-4.915773E9f));
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.6750904E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3091274204898678E10d + "'", double1 == 2.3091274204898678E10d);
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-1.1228236E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(281376.0f, 6.0466092E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.21494936E8f + "'", float2 == 1.21494936E8f);
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(20160.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 126669.01579274047d + "'", double1 == 126669.01579274047d);
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.3758392E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4927837953661302E8d) + "'", double1 == (-1.4927837953661302E8d));
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.752016E9f), 3.5588112E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.367219E10f + "'", float2 == 5.367219E10f);
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1.6040736E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-336058.0f), 64.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-671988.0f) + "'", float2 == (-671988.0f));
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.5848E7f, 1.250288E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.592272E9f + "'", float2 == 2.592272E9f);
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2183904.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3721873525090728E7d) + "'", double1 == (-1.3721873525090728E7d));
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.4612E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5464175517180853E11d + "'", double1 == 1.5464175517180853E11d);
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.820894E8f, 3.2704224E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0182633E9f + "'", float2 == 1.0182633E9f);
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.6254778E8f), (-297656.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.256909E8f) + "'", float2 == (-7.256909E8f));
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1.07090906E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-167602.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1053074.423853913d) + "'", double1 == (-1053074.423853913d));
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4660.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29279.643531456873d + "'", double1 == 29279.643531456873d);
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.5683182E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6137219228667404E10d + "'", double1 == 1.6137219228667404E10d);
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 9.529845E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.243949E11f + "'", float2 == 9.243949E11f);
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.9352848E8f), 1.8582523E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1294477E9f + "'", float2 == 3.1294477E9f);
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 1200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 116400.0f + "'", float2 == 116400.0f);
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.053217E8f, (-1.4636384E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3813706E9f + "'", float2 == 1.3813706E9f);
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 175760.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 175800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6153000.0f + "'", float2 == 6153000.0f);
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.7376016E7f, 3.5006533E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.056059E9f + "'", float2 == 7.056059E9f);
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(11520.0f, (-4.3576E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.712896E7f) + "'", float2 == (-8.712896E7f));
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 1.6553288E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6553288E9f + "'", float2 == 1.6553288E9f);
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 4601536.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.601536E7f + "'", float2 == 4.601536E7f);
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5.62527E9f), 9.137448E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7149842E11f + "'", float2 == 1.7149842E11f);
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4809464.0f, 1.33248745E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.6650711E11f + "'", float2 == 2.6650711E11f);
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(40040.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 251578.73969947064d + "'", double1 == 251578.73969947064d);
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.669417E10f), 1.06E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.336714E10f) + "'", float2 == (-7.336714E10f));
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.248021E11f, 4814856.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.496138E11f + "'", float2 == 6.496138E11f);
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-801960.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 2.4973466E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4973466E9f + "'", float2 == 2.4973466E9f);
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-20440.0f), 713656.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1386432.0f + "'", float2 == 1386432.0f);
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4426656.0f, 640080.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0133472E7f + "'", float2 == 1.0133472E7f);
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.41336E7f), 1.5971842E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5116963E8f + "'", float2 == 2.5116963E8f);
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.0698913E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.722325150669368E10d + "'", double1 == 6.722325150669368E10d);
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.7874651E9f, (-24640.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5748808E9f + "'", float2 == 3.5748808E9f);
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.2062241E9f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.4124483E9f + "'", float2 == 8.4124483E9f);
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.0256E7f), (-52000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.0616E7f) + "'", float2 == (-4.0616E7f));
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.2125493E10f), (-2000002.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.4254986E10f) + "'", float2 == (-2.4254986E10f));
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.8470669E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.160546348179404E10d + "'", double1 == 1.160546348179404E10d);
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3572800.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2448564465491224E7d) + "'", double1 == (-2.2448564465491224E7d));
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-1.6559052E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6559052E11f) + "'", float2 == (-1.6559052E11f));
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.010616E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.263307290958019E9d + "'", double1 == 1.263307290958019E9d);
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.7536342E8f, (-9074784.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3257728E8f + "'", float2 == 3.3257728E8f);
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.478182E7f, (-3784816.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8199402E8f + "'", float2 == 1.8199402E8f);
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.5273248E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.596464742651E8d + "'", double1 == 9.596464742651E8d);
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1209616.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7600241.478529342d + "'", double1 == 7600241.478529342d);
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.0244265E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2719846815132254E11d + "'", double1 == 1.2719846815132254E11d);
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.0054E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5166670429377112E9d + "'", double1 == 2.5166670429377112E9d);
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.179932E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.767921486861736E9d + "'", double1 == 5.767921486861736E9d);
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.902104E7f, 1.7510068E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.13062216E8f + "'", float2 == 1.13062216E8f);
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 194400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 388800.0f + "'", float2 == 388800.0f);
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.110528E8f, 3.7728E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8975616E9f + "'", float2 == 1.8975616E9f);
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.1498378E10f, (-32.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2996756E10f + "'", float2 == 4.2996756E10f);
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 480880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.4E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.796459430051421E8d + "'", double1 == 8.796459430051421E8d);
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 2.9522982E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9522983E10f + "'", float2 == 2.9522983E10f);
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.2838284E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.43497172279552E11d + "'", double1 == 1.43497172279552E11d);
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.4731663E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5539362384566372E10d + "'", double1 == 1.5539362384566372E10d);
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(532400.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1064800.0f + "'", float2 == 1064800.0f);
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(349280.0f, 1.250288E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5075616E8f + "'", float2 == 2.5075616E8f);
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.6622022E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0443924691928996E9d + "'", double1 == 1.0443924691928996E9d);
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2616.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5232.0f + "'", float2 == 5232.0f);
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4809464.0f, (-3995048.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1628832.0f + "'", float2 == 1628832.0f);
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7757908.0f), 3.5588112E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.116071E10f + "'", float2 == 7.116071E10f);
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8009240.0f, (-799960.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.441856E7f + "'", float2 == 1.441856E7f);
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(744800.0f, 1.5681634E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1364758E10f + "'", float2 == 3.1364758E10f);
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8257416.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.188287488646963E7d + "'", double1 == 5.188287488646963E7d);
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.5400221E12f, 384.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0800442E12f + "'", float2 == 3.0800442E12f);
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5.7988756E9f, (-10.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1597751E10f + "'", float2 == 1.1597751E10f);
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(501724.0f, (-2.1162783E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.231553E9f) + "'", float2 == (-4.231553E9f));
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1486144.0f), 6.6718833E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3340794E10f + "'", float2 == 1.3340794E10f);
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-198640.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1986400.0f) + "'", float2 == (-1986400.0f));
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-1.344512E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.344512E8f) + "'", float2 == (-1.344512E8f));
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-9.88041E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.208044764462701E10d) + "'", double1 == (-6.208044764462701E10d));
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.128481E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.7355936238369026E10d + "'", double1 == 5.7355936238369026E10d);
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 4.2570143E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-4.681064E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.681064E7f) + "'", float2 == (-4.681064E7f));
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(954616.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1909232.0f + "'", float2 == 1909232.0f);
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-7.9773145E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.012294556980197E12d) + "'", double1 == (-5.012294556980197E12d));
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 3.3026532E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.9272768E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8392622579807675E8d) + "'", double1 == (-1.8392622579807675E8d));
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-1.344512E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.344512E9f) + "'", float2 == (-1.344512E9f));
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1597751E10f, (-3.2080672E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.313134E10f + "'", float2 == 2.313134E10f);
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.672382E13f), (-1.344512E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.7344791E14f) + "'", float2 == (-1.7344791E14f));
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.2088294E8f), 4256772.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2332524E9f) + "'", float2 == (-1.2332524E9f));
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.5346492E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5925670873675E11d + "'", double1 == 1.5925670873675E11d);
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 42678.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1493730.0f + "'", float2 == 1493730.0f);
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2557968.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6072186953835553E7d + "'", double1 == 1.6072186953835553E7d);
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1780.0f, (-3.5935496E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.186743E7f) + "'", float2 == (-7.186743E7f));
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-10.0f), 2612540.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5225060.0f + "'", float2 == 5225060.0f);
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1193716.0f), 1.30192E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3650968E7f + "'", float2 == 2.3650968E7f);
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(680.0f, 1212.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3784.0f + "'", float2 == 3784.0f);
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-40.0f), 5.9780936E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1956187E10f + "'", float2 == 1.1956187E10f);
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 4.8248416E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8248416E8f + "'", float2 == 4.8248416E8f);
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.139762E7f, 348360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8349195E8f + "'", float2 == 1.8349195E8f);
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.5683246E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-4.9639085E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.9639085E12f) + "'", float2 == (-4.9639085E12f));
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 2072800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 440.0f + "'", float2 == 440.0f);
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.3132872E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0817997453506193E8d + "'", double1 == 2.0817997453506193E8d);
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.21372E8f), (-671988.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.44088E8f) + "'", float2 == (-8.44088E8f));
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-200.0f) + "'", float2 == (-200.0f));
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.567484E12f, (-7.749585E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.133418E12f + "'", float2 == 9.133418E12f);
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (-8025752.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.025752E8f) + "'", float2 == (-8.025752E8f));
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 7.931228E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 2.5280742E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5280741E10f + "'", float2 == 2.5280741E10f);
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6896E7f, 5.0699926E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0477905E9f + "'", float2 == 1.0477905E9f);
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.763765E7f), 2.24808E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.303137E8f) + "'", float2 == (-1.303137E8f));
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 1.5971842E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5971841E12f + "'", float2 == 1.5971841E12f);
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 3.2480208E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2480207E9f + "'", float2 == 3.2480207E9f);
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5260448.0f), 50336.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0420224E7f) + "'", float2 == (-1.0420224E7f));
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.946997E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.993245441463568E11d + "'", double1 == 4.993245441463568E11d);
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.757852E9f, (-1.1228236E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.270057E9f + "'", float2 == 7.270057E9f);
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-42592.0f), 1.5859208E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1633232E7f + "'", float2 == 3.1633232E7f);
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.4778808E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.556898443656433E10d + "'", double1 == 1.556898443656433E10d);
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 9.021722E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8043443E10f + "'", float2 == 1.8043443E10f);
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 3.306859E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.467426E10f, 5030160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.935858E10f + "'", float2 == 8.935858E10f);
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.226192E7f), (-1772960.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6806976E8f) + "'", float2 == (-1.6806976E8f));
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(902560.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5670951.730848007d + "'", double1 == 5670951.730848007d);
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.21248504E8f, (-168388.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4216022E8f + "'", float2 == 2.4216022E8f);
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.2738432E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.003792877890627E8d) + "'", double1 == (-8.003792877890627E8d));
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.4E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.796459430051421E8d) + "'", double1 == (-8.796459430051421E8d));
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.3266756E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.335748375933153E10d + "'", double1 == 8.335748375933153E10d);
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.097426E12f), 1.7092872E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.1948177E12f) + "'", float2 == (-6.1948177E12f));
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2000.0f, 2.8806557E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.761352E8f + "'", float2 == 5.761352E8f);
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.5007355E9f, 9.593486E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.9201684E9f + "'", float2 == 6.9201684E9f);
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 6.9201684E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.920168E10f + "'", float2 == 6.920168E10f);
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-478240.0f), 2623536.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4290592.0f + "'", float2 == 4290592.0f);
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-100.0f), 3.5377536E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.075487E7f + "'", float2 == 7.075487E7f);
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3646240.0f), 384.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7291712.0f) + "'", float2 == (-7291712.0f));
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 4.467426E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.467426E12f + "'", float2 == 4.467426E12f);
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 7.075487E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4150974E8f + "'", float2 == 1.4150974E8f);
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-406112.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2551676.951469316d) + "'", double1 == (-2551676.951469316d));
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 7789670.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.55598E8f + "'", float2 == 7.55598E8f);
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 3.5126547E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 37728.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-37728.0f) + "'", float2 == (-37728.0f));
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4012876.0f), (-62656.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8151064.0f) + "'", float2 == (-8151064.0f));
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.5506157E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6025990803988324E11d + "'", double1 == 1.6025990803988324E11d);
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-192.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1920.0f) + "'", float2 == (-1920.0f));
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.947401E9f, 4256002.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9903314E10f + "'", float2 == 1.9903314E10f);
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(922160.0f, 1.6229244E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2460333E10f + "'", float2 == 3.2460333E10f);
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-200.0f), (-6.231373E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2462746E10f) + "'", float2 == (-1.2462746E10f));
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 6.070575E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.942584E9f + "'", float2 == 1.942584E9f);
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.656909E12f, 316376.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3313819E13f + "'", float2 == 1.3313819E13f);
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.283664E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6915053901446415E10d + "'", double1 == 2.6915053901446415E10d);
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(954616.0f, 1.6077792E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2157493E10f + "'", float2 == 3.2157493E10f);
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.2815909E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.052473027243743E11d + "'", double1 == 8.052473027243743E11d);
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 853600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.536E7f + "'", float2 == 8.536E7f);
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 60560.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 60560.0f + "'", float2 == 60560.0f);
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.4108388E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.864561518427914E9d + "'", double1 == 8.864561518427914E9d);
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(954616.0f, 261244.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2431720.0f + "'", float2 == 2431720.0f);
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.4254986E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5239857316901105E11d) + "'", double1 == (-1.5239857316901105E11d));
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.06E7f), 1.3340794E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.6660387E10f + "'", float2 == 2.6660387E10f);
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6159304E7f, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2318612E7f + "'", float2 == 3.2318612E7f);
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(77000.0f, 1.7781952E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5717904E7f + "'", float2 == 3.5717904E7f);
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-801960.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.170192E7f) + "'", float2 == (-4.170192E7f));
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 8683872.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0393552E8f + "'", float2 == 3.0393552E8f);
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(174256.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1094882.738887886d + "'", double1 == 1094882.738887886d);
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.20392E7f, (-3.8930566E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.545329E8f) + "'", float2 == (-7.545329E8f));
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8618400.0f, 6.656909E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3313834E13f + "'", float2 == 1.3313834E13f);
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 6.557064E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0982605E9f + "'", float2 == 2.0982605E9f);
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.6365156E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.028253067235922E10d + "'", double1 == 1.028253067235922E10d);
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5.6346054E8f, 1248.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1269235E9f + "'", float2 == 1.1269235E9f);
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1198144.0f, (-240880.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1914528.0f + "'", float2 == 1914528.0f);
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 2.9277536E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 2.24808E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.24808E7f) + "'", float2 == (-2.24808E7f));
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.3210597E12f, (-3.3484096E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.6420526E12f + "'", float2 == 2.6420526E12f);
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 7.251654E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.034105E11f + "'", float2 == 7.034105E11f);
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.8980545E9f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.796109E9f + "'", float2 == 3.796109E9f);
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.2460333E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0395428772361505E11d + "'", double1 == 2.0395428772361505E11d);
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-6.3325504E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.33255E9f) + "'", float2 == (-6.33255E9f));
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-4.8317854E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8317854E10f + "'", float2 == 4.8317854E10f);
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.534768E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.849278766906816E9d + "'", double1 == 2.849278766906816E9d);
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.7409584E7f, (-1.4636384E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5546400.0f + "'", float2 == 5546400.0f);
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(12800.0f, 9.14389E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8288036E9f + "'", float2 == 1.8288036E9f);
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.5935496E7f), 6.6337306E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2548751E9f + "'", float2 == 1.2548751E9f);
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.7376016E7f, 7.999285E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.654609E9f + "'", float2 == 1.654609E9f);
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 1.1795616E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 652816.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-652816.0f) + "'", float2 == (-652816.0f));
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.8125248E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1388429192258619E8d) + "'", double1 == (-1.1388429192258619E8d));
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 436800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-436800.0f) + "'", float2 == (-436800.0f));
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6399920.0f, 1.2404437E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4821674E10f + "'", float2 == 2.4821674E10f);
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.170133E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.76176436738456E8d + "'", double1 == 5.76176436738456E8d);
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2184640.0f, (-1.6656356E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.3269018E9f) + "'", float2 == (-3.3269018E9f));
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-38200.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38200.0f + "'", float2 == 38200.0f);
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-353824.0f), 4.447256E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.893805E9f + "'", float2 == 8.893805E9f);
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0490925E10f, 576.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0981852E10f + "'", float2 == 2.0981852E10f);
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(25602.0f, 1.7569709E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.513993E9f + "'", float2 == 3.513993E9f);
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-6.790563E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 770.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-770.0f) + "'", float2 == (-770.0f));
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.022029E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.668707879711107E8d + "'", double1 == 5.668707879711107E8d);
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(382960.0f, 4.963798E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.927672E10f + "'", float2 == 9.927672E10f);
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5030160.0f, 954616.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1969552E7f + "'", float2 == 1.1969552E7f);
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.2E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.539822368615504E7d + "'", double1 == 7.539822368615504E7d);
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1628832.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.023425329026394E7d + "'", double1 == 1.023425329026394E7d);
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2662.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-16725.839287712057d) + "'", double1 == (-16725.839287712057d));
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.5815409E9f, (-3.96E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0838817E9f + "'", float2 == 3.0838817E9f);
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 9.65183E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.651831E9f + "'", float2 == 9.651831E9f);
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 6832240.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.366448E7f + "'", float2 == 1.366448E7f);
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 6.650176E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.650176E7f) + "'", float2 == (-6.650176E7f));
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-2.1162783E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-6.1908346E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.88981607465716E9d) + "'", double1 == (-3.88981607465716E9d));
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.5971842E10f, (-3.3196342E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5304416E10f + "'", float2 == 2.5304416E10f);
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1754640.0f), 7.946997E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5893643E11f + "'", float2 == 1.5893643E11f);
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(38200.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 240017.6787342602d + "'", double1 == 240017.6787342602d);
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-8.837402E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.8374016E8f) + "'", float2 == (-8.8374016E8f));
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.4275364E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.969475633413076E9d + "'", double1 == 8.969475633413076E9d);
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(20160.0f, 1.823784E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.647572E10f + "'", float2 == 3.647572E10f);
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(64.0f, 3270624.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6541376.0f + "'", float2 == 6541376.0f);
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 91760.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 917600.0f + "'", float2 == 917600.0f);
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3954668.0f), 8.536E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6281066E8f + "'", float2 == 1.6281066E8f);
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.32667556E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.335748375933153E11d + "'", double1 == 8.335748375933153E11d);
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.7057833E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.841686438573708E10d + "'", double1 == 4.841686438573708E10d);
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 332.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11620.0f + "'", float2 == 11620.0f);
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 9.14389E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.14389E7f) + "'", float2 == (-9.14389E7f));
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.5304416E10f, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0608833E10f + "'", float2 == 5.0608833E10f);
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5798524.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.643320080012821E7d + "'", double1 == 3.643320080012821E7d);
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.1419427E8f), 1486144.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.2541626E8f) + "'", float2 == (-4.2541626E8f));
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 4.04558E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.04558E8f + "'", float2 == 4.04558E8f);
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.201344E8f, 3.52982E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3108652E9f + "'", float2 == 1.3108652E9f);
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 10400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1040000.0f + "'", float2 == 1040000.0f);
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.317362E7f, (-591488.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6516426E8f + "'", float2 == 1.6516426E8f);
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(80002.0f, (-9.478182E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.8940365E8f) + "'", float2 == (-1.8940365E8f));
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-2.9272768E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.9272768E8f) + "'", float2 == (-2.9272768E8f));
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-397280.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-794560.0f) + "'", float2 == (-794560.0f));
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.0962961E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3171416854012559E12d + "'", double1 == 1.3171416854012559E12d);
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.65133E12f), (-8.066351E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9435362E13f) + "'", float2 == (-1.9435362E13f));
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-3.2704253E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.083215E8f, (-1.4572013E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3252027E9f + "'", float2 == 1.3252027E9f);
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 8.908404E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.908404E10f + "'", float2 == 8.908404E10f);
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-79456.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-79456.0f) + "'", float2 == (-79456.0f));
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.7057833E9f, (-1.6227702E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.7043837E10f) + "'", float2 == (-1.7043837E10f));
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 2930536.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.930536E7f + "'", float2 == 2.930536E7f);
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-2.7888884E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.7052219E13f) + "'", float2 == (-2.7052219E13f));
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1008520.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.00852E8f + "'", float2 == 1.00852E8f);
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-1134736.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.134736E8f) + "'", float2 == (-1.134736E8f));
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-19200.0f), 2.4808786E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.9617535E10f + "'", float2 == 4.9617535E10f);
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5.7613114E8f, 3.0393552E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7601334E9f + "'", float2 == 1.7601334E9f);
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.02135E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.668281628419868E8d + "'", double1 == 5.668281628419868E8d);
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.097426E12f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.946170072179009E13d) + "'", double1 == (-1.946170072179009E13d));
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.6806976E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0560134466131994E9d) + "'", double1 == (-1.0560134466131994E9d));
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.6296966E8f, 502560.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9269445E9f + "'", float2 == 1.9269445E9f);
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 376168.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1754576.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.102432614352993E7d + "'", double1 == 1.102432614352993E7d);
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 5.715983E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.7159834E8f + "'", float2 == 5.7159834E8f);
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.004E8f, 7.087034E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0182067E9f + "'", float2 == 3.0182067E9f);
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5.625056E9f, 4.9618E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2242473E10f + "'", float2 == 1.2242473E10f);
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 388000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.88E7f + "'", float2 == 3.88E7f);
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-3.1450836E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.1450836E7f) + "'", float2 == (-3.1450836E7f));
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1986400.0f), 40400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3892000.0f) + "'", float2 == (-3892000.0f));
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 7.980555E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.980555E9f + "'", float2 == 7.980555E9f);
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 8.6074104E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7214821E8f + "'", float2 == 1.7214821E8f);
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(82340.0f, (-5.7742726E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1546898E9f) + "'", float2 == (-1.1546898E9f));
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.758332E7f), 44572.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.550775E8f) + "'", float2 == (-1.550775E8f));
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 4.5848E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5848E7f + "'", float2 == 4.5848E7f);
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (-9.478182E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.478183E9f) + "'", float2 == (-9.478183E9f));
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 1.8375389E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8375389E8f + "'", float2 == 1.8375389E8f);
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(42682.0f, 1916112.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3917588.0f + "'", float2 == 3917588.0f);
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 4.1927528E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.1927526E12f + "'", float2 == 4.1927526E12f);
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.5006533E9f, 2.3160606E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.7021343E11f + "'", float2 == 4.7021343E11f);
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.8125248E7f), 44656.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.6161184E7f) + "'", float2 == (-3.6161184E7f));
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5299488.0f), 972584.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8653808.0f) + "'", float2 == (-8653808.0f));
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-5.0699926E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.6363961E10f) + "'", float2 == (-2.6363961E10f));
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.21494936E8f, 332.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4299053E8f + "'", float2 == 2.4299053E8f);
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-336576.0f), 5.5055165E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.101036E10f + "'", float2 == 1.101036E10f);
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.5859208E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.964634268910494E7d + "'", double1 == 9.964634268910494E7d);
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(485524.0f, (-8.113852E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6227607E11f) + "'", float2 == (-1.6227607E11f));
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.647572E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2918370596217728E11d + "'", double1 == 2.2918370596217728E11d);
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 4660.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 46600.0f + "'", float2 == 46600.0f);
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.15731096E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.271599219709902E8d) + "'", double1 == (-7.271599219709902E8d));
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1628832.0f, 7.484328E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5294422E8f + "'", float2 == 1.5294422E8f);
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.8087936E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.021454129277923E10d) + "'", double1 == (-3.021454129277923E10d));
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 4.54352E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.54352E10f + "'", float2 == 4.54352E10f);
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 210432.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4369278.0f, 20160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8778876.0f + "'", float2 == 8778876.0f);
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(136.0f, 2.5007355E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0014715E9f + "'", float2 == 5.0014715E9f);
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.2409407E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.797060422581323E11d + "'", double1 == 7.797060422581323E11d);
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-357280.0f), 1.4732173E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.939289E8f + "'", float2 == 2.939289E8f);
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-1.5502149E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 1.0826304E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0826304E8f + "'", float2 == 1.0826304E8f);
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 1267304.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.267304E8f + "'", float2 == 1.267304E8f);
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 1.1043928E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(350000.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 700000.0f + "'", float2 == 700000.0f);
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-161408.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1614080.0f) + "'", float2 == (-1614080.0f));
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.4819569E10f, 3.592697E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.035768E10f + "'", float2 == 5.035768E10f);
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 9.128481E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8256962E10f + "'", float2 == 1.8256962E10f);
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.9201684E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.348070071568136E10d + "'", double1 == 4.348070071568136E10d);
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-200240.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 200240.0f + "'", float2 == 200240.0f);
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6796013E8f, (-1.1546898E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9734593E9f) + "'", float2 == (-1.9734593E9f));
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-6.1948177E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.194818E14f) + "'", float2 == (-6.194818E14f));
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-968.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6082.12337734984d) + "'", double1 == (-6082.12337734984d));
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-4.170192E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-156.0f), (-3.21516E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.430351E7f) + "'", float2 == (-6.430351E7f));
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 3.313637E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3136372E10f + "'", float2 == 3.3136372E10f);
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 6.496073E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2676400.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5352798.0f + "'", float2 == 5352798.0f);
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4426656.0f, 2000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8857312.0f + "'", float2 == 8857312.0f);
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 954616.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.54616E7f + "'", float2 == 9.54616E7f);
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(23800.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 149539.81031087416d + "'", double1 == 149539.81031087416d);
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-6.194818E14f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.008973E16f) + "'", float2 == (-6.008973E16f));
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.946497E8f, 2.5336707E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.1462713E10f + "'", float2 == 5.1462713E10f);
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 7.84375E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7453128E9f + "'", float2 == 2.7453128E9f);
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3572800.0f), (-4163432.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5472464E7f) + "'", float2 == (-1.5472464E7f));
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 181220.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1812200.0f + "'", float2 == 1812200.0f);
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.348683E7f, (-591488.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6579069E8f + "'", float2 == 1.6579069E8f);
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6273955E9f, 3.098972E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.201199E12f + "'", float2 == 6.201199E12f);
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.2324048E7f), 8.800609E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7154738E9f + "'", float2 == 1.7154738E9f);
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-1.2497379E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2122457E12f) + "'", float2 == (-1.2122457E12f));
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 3.3257728E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3257728E9f + "'", float2 == 3.3257728E9f);
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1.3148335E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3148335E10f) + "'", float2 == (-1.3148335E10f));
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.1180815E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.100741062948109E10d + "'", double1 == 5.100741062948109E10d);
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 36400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 364000.0f + "'", float2 == 364000.0f);
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.8288036E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.149071180870617E10d + "'", double1 == 1.149071180870617E10d);
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 246400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8624000.0f + "'", float2 == 8624000.0f);
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 6.453498E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.453498E10f + "'", float2 == 6.453498E10f);
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-600608.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3773731.3609745167d) + "'", double1 == (-3773731.3609745167d));
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-21280.0f), (-1.378723E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.7578717E8f) + "'", float2 == (-2.7578717E8f));
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 700000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1400000.0f + "'", float2 == 1400000.0f);
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-1.3628912E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 8.028312E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.028312E9f + "'", float2 == 8.028312E9f);
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.7095827E8f), 9.65183E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.4887994E8f) + "'", float2 == (-7.4887994E8f));
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 2206.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.6437028E9f, 2.5070752E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.7888205E9f + "'", float2 == 5.7888205E9f);
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 7379144.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7379144.0f) + "'", float2 == (-7379144.0f));
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 1.5542823E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.973703E12f + "'", float2 == 4.973703E12f);
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(20096.0f, (-671988.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1303784.0f) + "'", float2 == (-1303784.0f));
    }
}

