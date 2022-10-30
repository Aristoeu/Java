package LinearCongruentialGenerator;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test8001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8001");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(64.0d, (-88.0d), (-6.0d), (-44.0d));
    }

    @Test
    public void test8002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8002");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-21.0d), (double) (short) 100, 50.0d, (-2.0d));
    }

    @Test
    public void test8003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8003");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-85.0d), (double) 'a', (double) 1L, (-7.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8004");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, 66.0d, 61.0d, 72.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-5.0d) + "'", double5 == (-5.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8005");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-85.0d), 18.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-13.0d) + "'", double4 == (-13.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-13.0d) + "'", double5 == (-13.0d));
    }

    @Test
    public void test8006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8006");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-41.0d), 33.0d, (-20.0d), 66.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-53.0d) + "'", double5 == (-53.0d));
    }

    @Test
    public void test8007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8007");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(13.0d, (-38.0d), 22.0d, (-88.0d));
    }

    @Test
    public void test8008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8008");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-46.0d), (-45.0d), 85.0d);
    }

    @Test
    public void test8009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8009");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-52.0d), 8.0d, (double) 1L);
    }

    @Test
    public void test8010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8010");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, (double) (byte) 100, (-83.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 19.0d + "'", double4 == 19.0d);
    }

    @Test
    public void test8011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8011");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-62.0d), (-4.0d), (double) 1);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
    }

    @Test
    public void test8012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8012");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(36.0d, 35.0d, 70.0d);
    }

    @Test
    public void test8013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8013");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(87.0d, 92.0d, (-42.0d), (double) (short) 0);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8014");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(43.0d, (-10.0d), (-36.0d), (-85.0d));
    }

    @Test
    public void test8015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8015");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-25.0d), (-71.0d), 59.0d, 77.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8016");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-40.0d), 91.0d, (-1.0d), 1.0d);
    }

    @Test
    public void test8017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8017");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-3.0d), 70.0d, (-9.0d), 0.0d);
    }

    @Test
    public void test8018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8018");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 62.0d, 87.0d, 3.0d);
    }

    @Test
    public void test8019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8019");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-8.0d), (-26.0d), 27.0d, 15.0d);
    }

    @Test
    public void test8020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8020");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(50.0d, (-57.0d), (-55.0d), (-85.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8021");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(80.0d, (-34.0d), (-47.0d), (-74.0d));
    }

    @Test
    public void test8022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8022");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-6.0d), (double) 10.0f, (-42.0d), 76.0d);
    }

    @Test
    public void test8023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8023");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100, (-19.0d), (double) '#', (double) 0.0f);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test8024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8024");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100.0f, 47.0d, (-3.0d));
    }

    @Test
    public void test8025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8025");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 21.0d, (-26.0d));
    }

    @Test
    public void test8026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8026");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 0, 21.0d, 62.0d, (-63.0d));
    }

    @Test
    public void test8027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8027");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 0, (-3.0d), (-26.0d), (double) (byte) 1);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
    }

    @Test
    public void test8028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8028");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(78.0d, 2.0d, 50.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 28.0d + "'", double4 == 28.0d);
    }

    @Test
    public void test8029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8029");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-88.0d), (-64.0d), 55.0d, 88.0d);
    }

    @Test
    public void test8030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8030");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(12.0d, 27.0d, 15.0d, (double) 1.0f);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test8031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8031");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 10, (-98.0d), (-64.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test8032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8032");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(75.0d, 54.0d, (double) '4', 55.0d);
    }

    @Test
    public void test8033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8033");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-13.0d), (-78.0d), 6.0d, (-16.0d));
    }

    @Test
    public void test8034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8034");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(54.0d, (-85.0d), 78.0d, 7.0d);
    }

    @Test
    public void test8035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8035");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(52.0d, (-19.0d), (-71.0d));
    }

    @Test
    public void test8036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8036");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-29.0d), (-2.0d), 33.0d, 11.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8037");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1), (-9.0d), (-18.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9.0d) + "'", double4 == (-9.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8038");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1), 38.0d, (-17.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8039");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, 57.0d, 10.0d, 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test8040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8040");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(46.0d, (-30.0d), 20.0d, 17.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8041");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-26.0d), (double) (short) 100, 0.0d, (double) (short) 1);
    }

    @Test
    public void test8042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8042");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(10.0d, (double) ' ', (double) (byte) 1, (double) 'a');
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
    }

    @Test
    public void test8043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8043");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-35.0d), 31.0d, 85.0d, (-28.0d));
    }

    @Test
    public void test8044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8044");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(19.0d, (-30.0d), 64.0d, (double) (-1));
    }

    @Test
    public void test8045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8045");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(100.0d, (double) 0, 42.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8046");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-75.0d), 14.0d, (-48.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8047");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 100, 1.0d, (double) 10);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test8048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8048");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(27.0d, (-83.0d), 89.0d, (-64.0d));
    }

    @Test
    public void test8049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8049");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10, 33.0d, 25.0d, (double) (short) 0);
    }

    @Test
    public void test8050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8050");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(47.0d, 22.0d, (-39.0d), (-51.0d));
    }

    @Test
    public void test8051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8051");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(85.0d, 69.0d, (double) (byte) -1);
    }

    @Test
    public void test8052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8052");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 10, 4.0d, (-26.0d));
    }

    @Test
    public void test8053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8053");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(81.0d, (-15.0d), 29.0d, (-8.0d));
    }

    @Test
    public void test8054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8054");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-74.0d), 60.0d, 95.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8055");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(82.0d, 33.0d, 74.0d);
    }

    @Test
    public void test8056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8056");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-36.0d), 87.0d, 75.0d);
    }

    @Test
    public void test8057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8057");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(42.0d, 10.0d, (double) 'a', (-12.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8058");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 61.0d, (-8.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.0d + "'", double4 == 5.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
    }

    @Test
    public void test8059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8059");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10, (double) '#', 69.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
        double double7 = linearCongruentialGenerator3.nextNumber();
        double double8 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass9 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 43.0d + "'", double4 == 43.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 51.0d + "'", double5 == 51.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 62.0d + "'", double6 == 62.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 34.0d + "'", double7 == 34.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test8060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8060");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-41.0d), (double) 100, 50.0d, 17.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-4.0d) + "'", double5 == (-4.0d));
    }

    @Test
    public void test8061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8061");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-88.0d), 18.0d, 66.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-48.0d) + "'", double4 == (-48.0d));
    }

    @Test
    public void test8062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8062");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) '4', 11.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8063");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(18.0d, 25.0d, (double) 100.0f, (double) 10.0f);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8064");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10, (double) 0.0f, (-16.0d), 44.0d);
    }

    @Test
    public void test8065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8065");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(28.0d, (double) (-1), (-76.0d), 30.0d);
    }

    @Test
    public void test8066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8066");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-20.0d), (double) 100L, (-80.0d));
    }

    @Test
    public void test8067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8067");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(25.0d, (double) (byte) 100, 14.0d, 25.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 14.0d + "'", double5 == 14.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 14.0d + "'", double6 == 14.0d);
    }

    @Test
    public void test8068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8068");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-15.0d), 0.0d, 45.0d, 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test8069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8069");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 23.0d, 0.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8070");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(54.0d, (double) (byte) 10, 96.0d, (-23.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 16.0d + "'", double6 == 16.0d);
    }

    @Test
    public void test8071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8071");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-50.0d), (-57.0d), (-51.0d));
    }

    @Test
    public void test8072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8072");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 0, 63.0d, (-5.0d), 25.0d);
    }

    @Test
    public void test8073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8073");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(15.0d, (-76.0d), 74.0d, (double) 0L);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8074");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-21.0d), 89.0d, (-7.0d));
    }

    @Test
    public void test8075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8075");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-83.0d), (double) (byte) -1, 31.0d, (-37.0d));
    }

    @Test
    public void test8076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8076");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(15.0d, (-37.0d), (double) (short) 10, 95.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8077");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-85.0d), 61.0d, 29.0d, (-10.0d));
    }

    @Test
    public void test8078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8078");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, 2.0d, (double) (short) -1, 37.0d);
    }

    @Test
    public void test8079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8079");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-43.0d), 0.0d, 52.0d);
    }

    @Test
    public void test8080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8080");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(61.0d, 42.0d, 77.0d, (-32.0d));
    }

    @Test
    public void test8081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8081");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(14.0d, 64.0d, 21.0d);
    }

    @Test
    public void test8082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8082");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-85.0d), (double) (short) 10, 9.0d, 63.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8083");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-41.0d), 88.0d, (double) 10L, (-6.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-4.0d) + "'", double5 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.0d) + "'", double6 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
    }

    @Test
    public void test8084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8084");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1.0f, 1.0d, (double) 0, (double) (-1));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8085");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-25.0d), 83.0d, 0.0d, (-27.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8086");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 100, (-98.0d), (-31.0d));
    }

    @Test
    public void test8087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8087");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-39.0d), 24.0d, 72.0d);
    }

    @Test
    public void test8088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8088");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10L, 43.0d, (-0.0d));
    }

    @Test
    public void test8089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8089");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, (-82.0d), 39.0d, 16.0d);
    }

    @Test
    public void test8090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8090");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-10.0d), (-29.0d), 80.0d);
    }

    @Test
    public void test8091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8091");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 10, (-16.0d), 98.0d, (double) 100.0f);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-62.0d) + "'", double5 == (-62.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8092");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-88.0d), 39.0d, (-23.0d), 81.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-53.0d) + "'", double5 == (-53.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-65.0d) + "'", double6 == (-65.0d));
    }

    @Test
    public void test8093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8093");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(51.0d, 52.0d, (double) (byte) 0, (-76.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 68.0d + "'", double5 == 68.0d);
    }

    @Test
    public void test8094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8094");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-26.0d), (double) 10, 52.0d);
    }

    @Test
    public void test8095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8095");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0, (-71.0d), 14.0d);
    }

    @Test
    public void test8096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8096");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, (double) (byte) 1, (-33.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8097");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-34.0d), 16.0d, (-32.0d), (-26.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-4.0d) + "'", double5 == (-4.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8098");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-41.0d), (double) 10.0f, 37.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-17.0d) + "'", double4 == (-17.0d));
    }

    @Test
    public void test8099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8099");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(35.0d, (-65.0d), 39.0d, (-60.0d));
    }

    @Test
    public void test8100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8100");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(43.0d, 51.0d, (double) (-1), 100.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 92.0d + "'", double5 == 92.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 91.0d + "'", double6 == 91.0d);
    }

    @Test
    public void test8101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8101");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(15.0d, 12.0d, (-76.0d));
    }

    @Test
    public void test8102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8102");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 10, (double) 100L, 28.0d, 100.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8103");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(52.0d, 56.0d, 27.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
    }

    @Test
    public void test8104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8104");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(7.0d, 83.0d, (-55.0d), (double) (byte) -1);
    }

    @Test
    public void test8105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8105");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-63.0d), 42.0d, 29.0d);
    }

    @Test
    public void test8106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8106");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(68.0d, (-23.0d), 100.0d);
    }

    @Test
    public void test8107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8107");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(67.0d, 0.0d, (-65.0d), 51.0d);
    }

    @Test
    public void test8108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8108");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 10, 0.0d, 100.0d, 41.0d);
    }

    @Test
    public void test8109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8109");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, (-1.0d), (-38.0d), (double) 1);
    }

    @Test
    public void test8110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8110");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(38.0d, 3.0d, 38.0d, (-13.0d));
    }

    @Test
    public void test8111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8111");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-8.0d), (-16.0d), (double) 0, (double) '4');
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 24.0d + "'", double5 == 24.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-20.0d) + "'", double6 == (-20.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test8112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8112");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-0.0d), 71.0d, 60.0d);
    }

    @Test
    public void test8113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8113");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(38.0d, (-22.0d), (-4.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8114");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-29.0d), 83.0d, (-38.0d));
    }

    @Test
    public void test8115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8115");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(72.0d, 85.0d, 28.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8116");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(88.0d, 44.0d, 0.0d);
    }

    @Test
    public void test8117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8117");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(12.0d, 74.0d, (double) (byte) 0);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test8118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8118");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(78.0d, (double) (byte) 100, 31.0d);
    }

    @Test
    public void test8119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8119");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(92.0d, (-30.0d), (-57.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8120");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(43.0d, (double) 100.0f, 29.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8121");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1L), (-32.0d), 0.0d, 41.0d);
    }

    @Test
    public void test8122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8122");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(45.0d, (double) (short) 100, 55.0d, (-53.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
    }

    @Test
    public void test8123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8123");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-10.0d), (-24.0d), (-48.0d), (-11.0d));
    }

    @Test
    public void test8124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8124");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10L, (double) (short) 10, 47.0d, (double) (short) 10);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.0d + "'", double5 == 7.0d);
    }

    @Test
    public void test8125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8125");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(66.0d, (-41.0d), 52.0d, (double) ' ');
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8126");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1L), 32.0d, (-31.0d), 94.0d);
    }

    @Test
    public void test8127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8127");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) ' ', 30.0d, (-10.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8128");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 18.0d, (-45.0d));
    }

    @Test
    public void test8129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8129");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 67.0d, (-9.0d));
    }

    @Test
    public void test8130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8130");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(85.0d, (-82.0d), (-78.0d), 75.0d);
    }

    @Test
    public void test8131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8131");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(38.0d, 45.0d, 0.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test8132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8132");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1L), 56.0d, 75.0d, (-62.0d));
    }

    @Test
    public void test8133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8133");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-59.0d), (-9.0d), 4.0d, 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test8134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8134");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-18.0d), (-54.0d), (-60.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8135");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(47.0d, 63.0d, 37.0d, 93.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8136");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '4', 31.0d, (double) 0.0f, (double) (-1L));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8137");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(31.0d, 56.0d, (double) '#', 16.0d);
    }

    @Test
    public void test8138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8138");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(20.0d, (-9.0d), 81.0d, (-58.0d));
    }

    @Test
    public void test8139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8139");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(15.0d, 44.0d, 32.0d, 1.0d);
    }

    @Test
    public void test8140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8140");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 100, (-8.0d), 33.0d, (-34.0d));
    }

    @Test
    public void test8141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8141");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, 43.0d, (double) 0L, (-18.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 14.0d + "'", double6 == 14.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
    }

    @Test
    public void test8142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8142");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-80.0d), 33.0d, Double.NaN, (-36.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test8143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8143");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-93.0d), 49.0d, 44.0d, (double) (short) -1);
    }

    @Test
    public void test8144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8144");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(63.0d, (-63.0d), (double) (byte) 1, 0.0d);
    }

    @Test
    public void test8145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8145");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(44.0d, (double) ' ', 0.0d, (double) 10.0f);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
    }

    @Test
    public void test8146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8146");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100.0f, 17.0d, (-0.0d), 100.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test8147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8147");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1.0f, 0.0d, 9.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8148");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-37.0d), (-8.0d), (double) (short) 0);
    }

    @Test
    public void test8149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8149");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, 67.0d, (-76.0d));
    }

    @Test
    public void test8150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8150");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-88.0d), 1.0d, 65.0d, 94.0d);
    }

    @Test
    public void test8151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8151");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 10, 20.0d, 40.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test8152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8152");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-29.0d), (double) (-1L), 39.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8153");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(46.0d, 100.0d, (-41.0d));
    }

    @Test
    public void test8154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8154");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(3.0d, 14.0d, (-13.0d), (-35.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 29.0d + "'", double5 == 29.0d);
    }

    @Test
    public void test8155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8155");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(6.0d, (-62.0d), 25.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test8156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8156");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-88.0d), 48.0d, 19.0d);
    }

    @Test
    public void test8157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8157");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(22.0d, 16.0d, 52.0d, (double) (short) 1);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test8158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8158");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-98.0d), (-41.0d), (-18.0d));
    }

    @Test
    public void test8159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8159");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(68.0d, (double) (short) -1, (-39.0d));
    }

    @Test
    public void test8160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8160");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(52.0d, (double) 0L, 0.0d, (-8.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8161");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100.0f, 5.0d, (-74.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test8162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8162");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(8.0d, (-46.0d), 43.0d);
    }

    @Test
    public void test8163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8163");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(93.0d, 89.0d, (-18.0d));
    }

    @Test
    public void test8164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8164");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1, 68.0d, (-31.0d));
    }

    @Test
    public void test8165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8165");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(94.0d, (-85.0d), (-39.0d));
    }

    @Test
    public void test8166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8166");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) -1, 58.0d, 35.0d, 84.0d);
    }

    @Test
    public void test8167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8167");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(91.0d, (double) ' ', (-42.0d), 39.0d);
    }

    @Test
    public void test8168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8168");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-60.0d), 0.0d, (-5.0d));
    }

    @Test
    public void test8169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8169");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(22.0d, (-31.0d), (double) (short) 0, (-11.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8170");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-8.0d), 98.0d, 42.0d, 13.0d);
    }

    @Test
    public void test8171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8171");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-93.0d), (-17.0d), 54.0d);
    }

    @Test
    public void test8172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8172");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(17.0d, (double) 1.0f, 29.0d);
    }

    @Test
    public void test8173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8173");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-45.0d), (-11.0d), 14.0d, (double) (byte) 100);
    }

    @Test
    public void test8174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8174");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-93.0d), (-49.0d), (-50.0d));
    }

    @Test
    public void test8175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8175");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-44.0d), (double) 0, 23.0d, (double) 1);
    }

    @Test
    public void test8176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8176");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) -1, 4.0d, (-8.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-4.0d) + "'", double4 == (-4.0d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test8177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8177");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(8.0d, 58.0d, (-48.0d), (double) 10);
    }

    @Test
    public void test8178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8178");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, 56.0d, 65.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8179");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100, 52.0d, 23.0d, (double) 'a');
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 82.0d + "'", double5 == 82.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 19.0d + "'", double6 == 19.0d);
    }

    @Test
    public void test8180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8180");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, 16.0d, 0.0d, (double) (short) 100);
    }

    @Test
    public void test8181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8181");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-6.0d), 69.0d, 52.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 17.0d + "'", double5 == 17.0d);
    }

    @Test
    public void test8182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8182");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(45.0d, 77.0d, 0.0d, (double) (short) -1);
    }

    @Test
    public void test8183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8183");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(94.0d, 85.0d, 80.0d);
    }

    @Test
    public void test8184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8184");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(40.0d, 76.0d, (-60.0d));
    }

    @Test
    public void test8185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8185");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-5.0d), 9.0d, (-76.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8186");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-88.0d), (-37.0d), 42.0d);
    }

    @Test
    public void test8187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8187");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', (-49.0d), (-10.0d));
    }

    @Test
    public void test8188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8188");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(38.0d, 87.0d, (double) '#', (-25.0d));
    }

    @Test
    public void test8189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8189");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, (double) 100L, 35.0d);
    }

    @Test
    public void test8190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8190");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(66.0d, 93.0d, 24.0d, 55.0d);
    }

    @Test
    public void test8191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8191");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '4', 0.0d, 33.0d);
    }

    @Test
    public void test8192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8192");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1.0f), (-76.0d), 54.0d, 46.0d);
    }

    @Test
    public void test8193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8193");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(50.0d, (-33.0d), (-39.0d));
    }

    @Test
    public void test8194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8194");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(10.0d, 51.0d, 0.0d, 33.0d);
    }

    @Test
    public void test8195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8195");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-14.0d), 47.0d, 52.0d, (-5.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8196");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(78.0d, 63.0d, 51.0d);
    }

    @Test
    public void test8197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8197");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(46.0d, (-11.0d), (-25.0d), (-22.0d));
    }

    @Test
    public void test8198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8198");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 10, (double) (short) -1, 55.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 14.0d + "'", double4 == 14.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 29.0d + "'", double5 == 29.0d);
    }

    @Test
    public void test8199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8199");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(30.0d, 90.0d, (-98.0d));
    }

    @Test
    public void test8200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8200");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 100, (-42.0d), (-3.0d));
    }

    @Test
    public void test8201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8201");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(10.0d, 93.0d, (-53.0d), (-29.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.0d + "'", double5 == 7.0d);
    }

    @Test
    public void test8202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8202");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-83.0d), (-15.0d), (-19.0d), (-19.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8203");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(92.0d, (-12.0d), 0.0d, (-13.0d));
    }

    @Test
    public void test8204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8204");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(34.0d, 74.0d, 1.0d, 23.0d);
    }

    @Test
    public void test8205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8205");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, (double) 100, (double) (-1.0f), (double) 0.0f);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test8206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8206");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 1, 6.0d, (-22.0d));
    }

    @Test
    public void test8207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8207");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-88.0d), 39.0d, (-23.0d), 81.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-53.0d) + "'", double5 == (-53.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8208");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-43.0d), (double) 1, 82.0d);
    }

    @Test
    public void test8209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8209");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', (double) (byte) 100, 22.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.0d + "'", double4 == 8.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 18.0d + "'", double5 == 18.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8210");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(71.0d, 87.0d, (-3.0d));
    }

    @Test
    public void test8211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8211");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-44.0d), (-1.0d), 65.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8212");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100.0f, 60.0d, (-33.0d), Double.NaN);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8213");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(78.0d, 11.0d, (-59.0d), 52.0d);
    }

    @Test
    public void test8214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8214");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '4', 59.0d, 13.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.0d + "'", double5 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.0d + "'", double6 == 7.0d);
    }

    @Test
    public void test8215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8215");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0.0f, 10.0d, (double) (byte) 0, 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8216");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-12.0d), (-35.0d), 0.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8217");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-35.0d), (double) (short) 10, 3.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.0d) + "'", double4 == (-2.0d));
    }

    @Test
    public void test8218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8218");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(83.0d, 21.0d, 69.0d);
    }

    @Test
    public void test8219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8219");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(4.0d, (-27.0d), 43.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 33.0d + "'", double4 == 33.0d);
    }

    @Test
    public void test8220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8220");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-40.0d), (double) (short) 10, (-27.0d));
    }

    @Test
    public void test8221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8221");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-17.0d), (-2.0d), 73.0d);
    }

    @Test
    public void test8222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8222");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(50.0d, 0.0d, 76.0d, 9.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
    }

    @Test
    public void test8223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8223");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-76.0d), (-40.0d), (-88.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-40.0d) + "'", double4 == (-40.0d));
    }

    @Test
    public void test8224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8224");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10L, (-32.0d), (-41.0d));
    }

    @Test
    public void test8225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8225");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(9.0d, 73.0d, (-18.0d), 59.0d);
    }

    @Test
    public void test8226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8226");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-62.0d), 36.0d, (double) 100.0f);
    }

    @Test
    public void test8227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8227");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(19.0d, 0.0d, 72.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8228");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100, 18.0d, (double) (short) 0, 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test8229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8229");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(11.0d, (double) '4', 47.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 43.0d + "'", double4 == 43.0d);
    }

    @Test
    public void test8230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8230");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-0.0d), 67.0d, (-4.0d), (double) (byte) 10);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-4.0d) + "'", double5 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
    }

    @Test
    public void test8231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8231");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0L, 60.0d, 21.0d, (double) (-1L));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8232");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(71.0d, 0.0d, 31.0d);
    }

    @Test
    public void test8233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8233");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-85.0d), (-23.0d));
    }

    @Test
    public void test8234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8234");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-11.0d), (double) ' ', (-78.0d), (-64.0d));
    }

    @Test
    public void test8235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8235");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, (-47.0d), 0.0d, (-29.0d));
    }

    @Test
    public void test8236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8236");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-47.0d), 36.0d, 100.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-34.0d) + "'", double4 == (-34.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8237");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(43.0d, (double) (short) 1, 0.0d);
    }

    @Test
    public void test8238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8238");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-49.0d), 0.0d, 1.0d);
    }

    @Test
    public void test8239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8239");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-53.0d), (-88.0d), (-57.0d), 43.0d);
    }

    @Test
    public void test8240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8240");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-75.0d), 0.0d, 18.0d);
    }

    @Test
    public void test8241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8241");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(8.0d, 17.0d, 36.0d, Double.NaN);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8242");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-57.0d), (-83.0d), 91.0d);
    }

    @Test
    public void test8243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8243");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-44.0d), (-29.0d), (-37.0d), (-88.0d));
    }

    @Test
    public void test8244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8244");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(35.0d, (double) 100, 13.0d, 40.0d);
    }

    @Test
    public void test8245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8245");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(73.0d, 56.0d, (-85.0d), (-32.0d));
    }

    @Test
    public void test8246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8246");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-83.0d), 46.0d, (double) (short) 0, (-12.0d));
    }

    @Test
    public void test8247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8247");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-22.0d), 52.0d, 59.0d, (-62.0d));
    }

    @Test
    public void test8248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8248");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-49.0d), (double) (byte) 100, 1.0d, (double) (-1L));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8249");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-42.0d), (-3.0d), (double) ' ');
    }

    @Test
    public void test8250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8250");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-62.0d), 0.0d, (double) 1L, 70.0d);
    }

    @Test
    public void test8251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8251");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(76.0d, 6.0d, 6.0d, (-30.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8252");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(45.0d, 59.0d, 30.0d, 2.0d);
    }

    @Test
    public void test8253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8253");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(20.0d, 68.0d, 35.0d);
    }

    @Test
    public void test8254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8254");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-10.0d), (-29.0d), 73.0d);
    }

    @Test
    public void test8255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8255");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-63.0d), (-49.0d), 26.0d, (-71.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 60.0d + "'", double5 == 60.0d);
    }

    @Test
    public void test8256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8256");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 40.0d, 30.0d, 35.0d);
    }

    @Test
    public void test8257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8257");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(24.0d, (-62.0d), (-25.0d));
    }

    @Test
    public void test8258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8258");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(63.0d, 94.0d, 39.0d);
    }

    @Test
    public void test8259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8259");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(57.0d, 66.0d, 57.0d, 65.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8260");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(57.0d, 100.0d, 57.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 43.0d + "'", double4 == 43.0d);
    }

    @Test
    public void test8261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8261");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(40.0d, (-33.0d), (-40.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
    }

    @Test
    public void test8262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8262");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, (-2.0d), 81.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 75.0d + "'", double4 == 75.0d);
    }

    @Test
    public void test8263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8263");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 62.0d, 19.0d, 49.0d);
    }

    @Test
    public void test8264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8264");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(51.0d, (-39.0d), 11.0d, (-55.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-53.0d) + "'", double5 == (-53.0d));
    }

    @Test
    public void test8265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8265");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(59.0d, (double) '#', 26.0d);
    }

    @Test
    public void test8266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8266");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(34.0d, 0.0d, 10.0d, (-62.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8267");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(75.0d, (-34.0d), (-89.0d));
    }

    @Test
    public void test8268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8268");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-9.0d), (-40.0d), 37.0d, 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test8269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8269");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1.0f), (double) 1L, (double) (byte) 1);
    }

    @Test
    public void test8270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8270");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-10.0d), (-78.0d), (-48.0d), 91.0d);
    }

    @Test
    public void test8271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8271");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-27.0d), (double) (short) 100, 43.0d, 17.0d);
    }

    @Test
    public void test8272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8272");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(50.0d, (double) (-1.0f), 33.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 26.0d + "'", double4 == 26.0d);
    }

    @Test
    public void test8273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8273");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-9.0d), (double) 10L, 8.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8274");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-19.0d), (double) (byte) 100, 96.0d, 63.0d);
    }

    @Test
    public void test8275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8275");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-14.0d), (-70.0d), (-35.0d));
    }

    @Test
    public void test8276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8276");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-3.0d), (double) 100.0f, 8.0d, (-48.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-4.0d) + "'", double5 == (-4.0d));
    }

    @Test
    public void test8277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8277");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-53.0d), 67.0d, (-40.0d));
    }

    @Test
    public void test8278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8278");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-42.0d), Double.NaN, (-17.0d));
    }

    @Test
    public void test8279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8279");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-52.0d), 33.0d, (-33.0d), (-30.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-9.0d) + "'", double5 == (-9.0d));
    }

    @Test
    public void test8280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8280");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-63.0d), (double) (short) -1);
    }

    @Test
    public void test8281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8281");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100.0f, 60.0d, (-33.0d), Double.NaN);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test8282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8282");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(4.0d, 17.0d, (-53.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8283");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, 43.0d, (double) 0L, (-18.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 14.0d + "'", double6 == 14.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test8284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8284");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-16.0d), (double) (short) 0, (-29.0d), 52.0d);
    }

    @Test
    public void test8285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8285");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-6.0d), (-71.0d), 16.0d, (double) 1);
    }

    @Test
    public void test8286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8286");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(61.0d, (-30.0d), 0.0d, 50.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-30.0d) + "'", double5 == (-30.0d));
    }

    @Test
    public void test8287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8287");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(46.0d, 59.0d, (double) '#', (-33.0d));
    }

    @Test
    public void test8288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8288");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 0, 5.0d, 92.0d, (-22.0d));
    }

    @Test
    public void test8289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8289");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 1, (double) 'a', 0.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8290");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(41.0d, 96.0d, (-48.0d));
    }

    @Test
    public void test8291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8291");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(58.0d, 66.0d, 0.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8292");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(15.0d, 40.0d, 82.0d);
    }

    @Test
    public void test8293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8293");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(27.0d, 0.0d, (-1.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8294");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-53.0d), (-27.0d), 82.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8295");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-71.0d), (-33.0d), 0.0d);
    }

    @Test
    public void test8296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8296");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-12.0d), 49.0d, 0.0d, (-35.0d));
    }

    @Test
    public void test8297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8297");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(24.0d, (-23.0d), 11.0d);
    }

    @Test
    public void test8298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8298");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(89.0d, 58.0d, 0.0d, (double) 1.0f);
    }

    @Test
    public void test8299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8299");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-11.0d), (-6.0d), (-76.0d));
    }

    @Test
    public void test8300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8300");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', 45.0d, (-62.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 53.0d + "'", double4 == 53.0d);
    }

    @Test
    public void test8301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8301");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-43.0d), (-64.0d), 56.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-50.0d) + "'", double4 == (-50.0d));
    }

    @Test
    public void test8302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8302");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-57.0d), 0.0d, (double) 0L, (-2.0d));
    }

    @Test
    public void test8303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8303");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(38.0d, (-2.0d), 52.0d);
    }

    @Test
    public void test8304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8304");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-59.0d), (-15.0d), 32.0d, 60.0d);
    }

    @Test
    public void test8305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8305");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-19.0d), 65.0d, (-30.0d));
    }

    @Test
    public void test8306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8306");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(1.0d, (double) '4', (-1.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8307");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-80.0d), (-44.0d), 41.0d);
    }

    @Test
    public void test8308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8308");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0, (-22.0d), 1.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8309");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) -1, (-17.0d), 17.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-8.0d) + "'", double4 == (-8.0d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-9.0d) + "'", double5 == (-9.0d));
    }

    @Test
    public void test8310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8310");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(31.0d, 64.0d, 4.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8311");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(4.0d, 17.0d, (-53.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
    }

    @Test
    public void test8312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8312");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, (double) 'a', (double) 1.0f);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8313");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1), (-2.0d), (double) (byte) 100);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8314");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, (-59.0d), (double) 10L);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8315");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-12.0d), (-44.0d), 0.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test8316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8316");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) (short) 10, 78.0d, (double) '#');
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8317");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(34.0d, 0.0d, 22.0d);
    }

    @Test
    public void test8318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8318");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(30.0d, (-27.0d), (-43.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8319");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-59.0d), 3.0d, 87.0d);
    }

    @Test
    public void test8320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8320");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-7.0d), (double) 1L, (-63.0d), (-34.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8321");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(24.0d, (double) 10, (-50.0d), 43.0d);
    }

    @Test
    public void test8322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8322");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-47.0d), 20.0d, 37.0d, (double) 1);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
    }

    @Test
    public void test8323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8323");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(82.0d, (-62.0d), 40.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8324");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(49.0d, (-82.0d), 20.0d);
    }

    @Test
    public void test8325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8325");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(30.0d, (-47.0d), 70.0d, 11.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        double double8 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass9 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-9.0d) + "'", double5 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.0d + "'", double8 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test8326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8326");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(53.0d, (double) (short) 1, 76.0d);
    }

    @Test
    public void test8327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8327");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(34.0d, 35.0d, (-26.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
    }

    @Test
    public void test8328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8328");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(20.0d, 49.0d, (double) 100L, (-85.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 60.0d + "'", double5 == 60.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8329");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-8.0d), 0.0d, 30.0d, 69.0d);
    }

    @Test
    public void test8330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8330");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-55.0d), (double) 10, 32.0d, 26.0d);
    }

    @Test
    public void test8331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8331");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 0.0d, (double) (-1), 8.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8332");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-41.0d), 0.0d, (-12.0d), (-40.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-12.0d) + "'", double5 == (-12.0d));
    }

    @Test
    public void test8333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8333");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, (double) 0.0f, (-85.0d), (-11.0d));
    }

    @Test
    public void test8334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8334");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 21.0d, 0.0d, 89.0d);
    }

    @Test
    public void test8335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8335");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, 65.0d, 95.0d);
    }

    @Test
    public void test8336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8336");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, (double) (short) 1, (double) '#', 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test8337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8337");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(73.0d, (-49.0d), (double) 0L, 92.0d);
    }

    @Test
    public void test8338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8338");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-6.0d), (-89.0d), (-10.0d), 54.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 38.0d + "'", double5 == 38.0d);
    }

    @Test
    public void test8339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8339");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(75.0d, (double) 10L, 41.0d);
    }

    @Test
    public void test8340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8340");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(46.0d, (-21.0d), (-30.0d));
    }

    @Test
    public void test8341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8341");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-34.0d), 54.0d, 72.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8342");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-47.0d), (-33.0d), (-85.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-66.0d) + "'", double4 == (-66.0d));
    }

    @Test
    public void test8343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8343");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(7.0d, (double) (-1), (-12.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
    }

    @Test
    public void test8344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8344");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0, (double) 100.0f, (double) (short) -1, 1.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
    }

    @Test
    public void test8345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8345");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-3.0d), (double) 1.0f, (double) 0);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test8346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8346");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(5.0d, 15.0d, 0.0d);
    }

    @Test
    public void test8347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8347");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(43.0d, (-93.0d), (-3.0d), 0.0d);
    }

    @Test
    public void test8348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8348");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 40.0d, 5.0d);
    }

    @Test
    public void test8349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8349");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 100, 48.0d, 20.0d, 49.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8350");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-11.0d), 66.0d, (-62.0d), 0.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8351");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(4.0d, 1.0d, 59.0d, (-9.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test8352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8352");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(51.0d, (double) 0L, 15.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 12.0d + "'", double4 == 12.0d);
    }

    @Test
    public void test8353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8353");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, (-63.0d), 85.0d, (-52.0d));
    }

    @Test
    public void test8354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8354");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1, 56.0d, 14.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8355");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-8.0d), (-8.0d), (-14.0d), (-6.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8356");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-57.0d), 44.0d, 16.0d, (-57.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8357");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0.0f, (-26.0d), 83.0d, 47.0d);
    }

    @Test
    public void test8358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8358");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 36.0d, (double) 100.0f);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 36.0d + "'", double4 == 36.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 36.0d + "'", double5 == 36.0d);
    }

    @Test
    public void test8359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8359");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-3.0d), 0.0d, (double) '4');
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8360");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-62.0d), 0.0d, 81.0d, 10.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8361");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(88.0d, 2.0d, (double) (short) 0, 8.0d);
    }

    @Test
    public void test8362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8362");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-20.0d), 0.0d, (-80.0d));
    }

    @Test
    public void test8363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8363");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-75.0d), 76.0d);
    }

    @Test
    public void test8364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8364");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(52.0d, (-29.0d), 72.0d);
    }

    @Test
    public void test8365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8365");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(8.0d, (-42.0d), 6.0d);
    }

    @Test
    public void test8366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8366");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-36.0d), 48.0d, (double) (short) 100);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8367");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100, (-81.0d), 78.0d);
    }

    @Test
    public void test8368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8368");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-65.0d), (-52.0d), 43.0d, 0.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8369");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(89.0d, (-63.0d), 48.0d);
    }

    @Test
    public void test8370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8370");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-85.0d), 5.0d, 13.0d, 44.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8371");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-62.0d), (double) 100L, (-4.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8372");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(73.0d, 54.0d, (double) '4');
    }

    @Test
    public void test8373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8373");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(89.0d, 92.0d, (-16.0d), (-11.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8374");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-48.0d), (double) 100, 75.0d, 98.0d);
    }

    @Test
    public void test8375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8375");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-63.0d), 0.0d, 59.0d, 70.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 59.0d + "'", double5 == 59.0d);
    }

    @Test
    public void test8376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8376");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(74.0d, 0.0d, (-49.0d));
    }

    @Test
    public void test8377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8377");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-83.0d), 69.0d, 0.0d, (-71.0d));
    }

    @Test
    public void test8378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8378");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 39.0d, 52.0d, 47.0d);
    }

    @Test
    public void test8379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8379");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-37.0d), (-11.0d), 41.0d, (-80.0d));
    }

    @Test
    public void test8380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8380");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(92.0d, 28.0d, (double) 0.0f);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test8381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8381");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(47.0d, (-80.0d), (double) (-1), (-85.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8382");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-29.0d), 15.0d, (-28.0d), 23.0d);
    }

    @Test
    public void test8383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8383");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-10.0d), (-0.0d), (double) (byte) 10, (-41.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8384");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-42.0d), 70.0d, 85.0d);
    }

    @Test
    public void test8385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8385");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(7.0d, 49.0d, 31.0d, 9.0d);
    }

    @Test
    public void test8386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8386");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-82.0d), (-12.0d), 90.0d);
    }

    @Test
    public void test8387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8387");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(21.0d, (-15.0d), (double) 10);
    }

    @Test
    public void test8388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8388");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-59.0d), (-30.0d), (-17.0d), 77.0d);
    }

    @Test
    public void test8389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8389");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-16.0d), (-22.0d), 100.0d, 87.0d);
    }

    @Test
    public void test8390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8390");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1L), Double.NaN, (double) 'a');
    }

    @Test
    public void test8391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8391");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-34.0d), 78.0d, 26.0d, 66.0d);
    }

    @Test
    public void test8392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8392");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(59.0d, 46.0d, (double) 1);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test8393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8393");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(92.0d, 51.0d, (double) (-1L), 81.0d);
    }

    @Test
    public void test8394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8394");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(20.0d, 71.0d, 21.0d, (double) (short) 10);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8395");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, (double) '#', (double) 1);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
        double double7 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test8396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8396");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-70.0d), (-15.0d), (-38.0d));
    }

    @Test
    public void test8397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8397");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(6.0d, (-14.0d), 0.0d);
    }

    @Test
    public void test8398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8398");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-76.0d), 5.0d, (-2.0d));
    }

    @Test
    public void test8399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8399");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(22.0d, (double) (byte) 100, 71.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 19.0d + "'", double4 == 19.0d);
    }

    @Test
    public void test8400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8400");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, (-5.0d), (-16.0d), (double) 0.0f);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8401");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-39.0d), (-10.0d), 11.0d, (-93.0d));
    }

    @Test
    public void test8402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8402");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) 0L, 28.0d, (double) (byte) -1);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test8403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8403");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-55.0d), 63.0d, (-47.0d), 42.0d);
    }

    @Test
    public void test8404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8404");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) -1, (double) (byte) -1, 0.0d, (double) 10L);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8405");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-23.0d), (-18.0d), 27.0d, (-11.0d));
    }

    @Test
    public void test8406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8406");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-34.0d), 16.0d, (-38.0d));
    }

    @Test
    public void test8407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8407");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(82.0d, 0.0d, 91.0d);
    }

    @Test
    public void test8408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8408");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-66.0d), 5.0d, 85.0d, 1.0d);
    }

    @Test
    public void test8409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8409");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-26.0d), 89.0d, 10.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-7.0d) + "'", double4 == (-7.0d));
    }

    @Test
    public void test8410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8410");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(55.0d, 82.0d, (-43.0d), (-59.0d));
    }

    @Test
    public void test8411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8411");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-45.0d), (-74.0d), (-7.0d), 0.0d);
    }

    @Test
    public void test8412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8412");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(35.0d, 94.0d, (-29.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
    }

    @Test
    public void test8413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8413");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(34.0d, 44.0d, (-85.0d), Double.NaN);
    }

    @Test
    public void test8414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8414");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-36.0d), 51.0d, (-81.0d));
    }

    @Test
    public void test8415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8415");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(80.0d, (-20.0d), (-16.0d), (-21.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-20.0d) + "'", double5 == (-20.0d));
    }

    @Test
    public void test8416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8416");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(18.0d, 89.0d, 40.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 27.0d + "'", double4 == 27.0d);
    }

    @Test
    public void test8417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8417");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(8.0d, (double) (byte) 1, (double) 1.0f, 4.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8418");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-25.0d), (double) 1, (double) (-1.0f));
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8419");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 1, (double) 'a', 36.0d, (-49.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test8420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8420");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(73.0d, 5.0d, (-55.0d), 69.0d);
    }

    @Test
    public void test8421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8421");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(34.0d, (-35.0d), (-9.0d));
    }

    @Test
    public void test8422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8422");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-81.0d), (double) 0L, 64.0d, 83.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8423");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-10.0d), 7.0d, 72.0d, 59.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test8424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8424");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 34.0d, 89.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 34.0d + "'", double4 == 34.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 34.0d + "'", double5 == 34.0d);
    }

    @Test
    public void test8425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8425");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, 7.0d, (double) (-1L), (double) (short) 0);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test8426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8426");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-80.0d), 69.0d, 53.0d, (double) (byte) 0);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8427");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) -1, 57.0d, (-89.0d), 60.0d);
    }

    @Test
    public void test8428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8428");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 36.0d, 80.0d, 36.0d);
    }

    @Test
    public void test8429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8429");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(1.0d, (double) 'a', (double) 0L, 10.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass8 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.0d + "'", double5 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.0d + "'", double7 == 3.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test8430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8430");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(23.0d, 23.0d, 44.0d, (-46.0d));
    }

    @Test
    public void test8431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8431");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) (short) 100, 64.0d, 40.0d);
    }

    @Test
    public void test8432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8432");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-64.0d), 11.0d, 3.0d, 29.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8433");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(39.0d, (double) (short) 10, (-54.0d), 0.0d);
    }

    @Test
    public void test8434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8434");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-10.0d), 87.0d, (double) 1L);
    }

    @Test
    public void test8435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8435");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-17.0d), 12.0d, 52.0d);
    }

    @Test
    public void test8436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8436");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(70.0d, 43.0d, 0.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test8437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8437");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(62.0d, 82.0d, (double) 0L, 0.0d);
    }

    @Test
    public void test8438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8438");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1L), (-83.0d), (-9.0d), (double) (-1));
    }

    @Test
    public void test8439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8439");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(5.0d, 66.0d, 3.0d, (-13.0d));
    }

    @Test
    public void test8440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8440");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) ' ', 32.0d, (-70.0d));
    }

    @Test
    public void test8441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8441");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(89.0d, 12.0d, 69.0d, 25.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 12.0d + "'", double5 == 12.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8442");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 10, 31.0d, 29.0d, (double) 10L);
    }

    @Test
    public void test8443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8443");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-47.0d), (double) 1, (-40.0d));
    }

    @Test
    public void test8444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8444");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(78.0d, 0.0d, (-64.0d), 78.0d);
    }

    @Test
    public void test8445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8445");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-44.0d), 84.0d, 37.0d, (-22.0d));
    }

    @Test
    public void test8446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8446");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(94.0d, 20.0d, 54.0d, (-32.0d));
    }

    @Test
    public void test8447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8447");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-17.0d), 14.0d, 30.0d, (double) (-1L));
    }

    @Test
    public void test8448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8448");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-7.0d), 56.0d, (double) (short) 10);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0d + "'", double5 == 3.0d);
    }

    @Test
    public void test8449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8449");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(25.0d, 0.0d, 21.0d, 92.0d);
    }

    @Test
    public void test8450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8450");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-71.0d), 49.0d, 12.0d);
    }

    @Test
    public void test8451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8451");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(61.0d, 76.0d, (-71.0d));
    }

    @Test
    public void test8452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8452");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-57.0d), (-9.0d), 78.0d, (-29.0d));
    }

    @Test
    public void test8453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8453");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-46.0d), (double) 100.0f, 80.0d, 54.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8454");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(3.0d, (-60.0d), 31.0d, 68.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-13.0d) + "'", double5 == (-13.0d));
    }

    @Test
    public void test8455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8455");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-5.0d), 27.0d, 6.0d, (-55.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8456");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(18.0d, 27.0d, 0.0d);
    }

    @Test
    public void test8457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8457");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(71.0d, 34.0d, 0.0d, (-89.0d));
    }

    @Test
    public void test8458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8458");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-20.0d), (-50.0d), 56.0d);
    }

    @Test
    public void test8459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8459");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-31.0d), 0.0d, (-60.0d));
    }

    @Test
    public void test8460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8460");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-9.0d), (-52.0d), 81.0d);
    }

    @Test
    public void test8461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8461");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-74.0d), 93.0d, (-58.0d), 0.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8462");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(24.0d, 89.0d, (-7.0d), (-37.0d));
    }

    @Test
    public void test8463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8463");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(11.0d, 6.0d, (-76.0d));
    }

    @Test
    public void test8464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8464");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(1.0d, 32.0d, (-8.0d), 0.0d);
    }

    @Test
    public void test8465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8465");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(55.0d, 74.0d, 56.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8466");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-3.0d), (double) '#', (-12.0d), 61.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8467");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 0, (-2.0d), 13.0d, 75.0d);
    }

    @Test
    public void test8468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8468");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 76.0d, (-83.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 76.0d + "'", double4 == 76.0d);
    }

    @Test
    public void test8469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8469");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-49.0d), 0.0d, 33.0d, 84.0d);
    }

    @Test
    public void test8470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8470");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-3.0d), 69.0d, 91.0d);
    }

    @Test
    public void test8471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8471");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-39.0d), (double) 100, 95.0d, (double) (byte) 0);
    }

    @Test
    public void test8472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8472");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(14.0d, (-9.0d), 44.0d);
    }

    @Test
    public void test8473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8473");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 10, 85.0d, 19.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test8474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8474");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(62.0d, (-5.0d), (-55.0d), 67.0d);
    }

    @Test
    public void test8475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8475");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-88.0d), (-64.0d), (double) 10.0f, 7.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test8476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8476");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-60.0d), 71.0d, (-81.0d), (-74.0d));
    }

    @Test
    public void test8477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8477");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 1, (double) (short) 0, 7.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test8478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8478");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(55.0d, (-17.0d), 8.0d, (double) (byte) 1);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8479");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', (-59.0d), 0.0d, (-44.0d));
    }

    @Test
    public void test8480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8480");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(83.0d, (-19.0d), (-70.0d), 9.0d);
    }

    @Test
    public void test8481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8481");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-28.0d), (-43.0d), 46.0d);
    }

    @Test
    public void test8482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8482");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) ' ', (-70.0d), 24.0d, 0.0d);
    }

    @Test
    public void test8483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8483");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-63.0d), 52.0d, 58.0d, 0.0d);
    }

    @Test
    public void test8484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8484");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10.0f, 0.0d, 91.0d, (-63.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8485");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-7.0d), (-29.0d), (-25.0d), (-25.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0d + "'", double5 == 3.0d);
    }

    @Test
    public void test8486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8486");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(80.0d, (-48.0d), (double) ' ', (-55.0d));
    }

    @Test
    public void test8487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8487");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(70.0d, 93.0d, 94.0d);
    }

    @Test
    public void test8488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8488");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-82.0d), (-23.0d), 55.0d, 67.0d);
    }

    @Test
    public void test8489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8489");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(74.0d, 0.0d, 3.0d, 3.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test8490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8490");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(48.0d, 13.0d, (-17.0d), 49.0d);
    }

    @Test
    public void test8491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8491");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-13.0d), 98.0d, 5.0d, (-27.0d));
    }

    @Test
    public void test8492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8492");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-80.0d), (-21.0d), 44.0d);
    }

    @Test
    public void test8493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8493");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(60.0d, 23.0d, 33.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 17.0d + "'", double4 == 17.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test8494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8494");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(89.0d, 80.0d, 6.0d);
    }

    @Test
    public void test8495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8495");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-5.0d), (double) (byte) 100);
    }

    @Test
    public void test8496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8496");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 0, 74.0d, (double) 10);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
    }

    @Test
    public void test8497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8497");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 0, 94.0d, (-49.0d), 65.0d);
    }

    @Test
    public void test8498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8498");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(8.0d, (-36.0d), 29.0d, (-63.0d));
    }

    @Test
    public void test8499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8499");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1.0f), 0.0d, 45.0d, 67.0d);
    }

    @Test
    public void test8500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8500");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-58.0d), 0.0d, (-11.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}
