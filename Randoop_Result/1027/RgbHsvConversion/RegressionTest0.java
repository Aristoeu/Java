package RgbHsvConversion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        com.thealgorithms.conversions.RgbHsvConversion rgbHsvConversion0 = new com.thealgorithms.conversions.RgbHsvConversion();
        java.lang.Class<?> wildcardClass1 = rgbHsvConversion0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (-1.0d), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) 'a', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), 1.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 100, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (byte) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 1.0f, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) (byte) 1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) 0, (double) 0.0f);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', 0.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (-1.0d), (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) 'a', (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 100, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (short) 0, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) (short) 0, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) 10L, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, 1.0d, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, 0.0d, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) 1L, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) 1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (short) -1, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) (-1.0f), (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 0, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', 0.0d, (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) 10.0f, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 10.0f, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) ' ', (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.6875, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, 1.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) (-1L), (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) 100L, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) '4', (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[303.75, 0.48, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (short) 100, 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 0, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, 1, 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.9, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 10, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) '#', 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, 10.0d, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) '4', (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[221.53846153846155, 0.6701030927835051, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 100.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) (-1.0f), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 1.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) (short) 100, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (-1L), (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) '#', (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[40.0, 0.9807692307692308, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) 1L, (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) 0.0f, 1.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) ' ', (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) ' ', 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[14.666666666666686, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) (-1), (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) (-1L), (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 10L, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (byte) 1, (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, 0, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[246.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) 1L, (double) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 4, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 0L, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (byte) 1, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[328.125, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, 0, 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 1.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) 10, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) (byte) 0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) '#', (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) 1L, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 10L, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) '#', (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (-1.0d), (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) (short) 10, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, 1.0d, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, 10.0d, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 0.0f, 1.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) 'a', (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', 0.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) (-1), (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) (short) 0, (double) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[137.1428571428571, 1.0, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) (byte) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) ' ', (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) (short) -1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, 100.0d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 100L, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, 1.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) (short) 0, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) (-1L), (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, 10.0d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (byte) 0, 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[246.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) (short) 1, 1.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 4, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) ' ', (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[101.25, 1.0, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 100.0f, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (-1.0d), (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (byte) 1, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 1.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) 'a', (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[141.64948453608247, 1.0, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) 0, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, 10, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 0.6875, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, 10.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 100.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, 0.0d, (double) 1L);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (-1.0d), 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[17.142857142857167, 1.0, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) 0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (-1.0d), (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) (-1), (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) ' ', (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (short) 100, 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.60000000000002, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[6.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) 1L, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) 10, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.6000000000000227, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) '4', 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[31.19999999999999, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (-1), (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), 100.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (-1.0f), (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) '#', 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[21.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[332.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, 0, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) 0L, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) '#', (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) 10.0f, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) '#', (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 0.9714285714285715, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (short) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[6.185567010309285, 1.0, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (-1.0d), (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) '4', (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) 10.0f, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) ' ', (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[14.666666666666686, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, 1.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) 0, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) (short) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) (byte) 0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (-1.0d), (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) '#', (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, 0.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) (byte) 100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (short) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.80000000000001, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) '4', (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, 0.0d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[221.25, 1.0, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) 10, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', 10.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) (byte) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) (byte) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) 10, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[126.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) 100L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 100, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) '4', (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) 0.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (short) 100, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[345.3333333333333, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) (short) 0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 0.0f, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) (byte) 1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) (-1), 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, 0.0d, (double) (byte) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, 0.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) (-1L), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 100L, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (byte) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[114.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', 0.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (short) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (short) 1, 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[234.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) (short) -1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, 1.0d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) 100.0f, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, 1.0d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) (byte) 0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) (-1L), (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[102.5806451612903, 0.96875, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) 100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, 10.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (-1.0d), (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) 0, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.9, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 1L, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 10, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) (-1), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) (short) -1, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) '#', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) 1, (double) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) (short) 1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 4, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.8969072164948454, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, 1.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) (byte) 1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) '#', 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[20.606060606060623, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (-1.0d), (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (short) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) (short) 1, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) (byte) 1, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[181.79999999999995, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) (byte) 10, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (byte) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[234.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 10, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) '#', 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (short) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[6.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 100, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (short) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, 0, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.60000000000002, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, 0.0d, (double) 0.0f);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, 0.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) 10, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 1.0, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 0.0f, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) (-1), (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) (-1.0f), (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) (short) 100, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) 100, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, 10, 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 0.9, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) (byte) 0, (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (byte) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.7142857142857143, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) '4', (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) 10L, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) 100, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (short) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.60000000000002, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, 100.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, 0.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (-1), (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) (byte) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[6.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) 10L, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) 'a', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (short) 10, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[234.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) '#', (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) ' ', (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, 100, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.48, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) ' ', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) (-1), (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) ' ', 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[220.79999999999995, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) 0L, (double) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (-1.0d), (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, 10.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, 0.0d, (double) (short) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, 0.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 'a', (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, 1.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[5.625, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) '#', (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, 10.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, 1.0d, 1.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 4, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 0, (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, 10.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) 1.0f, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) 10, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) (-1.0f), (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) (-1L), (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, 100, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[178.18181818181824, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 0L, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) (short) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 'a', (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) 100, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) (short) -1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) 1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) 'a', (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[57.35294117647061, 0.68, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) (byte) 100, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (short) 10, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) 10.0f, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) (byte) 0, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', 100.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) (short) 100, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (byte) 0, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) (byte) 1, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) '4', (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) (byte) 0, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) 1L, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) '#', (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[174.70588235294122, 0.9714285714285715, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 1, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 1.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) (-1L), (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 10.0f, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[354.54545454545456, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (byte) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[6.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) 0, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) 10L, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, 0.0d, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (byte) 10, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) 0L, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, 0.0d, (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) 10L, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (byte) 0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (-1), (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) (byte) 0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) ' ', 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) (-1.0f), (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) 10.0f, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) '4', (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) ' ', 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) 100L, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) '#', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (-1), (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 10.0f, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 10L, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', 1.0d, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (byte) 10, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 0.7142857142857143, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) 1, (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) '4', 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 1.0, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 1.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (short) 1, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, 10, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) 100.0f, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, 1.0d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, 0.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, 0.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[234.5454545454545, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) 10L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) 1L, (double) (short) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 4, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) (byte) 10, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) (byte) 10, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) 0.0f, (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) ' ', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[220.79999999999995, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) (short) -1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) 10.0f, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (short) 100, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) '#', (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), 0.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) ' ', (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[15.17241379310343, 0.8969072164948454, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) (byte) 10, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, 100.0d, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[65.29411764705884, 0.9714285714285715, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, 1.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) '4', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (short) 10, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[332.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) 10.0f, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (byte) 0, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, 100.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (short) 0, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) 100.0f, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[114.54545454545456, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) (short) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) (short) 0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) (byte) 0, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) 'a', 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[113.81443298969072, 1.0, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) 100L, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) 'a', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) (byte) 100, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) (byte) 1, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) ' ', (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 100L, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) (short) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[258.78787878787875, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) '4', 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[131.53846153846155, 1.0, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) 100L, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) 1L, (double) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 136, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) 0, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) (byte) 0, (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, 100.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (byte) 10, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[234.375, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) 100, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 100, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, 10, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[234.375, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), 100.0d, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) '#', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) (byte) -1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (byte) 1, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

