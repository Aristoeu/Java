package others.LinearCongruentialGenerator;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

    public static boolean debug = false;

    @Test
    public void test9001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9001");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(94.0d, 0.0d, (-90.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test9002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9002");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-51.0d), (double) 100.0f, (-23.0d), (-42.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-41.0d) + "'", double5 == (-41.0d));
    }

    @Test
    public void test9003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9003");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-29.0d), 63.0d, 35.0d, 69.0d);
    }

    @Test
    public void test9004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9004");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-66.0d), 79.0d, (-10.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-7.0d) + "'", double4 == (-7.0d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test9005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9005");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10L, 64.0d, (-31.0d), 0.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9006");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-97.0d), 24.0d, 10.0d, 10.0d);
    }

    @Test
    public void test9007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9007");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(54.0d, (-12.0d), (-58.0d), (-11.0d));
    }

    @Test
    public void test9008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9008");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(19.0d, (double) '#', (-35.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
    }

    @Test
    public void test9009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9009");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-90.0d), 69.0d, (-49.0d), (-60.0d));
    }

    @Test
    public void test9010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9010");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(1.0d, 42.0d, 34.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.0d + "'", double4 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9011");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(95.0d, 37.0d, (-55.0d));
    }

    @Test
    public void test9012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9012");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-0.0d), 41.0d, (-0.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test9013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9013");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(91.0d, (-16.0d), (-16.0d));
    }

    @Test
    public void test9014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9014");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 66.0d, (-14.0d), (-49.0d));
    }

    @Test
    public void test9015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9015");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(13.0d, 52.0d, (double) (byte) 10, 4.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9016");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(99.0d, 0.0d, 19.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test9017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9017");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-14.0d), (-11.0d), 13.0d, (double) 10L);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.0d + "'", double5 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-4.0d) + "'", double6 == (-4.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test9018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9018");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-28.0d), (-14.0d), (-41.0d));
    }

    @Test
    public void test9019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9019");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-72.0d), 97.0d, 74.0d);
    }

    @Test
    public void test9020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9020");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(59.0d, 0.0d, (-48.0d), 51.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9021");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100, 31.0d, (-5.0d), (-18.0d));
    }

    @Test
    public void test9022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9022");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-69.0d), 11.0d, (-83.0d));
    }

    @Test
    public void test9023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9023");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '4', (double) (byte) 100, 100.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 16.0d + "'", double4 == 16.0d);
    }

    @Test
    public void test9024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9024");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-15.0d), 26.0d, Double.NaN, 34.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9025");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(30.0d, 74.0d, (double) (byte) 100, 4.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test9026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9026");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(7.0d, (-4.0d), (-48.0d));
    }

    @Test
    public void test9027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9027");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(7.0d, 54.0d, (-56.0d));
    }

    @Test
    public void test9028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9028");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10L, 8.0d, 60.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 18.0d + "'", double4 == 18.0d);
    }

    @Test
    public void test9029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9029");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(64.0d, (-2.0d), (double) 'a', (-56.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-31.0d) + "'", double5 == (-31.0d));
    }

    @Test
    public void test9030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9030");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(75.0d, 0.0d, 20.0d);
    }

    @Test
    public void test9031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9031");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(38.0d, (double) (short) 0, (-36.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test9032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9032");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(39.0d, 91.0d, 62.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test9033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9033");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(77.0d, 12.0d, (double) (short) -1);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test9034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9034");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(31.0d, (double) (short) 100, (-64.0d));
    }

    @Test
    public void test9035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9035");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-21.0d), (-47.0d), (-32.0d), 21.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9036");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(14.0d, 5.0d, 15.0d, 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test9037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9037");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(18.0d, (double) (short) -1, 67.0d, 5.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9038");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-96.0d), (-50.0d), (double) '#', Double.NaN);
    }

    @Test
    public void test9039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9039");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-56.0d), (-13.0d), (-14.0d), 53.0d);
    }

    @Test
    public void test9040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9040");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(14.0d, (double) (byte) 100, (double) (short) 100);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test9041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9041");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(31.0d, (double) (-1.0f), 38.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test9042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9042");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-26.0d), (double) (byte) 10, 85.0d);
    }

    @Test
    public void test9043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9043");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-25.0d), 0.0d, 71.0d, (double) (-1L));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test9044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9044");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-39.0d), (-4.0d), (-56.0d), 99.0d);
    }

    @Test
    public void test9045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9045");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(44.0d, (-53.0d), (-24.0d), 21.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-4.0d) + "'", double5 == (-4.0d));
    }

    @Test
    public void test9046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9046");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, 22.0d, (double) 1L);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9047");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, (double) (-1.0f), (-50.0d));
    }

    @Test
    public void test9048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9048");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-86.0d), (-45.0d), (-58.0d), (-37.0d));
    }

    @Test
    public void test9049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9049");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(62.0d, (-16.0d), (double) 1.0f, (double) (byte) -1);
    }

    @Test
    public void test9050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9050");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-89.0d), 19.0d, 12.0d, 86.0d);
    }

    @Test
    public void test9051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9051");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(22.0d, (-7.0d), (-1.0d));
    }

    @Test
    public void test9052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9052");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(54.0d, 0.0d, (-87.0d), 11.0d);
    }

    @Test
    public void test9053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9053");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-28.0d), (-17.0d), (double) 0, 56.0d);
    }

    @Test
    public void test9054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9054");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(72.0d, (-7.0d), 60.0d);
    }

    @Test
    public void test9055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9055");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(61.0d, (double) ' ', (-18.0d));
    }

    @Test
    public void test9056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9056");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(1.0d, 62.0d, 75.0d, (double) 10L);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9057");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1L), (-46.0d), 29.0d, 13.0d);
    }

    @Test
    public void test9058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9058");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(38.0d, 3.0d, (-95.0d), 57.0d);
    }

    @Test
    public void test9059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9059");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-47.0d), (double) 1, (double) 1, (-6.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-4.0d) + "'", double5 == (-4.0d));
    }

    @Test
    public void test9060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9060");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100.0f, 100.0d, (-96.0d), (-89.0d));
    }

    @Test
    public void test9061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9061");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-18.0d), 7.0d, 63.0d, (double) (short) 1);
    }

    @Test
    public void test9062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9062");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-1.0d), (double) 100, (double) (short) -1);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9063");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(72.0d, 39.0d, (-62.0d));
    }

    @Test
    public void test9064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9064");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(1.0d, 36.0d, 19.0d);
    }

    @Test
    public void test9065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9065");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-21.0d), (-19.0d), 59.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-56.0d) + "'", double4 == (-56.0d));
    }

    @Test
    public void test9066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9066");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 100, (double) 100, 0.0d);
    }

    @Test
    public void test9067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9067");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, 0.0d, (-37.0d), (-40.0d));
    }

    @Test
    public void test9068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9068");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 46.0d, 10.0d, (double) (-1.0f));
    }

    @Test
    public void test9069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9069");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(56.0d, (-8.0d), (-60.0d));
    }

    @Test
    public void test9070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9070");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(41.0d, 38.0d, (double) 100);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test9071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9071");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(84.0d, 0.0d, 0.0d, (-10.0d));
    }

    @Test
    public void test9072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9072");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-72.0d), 8.0d, 48.0d);
    }

    @Test
    public void test9073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9073");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 1, 71.0d, 4.0d, 22.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9074");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 1, (-7.0d), (-49.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test9075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9075");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 0, (-86.0d), 88.0d, (-71.0d));
    }

    @Test
    public void test9076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9076");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) (byte) 10, (-17.0d), 60.0d);
    }

    @Test
    public void test9077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9077");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-24.0d), 8.0d, 77.0d, 75.0d);
    }

    @Test
    public void test9078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9078");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(60.0d, (-15.0d), 63.0d, 7.0d);
    }

    @Test
    public void test9079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9079");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-41.0d), (-41.0d), (-66.0d), 54.0d);
    }

    @Test
    public void test9080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9080");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1L, (double) (-1.0f), (-61.0d));
    }

    @Test
    public void test9081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9081");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(19.0d, (-9.0d), 56.0d, 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test9082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9082");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, 60.0d, (-19.0d), (-33.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 26.0d + "'", double6 == 26.0d);
    }

    @Test
    public void test9083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9083");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-29.0d), 2.0d, (-64.0d), 37.0d);
    }

    @Test
    public void test9084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9084");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(3.0d, 67.0d, 0.0d);
    }

    @Test
    public void test9085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9085");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(63.0d, 15.0d, (-8.0d));
    }

    @Test
    public void test9086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9086");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-60.0d), 54.0d, (-88.0d), 50.0d);
    }

    @Test
    public void test9087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9087");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 0, 0.0d, (double) (short) 1, 6.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test9088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9088");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-28.0d), 39.0d, (-69.0d), (double) 10.0f);
    }

    @Test
    public void test9089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9089");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(11.0d, (-10.0d), (-77.0d), (-83.0d));
    }

    @Test
    public void test9090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9090");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-60.0d), (-89.0d), 100.0d, 43.0d);
    }

    @Test
    public void test9091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9091");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '#', 21.0d, 39.0d);
    }

    @Test
    public void test9092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9092");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(84.0d, (-26.0d), 42.0d, 20.0d);
    }

    @Test
    public void test9093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9093");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 62.0d, (-88.0d), 95.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-88.0d) + "'", double5 == (-88.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-34.0d) + "'", double6 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-11.0d) + "'", double7 == (-11.0d));
    }

    @Test
    public void test9094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9094");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(5.0d, 48.0d, (double) (-1));
    }

    @Test
    public void test9095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9095");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 0, (double) 10, (double) 10L);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test9096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9096");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(84.0d, 13.0d, 69.0d, (-59.0d));
    }

    @Test
    public void test9097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9097");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 33.0d, (double) (short) 0, 3.0d);
    }

    @Test
    public void test9098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9098");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(57.0d, (double) 10.0f, 41.0d);
    }

    @Test
    public void test9099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9099");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0.0f, 18.0d, 68.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 18.0d + "'", double4 == 18.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 18.0d + "'", double5 == 18.0d);
    }

    @Test
    public void test9100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9100");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-12.0d), 78.0d, (-37.0d));
    }

    @Test
    public void test9101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9101");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-43.0d), 59.0d, 22.0d);
    }

    @Test
    public void test9102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9102");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(62.0d, (-64.0d), (-36.0d), 25.0d);
    }

    @Test
    public void test9103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9103");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-31.0d), (-86.0d), 0.0d);
    }

    @Test
    public void test9104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9104");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-18.0d), (-39.0d), 68.0d, (-24.0d));
    }

    @Test
    public void test9105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9105");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-74.0d), (-69.0d), (double) (byte) 0);
    }

    @Test
    public void test9106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9106");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(63.0d, 35.0d, 100.0d, 37.0d);
    }

    @Test
    public void test9107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9107");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(24.0d, (-20.0d), (double) 100);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 80.0d + "'", double4 == 80.0d);
    }

    @Test
    public void test9108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9108");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-32.0d), (-70.0d), (-4.0d), (-35.0d));
    }

    @Test
    public void test9109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9109");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(2.0d, (-4.0d), (double) (short) -1);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test9110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9110");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, 6.0d, (-39.0d), (double) 100);
    }

    @Test
    public void test9111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9111");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 100, 58.0d, (-48.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test9112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9112");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(59.0d, (-7.0d), (-60.0d), (-10.0d));
    }

    @Test
    public void test9113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9113");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, 70.0d, (-11.0d));
    }

    @Test
    public void test9114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9114");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-19.0d), (-67.0d), 83.0d);
    }

    @Test
    public void test9115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9115");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(39.0d, (-62.0d), 89.0d);
    }

    @Test
    public void test9116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9116");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100, (-55.0d), (-58.0d));
    }

    @Test
    public void test9117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9117");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-63.0d), (-28.0d), 50.0d, 95.0d);
    }

    @Test
    public void test9118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9118");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(43.0d, 25.0d, (double) (-1.0f), 88.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 18.0d + "'", double5 == 18.0d);
    }

    @Test
    public void test9119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9119");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-43.0d), 8.0d, (double) 0, (-21.0d));
    }

    @Test
    public void test9120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9120");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-18.0d), 15.0d, (-6.0d), (-74.0d));
    }

    @Test
    public void test9121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9121");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, (-54.0d), 74.0d, (-30.0d));
    }

    @Test
    public void test9122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9122");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(24.0d, (double) (-1L), 78.0d);
    }

    @Test
    public void test9123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9123");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(100.0d, 65.0d, 7.0d);
    }

    @Test
    public void test9124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9124");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(49.0d, 56.0d, 81.0d, 0.0d);
    }

    @Test
    public void test9125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9125");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '#', (-41.0d), (-39.0d), 60.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9126");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, (-79.0d), 59.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test9127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9127");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-36.0d), 100.0d, 75.0d);
    }

    @Test
    public void test9128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9128");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(61.0d, 0.0d, (-62.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 33.0d + "'", double4 == 33.0d);
    }

    @Test
    public void test9129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9129");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 1, 88.0d, (-6.0d), (double) (short) -1);
    }

    @Test
    public void test9130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9130");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(27.0d, (-7.0d), (double) 10L);
    }

    @Test
    public void test9131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9131");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-19.0d), 58.0d, (-89.0d));
    }

    @Test
    public void test9132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9132");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(47.0d, (-12.0d), 1.0d, 56.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9133");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1L, (double) 10.0f, 78.0d, (-77.0d));
    }

    @Test
    public void test9134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9134");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-97.0d), (-6.0d), 26.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-5.0d) + "'", double4 == (-5.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9135");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(64.0d, (-15.0d), (-17.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 13.0d + "'", double4 == 13.0d);
    }

    @Test
    public void test9136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9136");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(15.0d, 36.0d, 0.0d, 56.0d);
    }

    @Test
    public void test9137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9137");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(88.0d, (-32.0d), (-30.0d), 58.0d);
    }

    @Test
    public void test9138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9138");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(55.0d, 51.0d, 9.0d);
    }

    @Test
    public void test9139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9139");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(46.0d, 25.0d, 79.0d);
    }

    @Test
    public void test9140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9140");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-17.0d), 7.0d, 20.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-15.0d) + "'", double4 == (-15.0d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test9141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9141");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(47.0d, 22.0d, (double) '#', 15.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
    }

    @Test
    public void test9142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9142");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(30.0d, (-22.0d), 83.0d, (-61.0d));
    }

    @Test
    public void test9143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9143");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10, (-9.0d), 0.0d);
    }

    @Test
    public void test9144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9144");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(72.0d, (-89.0d), (-43.0d), (-55.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9145");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-27.0d), 3.0d, (double) 0, 58.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9146");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1, 45.0d, 0.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test9147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9147");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(12.0d, 39.0d, (-17.0d), (-15.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test9148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9148");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(70.0d, 21.0d, 42.0d, 54.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test9149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9149");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(33.0d, (-95.0d), 55.0d, 18.0d);
    }

    @Test
    public void test9150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9150");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, (-48.0d), 47.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test9151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9151");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, (-9.0d), (-66.0d));
    }

    @Test
    public void test9152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9152");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(3.0d, 37.0d, 46.0d, 94.0d);
    }

    @Test
    public void test9153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9153");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(99.0d, (-8.0d), 33.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test9154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9154");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(72.0d, 15.0d, 45.0d, (-83.0d));
    }

    @Test
    public void test9155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9155");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-24.0d), (-13.0d), (-18.0d));
    }

    @Test
    public void test9156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9156");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 0.0d, (-14.0d));
    }
}
