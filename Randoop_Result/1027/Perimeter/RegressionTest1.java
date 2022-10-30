package Perimeter;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(212800.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1337061.833367816d + "'", double1 == 1337061.833367816d);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(214952.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1350583.2481488665d + "'", double1 == 1350583.2481488665d);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1002200.0f, 11128.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2026656.0f + "'", float2 == 2026656.0f);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(89104.0f, 713654.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1605516.0f + "'", float2 == 1605516.0f);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-397280.0f), (-399980.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1594520.0f) + "'", float2 == (-1594520.0f));
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(857460.0f, 8176524.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8067968E7f + "'", float2 == 1.8067968E7f);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2000020.0f, (-2000002.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 1212.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38784.0f + "'", float2 == 38784.0f);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 4045580.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.04558E8f + "'", float2 == 4.04558E8f);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1152.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11520.0f + "'", float2 == 11520.0f);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1980000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 24640.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 246400.0f + "'", float2 == 246400.0f);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 89310.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6400.0f, 320008.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 652816.0f + "'", float2 == 652816.0f);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7542720.0f, 320008.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5725456E7f + "'", float2 == 1.5725456E7f);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.176524E8f, 214.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6353052E9f + "'", float2 == 1.6353052E9f);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-10.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-62.83185307179586d) + "'", double1 == (-62.83185307179586d));
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (short) 100, (-168028.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-335856.0f) + "'", float2 == (-335856.0f));
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (-6.336E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.336E9f) + "'", float2 == (-6.336E9f));
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.1418496E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.174452629728888E7d + "'", double1 == 7.174452629728888E7d);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(60.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 376.99111843077515d + "'", double1 == 376.99111843077515d);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4209192.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6447133329497855E7d + "'", double1 == 2.6447133329497855E7d);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 332800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.328E7f + "'", float2 == 3.328E7f);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(332.0f, 2404400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4809464.0f + "'", float2 == 4809464.0f);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-399980.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2128000.0f, (-2000002.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 255996.0f + "'", float2 == 255996.0f);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) '#', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 70.0f + "'", float2 == 70.0f);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.283185307179586d) + "'", double1 == (-6.283185307179586d));
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2513.2741228718346d + "'", double1 == 2513.2741228718346d);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-159560.0f), 1758.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-315604.0f) + "'", float2 == (-315604.0f));
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 4012876.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4012876.0f) + "'", float2 == (-4012876.0f));
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 1212.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1212.0f + "'", float2 == 1212.0f);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2666.0f, (-39864.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-74396.0f) + "'", float2 == (-74396.0f));
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(18.0f, 106.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 248.0f + "'", float2 == 248.0f);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(316376.0f, 8574600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7781952E7f + "'", float2 == 1.7781952E7f);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-4012876.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4045066E8f) + "'", float2 == (-1.4045066E8f));
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-16.0f), (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-30.0f) + "'", float2 == (-30.0f));
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 4005400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0054E8f + "'", float2 == 4.0054E8f);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 1.5725456E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5725456E7f) + "'", float2 == (-1.5725456E7f));
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8257416.0f, 770.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6516372E7f + "'", float2 == 1.6516372E7f);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(332800.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2091044.0702293662d + "'", double1 == 2091044.0702293662d);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(320008.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2010669.563779925d + "'", double1 == 2010669.563779925d);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 4357600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4357600.0f) + "'", float2 == (-4357600.0f));
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 341576.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4060.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25509.73234714912d + "'", double1 == 25509.73234714912d);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1000.0f + "'", float2 == 1000.0f);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.7781952E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1172729953937265E8d + "'", double1 == 1.1172729953937265E8d);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(60.0f, (-83800.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-167480.0f) + "'", float2 == (-167480.0f));
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 10, (-296.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-572.0f) + "'", float2 == (-572.0f));
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 1.98268E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.98268E8f + "'", float2 == 1.98268E8f);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 90256.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8754832.0f + "'", float2 == 8754832.0f);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1976.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1976.0f) + "'", float2 == (-1976.0f));
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5200.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32672.563597333847d + "'", double1 == 32672.563597333847d);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2026656.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2733855201907352E7d + "'", double1 == 1.2733855201907352E7d);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3100672.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9482096752783142E7d + "'", double1 == 1.9482096752783142E7d);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 18.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1976.0f, (-21280.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-38608.0f) + "'", float2 == (-38608.0f));
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 130192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 44656.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44656.0f + "'", float2 == 44656.0f);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 634.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 634.0f + "'", float2 == 634.0f);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(164116.0f, (-39300.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 249632.0f + "'", float2 == 249632.0f);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 20440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-20440.0f) + "'", float2 == (-20440.0f));
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 24640.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-24640.0f) + "'", float2 == (-24640.0f));
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3100672.0f, 8176524.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2554392E7f + "'", float2 == 2.2554392E7f);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1.1418496E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9964736E8f + "'", float2 == 3.9964736E8f);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4564880.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.868198694503795E7d + "'", double1 == 2.868198694503795E7d);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 648480.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4851360.0f, 880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9704480.0f + "'", float2 == 9704480.0f);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100.0f) + "'", float2 == (-100.0f));
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 4357600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.3576E8f + "'", float2 == 4.3576E8f);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2858864.0f, 40398.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5798524.0f + "'", float2 == 5798524.0f);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(104.0f, 2.2554392E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.510899E7f + "'", float2 == 4.510899E7f);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 11520.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11520.0f + "'", float2 == 11520.0f);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1000.0f + "'", float2 == 1000.0f);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(320008.0f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 640080.0f + "'", float2 == 640080.0f);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(220.0f, 58880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 118200.0f + "'", float2 == 118200.0f);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9704480.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.097504614981815E7d + "'", double1 == 6.097504614981815E7d);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-160.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-160.0f) + "'", float2 == (-160.0f));
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1212.0f, (-167480.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-332536.0f) + "'", float2 == (-332536.0f));
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-397280.0f), 158160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-478240.0f) + "'", float2 == (-478240.0f));
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(158160.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 993748.5881835234d + "'", double1 == 993748.5881835234d);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8574600.0f, 130192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7409584E7f + "'", float2 == 1.7409584E7f);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(178000.0f, 9577408.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9510816E7f + "'", float2 == 1.9510816E7f);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 5200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-39864.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-250472.89908540703d) + "'", double1 == (-250472.89908540703d));
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.3576E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.737960829456577E8d + "'", double1 == 2.737960829456577E8d);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-3.9998E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.9998E8f) + "'", float2 == (-3.9998E8f));
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-335856.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 335856.0f + "'", float2 == 335856.0f);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-1.4045066E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4045066E8f) + "'", float2 == (-1.4045066E8f));
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(400.0f, 1258.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3316.0f + "'", float2 == 3316.0f);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(38.0f, 1.428992E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8579916E7f + "'", float2 == 2.8579916E7f);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1492.0f, 640080.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1283144.0f + "'", float2 == 1283144.0f);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(770.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4838.052686528282d + "'", double1 == 4838.052686528282d);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 394.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 788.0f + "'", float2 == 788.0f);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 4.012876E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.012876E7f) + "'", float2 == (-4.012876E7f));
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(11520.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72382.29473870884d + "'", double1 == 72382.29473870884d);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(222562.0f, 21280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 487684.0f + "'", float2 == 487684.0f);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 40000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40000.0f + "'", float2 == 40000.0f);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.100672E8f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.201344E8f + "'", float2 == 6.201344E8f);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(60.0f, 202.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 524.0f + "'", float2 == 524.0f);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(42682.0f, 64.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 85492.0f + "'", float2 == 85492.0f);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 3100672.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(316376.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1987849.0347442487d + "'", double1 == 1987849.0347442487d);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(125368.0f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 250756.0f + "'", float2 == 250756.0f);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 4809464.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-170468.0f), (-200.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-341336.0f) + "'", float2 == (-341336.0f));
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(42682.0f, (-3.879806E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.751075E7f) + "'", float2 == (-7.751075E7f));
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 1.1418496E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1418496E10f + "'", float2 == 1.1418496E10f);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 9702616.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9702616.0f + "'", float2 == 9702616.0f);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-1980000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.98E7f) + "'", float2 == (-1.98E7f));
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1297160.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8150296.653061072d + "'", double1 == 8150296.653061072d);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6159304E7f, 80800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2480208E7f + "'", float2 == 3.2480208E7f);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1104.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6936.636579126263d + "'", double1 == 6936.636579126263d);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-3820.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-198640.0f) + "'", float2 == (-198640.0f));
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(111280.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 699192.8609829444d + "'", double1 == 699192.8609829444d);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-159560.0f), 1982680.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3646240.0f + "'", float2 == 3646240.0f);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(652816.0f, 90256.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1486144.0f + "'", float2 == 1486144.0f);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 3.2480208E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2480207E9f + "'", float2 == 3.2480207E9f);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1283144.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1283144.0f) + "'", float2 == (-1283144.0f));
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-315604.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 315604.0f + "'", float2 == 315604.0f);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1492.0f, (-1976.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-968.0f) + "'", float2 == (-968.0f));
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(332.0f, 1258.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3180.0f + "'", float2 == 3180.0f);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(20000.0f, (-198640.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-357280.0f) + "'", float2 == (-357280.0f));
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.9998E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5131484591656908E8d) + "'", double1 == (-2.5131484591656908E8d));
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-200.0f), (-1000000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2000400.0f) + "'", float2 == (-2000400.0f));
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1758.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11045.839770021712d + "'", double1 == 11045.839770021712d);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(80040.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 502906.1519866541d + "'", double1 == 502906.1519866541d);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(255996.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1608470.3058967453d + "'", double1 == 1608470.3058967453d);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.317362E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.225952419961969E8d + "'", double1 == 5.225952419961969E8d);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3999216.0f), 400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7997632.0f) + "'", float2 == (-7997632.0f));
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(64.0f, 248.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 624.0f + "'", float2 == 624.0f);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 8.176524E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.931228E10f + "'", float2 == 7.931228E10f);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-170468.0f), 315604.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 290272.0f + "'", float2 == 290272.0f);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 770.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7700.0f + "'", float2 == 7700.0f);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-3.9998E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-167480.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1052307.875246437d) + "'", double1 == (-1052307.875246437d));
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 485524.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-485524.0f) + "'", float2 == (-485524.0f));
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-37728.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37728.0f + "'", float2 == 37728.0f);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2984.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18749.024956623885d + "'", double1 == 18749.024956623885d);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1428992.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(83800.0f, 3180.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 173960.0f + "'", float2 == 173960.0f);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 384.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 768.0f + "'", float2 == 768.0f);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(10600.0f, (-1980000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3938800.0f) + "'", float2 == (-3938800.0f));
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1528.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9600.707149370408d) + "'", double1 == (-9600.707149370408d));
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3919064.0f), 40110.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7757908.0f) + "'", float2 == (-7757908.0f));
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(13760.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 86456.6298267911d + "'", double1 == 86456.6298267911d);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-100220.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-629700.8314855382d) + "'", double1 == (-629700.8314855382d));
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-335856.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2110245.484528107d) + "'", double1 == (-2110245.484528107d));
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 3771360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3771360.0f + "'", float2 == 3771360.0f);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) -1, 652816.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1305630.0f + "'", float2 == 1305630.0f);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 104.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3328.0f + "'", float2 == 3328.0f);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 240440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4044E7f + "'", float2 == 2.4044E7f);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 8.317362E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.201344E8f, 336000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2409408E9f + "'", float2 == 1.2409408E9f);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1594520.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0018664636003993E7d) + "'", double1 == (-1.0018664636003993E7d));
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 9577408.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.577408E8f + "'", float2 == 9.577408E8f);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.100672E8f, 85128.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.2030464E8f + "'", float2 == 6.2030464E8f);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 1.1418496E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1418496E9f + "'", float2 == 1.1418496E9f);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4809464.0f, 1.6516372E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.265167E7f + "'", float2 == 4.265167E7f);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(80000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 502654.8245743669d + "'", double1 == 502654.8245743669d);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(246400.0f, 640080.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1772960.0f + "'", float2 == 1772960.0f);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.0f, 2128000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4256002.0f + "'", float2 == 4256002.0f);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9.577408E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.017662922646422E9d + "'", double1 == 6.017662922646422E9d);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 20200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20200.0f + "'", float2 == 20200.0f);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(788.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4951.1500220575135d + "'", double1 == 4951.1500220575135d);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 788.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.336E7f), 857460.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2500508E8f) + "'", float2 == (-1.2500508E8f));
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.1418496E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.174452629728887E8d + "'", double1 == 7.174452629728887E8d);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-100220.0f), 1.8067968E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5935496E7f + "'", float2 == 3.5935496E7f);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 20020.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-20020.0f) + "'", float2 == (-20020.0f));
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-332536.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 332536.0f + "'", float2 == 332536.0f);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.999216E8f, (-19864.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.9980346E8f + "'", float2 == 7.9980346E8f);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-100000.0f), 118200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36400.0f + "'", float2 == 36400.0f);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 38784.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 77568.0f + "'", float2 == 77568.0f);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8447160.0f, (-192.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6893936E7f + "'", float2 == 1.6893936E7f);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 2858864.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.858864E7f + "'", float2 == 2.858864E7f);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-335856.0f), 1.65133E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3026533E11f + "'", float2 == 3.3026533E11f);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 2104440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.10444E7f + "'", float2 == 2.10444E7f);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1000000.0f), 713654.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-572692.0f) + "'", float2 == (-572692.0f));
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 1.1418496E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1075941E10f + "'", float2 == 1.1075941E10f);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7700.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48380.526865282816d + "'", double1 == 48380.526865282816d);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 10600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1060000.0f + "'", float2 == 1060000.0f);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4357600.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.7379608294565763E7d) + "'", double1 == (-2.7379608294565763E7d));
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(81280.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 510697.30176755675d + "'", double1 == 510697.30176755675d);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(120.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 753.9822368615503d + "'", double1 == 753.9822368615503d);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1000.0f), 20200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38400.0f + "'", float2 == 38400.0f);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.6513299E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0375611890650042E10d + "'", double1 == 1.0375611890650042E10d);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 4209192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4209192.0f) + "'", float2 == (-4209192.0f));
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 713850.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.28432E7f + "'", float2 == 2.28432E7f);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2020.0f, 3100672.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6205384.0f + "'", float2 == 6205384.0f);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-768.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4825.486315913922d) + "'", double1 == (-4825.486315913922d));
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(249632.0f, 332.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 499928.0f + "'", float2 == 499928.0f);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 20728.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 4.012876E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(80348.0f, 398680.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 958056.0f + "'", float2 == 958056.0f);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (-7.759605E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.7596047E9f) + "'", float2 == (-7.7596047E9f));
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-315604.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-631208.0f) + "'", float2 == (-631208.0f));
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1305630.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.569705E7f + "'", float2 == 4.569705E7f);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-382.0f), 4.510899E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.021722E7f + "'", float2 == 9.021722E7f);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-631208.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3965996.831374212d) + "'", double1 == (-3965996.831374212d));
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 1000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2000.0f + "'", float2 == 2000.0f);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 713654.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.13654E7f + "'", float2 == 7.13654E7f);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.98E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2440706908215581E8d) + "'", double1 == (-1.2440706908215581E8d));
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-296.0f), 316376.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 632160.0f + "'", float2 == 632160.0f);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2666.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16750.972028940778d + "'", double1 == 16750.972028940778d);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-8019600.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8019600.0f + "'", float2 == 8019600.0f);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7700.0f, 1982680.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3980760.0f + "'", float2 == 3980760.0f);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-332536.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.2255992E7f) + "'", float2 == (-3.2255992E7f));
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1.7781952E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.223683E8f + "'", float2 == 6.223683E8f);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 21280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-21280.0f) + "'", float2 == (-21280.0f));
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(52.0f, (-341336.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-682568.0f) + "'", float2 == (-682568.0f));
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 4005400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0054E8f + "'", float2 == 4.0054E8f);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.5935496E7f, (-4.012876E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8386528.0f) + "'", float2 == (-8386528.0f));
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.317362E7f, (-332536.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6568216E8f + "'", float2 == 1.6568216E8f);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(20440.0f, 2.10444E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.212968E7f + "'", float2 == 4.212968E7f);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 1944.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1944.0f + "'", float2 == 1944.0f);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 130192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 713654.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1427308.0f + "'", float2 == 1427308.0f);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-62656.0f), (-7757908.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5641128E7f) + "'", float2 == (-1.5641128E7f));
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.8579916E7f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.715983E7f + "'", float2 == 5.715983E7f);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-100220.0f), (-4012876.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8226192.0f) + "'", float2 == (-8226192.0f));
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10000.0f + "'", float2 == 10000.0f);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3646240.0f, (-74396.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7143688.0f + "'", float2 == 7143688.0f);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 3.2480207E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.248021E11f + "'", float2 == 3.248021E11f);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-4357600.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.3576E7f) + "'", float2 == (-4.3576E7f));
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(89104.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 559856.9436109299d + "'", double1 == 559856.9436109299d);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-16.0f), (-21280.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-42592.0f) + "'", float2 == (-42592.0f));
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 85360.0f + "'", float2 == 85360.0f);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 576.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20160.0f + "'", float2 == 20160.0f);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(248.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1558.2299561805373d + "'", double1 == 1558.2299561805373d);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(85492.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 537162.0782813972d + "'", double1 == 537162.0782813972d);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.248021E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.040791687358782E12d + "'", double1 == 2.040791687358782E12d);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 19440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(20020.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40040.0f + "'", float2 == 40040.0f);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-125712.0f), 1428992.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2606560.0f + "'", float2 == 2606560.0f);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-3.879806E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.879806E8f) + "'", float2 == (-3.879806E8f));
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 520.0f + "'", float2 == 520.0f);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1605516.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.008775454164174E7d + "'", double1 == 1.008775454164174E7d);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-38608.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-38608.0f) + "'", float2 == (-38608.0f));
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-39300.0f), 880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-76840.0f) + "'", float2 == (-76840.0f));
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40000.0f + "'", float2 == 40000.0f);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3999216.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5127815211437516E7d) + "'", double1 == (-2.5127815211437516E7d));
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(83800.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 526530.9287416494d + "'", double1 == 526530.9287416494d);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(64.0f, 77568.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 155264.0f + "'", float2 == 155264.0f);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-168028.0f), (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-336058.0f) + "'", float2 == (-336058.0f));
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-62656.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2004992.0f) + "'", float2 == (-2004992.0f));
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.212968E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6470858637217766E8d + "'", double1 == 2.6470858637217766E8d);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1212.0f, 80348.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 163120.0f + "'", float2 == 163120.0f);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 386.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37442.0f + "'", float2 == 37442.0f);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(40000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 251327.41228718346d + "'", double1 == 251327.41228718346d);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 1.6513299E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 1060000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1060000.0f + "'", float2 == 1060000.0f);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.65133E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.037561192281995E12d + "'", double1 == 1.037561192281995E12d);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 1.6568216E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6568216E8f + "'", float2 == 1.6568216E8f);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1000000.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6283185.307179586d) + "'", double1 == (-6283185.307179586d));
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-2004992.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2004992.0f + "'", float2 == 2004992.0f);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 4039800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8079600.0f + "'", float2 == 8079600.0f);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 1.9510816E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9510816E7f + "'", float2 == 1.9510816E7f);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-394.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2475.5750110287568d) + "'", double1 == (-2475.5750110287568d));
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-168028.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1055751.0607947714d) + "'", double1 == (-1055751.0607947714d));
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 10L, (-30.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-40.0f) + "'", float2 == (-40.0f));
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.012876E7f), 3316.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.025089E7f) + "'", float2 == (-8.025089E7f));
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-168388.0f), (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-336576.0f) + "'", float2 == (-336576.0f));
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-30.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-188.49555921538757d) + "'", double1 == (-188.49555921538757d));
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(499928.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 999856.0f + "'", float2 == 999856.0f);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(96896.0f, 100220.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 394232.0f + "'", float2 == 394232.0f);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1002200.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2004600.0f + "'", float2 == 2004600.0f);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8019600.0f), (-341336.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6721872E7f) + "'", float2 == (-1.6721872E7f));
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8754832.0f, 1982680.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.1475024E7f + "'", float2 == 2.1475024E7f);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6400.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12800.0f + "'", float2 == 12800.0f);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3328.0f, 2.1475024E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2956704E7f + "'", float2 == 4.2956704E7f);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.2030464E8f, 5798524.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2522063E9f + "'", float2 == 1.2522063E9f);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 9577408.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.290086E8f + "'", float2 == 9.290086E8f);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-768.0f), (-8019600.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6040736E7f) + "'", float2 == (-1.6040736E7f));
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8447160.0f, 1.98268E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.1343034E8f + "'", float2 == 4.1343034E8f);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(80002.0f, 10608.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 181220.0f + "'", float2 == 181220.0f);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 428944.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3726208E7f + "'", float2 == 1.3726208E7f);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(341576.0f, 200640.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1084432.0f + "'", float2 == 1084432.0f);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4012876.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8025752.0f) + "'", float2 == (-8025752.0f));
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(304.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1910.088333382594d + "'", double1 == 1910.088333382594d);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1305630.0f, 640.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2612540.0f + "'", float2 == 2612540.0f);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4060.0f, 261244.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 530608.0f + "'", float2 == 530608.0f);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1436.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9022.654101109885d + "'", double1 == 9022.654101109885d);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-1.5725456E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.50391E8f) + "'", float2 == (-5.50391E8f));
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 9.021722E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-399980.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-799960.0f) + "'", float2 == (-799960.0f));
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) ' ', (-768.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1472.0f) + "'", float2 == (-1472.0f));
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7700.0f, 4060.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 23520.0f + "'", float2 == 23520.0f);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3500.0f + "'", float2 == 3500.0f);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3180.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6360.0f + "'", float2 == 6360.0f);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 2026656.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.093296E7f + "'", float2 == 7.093296E7f);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-3820.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1000.0f + "'", float2 == 1000.0f);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-200000.0f), 4.128322E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.252644E8f + "'", float2 == 8.252644E8f);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.428992E7f, 246400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.907264E7f + "'", float2 == 2.907264E7f);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 384.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38400.0f + "'", float2 == 38400.0f);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1472.0f), (-198640.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-400224.0f) + "'", float2 == (-400224.0f));
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 127888.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6650176.0f + "'", float2 == 6650176.0f);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1075941E10f, 9.021722E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2332318E10f + "'", float2 == 2.2332318E10f);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1117368.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7020630.20031264d + "'", double1 == 7020630.20031264d);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-200.0f), (-42592.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-85584.0f) + "'", float2 == (-85584.0f));
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-332536.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2089385.309308271d) + "'", double1 == (-2089385.309308271d));
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 640.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33280.0f + "'", float2 == 33280.0f);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(178000.0f, (-3820.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 348360.0f + "'", float2 == 348360.0f);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(394232.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2477032.7100200225d + "'", double1 == 2477032.7100200225d);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(19440.0f, 652816.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1344512.0f + "'", float2 == 1344512.0f);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 42678.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 1.6896E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6896E7f + "'", float2 == 1.6896E7f);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 58880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 58880.0f + "'", float2 == 58880.0f);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-296.0f), (-83800.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-168192.0f) + "'", float2 == (-168192.0f));
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1000000.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2000000.0f + "'", float2 == 2000000.0f);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2404400.0f, 3028.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4814856.0f + "'", float2 == 4814856.0f);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4060.0f, 40000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 88120.0f + "'", float2 == 88120.0f);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 88120.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-88120.0f) + "'", float2 == (-88120.0f));
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(80800.0f, 2.28432E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5848E7f + "'", float2 == 4.5848E7f);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 4851360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.697976E8f + "'", float2 == 1.697976E8f);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-332536.0f), 1.6159304E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1653536E7f + "'", float2 == 3.1653536E7f);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(127888.0f, 12800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 281376.0f + "'", float2 == 281376.0f);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(23520.0f, 20200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 87440.0f + "'", float2 == 87440.0f);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.9964736E8f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.992947E8f + "'", float2 == 7.992947E8f);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.6040736E7f), 400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.2080672E7f) + "'", float2 == (-3.2080672E7f));
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) 10, (-3999216.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7998412.0f) + "'", float2 == (-7998412.0f));
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3200.0f + "'", float2 == 3200.0f);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 3.1653536E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1653535E9f + "'", float2 == 3.1653535E9f);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.759605E7f), 404.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.551913E8f) + "'", float2 == (-1.551913E8f));
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 3.96536E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.96536E9f + "'", float2 == 3.96536E9f);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 4808800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8088E7f + "'", float2 == 4.8088E7f);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-76840.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-482799.9590036794d) + "'", double1 == (-482799.9590036794d));
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(42678.0f, 1.1418496E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2837844E9f + "'", float2 == 2.2837844E9f);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(291616.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1832277.3665384823d + "'", double1 == 1832277.3665384823d);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 2404400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2404400.0f + "'", float2 == 2404400.0f);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(38400.0f, (-631208.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1185616.0f) + "'", float2 == (-1185616.0f));
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(20440.0f, 332536.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 705952.0f + "'", float2 == 705952.0f);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1772960.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1139836222217118E7d + "'", double1 == 1.1139836222217118E7d);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-100220.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1002200.0f) + "'", float2 == (-1002200.0f));
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 6205384.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3180.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19980.529276831083d + "'", double1 == 19980.529276831083d);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3820.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-24001.76787342602d) + "'", double1 == (-24001.76787342602d));
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 68.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 680.0f + "'", float2 == 680.0f);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 1297160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2594320.0f + "'", float2 == 2594320.0f);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9700.0f + "'", float2 == 9700.0f);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 3980760.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2738432E8f + "'", float2 == 1.2738432E8f);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.00002E8f, 4.8088E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.9618E8f + "'", float2 == 4.9618E8f);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-100220.0f), 880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-198680.0f) + "'", float2 == (-198680.0f));
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.1343034E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.59765941269752E9d + "'", double1 == 2.59765941269752E9d);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.7409584E7f, (-30.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4819108E7f + "'", float2 == 3.4819108E7f);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 222562.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7789670.0f + "'", float2 == 7789670.0f);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-8.025089E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.025089E9f) + "'", float2 == (-8.025089E9f));
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3028.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19025.485110139787d + "'", double1 == 19025.485110139787d);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-83800.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 10600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1060000.0f + "'", float2 == 1060000.0f);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(24640.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 154817.68596890502d + "'", double1 == 154817.68596890502d);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 1.6353052E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.503587E10f + "'", float2 == 8.503587E10f);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 85360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 853600.0f + "'", float2 == 853600.0f);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2662.0f, 1.6553288E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.310663E9f + "'", float2 == 3.310663E9f);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-125712.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1257120.0f) + "'", float2 == (-1257120.0f));
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(156.0f, 38.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 388.0f + "'", float2 == 388.0f);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 4814856.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.814856E8f + "'", float2 == 4.814856E8f);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.223683E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.910455483878043E9d + "'", double1 == 3.910455483878043E9d);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(85360.0f, (-16.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 170688.0f + "'", float2 == 170688.0f);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1000000.0f, 12800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2025600.0f + "'", float2 == 2025600.0f);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.6353052E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0274925705925339E10d + "'", double1 == 1.0274925705925339E10d);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(37442.0f, 487684.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1050252.0f + "'", float2 == 1050252.0f);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2004992.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2597736275412614E7d + "'", double1 == 1.2597736275412614E7d);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 44656.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44656.0f + "'", float2 == 44656.0f);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(632160.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1264320.0f + "'", float2 == 1264320.0f);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(652816.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4101763.899491749d + "'", double1 == 4101763.899491749d);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(68.0f, 83800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 167736.0f + "'", float2 == 167736.0f);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.1418496E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.174452629728888E10d + "'", double1 == 7.174452629728888E10d);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-764.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-26740.0f) + "'", float2 == (-26740.0f));
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(40400.0f, 770.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 82340.0f + "'", float2 == 82340.0f);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-4209192.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1976.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12415.574166986862d) + "'", double1 == (-12415.574166986862d));
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(92560.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 185120.0f + "'", float2 == 185120.0f);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-478240.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.67384E7f) + "'", float2 == (-1.67384E7f));
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7997632.0f), (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5995194E7f) + "'", float2 == (-1.5995194E7f));
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(163120.0f, 11520.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 349280.0f + "'", float2 == 349280.0f);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4000.0f + "'", float2 == 4000.0f);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 4.012876E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2841203E9f + "'", float2 == 1.2841203E9f);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(36.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 226.1946710584651d + "'", double1 == 226.1946710584651d);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(106.0f, 58880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 117972.0f + "'", float2 == 117972.0f);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.012876E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.521364352273359E8d + "'", double1 == 2.521364352273359E8d);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(104.0f, 1.3726208E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7452624E7f + "'", float2 == 2.7452624E7f);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 33280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 332800.0f + "'", float2 == 332800.0f);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(155264.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 975552.4835339313d + "'", double1 == 975552.4835339313d);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1.67384E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 20200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2020000.0f + "'", float2 == 2020000.0f);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 2.4044E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.4044E7f) + "'", float2 == (-2.4044E7f));
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 2.907264E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.907264E7f + "'", float2 == 2.907264E7f);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 5200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10400.0f + "'", float2 == 10400.0f);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(386.0f, 1944.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4660.0f + "'", float2 == 4660.0f);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1780.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1780.0f) + "'", float2 == (-1780.0f));
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 316376.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6451552E7f + "'", float2 == 1.6451552E7f);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.28432E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.435280586089647E8d + "'", double1 == 1.435280586089647E8d);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(356828.0f, (-478240.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-242824.0f) + "'", float2 == (-242824.0f));
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 87440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 874400.0f + "'", float2 == 874400.0f);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1117368.0f, 1136.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2237008.0f + "'", float2 == 2237008.0f);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.4044E7f, 80208.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8248416E7f + "'", float2 == 4.8248416E7f);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.98E7f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.96E7f) + "'", float2 == (-3.96E7f));
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 19440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 194400.0f + "'", float2 == 194400.0f);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(315604.0f, 8447160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7525528E7f + "'", float2 == 1.7525528E7f);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 194400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 194400.0f + "'", float2 == 194400.0f);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', (-3.9998E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.879806E10f) + "'", float2 == (-3.879806E10f));
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8447160.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.307507159939511E7d + "'", double1 == 5.307507159939511E7d);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4814856.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0252632475385472E7d + "'", double1 == 3.0252632475385472E7d);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 648480.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 648480.0f + "'", float2 == 648480.0f);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(44656.0f, 1050252.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2189816.0f + "'", float2 == 2189816.0f);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 578656.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-578656.0f) + "'", float2 == (-578656.0f));
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(874400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5494017.23259783d + "'", double1 == 5494017.23259783d);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2004992.0f, 4809464.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3628912E7f + "'", float2 == 1.3628912E7f);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(117972.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 741239.9370585901d + "'", double1 == 741239.9370585901d);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1944.0f, 85184.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 174256.0f + "'", float2 == 174256.0f);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.4819108E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.187749077946992E8d + "'", double1 == 2.187749077946992E8d);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2000020.0f, 2004600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8009240.0f + "'", float2 == 8009240.0f);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-26740.0f), (-1257120.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2567720.0f) + "'", float2 == (-2567720.0f));
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-168388.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1058013.007505356d) + "'", double1 == (-1058013.007505356d));
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1305630.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8203515.232612883d + "'", double1 == 8203515.232612883d);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-578656.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3635802.8771113106d) + "'", double1 == (-3635802.8771113106d));
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(87440.0f, 440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 175760.0f + "'", float2 == 175760.0f);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-3919064.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.9980346E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.025313323370655E9d + "'", double1 == 5.025313323370655E9d);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-485524.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4855240.0f) + "'", float2 == (-4855240.0f));
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) -1, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.0f) + "'", float2 == (-6.0f));
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 1332.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13320.0f + "'", float2 == 13320.0f);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.00002E8f, 9.290086E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.258021E9f + "'", float2 == 2.258021E9f);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1492.0f, 632160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1267304.0f + "'", float2 == 1267304.0f);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.9510816E7f, (-296.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.902104E7f + "'", float2 == 3.902104E7f);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.569705E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.871230205750803E8d + "'", double1 == 2.871230205750803E8d);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.2554392E7f, (-8.025089E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1539299E8f) + "'", float2 == (-1.1539299E8f));
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 6400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 640000.0f + "'", float2 == 640000.0f);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1084432.0f, 3200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2175264.0f + "'", float2 == 2175264.0f);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(156.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 980.1769079200154d + "'", double1 == 980.1769079200154d);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (short) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(52.0f, 1.6893936E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3787976E7f + "'", float2 == 3.3787976E7f);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-39864.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.8067968E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(79760.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 501146.8601006438d + "'", double1 == 501146.8601006438d);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(246400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1548176.8596890501d + "'", double1 == 1548176.8596890501d);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-42592.0f), 3100672.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6116160.0f + "'", float2 == 6116160.0f);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3919064.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4624205342696458E7d) + "'", double1 == (-2.4624205342696458E7d));
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(713850.0f, 640000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2707700.0f + "'", float2 == 2707700.0f);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 713654.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 713654.0f + "'", float2 == 713654.0f);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 335856.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7464512E7f + "'", float2 == 1.7464512E7f);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.8248416E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0315373850588846E8d + "'", double1 == 3.0315373850588846E8d);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(158160.0f, 80208.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 476736.0f + "'", float2 == 476736.0f);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.3787976E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.122961143625365E8d + "'", double1 == 2.122961143625365E8d);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.8088E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0214581505165195E8d + "'", double1 == 3.0214581505165195E8d);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.2841203E9f, 38784.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5683182E9f + "'", float2 == 2.5683182E9f);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3999216.0f), 1.98268E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.8853757E8f + "'", float2 == 3.8853757E8f);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-170468.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1071082.0329442897d) + "'", double1 == (-1071082.0329442897d));
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-1.98E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.98E8f) + "'", float2 == (-1.98E8f));
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 3028.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 30280.0f + "'", float2 == 30280.0f);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 80800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8080000.0f + "'", float2 == 8080000.0f);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(164116.0f, (-682568.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1036904.0f) + "'", float2 == (-1036904.0f));
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1117368.0f, (-26740.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2181256.0f + "'", float2 == 2181256.0f);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(22276.0f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44572.0f + "'", float2 == 44572.0f);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 80800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-26740.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26740.0f + "'", float2 == 26740.0f);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-52.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-326.7256359733385d) + "'", double1 == (-326.7256359733385d));
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-1036904.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1036904.0f + "'", float2 == 1036904.0f);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9702616.0f, (-3.2255992E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.510675E7f) + "'", float2 == (-4.510675E7f));
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4357600.0f), 394.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8714412.0f) + "'", float2 == (-8714412.0f));
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.5725456E7f), 38.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.1450836E7f) + "'", float2 == (-3.1450836E7f));
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 1.1075941E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.75949E11f + "'", float2 == 5.75949E11f);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1258.0f, (-8019600.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6036684E7f) + "'", float2 == (-1.6036684E7f));
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 705952.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-705952.0f) + "'", float2 == (-705952.0f));
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.551913E8f), 320008.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.097426E8f) + "'", float2 == (-3.097426E8f));
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 2662.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5324.0f + "'", float2 == 5324.0f);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 174256.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9061312.0f + "'", float2 == 9061312.0f);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(20728.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 130237.86504721847d + "'", double1 == 130237.86504721847d);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 3500.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 112000.0f + "'", float2 == 112000.0f);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 2612540.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.14389E7f + "'", float2 == 9.14389E7f);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 60.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-60.0f) + "'", float2 == (-60.0f));
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.2480208E7f, 156.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.496073E7f + "'", float2 == 6.496073E7f);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(38784.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 243687.05895365306d + "'", double1 == 243687.05895365306d);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9577408.0f, 4.212968E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0341418E8f + "'", float2 == 1.0341418E8f);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(394.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 788.0f + "'", float2 == 788.0f);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(40400.0f, (-631208.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1181616.0f) + "'", float2 == (-1181616.0f));
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 40400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40400.0f + "'", float2 == 40400.0f);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1.1539299E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 11520.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1152000.0f + "'", float2 == 1152000.0f);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 20.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.0f + "'", float2 == 20.0f);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2662.0f, 3500.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12324.0f + "'", float2 == 12324.0f);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1758.0f, 4.569705E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.139762E7f + "'", float2 == 9.139762E7f);
    }
}

