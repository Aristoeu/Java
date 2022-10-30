package HeronsFormula;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1579.3872229443925d + "'", double3 == 1579.3872229443925d);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) 'a', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 100, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 0, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 10, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 0, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) -1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) '#', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) '#', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1579.3872229443925d + "'", double3 == 1579.3872229443925d);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 0, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 10, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) -1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) 'a', 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (-1), (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) '#', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (-1), (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 1, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) '#', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4241.393631520187d + "'", double3 == 4241.393631520187d);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4241.393631520187d + "'", double3 == 4241.393631520187d);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) 'a', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) '#', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 1, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) '4', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) -1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 10, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.998798049140657d + "'", double3 == 25.998798049140657d);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) ' ', 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 158.03480629279107d + "'", double3 == 158.03480629279107d);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 484.3552415324934d + "'", double3 == 484.3552415324934d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (-1), (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 100, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 0, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 0, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (-1), 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) ' ', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1722.9947584075815d + "'", double3 == 1722.9947584075815d);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1579.3872229443925d + "'", double3 == 1579.3872229443925d);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) 'a', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (-1), 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) '4', 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4330.127018922193d + "'", double3 == 4330.127018922193d);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 485.02371076061837d + "'", double3 == 485.02371076061837d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 48.499355665823025d + "'", double3 == 48.499355665823025d);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1579.3872229443925d + "'", double3 == 1579.3872229443925d);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1530.7409970337894d + "'", double3 == 1530.7409970337894d);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 10, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 10, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.998046755776157d + "'", double3 == 15.998046755776157d);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2510.582402551249d + "'", double3 == 2510.582402551249d);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 43.30127018922193d + "'", double3 == 43.30127018922193d);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (-1), (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (-1), (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) ' ', 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) 'a', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) '4', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 0, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) -1, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) -1, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) '#', 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) ' ', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (-1), 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) '#', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) -1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) 100, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) -1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2466.056758775029d + "'", double3 == 2466.056758775029d);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) ' ', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) ' ', 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (-1), 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4156.019730463271d + "'", double3 == 4156.019730463271d);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 10, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 0, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 48.499355665823025d + "'", double3 == 48.499355665823025d);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 157.99505530237332d + "'", double3 == 157.99505530237332d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) 'a', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) -1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 484.3552415324934d + "'", double3 == 484.3552415324934d);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (-1), (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 485.02371076061837d + "'", double3 == 485.02371076061837d);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) '#', (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) -1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 10, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 0, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) 'a', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (-1), (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 0, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) '#', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 548.3255761862655d + "'", double3 == 548.3255761862655d);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) ' ', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4330.127018922193d + "'", double3 == 4330.127018922193d);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (-1), (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 10, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 0, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (-1), (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 10, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (-1), 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4330.127018922193d + "'", double3 == 4330.127018922193d);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) ' ', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) 'a', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) 'a', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1722.9947584075815d + "'", double3 == 1722.9947584075815d);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 10, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) '4', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (-1), (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 49.9993749960937d + "'", double3 == 49.9993749960937d);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 0, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (-1), (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 10, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 17.498214194597114d + "'", double3 == 17.498214194597114d);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 0, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (-1), (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) '4', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) 'a', 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4156.019730463271d + "'", double3 == 4156.019730463271d);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 0, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (byte) 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 10, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) -1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (-1), 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) '4', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) 'a', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (short) 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) ' ', 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1579.3872229443925d + "'", double3 == 1579.3872229443925d);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) (short) -1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) 'a', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (-1), (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) '#', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, 0, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (short) 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', (int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 609.1994747207191d + "'", double3 == 609.1994747207191d);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) 'a', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) ' ', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, 1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '#', 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1579.3872229443925d + "'", double3 == 1579.3872229443925d);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 1, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) ' ', 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) '#', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (-1), (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 0, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) '#', 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (byte) 0, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) '#', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) '#', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) '#', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 1, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) 'a', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 909.617467675286d + "'", double3 == 909.617467675286d);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 100, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 499.3746088859545d + "'", double3 == 499.3746088859545d);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (byte) 1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (-1), (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, (int) '#', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, 1, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993746088859544d + "'", double3 == 4.993746088859544d);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(1, 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), 100, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 10, 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 10, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1579.3872229443925d + "'", double3 == 1579.3872229443925d);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 0, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) '4', (int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.998798049140657d + "'", double3 == 25.998798049140657d);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) ' ', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) -1, (int) '4', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) 0, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) 'a', (int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2429.713563365032d + "'", double3 == 2429.713563365032d);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (byte) -1, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 100, (int) (short) 1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (byte) 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 1, (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4330127018922193d + "'", double3 == 0.4330127018922193d);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) 'a', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((int) (short) 0, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons((-1), (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(100, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4330.127018922193d + "'", double3 == 4330.127018922193d);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(10, (int) (short) -1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        double double3 = com.thealgorithms.maths.HeronsFormula.Herons(0, (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }
}

