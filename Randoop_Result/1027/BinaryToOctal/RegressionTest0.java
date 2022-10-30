package BinaryToOctal;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal((-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1" + "'", str1, "-1");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.thealgorithms.conversions.BinaryToOctal binaryToOctal0 = new com.thealgorithms.conversions.BinaryToOctal();
        java.lang.Class<?> wildcardClass1 = binaryToOctal0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal((int) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11" + "'", str1, "11");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2" + "'", str1, "2");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2" + "'", str1, "2");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal((int) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "12" + "'", str1, "12");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2" + "'", str1, "2");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1" + "'", str1, "-1");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1" + "'", str1, "-1");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.String str1 = com.thealgorithms.conversions.BinaryToOctal.convertBinaryToOctal((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8" + "'", str1, "8");
    }
}

