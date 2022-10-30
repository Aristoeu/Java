package RgbHsvConversion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08501");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (-1.0d), (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) '#', 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 1.0, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) 10L, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 0.99, 0.39215686274509803]");
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[89.09090909090912, 0.99, 0.39215686274509803]");
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', 100.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (short) 10, (int) '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[331.0344827586207, 0.8969072164948454, 0.3803921568627451]");
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) (byte) 1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) 'a', (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[58.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (short) 100, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 10L, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) 0.0f, (double) 0L);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (short) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[114.54545454545456, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) '#', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) 'a', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, 1, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[329.0909090909091, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 100, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) (byte) 100, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 100.0f, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) '4', (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) '#', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), 1.0d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (short) 0, (double) 0.0f);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) (short) 100, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) 'a', (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) (byte) 10, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (byte) 100, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) 10.0f, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (-1), (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, 100, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.68, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) '#', (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) (byte) 0, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, 0, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) '4', (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (short) 10, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[224.11764705882354, 0.9714285714285715, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) 'a', (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 0.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (short) 100, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) (short) 0, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, 0, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) (short) 10, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (short) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) 10.0f, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) (short) 100, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) 10L, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) (-1), (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) 1.0f, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, 0, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[241.1538461538462, 1.0, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) '4', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (short) 0, (int) '#');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[339.0, 1.0, 0.39215686274509803]");
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, 0.0d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) (-1.0f), (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) (-1.0f), (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) (byte) 1, (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) (byte) -1, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[61.80000000000001, 1.0, 0.39215686274509803]");
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[119.39999999999998, 1.0, 0.39215686274509803]");
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) 0.0f, (double) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[185.1428571428571, 1.0, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, 100.0d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) (byte) 10, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (-1), (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) 'a', 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[102.75862068965517, 0.8969072164948454, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, 10.0d, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, 0, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 100, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 1.0f, (double) 0.0f);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (short) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) (-1.0f), (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (short) 1, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (byte) 10, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 1L, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, 10.0d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) ' ', (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) 10, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (short) 1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[341.2121212121212, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 10, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) 0.0f, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) 0L, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[222.58064516129025, 0.96875, 0.12549019607843137]");
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) (byte) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) 'a', (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) (byte) 100, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, 100.0d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) 0.0f, (double) (byte) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) ' ', (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[220.625, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) (short) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) (short) 100, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) '4', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) '4', 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) ' ', (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.9, 0.0392156862745098]");
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, 0.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) (short) 0, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) 10.0f, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (byte) 1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[238.125, 1.0, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', 1, 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[349.4117647058824, 0.9807692307692308, 0.20392156862745098]");
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 'a', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, 0.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) ' ', (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 0L, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 1L, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) (byte) 1, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 1.0f, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (byte) 1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) (byte) 1, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) ' ', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[297.3529411764706, 0.68, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 10.0f, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (short) 10, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[234.375, 0.9896907216494846, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) '#', (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[174.8571428571429, 1.0, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 100.0f, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, 10.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 1.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 100, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.0392156862745098]");
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) (-1.0f), (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) (short) 1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0392156862745098]");
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) 0L, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) ' ', 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[255.88235294117646, 0.9714285714285715, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, 0.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 1L, (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[85, 255, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) (short) 10, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) (byte) 0, 1.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, 100.0d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (-1.0d), (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) 1.0f, (double) 1L);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[85, 255, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) (short) 100, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (short) -1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (short) 100, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) (short) 10, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 0.8969072164948454, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) 0L, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) (short) 100, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, 0.0d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, 0.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) 0, (double) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, 0.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) 'a', (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 10, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) 1, (double) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) ' ', (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.68, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) 100.0f, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[342.85714285714283, 1.0, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) (short) -1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) 0.0f, 1.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) (short) 0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 100.0f, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (-1.0d), (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) (byte) 1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (short) 10, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[254.66666666666663, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (short) 100, 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) (short) -1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 0, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) 1L, 0.0d);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (short) 0, (int) '#');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 1.0, 0.13725490196078433]");
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, 10, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) 10.0f, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) 10, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) 100.0f, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) (short) 1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), 100.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) 'a', (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[117.23076923076923, 0.6701030927835051, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 1.0, 0.3803921568627451]");
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) ' ', (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) 10.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) '#', 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.7142857142857143, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, 0.0d, (double) (byte) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[256.66666666666674, 0.8999999999999999, 0.39215686274509803]");
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 100L, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) 100.0f, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, 100.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[228.46153846153845, 1.0, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) (short) -1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), 100.0d, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) 0.0f, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[15.882352941176464, 0.9714285714285715, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.80000000000001, 1.0, 0.39215686274509803]");
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) 10, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) (short) 0, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, 100.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) (short) 0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, 1.0d, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, 0.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) '#', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (byte) 0, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[328.8, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', 1, 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.9896907216494846, 0.3803921568627451]");
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) 10L, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) (short) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) 10L, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) (byte) -1, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (short) 100, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', 0.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) '4', (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[83.0769230769231, 1.0, 0.20392156862745098]");
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (-1.0d), (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) (byte) 1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) 100.0f, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) 10L, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (byte) -1, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) (byte) 1, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 1.0f, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) (short) 100, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 0, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) 0.0f, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, 100, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[139.2, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) '4', (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (byte) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.9, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 10, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) 'a', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) ' ', (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) ' ', (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 1.0, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) (-1), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.96875, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[259.20000000000005, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, 0.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) (short) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.9, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) 0.0f, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) (short) 10, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) ' ', 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 1, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (-1.0f), (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (short) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[234.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) ' ', (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) (short) 10, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, (double) 100L, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) (short) 100, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) 100L, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 1.0f, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) (byte) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[126.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) (short) 100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), 10.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) 0.0f, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) 'a', (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) (byte) 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.00392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) (byte) -1, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, 1, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) '#', (int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[237.3529411764706, 0.68, 0.39215686274509803]");
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) (byte) 100, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) 1L, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 1L, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) (short) 1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) (-1L), (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) '#', (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, 1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[341.2121212121212, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 0, (int) '4', (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[160.38461538461547, 1.0, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, 0, 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) 1.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) (byte) 100, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (short) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (short) 100, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) (byte) 100, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) 'a', (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) 0.0f, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (short) 100, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) 'a', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) (-1L), (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) 0.0f, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (short) 0, 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.60000000000002, 1.0, 0.39215686274509803]");
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) ' ', (double) '4', 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (short) 1, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) (short) 1, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, 1.0d, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[58.18181818181819, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) (short) -1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 100.0f, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 0.9714285714285715, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) (short) -1, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) 10L, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 100.0f, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) 0.0f, (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) ' ', 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (short) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.60000000000002, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (byte) 10, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[342.7586206896552, 0.8969072164948454, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (short) 100, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.48, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) 100.0f, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (short) 10, 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.6875, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, 100, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) (byte) 1, (double) 0.0f);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (byte) 0, (double) 1.0f);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.96875, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 0.9, 0.0392156862745098]");
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, 0, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[251.53846153846155, 1.0, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) (short) 10, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) ' ', 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[101.25, 1.0, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) 10, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, 10.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[359.3814432989691, 1.0, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 1L, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (short) 100, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.39215686274509803]");
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) (byte) 0, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, 1.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (short) 100, 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[180.0, 0.99, 0.39215686274509803]");
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) 0.0f, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) 1.0f, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) '#', (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) (byte) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) (short) 1, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) '#', (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) (byte) 0, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) (short) 10, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (byte) 1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) (byte) 100, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) ' ', (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.6875, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), 0.0d, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) (short) -1, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) ' ', (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 1L, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (-1.0d), (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 1.0f, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) 100, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) 1, (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (byte) 0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[119.39999999999998, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) 1.0f, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) 10L, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (-1L), (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, (double) 0L, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) '#', 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[219.39393939393938, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '#', (int) (short) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[99.39393939393938, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (byte) 100, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.6499999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, (double) (short) 100, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (byte) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[301.8181818181818, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 1, 0.0d, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10.0f, (double) (short) 1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[238.28571428571422, 1.0, 0.13725490196078433]");
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) 10, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) (short) -1, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) (short) 10, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (byte) -1, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) 'a', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, 10.0d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, 100.0d, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 100, (int) '4', 10);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[28.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) (-1.0f), (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) '4', (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) (byte) 10, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1L), (double) 100L, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '#', (double) 10, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, 10.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1, (double) 100.0f, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) 0, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) (byte) -1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) (byte) 1, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 'a', (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) '#', 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[297.2307692307693, 0.6499999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) 0, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (-1.0d), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 10, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) (-1), 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) 0L, (double) 0L);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) 10L, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 100, (double) '#', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) (short) 100, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (byte) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (-1.0d), (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 1, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (short) 10, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[229.41176470588243, 0.9807692307692308, 0.20392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (-1L), 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, (double) 'a', (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 0, 10.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) 100.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(10.0d, (double) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) (byte) -1, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) 'a', (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[122.76923076923077, 0.6701030927835051, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 10L, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) 10, 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 0, (double) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, 0.0d, (double) (short) 1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[255, 255, 255]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.80000000000001, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, 100.0d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) ' ', (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1L, 0.0d, 0.0d);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(0, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blue should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((-1), (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (-1.0d), (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) 'a', (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.6701030927835051, 0.3803921568627451]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 10.0f, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(10, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) (byte) 1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: green should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) 1L, (double) 0.0f);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 0, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) (byte) 10, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0, (double) '4', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) -1, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) (-1), (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) ' ', (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[19.19999999999999, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[6.0, 1.0, 0.39215686274509803]");
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) (short) -1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10, (double) 0.0f, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (double) 'a', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) 'a', (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1.0f), (double) (byte) 1, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) 100.0f, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) 0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 0, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0L, (double) (short) 1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) 10, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) 'a', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.030000000000000037, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) 10L, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 10L, (double) 100.0f, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) -1, (double) 1.0f, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, 0.0d, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 10, (double) (byte) 10, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(100, (int) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 10, (int) (byte) 100, (int) '4');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[148.0, 0.8999999999999999, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100, (-1.0d), (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv(1, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[120.0, 0.96875, 0.12549019607843137]");
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (short) 1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) (short) 0, (double) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (short) 100, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 100, 100.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) (byte) -1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) (short) -1, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 1, (int) (short) 100, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[119.39999999999998, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) ' ', (int) (short) 1, (int) '#');
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[294.7058823529412, 0.9714285714285715, 0.13725490196078433]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((-1.0d), (double) (-1L), (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) 0.0f, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) 1.0f, (double) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) '4', (int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[271.20000000000005, 1.0, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 'a', (double) 0L, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) -1, (double) 0.0f, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (short) 1, (double) 1, (double) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, 0, 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100.0f, (double) 10L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) (short) 1, (int) '#');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[240.0, 0.9714285714285715, 0.13725490196078433]");
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(0.0d, (double) (-1.0f), (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (byte) 10, (double) '#', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) (-1), (double) 100L, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hue should be between 0 and 360");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) '4', (double) 1.0f, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) (byte) 0, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 1.0f, (double) (byte) 1, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) -1, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: red should be between 0 and 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 1, (int) ' ', 0);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[118.125, 1.0, 0.12549019607843137]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 100L, (double) 'a', (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb((double) 0.0f, (double) 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
        int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(100.0d, (double) 1L, (double) 0);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (short) 10, (int) (short) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[60.0, 0.9, 0.0392156862745098]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = com.thealgorithms.conversions.RgbHsvConversion.hsvToRgb(1.0d, (double) '4', (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: saturation should be between 0 and 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
        double[] doubleArray3 = com.thealgorithms.conversions.RgbHsvConversion.rgbToHsv((int) (byte) 100, 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[300.0, 0.99, 0.39215686274509803]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}

