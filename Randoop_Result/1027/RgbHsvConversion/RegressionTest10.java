package RgbHsvConversion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test05001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05001");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) (-1L), (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05002");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) 1.0f, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05003");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 100L, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05004");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) 'a', (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05005");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 10, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05006");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) 'a', 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05007");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) 'a', (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 1.0, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05008");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, 1.0d, (double) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[85, 255, 0]");
    }

    @Test
    public void test05009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05009");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', 1, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.6185567010309114, 1.0, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05010");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) (byte) 100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05011");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) (-1), (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05012");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) 'a', 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[114.375, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05013");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05014");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[222.58064516129025, 0.96875, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05015");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05016");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) 'a', (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.8969072164948454, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05017");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05018");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, 1.0d, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05019");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) (byte) 1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05020");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) (byte) 100, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05021");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), 100.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05022");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) (byte) 0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05023");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05024");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, 10.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05025");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) (short) 1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05026");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[353.8144329896907, 1.0, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05027");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, 0.0d, (double) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05028");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) 0, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05029");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) (byte) -1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05030");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) 100L, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05031");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 1.0, 0.13725490196078433]");
    }

    @Test
    public void test05032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05032");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05033");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 100L, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05034");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) 0L, (double) 0L);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05035");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05036");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) (-1), (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05037");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, 10.0d, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05038");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (-1.0d), (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05039");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 10.0f, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05040");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[359.4, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05041");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (byte) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[256.66666666666674, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05042");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) 'a', (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05043");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) (-1L), (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05044");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) 1.0f, (double) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05045");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (short) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[126.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05046");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, 100.0d, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05047");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05048");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) (byte) 0, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05049");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) 1.0f, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05050");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) 100, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05051");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, 100, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[141.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05052");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) (short) 0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05053");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 100.0f, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05054");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (-1), (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05055");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 0, (double) 1L);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05056");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05057");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) ' ', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05058");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (short) 10, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05059");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (-1.0d), (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05060");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[6.0, 1.0, 0.0392156862745098]");
    }

    @Test
    public void test05061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05061");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05062");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (short) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05063");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05064");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', 0, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[294.8571428571429, 1.0, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05065");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (byte) 1, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05066");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) 100.0f, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05067");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, 10.0d, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05068");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) 1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05069");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, 0.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05070");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) ' ', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05071");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05072");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05073");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05074");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) (-1), (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05075");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05076");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.6875, 0.12549019607843137]");
    }

    @Test
    public void test05077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05077");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) 100L, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05078");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) (-1), (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05079");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (short) 0, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[272.1649484536083, 1.0, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05080");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (-1.0d), (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05081");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05082");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) (short) 0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05083");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) (short) -1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05084");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) 'a', 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[125.625, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05085");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) (byte) -1, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05086");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) (short) 1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05087");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) (-1L), (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05088");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) 1L, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05089");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05090");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) (-1.0f), (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05091");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) 'a', (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05092");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05093");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[354.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05094");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 0L, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05095");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, 10, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 0.8076923076923077, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05096");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (byte) 0, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[338.35051546391753, 1.0, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05097");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) 100.0f, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05098");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) (-1), (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05099");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) ' ', (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05100");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, 0.0d, (double) 0L);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test05101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05101");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) (-1.0f), (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05102");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) (short) 1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05103");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) (byte) 0, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05104");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (-1.0f), (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05105");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) (short) 100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05106");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[342.5806451612903, 0.96875, 0.12549019607843137]");
    }

    @Test
    public void test05107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05107");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (-1.0d), (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05108");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) 'a', 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.61855670103091, 1.0, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05109");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05110");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, 100.0d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05111");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) (byte) 100, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05112");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05113");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[18.78787878787881, 0.99, 0.39215686274509803]");
    }

    @Test
    public void test05114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05114");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05115");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) 0L, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05116");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) 100L, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05117");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05118");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05119");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', 1.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05120");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, 1.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05121");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) 100, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05122");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05123");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) (byte) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05124");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05125");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) '#', (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05126");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) (short) -1, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05127");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, 0.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05128");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, 10.0d, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05129");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', 1, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.875, 1.0, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05130");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) (byte) 10, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05131");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) 0.0f, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05132");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, 0.0d, (double) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05133");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) '#', (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05134");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) 100.0f, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05135");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05136");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) (short) 100, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05137");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) ' ', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05138");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, 0.0d, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05139");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (short) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 0.48, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05140");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, 100, (int) 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.030000000000000037, 0.39215686274509803]");
    }

    @Test
    public void test05141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05141");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 10L, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05142");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) (byte) 100, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05143");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05144");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05145");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (short) 10, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[328.57142857142856, 0.8076923076923077, 0.20392156862745098]");
    }

    @Test
    public void test05146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05146");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) 10, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05147");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) (-1.0f), (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05148");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) '#', (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[204.28571428571422, 0.8076923076923077, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05149");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) 100L, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05150");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) 100, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05151");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05152");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, 0.0d, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05153");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) 100, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05154");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, 0.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05155");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, 100.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05156");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) 10.0f, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05157");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (byte) 10, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05158");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05159");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) '4', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05160");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) '4', (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[131.53846153846155, 1.0, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05161");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) 'a', 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[114.375, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05162");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 0, 0.0d);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test05163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05163");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05164");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) (short) 100, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05165");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) 100.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05166");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) (short) 1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05167");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 0.030000000000000037, 0.39215686274509803]");
    }

    @Test
    public void test05168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05168");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) 'a', (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05169");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) 100, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05170");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) 0.0f, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05171");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) '4', 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05172");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05173");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) (short) -1, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05174");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (short) 10, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[234.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05175");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 100, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05176");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) (short) -1, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05177");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (short) 100, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 0.030000000000000037, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05178");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) (byte) 1, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05179");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) 'a', (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05180");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) 100, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05181");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) ' ', 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[36.923076923076906, 1.0, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05182");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) 1.0f, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05183");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) 10.0f, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05184");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, 1.0d, (double) 1L);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 42, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05185");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05186");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 0.0f, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05187");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) 0L, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05188");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 1.0f, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05189");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) (short) -1, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05190");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) 0.0f, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05191");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) (byte) 10, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05192");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) (-1L), (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05193");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) 1, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05194");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05195");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) '#', (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 1.0, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05196");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 0.0f, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05197");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) (byte) 1, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05198");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) (-1), 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05199");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) 0L, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05200");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (byte) 10, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05201");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.12549019607843137]");
    }

    @Test
    public void test05202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05202");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) (-1L), (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05203");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[251.53846153846155, 1.0, 0.20392156862745098]");
    }

    @Test
    public void test05204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05204");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[16.666666666666686, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05205");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 1.0f, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05206");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', 0.0d, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05207");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) 0.0f, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05208");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) (-1.0f), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05209");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) 'a', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05210");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) (-1), (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05211");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) '4', (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05212");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, 0.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05213");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) 0L, (double) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05214");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[121.875, 1.0, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05215");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05216");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 100.0f, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05217");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) 10L, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05218");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, 0, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05219");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) (short) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05220");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.6000000000000227, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05221");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05222");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) ' ', (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05223");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, 0.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05224");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05225");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) '#', (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05226");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 10L, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05227");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) 100, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05228");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05229");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (byte) 0, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[246.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05230");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) 10L, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05231");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) (short) 1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05232");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 100L, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05233");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (byte) 10, 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[234.5454545454545, 0.99, 0.39215686274509803]");
    }

    @Test
    public void test05234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05234");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05235");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) (byte) 10, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05236");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (byte) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.60000000000002, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05237");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) 100.0f, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05238");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, 1.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05239");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05240");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) 1.0f, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05241");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', 1.0d, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05242");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, 0.0d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05243");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) '4', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05244");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05245");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05246");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) (-1), (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05247");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05248");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 100, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05249");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05250");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, 0.0d, (double) 0L);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test05251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05251");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, 0.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05252");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05253");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (short) 1, 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.99, 0.39215686274509803]");
    }

    @Test
    public void test05254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05254");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) 100L, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05255");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) (short) 0, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05256");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', 0.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05257");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05258");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05259");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) ' ', (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05260");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05261");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, 0.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05262");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, 0.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05263");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (byte) 100, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[176.25, 0.48, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05264");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (byte) 100, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05265");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) (short) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05266");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[342.85714285714283, 1.0, 0.13725490196078433]");
    }

    @Test
    public void test05267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05267");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[119.39999999999998, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05268");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) (short) 100, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05269");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) '#', (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05270");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[125.45454545454544, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05271");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, 0.0d, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05272");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) ' ', (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[242.6470588235294, 0.68, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05273");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (-1.0d), (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05274");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (short) 100, 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[126.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05275");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) (byte) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.60000000000002, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05276");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (short) 0, (double) 0L);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05277");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) '4', (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05278");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, 0.0d, (double) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05279");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (byte) 100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05280");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) 1, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05281");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (short) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05282");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (short) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05283");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) ' ', (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05284");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[359.4, 1.0, 0.39215686274509803]");
    }

    @Test
    public void test05285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05285");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) ' ', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05286");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, 0.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05287");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) 0L, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05288");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05289");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, 1, 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 0.99, 0.39215686274509803]");
    }

    @Test
    public void test05290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05290");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) 0, (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05291");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) 1L, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05292");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) 10L, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05293");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) (byte) 100, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05294");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) (short) 100, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05295");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (short) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[246.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05296");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), 0.0d, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05297");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (byte) -1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05298");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) (-1), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05299");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) '4', 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 1.0, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05300");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 10.0f, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05301");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (byte) 100, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05302");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05303");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) 10.0f, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05304");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05305");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (short) 100, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.68, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05306");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) (-1), 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05307");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05308");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05309");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05310");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', 100, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[135.69230769230768, 0.6499999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05311");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) (short) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05312");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) ' ', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05313");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) (byte) 0, (double) 0L);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05314");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) 1.0f, (double) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05315");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05316");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (-1.0d), (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05317");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) 10L, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05318");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) (-1.0f), (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05319");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) (short) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05320");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, 1, 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 0.9, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05321");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) (short) -1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05322");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) (byte) 1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05323");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[89.09090909090912, 0.99, 0.39215686274509803]");
    }

    @Test
    public void test05324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05324");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (short) 0, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[241.875, 1.0, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05325");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05326");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) '4', (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05327");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (byte) 0, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05328");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 100, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05329");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) (byte) 1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05330");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) '#', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05331");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05332");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05333");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 0, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05334");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) '#', (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05335");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 10L, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05336");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05337");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (-1L), (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05338");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) 0.0f, (double) 1L);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05339");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) (byte) 10, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05340");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05341");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) 10, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05342");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05343");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, 0.0d, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05344");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (short) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05345");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (short) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05346");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) '#', (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05347");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) 1L, (double) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 42, 0]");
    }

    @Test
    public void test05348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05348");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) (short) 1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05349");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05350");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[223.33333333333337, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05351");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) 10L, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05352");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, 10.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05353");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', 1.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05354");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05355");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) 'a', (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[114.375, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05356");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) (-1), (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05357");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) (short) 0, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05358");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (-1.0d), (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05359");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, 1.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05360");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) '4', (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05361");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (byte) 100, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[178.20000000000005, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05362");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 0.68, 0.39215686274509803]");
    }

    @Test
    public void test05363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05363");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) 1.0f, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05364");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) (-1.0f), (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05365");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) (-1), (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05366");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) 0, (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05367");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) (-1.0f), 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05368");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 0.0f, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05369");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, 0.0d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05370");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05371");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, 100, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[136.66666666666663, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05372");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) '#', (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05373");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) (-1.0f), (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05374");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) 10.0f, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05375");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (short) 0, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05376");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05377");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) 10L, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05378");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, 0.0d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05379");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) '4', (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05380");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (short) 10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05381");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05382");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 100, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05383");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05384");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (short) -1, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05385");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) '#', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05386");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) '4', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05387");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (short) 0, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05388");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05389");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, 10.0d, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05390");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) ' ', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05391");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[358.84615384615387, 1.0, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05392");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[219.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05393");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05394");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, 10.0d, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05395");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) (byte) 100, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05396");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[18.75, 1.0, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05397");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05398");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), 100.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05399");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) 1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05400");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.8999999999999999, 0.39215686274509803]");
    }

    @Test
    public void test05401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05401");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) 100L, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05402");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) 0.0f, (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05403");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) 10L, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05404");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[61.80000000000001, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05405");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05406");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) '#', (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05407");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) 100L, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05408");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (byte) 0, 1.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05409");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05410");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) 100.0f, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05411");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) '#', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05412");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) (-1.0f), (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05413");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (short) 0, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05414");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (byte) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[246.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05415");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) (byte) 0, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05416");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) (short) 1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05417");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) '4', (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05418");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) (-1.0f), (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05419");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, 10.0d, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05420");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[103.33333333333331, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05421");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), 0.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05422");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', 0, 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[348.46153846153845, 1.0, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05423");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05424");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) (-1), (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05425");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05426");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) 100.0f, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05427");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05428");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, 100.0d, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05429");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) (short) 10, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05430");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, 100.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05431");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, 0.0d, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05432");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) (-1L), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05433");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) (byte) 1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05434");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) 0.0f, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05435");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) ' ', (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05436");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, 10, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[228.46153846153845, 1.0, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05437");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) '4', 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05438");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 10.0f, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05439");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, 0, 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05440");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) (short) -1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05441");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) (byte) -1, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05442");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 100L, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05443");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (short) 1, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05444");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, 0.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05445");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) '#', (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[199.61538461538453, 1.0, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05446");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) (byte) -1, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05447");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) 100.0f, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05448");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) 'a', (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[58.19999999999999, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05449");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05450");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (-1.0f), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05451");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) (byte) -1, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05452");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) (byte) 10, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05453");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (-1.0f), (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05454");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), 0.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05455");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) (-1.0f), (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05456");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) (-1L), (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05457");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) 10, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05458");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) (byte) -1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05459");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, 0.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05460");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) 1.0f, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05461");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) 10, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05462");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05463");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05464");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, 100.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05465");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, 0, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[257.1428571428571, 1.0, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05466");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) 0.0f, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05467");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) 100, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.48, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05468");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (short) 1, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[329.0909090909091, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05469");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) '#', 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05470");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) '4', (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05471");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) 1.0f, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05472");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (byte) 100, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[178.18181818181824, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05473");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[259.20000000000005, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05474");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) (byte) -1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05475");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05476");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[99.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05477");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) 1L, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05478");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05479");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) (short) 10, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05480");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) 0L, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05481");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 1.0f, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05482");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) 1.0f, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05483");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, 10.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05484");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[6.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05485");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (-1L), (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05486");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05487");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) '#', (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05488");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) (byte) 0, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05489");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05490");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) 0.0f, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05491");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) '#', (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 0.7142857142857143, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05492");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) (byte) 1, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05493");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05494");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) (byte) 0, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05495");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, 0.0d, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05496");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05497");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) (byte) -1, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05498");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) (-1), (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05499");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) (byte) 100, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05500");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) '4', (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[160.0, 0.9807692307692308, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}

