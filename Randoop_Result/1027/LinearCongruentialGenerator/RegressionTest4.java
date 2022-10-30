package LinearCongruentialGenerator;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(16.0d, 0.0d, (double) (short) 10, 21.0d);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(88.0d, 40.0d, (-24.0d), (-26.0d));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, 0.0d, (double) 10.0f);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(40.0d, (-45.0d), 51.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-24.0d), (double) '#', (double) 100L);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, 57.0d, 10.0d, 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, 98.0d, 8.0d, 30.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.0d + "'", double5 == 6.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 0, 61.0d, 34.0d, 15.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 0, 93.0d, 30.0d, 12.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.0d + "'", double5 == 6.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-76.0d), (double) '#', (double) 100L);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-11.0d), (double) 10, (-25.0d));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(89.0d, (-22.0d), 4.0d);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(61.0d, 5.0d, 59.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1.0f, 82.0d, (-13.0d));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(57.0d, (-47.0d), (-47.0d));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 89.0d, 26.0d, (-41.0d));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, 26.0d, (-33.0d), (double) (byte) 1);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(28.0d, 44.0d, 49.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 37.0d + "'", double4 == 37.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(23.0d, 88.0d, 0.0d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, (-2.0d), 44.0d);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 0, (double) (-1L), (double) (byte) -1, (-2.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-1.0d), 65.0d, 18.0d, (double) (byte) 0);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(16.0d, 42.0d, (-12.0d), 12.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(39.0d, (double) (short) 0, 34.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10, (double) (short) 0, (double) 0.0f);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 10, 45.0d, (double) 1);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(3.0d, (-76.0d), 53.0d);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 10, 10.0d, (-1.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
        double double7 = linearCongruentialGenerator3.nextNumber();
        double double8 = linearCongruentialGenerator3.nextNumber();
        double double9 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass10 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, 6.0d, (double) (byte) 0, 48.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 12.0d + "'", double5 == 12.0d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(42.0d, (-41.0d), 19.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) (short) 0, 0.0d, (-89.0d));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-24.0d), (-21.0d), (-3.0d), 81.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(60.0d, (-35.0d), 88.0d, (double) (byte) 10);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(36.0d, (-10.0d), 0.0d, 48.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(92.0d, (-19.0d), 22.0d, 92.0d);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, (-12.0d), (-1.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 10, 32.0d, (-11.0d), (-1.0d));
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(40.0d, 9.0d, 0.0d, (-14.0d));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-4.0d), 4.0d, (double) (short) 0, (double) 0.0f);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-48.0d), 0.0d, (-9.0d));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 100, (-23.0d), (-89.0d));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(66.0d, (double) (short) 100, (double) 1L, 72.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(43.0d, (double) ' ', 15.0d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(75.0d, (-25.0d), (-22.0d), (double) ' ');
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(31.0d, (-7.0d), (double) (-1));
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(30.0d, (double) 10, 0.0d, (double) (short) -1);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-16.0d), 42.0d, (-98.0d));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) (-1L), (-76.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-12.0d), 0.0d, (-14.0d), 89.0d);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(21.0d, 6.0d, 17.0d, 49.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(8.0d, 28.0d, 4.0d, (-17.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 7.0d + "'", double5 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 13.0d + "'", double6 == 13.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(60.0d, 40.0d, (-7.0d), 18.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 17.0d + "'", double5 == 17.0d);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, (-18.0d), (-7.0d), (double) 100.0f);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(8.0d, 59.0d, (double) 0L, 8.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(18.0d, 65.0d, 0.0d, (double) 1.0f);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-12.0d), 43.0d, (double) 0.0f);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(28.0d, (-52.0d), 8.0d, 45.0d);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1), (-64.0d), (double) 10L, 43.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(22.0d, 57.0d, 0.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(49.0d, (-7.0d), 55.0d, 0.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10L, (double) (byte) -1, (-3.0d), 7.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-6.0d) + "'", double5 == (-6.0d));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(19.0d, (-9.0d), 42.0d, 25.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-26.0d), (double) (byte) 0, (double) (short) 100);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-78.0d) + "'", double4 == (-78.0d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 28.0d + "'", double5 == 28.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-2.0d), (double) 100.0f, (-35.0d));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(22.0d, (-47.0d), (double) (byte) 0, 77.0d);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1.0f, (double) 0, (double) (short) 10);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(61.0d, (double) (-1), 93.0d);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-4.0d), (double) (short) 1, 78.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-27.0d) + "'", double4 == (-27.0d));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-8.0d), 60.0d, (double) 1);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(51.0d, (double) 0L, 15.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(Double.NaN, 60.0d, 77.0d, 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(52.0d, 10.0d, (-19.0d));
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) (short) -1, 81.0d, (double) (-1L));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 100, (-23.0d), 69.0d, (double) (byte) 1);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-64.0d), (double) (short) 100, (double) (short) 10);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '4', 39.0d, 21.0d);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(8.0d, (-50.0d), 28.0d, 61.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-6.0d) + "'", double5 == (-6.0d));
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(38.0d, 26.0d, (double) (-1.0f), 6.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(24.0d, (double) (byte) 0, (-44.0d));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(82.0d, 85.0d, 57.0d, 100.0d);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, 72.0d, 69.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(57.0d, 30.0d, (double) (short) 100, (double) 10L);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(52.0d, (double) 0L, 81.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-89.0d), (double) 0.0f, (-26.0d));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 100, (double) 100.0f, (double) 10);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(18.0d, 0.0d, 34.0d, (-4.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(98.0d, (double) (-1.0f), 15.0d, 25.0d);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-49.0d), 26.0d, (-76.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-25.0d), (-85.0d), 0.0d, (-16.0d));
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-14.0d), (-1.0d), (-27.0d));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(61.0d, 0.0d, (double) (short) 100);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 95.0d + "'", double4 == 95.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 95.0d + "'", double5 == 95.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 95.0d + "'", double6 == 95.0d);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(40.0d, (double) (short) 0, (-9.0d), (double) 1L);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, (double) 1.0f, (double) 10);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-1.0d), (-13.0d), 92.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(89.0d, 17.0d, (double) 1, (double) 0);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) (-1), (double) (-1));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(6.0d, 6.0d, 36.0d, (-27.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(98.0d, (-24.0d), (-81.0d), (double) (byte) 0);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 50.0d, 19.0d, Double.NaN);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, 26.0d, (double) (short) 0, (double) 10);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 48.0d, 22.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(69.0d, (double) '4', (double) (byte) -1, (-4.0d));
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100, 0.0d, (-52.0d), 0.0d);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(45.0d, (double) (-1), (double) 0);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-22.0d), (double) 10L, (-25.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-20.0d) + "'", double4 == (-20.0d));
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-62.0d), (double) 100L, (-4.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.0d) + "'", double4 == (-2.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(7.0d, 11.0d, (-9.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.0d + "'", double4 == 6.0d);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) -1, (double) (short) 10, 81.0d, (-3.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1.0f, 9.0d, 16.0d);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-62.0d), 69.0d, 16.0d, (-52.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(60.0d, (-44.0d), (-49.0d), 60.0d);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(52.0d, 76.0d, (double) (byte) 100, 16.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(58.0d, 69.0d, 72.0d, (-98.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 56.0d + "'", double5 == 56.0d);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-30.0d), 0.0d, 72.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(82.0d, (double) 1L, (-25.0d));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(61.0d, (double) 1, (double) '4', 55.0d);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '4', (double) 0, (double) 1.0f, (double) (short) -1);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(1.0d, (-44.0d), (-19.0d));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(2.0d, (-27.0d), 14.0d);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1), 36.0d, (-76.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-14.0d) + "'", double4 == (-14.0d));
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(69.0d, 50.0d, (-76.0d), (-8.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(48.0d, 1.0d, (double) 1, (-16.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(48.0d, 40.0d, (-88.0d), 0.0d);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(76.0d, 65.0d, 36.0d, (-21.0d));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) 0.0f, (double) 1.0f, (-1.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(6.0d, (double) 0.0f, 24.0d, 95.0d);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(46.0d, (-59.0d), 29.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0.0f, (-9.0d), (-98.0d), (-11.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(69.0d, (double) (byte) -1, 36.0d, 0.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(92.0d, 32.0d, (double) 0);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-78.0d), (double) (short) 10, 15.0d, 63.0d);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0, (double) (-1), 30.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, 33.0d, (double) 100.0f, (-89.0d));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-10.0d), 51.0d, (double) 10L);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(25.0d, 0.0d, 0.0d, (-41.0d));
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(53.0d, (double) (short) -1, (double) (short) 1);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-12.0d), 49.0d, 63.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(18.0d, (-7.0d), (-85.0d), (-98.0d));
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100, 18.0d, (double) (short) -1);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(76.0d, (-89.0d), (double) 0, (double) 10.0f);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, (double) (short) 10, (double) 100L, 58.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 14.0d + "'", double5 == 14.0d);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1L), 1.0d, Double.NaN, (double) 10L);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        double double8 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass9 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(37.0d, (-47.0d), 66.0d);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(6.0d, 74.0d, (-45.0d));
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(33.0d, (double) (short) 1, 15.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(10.0d, 38.0d, (-21.0d));
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) 1.0f, 0.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(25.0d, 6.0d, 15.0d);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1), (double) 0L, (double) (short) 10);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.0d) + "'", double4 == (-2.0d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(36.0d, 4.0d, 5.0d, 49.0d);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-9.0d), (double) 10.0f, 63.0d);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(75.0d, 29.0d, (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 0, 93.0d, 0.0d);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(47.0d, 59.0d, (-22.0d), 77.0d);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1.0f, 30.0d, 11.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(31.0d, 47.0d, 3.0d, 0.0d);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1L), 0.0d, (-22.0d));
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1.0f), 20.0d, (double) '#', (-17.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(74.0d, 38.0d, (double) 10);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(67.0d, (double) (short) 1, (double) (-1L), 69.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 15.0d, (-24.0d), 20.0d);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(55.0d, (double) (byte) 0, 43.0d, (double) (short) 100);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 0, (double) 10, (double) 10L);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-27.0d), (-35.0d), 1.0d);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 1, 29.0d, (-0.0d));
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-48.0d), 58.0d, 0.0d, 69.0d);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-30.0d), (double) 1L, 82.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 100, 76.0d, (double) 10L, (double) (byte) 10);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 89.0d, 25.0d, 0.0d);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 10, 15.0d, 92.0d, (double) 0L);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 100, 0.0d, (-76.0d), (-12.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, 39.0d, 82.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 24.0d + "'", double4 == 24.0d);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-85.0d), 55.0d, 8.0d);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-13.0d), (-14.0d), 77.0d);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(4.0d, (double) '#', 7.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.0d + "'", double4 == 6.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-30.0d), (double) 10.0f, 46.0d);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(19.0d, 22.0d, (-98.0d), (-63.0d));
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(49.0d, 40.0d, (double) (short) 0);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '#', (double) (short) 1, (-17.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 12.0d + "'", double4 == 12.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(6.0d, 0.0d, (double) (-1.0f), (-2.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-41.0d), 24.0d, (-0.0d));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, (-16.0d), (double) (byte) 100, (double) 10L);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(46.0d, 31.0d, 30.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(69.0d, (-50.0d), (-6.0d), 81.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 1, (double) (short) 1, (double) (-1L), (double) (short) 0);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 66.0d, (-23.0d), (-26.0d));
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-27.0d), 72.0d, 51.0d, (-2.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-88.0d), (-0.0d), 0.0d, 50.0d);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 1, 100.0d, 18.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.0d + "'", double4 == 6.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 16.0d + "'", double5 == 16.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(43.0d, 51.0d, (double) (-1), 100.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, (-12.0d), 38.0d, (-6.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(69.0d, (double) 100, 2.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(27.0d, 40.0d, (-88.0d));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-6.0d), (double) (byte) 0, (-1.0d), (double) (-1L));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-50.0d), 47.0d, 49.0d);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 10, (double) 100.0f, (double) '4', 6.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-49.0d), 20.0d, 52.0d);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(61.0d, 46.0d, 46.0d, (-8.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, 29.0d, 81.0d, 26.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass7 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 12.0d + "'", double5 == 12.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 13.0d + "'", double6 == 13.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(5.0d, 70.0d, 14.0d, (-48.0d));
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 0, (-25.0d), (-25.0d));
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 0, (double) (byte) 1, (-17.0d));
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(13.0d, 25.0d, (double) '4');
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 38.0d + "'", double4 == 38.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(48.0d, 1.0d, (double) 1, (-16.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(55.0d, (-45.0d), 26.0d, (double) (-1));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(19.0d, (double) (short) 10, 33.0d);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(59.0d, 30.0d, (-41.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(59.0d, 46.0d, (double) 1);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(14.0d, 51.0d, (double) (-1));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-5.0d), 66.0d, (-17.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-5.0d) + "'", double4 == (-5.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(12.0d, 70.0d, (-7.0d), (-18.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.0d + "'", double5 == 5.0d);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(40.0d, (-1.0d), (-4.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.0d + "'", double4 == 3.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0d + "'", double5 == 3.0d);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(50.0d, 14.0d, 0.0d, (double) (-1L));
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(15.0d, (-6.0d), (-1.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-47.0d), 9.0d, 74.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1.0f), 0.0d, 23.0d);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, (double) (-1L), (double) '#');
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, (double) (byte) 100, (double) '#');
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-15.0d) + "'", double4 == (-15.0d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-89.0d), 28.0d, 23.0d, (-25.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, 50.0d, 51.0d);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '#', 50.0d, (-16.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-47.0d), 2.0d, (-59.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-35.0d) + "'", double4 == (-35.0d));
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-2.0d), (-33.0d), (-2.0d), (-24.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 16.0d + "'", double5 == 16.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(16.0d, (double) 1, (double) ' ', 47.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10.0f, 12.0d, (double) (byte) -1, 55.0d);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(9.0d, (double) (byte) 10, 56.0d, 6.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-59.0d), 9.0d, (-14.0d), 0.0d);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(51.0d, 24.0d, (-14.0d), 25.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(7.0d, 0.0d, 0.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(4.0d, 63.0d, 100.0d);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-23.0d), 18.0d, 78.0d);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-20.0d), 44.0d, (double) 0, 18.0d);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) 100, 11.0d, (-5.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(42.0d, 40.0d, (-3.0d), (double) (short) 0);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-2.0d), (-33.0d), (-2.0d), (-24.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(82.0d, 53.0d, 89.0d, 34.0d);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 100, (double) 10L, 6.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(1.0d, 76.0d, 11.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-3.0d), (double) 10, 40.0d);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-5.0d), 72.0d, (-6.0d), 18.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10, (double) (byte) 0, (-1.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100.0f, 33.0d, 38.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(33.0d, 25.0d, 81.0d, (-19.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.0d + "'", double5 == 13.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(81.0d, (-14.0d), 36.0d, 13.0d);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-18.0d), 53.0d, 15.0d, 82.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-37.0d) + "'", double5 == (-37.0d));
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', 14.0d, (-76.0d), 6.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(30.0d, 27.0d, 25.0d, 29.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 23.0d + "'", double5 == 23.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(5.0d, 67.0d, 48.0d, 26.0d);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 10, (double) (short) 10, (-89.0d), 78.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, 10.0d, 98.0d);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(77.0d, (-85.0d), 9.0d);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-10.0d), (-1.0d), 100.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-71.0d) + "'", double4 == (-71.0d));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(38.0d, 46.0d, 27.0d, 48.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 47.0d + "'", double5 == 47.0d);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(75.0d, 82.0d, 75.0d);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-17.0d), (double) (short) 1, 34.0d, (-76.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(16.0d, (double) 1, (double) ' ', 47.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(60.0d, 21.0d, (double) (byte) 10, 4.0d);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', 57.0d, 1.0d, (-89.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1L, 74.0d, (double) (-1.0f));
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-20.0d), 52.0d, 0.0d);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-37.0d), 45.0d, (double) 100);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-2.0d), (double) 1, (-44.0d));
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 52.0d, 25.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1L), 1.0d, 34.0d, 20.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13.0d + "'", double5 == 13.0d);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1.0f, (-10.0d), (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 0, 28.0d, (double) '4');
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 28.0d + "'", double4 == 28.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 28.0d + "'", double5 == 28.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 28.0d + "'", double6 == 28.0d);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-62.0d), 30.0d, 23.0d, 21.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(11.0d, (-59.0d), 1.0d, (-3.0d));
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 1, (-20.0d), (double) 10, 24.0d);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(66.0d, 30.0d, (-22.0d), 39.0d);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, 27.0d, (double) 1.0f);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10L, 0.0d, (double) 100L);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-17.0d), 14.0d, 0.0d, 30.0d);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(52.0d, 66.0d, (double) (short) 100, (-64.0d));
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-3.0d), (double) 100.0f, 8.0d, (-48.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(20.0d, 71.0d, 21.0d, (double) (short) 10);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(Double.NaN, 4.0d, 65.0d, 37.0d);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '#', (-25.0d), 0.0d, (double) (-1.0f));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-3.0d), (double) 100.0f, (double) 1, (-71.0d));
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(20.0d, 27.0d, 53.0d, (double) (byte) 10);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(51.0d, (-15.0d), 14.0d, (-88.0d));
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', 57.0d, 1.0d, (-89.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 12.0d + "'", double5 == 12.0d);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, (double) (byte) -1, 0.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10L, (double) 0L, 52.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(1.0d, (-1.0d), (double) (byte) 1);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-62.0d), 69.0d, 16.0d, (-52.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-50.0d) + "'", double5 == (-50.0d));
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(49.0d, 43.0d, (double) 0L, 17.0d);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(27.0d, 55.0d, 46.0d, (-52.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) -1, (double) (short) 10, (-12.0d));
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10, (double) '#', (double) (-1L));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1.0f, (double) (-1), 15.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 12.0d + "'", double4 == 12.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(81.0d, (double) (byte) 1, 93.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-19.0d), 12.0d, 37.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, (double) (byte) 10, 0.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(1.0d, (double) (byte) 0, (-5.0d), 2.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(5.0d, (-23.0d), 5.0d, (double) ' ');
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-64.0d), 23.0d, (double) (byte) 1, 12.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-7.0d) + "'", double5 == (-7.0d));
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-24.0d), 39.0d, (double) 100L, (-47.0d));
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(49.0d, 2.0d, 67.0d, 65.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, 77.0d, (-22.0d), 95.0d);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(25.0d, (double) ' ', 43.0d, 9.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.0d + "'", double5 == 6.0d);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-47.0d), 58.0d, (double) 10L, 21.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-7.0d) + "'", double5 == (-7.0d));
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(29.0d, 66.0d, 14.0d, 11.0d);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-1.0d), (double) (short) 1, 8.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(95.0d, 39.0d, 36.0d, 76.0d);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-24.0d), 0.0d, 33.0d, 61.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-85.0d), 60.0d, (-52.0d));
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-88.0d), (double) 100L, 100.0d, (-48.0d));
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-52.0d), (-98.0d), 0.0d, 0.0d);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-12.0d), (-18.0d), (-8.0d), 92.0d);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(24.0d, (double) (byte) 10, (-2.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) 0.0f, (double) 1.0f, (-1.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(66.0d, 51.0d, (-64.0d));
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(22.0d, (double) '#', Double.NaN);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-45.0d), 8.0d, 0.0d);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(78.0d, (double) '#', 38.0d, 72.0d);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(81.0d, 53.0d, (-76.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 25.0d + "'", double4 == 25.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-9.0d), (double) 100L, 0.0d);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-24.0d), 33.0d, 63.0d, (-12.0d));
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 100, 14.0d, 85.0d, (-12.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-85.0d), (-41.0d), (-45.0d));
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(14.0d, 69.0d, 50.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-49.0d), 56.0d, 0.0d);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, 3.0d, (-47.0d), 56.0d);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-1.0d), 81.0d, 65.0d);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-0.0d), 98.0d, 56.0d);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(13.0d, (-35.0d), 22.0d, (-89.0d));
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 0, (double) (-1), 18.0d, (double) (short) 1);
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
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) -1, (double) (byte) 1, 0.0d, 100.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-12.0d), (-0.0d), 88.0d, 53.0d);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(70.0d, 47.0d, 1.0d, (double) 10);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(16.0d, (double) '4', 49.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(75.0d, 24.0d, 6.0d, 18.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.0d + "'", double5 == 6.0d);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, (-0.0d), (-2.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(93.0d, 4.0d, (double) (byte) 100);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(93.0d, (double) (byte) 100, (double) 10L, 57.0d);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(47.0d, 18.0d, (double) ' ', (double) (short) 100);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-44.0d), (-35.0d), 20.0d, 24.0d);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1L, (-88.0d), (double) (short) 1, 19.0d);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(16.0d, (double) '#', 58.0d, 0.0d);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-22.0d), 32.0d, 3.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-64.0d), 31.0d, 11.0d, 22.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(81.0d, 0.0d, 40.0d, (double) '4');
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(56.0d, (-17.0d), 28.0d);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(10.0d, 66.0d, (-22.0d), 55.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 33.0d + "'", double5 == 33.0d);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-25.0d), (double) 100L, 34.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-17.0d), (-26.0d), (-5.0d));
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(60.0d, 40.0d, (-7.0d), 18.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, 0.0d, (-17.0d), 23.0d);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(2.0d, (-9.0d), 0.0d, 23.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-18.0d) + "'", double5 == (-18.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(24.0d, (-85.0d), 72.0d, (-11.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-10.0d) + "'", double5 == (-10.0d));
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(47.0d, 51.0d, (-2.0d), (double) 1L);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(44.0d, (-64.0d), 40.0d, 40.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-10.0d), (-18.0d), (double) 0);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(21.0d, (double) (short) 100, (double) (short) 10, (double) '#');
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10.0f, (-17.0d), (double) (short) 1);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0.0f, (-22.0d), (double) (byte) 100);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(57.0d, 30.0d, (double) (short) 100, (double) 10L);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(27.0d, (-59.0d), 81.0d);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(59.0d, 21.0d, (-7.0d), (double) (short) 10);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0L, 27.0d, 6.0d, 100.0d);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(16.0d, (-25.0d), (-1.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100.0f, (-14.0d), 4.0d, 17.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-52.0d), 1.0d, 9.0d);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-2.0d), 85.0d, (-25.0d));
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-2.0d), 11.0d, 0.0d, (double) 0L);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-1.0d), (-48.0d), (-44.0d), (double) (short) -1);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 75.0d, (-44.0d), 66.0d);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(13.0d, (-11.0d), 31.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 24.0d + "'", double4 == 24.0d);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-37.0d), 0.0d, (double) (byte) 100, 25.0d);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(60.0d, 3.0d, (-52.0d), (double) 100);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(42.0d, 10.0d, (double) 'a', (-12.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 11.0d + "'", double6 == 11.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.0d + "'", double7 == 3.0d);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-22.0d), (double) (-1), 17.0d);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(76.0d, 1.0d, (double) (-1L), (-76.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 75.0d + "'", double5 == 75.0d);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-1.0d), (double) (short) 10, 14.0d);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0.0f, (double) (byte) -1, 8.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-41.0d), 0.0d, 74.0d, 1.0d);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(28.0d, 45.0d, 10.0d);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '4', (double) (-1.0f), 4.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100.0f, 0.0d, 100.0d, (-23.0d));
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(7.0d, 4.0d, (-14.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(9.0d, 59.0d, (double) (short) 100, (-59.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 0, (-24.0d), 16.0d);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-6.0d), (double) (byte) 10, 0.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(25.0d, (double) 1.0f, 40.0d, 9.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(61.0d, 45.0d, 30.0d, (double) 10);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 0, (-18.0d), 72.0d);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-4.0d), (double) 0.0f, (-45.0d));
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-6.0d), 74.0d, 10.0d);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(32.0d, 22.0d, 41.0d, (-1.0d));
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(2.0d, 44.0d, (-3.0d), (-21.0d));
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '4', (double) (short) 10, 28.0d);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-0.0d), (-2.0d), 67.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.0d) + "'", double4 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-2.0d) + "'", double5 == (-2.0d));
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-89.0d), (-13.0d), 0.0d, 41.0d);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-26.0d), 27.0d, 27.0d, 0.0d);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 10, (double) '#', 31.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(52.0d, 55.0d, (-24.0d), (-48.0d));
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-16.0d), 43.0d, (double) '#');
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 10, 7.0d, 52.0d);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 0, (-24.0d), 93.0d);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10, 93.0d, (-22.0d), 98.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 26.0d + "'", double5 == 26.0d);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(76.0d, 32.0d, (double) 100.0f);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-88.0d), (double) 10.0f, (-4.0d));
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(47.0d, 47.0d, 71.0d);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(57.0d, 0.0d, (double) 'a');
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 27.0d + "'", double4 == 27.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(33.0d, 33.0d, (-4.0d));
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(59.0d, 0.0d, 58.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 34.0d + "'", double4 == 34.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-18.0d), (-13.0d), (-13.0d));
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(45.0d, 27.0d, 37.0d, (-52.0d));
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100.0f, 10.0d, (double) (byte) 1, (double) (byte) -1);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 1, (-13.0d), 29.0d);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(70.0d, 1.0d, (double) ' ');
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-17.0d), 9.0d, (double) 10, (double) 1.0f);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(26.0d, (double) (-1L), 41.0d, 76.0d);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 0, (double) (-1), 17.0d);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-33.0d), (-85.0d), 82.0d);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10.0f, 2.0d, 18.0d, (-81.0d));
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 0, 81.0d, 6.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.0d + "'", double4 == 3.0d);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (-1L), (-9.0d), 30.0d, (double) (-1.0f));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (-4.0d), (double) 100L, 100.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 42.0d, 77.0d, (-71.0d));
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(74.0d, 38.0d, (double) 10);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(39.0d, 4.0d, 61.0d, (double) (-1L));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0L, (-22.0d), 23.0d);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, (double) (short) -1, 81.0d, (double) (-1L));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(11.0d, 4.0d, 72.0d);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(55.0d, (-19.0d), (double) 100.0f, 63.0d);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-47.0d), 63.0d, 65.0d, 14.0d);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 0L, 44.0d, 0.0d);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(82.0d, 85.0d, (double) 1L, 9.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(70.0d, 100.0d, (-2.0d), (-24.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(10.0d, 0.0d, (double) (byte) 0);
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        double double6 = linearCongruentialGenerator3.nextNumber();
        double double7 = linearCongruentialGenerator3.nextNumber();
        double double8 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(21.0d, (double) 0, 52.0d, (double) 10.0f);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 100, 100.0d, (-63.0d), (-76.0d));
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-14.0d), (-13.0d), (-8.0d));
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '4', 52.0d, (-59.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(33.0d, 81.0d, (double) (short) 0, (-6.0d));
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(33.0d, 81.0d, (-85.0d), 12.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(Double.NaN, (double) '#', (-8.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        double double5 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(12.0d, 58.0d, 0.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-89.0d), (-11.0d), 46.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-32.0d) + "'", double4 == (-32.0d));
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(Double.NaN, (double) 100, 11.0d, 7.0d);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(36.0d, (double) 100.0f, 9.0d, 77.0d);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(41.0d, (double) ' ', 21.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(6.0d, 75.0d, 30.0d, 0.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-4.0d), 38.0d, (-8.0d));
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(59.0d, 18.0d, (-78.0d), (-45.0d));
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(18.0d, (-85.0d), 30.0d, (double) '#');
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-19.0d), (-41.0d), 59.0d, 74.0d);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-26.0d), 53.0d, (double) 0L, 78.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-52.0d) + "'", double5 == (-52.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(7.0d, (-17.0d), (double) 0);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-4.0d), (double) 0L, (-12.0d));
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(82.0d, 92.0d, (double) 10);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, 22.0d, 35.0d);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) ' ', 34.0d, 20.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(16.0d, 3.0d, 34.0d);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(21.0d, 47.0d, (-35.0d), (double) 1L);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 82.0d, 6.0d, 41.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.0d + "'", double5 == 6.0d);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-6.0d), 88.0d, 0.0d, 13.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-25.0d), 25.0d, (double) (short) 0);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(34.0d, (double) (short) -1, (-21.0d), (double) 1);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-7.0d), (double) (byte) 10, (-26.0d), (double) 1);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(59.0d, 0.0d, 45.0d, (double) '4');
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 45.0d + "'", double5 == 45.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 45.0d + "'", double6 == 45.0d);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-7.0d), 46.0d, 60.0d, 29.0d);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-1.0d), 16.0d, (-17.0d), 31.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-2.0d) + "'", double5 == (-2.0d));
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(52.0d, 31.0d, 9.0d);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(6.0d, 15.0d, (-45.0d));
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(34.0d, (double) '#', 2.0d, (double) (short) 100);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(0.0d, 0.0d, (-12.0d), 32.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        double double7 = linearCongruentialGenerator4.nextNumber();
        double double8 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-12.0d) + "'", double5 == (-12.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-12.0d) + "'", double6 == (-12.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-12.0d) + "'", double7 == (-12.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-12.0d) + "'", double8 == (-12.0d));
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-50.0d), 70.0d, 40.0d);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-0.0d), (-9.0d), (-3.0d), 69.0d);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100L, 4.0d, 26.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(58.0d, (-45.0d), 2.0d, 5.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-3.0d) + "'", double5 == (-3.0d));
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(19.0d, (double) 0, (-13.0d), 42.0d);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, 29.0d, (double) (short) 100);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-21.0d), (-17.0d), (-45.0d), (-52.0d));
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-81.0d), 13.0d, 6.0d, 12.0d);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-5.0d), 57.0d, 75.0d);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(5.0d, 5.0d, 4.0d, 53.0d);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(8.0d, 30.0d, (double) 1, (-35.0d));
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-26.0d), 12.0d, (-89.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-6.0d), (-3.0d), (-26.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 10L, (double) 10L, 0.0d);
        double double4 = linearCongruentialGenerator3.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 100, (double) (byte) 0, 81.0d, (double) 10.0f);
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(65.0d, (-25.0d), 93.0d, 7.0d);
        double double5 = linearCongruentialGenerator4.nextNumber();
        java.lang.Class<?> wildcardClass6 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-6.0d) + "'", double5 == (-6.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 'a', 28.0d, (-12.0d));
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (short) 1, 0.0d, (double) (byte) 0, (double) (byte) 0);
        double double5 = linearCongruentialGenerator4.nextNumber();
        double double6 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(6.0d, (double) (-1L), 37.0d);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) (byte) 10, 10.0d, 1.0d, (double) (short) 1);
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-71.0d), 56.0d, 81.0d);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator(49.0d, 0.0d, 34.0d, (double) 10);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-15.0d), 53.0d, 16.0d);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(38.0d, 10.0d, 0.0d);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((double) '#', (double) 1, 51.0d, (-1.0d));
        double double5 = linearCongruentialGenerator4.nextNumber();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(49.0d, 25.0d, (double) (short) 100);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator4 = new com.thealgorithms.others.LinearCongruentialGenerator((-62.0d), 0.0d, (double) ' ', (-9.0d));
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-81.0d), 9.0d, 12.0d);
        java.lang.Class<?> wildcardClass4 = linearCongruentialGenerator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator(46.0d, (double) 10.0f, 15.0d);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((-64.0d), (-81.0d), 35.0d);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        com.thealgorithms.others.LinearCongruentialGenerator linearCongruentialGenerator3 = new com.thealgorithms.others.LinearCongruentialGenerator((double) 1L, (double) 0.0f, (-3.0d));
        double double4 = linearCongruentialGenerator3.nextNumber();
        java.lang.Class<?> wildcardClass5 = linearCongruentialGenerator3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}
