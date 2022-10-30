package LinearCongruentialGenerator;

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
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(52.0d, (double) 0L, (double) (-1));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(3.0d, (double) 1, 13.0d);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(46.0d, 0.0d, 15.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 0, 21.0d, 17.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) ' ', (double) (byte) 1, (-11.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.0d + "'", double4 == 5.0d);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-20.0d), (-23.0d), (-14.0d), (-81.0d));
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-12.0d), 55.0d, (-30.0d));
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '4', (-2.0d), (double) 10.0f, 4.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-2.0d) + "'", double5 == (-2.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-20.0d), (-98.0d), 3.0d, 24.0d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 0, 33.0d, 41.0d);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(49.0d, (double) 100, (double) (byte) 10);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-2.0d), 49.0d, 8.0d);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-88.0d), (double) 1.0f, (-11.0d), (double) 1);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(33.0d, 27.0d, (-13.0d), 6.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-23.0d), 0.0d, (-88.0d));
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(45.0d, (-0.0d), 2.0d, (double) '#');
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-59.0d), 61.0d, 98.0d, (double) 100);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-14.0d), 12.0d, 67.0d);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 10, (double) ' ', (-17.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', 61.0d, (-21.0d), (-7.0d));
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(30.0d, 58.0d, (-8.0d), 41.0d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-85.0d), (-71.0d), 52.0d, 1.0d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', 52.0d, 11.0d, 77.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-18.0d), 76.0d, (double) (short) 100);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(63.0d, 0.0d, (double) (byte) -1);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1.0f), 93.0d, (-2.0d), 32.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-31.0d) + "'", double5 == (-31.0d));
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(7.0d, 11.0d, (-9.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(52.0d, 22.0d, (-32.0d), 15.0d);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(34.0d, (double) 1.0f, Double.NaN);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, (double) (byte) 0, 27.0d, 3.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(74.0d, 30.0d, (-16.0d), (double) (-1L));
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-81.0d), (-18.0d), 9.0d, 53.0d);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) 10.0f, (-24.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-3.0d), (-11.0d), (-10.0d), 70.0d);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(53.0d, 88.0d, 78.0d, (double) 10L);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-85.0d), (double) '4', (double) ' ');
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(45.0d, 98.0d, 25.0d, 12.0d);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-64.0d), 58.0d, 25.0d, 33.0d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, (-2.0d), 25.0d, 76.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-33.0d) + "'", double5 == (-33.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(33.0d, 63.0d, 48.0d, (-26.0d));
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', 0.0d, 20.0d, (double) (byte) 0);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(39.0d, (-71.0d), (double) (short) 10);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(40.0d, (-76.0d), (-9.0d), 40.0d);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(33.0d, (double) (short) 0, 88.0d);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 78.0d, (double) 100.0f);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(82.0d, (-62.0d), 40.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 12.0d + "'", double4 == 12.0d);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-47.0d), 8.0d, (double) 100);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(67.0d, 70.0d, 61.0d);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, 20.0d, (double) 10.0f, 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(5.0d, 6.0d, 27.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 0, 27.0d, 69.0d, 63.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.0d + "'", double5 == 6.0d);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(67.0d, 6.0d, (-1.0d), 88.0d);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 1, 95.0d, (-10.0d));
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-27.0d), (-49.0d), (-23.0d), 27.0d);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-18.0d), 11.0d, 27.0d, (double) 100);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 100, (-63.0d), (-11.0d), 88.0d);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 1, (-16.0d), 37.0d, 67.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 21.0d + "'", double5 == 21.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-31.0d) + "'", double6 == (-31.0d));
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0L, 100.0d, (double) (byte) 0, (double) 1);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-98.0d), (double) 10.0f, (-17.0d), (-17.0d));
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(28.0d, (-2.0d), 15.0d);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 30.0d, 47.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(85.0d, 33.0d, 2.0d, (-59.0d));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100.0f, (double) 10.0f, (-0.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(31.0d, 1.0d, (-27.0d), 58.0d);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0.0f, 45.0d, 77.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(40.0d, 22.0d, 65.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-76.0d), 32.0d, 27.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-14.0d) + "'", double4 == (-14.0d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 16.0d + "'", double5 == 16.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-1.0d), 41.0d, (double) (short) 1, 31.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-9.0d) + "'", double5 == (-9.0d));
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1L, (double) 10, (-45.0d));
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1.0f), (double) (short) 0, 88.0d);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) (short) 1, (double) (-1.0f), (double) (short) 0);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-88.0d), (-45.0d), (-52.0d), 6.0d);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-6.0d), (double) (short) -1, (-88.0d), 49.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1, 44.0d, 37.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 34.0d + "'", double4 == 34.0d);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(34.0d, (double) (byte) 1, (-8.0d), (double) (-1.0f));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-12.0d), 44.0d, (-17.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-6.0d) + "'", double4 == (-6.0d));
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(20.0d, (double) ' ', (double) (-1.0f), (double) (byte) 1);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10, (double) '#', 69.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
        double double7 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass8 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 38.0d + "'", double5 == 38.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 45.0d + "'", double7 == 45.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 0.0d, 38.0d, 14.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(63.0d, 5.0d, (-59.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1, 34.0d, (double) (short) 1, Double.NaN);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-35.0d), 45.0d);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) (byte) -1, (double) 1L);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(31.0d, (-23.0d), 98.0d);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 1, 20.0d, 11.0d, (-45.0d));
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(34.0d, 0.0d, 10.0d, (-62.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-7.0d), (-14.0d), 30.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-22.0d) + "'", double4 == (-22.0d));
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1), 95.0d, (-23.0d));
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(15.0d, 49.0d, (double) 1);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-6.0d), (-1.0d), 50.0d, (double) 1L);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(22.0d, 67.0d, (double) '#', (-3.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass8 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0L, (double) (short) 10, 27.0d, (double) (short) -1);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-27.0d), (-44.0d), 44.0d);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10, (-78.0d), 33.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 16.0d + "'", double4 == 16.0d);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1L), (-32.0d), 48.0d, 38.0d);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0, 11.0d, 57.0d, 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-9.0d), (double) 10L, 52.0d, 28.0d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-89.0d), 98.0d, 5.0d);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 10, (double) 1L, 29.0d, 32.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.0d + "'", double5 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(77.0d, 0.0d, 3.0d, (-3.0d));
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 47.0d, 4.0d, 0.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) (short) 1, (double) (short) 10, (-98.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(14.0d, (double) (byte) 10, (-4.0d), (double) (byte) 100);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(27.0d, 4.0d, (-2.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1L, (double) '4', 28.0d, 41.0d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-78.0d), 89.0d, 76.0d, (-52.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-2.0d) + "'", double5 == (-2.0d));
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-12.0d), 0.0d, 30.0d);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(34.0d, (double) (short) 0, (double) 100.0f, 0.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-16.0d), 29.0d, 71.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-98.0d), (-64.0d), (-16.0d), 0.0d);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '4', 40.0d, 0.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 7.0d, 39.0d, (-52.0d));
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, 38.0d, 0.0d);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-25.0d), 44.0d, (double) 'a', 60.0d);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-27.0d), 82.0d, (-22.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(61.0d, 55.0d, (double) 0.0f);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0, (-7.0d), (-85.0d), 32.0d);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, 5.0d, 12.0d, (-76.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 33.0d + "'", double5 == 33.0d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(67.0d, (-3.0d), 75.0d, 61.0d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(41.0d, 40.0d, 9.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.0d + "'", double4 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-1.0d), 0.0d, (-4.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.0d) + "'", double4 == (-2.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100.0f, (-59.0d), 78.0d);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(52.0d, (-3.0d), (double) 100.0f, 8.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-14.0d), (-47.0d), (double) 100.0f, 29.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(57.0d, 3.0d, 18.0d, (-85.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 19.0d + "'", double5 == 19.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(24.0d, (double) (short) 1, 100.0d, Double.NaN);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', 67.0d, (double) (byte) 0);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, 100.0d, 6.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(28.0d, 24.0d, 8.0d, 81.0d);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(69.0d, (double) 1.0f, 72.0d, (double) (short) 0);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-71.0d), 33.0d, (-63.0d), (double) '4');
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-89.0d), 9.0d, 15.0d, 0.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(89.0d, 57.0d, 23.0d, 2.0d);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10, (double) 1.0f, (double) 1.0f);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(39.0d, 6.0d, (-59.0d));
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0, (double) 0, (double) 100.0f, (double) (byte) 1);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, (double) 1.0f, (double) 10);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-52.0d), (-2.0d), 14.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10.0f, 26.0d, (double) 0, (double) (-1));
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(22.0d, (-17.0d), 15.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-23.0d), 98.0d, (double) (-1.0f));
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, (-27.0d), (double) '#');
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(61.0d, 40.0d, (-21.0d), 46.0d);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-44.0d), (-63.0d), 8.0d);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(52.0d, 26.0d, 7.0d, 57.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(59.0d, (double) (-1.0f), 11.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(36.0d, 27.0d, 11.0d, 0.0d);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-1.0d), 16.0d, (-17.0d), 31.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-7.0d), 47.0d, 28.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9.0d) + "'", double4 == (-9.0d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 26.0d + "'", double5 == 26.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-23.0d) + "'", double6 == (-23.0d));
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(7.0d, (double) 0.0f, (-17.0d), (double) '4');
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-71.0d), (-8.0d), 0.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-18.0d), 78.0d, 51.0d, (-0.0d));
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-13.0d), 41.0d, (double) ' ');
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(2.0d, 67.0d, 2.0d, 52.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 14.0d + "'", double6 == 14.0d);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(34.0d, 22.0d, 26.0d, (double) (byte) 0);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10, 34.0d, (double) 1, (double) (short) 100);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 41.0d + "'", double5 == 41.0d);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-85.0d), 0.0d, (-12.0d));
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(15.0d, (double) (-1L), 45.0d, (double) '4');
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        double double8 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-10.0d), (double) 10, 69.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-15.0d), (-19.0d), 39.0d, 19.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(20.0d, (-1.0d), 49.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(77.0d, (-0.0d), (double) (short) 0, (double) (short) 10);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(30.0d, (-62.0d), (double) (byte) 10, (-1.0d));
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-85.0d), 24.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '4', (-22.0d), (-6.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '#', 1.0d, (double) (short) -1, (double) 100);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-32.0d), (double) 'a', (double) 100, 93.0d);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-10.0d), 67.0d, (double) (byte) 100, 11.0d);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(23.0d, 27.0d, (-1.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(100.0d, 0.0d, 9.0d, (double) '#');
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(51.0d, 25.0d, 0.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-37.0d), 32.0d, (-62.0d));
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 100, (-59.0d), 50.0d, 63.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(20.0d, 74.0d, (double) 1.0f);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(69.0d, 0.0d, 34.0d, 65.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass8 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 34.0d + "'", double5 == 34.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 34.0d + "'", double6 == 34.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 34.0d + "'", double7 == 34.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-8.0d), 47.0d, 28.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-20.0d), 42.0d, (double) 0L);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(52.0d, 56.0d, 98.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, 19.0d, 8.0d, (double) (short) 100);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 43.0d + "'", double5 == 43.0d);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(53.0d, 0.0d, (double) 0);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(58.0d, (-23.0d), 77.0d);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 89.0d, (-11.0d));
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(72.0d, (-0.0d), 37.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0.0f, (-44.0d), (-25.0d));
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10L, 48.0d, (-47.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.0d + "'", double4 == 5.0d);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(44.0d, 89.0d, 40.0d);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(25.0d, 47.0d, (double) 10.0f, (double) (byte) 100);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 85.0d + "'", double5 == 85.0d);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(77.0d, (double) 100L, (-24.0d));
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(69.0d, (double) 1.0f, 72.0d, (double) (short) 0);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0, (double) (short) 0, (double) (-1), 0.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '#', (-85.0d), 8.0d);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-26.0d), 22.0d, (double) (byte) 1, 40.0d);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 1, (-50.0d), (-0.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) ' ', 19.0d, (-11.0d));
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(25.0d, (double) (byte) 100, 14.0d, 25.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 17.0d, 61.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-17.0d), 98.0d, (-31.0d));
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(58.0d, (double) 1, (double) 1.0f, 59.0d);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(53.0d, 31.0d, 10.0d, (double) (-1));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(2.0d, 0.0d, (double) 100.0f);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 42.0d + "'", double4 == 42.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, (-19.0d), 18.0d, 0.0d);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-30.0d), 81.0d, (double) (byte) 100, 13.0d);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(44.0d, (double) (short) 0, 89.0d, (-11.0d));
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(76.0d, 28.0d, (-62.0d), 81.0d);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(69.0d, 0.0d, 50.0d);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 10, (double) ' ', 27.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(3.0d, 61.0d, 0.0d);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-20.0d), (-37.0d), (double) 0.0f, 82.0d);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(40.0d, 45.0d, 10.0d, (-3.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(25.0d, (-22.0d), (double) 100L, 33.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-21.0d) + "'", double5 == (-21.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, (-20.0d), (double) 1L);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-10.0d), (double) (byte) 100, 100.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-80.0d) + "'", double4 == (-80.0d));
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-14.0d), 49.0d, 17.0d, (double) (short) -1);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, 47.0d, (double) 100.0f);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1L), 35.0d, 0.0d, 0.0d);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1.0f), (-3.0d), (-30.0d), (double) (short) 1);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(11.0d, 72.0d, Double.NaN);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, (double) (byte) 100, 65.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(58.0d, 59.0d, (-98.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 0, 48.0d, 24.0d, 52.0d);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-41.0d), 16.0d, 16.0d, 30.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-10.0d) + "'", double5 == (-10.0d));
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(98.0d, (double) 'a', 26.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(33.0d, (-64.0d), (double) '4', (double) (short) 10);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 75.0d, (-2.0d), 71.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-89.0d), 55.0d, 21.0d, 74.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(70.0d, Double.NaN, 0.0d);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, (double) 1.0f, 76.0d);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(56.0d, 22.0d, (-45.0d));
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(44.0d, (-6.0d), 6.0d, (-22.0d));
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100, (-16.0d), 0.0d);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(48.0d, 74.0d, (-22.0d));
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 0, (-64.0d), 40.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 100, (-88.0d), (double) (short) 0, 33.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0L, 75.0d, (double) 10L);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(11.0d, 1.0d, (double) 0L);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(15.0d, 42.0d, 66.0d, 65.0d);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(70.0d, 81.0d, 70.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(52.0d, 11.0d, 93.0d, 37.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass8 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 36.0d + "'", double5 == 36.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 33.0d + "'", double7 == 33.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(13.0d, 82.0d, 70.0d);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, (-6.0d), 25.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.0d) + "'", double4 == (-2.0d));
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(36.0d, 52.0d, (double) (-1L));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(70.0d, (double) (-1L), 29.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(19.0d, 100.0d, (-80.0d));
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-48.0d), (-33.0d), 92.0d, (-2.0d));
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(42.0d, (double) '4', 43.0d, (-26.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(74.0d, (-76.0d), (double) 0.0f);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100, 65.0d, 0.0d, 34.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.0d + "'", double5 == 6.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, 37.0d, (double) 1.0f);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(64.0d, (-59.0d), 37.0d, (double) 0);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(21.0d, (-12.0d), (double) 0);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100.0f, 58.0d, 0.0d, (double) 1);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-16.0d), 59.0d, (-11.0d));
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(60.0d, (-6.0d), (-88.0d));
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1L, (double) ' ', 69.0d, (double) (-1));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10, (double) '#', 69.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 63.0d + "'", double4 == 63.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 44.0d + "'", double5 == 44.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 61.0d + "'", double6 == 61.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(93.0d, 8.0d, 3.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(55.0d, 0.0d, (-49.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(34.0d, 18.0d, 13.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-7.0d), 72.0d, 76.0d);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(50.0d, 92.0d, 10.0d, 49.0d);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-85.0d), (double) '4', (double) ' ');
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-13.0d) + "'", double4 == (-13.0d));
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-41.0d), 16.0d, 16.0d, 30.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-88.0d), 0.0d, (double) '#');
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-0.0d), (-13.0d), (-4.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-49.0d), 11.0d, 71.0d, (double) (short) 1);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, 40.0d, (-24.0d), 81.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(Double.NaN, 13.0d, 21.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(2.0d, 57.0d, (-41.0d), (-8.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-7.0d), 76.0d, (-0.0d), 14.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 44.0d, (double) 'a');
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(19.0d, 18.0d, 50.0d);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10L, 57.0d, (-24.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(13.0d, 30.0d, 22.0d, 65.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 22.0d + "'", double5 == 22.0d);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-8.0d), (-88.0d), (-9.0d));
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-9.0d), Double.NaN, (-17.0d));
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(34.0d, (-22.0d), (double) 10L, 38.0d);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', (double) 10.0f, (double) 0);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(61.0d, 41.0d, (double) 100.0f);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-48.0d), 92.0d, (double) 10L, (-7.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(60.0d, 98.0d, (-21.0d), (double) '#');
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 14.0d + "'", double5 == 14.0d);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(40.0d, 9.0d, 0.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, 63.0d, (double) (byte) 10);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(77.0d, (-26.0d), 22.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100.0f, 0.0d, 18.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10L, 58.0d, (double) 0L, 3.0d);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(44.0d, (-31.0d), 65.0d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(23.0d, 0.0d, 78.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, 21.0d, 24.0d, 15.0d);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-30.0d), (-18.0d), (double) (short) 100);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(78.0d, (-9.0d), (double) '#', 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1, 0.0d, (-49.0d), (double) ' ');
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-4.0d), 47.0d, (double) 1L, (double) 10L);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-7.0d) + "'", double5 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-8.0d) + "'", double6 == (-8.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(31.0d, (-19.0d), (double) '#');
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(18.0d, 89.0d, 40.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10, (double) (byte) 10, Double.NaN);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10L, (double) 1L, 10.0d, (double) (-1L));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-48.0d), (-13.0d), 25.0d, (double) (short) 0);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, (double) '#', 76.0d, (double) 1);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-24.0d), 57.0d, (-26.0d), 63.0d);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(44.0d, 61.0d, 36.0d, 98.0d);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-6.0d), 53.0d, 0.0d);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(45.0d, (double) (byte) 0, (-11.0d), 41.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-11.0d) + "'", double5 == (-11.0d));
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(67.0d, (-13.0d), 2.0d, 52.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(6.0d, (double) (byte) 100, (double) (short) 100);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 16.0d + "'", double4 == 16.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-5.0d), 67.0d, (double) 'a');
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 67.0d + "'", double5 == 67.0d);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10L, (-59.0d), (-63.0d));
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(20.0d, (-15.0d), 35.0d);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100.0f, 47.0d, (-2.0d), 21.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) 1, 95.0d, 59.0d);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 0, 43.0d, 4.0d, (-35.0d));
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-26.0d), 5.0d, (double) (short) 10);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(70.0d, 69.0d, (double) 10L, 27.0d);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) (byte) 0, (-32.0d));
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100, 24.0d, 66.0d);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(27.0d, (double) 0.0f, 20.0d);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-2.0d), 1.0d, 20.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-19.0d) + "'", double4 == (-19.0d));
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(37.0d, (-11.0d), 8.0d, 36.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-7.0d), 82.0d);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, (-33.0d), 13.0d, (-13.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-11.0d) + "'", double5 == (-11.0d));
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-2.0d), (double) '4', (-4.0d));
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 0.0d, (-80.0d));
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 0, 43.0d, 98.0d, 30.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(60.0d, (double) 0L, (-25.0d), 56.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, (-27.0d), (double) '#', 13.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(17.0d, 0.0d, 14.0d);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(31.0d, 19.0d, (-23.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-45.0d), 74.0d, (-24.0d));
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(5.0d, (-76.0d), 16.0d, 13.0d);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(85.0d, 95.0d, 0.0d, 8.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1.0f), (-7.0d), 60.0d, 21.0d);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(13.0d, 45.0d, (-80.0d));
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 18.0d, 10.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.0d + "'", double4 == 8.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(57.0d, (-20.0d), 22.0d);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-37.0d), (-25.0d), (double) 0L, (-10.0d));
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-50.0d), (-44.0d), (-63.0d));
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(45.0d, 47.0d, (-0.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1.0f), (double) (byte) 1, (double) 0);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-85.0d), (-0.0d), 53.0d);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-17.0d), 9.0d, (double) 10, (double) 1.0f);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '4', 12.0d, 70.0d, 2.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(2.0d, (double) 1.0f, (-21.0d), 95.0d);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-41.0d), 72.0d, 22.0d);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1, 18.0d, 24.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-5.0d), 77.0d, (-1.0d), (-4.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-2.0d) + "'", double5 == (-2.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-0.0d), (-45.0d), (-30.0d), 58.0d);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0L, 76.0d, 59.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, (double) (byte) 10, 85.0d);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 0, (double) (short) 10, (-64.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(81.0d, 58.0d, (-11.0d));
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, 51.0d, 0.0d, 29.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-1.0d), 0.0d, 52.0d);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(31.0d, (double) (byte) 10, 37.0d, 22.0d);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, 13.0d, 0.0d, 0.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(21.0d, 49.0d, (double) (byte) 0);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-16.0d), 12.0d, (-23.0d), (-35.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-59.0d), 12.0d, 70.0d, (-80.0d));
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1), 36.0d, 67.0d);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-89.0d), (-59.0d), (double) 1);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, (-5.0d), (-16.0d), (double) 0.0f);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(Double.NaN, 10.0d, 16.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1.0f), 82.0d, (double) (short) 0, (-80.0d));
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(81.0d, (-26.0d), 50.0d, (-20.0d));
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-16.0d), 100.0d);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(18.0d, (double) 100.0f, 47.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-30.0d), 65.0d, (double) ' ');
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) (short) 1, 3.0d, (-19.0d));
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(49.0d, 40.0d, 29.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(59.0d, 27.0d, (-47.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 49.0d, 81.0d, (double) (-1L));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(39.0d, 23.0d, (double) 10L);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.0d + "'", double4 == 3.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 100, 92.0d, 34.0d);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(51.0d, (-7.0d), 43.0d, 1.0d);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(18.0d, (double) (-1.0f), 47.0d, (-10.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-25.0d), 20.0d, Double.NaN, 98.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(13.0d, (-57.0d), 24.0d);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-76.0d), (double) 'a', (-13.0d), 39.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-14.0d) + "'", double5 == (-14.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0.0f, 12.0d, (-64.0d));
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-10.0d), (double) 'a', (-17.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-10.0d) + "'", double4 == (-10.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1L), (-22.0d), (-5.0d), 32.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 1, 0.0d, (-6.0d));
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-50.0d), (double) ' ', (double) 1.0f);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 4.0d, 40.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-14.0d), 8.0d, (double) (byte) 10, (-41.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(36.0d, 8.0d, 67.0d, (-44.0d));
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(35.0d, (-12.0d), (double) 100);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, Double.NaN, (-12.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(63.0d, (-62.0d), (-1.0d), 3.0d);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(35.0d, 6.0d, (-52.0d), 63.0d);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-26.0d), 15.0d, (-0.0d));
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(82.0d, (-9.0d), 89.0d, (-10.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, (double) (short) 100, 98.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 34.0d + "'", double4 == 34.0d);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-3.0d), 11.0d, (-16.0d), 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1, 0.0d, (-59.0d), (-50.0d));
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(61.0d, (double) '4', (-0.0d), (double) 100L);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 72.0d + "'", double5 == 72.0d);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '4', (double) '4', 58.0d);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1.0f, (double) 100.0f, 1.0d, (double) 1.0f);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(6.0d, 36.0d, 72.0d, (double) (-1L));
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(85.0d, 63.0d, 50.0d);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(81.0d, 21.0d, 27.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0.0f, 81.0d, (double) (short) 10, 93.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-5.0d), 60.0d, 14.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9.0d) + "'", double4 == (-9.0d));
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-10.0d), (double) 100L, 43.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(Double.NaN, (double) 1, 0.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-17.0d), (-8.0d), (double) '4');
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-19.0d) + "'", double4 == (-19.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100.0f, 48.0d, (double) (short) 10);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(22.0d, 26.0d, (double) 1L);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0.0f, (double) (short) 0, (double) 100.0f, (double) 0L);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-12.0d), 85.0d, 9.0d, (-16.0d));
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, 32.0d, (-78.0d));
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-62.0d), 32.0d, (-14.0d));
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(9.0d, 15.0d, 93.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(39.0d, (double) ' ', (-76.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(30.0d, (-37.0d), (-76.0d), (double) (byte) -1);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-98.0d), (double) (-1), 95.0d, 0.0d);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-49.0d), 0.0d, 61.0d, 55.0d);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', 77.0d, (double) (byte) 0);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) -1, (double) (byte) -1, 0.0d, (double) 10L);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(56.0d, (double) (byte) 1, 0.0d);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(4.0d, (double) (-1L), (double) (short) -1);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-80.0d), (-41.0d), (-63.0d));
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(60.0d, (double) (short) -1, (-89.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-3.0d), 11.0d, (-16.0d), 0.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-17.0d), (double) 0, (double) ' ', 52.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0, (-14.0d), 81.0d, (-85.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 81.0d + "'", double5 == 81.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(53.0d, (-12.0d), (double) 0);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 100, (double) 0L, (-17.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 11.0d + "'", double4 == 11.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-23.0d), 0.0d, 28.0d);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) '4', (double) (-1), 30.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(72.0d, 16.0d, (double) 1);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(10.0d, (double) 0, (double) 1);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1.0f), (double) (short) 10, 61.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-32.0d) + "'", double4 == (-32.0d));
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-1.0d), 49.0d, (-57.0d));
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(25.0d, 38.0d, (double) 0);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(9.0d, 93.0d, (double) 'a');
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-19.0d), 25.0d, 66.0d);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 33.0d, (-0.0d), 0.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', (double) 100.0f, 47.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, (-24.0d), (-19.0d), 14.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-11.0d) + "'", double5 == (-11.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-85.0d), 81.0d, (double) 100, 63.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-44.0d) + "'", double5 == (-44.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(12.0d, 18.0d, 12.0d, 56.0d);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1L, (double) 'a', (double) '4');
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(Double.NaN, (double) ' ', 78.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-25.0d), 20.0d, Double.NaN, 98.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-81.0d), 0.0d, 9.0d);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(63.0d, (-76.0d), 82.0d);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(22.0d, (double) 0, (double) (-1L), (-3.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-2.0d), (double) (short) -1, 75.0d);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, (double) 'a', (double) 1.0f);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-71.0d), 67.0d, 0.0d);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 0, 45.0d, 93.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(18.0d, (double) 1, 42.0d);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(50.0d, (-12.0d), (double) (byte) -1);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-27.0d), (-22.0d), 29.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-12.0d) + "'", double4 == (-12.0d));
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(42.0d, 50.0d, 47.0d);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 1, Double.NaN, 14.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(10.0d, 2.0d, 8.0d, 40.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 28.0d + "'", double5 == 28.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 24.0d + "'", double6 == 24.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(31.0d, 13.0d, 88.0d, 40.0d);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 0.0d, 15.0d);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-47.0d), 67.0d, 12.0d, 76.0d);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-16.0d), (-49.0d), Double.NaN, 88.0d);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(13.0d, (double) (short) -1, (double) 10.0f, 63.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-0.0d), 50.0d, (-4.0d), 15.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-4.0d) + "'", double5 == (-4.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100, 27.0d, 26.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(38.0d, (double) (byte) 0, 82.0d, (-10.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(23.0d, (-17.0d), 66.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-89.0d), 8.0d, 8.0d, 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) ' ', (-48.0d), 100.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(3.0d, 98.0d, (-41.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.0d + "'", double4 == 6.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0L, (-10.0d), 39.0d);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(53.0d, (double) 1L, Double.NaN);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) 100.0f, (double) 1.0f);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) ' ', 2.0d, 2.0d, 18.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 12.0d + "'", double5 == 12.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(5.0d, (double) 10.0f, 81.0d, 67.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(15.0d, (-6.0d), (-1.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(58.0d, 46.0d, (-89.0d), (-26.0d));
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(16.0d, 44.0d, 24.0d, 81.0d);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(27.0d, 28.0d, 15.0d);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-78.0d), (-24.0d), (-35.0d));
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(9.0d, 59.0d, 21.0d, (-48.0d));
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1.0f), 0.0d, (-41.0d), 88.0d);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(14.0d, 41.0d, 58.0d, (double) (byte) 1);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(43.0d, 52.0d, (-10.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.0d + "'", double4 == 5.0d);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-85.0d), 38.0d, 93.0d, 7.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(21.0d, (double) 0, 52.0d, (double) 10.0f);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(75.0d, 49.0d, (double) (byte) -1, (double) 'a');
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(12.0d, (-11.0d), 20.0d, (double) (short) 100);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(5.0d, (-19.0d), (double) '#', 92.0d);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-14.0d), 77.0d, (-19.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-89.0d), (-0.0d), (double) 0L);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(6.0d, 23.0d, 7.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-4.0d), (-14.0d), 9.0d, (double) (short) 0);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-49.0d), Double.NaN, 60.0d, 42.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(66.0d, 43.0d, 57.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10L, 100.0d, (double) 'a', (double) (byte) 1);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 100, (-7.0d), 29.0d);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(30.0d, 4.0d, 45.0d, (-50.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, (-5.0d), 43.0d, (double) (byte) 100);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(95.0d, 26.0d, 12.0d, (-11.0d));
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, (-88.0d), Double.NaN);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '4', 5.0d, (-7.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.0d + "'", double4 == 3.0d);
    }
}
