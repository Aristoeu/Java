package RgbHsvConversion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 0L, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (short) -1, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (byte) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.8076923076923077, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (byte) 0, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) (byte) 10, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) '4', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[224.30769230769238, 0.6499999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) '#', 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.9714285714285715, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, 0.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) (byte) 0, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) (byte) 1, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) (byte) 1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) (-1.0f), (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, 1.0d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (short) 10, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) (byte) 0, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (short) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[298.18181818181824, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (-1.0d), (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) (byte) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) (short) 0, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) '4', (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (byte) -1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 10L, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 1.0f, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) (-1), (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) (short) 1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) (-1.0f), (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) (byte) 1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) 100.0f, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (short) 1, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[245.4545454545455, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) (short) 1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (short) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[119.39999999999998, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (byte) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.60000000000002, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 1, (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[229.41176470588243, 0.9807692307692308, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (short) 0, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[258.75, 1.0, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) (byte) 100, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[359.4, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, 0, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[241.71428571428578, 1.0, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) (short) 1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) 100L, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (byte) -1, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) 0.0f, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) '4', (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) '#', 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[40.38461538461536, 1.0, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 0.0f, (double) 1L);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (short) 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, 10.0d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 100.0f, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) 10, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, 0, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[339.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) 1L, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (-1.0f), (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', 100.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 1, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (byte) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.9, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) (byte) -1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) '#', 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[16.666666666666686, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) '4', (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) (-1.0f), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) 10L, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (-1.0d), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, 0.0d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 0L, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) (-1L), (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, 0.0d, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, 100.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 0L, (double) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[5.454545454545439, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) (byte) 0, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) (short) -1, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) 100.0f, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) (short) 100, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) 0L, (double) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), 0.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, 10.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, 10.0d, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) (short) 1, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[301.8181818181818, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) (-1.0f), (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, 10.0d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) '#', (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (byte) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[246.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (-1), (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) 0, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) 0L, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[298.18181818181824, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (-1L), (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.9, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) 10.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (byte) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.9, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (-1L), (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) 100.0f, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (short) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) '#', (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 1.0, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) 'a', (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) 'a', 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[126.18556701030928, 1.0, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) 100, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', 0.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) (byte) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 0L, (double) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (short) 10, 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) (short) 100, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) 100.0f, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (-1.0d), (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 1.0f, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.7142857142857224, 1.0, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) (byte) 10, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) 10, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, 100.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 10, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, 10.0d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) 10L, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[141.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (short) 1, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 0.9807692307692308, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[239.39999999999998, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) ' ', (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.6875, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) ' ', (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 0.38461538461538464, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) 100, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) 0L, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (short) 10, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (byte) 1, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[298.18181818181824, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, 100, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[136.66666666666663, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) 10.0f, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) (byte) 100, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) (byte) 1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 0.0f, (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[354.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (short) 10, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[343.3333333333333, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (-1.0f), (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) 100.0f, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (short) 1, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[328.125, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) (short) 100, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (-1.0d), (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) '4', 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[208.79999999999995, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 100, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (short) 100, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[139.2, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (byte) 0, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, 0.0d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (short) -1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) 1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 0.0f, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) 0, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, 0.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) 'a', (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) 'a', (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, 100.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (-1), (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) 'a', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[182.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (short) 100, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (byte) 1, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) 0, (double) (byte) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', 1, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) (byte) -1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.9714285714285715, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) (short) 1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (short) 1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) 10L, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) '4', (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) 1.0f, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 0L, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) 100L, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) 1.0f, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) (-1.0f), (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) (byte) 0, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, 1.0d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) 'a', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) 100L, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[246.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) (short) 1, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) (byte) 10, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) 10, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[114.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (short) 100, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.48, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (-1.0d), (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, 0.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) (-1), (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (short) 100, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (byte) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[62.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (byte) 10, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) 10L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 100, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, 100.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) (byte) 100, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) '4', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[208.79999999999995, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) (short) 100, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) 1L, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, 0, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[328.8, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) (byte) -1, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) (byte) 1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (short) 1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) (-1.0f), (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) 10L, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (short) 100, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) 1.0f, (double) 0.0f);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) ' ', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, 1, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[245.4545454545455, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) (byte) 1, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) (-1L), (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) 10L, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) 'a', (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.6701030927835051, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (short) 100, 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[89.09090909090912, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) '#', (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.99, 0.39215686274509803]");
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) (-1.0f), 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (short) 0, (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 100L, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) (short) 100, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) '4', (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), 0.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) (byte) 0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 1L, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, 100.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) (byte) 1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) (short) 0, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (-1), (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (short) 100, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) '#', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) 0.0f, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) 100L, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) 100, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (byte) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[126.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) (byte) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, 10.0d, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, 100, 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 1.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, 100.0d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, 100.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) 'a', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (byte) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[246.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) 10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) (-1), (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) (short) 100, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) (short) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (short) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[234.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) (byte) 100, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) 0L, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) 10L, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (short) 1, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, 0.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) '4', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, 0.0d, (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) '4', (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 0.0f, (double) 1L);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[79.61538461538464, 1.0, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, 100.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (short) 1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) '4', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[208.79999999999995, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (byte) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, 0.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) ' ', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[221.21212121212125, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) (short) 1, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) 100L, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) 100L, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (-1.0d), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (short) 10, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[233.81443298969066, 1.0, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) 1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) 0.0f, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (byte) 100, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (-1.0d), (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, 10, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[234.5454545454545, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) (short) -1, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (short) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) (short) 0, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, 1, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (byte) 0, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 100L, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) '#', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 100L, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[114.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) 'a', (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) 100L, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, 0.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) (byte) 0, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) 0, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', 100, 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[89.09090909090912, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) 1.0f, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 0L, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) ' ', (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, 1, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), 0.0d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), 1.0d, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) 1, (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) ' ', (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[220.20618556701027, 1.0, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, 0.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) '4', 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) 10L, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (byte) -1, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 0.0f, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, 0.0d, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) 10.0f, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', 10.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) (byte) 0, (double) 1L);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) (byte) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (byte) 10, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) (-1.0f), (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (short) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.9, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) 10, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[259.375, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[126.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) 100L, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[246.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, 1.0d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (-1.0d), (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (byte) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[17.142857142857167, 1.0, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (byte) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[234.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (byte) 10, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 100, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) '#', (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) '4', (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.48, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (-1.0d), (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), 100.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, 0.0d, (double) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, 0.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) (short) 1, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) (-1L), 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (-1L), 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) (byte) 1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, 0.0d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (short) 10, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, 0.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (short) 10, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) 0L, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 1L, (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) (-1L), (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) 10L, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) 1.0f, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) (-1), (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[246.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) (byte) -1, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) '4', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 10L, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, 0.0d, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (short) 1, (double) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[85, 255, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) (-1), (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) (short) 100, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) 10.0f, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) (byte) -1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) 1.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (short) 1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[305.29411764705884, 0.9714285714285715, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, 10.0d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) (byte) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (short) 100, 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) (byte) 0, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) (short) 1, (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) (short) -1, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) 100L, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) 0, (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

