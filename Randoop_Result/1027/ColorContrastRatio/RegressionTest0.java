package ColorContrastRatio;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color3 = null;
        java.awt.Color color4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = colorContrastRatio0.getContrastRatio(color3, color4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        java.lang.Class<?> wildcardClass1 = colorContrastRatio0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        java.awt.Color color1 = null;
        java.awt.Color color2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = colorContrastRatio0.getContrastRatio(color1, color2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        java.awt.Color color1 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = colorContrastRatio0.getRelativeLuminance(color1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = colorContrastRatio0.getRelativeLuminance(color3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        java.awt.Color color5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = colorContrastRatio0.getRelativeLuminance(color5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color5 = null;
        java.awt.Color color6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = colorContrastRatio0.getContrastRatio(color5, color6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = colorContrastRatio0.getRelativeLuminance(color5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        java.awt.Color color5 = null;
        java.awt.Color color6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = colorContrastRatio0.getContrastRatio(color5, color6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        java.awt.Color color3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = colorContrastRatio0.getRelativeLuminance(color3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        java.lang.Class<?> wildcardClass5 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        java.lang.Class<?> wildcardClass5 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        java.awt.Color color3 = null;
        java.awt.Color color4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = colorContrastRatio0.getContrastRatio(color3, color4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        java.awt.Color color5 = null;
        java.awt.Color color6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = colorContrastRatio0.getContrastRatio(color5, color6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((-1));
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 100);
        java.awt.Color color5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = colorContrastRatio0.getRelativeLuminance(color5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((-1));
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 100);
        java.lang.Class<?> wildcardClass5 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) 0);
        java.awt.Color color3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = colorContrastRatio0.getRelativeLuminance(color3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 100);
        java.awt.Color color5 = null;
        java.awt.Color color6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = colorContrastRatio0.getContrastRatio(color5, color6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) 0);
        java.lang.Class<?> wildcardClass3 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        java.lang.Class<?> wildcardClass3 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = colorContrastRatio0.getRelativeLuminance(color3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) -1);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color5 = null;
        java.awt.Color color6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = colorContrastRatio0.getContrastRatio(color5, color6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        double double8 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) 0);
        java.awt.Color color3 = null;
        java.awt.Color color4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = colorContrastRatio0.getContrastRatio(color3, color4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = colorContrastRatio0.getRelativeLuminance(color5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((-1));
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color3 = null;
        java.awt.Color color4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = colorContrastRatio0.getContrastRatio(color3, color4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        java.lang.Class<?> wildcardClass5 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        java.lang.Class<?> wildcardClass5 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(0);
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(0);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (byte) 10);
        double double6 = colorContrastRatio0.getColor(0);
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        java.awt.Color color5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = colorContrastRatio0.getRelativeLuminance(color5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) '4');
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) ' ');
        java.awt.Color color3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = colorContrastRatio0.getRelativeLuminance(color3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014443843596092545d + "'", double2 == 0.014443843596092545d);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (byte) 10);
        double double6 = colorContrastRatio0.getColor(0);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((-1));
        double double8 = colorContrastRatio0.getColor((int) '#');
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.016807375752887384d + "'", double8 == 0.016807375752887384d);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (byte) 10);
        java.awt.Color color5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = colorContrastRatio0.getRelativeLuminance(color5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(0);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 100);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((-1));
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor((-1));
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        java.lang.Class<?> wildcardClass5 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor((-1));
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(0);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 100);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        java.awt.Color color5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = colorContrastRatio0.getRelativeLuminance(color5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((-1));
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) (byte) -1);
        java.awt.Color color5 = null;
        java.awt.Color color6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = colorContrastRatio0.getContrastRatio(color5, color6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(0);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((-1));
        java.awt.Color color5 = null;
        java.awt.Color color6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = colorContrastRatio0.getContrastRatio(color5, color6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) '#');
        java.lang.Class<?> wildcardClass3 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016807375752887384d + "'", double2 == 0.016807375752887384d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(0);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(0);
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(10);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) '#');
        java.awt.Color color3 = null;
        java.awt.Color color4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = colorContrastRatio0.getContrastRatio(color3, color4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016807375752887384d + "'", double2 == 0.016807375752887384d);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) '4');
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(10);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((int) ' ');
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.014443843596092545d + "'", double10 == 0.014443843596092545d);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((-1));
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) 100);
        double double10 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor(100);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor(0);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(0);
        java.awt.Color color5 = null;
        java.awt.Color color6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = colorContrastRatio0.getContrastRatio(color5, color6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color5 = null;
        java.awt.Color color6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = colorContrastRatio0.getContrastRatio(color5, color6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.035269835488375E-4d + "'", double4 == 3.035269835488375E-4d);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(0);
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(10);
        double double12 = colorContrastRatio0.getColor((int) (short) 100);
        double double14 = colorContrastRatio0.getColor(0);
        java.awt.Color color15 = null;
        java.awt.Color color16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = colorContrastRatio0.getContrastRatio(color15, color16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((int) ' ');
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.014443843596092545d + "'", double10 == 0.014443843596092545d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(10);
        double double12 = colorContrastRatio0.getColor((int) (short) 100);
        double double14 = colorContrastRatio0.getColor(0);
        java.awt.Color color15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = colorContrastRatio0.getRelativeLuminance(color15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 0);
        double double8 = colorContrastRatio0.getColor((int) (short) 100);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) (byte) -1);
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 100);
        double double6 = colorContrastRatio0.getColor((int) (short) 100);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        double double12 = colorContrastRatio0.getColor((int) (byte) 10);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) ' ');
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        java.lang.Class<?> wildcardClass5 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014443843596092545d + "'", double2 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(0);
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        double double14 = colorContrastRatio0.getColor(10);
        java.awt.Color color15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = colorContrastRatio0.getRelativeLuminance(color15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.035269835488375E-4d + "'", double4 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(10);
        double double12 = colorContrastRatio0.getColor((int) (short) 100);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) 100);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((-1));
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor(0);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor((-1));
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        java.awt.Color color5 = null;
        java.awt.Color color6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = colorContrastRatio0.getContrastRatio(color5, color6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor(0);
        double double12 = colorContrastRatio0.getColor(10);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 0);
        double double8 = colorContrastRatio0.getColor((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor((-1));
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) (byte) -1);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        double double12 = colorContrastRatio0.getColor((int) (byte) 10);
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        java.awt.Color color15 = null;
        java.awt.Color color16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = colorContrastRatio0.getContrastRatio(color15, color16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        double double8 = colorContrastRatio0.getColor((int) '4');
        double double10 = colorContrastRatio0.getColor((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) 100);
        double double10 = colorContrastRatio0.getColor((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        double double14 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = colorContrastRatio0.getRelativeLuminance(color15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) '4');
        double double10 = colorContrastRatio0.getColor((-1));
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 0);
        double double10 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(0);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(0);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((int) ' ');
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.014443843596092545d + "'", double10 == 0.014443843596092545d);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) '#');
        java.awt.Color color3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = colorContrastRatio0.getRelativeLuminance(color3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016807375752887384d + "'", double2 == 0.016807375752887384d);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) (byte) 1);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.035269835488375E-4d + "'", double4 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) (short) 0);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        double double8 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.11953842798834562d + "'", double8 == 0.11953842798834562d);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        double double14 = colorContrastRatio0.getColor((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 0);
        double double10 = colorContrastRatio0.getColor((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor(0);
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        double double8 = colorContrastRatio0.getColor((int) 'a');
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.11953842798834562d + "'", double8 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 0);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) 0);
        double double4 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color5 = null;
        java.awt.Color color6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = colorContrastRatio0.getContrastRatio(color5, color6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((-1));
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03433980680868217d + "'", double12 == 0.03433980680868217d);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(10);
        double double12 = colorContrastRatio0.getColor((int) (short) 100);
        double double14 = colorContrastRatio0.getColor(0);
        double double16 = colorContrastRatio0.getColor((int) (short) 0);
        java.awt.Color color17 = null;
        java.awt.Color color18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = colorContrastRatio0.getContrastRatio(color17, color18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(0);
        java.awt.Color color5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = colorContrastRatio0.getRelativeLuminance(color5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        double double12 = colorContrastRatio0.getColor((int) (byte) 10);
        double double14 = colorContrastRatio0.getColor((int) ' ');
        double double16 = colorContrastRatio0.getColor((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.014443843596092545d + "'", double14 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) (byte) 1);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.035269835488375E-4d + "'", double4 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass5 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) '4');
        double double14 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = colorContrastRatio0.getRelativeLuminance(color15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03433980680868217d + "'", double12 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.03433980680868217d + "'", double14 == 0.03433980680868217d);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor((int) (byte) -1);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        double double14 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color15 = null;
        java.awt.Color color16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = colorContrastRatio0.getContrastRatio(color15, color16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor((int) 'a');
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11953842798834562d + "'", double12 == 0.11953842798834562d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        double double8 = colorContrastRatio0.getColor((int) 'a');
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.11953842798834562d + "'", double8 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) '4');
        double double10 = colorContrastRatio0.getColor((-1));
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor(100);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        double double12 = colorContrastRatio0.getColor((int) (byte) 10);
        double double14 = colorContrastRatio0.getColor((int) ' ');
        java.lang.Class<?> wildcardClass15 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.014443843596092545d + "'", double14 == 0.014443843596092545d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor(0);
        double double12 = colorContrastRatio0.getColor(10);
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) 0);
        double double4 = colorContrastRatio0.getColor((int) (byte) 0);
        double double6 = colorContrastRatio0.getColor(0);
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) '#');
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.016807375752887384d + "'", double12 == 0.016807375752887384d);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        double double12 = colorContrastRatio0.getColor((int) (byte) 10);
        double double14 = colorContrastRatio0.getColor((int) ' ');
        double double16 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color17 = null;
        java.awt.Color color18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = colorContrastRatio0.getContrastRatio(color17, color18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.014443843596092545d + "'", double14 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(10);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((-1));
        java.lang.Class<?> wildcardClass5 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        double double12 = colorContrastRatio0.getColor((int) ' ');
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.014443843596092545d + "'", double12 == 0.014443843596092545d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor(0);
        double double12 = colorContrastRatio0.getColor(10);
        double double14 = colorContrastRatio0.getColor((int) '#');
        java.awt.Color color15 = null;
        java.awt.Color color16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = colorContrastRatio0.getContrastRatio(color15, color16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.016807375752887384d + "'", double14 == 0.016807375752887384d);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) '#');
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.016807375752887384d + "'", double6 == 0.016807375752887384d);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 100);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = colorContrastRatio0.getRelativeLuminance(color5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) (byte) 1);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.035269835488375E-4d + "'", double4 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor(0);
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) '#');
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.016807375752887384d + "'", double6 == 0.016807375752887384d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) '#');
        double double14 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = colorContrastRatio0.getRelativeLuminance(color15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.016807375752887384d + "'", double12 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.11953842798834562d + "'", double14 == 0.11953842798834562d);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((-1));
        double double8 = colorContrastRatio0.getColor((int) '#');
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.016807375752887384d + "'", double8 == 0.016807375752887384d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor(0);
        double double12 = colorContrastRatio0.getColor(10);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) '4');
        double double14 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color15 = null;
        java.awt.Color color16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = colorContrastRatio0.getContrastRatio(color15, color16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03433980680868217d + "'", double12 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.03433980680868217d + "'", double14 == 0.03433980680868217d);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(0);
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((-1));
        double double8 = colorContrastRatio0.getColor((int) '#');
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.016807375752887384d + "'", double8 == 0.016807375752887384d);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(0);
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        double double14 = colorContrastRatio0.getColor((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        double double14 = colorContrastRatio0.getColor((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        double double12 = colorContrastRatio0.getColor((int) (byte) 10);
        double double14 = colorContrastRatio0.getColor((int) ' ');
        java.awt.Color color15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = colorContrastRatio0.getRelativeLuminance(color15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.014443843596092545d + "'", double14 == 0.014443843596092545d);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor(0);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((-1));
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) ' ');
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014443843596092545d + "'", double2 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) 0);
        double double4 = colorContrastRatio0.getColor((int) (byte) 0);
        double double6 = colorContrastRatio0.getColor(0);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(10);
        double double12 = colorContrastRatio0.getColor((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) '#');
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.016807375752887384d + "'", double12 == 0.016807375752887384d);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 100);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        double double8 = colorContrastRatio0.getColor(0);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 100);
        double double6 = colorContrastRatio0.getColor((int) (short) 100);
        double double8 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) '#');
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.016807375752887384d + "'", double6 == 0.016807375752887384d);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor(0);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (byte) 10);
        double double6 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) ' ');
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014443843596092545d + "'", double2 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(10);
        double double12 = colorContrastRatio0.getColor((int) (short) 100);
        double double14 = colorContrastRatio0.getColor(0);
        double double16 = colorContrastRatio0.getColor((int) (short) 0);
        double double18 = colorContrastRatio0.getColor((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (byte) 10);
        java.awt.Color color5 = null;
        java.awt.Color color6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = colorContrastRatio0.getContrastRatio(color5, color6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 0);
        double double8 = colorContrastRatio0.getColor((-1));
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(0);
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        double double14 = colorContrastRatio0.getColor((int) (short) 10);
        java.awt.Color color15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = colorContrastRatio0.getRelativeLuminance(color15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        double double14 = colorContrastRatio0.getColor((int) (short) 1);
        java.awt.Color color15 = null;
        java.awt.Color color16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = colorContrastRatio0.getContrastRatio(color15, color16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.035269835488375E-4d + "'", double14 == 3.035269835488375E-4d);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        double double14 = colorContrastRatio0.getColor(100);
        java.awt.Color color15 = null;
        java.awt.Color color16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = colorContrastRatio0.getContrastRatio(color15, color16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor(100);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        double double8 = colorContrastRatio0.getColor((int) '4');
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        double double12 = colorContrastRatio0.getColor((int) (byte) 10);
        double double14 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = colorContrastRatio0.getRelativeLuminance(color15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.035269835488375E-4d + "'", double14 == 3.035269835488375E-4d);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) 100);
        double double10 = colorContrastRatio0.getColor((int) (short) 0);
        double double12 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) ' ');
        java.lang.Class<?> wildcardClass3 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014443843596092545d + "'", double2 == 0.014443843596092545d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) 0);
        double double12 = colorContrastRatio0.getColor((int) '#');
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.016807375752887384d + "'", double12 == 0.016807375752887384d);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        double double12 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor(100);
        java.awt.Color color15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = colorContrastRatio0.getRelativeLuminance(color15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((-1));
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = colorContrastRatio0.getRelativeLuminance(color5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.035269835488375E-4d + "'", double4 == 3.035269835488375E-4d);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        double double14 = colorContrastRatio0.getColor((int) (byte) -1);
        java.awt.Color color15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = colorContrastRatio0.getRelativeLuminance(color15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(0);
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        double double14 = colorContrastRatio0.getColor(10);
        java.lang.Class<?> wildcardClass15 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass17 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((-1));
        double double14 = colorContrastRatio0.getColor((int) (short) 1);
        double double16 = colorContrastRatio0.getColor(100);
        java.awt.Color color17 = null;
        java.awt.Color color18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = colorContrastRatio0.getContrastRatio(color17, color18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.035269835488375E-4d + "'", double14 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.12743768043564743d + "'", double16 == 0.12743768043564743d);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) ' ');
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014443843596092545d + "'", double2 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        double double14 = colorContrastRatio0.getColor(100);
        java.awt.Color color15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = colorContrastRatio0.getRelativeLuminance(color15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 0);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        double double8 = colorContrastRatio0.getColor((int) '4');
        double double10 = colorContrastRatio0.getColor((int) (short) 0);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        double double14 = colorContrastRatio0.getColor((int) (byte) -1);
        double double16 = colorContrastRatio0.getColor(1);
        java.awt.Color color17 = null;
        java.awt.Color color18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = colorContrastRatio0.getContrastRatio(color17, color18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 100);
        double double6 = colorContrastRatio0.getColor((int) (short) 100);
        double double8 = colorContrastRatio0.getColor(0);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) '#');
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.016807375752887384d + "'", double6 == 0.016807375752887384d);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor(100);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor(100);
        double double16 = colorContrastRatio0.getColor((-1));
        java.awt.Color color17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = colorContrastRatio0.getRelativeLuminance(color17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) -1);
        double double12 = colorContrastRatio0.getColor((-1));
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) '#');
        double double14 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color15 = null;
        java.awt.Color color16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = colorContrastRatio0.getContrastRatio(color15, color16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.016807375752887384d + "'", double12 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.11953842798834562d + "'", double14 == 0.11953842798834562d);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor(10);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(10);
        double double12 = colorContrastRatio0.getColor((int) (short) 100);
        double double14 = colorContrastRatio0.getColor(0);
        double double16 = colorContrastRatio0.getColor((int) (short) 0);
        double double18 = colorContrastRatio0.getColor((int) (short) -1);
        double double20 = colorContrastRatio0.getColor((int) (byte) 10);
        java.awt.Color color21 = null;
        java.awt.Color color22 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = colorContrastRatio0.getContrastRatio(color21, color22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.003035269835488375d + "'", double20 == 0.003035269835488375d);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor(100);
        java.awt.Color color15 = null;
        java.awt.Color color16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = colorContrastRatio0.getContrastRatio(color15, color16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((-1));
        double double14 = colorContrastRatio0.getColor((int) (short) 1);
        java.awt.Color color15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = colorContrastRatio0.getRelativeLuminance(color15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.035269835488375E-4d + "'", double14 == 3.035269835488375E-4d);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color17 = null;
        java.awt.Color color18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = colorContrastRatio0.getContrastRatio(color17, color18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) '#');
        double double14 = colorContrastRatio0.getColor((int) '#');
        double double16 = colorContrastRatio0.getColor((int) (byte) 1);
        double double18 = colorContrastRatio0.getColor((int) (byte) -1);
        java.awt.Color color19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = colorContrastRatio0.getRelativeLuminance(color19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.016807375752887384d + "'", double12 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.016807375752887384d + "'", double14 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) 0);
        double double4 = colorContrastRatio0.getColor((int) (byte) 0);
        double double6 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((-1));
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) '#');
        double double14 = colorContrastRatio0.getColor((int) '#');
        java.lang.Class<?> wildcardClass15 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.016807375752887384d + "'", double12 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.016807375752887384d + "'", double14 == 0.016807375752887384d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) 0);
        double double12 = colorContrastRatio0.getColor((int) '#');
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.016807375752887384d + "'", double12 == 0.016807375752887384d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((int) '#');
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.016807375752887384d + "'", double10 == 0.016807375752887384d);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) -1);
        double double12 = colorContrastRatio0.getColor((-1));
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor(0);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(0);
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor((int) (byte) -1);
        double double12 = colorContrastRatio0.getColor((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor(0);
        double double12 = colorContrastRatio0.getColor(10);
        double double14 = colorContrastRatio0.getColor((int) '#');
        double double16 = colorContrastRatio0.getColor(1);
        java.lang.Class<?> wildcardClass17 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.016807375752887384d + "'", double14 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) '#');
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        java.awt.Color color5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = colorContrastRatio0.getRelativeLuminance(color5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016807375752887384d + "'", double2 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        double double14 = colorContrastRatio0.getColor((int) (byte) 0);
        double double16 = colorContrastRatio0.getColor((int) ' ');
        java.awt.Color color17 = null;
        java.awt.Color color18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = colorContrastRatio0.getContrastRatio(color17, color18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.014443843596092545d + "'", double16 == 0.014443843596092545d);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03433980680868217d + "'", double12 == 0.03433980680868217d);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor(100);
        double double16 = colorContrastRatio0.getColor((-1));
        java.awt.Color color17 = null;
        java.awt.Color color18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = colorContrastRatio0.getContrastRatio(color17, color18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        double double8 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.11953842798834562d + "'", double8 == 0.11953842798834562d);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(10);
        double double12 = colorContrastRatio0.getColor((int) (short) 100);
        double double14 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass15 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 10);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(10);
        double double12 = colorContrastRatio0.getColor((int) (short) 100);
        double double14 = colorContrastRatio0.getColor(0);
        double double16 = colorContrastRatio0.getColor((int) (short) 0);
        double double18 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color19 = null;
        java.awt.Color color20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = colorContrastRatio0.getContrastRatio(color19, color20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor(10);
        double double10 = colorContrastRatio0.getColor((int) '4');
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.03433980680868217d + "'", double10 == 0.03433980680868217d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.03433980680868217d + "'", double10 == 0.03433980680868217d);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) '#');
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.016807375752887384d + "'", double12 == 0.016807375752887384d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        double double14 = colorContrastRatio0.getColor(100);
        double double16 = colorContrastRatio0.getColor(1);
        java.awt.Color color17 = null;
        java.awt.Color color18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = colorContrastRatio0.getContrastRatio(color17, color18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        double double12 = colorContrastRatio0.getColor(100);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) 100);
        double double10 = colorContrastRatio0.getColor((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((int) '#');
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.016807375752887384d + "'", double10 == 0.016807375752887384d);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) '#');
        double double14 = colorContrastRatio0.getColor((int) '#');
        double double16 = colorContrastRatio0.getColor((int) (byte) 1);
        double double18 = colorContrastRatio0.getColor((int) (byte) -1);
        java.awt.Color color19 = null;
        java.awt.Color color20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = colorContrastRatio0.getContrastRatio(color19, color20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.016807375752887384d + "'", double12 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.016807375752887384d + "'", double14 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(1);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        double double14 = colorContrastRatio0.getColor((int) (short) 1);
        java.awt.Color color15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = colorContrastRatio0.getRelativeLuminance(color15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.035269835488375E-4d + "'", double14 == 3.035269835488375E-4d);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        double double12 = colorContrastRatio0.getColor(0);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(0);
        double double6 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11953842798834562d + "'", double12 == 0.11953842798834562d);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) 100);
        double double10 = colorContrastRatio0.getColor((int) (short) 0);
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) '4');
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        double double14 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color15 = null;
        java.awt.Color color16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = colorContrastRatio0.getContrastRatio(color15, color16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((-1));
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 10);
        double double12 = colorContrastRatio0.getColor((-1));
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) 100);
        double double10 = colorContrastRatio0.getColor((int) (short) 0);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) '4');
        double double10 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.03433980680868217d + "'", double10 == 0.03433980680868217d);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        double double14 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = colorContrastRatio0.getRelativeLuminance(color15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.11953842798834562d + "'", double14 == 0.11953842798834562d);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) '4');
        double double10 = colorContrastRatio0.getColor((int) '4');
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.03433980680868217d + "'", double10 == 0.03433980680868217d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        double double8 = colorContrastRatio0.getColor((int) 'a');
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.11953842798834562d + "'", double8 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11953842798834562d + "'", double12 == 0.11953842798834562d);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        java.awt.Color color15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = colorContrastRatio0.getRelativeLuminance(color15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(0);
        double double12 = colorContrastRatio0.getColor(0);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) ' ');
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014443843596092545d + "'", double2 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        double double12 = colorContrastRatio0.getColor((int) ' ');
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.014443843596092545d + "'", double12 == 0.014443843596092545d);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        double double14 = colorContrastRatio0.getColor((int) ' ');
        java.lang.Class<?> wildcardClass15 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.014443843596092545d + "'", double14 == 0.014443843596092545d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) 0);
        double double12 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11953842798834562d + "'", double12 == 0.11953842798834562d);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) -1);
        double double12 = colorContrastRatio0.getColor((int) '4');
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03433980680868217d + "'", double12 == 0.03433980680868217d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) ' ');
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.014443843596092545d + "'", double10 == 0.014443843596092545d);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        java.lang.Class<?> wildcardClass5 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        double double8 = colorContrastRatio0.getColor((int) 'a');
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.11953842798834562d + "'", double8 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) -1);
        double double12 = colorContrastRatio0.getColor((-1));
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) '4');
        double double14 = colorContrastRatio0.getColor((int) '4');
        double double16 = colorContrastRatio0.getColor((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03433980680868217d + "'", double12 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.03433980680868217d + "'", double14 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(1);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((-1));
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        double double12 = colorContrastRatio0.getColor((int) (byte) -1);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) '#');
        double double14 = colorContrastRatio0.getColor((int) '#');
        double double16 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = colorContrastRatio0.getRelativeLuminance(color17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.016807375752887384d + "'", double12 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.016807375752887384d + "'", double14 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) (byte) -1);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor(1);
        java.awt.Color color17 = null;
        java.awt.Color color18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = colorContrastRatio0.getContrastRatio(color17, color18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(10);
        double double12 = colorContrastRatio0.getColor((int) (short) 100);
        double double14 = colorContrastRatio0.getColor(0);
        double double16 = colorContrastRatio0.getColor((int) (short) 0);
        java.awt.Color color17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = colorContrastRatio0.getRelativeLuminance(color17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) (short) 0);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) '#');
        double double4 = colorContrastRatio0.getColor((-1));
        java.awt.Color color5 = null;
        java.awt.Color color6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = colorContrastRatio0.getContrastRatio(color5, color6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016807375752887384d + "'", double2 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((int) '#');
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.016807375752887384d + "'", double10 == 0.016807375752887384d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) ' ');
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(1);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014443843596092545d + "'", double2 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) (byte) 1);
        double double6 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.035269835488375E-4d + "'", double4 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(1);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (byte) 10);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) 0);
        double double4 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = colorContrastRatio0.getRelativeLuminance(color5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor(10);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) 0);
        double double4 = colorContrastRatio0.getColor((int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor(10);
        double double10 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.03433980680868217d + "'", double10 == 0.03433980680868217d);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 100);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        double double8 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        java.awt.Color color7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = colorContrastRatio0.getRelativeLuminance(color7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        double double14 = colorContrastRatio0.getColor((int) (byte) 0);
        double double16 = colorContrastRatio0.getColor((int) ' ');
        java.lang.Class<?> wildcardClass17 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.014443843596092545d + "'", double16 == 0.014443843596092545d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) 0);
        double double12 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11953842798834562d + "'", double12 == 0.11953842798834562d);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        double double12 = colorContrastRatio0.getColor((int) ' ');
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.014443843596092545d + "'", double12 == 0.014443843596092545d);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor(10);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 0);
        double double10 = colorContrastRatio0.getColor((int) (byte) 0);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor((int) '#');
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.016807375752887384d + "'", double10 == 0.016807375752887384d);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 1);
        double double14 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color15 = null;
        java.awt.Color color16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = colorContrastRatio0.getContrastRatio(color15, color16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) '#');
        double double14 = colorContrastRatio0.getColor((int) '#');
        double double16 = colorContrastRatio0.getColor((int) (byte) 1);
        double double18 = colorContrastRatio0.getColor((int) (byte) -1);
        double double20 = colorContrastRatio0.getColor(10);
        java.awt.Color color21 = null;
        java.awt.Color color22 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = colorContrastRatio0.getContrastRatio(color21, color22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.016807375752887384d + "'", double12 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.016807375752887384d + "'", double14 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.003035269835488375d + "'", double20 == 0.003035269835488375d);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        double double12 = colorContrastRatio0.getColor(0);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        double double8 = colorContrastRatio0.getColor((int) '4');
        double double10 = colorContrastRatio0.getColor((int) (short) 0);
        double double12 = colorContrastRatio0.getColor((int) '#');
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.016807375752887384d + "'", double12 == 0.016807375752887384d);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        java.awt.Color color9 = null;
        java.awt.Color color10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = colorContrastRatio0.getContrastRatio(color9, color10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (byte) -1);
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        double double14 = colorContrastRatio0.getColor((int) ' ');
        java.awt.Color color15 = null;
        java.awt.Color color16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = colorContrastRatio0.getContrastRatio(color15, color16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.014443843596092545d + "'", double14 == 0.014443843596092545d);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor(10);
        java.awt.Color color15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = colorContrastRatio0.getRelativeLuminance(color15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) (byte) -1);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor(1);
        java.awt.Color color17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = colorContrastRatio0.getRelativeLuminance(color17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        double double8 = colorContrastRatio0.getColor((int) '4');
        double double10 = colorContrastRatio0.getColor((int) (short) 0);
        double double12 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11953842798834562d + "'", double12 == 0.11953842798834562d);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color11 = null;
        java.awt.Color color12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = colorContrastRatio0.getContrastRatio(color11, color12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        double double14 = colorContrastRatio0.getColor(100);
        java.lang.Class<?> wildcardClass15 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        double double14 = colorContrastRatio0.getColor((int) (byte) -1);
        double double16 = colorContrastRatio0.getColor((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) 0);
        double double12 = colorContrastRatio0.getColor((int) 'a');
        double double14 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = colorContrastRatio0.getRelativeLuminance(color15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11953842798834562d + "'", double12 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) 100);
        double double10 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = colorContrastRatio0.getRelativeLuminance(color11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor(10);
        double double12 = colorContrastRatio0.getColor((-1));
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        double double12 = colorContrastRatio0.getColor((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        double double8 = colorContrastRatio0.getColor((int) 'a');
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color13 = null;
        java.awt.Color color14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = colorContrastRatio0.getContrastRatio(color13, color14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.11953842798834562d + "'", double8 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11953842798834562d + "'", double12 == 0.11953842798834562d);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(10);
        double double12 = colorContrastRatio0.getColor((int) (short) 100);
        double double14 = colorContrastRatio0.getColor(0);
        double double16 = colorContrastRatio0.getColor((int) (short) 0);
        double double18 = colorContrastRatio0.getColor((int) (short) -1);
        double double20 = colorContrastRatio0.getColor((int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.003035269835488375d + "'", double20 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) ' ');
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        java.awt.Color color7 = null;
        java.awt.Color color8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = colorContrastRatio0.getContrastRatio(color7, color8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014443843596092545d + "'", double2 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) '#');
        double double14 = colorContrastRatio0.getColor((int) '#');
        double double16 = colorContrastRatio0.getColor((int) (byte) 1);
        double double18 = colorContrastRatio0.getColor((int) (byte) -1);
        double double20 = colorContrastRatio0.getColor(10);
        java.lang.Class<?> wildcardClass21 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.016807375752887384d + "'", double12 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.016807375752887384d + "'", double14 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.003035269835488375d + "'", double20 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(0);
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        double double14 = colorContrastRatio0.getColor((int) (short) 10);
        java.awt.Color color15 = null;
        java.awt.Color color16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = colorContrastRatio0.getContrastRatio(color15, color16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor(10);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) -1);
        double double12 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = colorContrastRatio0.getRelativeLuminance(color13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03433980680868217d + "'", double12 == 0.03433980680868217d);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor((int) (byte) 1);
        double double18 = colorContrastRatio0.getColor((int) (byte) 1);
        double double20 = colorContrastRatio0.getColor((int) ' ');
        java.awt.Color color21 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = colorContrastRatio0.getRelativeLuminance(color21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.035269835488375E-4d + "'", double18 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.014443843596092545d + "'", double20 == 0.014443843596092545d);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) '4');
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03433980680868217d + "'", double12 == 0.03433980680868217d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

