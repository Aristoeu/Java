package Perimeter;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test05501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05501");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-5.1985792E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.2663636447649407E9d) + "'", double1 == (-3.2663636447649407E9d));
    }

    @Test
    public void test05502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05502");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-504064.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3167127.518678171d) + "'", double1 == (-3167127.518678171d));
    }

    @Test
    public void test05503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05503");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.534768E8f, 1.303137E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1675809E9f + "'", float2 == 1.1675809E9f);
    }

    @Test
    public void test05504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05504");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.2151727E10f, 8.252644E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0935632E11f + "'", float2 == 2.0935632E11f);
    }

    @Test
    public void test05505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05505");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.9241084E10f, (-1.2665895E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.315038E10f + "'", float2 == 7.315038E10f);
    }

    @Test
    public void test05506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05506");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.556696E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4913752674282875E9d + "'", double1 == 3.4913752674282875E9d);
    }

    @Test
    public void test05507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05507");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.857856E8f), (-3166360.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.7790394E8f) + "'", float2 == (-3.7790394E8f));
    }

    @Test
    public void test05508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05508");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1.4732173E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4732173E9f + "'", float2 == 1.4732173E9f);
    }

    @Test
    public void test05509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05509");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-1.4870188E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.75846E10f) + "'", float2 == (-4.75846E10f));
    }

    @Test
    public void test05510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05510");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 8180352.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8180352.0f) + "'", float2 == (-8180352.0f));
    }

    @Test
    public void test05511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05511");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 4.9392468E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.939247E12f + "'", float2 == 4.939247E12f);
    }

    @Test
    public void test05512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05512");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-8.025752E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.025752E8f) + "'", float2 == (-8.025752E8f));
    }

    @Test
    public void test05513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05513");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 3771360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3771360.0f) + "'", float2 == (-3771360.0f));
    }

    @Test
    public void test05514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05514");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 3889936.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.889936E8f + "'", float2 == 3.889936E8f);
    }

    @Test
    public void test05515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05515");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.082808E8f, 8355656.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.332729E8f + "'", float2 == 4.332729E8f);
    }

    @Test
    public void test05516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05516");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.9725114E10f, 6832240.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9463893E10f + "'", float2 == 5.9463893E10f);
    }

    @Test
    public void test05517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05517");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.59435E7f, 136.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7188728E8f + "'", float2 == 1.7188728E8f);
    }

    @Test
    public void test05518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05518");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 2531760.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2531760.0f) + "'", float2 == (-2531760.0f));
    }

    @Test
    public void test05519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05519");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(472128.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2966467.712708084d + "'", double1 == 2966467.712708084d);
    }

    @Test
    public void test05520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05520");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-33024.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-330240.0f) + "'", float2 == (-330240.0f));
    }

    @Test
    public void test05521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05521");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.075705E8f), 20160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4151007E9f) + "'", float2 == (-1.4151007E9f));
    }

    @Test
    public void test05522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05522");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-9.478183E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.9553179611439026E10d) + "'", double1 == (-5.9553179611439026E10d));
    }

    @Test
    public void test05523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05523");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) '4', (-1.6067117E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.2134234E9f) + "'", float2 == (-3.2134234E9f));
    }

    @Test
    public void test05524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05524");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(112000.0f, (-1.157262E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.3145017E10f) + "'", float2 == (-2.3145017E10f));
    }

    @Test
    public void test05525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05525");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.5336707E10f), 5.428032E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.981735E10f) + "'", float2 == (-3.981735E10f));
    }

    @Test
    public void test05526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05526");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 3880.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7760.0f + "'", float2 == 7760.0f);
    }

    @Test
    public void test05527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05527");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-2616.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2616.0f) + "'", float2 == (-2616.0f));
    }

    @Test
    public void test05528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05528");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-2438368.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2438368.0f + "'", float2 == 2438368.0f);
    }

    @Test
    public void test05529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05529");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 2.49632E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.49632E9f) + "'", float2 == (-2.49632E9f));
    }

    @Test
    public void test05530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05530");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.88568E8f, 1.3264101E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.029956E9f + "'", float2 == 3.029956E9f);
    }

    @Test
    public void test05531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05531");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 212800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-212800.0f) + "'", float2 == (-212800.0f));
    }

    @Test
    public void test05532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05532");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.635808E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05533");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-572692.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1145384.0f) + "'", float2 == (-1145384.0f));
    }

    @Test
    public void test05534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05534");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(13320.0f, (-52000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-77360.0f) + "'", float2 == (-77360.0f));
    }

    @Test
    public void test05535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05535");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 4.056926E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05536");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 87440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 87440.0f + "'", float2 == 87440.0f);
    }

    @Test
    public void test05537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05537");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.5354108E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.221364113308545E11d + "'", double1 == 2.221364113308545E11d);
    }

    @Test
    public void test05538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05538");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1.6034018E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test05539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05539");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.777715E9f, (-3.2237368E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.4909553E9f + "'", float2 == 7.4909553E9f);
    }

    @Test
    public void test05540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05540");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 1686400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.635808E8f + "'", float2 == 1.635808E8f);
    }

    @Test
    public void test05541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05541");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 2992220.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.99222E7f + "'", float2 == 2.99222E7f);
    }

    @Test
    public void test05542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05542");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 624.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-624.0f) + "'", float2 == (-624.0f));
    }

    @Test
    public void test05543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05543");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.639641E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0302167988921832E9d + "'", double1 == 1.0302167988921832E9d);
    }

    @Test
    public void test05544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05544");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7379144.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4758288E7f + "'", float2 == 1.4758288E7f);
    }

    @Test
    public void test05545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05545");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1.6019625E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6019625E11f) + "'", float2 == (-1.6019625E11f));
    }

    @Test
    public void test05546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05546");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 2.5668506E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.1337013E11f + "'", float2 == 5.1337013E11f);
    }

    @Test
    public void test05547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05547");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(42712.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 268367.4108402545d + "'", double1 == 268367.4108402545d);
    }

    @Test
    public void test05548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05548");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.3818478E9f, (-4007008.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.755682E9f + "'", float2 == 6.755682E9f);
    }

    @Test
    public void test05549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05549");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 1.1976749E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1976749E10f + "'", float2 == 1.1976749E10f);
    }

    @Test
    public void test05550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05550");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1104.0f, 1.3651542E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7303306E8f + "'", float2 == 2.7303306E8f);
    }

    @Test
    public void test05551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05551");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.4887994E8f), 1.1969552E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4738208E9f) + "'", float2 == (-1.4738208E9f));
    }

    @Test
    public void test05552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05552");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, 249632.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 249632.0f + "'", float2 == 249632.0f);
    }

    @Test
    public void test05553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05553");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.29208744E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.118424818599285E8d + "'", double1 == 8.118424818599285E8d);
    }

    @Test
    public void test05554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05554");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-7291712.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.581517770258508E7d) + "'", double1 == (-4.581517770258508E7d));
    }

    @Test
    public void test05555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05555");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-4.2166507E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.2166507E12f) + "'", float2 == (-4.2166507E12f));
    }

    @Test
    public void test05556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05556");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.72256E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.22390902186332E8d + "'", double1 == 4.22390902186332E8d);
    }

    @Test
    public void test05557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05557");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 2.7003894E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05558");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1.929769E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.929769E12f + "'", float2 == 1.929769E12f);
    }

    @Test
    public void test05559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05559");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1680280.0f), 1.6568216E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3102828E9f + "'", float2 == 3.3102828E9f);
    }

    @Test
    public void test05560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05560");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.85524E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0506372630830616E8d) + "'", double1 == (-3.0506372630830616E8d));
    }

    @Test
    public void test05561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05561");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 1.0859834E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.1719668E13f + "'", float2 == 2.1719668E13f);
    }

    @Test
    public void test05562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05562");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.021598E7f, (-4.8087936E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.42561E7f + "'", float2 == 8.42561E7f);
    }

    @Test
    public void test05563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05563");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.0982605E9f, 266200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.1970534E9f + "'", float2 == 4.1970534E9f);
    }

    @Test
    public void test05564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05564");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 2.3988704E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2474126E9f + "'", float2 == 1.2474126E9f);
    }

    @Test
    public void test05565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05565");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-7.526817E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test05566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05566");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.03642906E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.512075816593208E9d) + "'", double1 == (-6.512075816593208E9d));
    }

    @Test
    public void test05567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05567");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.9407497E10f, 1.539768E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.884579E10f + "'", float2 == 7.884579E10f);
    }

    @Test
    public void test05568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05568");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(320000.0f, 1.4148E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8936E7f + "'", float2 == 2.8936E7f);
    }

    @Test
    public void test05569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05569");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 1.0114304E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05570");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-1.6002936E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6002936E9f) + "'", float2 == (-1.6002936E9f));
    }

    @Test
    public void test05571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05571");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(168640.0f, 8.266093E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6535558E9f + "'", float2 == 1.6535558E9f);
    }

    @Test
    public void test05572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05572");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1.8344522E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.8344522E8f) + "'", float2 == (-1.8344522E8f));
    }

    @Test
    public void test05573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05573");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.8956363E8f, 40110.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.792075E8f + "'", float2 == 3.792075E8f);
    }

    @Test
    public void test05574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05574");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.415953E8f, 77000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8334458E8f + "'", float2 == 2.8334458E8f);
    }

    @Test
    public void test05575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05575");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.441856E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.05944843426873E7d + "'", double1 == 9.05944843426873E7d);
    }

    @Test
    public void test05576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05576");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 4.101788E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05577");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2168272.0f, 106.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4336756.0f + "'", float2 == 4336756.0f);
    }

    @Test
    public void test05578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05578");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(9315472.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.8530836799842834E7d + "'", double1 == 5.8530836799842834E7d);
    }

    @Test
    public void test05579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05579");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.20392E7f, 4.21204E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.448158E9f + "'", float2 == 8.448158E9f);
    }

    @Test
    public void test05580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05580");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.5336707E10f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0673414E10f + "'", float2 == 5.0673414E10f);
    }

    @Test
    public void test05581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05581");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4256772.0f, 1766240.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2046024E7f + "'", float2 == 1.2046024E7f);
    }

    @Test
    public void test05582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05582");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.6077792E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0101974807478493E11d + "'", double1 == 1.0101974807478493E11d);
    }

    @Test
    public void test05583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05583");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(376168.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2363533.2506311308d + "'", double1 == 2363533.2506311308d);
    }

    @Test
    public void test05584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05584");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.654552E10f, 1.2596519E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.450214E11f + "'", float2 == 3.450214E11f);
    }

    @Test
    public void test05585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05585");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1446668.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05586");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-7.9773145E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test05587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05587");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1296960.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.53936E7f + "'", float2 == 4.53936E7f);
    }

    @Test
    public void test05588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05588");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.4887994E8f), (-4.3361914E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.672533E13f) + "'", float2 == (-8.672533E13f));
    }

    @Test
    public void test05589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05589");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.585679E10f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9171357E11f + "'", float2 == 1.9171357E11f);
    }

    @Test
    public void test05590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05590");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-40398.0f), 5.350232E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.06996563E9f + "'", float2 == 1.06996563E9f);
    }

    @Test
    public void test05591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05591");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-2.3859936E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.3859937E9f) + "'", float2 == (-2.3859937E9f));
    }

    @Test
    public void test05592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05592");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(788.0f, 1.6179872E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.236132E7f + "'", float2 == 3.236132E7f);
    }

    @Test
    public void test05593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05593");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 2.3037962E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.197974E14f + "'", float2 == 1.197974E14f);
    }

    @Test
    public void test05594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05594");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.6864445E9f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.372889E9f + "'", float2 == 7.372889E9f);
    }

    @Test
    public void test05595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05595");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.635808E8f, 1.1343924E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2720563E11f + "'", float2 == 2.2720563E11f);
    }

    @Test
    public void test05596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05596");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-38200.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-240017.6787342602d) + "'", double1 == (-240017.6787342602d));
    }

    @Test
    public void test05597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05597");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3100672.0f, 2.24808E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.1162944E7f + "'", float2 == 5.1162944E7f);
    }

    @Test
    public void test05598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05598");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.172963E12f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9936314040588395E13d) + "'", double1 == (-1.9936314040588395E13d));
    }

    @Test
    public void test05599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05599");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.4688136E7f), 8.730365E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7459836E12f + "'", float2 == 1.7459836E12f);
    }

    @Test
    public void test05600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05600");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 4876840.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4876840.0f + "'", float2 == 4876840.0f);
    }

    @Test
    public void test05601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05601");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.6273827E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.022514719546195E9d + "'", double1 == 1.022514719546195E9d);
    }

    @Test
    public void test05602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05602");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-764.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4800.353574685204d) + "'", double1 == (-4800.353574685204d));
    }

    @Test
    public void test05603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05603");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.5007355E9f, 3999216.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0094694E9f + "'", float2 == 5.0094694E9f);
    }

    @Test
    public void test05604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05604");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 7.0105236E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.0105236E9f) + "'", float2 == (-7.0105236E9f));
    }

    @Test
    public void test05605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05605");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.5070752E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5752418060634322E9d + "'", double1 == 1.5752418060634322E9d);
    }

    @Test
    public void test05606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05606");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 2464000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4928000.0f + "'", float2 == 4928000.0f);
    }

    @Test
    public void test05607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05607");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1.020656E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.020656E7f) + "'", float2 == (-1.020656E7f));
    }

    @Test
    public void test05608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05608");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-400.0f), 2049600.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4098400.0f + "'", float2 == 4098400.0f);
    }

    @Test
    public void test05609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05609");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.207509E9f, 2.516695E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0518053E12f + "'", float2 == 5.0518053E12f);
    }

    @Test
    public void test05610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05610");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.9547023E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.369768353336275E10d + "'", double1 == 4.369768353336275E10d);
    }

    @Test
    public void test05611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05611");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1.1269235E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1269235E9f) + "'", float2 == (-1.1269235E9f));
    }

    @Test
    public void test05612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05612");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-1.3628912E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3628913E9f) + "'", float2 == (-1.3628913E9f));
    }

    @Test
    public void test05613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05613");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-2531760.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2531760.0f + "'", float2 == 2531760.0f);
    }

    @Test
    public void test05614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05614");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.55598E8f), (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5111958E9f) + "'", float2 == (-1.5111958E9f));
    }

    @Test
    public void test05615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05615");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3646240.0f), 1941940.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3408600.0f) + "'", float2 == (-3408600.0f));
    }

    @Test
    public void test05616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05616");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 200240.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 200240.0f + "'", float2 == 200240.0f);
    }

    @Test
    public void test05617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05617");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7373824.0f), 5.779655E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1559308E14f + "'", float2 == 1.1559308E14f);
    }

    @Test
    public void test05618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05618");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8.678649E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.452955805531587E12d + "'", double1 == 5.452955805531587E12d);
    }

    @Test
    public void test05619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05619");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.5304417E12f, (-4.8579334E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.059912E12f + "'", float2 == 5.059912E12f);
    }

    @Test
    public void test05620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05620");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.0458926E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.571537067473338E9d + "'", double1 == 6.571537067473338E9d);
    }

    @Test
    public void test05621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05621");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.2166507E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.649399789605859E13d + "'", double1 == 2.649399789605859E13d);
    }

    @Test
    public void test05622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05622");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.3160606E11f, 8.441984E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.6338097E11f + "'", float2 == 4.6338097E11f);
    }

    @Test
    public void test05623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05623");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.5162533E10f, 2.585472E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.084216E10f + "'", float2 == 9.084216E10f);
    }

    @Test
    public void test05624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05624");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.7376016E7f, (-1.266816E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9861117E8f) + "'", float2 == (-1.9861117E8f));
    }

    @Test
    public void test05625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05625");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.137232E7f, (-1.0132352E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.99024E7f) + "'", float2 == (-3.99024E7f));
    }

    @Test
    public void test05626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05626");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.931228E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.983337624280098E11d + "'", double1 == 4.983337624280098E11d);
    }

    @Test
    public void test05627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05627");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-7.0105236E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.4048419180748634E10d) + "'", double1 == (-4.4048419180748634E10d));
    }

    @Test
    public void test05628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05628");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.5028224E8f, 5.6346054E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6274856E9f + "'", float2 == 1.6274856E9f);
    }

    @Test
    public void test05629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05629");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.350805E8f, 6.496796E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3263753E10f + "'", float2 == 1.3263753E10f);
    }

    @Test
    public void test05630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05630");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5719808.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.593861358548825E7d + "'", double1 == 3.593861358548825E7d);
    }

    @Test
    public void test05631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05631");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.2608172E10f, 5.209519E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.6258248E10f + "'", float2 == 2.6258248E10f);
    }

    @Test
    public void test05632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05632");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8355656.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6711312E7f + "'", float2 == 1.6711312E7f);
    }

    @Test
    public void test05633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05633");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.0076518E10f, 1.1418496E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.299003E10f + "'", float2 == 8.299003E10f);
    }

    @Test
    public void test05634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05634");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(445124.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2796796.576673006d + "'", double1 == 2796796.576673006d);
    }

    @Test
    public void test05635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05635");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 23800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 23800.0f + "'", float2 == 23800.0f);
    }

    @Test
    public void test05636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05636");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.406823E12f, (-2.5147126E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.813143E12f + "'", float2 == 2.813143E12f);
    }

    @Test
    public void test05637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05637");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-4855240.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.699334E8f) + "'", float2 == (-1.699334E8f));
    }

    @Test
    public void test05638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05638");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5.5055165E9f, 1.7007292E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5115686E11f + "'", float2 == 3.5115686E11f);
    }

    @Test
    public void test05639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05639");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.874811E12f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.062934053400595E13d) + "'", double1 == (-3.062934053400595E13d));
    }

    @Test
    public void test05640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05640");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 8.5463905E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.5463905E11f + "'", float2 == 8.5463905E11f);
    }

    @Test
    public void test05641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05641");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.6656356E9f), 1427312.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.3284165E9f) + "'", float2 == (-3.3284165E9f));
    }

    @Test
    public void test05642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05642");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-524.0f), (-3.835046E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.6701024E8f) + "'", float2 == (-7.6701024E8f));
    }

    @Test
    public void test05643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05643");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.730229E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.972090626722657E11d + "'", double1 == 2.972090626722657E11d);
    }

    @Test
    public void test05644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05644");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.8334458E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7803064767922297E9d + "'", double1 == 1.7803064767922297E9d);
    }

    @Test
    public void test05645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05645");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4357600.0f, 2.50756E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.88664E7f + "'", float2 == 5.88664E7f);
    }

    @Test
    public void test05646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05646");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 3.8603813E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.8603813E10f + "'", float2 == 3.8603813E10f);
    }

    @Test
    public void test05647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05647");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 1.1518982E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1518982E14f) + "'", float2 == (-1.1518982E14f));
    }

    @Test
    public void test05648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05648");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(40040.0f, 9.14389E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8295787E8f + "'", float2 == 1.8295787E8f);
    }

    @Test
    public void test05649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05649");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.8376379E8f, (-9.742374E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5809472E9f) + "'", float2 == (-1.5809472E9f));
    }

    @Test
    public void test05650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05650");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.858864E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.796277228002466E8d + "'", double1 == 1.796277228002466E8d);
    }

    @Test
    public void test05651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05651");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8022000.0f), (-4.0616E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.7276E7f) + "'", float2 == (-9.7276E7f));
    }

    @Test
    public void test05652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05652");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-60560.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 60560.0f + "'", float2 == 60560.0f);
    }

    @Test
    public void test05653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05653");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.9080187E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8271620293445258E11d + "'", double1 == 1.8271620293445258E11d);
    }

    @Test
    public void test05654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05654");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 4953552.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4953552.0f) + "'", float2 == (-4953552.0f));
    }

    @Test
    public void test05655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05655");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.176524E8f, 81280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6354674E9f + "'", float2 == 1.6354674E9f);
    }

    @Test
    public void test05656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05656");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 1629280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1629280.0f) + "'", float2 == (-1629280.0f));
    }

    @Test
    public void test05657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05657");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 1.6893936E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05658");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 1.0826304E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.629678E8f + "'", float2 == 5.629678E8f);
    }

    @Test
    public void test05659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05659");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5225060.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2830020221131768E7d + "'", double1 == 3.2830020221131768E7d);
    }

    @Test
    public void test05660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05660");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-2.1359993E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.1359993E11f) + "'", float2 == (-2.1359993E11f));
    }

    @Test
    public void test05661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05661");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(8000000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.026548245743669E7d + "'", double1 == 5.026548245743669E7d);
    }

    @Test
    public void test05662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05662");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.9236803E9f, 162400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.847685E9f + "'", float2 == 9.847685E9f);
    }

    @Test
    public void test05663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05663");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 8.252644E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.252644E8f + "'", float2 == 8.252644E8f);
    }

    @Test
    public void test05664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05664");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5030160.0f, 1411904.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2884128E7f + "'", float2 == 1.2884128E7f);
    }

    @Test
    public void test05665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05665");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 894740.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8947400.0f + "'", float2 == 8947400.0f);
    }

    @Test
    public void test05666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05666");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1.9087127E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test05667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05667");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 1.2596519E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5193038E11f + "'", float2 == 2.5193038E11f);
    }

    @Test
    public void test05668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05668");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3894608.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4470543762824073E7d) + "'", double1 == (-2.4470543762824073E7d));
    }

    @Test
    public void test05669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05669");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.000684E8f), 220.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4001364E9f) + "'", float2 == (-1.4001364E9f));
    }

    @Test
    public void test05670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05670");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.7319126E8f, 1.101036E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2567102E10f + "'", float2 == 2.2567102E10f);
    }

    @Test
    public void test05671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05671");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.75846E10f), 1.0477905E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.307362E10f) + "'", float2 == (-9.307362E10f));
    }

    @Test
    public void test05672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05672");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-5.1690778E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.169078E9f) + "'", float2 == (-5.169078E9f));
    }

    @Test
    public void test05673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05673");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 2002000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.002E7f + "'", float2 == 2.002E7f);
    }

    @Test
    public void test05674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05674");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.7149842E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0775563670239108E12d + "'", double1 == 1.0775563670239108E12d);
    }

    @Test
    public void test05675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05675");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(316376.0f, (-4.759155E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.517678E9f) + "'", float2 == (-9.517678E9f));
    }

    @Test
    public void test05676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05676");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5.251194E10f), 2662.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0502387E11f) + "'", float2 == (-1.0502387E11f));
    }

    @Test
    public void test05677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05677");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-2.1680968E15f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.3361936E15f) + "'", float2 == (-4.3361936E15f));
    }

    @Test
    public void test05678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05678");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 2562728.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2562728.0f) + "'", float2 == (-2562728.0f));
    }

    @Test
    public void test05679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05679");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.7578717E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7328218818862681E9d) + "'", double1 == (-1.7328218818862681E9d));
    }

    @Test
    public void test05680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05680");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.2497379E10f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.4994759E10f) + "'", float2 == (-2.4994759E10f));
    }

    @Test
    public void test05681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05681");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-2.7052219E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.7052219E13f) + "'", float2 == (-2.7052219E13f));
    }

    @Test
    public void test05682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05682");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.787133E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.264481453448254E11d + "'", double1 == 4.264481453448254E11d);
    }

    @Test
    public void test05683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05683");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1060000.0f, 1.4295891E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8612982E9f + "'", float2 == 2.8612982E9f);
    }

    @Test
    public void test05684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05684");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 1.98268E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.98268E9f + "'", float2 == 1.98268E9f);
    }

    @Test
    public void test05685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05685");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.256646E8f, 3.902104E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7293713E9f + "'", float2 == 1.7293713E9f);
    }

    @Test
    public void test05686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05686");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.170971E8f), 20728.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.341527E8f) + "'", float2 == (-8.341527E8f));
    }

    @Test
    public void test05687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05687");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 3.559568E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05688");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(413588.0f, 20096.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 867368.0f + "'", float2 == 867368.0f);
    }

    @Test
    public void test05689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05689");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-4855240.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test05690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05690");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.5265885E8f, 1.0972032E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2249382E10f + "'", float2 == 2.2249382E10f);
    }

    @Test
    public void test05691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05691");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.830693E7f), (-1980000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4057386E8f) + "'", float2 == (-1.4057386E8f));
    }

    @Test
    public void test05692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05692");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 1.28214E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.28214E13f + "'", float2 == 1.28214E13f);
    }

    @Test
    public void test05693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05693");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-9.48304E7f), (-1.096573E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.382807E9f) + "'", float2 == (-2.382807E9f));
    }

    @Test
    public void test05694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05694");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.9400194E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2189501419882646E11d + "'", double1 == 1.2189501419882646E11d);
    }

    @Test
    public void test05695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05695");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.823784E10f, (-1.6050208E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.6154675E10f + "'", float2 == 3.6154675E10f);
    }

    @Test
    public void test05696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05696");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 4.21204E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.21204E9f + "'", float2 == 4.21204E9f);
    }

    @Test
    public void test05697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05697");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.4732173E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.256497167979074E9d + "'", double1 == 9.256497167979074E9d);
    }

    @Test
    public void test05698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05698");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-3.892E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.892E8f + "'", float2 == 3.892E8f);
    }

    @Test
    public void test05699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05699");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 3.0152484E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0152484E9f) + "'", float2 == (-3.0152484E9f));
    }

    @Test
    public void test05700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05700");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), (-9.061478E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.061478E7f + "'", float2 == 9.061478E7f);
    }

    @Test
    public void test05701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05701");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 3.3306493E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7319377E11f + "'", float2 == 1.7319377E11f);
    }

    @Test
    public void test05702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05702");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 4.5162533E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.5162533E10f) + "'", float2 == (-4.5162533E10f));
    }

    @Test
    public void test05703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05703");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.5871688E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.972475483111925E10d) + "'", double1 == (-9.972475483111925E10d));
    }

    @Test
    public void test05704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05704");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.98268E8f, (-6.1948177E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2389239E13f) + "'", float2 == (-1.2389239E13f));
    }

    @Test
    public void test05705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05705");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.3165325E11f), 1.0490925E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.423246E11f) + "'", float2 == (-6.423246E11f));
    }

    @Test
    public void test05706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05706");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.1009105E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.917224451925061E9d + "'", double1 == 6.917224451925061E9d);
    }

    @Test
    public void test05707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05707");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 1.4483464E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4483464E10f + "'", float2 == 1.4483464E10f);
    }

    @Test
    public void test05708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05708");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 1427312.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.995592E7f + "'", float2 == 4.995592E7f);
    }

    @Test
    public void test05709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05709");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 2.57155E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.1431E13f + "'", float2 == 5.1431E13f);
    }

    @Test
    public void test05710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05710");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.3727788E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1191794200526795E8d + "'", double1 == 2.1191794200526795E8d);
    }

    @Test
    public void test05711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05711");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 591488.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 591488.0f + "'", float2 == 591488.0f);
    }

    @Test
    public void test05712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05712");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.554608E7f, 332800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3175776E8f + "'", float2 == 1.3175776E8f);
    }

    @Test
    public void test05713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05713");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-3.720616E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.720616E10f) + "'", float2 == (-3.720616E10f));
    }

    @Test
    public void test05714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05714");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, (-4.3361968E15f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.336197E17f) + "'", float2 == (-4.336197E17f));
    }

    @Test
    public void test05715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05715");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.5748808E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2461638316416473E10d + "'", double1 == 2.2461638316416473E10d);
    }

    @Test
    public void test05716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05716");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 64000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 640000.0f + "'", float2 == 640000.0f);
    }

    @Test
    public void test05717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05717");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-5.0699926E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.1855703263156643E9d) + "'", double1 == (-3.1855703263156643E9d));
    }

    @Test
    public void test05718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05718");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 1, (-134144.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-134144.0f) + "'", float2 == (-134144.0f));
    }

    @Test
    public void test05719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05719");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-7854408.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7854408.0f) + "'", float2 == (-7854408.0f));
    }

    @Test
    public void test05720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05720");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1812200.0f, 1.6414584E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2829205E12f + "'", float2 == 3.2829205E12f);
    }

    @Test
    public void test05721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05721");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-7.526817E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.729238478388981E12d) + "'", double1 == (-4.729238478388981E12d));
    }

    @Test
    public void test05722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05722");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.2085056E7f), 2.311862E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.623723E14f + "'", float2 == 4.623723E14f);
    }

    @Test
    public void test05723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05723");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6414584E10f, (-2183904.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.28248E10f + "'", float2 == 3.28248E10f);
    }

    @Test
    public void test05724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05724");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(400400.0f, (-2.9030086E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.7980096E8f) + "'", float2 == (-5.7980096E8f));
    }

    @Test
    public void test05725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05725");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(40040.0f, 3.38356E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.7671997E9f + "'", float2 == 6.7671997E9f);
    }

    @Test
    public void test05726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05726");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-1.7464512E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.7464512E9f) + "'", float2 == (-1.7464512E9f));
    }

    @Test
    public void test05727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05727");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.992412E12f, 848.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.984824E12f + "'", float2 == 3.984824E12f);
    }

    @Test
    public void test05728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05728");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.2730317E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0565064561709316E10d + "'", double1 == 2.0565064561709316E10d);
    }

    @Test
    public void test05729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05729");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.0152484E9f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.030497E9f + "'", float2 == 6.030497E9f);
    }

    @Test
    public void test05730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05730");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.1397985E10f, 748840.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.279747E10f + "'", float2 == 4.279747E10f);
    }

    @Test
    public void test05731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05731");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1371844.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.371844E8f + "'", float2 == 1.371844E8f);
    }

    @Test
    public void test05732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05732");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4040000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5384068641005527E7d + "'", double1 == 2.5384068641005527E7d);
    }

    @Test
    public void test05733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05733");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.3043392E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.076177551137755E8d + "'", double1 == 2.076177551137755E8d);
    }

    @Test
    public void test05734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05734");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-4457200.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8914400.0f) + "'", float2 == (-8914400.0f));
    }

    @Test
    public void test05735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05735");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.7517197E11f), (-5.770776E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.7044991E12f) + "'", float2 == (-1.7044991E12f));
    }

    @Test
    public void test05736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05736");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4953552.0f, 35000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9977104.0f + "'", float2 == 9977104.0f);
    }

    @Test
    public void test05737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05737");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.6002936E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0054941435755455E10d) + "'", double1 == (-1.0054941435755455E10d));
    }

    @Test
    public void test05738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05738");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(7.093296E7f, 3.720616E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.583098E9f + "'", float2 == 7.583098E9f);
    }

    @Test
    public void test05739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05739");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-1200.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-120000.0f) + "'", float2 == (-120000.0f));
    }

    @Test
    public void test05740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05740");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1280000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8042477.193189871d + "'", double1 == 8042477.193189871d);
    }

    @Test
    public void test05741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05741");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(272064.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1709428.527412507d + "'", double1 == 1709428.527412507d);
    }

    @Test
    public void test05742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05742");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.1016246E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.921711671650229E10d + "'", double1 == 6.921711671650229E10d);
    }

    @Test
    public void test05743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05743");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 2.201878E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.706573E10f + "'", float2 == 7.706573E10f);
    }

    @Test
    public void test05744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05744");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.0954854E8f), 4.510899E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.288791E8f) + "'", float2 == (-3.288791E8f));
    }

    @Test
    public void test05745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05745");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.045681E8f), (-7.7570775E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5530247E12f) + "'", float2 == (-1.5530247E12f));
    }

    @Test
    public void test05746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05746");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2049600.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.287801660559528E7d + "'", double1 == 1.287801660559528E7d);
    }

    @Test
    public void test05747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05747");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.3313834E13f, 1.2594137E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.6879552E13f + "'", float2 == 2.6879552E13f);
    }

    @Test
    public void test05748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05748");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4953552.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.1124085144750055E7d) + "'", double1 == (-3.1124085144750055E7d));
    }

    @Test
    public void test05749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05749");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4813120.0f, 648480.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.09232E7f + "'", float2 == 1.09232E7f);
    }

    @Test
    public void test05750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05750");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 2290368.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05751");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-2.9030087E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.289628E11f) + "'", float2 == (-9.289628E11f));
    }

    @Test
    public void test05752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05752");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.5937788E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.886356346059307E8d + "'", double1 == 2.886356346059307E8d);
    }

    @Test
    public void test05753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05753");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1941940.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test05754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05754");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1344512.0f, 633112.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3955248.0f + "'", float2 == 3955248.0f);
    }

    @Test
    public void test05755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05755");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 2623536.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05756");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.8624988E9f), 1.655774E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.4134497E9f) + "'", float2 == (-4.4134497E9f));
    }

    @Test
    public void test05757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05757");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 3.2619098E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.2619098E10f) + "'", float2 == (-3.2619098E10f));
    }

    @Test
    public void test05758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05758");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.3257728E8f, (-3.4370634E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.8076114E10f) + "'", float2 == (-6.8076114E10f));
    }

    @Test
    public void test05759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05759");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 30280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05760");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-168028.0f), 1.1269235E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.253511E9f + "'", float2 == 2.253511E9f);
    }

    @Test
    public void test05761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05761");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.6750904E9f, (-3.3106583E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.2886426E8f + "'", float2 == 7.2886426E8f);
    }

    @Test
    public void test05762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05762");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 953470.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05763");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.1653534E11f, 3028.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.330707E11f + "'", float2 == 6.330707E11f);
    }

    @Test
    public void test05764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05764");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.554608E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1183816679921776E8d + "'", double1 == 4.1183816679921776E8d);
    }

    @Test
    public void test05765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05765");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 194400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.944E7f + "'", float2 == 1.944E7f);
    }

    @Test
    public void test05766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05766");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.759155E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.9902654027227324E8d) + "'", double1 == (-2.9902654027227324E8d));
    }

    @Test
    public void test05767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05767");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-6.1948355E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2389671E10f) + "'", float2 == (-1.2389671E10f));
    }

    @Test
    public void test05768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05768");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.8956363E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1910634273579981E9d + "'", double1 == 1.1910634273579981E9d);
    }

    @Test
    public void test05769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05769");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.513993E9f, 6.859429E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.1651743E9f + "'", float2 == 7.1651743E9f);
    }

    @Test
    public void test05770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05770");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 6.4074876E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05771");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', 3.3560758E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1746265E10f + "'", float2 == 1.1746265E10f);
    }

    @Test
    public void test05772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05772");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.3148335E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.261342593932637E10d + "'", double1 == 8.261342593932637E10d);
    }

    @Test
    public void test05773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05773");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-6.4385833E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.438583E11f) + "'", float2 == (-6.438583E11f));
    }

    @Test
    public void test05774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05774");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 2.3038013E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3038013E16f + "'", float2 == 2.3038013E16f);
    }

    @Test
    public void test05775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05775");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, (-5.867085E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.867085E11f) + "'", float2 == (-5.867085E11f));
    }

    @Test
    public void test05776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05776");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 4256002.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4256002.0f) + "'", float2 == (-4256002.0f));
    }

    @Test
    public void test05777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05777");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.758332E7f), (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5516653E8f) + "'", float2 == (-1.5516653E8f));
    }

    @Test
    public void test05778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05778");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.1597751E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.28708205393502E10d + "'", double1 == 7.28708205393502E10d);
    }

    @Test
    public void test05779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05779");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 4045580.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4045580.0f) + "'", float2 == (-4045580.0f));
    }

    @Test
    public void test05780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05780");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 6153000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.96841E8f + "'", float2 == 5.96841E8f);
    }

    @Test
    public void test05781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05781");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7373824.0f), (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4747628E7f) + "'", float2 == (-1.4747628E7f));
    }

    @Test
    public void test05782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05782");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.7163056E7f), 1493870.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.133837E7f) + "'", float2 == (-9.133837E7f));
    }

    @Test
    public void test05783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05783");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.179932E8f, 1.8256962E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.834991E10f + "'", float2 == 3.834991E10f);
    }

    @Test
    public void test05784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05784");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(861840.0f, (-8.113852E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.622598E10f) + "'", float2 == (-1.622598E10f));
    }

    @Test
    public void test05785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05785");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3646240.0f, 1.2878275E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.6485798E8f + "'", float2 == 2.6485798E8f);
    }

    @Test
    public void test05786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05786");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1.3234654E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05787");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 255996.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4831612E7f + "'", float2 == 2.4831612E7f);
    }

    @Test
    public void test05788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05788");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3302400.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0749591158429865E7d) + "'", double1 == (-2.0749591158429865E7d));
    }

    @Test
    public void test05789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05789");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 1.6243773E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6243773E8f + "'", float2 == 1.6243773E8f);
    }

    @Test
    public void test05790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05790");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-672116.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6721160.0f) + "'", float2 == (-6721160.0f));
    }

    @Test
    public void test05791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05791");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(13320.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 83692.02829163209d + "'", double1 == 83692.02829163209d);
    }

    @Test
    public void test05792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05792");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2181256.0f), 1.77296E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1096688E7f + "'", float2 == 3.1096688E7f);
    }

    @Test
    public void test05793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05793");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.8090112E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.76495378995429E9d) + "'", double1 == (-1.76495378995429E9d));
    }

    @Test
    public void test05794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05794");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, 3.9519982E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.951998E10f + "'", float2 == 3.951998E10f);
    }

    @Test
    public void test05795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05795");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(44572.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 89144.0f + "'", float2 == 89144.0f);
    }

    @Test
    public void test05796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05796");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.504384E7f, 3.5051056E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0018979E8f + "'", float2 == 1.0018979E8f);
    }

    @Test
    public void test05797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05797");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', 6.920168E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2144538E12f + "'", float2 == 2.2144538E12f);
    }

    @Test
    public void test05798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05798");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '#', (-3.9953523E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3983734E12f) + "'", float2 == (-1.3983734E12f));
    }

    @Test
    public void test05799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05799");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.481899E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5594230737571014E11d + "'", double1 == 1.5594230737571014E11d);
    }

    @Test
    public void test05800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05800");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.9269445E9f, (-628.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.8538877E9f + "'", float2 == 3.8538877E9f);
    }

    @Test
    public void test05801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05801");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-2.524912E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test05802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05802");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-7670392.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7670392.0f) + "'", float2 == (-7670392.0f));
    }

    @Test
    public void test05803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05803");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.4150974E8f), (-1.6656356E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.6142907E9f) + "'", float2 == (-3.6142907E9f));
    }

    @Test
    public void test05804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05804");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.583098E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.764600903172422E10d + "'", double1 == 4.764600903172422E10d);
    }

    @Test
    public void test05805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05805");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.8256962E10f, 4.295585E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.737304E10f + "'", float2 == 3.737304E10f);
    }

    @Test
    public void test05806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05806");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1104.0f, 8.828515E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7657033E10f + "'", float2 == 1.7657033E10f);
    }

    @Test
    public void test05807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05807");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(80040.0f, 2.085257E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.17053E10f + "'", float2 == 4.17053E10f);
    }

    @Test
    public void test05808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05808");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.403247E8f, 37728.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2807247E9f + "'", float2 == 1.2807247E9f);
    }

    @Test
    public void test05809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05809");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.0436457E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.540697554624626E11d + "'", double1 == 2.540697554624626E11d);
    }

    @Test
    public void test05810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05810");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1.8274558E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8274558E12f + "'", float2 == 1.8274558E12f);
    }

    @Test
    public void test05811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05811");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, (-6.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.0f) + "'", float2 == (-6.0f));
    }

    @Test
    public void test05812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05812");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-1.6232156E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6232156E9f + "'", float2 == 1.6232156E9f);
    }

    @Test
    public void test05813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05813");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.2673242E8f, 1.52516E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0756665E10f + "'", float2 == 3.0756665E10f);
    }

    @Test
    public void test05814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05814");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', 22276.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1158352.0f + "'", float2 == 1158352.0f);
    }

    @Test
    public void test05815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05815");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.5717904E7f, 3.6309226E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.9762035E8f + "'", float2 == 7.9762035E8f);
    }

    @Test
    public void test05816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05816");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 1.0070135E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05817");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.7196515E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0804889244357814E11d) + "'", double1 == (-1.0804889244357814E11d));
    }

    @Test
    public void test05818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05818");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.632042E11f, 6.4E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.265364E11f + "'", float2 == 9.265364E11f);
    }

    @Test
    public void test05819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05819");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-9.517678E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.980133185373034E10d) + "'", double1 == (-5.980133185373034E10d));
    }

    @Test
    public void test05820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05820");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.1177504E8f, 2.4044E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.044301E8f + "'", float2 == 7.044301E8f);
    }

    @Test
    public void test05821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05821");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-2.524912E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.524912E8f) + "'", float2 == (-2.524912E8f));
    }

    @Test
    public void test05822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05822");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1999712.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2564561056990705E7d + "'", double1 == 1.2564561056990705E7d);
    }

    @Test
    public void test05823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05823");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(331600.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2083504.2478607509d + "'", double1 == 2083504.2478607509d);
    }

    @Test
    public void test05824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05824");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, 2.5891062E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5891062E11f + "'", float2 == 2.5891062E11f);
    }

    @Test
    public void test05825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05825");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.5785196E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.918130856222103E9d) + "'", double1 == (-9.918130856222103E9d));
    }

    @Test
    public void test05826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05826");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.0981852E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3183286263553357E12d + "'", double1 == 1.3183286263553357E12d);
    }

    @Test
    public void test05827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05827");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1446668.0f, 9160.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2911656.0f + "'", float2 == 2911656.0f);
    }

    @Test
    public void test05828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05828");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1314624.0f, 2.0355204E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.3339656E7f + "'", float2 == 4.3339656E7f);
    }

    @Test
    public void test05829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05829");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-5.514869E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.514869E9f) + "'", float2 == (-5.514869E9f));
    }

    @Test
    public void test05830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05830");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, 2.9712963E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9712964E10f + "'", float2 == 2.9712964E10f);
    }

    @Test
    public void test05831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05831");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 1812200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1812200.0f + "'", float2 == 1812200.0f);
    }

    @Test
    public void test05832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05832");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.2720563E11f, 7.0532173E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.6851768E11f + "'", float2 == 4.6851768E11f);
    }

    @Test
    public void test05833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05833");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.1195471E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5883878037148945E10d + "'", double1 == 2.5883878037148945E10d);
    }

    @Test
    public void test05834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05834");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.2829205E12f, (-1.1983246E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.541875E12f + "'", float2 == 6.541875E12f);
    }

    @Test
    public void test05835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05835");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 7.570082E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05836");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 240440.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4044E7f + "'", float2 == 2.4044E7f);
    }

    @Test
    public void test05837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05837");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8226192.0f), 1104.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6450176E7f) + "'", float2 == (-1.6450176E7f));
    }

    @Test
    public void test05838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05838");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1493870.0f, 2483394.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7954528.0f + "'", float2 == 7954528.0f);
    }

    @Test
    public void test05839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05839");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1.501465E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.501465E13f + "'", float2 == 1.501465E13f);
    }

    @Test
    public void test05840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05840");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.5946522E7f), (-8019600.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.7932244E7f) + "'", float2 == (-4.7932244E7f));
    }

    @Test
    public void test05841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05841");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.0094694E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.147542478217315E10d + "'", double1 == 3.147542478217315E10d);
    }

    @Test
    public void test05842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05842");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-1000000.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1000000.0f + "'", float2 == 1000000.0f);
    }

    @Test
    public void test05843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05843");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.8985292E9f), 2.1424812E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.87904E8f + "'", float2 == 4.87904E8f);
    }

    @Test
    public void test05844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05844");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.482054E10f, (-1036904.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.9639006E10f + "'", float2 == 4.9639006E10f);
    }

    @Test
    public void test05845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05845");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(6.030497E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.789072868769158E10d + "'", double1 == 3.789072868769158E10d);
    }

    @Test
    public void test05846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05846");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(40398.0f, 2.8014E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.602881E9f + "'", float2 == 5.602881E9f);
    }

    @Test
    public void test05847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05847");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(20840.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 130941.58180162258d + "'", double1 == 130941.58180162258d);
    }

    @Test
    public void test05848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05848");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-1.1555496E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1555496E8f) + "'", float2 == (-1.1555496E8f));
    }

    @Test
    public void test05849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05849");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(590720.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1181460.0f + "'", float2 == 1181460.0f);
    }

    @Test
    public void test05850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05850");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 4.455565E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05851");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 9.937736E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05852");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.6622317E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0444109636734531E12d) + "'", double1 == (-1.0444109636734531E12d));
    }

    @Test
    public void test05853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05853");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.7423081E9f), 1.4295891E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.2543795E8f) + "'", float2 == (-6.2543795E8f));
    }

    @Test
    public void test05854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05854");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.5532544E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.86089411459308E8d) + "'", double1 == (-2.86089411459308E8d));
    }

    @Test
    public void test05855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05855");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.482054E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5595204842408655E11d + "'", double1 == 1.5595204842408655E11d);
    }

    @Test
    public void test05856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05856");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(398680.0f, 6.684616E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3448968E8f + "'", float2 == 1.3448968E8f);
    }

    @Test
    public void test05857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05857");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((float) (byte) 0, (-170468.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-340936.0f) + "'", float2 == (-340936.0f));
    }

    @Test
    public void test05858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05858");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5.356288E8f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0712576E9f) + "'", float2 == (-1.0712576E9f));
    }

    @Test
    public void test05859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05859");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 1, 3.2704924E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2704924E7f + "'", float2 == 3.2704924E7f);
    }

    @Test
    public void test05860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05860");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.344512E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.44781804372664E9d) + "'", double1 == (-8.44781804372664E9d));
    }

    @Test
    public void test05861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05861");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.028312E7f, (-2181256.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5620373E8f + "'", float2 == 1.5620373E8f);
    }

    @Test
    public void test05862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05862");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-91760.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-576545.0837867989d) + "'", double1 == (-576545.0837867989d));
    }

    @Test
    public void test05863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05863");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-3.669417E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.669417E10f + "'", float2 == 3.669417E10f);
    }

    @Test
    public void test05864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05864");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-4357600.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.394432E8f) + "'", float2 == (-1.394432E8f));
    }

    @Test
    public void test05865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05865");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.0054E8f, 4256772.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0959354E8f + "'", float2 == 8.0959354E8f);
    }

    @Test
    public void test05866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05866");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.2996756E10f, 1258.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.599351E10f + "'", float2 == 8.599351E10f);
    }

    @Test
    public void test05867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05867");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.793492E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7552026884814067E9d + "'", double1 == 1.7552026884814067E9d);
    }

    @Test
    public void test05868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05868");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 1.8274558E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.8274558E12f) + "'", float2 == (-1.8274558E12f));
    }

    @Test
    public void test05869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05869");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 1.6243773E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.575646E10f + "'", float2 == 1.575646E10f);
    }

    @Test
    public void test05870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05870");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1283144.0f), 1.2242473E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.448238E10f + "'", float2 == 2.448238E10f);
    }

    @Test
    public void test05871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05871");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2524912.0f), (-1.5946522E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.6942868E7f) + "'", float2 == (-3.6942868E7f));
    }

    @Test
    public void test05872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05872");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-3.097426E12f), (-1.7423081E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.198336E12f) + "'", float2 == (-6.198336E12f));
    }

    @Test
    public void test05873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05873");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2020.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4040.0f + "'", float2 == 4040.0f);
    }

    @Test
    public void test05874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05874");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4953552.0f), (-5.0699677E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0239007E9f) + "'", float2 == (-1.0239007E9f));
    }

    @Test
    public void test05875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05875");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3587616.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2541656139002398E7d + "'", double1 == 2.2541656139002398E7d);
    }

    @Test
    public void test05876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05876");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, (-4.3361936E15f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.3361936E15f + "'", float2 == 4.3361936E15f);
    }

    @Test
    public void test05877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05877");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.51334E8f, 77568.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0282314E8f + "'", float2 == 3.0282314E8f);
    }

    @Test
    public void test05878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05878");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-357280.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2244856.4465491227d) + "'", double1 == (-2244856.4465491227d));
    }

    @Test
    public void test05879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05879");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(170984.0f, 1.33248745E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.6649784E11f + "'", float2 == 2.6649784E11f);
    }

    @Test
    public void test05880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05880");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.0341418E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.497704311972837E8d) + "'", double1 == (-6.497704311972837E8d));
    }

    @Test
    public void test05881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05881");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 174256.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 174256.0f + "'", float2 == 174256.0f);
    }

    @Test
    public void test05882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05882");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(9.080678E9f, 1.72616E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.819588E10f + "'", float2 == 1.819588E10f);
    }

    @Test
    public void test05883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05883");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.9821584E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8737453842562184E8d) + "'", double1 == (-1.8737453842562184E8d));
    }

    @Test
    public void test05884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05884");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.338304E10f), 9.516865E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2773236E11f) + "'", float2 == (-1.2773236E11f));
    }

    @Test
    public void test05885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05885");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 4.0360192E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.0360192E9f) + "'", float2 == (-4.0360192E9f));
    }

    @Test
    public void test05886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05886");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.0699677E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1855546434851375E9d + "'", double1 == 3.1855546434851375E9d);
    }

    @Test
    public void test05887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05887");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.654609E9f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.309218E9f + "'", float2 == 3.309218E9f);
    }

    @Test
    public void test05888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05888");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.0007382E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.287823564626443E10d + "'", double1 == 6.287823564626443E10d);
    }

    @Test
    public void test05889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05889");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, (-7.912595E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.9125955E9f) + "'", float2 == (-7.9125955E9f));
    }

    @Test
    public void test05890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05890");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5.1985792E8f), (-315604.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0403471E9f) + "'", float2 == (-1.0403471E9f));
    }

    @Test
    public void test05891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05891");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(7.4909553E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.706706005150438E10d + "'", double1 == 4.706706005150438E10d);
    }

    @Test
    public void test05892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05892");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 116400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05893");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-6.9742E12f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.382019151300333E13d) + "'", double1 == (-4.382019151300333E13d));
    }

    @Test
    public void test05894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05894");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.7303306E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7155172858335412E9d + "'", double1 == 1.7155172858335412E9d);
    }

    @Test
    public void test05895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05895");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-1.1155458E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1155458E14f) + "'", float2 == (-1.1155458E14f));
    }

    @Test
    public void test05896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05896");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-228.0f), 3.9487312E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.897458E8f + "'", float2 == 7.897458E8f);
    }

    @Test
    public void test05897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05897");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, (-1.2465644E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test05898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05898");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-9.478183E9f), (-5.867085E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1923734E12f) + "'", float2 == (-1.1923734E12f));
    }

    @Test
    public void test05899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05899");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.516E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2091679540043426E9d + "'", double1 == 2.2091679540043426E9d);
    }

    @Test
    public void test05900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05900");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.6227607E11f), (-5.9910753E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.3653427E11f) + "'", float2 == (-3.3653427E11f));
    }

    @Test
    public void test05901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05901");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-9.739029E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.119212266235883E8d) + "'", double1 == (-6.119212266235883E8d));
    }

    @Test
    public void test05902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05902");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-2.0290942E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2749174705484392E12d) + "'", double1 == (-1.2749174705484392E12d));
    }

    @Test
    public void test05903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05903");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.2447402E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0387303940201855E11d + "'", double1 == 2.0387303940201855E11d);
    }

    @Test
    public void test05904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05904");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(36400.0f, 8.3855055E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6771012E12f + "'", float2 == 1.6771012E12f);
    }

    @Test
    public void test05905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05905");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-7.166027E7f), 4.2956704E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.7407136E7f) + "'", float2 == (-5.7407136E7f));
    }

    @Test
    public void test05906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05906");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 1944.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05907");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-8.025693E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.0426915080897E9d) + "'", double1 == (-5.0426915080897E9d));
    }

    @Test
    public void test05908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05908");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-1.6036685E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.339076E9f) + "'", float2 == (-8.339076E9f));
    }

    @Test
    public void test05909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05909");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) -1, 1.4206419E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4206419E11f) + "'", float2 == (-1.4206419E11f));
    }

    @Test
    public void test05910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05910");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.7289144E10f), 8.317362E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.441194E10f) + "'", float2 == (-3.441194E10f));
    }

    @Test
    public void test05911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05911");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(100, (-9.02135E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.02135E9f) + "'", float2 == (-9.02135E9f));
    }

    @Test
    public void test05912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05912");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, 2.4831612E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.4831612E7f) + "'", float2 == (-2.4831612E7f));
    }

    @Test
    public void test05913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05913");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.766141E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.109699072921812E11d + "'", double1 == 1.109699072921812E11d);
    }

    @Test
    public void test05914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05914");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, (-1.5462733E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test05915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05915");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 4.128322E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0044724E10f + "'", float2 == 4.0044724E10f);
    }

    @Test
    public void test05916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05916");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 10, 1933920.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.93392E7f + "'", float2 == 1.93392E7f);
    }

    @Test
    public void test05917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05917");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1212.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7615.220592301658d + "'", double1 == 7615.220592301658d);
    }

    @Test
    public void test05918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05918");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.5532544E7f), 8.2566456E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6422226E10f + "'", float2 == 1.6422226E10f);
    }

    @Test
    public void test05919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05919");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3184752.0f, (-1.2389671E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.4772973E10f) + "'", float2 == (-2.4772973E10f));
    }

    @Test
    public void test05920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05920");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 0, 1885680.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05921");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.1419428E9f), 4.5689687E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.854052E9f + "'", float2 == 4.854052E9f);
    }

    @Test
    public void test05922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05922");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, 2.1719668E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05923");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.4206419E11f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8412838E11f + "'", float2 == 2.8412838E11f);
    }

    @Test
    public void test05924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05924");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((-1), 3.104E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.104E7f) + "'", float2 == (-3.104E7f));
    }

    @Test
    public void test05925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05925");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.2389671E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.784659823506871E10d) + "'", double1 == (-7.784659823506871E10d));
    }

    @Test
    public void test05926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05926");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) 'a', 2.837712E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7525806E10f + "'", float2 == 2.7525806E10f);
    }

    @Test
    public void test05927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05927");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-384.0f), 4.1747222E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.3494443E11f + "'", float2 == 8.3494443E11f);
    }

    @Test
    public void test05928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05928");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.9489312E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.224549588054388E9d) + "'", double1 == (-1.224549588054388E9d));
    }

    @Test
    public void test05929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05929");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-4.1139948E9f), 6.9547023E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.681415E9f + "'", float2 == 5.681415E9f);
    }

    @Test
    public void test05930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05930");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.288791E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.066408354091187E9d) + "'", double1 == (-2.066408354091187E9d));
    }

    @Test
    public void test05931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05931");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.6786432E8f, 700000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3712864E8f + "'", float2 == 3.3712864E8f);
    }

    @Test
    public void test05932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05932");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.209519E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2732373489600306E9d + "'", double1 == 3.2732373489600306E9d);
    }

    @Test
    public void test05933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05933");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) ' ', (-6.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-192.0f) + "'", float2 == (-192.0f));
    }

    @Test
    public void test05934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05934");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(12400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 77911.49780902687d + "'", double1 == 77911.49780902687d);
    }

    @Test
    public void test05935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05935");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.5512264E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.74664274926308E12d + "'", double1 == 9.74664274926308E12d);
    }

    @Test
    public void test05936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05936");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-2.696811E13f), 2.2030385E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.389216E13f) + "'", float2 == (-5.389216E13f));
    }

    @Test
    public void test05937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05937");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.096385E8f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.619277E9f + "'", float2 == 1.619277E9f);
    }

    @Test
    public void test05938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05938");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-4.362066E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.7407668497492805E10d) + "'", double1 == (-2.7407668497492805E10d));
    }

    @Test
    public void test05939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05939");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.155931E14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.262928502448401E14d + "'", double1 == 7.262928502448401E14d);
    }

    @Test
    public void test05940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05940");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 2.0288065E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0288064E13f + "'", float2 == 2.0288064E13f);
    }

    @Test
    public void test05941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05941");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, (-8.422425E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.422425E8f) + "'", float2 == (-8.422425E8f));
    }

    @Test
    public void test05942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05942");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(5.9780936E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.756146967140239E10d + "'", double1 == 3.756146967140239E10d);
    }

    @Test
    public void test05943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05943");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-682568.0f), 8.285224E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6556796E9f + "'", float2 == 1.6556796E9f);
    }

    @Test
    public void test05944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05944");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.7541915E12f, 2.7376016E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3508438E13f + "'", float2 == 1.3508438E13f);
    }

    @Test
    public void test05945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05945");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-4.012876E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.012876E8f) + "'", float2 == (-4.012876E8f));
    }

    @Test
    public void test05946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05946");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(10, (-1.6050208E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.6050208E9f) + "'", float2 == (-1.6050208E9f));
    }

    @Test
    public void test05947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05947");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 591488.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05948");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 5.556706E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.556706E8f + "'", float2 == 5.556706E8f);
    }

    @Test
    public void test05949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05949");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.5475886E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.229015661770328E11d + "'", double1 == 2.229015661770328E11d);
    }

    @Test
    public void test05950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05950");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.6612987E9f), (-3.894608E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4101519E10f) + "'", float2 == (-1.4101519E10f));
    }

    @Test
    public void test05951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05951");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(1.40322E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.816691286740539E8d + "'", double1 == 8.816691286740539E8d);
    }

    @Test
    public void test05952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05952");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-1.947304E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test05953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05953");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(45760.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 287518.5596565379d + "'", double1 == 287518.5596565379d);
    }

    @Test
    public void test05954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05954");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.5010112E9f, 1.3266756E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9535533E10f + "'", float2 == 2.9535533E10f);
    }

    @Test
    public void test05955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05955");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-1.6019625E11f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0065427088840302E12d) + "'", double1 == (-1.0065427088840302E12d));
    }

    @Test
    public void test05956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05956");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 8.813315E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05957");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.969204E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1222430968611538E10d + "'", double1 == 3.1222430968611538E10d);
    }

    @Test
    public void test05958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05958");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) 100, 1.3254295E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3254295E11f + "'", float2 == 1.3254295E11f);
    }

    @Test
    public void test05959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05959");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.9522982E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8549836923980153E9d + "'", double1 == 1.8549836923980153E9d);
    }

    @Test
    public void test05960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05960");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-524.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test05961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05961");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1.2500508E9f), (-42592.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.500187E9f) + "'", float2 == (-2.500187E9f));
    }

    @Test
    public void test05962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05962");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.1927528E11f, 8.59435E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.3872245E11f + "'", float2 == 8.3872245E11f);
    }

    @Test
    public void test05963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05963");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(4.279747E10f, (-504064.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.559393E10f + "'", float2 == 8.559393E10f);
    }

    @Test
    public void test05964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05964");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8079600.0f, 1758000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.96752E7f + "'", float2 == 1.96752E7f);
    }

    @Test
    public void test05965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05965");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(16008.0f, 1.1775408E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3582832E7f + "'", float2 == 2.3582832E7f);
    }

    @Test
    public void test05966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05966");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(37442.0f, 3.4065723E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.8132193E9f + "'", float2 == 6.8132193E9f);
    }

    @Test
    public void test05967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05967");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-7.296693E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.296693E10f) + "'", float2 == (-7.296693E10f));
    }

    @Test
    public void test05968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05968");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-1091432.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1091432.0f + "'", float2 == 1091432.0f);
    }

    @Test
    public void test05969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05969");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 0, (-1.2738432E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test05970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05970");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(1.819588E10f, 2438368.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.639664E10f + "'", float2 == 3.639664E10f);
    }

    @Test
    public void test05971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05971");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 1.1597168E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3194336E7f + "'", float2 == 2.3194336E7f);
    }

    @Test
    public void test05972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05972");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.2460333E10f, 3.516E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.5623867E10f + "'", float2 == 6.5623867E10f);
    }

    @Test
    public void test05973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05973");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 2616.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05974");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.1015003E10f, 4.939247E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0000524E13f + "'", float2 == 1.0000524E13f);
    }

    @Test
    public void test05975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05975");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 10, (-68.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-680.0f) + "'", float2 == (-680.0f));
    }

    @Test
    public void test05976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05976");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(6.755682E9f, 1.6056688E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.224849E12f + "'", float2 == 3.224849E12f);
    }

    @Test
    public void test05977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05977");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(8.984422E9f, 5.0673414E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1931568E11f + "'", float2 == 1.1931568E11f);
    }

    @Test
    public void test05978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05978");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-9.307362E10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.8614724E11f) + "'", float2 == (-1.8614724E11f));
    }

    @Test
    public void test05979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05979");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(2.311862E14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4525857004896802E15d + "'", double1 == 1.4525857004896802E15d);
    }

    @Test
    public void test05980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05980");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (short) -1, (-7.0977356E11f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0977356E11f + "'", float2 == 7.0977356E11f);
    }

    @Test
    public void test05981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05981");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-87884.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-552191.4575361707d) + "'", double1 == (-552191.4575361707d));
    }

    @Test
    public void test05982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05982");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-6.1677696E8f), 4.516044E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.7985336E9f + "'", float2 == 7.7985336E9f);
    }

    @Test
    public void test05983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05983");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-8.113852E10f), (-1.5041409E12f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.1705588E12f) + "'", float2 == (-3.1705588E12f));
    }

    @Test
    public void test05984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05984");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) (byte) 100, 8683872.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.683872E8f + "'", float2 == 8.683872E8f);
    }

    @Test
    public void test05985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05985");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-1976.0f), (-9.88041E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9760824E10f) + "'", float2 == (-1.9760824E10f));
    }

    @Test
    public void test05986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05986");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(1, 89104.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 89104.0f + "'", float2 == 89104.0f);
    }

    @Test
    public void test05987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05987");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle((-5.551417E8f), 1.6513299E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1916315E10f + "'", float2 == 3.1916315E10f);
    }

    @Test
    public void test05988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05988");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(4.5160438E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.837514015730229E12d + "'", double1 == 2.837514015730229E12d);
    }

    @Test
    public void test05989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05989");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(394368.0f, 436800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1662336.0f + "'", float2 == 1662336.0f);
    }

    @Test
    public void test05990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05990");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-3.3306493E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.092708669988904E11d) + "'", double1 == (-2.092708669988904E11d));
    }

    @Test
    public void test05991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05991");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon(0, 7800800.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05992");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(2.0574284E10f, 1.0218103E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4551062E11f + "'", float2 == 2.4551062E11f);
    }

    @Test
    public void test05993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05993");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(3.5588112E10f, 507504.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.117724E10f + "'", float2 == 7.117724E10f);
    }

    @Test
    public void test05994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05994");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, (-1.8941943E15f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.7883885E15f) + "'", float2 == (-3.7883885E15f));
    }

    @Test
    public void test05995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05995");
        double double1 = com.thealgorithms.maths.Perimeter.circumference((-80704.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-507078.18703062134d) + "'", double1 == (-507078.18703062134d));
    }

    @Test
    public void test05996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05996");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(0.0f, 1.992412E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.984824E10f + "'", float2 == 3.984824E10f);
    }

    @Test
    public void test05997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05997");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_polygon((int) '4', (-1.344512E7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.9914624E8f) + "'", float2 == (-6.9914624E8f));
    }

    @Test
    public void test05998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05998");
        float float2 = com.thealgorithms.maths.Perimeter.perimeter_rectangle(5519824.0f, 1347584.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3734816E7f + "'", float2 == 1.3734816E7f);
    }

    @Test
    public void test05999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05999");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.3106583E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.080147961278489E10d + "'", double1 == 2.080147961278489E10d);
    }

    @Test
    public void test06000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test06000");
        double double1 = com.thealgorithms.maths.Perimeter.circumference(3.2075496E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.015362851876976E8d + "'", double1 == 2.015362851876976E8d);
    }
}

