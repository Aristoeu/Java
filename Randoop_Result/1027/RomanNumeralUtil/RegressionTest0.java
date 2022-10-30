package RomanNumeralUtil;

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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number must be in the range [1, 5999]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        com.thealgorithms.maths.RomanNumeralUtil romanNumeralUtil0 = new com.thealgorithms.maths.RomanNumeralUtil();
        java.lang.Class<?> wildcardClass1 = romanNumeralUtil0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate((int) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "XXXV" + "'", str1, "XXXV");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number must be in the range [1, 5999]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "C" + "'", str1, "C");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "XCVII" + "'", str1, "XCVII");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X" + "'", str1, "X");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "C" + "'", str1, "C");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X" + "'", str1, "X");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate((int) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LII" + "'", str1, "LII");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X" + "'", str1, "X");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number must be in the range [1, 5999]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number must be in the range [1, 5999]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "C" + "'", str1, "C");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number must be in the range [1, 5999]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The number must be in the range [1, 5999]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.String str1 = com.thealgorithms.maths.RomanNumeralUtil.generate((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "XXXII" + "'", str1, "XXXII");
    }
}

