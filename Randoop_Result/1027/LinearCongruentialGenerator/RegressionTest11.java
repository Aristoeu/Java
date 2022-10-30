package LinearCongruentialGenerator;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(36.0d, 32.0d, 31.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0, (double) 100L, 9.0d, 63.0d);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(22.0d, 49.0d, (double) ' ', (double) '4');
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-20.0d), (-5.0d), (double) '#', 30.0d);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(60.0d, 98.0d, (double) 'a');
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 65.0d + "'", double4 == 65.0d);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1.0f), (double) 1, 0.0d, 59.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100, (double) 10, (double) 1, (double) (short) 0);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, 21.0d, (-14.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-45.0d), (-27.0d), (double) 0.0f, 61.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(14.0d, 78.0d, 48.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 36.0d + "'", double4 == 36.0d);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-39.0d), 21.0d, (double) (short) 100);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(98.0d, 55.0d, 4.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.0d + "'", double4 == 3.0d);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(18.0d, 70.0d, 18.0d, (-22.0d));
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, (-63.0d), (-29.0d));
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(21.0d, 92.0d, (-32.0d), (-36.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(71.0d, 76.0d, (-43.0d));
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-81.0d), 95.0d, (-15.0d), 38.0d);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(25.0d, 47.0d, (-27.0d), 25.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 23.0d + "'", double5 == 23.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(88.0d, (double) (-1), 4.0d, (-58.0d));
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(36.0d, 48.0d, (double) (-1.0f), (double) 1);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(82.0d, (-49.0d), (double) '4');
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(58.0d, (-89.0d), (-7.0d), (-16.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1), 23.0d, 60.0d);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-26.0d), (-35.0d), (double) (short) -1, 19.0d);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) -1, 11.0d, (-23.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-4.0d) + "'", double4 == (-4.0d));
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(58.0d, (-78.0d), 13.0d);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10, (double) 100L, (-0.0d), (double) 1);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass8 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10, 12.0d, 10.0d, 24.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(13.0d, (-45.0d), (double) (byte) 1);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(20.0d, 7.0d, 70.0d, 51.0d);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(51.0d, 96.0d, 32.0d);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-19.0d), (-25.0d), (-30.0d));
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-19.0d), 20.0d, (-89.0d), 76.0d);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(20.0d, 25.0d, (-98.0d), 74.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(98.0d, 0.0d, (double) (short) -1, (-98.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(49.0d, 27.0d, (-5.0d), 47.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(20.0d, 39.0d, (-36.0d), 33.0d);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, 19.0d, 8.0d, (double) (short) 100);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0.0f, (double) (-1.0f), (double) 100.0f, (double) 0);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-0.0d), 29.0d, (double) (-1L), (double) (-1L));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(22.0d, 76.0d, (-31.0d));
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-37.0d), 28.0d, 19.0d, (-64.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-57.0d) + "'", double5 == (-57.0d));
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(12.0d, (-22.0d), 13.0d, 58.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-19.0d) + "'", double5 == (-19.0d));
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0, (-10.0d), 2.0d, (-23.0d));
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(43.0d, (-13.0d), 59.0d);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(59.0d, 77.0d, 69.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 51.0d + "'", double4 == 51.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(25.0d, 38.0d, (double) 0);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(Double.NaN, 34.0d, (double) 10L, (-88.0d));
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(85.0d, 51.0d, 45.0d, (-60.0d));
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 87.0d, (-9.0d));
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-0.0d), 75.0d, (-21.0d), (-34.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-52.0d), (-41.0d), 34.0d);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(38.0d, (-45.0d), (-62.0d), 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-26.0d), 48.0d, (double) 'a', (-32.0d));
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(88.0d, 13.0d, (-22.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 13.0d + "'", double4 == 13.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.0d + "'", double5 == 13.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(1.0d, 29.0d, 64.0d, (-31.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10.0f, 10.0d, 100.0d, 26.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 18.0d + "'", double5 == 18.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 14.0d + "'", double7 == 14.0d);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(75.0d, (-11.0d), 96.0d);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(2.0d, (-81.0d), 45.0d, 98.0d);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-58.0d), 24.0d, (-8.0d), 4.0d);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(96.0d, (-35.0d), 8.0d);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 21.0d, (-37.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 10, 38.0d, 23.0d, (-47.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 27.0d + "'", double5 == 27.0d);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(85.0d, 0.0d, 63.0d);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-14.0d), (-19.0d), 22.0d);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(3.0d, (-4.0d), 93.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 74.0d + "'", double4 == 74.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(8.0d, 15.0d, 11.0d, 51.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(14.0d, 75.0d, 52.0d);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100, 46.0d, (double) (-1.0f));
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(92.0d, (-32.0d), 7.0d);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(31.0d, 70.0d, 59.0d, (-74.0d));
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-22.0d), (-22.0d), (-32.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(5.0d, 4.0d, (-27.0d));
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '4', 0.0d, (double) '#');
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 19.0d + "'", double4 == 19.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 31.0d + "'", double6 == 31.0d);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(57.0d, (-41.0d), (double) 0L, (double) '4');
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, (-14.0d), (-1.0d));
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(82.0d, 29.0d, (-48.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(69.0d, (double) 10, (-33.0d), (double) (byte) -1);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(77.0d, 0.0d, 69.0d);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10.0f, 24.0d, 54.0d, (-27.0d));
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(63.0d, (-48.0d), 60.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(50.0d, (-88.0d), 46.0d, 88.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-42.0d) + "'", double5 == (-42.0d));
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(67.0d, (-59.0d), 26.0d, (double) (short) -1);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-4.0d), 11.0d, (-11.0d));
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(61.0d, 0.0d, (-76.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-9.0d), 0.0d, 19.0d, 74.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(9.0d, (-18.0d), (-85.0d));
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(7.0d, 0.0d, (-37.0d));
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(49.0d, 27.0d, 87.0d);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 30.0d, 50.0d);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(41.0d, 14.0d, Double.NaN, (double) (byte) 100);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, (-14.0d), 0.0d, 13.0d);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(34.0d, (-98.0d), (-81.0d), 93.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-65.0d) + "'", double5 == (-65.0d));
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-16.0d), 50.0d, (double) 100);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-78.0d), 16.0d, 25.0d);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-58.0d), 25.0d, 49.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100.0f, 30.0d, (-25.0d), (-33.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-36.0d), 24.0d, 8.0d, 18.0d);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-36.0d), (double) (short) 1, (-29.0d), 65.0d);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(83.0d, (double) 'a', (-50.0d));
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, 0.0d, 9.0d, (-5.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(48.0d, (double) ' ', (double) 1, (double) ' ');
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-76.0d), 27.0d, 81.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 1, 44.0d, 5.0d, 0.0d);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(33.0d, (-59.0d), (-71.0d), (-33.0d));
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(15.0d, 85.0d, 75.0d, (-57.0d));
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 0, 83.0d, (-47.0d), (-48.0d));
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(40.0d, (-19.0d), (double) 100L, 36.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-27.0d), (-89.0d), (-15.0d), 24.0d);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-24.0d), (-18.0d), (double) (short) -1);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0, 87.0d, 0.0d);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-9.0d), 75.0d, 76.0d, 100.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(36.0d, 37.0d, (-62.0d), (-16.0d));
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-5.0d), 0.0d, (-9.0d));
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-6.0d), 57.0d, (-80.0d));
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(90.0d, (double) (-1L), (-58.0d));
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0L, (double) (byte) 100, 8.0d, (double) (short) 100);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(30.0d, 0.0d, 51.0d, 75.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-22.0d), (double) (-1.0f), 31.0d);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(30.0d, 27.0d, 25.0d, 29.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 23.0d + "'", double5 == 23.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-52.0d), 13.0d, 55.0d, (-35.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-26.0d) + "'", double5 == (-26.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(90.0d, (double) '4', 20.0d, 83.0d);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 1, 43.0d, (-59.0d), 76.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(92.0d, 57.0d, (-93.0d));
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-64.0d), (-52.0d), (double) (-1.0f));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(18.0d, (-16.0d), 11.0d, 3.0d);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, 17.0d, 9.0d, (double) ' ');
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-74.0d), (double) (-1), 100.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-7.0d) + "'", double4 == (-7.0d));
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(11.0d, (double) (byte) 0, (-43.0d), (-83.0d));
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-2.0d), 63.0d, 36.0d);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(27.0d, 62.0d, (-7.0d));
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(23.0d, 65.0d, (-83.0d), 57.0d);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-81.0d), 88.0d, 56.0d);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(40.0d, (double) (byte) 100, 3.0d, (-27.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.0d + "'", double5 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1.0f), 70.0d, (double) (byte) 0, 49.0d);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, 43.0d, (double) 0L, (-18.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-88.0d), 80.0d, (-65.0d), (double) (short) 0);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(3.0d, 0.0d, 17.0d, 0.0d);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-54.0d), (-80.0d), 33.0d);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-11.0d), 58.0d, (double) (byte) 100, 36.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-34.0d) + "'", double5 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.0d) + "'", double6 == (-0.0d));
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(64.0d, 6.0d, (-21.0d));
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-76.0d), (double) 100L, (-24.0d));
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(46.0d, (-62.0d), 18.0d, 26.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-50.0d), (-41.0d), (-54.0d));
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-47.0d), 0.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(53.0d, (double) 1.0f, (-20.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(7.0d, (double) (-1L), 30.0d, (double) (byte) 0);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-64.0d), 74.0d, 0.0d, 100.0d);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, 43.0d, 33.0d);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-27.0d), 0.0d, 18.0d, (-6.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-10.0d), 0.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1), (-5.0d), 50.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-24.0d) + "'", double4 == (-24.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(27.0d, 0.0d, 10.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.0d + "'", double5 == 7.0d);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 0, (double) (short) 100, (-75.0d), 77.0d);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(3.0d, (double) (short) 1, 10.0d, (-22.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10.0f, (-1.0d), 15.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(5.0d, (double) ' ', 61.0d, 8.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(40.0d, (-46.0d), 75.0d);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, (-80.0d), 45.0d);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100, (-1.0d), (double) '#');
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 24.0d + "'", double4 == 24.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 19.0d + "'", double5 == 19.0d);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(8.0d, (double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(41.0d, 37.0d, (-83.0d), (-30.0d));
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(98.0d, (-0.0d), (-59.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-26.0d), 77.0d, (-3.0d), 10.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-5.0d) + "'", double5 == (-5.0d));
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(78.0d, 89.0d, 15.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-2.0d), 0.0d, 49.0d, (-81.0d));
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(55.0d, (double) (short) -1, (-70.0d), (-58.0d));
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(76.0d, 0.0d, (double) 0.0f);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(39.0d, (-7.0d), 19.0d);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(30.0d, 36.0d, (-53.0d), (double) (byte) 100);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(15.0d, (double) (byte) 10, 35.0d, (-1.0d));
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(70.0d, 34.0d, 55.0d, 16.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-59.0d), (double) (byte) 100, (-60.0d));
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-18.0d), 52.0d, (-26.0d));
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-24.0d), 4.0d, (-27.0d), 1.0d);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100.0f, (-49.0d), Double.NaN);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-16.0d), (double) (byte) 10, (-21.0d));
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-21.0d), (double) (short) 10, 21.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-11.0d) + "'", double4 == (-11.0d));
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-34.0d), 0.0d, 28.0d, 64.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 28.0d + "'", double5 == 28.0d);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-25.0d), (-22.0d), (double) 10L, (double) 0.0f);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(1.0d, 71.0d, (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-7.0d), 1.0d, 20.0d, 33.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.0d + "'", double5 == 13.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1, (-64.0d), (-19.0d), 77.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', (-50.0d), 81.0d);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(38.0d, (-45.0d), (-62.0d), 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '4', 38.0d, 1.0d, 0.0d);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, 7.0d, 0.0d, 64.0d);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-80.0d), 12.0d, (-54.0d));
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(92.0d, (double) (-1), (-64.0d));
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-45.0d), 69.0d, (double) (short) 100, (-5.0d));
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(1.0d, (-53.0d), (-76.0d));
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(82.0d, 7.0d, (double) 100, 72.0d);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(43.0d, 83.0d, 18.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(25.0d, 4.0d, 11.0d, 26.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(71.0d, (-22.0d), 57.0d);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(90.0d, 53.0d, 42.0d);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1.0f, 0.0d, 9.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.0d + "'", double4 == 3.0d);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0, (-25.0d), 39.0d, 23.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 16.0d + "'", double5 == 16.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(39.0d, 87.0d, (-49.0d), 35.0d);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 53.0d, 0.0d);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 0, 51.0d, 0.0d, Double.NaN);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-37.0d), (-76.0d), 50.0d);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-3.0d), 100.0d, 43.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-14.0d) + "'", double4 == (-14.0d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.0d + "'", double5 == 13.0d);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10.0f, 35.0d, (-75.0d), 34.0d);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(17.0d, 22.0d, 63.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 31.0d + "'", double4 == 31.0d);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(62.0d, (-31.0d), (-36.0d), 40.0d);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '#', (-6.0d), 27.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-59.0d), (double) (-1L), 22.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(82.0d, (-32.0d), 64.0d, (-93.0d));
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(1.0d, 5.0d, 3.0d, 44.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(50.0d, 19.0d, (double) 0L);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(18.0d, 12.0d, (-23.0d), 23.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-24.0d), 66.0d, Double.NaN);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 10, 87.0d, 77.0d, 0.0d);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0.0f, 98.0d, (-48.0d));
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 100, (-41.0d), (double) 10.0f);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(89.0d, (-27.0d), 53.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(100.0d, (double) 10, 82.0d);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-21.0d), (-3.0d), (double) (short) 1);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(100.0d, (double) (byte) 100, 37.0d, (-53.0d));
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-54.0d), (double) (byte) -1, (-60.0d), 65.0d);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(33.0d, (-59.0d), 49.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 100, (double) 10, (-1.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-31.0d), 90.0d, 85.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-53.0d) + "'", double4 == (-53.0d));
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(8.0d, 67.0d, 51.0d, 62.0d);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(54.0d, (double) (byte) -1, 53.0d, (double) (short) 1);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1.0f, 67.0d, 60.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(12.0d, (-18.0d), 30.0d, 36.0d);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, (-98.0d), (-55.0d), (-20.0d));
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-58.0d), (-88.0d), 92.0d, (-46.0d));
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(53.0d, 81.0d, (-29.0d), (-85.0d));
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0, 18.0d, (-7.0d), 92.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-7.0d) + "'", double5 == (-7.0d));
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(7.0d, (double) 1, (double) 100L, 38.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 31.0d + "'", double5 == 31.0d);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(53.0d, (-0.0d), 14.0d, 28.0d);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-23.0d), (-4.0d), (-15.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(37.0d, (-42.0d), 98.0d);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-57.0d), (double) 100.0f, (double) ' ', 41.0d);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(72.0d, 21.0d, (double) (byte) 1);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-6.0d), (-18.0d), 21.0d);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-21.0d), (-62.0d), (-44.0d));
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(10.0d, 12.0d, 38.0d, (-3.0d));
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) ' ', (double) (byte) 10, 4.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-49.0d), 44.0d, 85.0d, (double) 10.0f);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1, (double) (short) 100, (-2.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-81.0d), 11.0d, 33.0d);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-49.0d), (-74.0d), (-29.0d), 0.0d);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-48.0d), 59.0d, (-15.0d), (-5.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, 0.0d, 28.0d, (-18.0d));
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(69.0d, 28.0d, 15.0d, (-1.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(50.0d, (-46.0d), 58.0d, 0.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(100.0d, 13.0d, (double) (-1L));
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(7.0d, 49.0d, (-71.0d), (-30.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, (-63.0d), (-30.0d), 36.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 33.0d + "'", double5 == 33.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(62.0d, 93.0d, 0.0d);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-31.0d), (-21.0d), 0.0d, (double) (short) 10);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(4.0d, 37.0d, (-1.0d), 61.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(11.0d, 73.0d, 76.0d, 63.0d);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-44.0d), (double) (short) 0, (-11.0d), 29.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(28.0d, 14.0d, 61.0d, 14.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 0.0d, 9.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(54.0d, 49.0d, 0.0d);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(34.0d, (-15.0d), (double) (byte) -1);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-13.0d), (double) 1L, (-64.0d));
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(71.0d, 89.0d, 0.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(33.0d, 71.0d, (double) (short) 100, 0.0d);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(23.0d, (double) 1, 3.0d, (-8.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-3.0d), (double) 10.0f, 71.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-6.0d), 58.0d, (-47.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-31.0d) + "'", double4 == (-31.0d));
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-30.0d), 42.0d, 33.0d);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-27.0d), 27.0d, 50.0d, 6.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-75.0d), 51.0d, (double) (short) 1);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(16.0d, 25.0d, (double) 100);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(88.0d, (-7.0d), 73.0d, 20.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-4.0d), 42.0d, 69.0d, (-14.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-3.0d), 53.0d, 71.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-1.0d), (double) (byte) 100, (double) (short) -1);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.0d) + "'", double4 == (-0.0d));
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(98.0d, 93.0d, (double) 10.0f, (double) (byte) 10);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-15.0d), (-42.0d), 37.0d, 83.0d);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(43.0d, (-35.0d), 23.0d, 10.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-47.0d), (-48.0d), 52.0d, 75.0d);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '4', (-93.0d), 24.0d, 43.0d);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 10, 49.0d, 89.0d);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(64.0d, (double) ' ', 42.0d, 77.0d);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) (short) 1, (double) (byte) 1);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(67.0d, 32.0d, 76.0d, (double) 1L);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(46.0d, 0.0d, (-85.0d), 67.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(7.0d, 65.0d, 14.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-11.0d), (double) (byte) 1, 7.0d, 40.0d);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-12.0d), (-63.0d), (-42.0d));
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0, 67.0d, (double) 10.0f);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-35.0d), 21.0d, 50.0d, 81.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-37.0d) + "'", double5 == (-37.0d));
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(100.0d, (double) (-1.0f), (-21.0d), (double) (byte) 0);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(28.0d, 0.0d, (double) (short) 1);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-36.0d), (-89.0d), (double) (short) 100);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(77.0d, (-48.0d), 67.0d, (double) 100.0f);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1.0f, 30.0d, 11.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(27.0d, (double) 0L, (double) 1);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(31.0d, (-43.0d), 22.0d, 15.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-6.0d) + "'", double5 == (-6.0d));
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-74.0d), 19.0d, 78.0d, 71.0d);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, (-16.0d), (-76.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(44.0d, (-89.0d), 53.0d, (-25.0d));
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(88.0d, (-34.0d), (double) '4', 46.0d);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-85.0d), 66.0d, 43.0d, 28.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(19.0d, 11.0d, (-78.0d));
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-16.0d), 35.0d, (double) '4');
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 100.0d, 98.0d, 19.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0d + "'", double5 == 3.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-16.0d), 65.0d, (double) (byte) -1);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-30.0d), (double) (short) 100, (-15.0d), 55.0d);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(72.0d, 98.0d, 82.0d);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(25.0d, 2.0d, (-46.0d));
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(90.0d, (-46.0d), (-23.0d), (-71.0d));
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(55.0d, (-9.0d), (-20.0d), (-57.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1.0f), 12.0d, (-11.0d), (-0.0d));
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(2.0d, (double) (short) 100, 67.0d, (double) (-1.0f));
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) ' ', (-46.0d), 21.0d);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-40.0d), (-80.0d), (-41.0d), (-29.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(61.0d, 12.0d, (double) 100, (-22.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 18.0d + "'", double5 == 18.0d);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 2.0d, 6.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(70.0d, 2.0d, 55.0d);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(89.0d, (-27.0d), (double) (short) 10, 77.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '#', 76.0d, 1.0d, 56.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-0.0d), (-81.0d), (-23.0d));
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-52.0d), (-37.0d), (double) (byte) -1, 8.0d);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(62.0d, (-59.0d), (-2.0d), 36.0d);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(23.0d, 41.0d, (-27.0d), 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-5.0d), (-16.0d), 61.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-16.0d) + "'", double4 == (-16.0d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0d + "'", double5 == 3.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-31.0d) + "'", double6 == (-31.0d));
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-42.0d), (double) (byte) 100, (-54.0d), (-64.0d));
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-16.0d), 21.0d, (-21.0d), (double) 0);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1L), 8.0d, (double) (byte) 100);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-9.0d), 92.0d, 88.0d, (double) 10);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-6.0d), (-83.0d), (double) (byte) -1);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 1, (double) (-1), (double) (byte) 0);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 100, 98.0d, 77.0d);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', 39.0d, 33.0d, 11.0d);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1, (-15.0d), (-20.0d));
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(44.0d, (-18.0d), 4.0d, 80.0d);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-76.0d), (double) 'a', (-25.0d), 41.0d);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 1, 13.0d, 66.0d);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 100, 7.0d, (-27.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 16.0d + "'", double4 == 16.0d);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-27.0d), (-5.0d), (-88.0d), 64.0d);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-15.0d), 81.0d, 33.0d, 37.0d);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 10, (-19.0d), (-22.0d), 35.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-2.0d) + "'", double5 == (-2.0d));
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-44.0d), 82.0d, 29.0d, (-35.0d));
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(44.0d, (-39.0d), 27.0d, 13.0d);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 76.0d, 9.0d, (-13.0d));
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(11.0d, (-52.0d), 74.0d, 39.0d);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) -1, (-20.0d), 25.0d);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) '4', (-50.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-40.0d), (-53.0d), (-64.0d));
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 100, (-49.0d), 90.0d, 6.0d);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(39.0d, 0.0d, (-70.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-76.0d), (double) '4', 54.0d, (double) 100);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-29.0d), 60.0d, (-24.0d), (-32.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-89.0d), 62.0d, (double) (short) 10, (-83.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1), (-44.0d), 12.0d);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(81.0d, 13.0d, (double) 100.0f);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-46.0d), 76.0d, (-53.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(1.0d, (-4.0d), (-39.0d), 62.0d);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(59.0d, (double) (-1L), (-1.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-40.0d), (double) 100.0f, 35.0d, 42.0d);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-18.0d), (-6.0d), (double) 10, (-83.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(56.0d, 85.0d, 13.0d, (-81.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 75.0d + "'", double5 == 75.0d);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-2.0d), 57.0d, 0.0d, (-16.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-2.0d) + "'", double5 == (-2.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(75.0d, 85.0d, (-30.0d), (-14.0d));
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(30.0d, 34.0d, 52.0d, 90.0d);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(15.0d, 40.0d, 59.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(3.0d, 78.0d, (-19.0d));
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1.0f, (-64.0d), (-33.0d), 23.0d);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(5.0d, (double) '4', 0.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(63.0d, (-8.0d), (-78.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 34.0d + "'", double4 == 34.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 28.0d + "'", double5 == 28.0d);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-33.0d), (double) (byte) 100, 74.0d);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(50.0d, (double) (-1.0f), 33.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(50.0d, 92.0d, (-26.0d));
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0.0f, (-30.0d), 98.0d);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-36.0d), 10.0d, 54.0d);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(90.0d, (-89.0d), (-1.0d));
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(51.0d, (-35.0d), 88.0d, 0.0d);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, (-76.0d), 98.0d, 27.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 17.0d + "'", double6 == 17.0d);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-0.0d), (-88.0d), (-24.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-16.0d) + "'", double4 == (-16.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-16.0d) + "'", double5 == (-16.0d));
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(53.0d, 39.0d, 0.0d, (-22.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 21.0d + "'", double5 == 21.0d);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(78.0d, (-15.0d), 81.0d, 74.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100, (-63.0d), 14.0d, (-80.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-46.0d) + "'", double5 == (-46.0d));
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(82.0d, 24.0d, (-85.0d));
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(38.0d, 36.0d, 0.0d, 16.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(35.0d, 52.0d, (-57.0d), 72.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-0.0d), 0.0d, (double) (byte) -1);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(38.0d, (-54.0d), Double.NaN);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-15.0d), (-49.0d), 41.0d);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) 0, 7.0d, 29.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        double double8 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.0d + "'", double5 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.0d + "'", double6 == 7.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.0d + "'", double7 == 7.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.0d + "'", double8 == 7.0d);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-13.0d), (-16.0d), (double) 100, (-14.0d));
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(66.0d, 78.0d, 60.0d, (double) 1L);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(100.0d, (-34.0d), (double) 0);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(92.0d, (-48.0d), (-39.0d));
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(35.0d, (-74.0d), 33.0d, 73.0d);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(42.0d, 14.0d, 13.0d, 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(10.0d, 65.0d, (double) 100);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-45.0d), 38.0d, (double) (-1L));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, (-23.0d), (-81.0d), 42.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-29.0d) + "'", double5 == (-29.0d));
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(100.0d, 17.0d, (-7.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(3.0d, (double) (short) 100, 90.0d);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(90.0d, (double) 0L, 23.0d);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(43.0d, 55.0d, 67.0d, 0.0d);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, 0.0d, (double) 10.0f);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-8.0d) + "'", double4 == (-8.0d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-8.0d) + "'", double6 == (-8.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 1, 90.0d, 38.0d, (-36.0d));
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '#', 0.0d, (-3.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(6.0d, 9.0d, 26.0d);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-0.0d), (double) 1, 33.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, 0.0d, (double) 1L, (-1.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-19.0d), (double) (short) 10);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(78.0d, (-41.0d), 0.0d);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-18.0d), 88.0d, (double) 10L);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(98.0d, (-17.0d), 52.0d);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-14.0d), (double) (byte) 10, (double) (byte) 10);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-8.0d) + "'", double4 == (-8.0d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-8.0d) + "'", double6 == (-8.0d));
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(85.0d, 85.0d, (-19.0d), 0.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, (-37.0d), 92.0d);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1L), 12.0d, 4.0d, (-7.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(22.0d, 53.0d, 0.0d);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(14.0d, (double) 0L, (double) 10L, 47.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(40.0d, 20.0d, (double) 0.0f);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(28.0d, 1.0d, (-70.0d), (-2.0d));
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(45.0d, (double) 100.0f, 46.0d, 33.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, 63.0d, 0.0d, 0.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(13.0d, (-6.0d), 76.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 29.0d + "'", double4 == 29.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 67.0d + "'", double5 == 67.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 29.0d + "'", double6 == 29.0d);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-64.0d), 58.0d, 62.0d, (-13.0d));
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(Double.NaN, (-60.0d), (-74.0d));
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0L, (-6.0d), (double) (byte) -1);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(87.0d, (-29.0d), (-75.0d));
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 10, (-0.0d), 16.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.0d + "'", double4 == 6.0d);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(57.0d, 10.0d, 2.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', (-60.0d), (-98.0d), (double) '4');
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-76.0d), 36.0d, (double) 1);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(31.0d, (double) 1L, 2.0d, 52.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 33.0d + "'", double5 == 33.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(89.0d, 47.0d, (-47.0d), (-80.0d));
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-50.0d), 30.0d, 4.0d, (double) 1);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(57.0d, 57.0d, 98.0d);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(40.0d, 0.0d, (-4.0d), 5.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-4.0d) + "'", double5 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-4.0d) + "'", double6 == (-4.0d));
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, (-62.0d), (double) (byte) 10);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, (-11.0d), 12.0d, 56.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-88.0d), (-6.0d), 62.0d, 43.0d);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-45.0d), (-64.0d), 30.0d);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(93.0d, 76.0d, 15.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-8.0d), 71.0d, 56.0d, (double) '4');
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-44.0d) + "'", double5 == (-44.0d));
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(73.0d, (-9.0d), 85.0d, (-19.0d));
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(8.0d, 50.0d, 12.0d, 12.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-44.0d), 87.0d);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(13.0d, (-47.0d), (-30.0d), 8.0d);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(6.0d, 66.0d, (-63.0d));
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-44.0d), (-39.0d), 23.0d, (-19.0d));
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(69.0d, (double) 1, 16.0d);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(67.0d, 38.0d, 14.0d, (-88.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 54.0d + "'", double6 == 54.0d);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(18.0d, 6.0d, (double) (short) 100, 100.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, 20.0d, (double) 100L, (-4.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 59.0d, 50.0d, (-63.0d));
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(3.0d, 0.0d, (-17.0d), 3.0d);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(21.0d, (-88.0d), (-98.0d), (-83.0d));
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(20.0d, (-1.0d), (-19.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 16.0d + "'", double4 == 16.0d);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-78.0d), 40.0d, (-29.0d), (-5.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(47.0d, (double) ' ', (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-85.0d), (-98.0d), 33.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-30.0d) + "'", double4 == (-30.0d));
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-65.0d), 0.0d, (-4.0d), (-23.0d));
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, (double) (-1L), 69.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9.0d) + "'", double4 == (-9.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '#', (double) 0, (-76.0d), (-3.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(90.0d, Double.NaN, (double) (short) -1, 64.0d);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(57.0d, (-60.0d), 83.0d, 85.0d);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(45.0d, (-62.0d), 37.0d, (double) (-1));
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-11.0d), (-9.0d), (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 100, (-65.0d), (-54.0d), 54.0d);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(98.0d, (double) ' ', 7.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-15.0d), (double) (short) 10, 0.0d);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(47.0d, 50.0d, (double) 100, (-35.0d));
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-76.0d), 36.0d, (-50.0d));
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(38.0d, (double) 0.0f, (-81.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-98.0d), 36.0d, 57.0d, (-24.0d));
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(21.0d, 11.0d, (double) 10.0f, 77.0d);
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(30.0d, (-25.0d), (-57.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, (double) 10, 9.0d, (-58.0d));
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(98.0d, (double) 10.0f, 23.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 19.0d + "'", double4 == 19.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', 22.0d, (-1.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(57.0d, 54.0d, (-18.0d));
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '#', (double) (short) 100, 22.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 12.0d + "'", double5 == 12.0d);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 28.0d, (double) '#', 22.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.0d + "'", double5 == 13.0d);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(4.0d, 0.0d, 100.0d, (-2.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(60.0d, (-14.0d), (-17.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 16.0d + "'", double5 == 16.0d);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-1.0d), (-13.0d), (double) 10L);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9.0d) + "'", double4 == (-9.0d));
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-2.0d), 11.0d, 0.0d, (double) 0L);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '#', (-70.0d), (double) 0.0f, 34.0d);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-76.0d), 56.0d, 37.0d, (double) (short) -1);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-40.0d), (-19.0d), 0.0d);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) -1, (-2.0d), (-71.0d));
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-85.0d), 36.0d, 87.0d);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-37.0d), 93.0d, (double) (short) 100, (-18.0d));
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-1.0d), 20.0d, (-64.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-8.0d) + "'", double4 == (-8.0d));
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-16.0d), 21.0d, 52.0d, (double) 1L);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(6.0d, (-53.0d), (-27.0d));
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(98.0d, 70.0d, (-7.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-76.0d), (double) '#', (double) 100.0f, 69.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-7.0d) + "'", double5 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-7.0d) + "'", double6 == (-7.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0L, 76.0d, 59.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 17.0d + "'", double4 == 17.0d);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, 47.0d, (double) (short) 1, (double) 0L);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(35.0d, (double) (-1), (-47.0d), (-65.0d));
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10L, (-7.0d), (double) 1L);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }
}
