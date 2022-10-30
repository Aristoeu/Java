package RgbHsvConversion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26 {

    public static boolean debug = false;

    @Test
    public void test13001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13001");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) 10.0f, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13002");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) 1L, (double) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 42, 0]");
    }

    @Test
    public void test13003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13003");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[359.4, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13004");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) 0.0f, (double) 1L);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
    }

    @Test
    public void test13005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13005");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) (byte) 0, (double) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
    }

    @Test
    public void test13006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13006");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) 0, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13007");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13008");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) 'a', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[181.79999999999995, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13009");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (short) 100, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13010");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) (short) 10, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13011");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) 10L, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13012");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (byte) 10, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13013");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 100, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13014");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) (-1L), (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13015");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', 1.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13016");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) 1L, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13017");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) (byte) 1, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13018");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) (short) 100, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13019");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) 0, (double) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test13020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13020");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) 10L, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13021");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (-1.0d), (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13022");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) '4', (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13023");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) '4', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13024");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) 10.0f, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13025");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) (short) 1, (double) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13026");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13027");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) (short) -1, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13028");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.8999999999999999, 0.39215686274509803]");
    }

    @Test
    public void test13029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13029");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) (byte) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13030");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) 100.0f, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13031");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) 1, (double) 1L);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[85, 255, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13032");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) (byte) 100, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13033");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) '4', (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13034");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), 0.0d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13035");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, 0.0d, (double) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
    }

    @Test
    public void test13036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13036");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) (byte) 10, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13037");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) 0L, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13038");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) (short) 1, (double) 1L);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 0, 0]");
    }

    @Test
    public void test13039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13039");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13040");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, 10, 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13041");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, 0.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13042");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) (-1L), (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13043");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) (byte) 1, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13044");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) 0L, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13045");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) 100L, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13046");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) (-1), (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13047");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) (byte) 0, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13048");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (byte) 1, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[245.625, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13049");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[135.88235294117646, 0.9714285714285715, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13050");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.9, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13051");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) '#', (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13052");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.6185567010309114, 1.0, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13053");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13054");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.9896907216494846, 0.3803921568627451]");
    }

    @Test
    public void test13055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13055");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) (short) 1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13056");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.39215686274509803]");
    }

    @Test
    public void test13057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13057");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) (-1), (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13058");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, 10.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13059");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (short) 1, 1.0d);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[85, 255, 0]");
    }

    @Test
    public void test13060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13060");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (short) 10, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13061");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (short) 1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.96875, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13062");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) (short) 0, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13063");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) 10.0f, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13064");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) (short) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13065");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, 0.0d, (double) 0L);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13066");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (short) 100, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13067");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) (byte) 1, (double) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[85, 255, 0]");
    }

    @Test
    public void test13068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13068");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) 1, (double) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test13069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13069");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), 0.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13070");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) (short) 100, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13071");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, 100.0d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13072");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (-1.0d), 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13073");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) (short) 1, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13074");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, 0, 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13075");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) '#', (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13076");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) (short) -1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13077");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, 1.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13078");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) 1.0f, 1.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 42, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13079");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (-1.0d), (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13080");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13081");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, 0.0d, (double) 0L);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13082");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13083");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13084");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) 10.0f, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13085");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) 0L, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13086");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13087");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) 10, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13088");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[121.875, 1.0, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13089");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) 1L, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13090");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) 10L, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13091");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 0.0f, (double) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
    }

    @Test
    public void test13092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13092");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) (-1), (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13093");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (byte) 1, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[259.375, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13094");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[257.41935483870964, 0.96875, 0.12549019607843137]");
    }

    @Test
    public void test13095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13095");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), 1.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13096");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) 100.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13097");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13098");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) (short) -1, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13099");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (byte) 0, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[340.2061855670103, 1.0, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13100");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (-1L), (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13101");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) (-1L), (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13102");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) 100, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13103");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13104");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 1.0f, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13105");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) (-1.0f), (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13106");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) (-1), 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13107");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) (short) 0, (double) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test13108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13108");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) 10, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13109");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13110");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13111");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) (short) 100, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13112");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, 100, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[134.66666666666663, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13113");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) (-1L), (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13114");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) (short) -1, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13115");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) 100, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13116");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (byte) 10, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[222.8571428571429, 1.0, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13117");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) (byte) 0, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13118");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) 100, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13119");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) 1, 0.0d);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test13120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13120");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) 100L, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13121");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) (short) 10, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13122");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (-1.0f), (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13123");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 'a', (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13124");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, 10, (int) '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[332.0, 0.8999999999999999, 0.39215686274509803]");
    }

    @Test
    public void test13125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13125");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13126");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) 0L, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13127");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (byte) 1, 0.0d);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test13128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13128");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) 10, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13129");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) 100, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13130");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) (byte) 1, 0.0d);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test13131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13131");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) (byte) 10, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13132");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) 1L, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13133");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) 0.0f, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13134");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) '4', (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13135");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) 0.0f, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13136");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13137");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, 0.0d, (double) 1L);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
    }

    @Test
    public void test13138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13138");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) (byte) 0, (double) (short) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13139");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (short) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[18.75, 1.0, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13140");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) (byte) 100, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13141");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (short) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[246.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13142");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (short) 0, (double) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13143");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) 0, 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[354.0, 1.0, 0.39215686274509803]");
    }

    @Test
    public void test13144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13144");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, 100, 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13145");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) 'a', (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13146");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) '4', (int) '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 0.8076923076923077, 0.20392156862745098]");
    }

    @Test
    public void test13147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13147");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (short) 0, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13148");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13149");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (byte) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[99.39393939393938, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13150");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) (byte) 0, (double) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13151");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13152");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) (short) -1, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13153");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) (-1), (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13154");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) 'a', 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[58.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13155");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) '4', (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[222.3529411764706, 0.68, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13156");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) (short) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13157");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) 10.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13158");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (-1), (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13159");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13160");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 'a', (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13161");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) (short) 10, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13162");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), 1.0d, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13163");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (byte) 0, 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.00392156862745098]");
    }

    @Test
    public void test13164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13164");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, 1.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13165");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (short) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13166");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.9, 0.0392156862745098]");
    }

    @Test
    public void test13167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13167");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13168");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, 100, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.68, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13169");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) 100, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13170");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) (short) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13171");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (-1.0d), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13172");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) 10, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13173");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13174");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, 1.0d, (double) 0L);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13175");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) (byte) 1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13176");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) '4', (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13177");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13178");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) (byte) 100, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13179");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) (-1L), (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13180");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, 0.0d, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13181");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, 1.0d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13182");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 100L, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13183");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[114.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13184");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (short) 100, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[119.39999999999998, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13185");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) 0, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13186");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (short) 0, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13187");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (byte) 1, (double) 1.0f);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 4, 0]");
    }

    @Test
    public void test13188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13188");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) 0, (double) 0L);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test13189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13189");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, 10.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13190");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (short) 0, (double) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test13191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13191");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) 1.0f, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13192");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) 1.0f, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13193");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) (short) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[246.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13194");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) 10, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13195");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) ' ', 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[257.6470588235294, 0.68, 0.39215686274509803]");
    }

    @Test
    public void test13196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13196");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) (-1.0f), (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13197");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) (byte) 100, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13198");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) (-1L), (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13199");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) (short) 1, 1.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[85, 255, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13200");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) 'a', (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[139.79381443298973, 1.0, 0.3803921568627451]");
    }

    @Test
    public void test13201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13201");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 1.0, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13202");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) 0.0f, (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13203");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) 10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13204");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, 0.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13205");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13206");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) ' ', 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.68, 0.39215686274509803]");
    }

    @Test
    public void test13207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13207");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) 0.0f, 0.0d);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test13208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13208");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, 0, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[258.75, 1.0, 0.12549019607843137]");
    }

    @Test
    public void test13209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13209");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, 0.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13210");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (short) 0, 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.0392156862745098]");
    }

    @Test
    public void test13211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13211");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) (byte) 100, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13212");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) (byte) 1, 1.0d);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[85, 255, 0]");
    }

    @Test
    public void test13213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13213");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) (byte) 0, (double) 1L);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
    }

    @Test
    public void test13214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13214");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.8999999999999999, 0.39215686274509803]");
    }

    @Test
    public void test13215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13215");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) 10, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13216");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) (short) 1, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13217");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) (byte) 10, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13218");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13219");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) 1.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13220");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 100.0f, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13221");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) 0.0f, (double) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
    }

    @Test
    public void test13222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13222");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 100.0f, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13223");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) (byte) 1, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13224");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) (short) 100, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13225");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13226");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[114.54545454545456, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13227");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) 10, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13228");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13229");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 100, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13230");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 0L, (double) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test13231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13231");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) '4', (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13232");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (short) 100, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13233");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) (byte) 100, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13234");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (short) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[245.4545454545455, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13235");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0]");
    }

    @Test
    public void test13236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13236");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (-1.0d), (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13237");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 1, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13238");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) '4', (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13239");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) (short) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13240");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) 1.0f, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13241");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) (short) -1, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13242");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) 0.0f, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13243");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13244");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 'a', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13245");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) (short) 1, (double) 1L);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 0, 0]");
    }

    @Test
    public void test13246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13246");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 1L, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13247");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 0, (double) 0L);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13248");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (short) 1, (double) 1.0f);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 0, 0]");
    }

    @Test
    public void test13249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13249");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) 100.0f, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13250");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 0L, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13251");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) 1, (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13252");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) (short) 1, (double) 1L);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[98, 255, 0]");
    }

    @Test
    public void test13253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13253");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) 100, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13254");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), 1.0d, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13255");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) (short) -1, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13256");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) 1.0f, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13257");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) 'a', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[181.81818181818176, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13258");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), 10.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13259");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, 10, 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.9, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13260");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) (byte) -1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13261");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) 'a', (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13262");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) '4', (int) '#');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[160.38461538461547, 1.0, 0.20392156862745098]");
    }

    @Test
    public void test13263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13263");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[88.125, 0.9896907216494846, 0.3803921568627451]");
    }

    @Test
    public void test13264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13264");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13265");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 'a', (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13266");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) ' ', (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13267");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) ' ', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13268");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, 100.0d, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13269");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) '#', (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 0.9714285714285715, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13270");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) 100.0f, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13271");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) (short) 100, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13272");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) (short) 10, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13273");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) (byte) 0, (double) (byte) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13274");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) (byte) 1, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13275");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) '4', (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13276");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) (-1L), (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13277");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, 0, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.6185567010309, 1.0, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13278");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, 1.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13279");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) 0.0f, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13280");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, 0.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13281");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) 0L, (double) 1.0f);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
    }

    @Test
    public void test13282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13282");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (byte) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.8969072164948454, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13283");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, 0.0d, (double) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test13284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13284");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13285");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) (short) 100, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13286");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) 100.0f, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13287");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (short) 1, 1.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 4, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13288");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) 10L, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13289");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13290");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) (short) 1, 1.0d);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 221, 0]");
    }

    @Test
    public void test13291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13291");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, 1, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[245.625, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13292");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.39215686274509803]");
    }

    @Test
    public void test13293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13293");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 1.0f, (double) 1.0f);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 0, 0]");
    }

    @Test
    public void test13294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13294");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, 0.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13295");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13296");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) (byte) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13297");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) (short) 10, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13298");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) '4', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[212.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13299");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (byte) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[246.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13300");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) '4', (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[84.28571428571428, 0.8076923076923077, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13301");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) 100, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13302");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13303");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) 0L, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13304");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) (short) -1, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13305");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.99, 0.39215686274509803]");
    }

    @Test
    public void test13306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13306");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) (byte) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13307");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) 0, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13308");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (byte) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[114.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13309");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[114.0, 1.0, 0.39215686274509803]");
    }

    @Test
    public void test13310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13310");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) ' ', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13311");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) (short) -1, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

