package ColorContrastRatio;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test8001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8001");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        double double14 = colorContrastRatio0.getColor(1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.035269835488375E-4d + "'", double14 == 3.035269835488375E-4d);
    }

    @Test
    public void test8002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8002");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        double double12 = colorContrastRatio0.getColor((int) (byte) 10);
        double double14 = colorContrastRatio0.getColor((int) ' ');
        double double16 = colorContrastRatio0.getColor((-1));
        double double18 = colorContrastRatio0.getColor((int) ' ');
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.014443843596092545d + "'", double14 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.014443843596092545d + "'", double18 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.003035269835488375d + "'", double20 == 0.003035269835488375d);
    }

    @Test
    public void test8003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8003");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor((int) (short) 0);
        double double16 = colorContrastRatio0.getColor((int) (short) 1);
        double double18 = colorContrastRatio0.getColor((int) (short) 1);
        double double20 = colorContrastRatio0.getColor(0);
        java.awt.Color color21 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = colorContrastRatio0.getRelativeLuminance(color21);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.035269835488375E-4d + "'", double18 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test8004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8004");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor((int) (byte) 0);
        double double16 = colorContrastRatio0.getColor(1);
        double double18 = colorContrastRatio0.getColor((int) (short) 100);
        java.awt.Color color19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = colorContrastRatio0.getRelativeLuminance(color19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.12743768043564743d + "'", double18 == 0.12743768043564743d);
    }

    @Test
    public void test8005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8005");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8006");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((-1));
        double double8 = colorContrastRatio0.getColor((int) '#');
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.016807375752887384d + "'", double8 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
    }

    @Test
    public void test8007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8007");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) (byte) 1);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.035269835488375E-4d + "'", double4 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
    }

    @Test
    public void test8008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8008");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 0);
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        double double12 = colorContrastRatio0.getColor((int) '4');
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor(0);
        double double18 = colorContrastRatio0.getColor((int) (short) 100);
        java.lang.Class<?> wildcardClass19 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03433980680868217d + "'", double12 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.12743768043564743d + "'", double18 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8009");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) (short) 0);
        double double12 = colorContrastRatio0.getColor((int) '4');
        double double14 = colorContrastRatio0.getColor((int) (byte) -1);
        double double16 = colorContrastRatio0.getColor((int) (short) 100);
        double double18 = colorContrastRatio0.getColor(100);
        double double20 = colorContrastRatio0.getColor((int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03433980680868217d + "'", double12 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.12743768043564743d + "'", double16 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.12743768043564743d + "'", double18 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.035269835488375E-4d) + "'", double20 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8010");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor(100);
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        double double14 = colorContrastRatio0.getColor((int) (byte) 0);
        double double16 = colorContrastRatio0.getColor((int) (byte) 10);
        double double18 = colorContrastRatio0.getColor((int) (byte) 10);
        double double20 = colorContrastRatio0.getColor((int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.003035269835488375d + "'", double16 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.003035269835488375d + "'", double18 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.12743768043564743d + "'", double20 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8011");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (byte) 10);
        double double14 = colorContrastRatio0.getColor(100);
        double double16 = colorContrastRatio0.getColor((int) (byte) 100);
        double double18 = colorContrastRatio0.getColor((int) (byte) 10);
        double double20 = colorContrastRatio0.getColor((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.12743768043564743d + "'", double16 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.003035269835488375d + "'", double18 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.12743768043564743d + "'", double20 == 0.12743768043564743d);
    }

    @Test
    public void test8012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8012");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 0);
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        double double14 = colorContrastRatio0.getColor(1);
        double double16 = colorContrastRatio0.getColor((int) (byte) 1);
        double double18 = colorContrastRatio0.getColor((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.035269835488375E-4d + "'", double14 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8013");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor((int) (short) 1);
        double double16 = colorContrastRatio0.getColor((int) (byte) 1);
        double double18 = colorContrastRatio0.getColor((int) '#');
        double double20 = colorContrastRatio0.getColor((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.035269835488375E-4d + "'", double14 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.016807375752887384d + "'", double18 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test8014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8014");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
    }

    @Test
    public void test8015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8015");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8016");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) 100);
        double double10 = colorContrastRatio0.getColor((int) (byte) 10);
        double double12 = colorContrastRatio0.getColor((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
    }

    @Test
    public void test8017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8017");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) -1);
        double double12 = colorContrastRatio0.getColor((-1));
        double double14 = colorContrastRatio0.getColor((int) ' ');
        double double16 = colorContrastRatio0.getColor((int) (short) -1);
        double double18 = colorContrastRatio0.getColor(1);
        double double20 = colorContrastRatio0.getColor(100);
        double double22 = colorContrastRatio0.getColor((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.014443843596092545d + "'", double14 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.035269835488375E-4d + "'", double18 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.12743768043564743d + "'", double20 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.12743768043564743d + "'", double22 == 0.12743768043564743d);
    }

    @Test
    public void test8018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8018");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 100);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) ' ');
        double double12 = colorContrastRatio0.getColor((int) (byte) 100);
        double double14 = colorContrastRatio0.getColor((int) (byte) 100);
        double double16 = colorContrastRatio0.getColor((int) (byte) -1);
        double double18 = colorContrastRatio0.getColor((int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.014443843596092545d + "'", double10 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.014443843596092545d + "'", double18 == 0.014443843596092545d);
    }

    @Test
    public void test8019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8019");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) (byte) -1);
        double double6 = colorContrastRatio0.getColor(1);
        double double8 = colorContrastRatio0.getColor(1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test8020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8020");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor(10);
        double double10 = colorContrastRatio0.getColor((int) '4');
        double double12 = colorContrastRatio0.getColor((int) (byte) -1);
        double double14 = colorContrastRatio0.getColor((int) 'a');
        double double16 = colorContrastRatio0.getColor((-1));
        double double18 = colorContrastRatio0.getColor((int) (byte) 0);
        java.awt.Color color19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = colorContrastRatio0.getRelativeLuminance(color19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.03433980680868217d + "'", double10 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.11953842798834562d + "'", double14 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test8021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8021");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8022");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((-1));
        double double8 = colorContrastRatio0.getColor((-1));
        java.lang.Class<?> wildcardClass9 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test8023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8023");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 100);
        double double14 = colorContrastRatio0.getColor((int) '#');
        double double16 = colorContrastRatio0.getColor(0);
        double double18 = colorContrastRatio0.getColor((int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.016807375752887384d + "'", double14 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.016807375752887384d + "'", double18 == 0.016807375752887384d);
    }

    @Test
    public void test8024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8024");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) (byte) -1);
        double double6 = colorContrastRatio0.getColor(1);
        double double8 = colorContrastRatio0.getColor(1);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        double double14 = colorContrastRatio0.getColor((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8025");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(0);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor((int) 'a');
        double double16 = colorContrastRatio0.getColor(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.11953842798834562d + "'", double14 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test8026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8026");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((-1));
        double double14 = colorContrastRatio0.getColor(100);
        double double16 = colorContrastRatio0.getColor((int) '#');
        double double18 = colorContrastRatio0.getColor(100);
        double double20 = colorContrastRatio0.getColor(0);
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.016807375752887384d + "'", double16 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.12743768043564743d + "'", double18 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test8027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8027");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor((int) (short) -1);
        double double18 = colorContrastRatio0.getColor((int) (short) 1);
        java.awt.Color color19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = colorContrastRatio0.getRelativeLuminance(color19);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.035269835488375E-4d + "'", double18 == 3.035269835488375E-4d);
    }

    @Test
    public void test8028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8028");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (byte) 10);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8029");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor(10);
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
    }

    @Test
    public void test8030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8030");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor((int) (short) 0);
        double double16 = colorContrastRatio0.getColor(1);
        double double18 = colorContrastRatio0.getColor((int) (byte) 100);
        double double20 = colorContrastRatio0.getColor((int) (short) 0);
        java.awt.Color color21 = null;
        java.awt.Color color22 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = colorContrastRatio0.getContrastRatio(color21, color22);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.12743768043564743d + "'", double18 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test8031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8031");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        double double8 = colorContrastRatio0.getColor((int) '4');
        double double10 = colorContrastRatio0.getColor((int) (short) 0);
        double double12 = colorContrastRatio0.getColor((int) 'a');
        double double14 = colorContrastRatio0.getColor((int) 'a');
        double double16 = colorContrastRatio0.getColor(1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11953842798834562d + "'", double12 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.11953842798834562d + "'", double14 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
    }

    @Test
    public void test8032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8032");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) '#');
        double double14 = colorContrastRatio0.getColor((int) 'a');
        double double16 = colorContrastRatio0.getColor((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.11953842798834562d + "'", double14 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.003035269835488375d + "'", double16 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8033");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        double double14 = colorContrastRatio0.getColor((int) (short) -1);
        double double16 = colorContrastRatio0.getColor(1);
        double double18 = colorContrastRatio0.getColor((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.003035269835488375d + "'", double18 == 0.003035269835488375d);
    }

    @Test
    public void test8034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8034");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) (byte) -1);
        double double14 = colorContrastRatio0.getColor((int) '4');
        double double16 = colorContrastRatio0.getColor((-1));
        double double18 = colorContrastRatio0.getColor((int) '#');
        double double20 = colorContrastRatio0.getColor((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.03433980680868217d + "'", double14 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.016807375752887384d + "'", double18 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.035269835488375E-4d + "'", double20 == 3.035269835488375E-4d);
    }

    @Test
    public void test8035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8035");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor(10);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        double double14 = colorContrastRatio0.getColor((int) (byte) 10);
        double double16 = colorContrastRatio0.getColor((-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8036");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        double double14 = colorContrastRatio0.getColor(100);
        double double16 = colorContrastRatio0.getColor(1);
        double double18 = colorContrastRatio0.getColor((int) '#');
        double double20 = colorContrastRatio0.getColor((int) (byte) -1);
        double double22 = colorContrastRatio0.getColor((-1));
        double double24 = colorContrastRatio0.getColor(10);
        double double26 = colorContrastRatio0.getColor((int) ' ');
        double double28 = colorContrastRatio0.getColor((int) 'a');
        java.lang.Class<?> wildcardClass29 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.016807375752887384d + "'", double18 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.035269835488375E-4d) + "'", double20 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-3.035269835488375E-4d) + "'", double22 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.003035269835488375d + "'", double24 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.014443843596092545d + "'", double26 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.11953842798834562d + "'", double28 == 0.11953842798834562d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test8037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8037");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) (byte) -1);
        double double14 = colorContrastRatio0.getColor((int) '4');
        double double16 = colorContrastRatio0.getColor((-1));
        double double18 = colorContrastRatio0.getColor((int) ' ');
        double double20 = colorContrastRatio0.getColor((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.03433980680868217d + "'", double14 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.014443843596092545d + "'", double18 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8038");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        double double12 = colorContrastRatio0.getColor((int) (short) 100);
        double double14 = colorContrastRatio0.getColor(0);
        double double16 = colorContrastRatio0.getColor((int) (byte) 0);
        double double18 = colorContrastRatio0.getColor((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.003035269835488375d + "'", double18 == 0.003035269835488375d);
    }

    @Test
    public void test8039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8039");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor((int) (byte) 1);
        double double18 = colorContrastRatio0.getColor((int) (short) 1);
        double double20 = colorContrastRatio0.getColor(10);
        double double22 = colorContrastRatio0.getColor((int) 'a');
        double double24 = colorContrastRatio0.getColor((int) (byte) 10);
        double double26 = colorContrastRatio0.getColor((int) (byte) 1);
        double double28 = colorContrastRatio0.getColor((int) (short) -1);
        double double30 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass31 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.035269835488375E-4d + "'", double18 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.003035269835488375d + "'", double20 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.11953842798834562d + "'", double22 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.003035269835488375d + "'", double24 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 3.035269835488375E-4d + "'", double26 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-3.035269835488375E-4d) + "'", double28 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test8040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8040");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor((int) (byte) 1);
        double double18 = colorContrastRatio0.getColor((int) (short) 1);
        double double20 = colorContrastRatio0.getColor(10);
        double double22 = colorContrastRatio0.getColor((int) 'a');
        double double24 = colorContrastRatio0.getColor((int) (byte) 100);
        double double26 = colorContrastRatio0.getColor((-1));
        double double28 = colorContrastRatio0.getColor((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.035269835488375E-4d + "'", double18 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.003035269835488375d + "'", double20 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.11953842798834562d + "'", double22 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.12743768043564743d + "'", double24 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-3.035269835488375E-4d) + "'", double26 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test8041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8041");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) 0);
        double double10 = colorContrastRatio0.getColor((int) ' ');
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        double double14 = colorContrastRatio0.getColor((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.014443843596092545d + "'", double10 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test8042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8042");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((int) '#');
        double double12 = colorContrastRatio0.getColor((int) (byte) 1);
        double double14 = colorContrastRatio0.getColor((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.016807375752887384d + "'", double10 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8043");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) 'a');
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor((int) (byte) 10);
        double double18 = colorContrastRatio0.getColor(100);
        double double20 = colorContrastRatio0.getColor((int) '4');
        double double22 = colorContrastRatio0.getColor((int) (short) 1);
        java.lang.Class<?> wildcardClass23 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11953842798834562d + "'", double12 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.003035269835488375d + "'", double16 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.12743768043564743d + "'", double18 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.03433980680868217d + "'", double20 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.035269835488375E-4d + "'", double22 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8044");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
    }

    @Test
    public void test8045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8045");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor((int) '#');
        double double12 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass13 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.016807375752887384d + "'", double10 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test8046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8046");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) 'a');
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.016807375752887384d + "'", double6 == 0.016807375752887384d);
    }

    @Test
    public void test8047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8047");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((-1));
        double double14 = colorContrastRatio0.getColor(100);
        double double16 = colorContrastRatio0.getColor((int) '#');
        double double18 = colorContrastRatio0.getColor((int) (short) 1);
        double double20 = colorContrastRatio0.getColor((int) (short) 10);
        double double22 = colorContrastRatio0.getColor(0);
        java.lang.Class<?> wildcardClass23 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.016807375752887384d + "'", double16 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.035269835488375E-4d + "'", double18 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.003035269835488375d + "'", double20 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8048");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) '4');
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor(1);
        double double14 = colorContrastRatio0.getColor(0);
        double double16 = colorContrastRatio0.getColor((-1));
        double double18 = colorContrastRatio0.getColor((int) 'a');
        double double20 = colorContrastRatio0.getColor(1);
        double double22 = colorContrastRatio0.getColor((int) (byte) -1);
        double double24 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color25 = null;
        java.awt.Color color26 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double27 = colorContrastRatio0.getContrastRatio(color25, color26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.11953842798834562d + "'", double18 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.035269835488375E-4d + "'", double20 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-3.035269835488375E-4d) + "'", double22 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-3.035269835488375E-4d) + "'", double24 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8049");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor(10);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        double double14 = colorContrastRatio0.getColor((int) (byte) 1);
        double double16 = colorContrastRatio0.getColor((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.035269835488375E-4d + "'", double14 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.12743768043564743d + "'", double16 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8050");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 100);
        double double6 = colorContrastRatio0.getColor((int) ' ');
        double double8 = colorContrastRatio0.getColor(1);
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        double double12 = colorContrastRatio0.getColor((-1));
        double double14 = colorContrastRatio0.getColor(1);
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.014443843596092545d + "'", double6 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.035269835488375E-4d + "'", double14 == 3.035269835488375E-4d);
    }

    @Test
    public void test8051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8051");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        double double8 = colorContrastRatio0.getColor((int) 'a');
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        double double14 = colorContrastRatio0.getColor((int) (short) 10);
        double double16 = colorContrastRatio0.getColor(100);
        double double18 = colorContrastRatio0.getColor((int) '4');
        double double20 = colorContrastRatio0.getColor((int) (short) 10);
        double double22 = colorContrastRatio0.getColor(1);
        java.awt.Color color23 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = colorContrastRatio0.getRelativeLuminance(color23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.11953842798834562d + "'", double8 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.12743768043564743d + "'", double16 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.03433980680868217d + "'", double18 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.003035269835488375d + "'", double20 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.035269835488375E-4d + "'", double22 == 3.035269835488375E-4d);
    }

    @Test
    public void test8052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8052");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        double double14 = colorContrastRatio0.getColor((int) 'a');
        double double16 = colorContrastRatio0.getColor((int) (byte) -1);
        double double18 = colorContrastRatio0.getColor((int) (byte) 1);
        double double20 = colorContrastRatio0.getColor(100);
        java.awt.Color color21 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = colorContrastRatio0.getRelativeLuminance(color21);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.035269835488375E-4d + "'", double18 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.12743768043564743d + "'", double20 == 0.12743768043564743d);
    }

    @Test
    public void test8053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8053");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor((int) (byte) 0);
        double double16 = colorContrastRatio0.getColor(10);
        double double18 = colorContrastRatio0.getColor(1);
        double double20 = colorContrastRatio0.getColor((int) '4');
        double double22 = colorContrastRatio0.getColor((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.003035269835488375d + "'", double16 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.035269835488375E-4d + "'", double18 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.03433980680868217d + "'", double20 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.035269835488375E-4d + "'", double22 == 3.035269835488375E-4d);
    }

    @Test
    public void test8054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8054");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor(10);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        double double14 = colorContrastRatio0.getColor((int) (short) 1);
        double double16 = colorContrastRatio0.getColor((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.035269835488375E-4d + "'", double14 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.003035269835488375d + "'", double16 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8055");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 100);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) ' ');
        double double12 = colorContrastRatio0.getColor((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.014443843596092545d + "'", double10 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
    }

    @Test
    public void test8056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8056");
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
        double double22 = colorContrastRatio0.getColor((int) '#');
        double double24 = colorContrastRatio0.getColor(10);
        double double26 = colorContrastRatio0.getColor(0);
        double double28 = colorContrastRatio0.getColor((int) 'a');
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.016807375752887384d + "'", double22 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.003035269835488375d + "'", double24 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.11953842798834562d + "'", double28 == 0.11953842798834562d);
    }

    @Test
    public void test8057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8057");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) (byte) 1);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        double double8 = colorContrastRatio0.getColor(100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.035269835488375E-4d + "'", double4 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
    }

    @Test
    public void test8058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8058");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((-1));
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test8059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8059");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) '4');
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor(1);
        double double14 = colorContrastRatio0.getColor(0);
        double double16 = colorContrastRatio0.getColor(0);
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test8060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8060");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor(0);
        double double18 = colorContrastRatio0.getColor((int) (short) -1);
        double double20 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color21 = null;
        java.awt.Color color22 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = colorContrastRatio0.getContrastRatio(color21, color22);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.035269835488375E-4d) + "'", double20 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8061");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) (byte) 1);
        double double6 = colorContrastRatio0.getColor((int) (byte) 0);
        double double8 = colorContrastRatio0.getColor((int) ' ');
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.035269835488375E-4d + "'", double4 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
    }

    @Test
    public void test8062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8062");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor((-1));
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test8063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8063");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor(0);
        double double12 = colorContrastRatio0.getColor((int) (byte) -1);
        double double14 = colorContrastRatio0.getColor((int) 'a');
        double double16 = colorContrastRatio0.getColor(100);
        double double18 = colorContrastRatio0.getColor((int) '4');
        java.lang.Class<?> wildcardClass19 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.11953842798834562d + "'", double14 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.12743768043564743d + "'", double16 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.03433980680868217d + "'", double18 == 0.03433980680868217d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8064");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((-1));
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor((int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.016807375752887384d + "'", double10 == 0.016807375752887384d);
    }

    @Test
    public void test8065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8065");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor((int) '4');
        double double12 = colorContrastRatio0.getColor((int) (short) -1);
        double double14 = colorContrastRatio0.getColor((int) (byte) 100);
        double double16 = colorContrastRatio0.getColor((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.03433980680868217d + "'", double10 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8066");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 100);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) ' ');
        double double12 = colorContrastRatio0.getColor(10);
        double double14 = colorContrastRatio0.getColor(0);
        double double16 = colorContrastRatio0.getColor((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.014443843596092545d + "'", double10 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.003035269835488375d + "'", double16 == 0.003035269835488375d);
    }

    @Test
    public void test8067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8067");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(10);
        double double12 = colorContrastRatio0.getColor((int) (short) 100);
        double double14 = colorContrastRatio0.getColor(100);
        double double16 = colorContrastRatio0.getColor((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.12743768043564743d + "'", double16 == 0.12743768043564743d);
    }

    @Test
    public void test8068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8068");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) 0);
        double double4 = colorContrastRatio0.getColor((int) (byte) 0);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (byte) 0);
        double double10 = colorContrastRatio0.getColor(1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
    }

    @Test
    public void test8069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8069");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(100);
        double double8 = colorContrastRatio0.getColor((int) 'a');
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        double double14 = colorContrastRatio0.getColor((int) (short) 10);
        double double16 = colorContrastRatio0.getColor(100);
        double double18 = colorContrastRatio0.getColor((int) '4');
        double double20 = colorContrastRatio0.getColor((int) (short) 10);
        double double22 = colorContrastRatio0.getColor((int) 'a');
        java.lang.Class<?> wildcardClass23 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.11953842798834562d + "'", double8 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.12743768043564743d + "'", double16 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.03433980680868217d + "'", double18 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.003035269835488375d + "'", double20 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.11953842798834562d + "'", double22 == 0.11953842798834562d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8070");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) '4');
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor(1);
        double double14 = colorContrastRatio0.getColor(0);
        double double16 = colorContrastRatio0.getColor((-1));
        double double18 = colorContrastRatio0.getColor((int) (short) -1);
        double double20 = colorContrastRatio0.getColor(0);
        double double22 = colorContrastRatio0.getColor(10);
        java.awt.Color color23 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = colorContrastRatio0.getRelativeLuminance(color23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.003035269835488375d + "'", double22 == 0.003035269835488375d);
    }

    @Test
    public void test8071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8071");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        double double8 = colorContrastRatio0.getColor((int) 'a');
        double double10 = colorContrastRatio0.getColor((int) 'a');
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.11953842798834562d + "'", double8 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test8072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8072");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor(1);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
    }

    @Test
    public void test8073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8073");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) -1);
        double double12 = colorContrastRatio0.getColor((int) '4');
        double double14 = colorContrastRatio0.getColor((int) ' ');
        double double16 = colorContrastRatio0.getColor((int) (short) 0);
        double double18 = colorContrastRatio0.getColor(0);
        java.awt.Color color19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = colorContrastRatio0.getRelativeLuminance(color19);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.014443843596092545d + "'", double14 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test8074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8074");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor(10);
        double double16 = colorContrastRatio0.getColor((int) 'a');
        double double18 = colorContrastRatio0.getColor((int) (byte) -1);
        double double20 = colorContrastRatio0.getColor((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.11953842798834562d + "'", double16 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.12743768043564743d + "'", double20 == 0.12743768043564743d);
    }

    @Test
    public void test8075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8075");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (byte) -1);
        double double14 = colorContrastRatio0.getColor((int) (short) 10);
        double double16 = colorContrastRatio0.getColor((int) (short) 100);
        double double18 = colorContrastRatio0.getColor((int) ' ');
        double double20 = colorContrastRatio0.getColor((int) (byte) 1);
        double double22 = colorContrastRatio0.getColor(0);
        java.awt.Color color23 = null;
        java.awt.Color color24 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double25 = colorContrastRatio0.getContrastRatio(color23, color24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.12743768043564743d + "'", double16 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.014443843596092545d + "'", double18 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.035269835488375E-4d + "'", double20 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test8076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8076");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((int) (byte) 100);
        double double14 = colorContrastRatio0.getColor(100);
        double double16 = colorContrastRatio0.getColor((int) (short) 10);
        double double18 = colorContrastRatio0.getColor((int) (byte) 100);
        double double20 = colorContrastRatio0.getColor(0);
        double double22 = colorContrastRatio0.getColor(0);
        java.awt.Color color23 = null;
        java.awt.Color color24 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double25 = colorContrastRatio0.getContrastRatio(color23, color24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.003035269835488375d + "'", double16 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.12743768043564743d + "'", double18 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test8077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8077");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) '4');
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test8078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8078");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor(10);
        double double14 = colorContrastRatio0.getColor((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
    }

    @Test
    public void test8079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8079");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (short) 0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 10);
        double double14 = colorContrastRatio0.getColor((int) (short) 10);
        double double16 = colorContrastRatio0.getColor((int) '4');
        double double18 = colorContrastRatio0.getColor(1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.03433980680868217d + "'", double16 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.035269835488375E-4d + "'", double18 == 3.035269835488375E-4d);
    }

    @Test
    public void test8080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8080");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) 0);
        double double4 = colorContrastRatio0.getColor((int) (byte) 0);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (byte) 0);
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        double double12 = colorContrastRatio0.getColor((int) '4');
        double double14 = colorContrastRatio0.getColor((-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03433980680868217d + "'", double12 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8081");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor(100);
        double double16 = colorContrastRatio0.getColor((int) (byte) 10);
        double double18 = colorContrastRatio0.getColor((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.003035269835488375d + "'", double16 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.003035269835488375d + "'", double20 == 0.003035269835488375d);
    }

    @Test
    public void test8082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8082");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) '#');
        double double14 = colorContrastRatio0.getColor((int) '#');
        double double16 = colorContrastRatio0.getColor(1);
        double double18 = colorContrastRatio0.getColor((int) (short) 0);
        double double20 = colorContrastRatio0.getColor(1);
        double double22 = colorContrastRatio0.getColor((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.016807375752887384d + "'", double12 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.016807375752887384d + "'", double14 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.035269835488375E-4d + "'", double20 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.003035269835488375d + "'", double22 == 0.003035269835488375d);
    }

    @Test
    public void test8083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8083");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8084");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) -1);
        double double12 = colorContrastRatio0.getColor((int) 'a');
        double double14 = colorContrastRatio0.getColor(10);
        double double16 = colorContrastRatio0.getColor(1);
        double double18 = colorContrastRatio0.getColor((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11953842798834562d + "'", double12 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.035269835488375E-4d + "'", double18 == 3.035269835488375E-4d);
    }

    @Test
    public void test8085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8085");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) '4');
        double double14 = colorContrastRatio0.getColor((int) (short) -1);
        double double16 = colorContrastRatio0.getColor((int) (short) -1);
        double double18 = colorContrastRatio0.getColor((int) (short) 1);
        double double20 = colorContrastRatio0.getColor(1);
        java.awt.Color color21 = null;
        java.awt.Color color22 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = colorContrastRatio0.getContrastRatio(color21, color22);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.035269835488375E-4d + "'", double18 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.035269835488375E-4d + "'", double20 == 3.035269835488375E-4d);
    }

    @Test
    public void test8086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8086");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor(0);
        double double16 = colorContrastRatio0.getColor((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
    }

    @Test
    public void test8087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8087");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) '4');
        double double14 = colorContrastRatio0.getColor((int) '4');
        double double16 = colorContrastRatio0.getColor((int) (byte) -1);
        double double18 = colorContrastRatio0.getColor(10);
        java.awt.Color color19 = null;
        java.awt.Color color20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = colorContrastRatio0.getContrastRatio(color19, color20);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.003035269835488375d + "'", double18 == 0.003035269835488375d);
    }

    @Test
    public void test8088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8088");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) 100);
        double double10 = colorContrastRatio0.getColor((int) '#');
        double double12 = colorContrastRatio0.getColor(1);
        double double14 = colorContrastRatio0.getColor((int) '#');
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.016807375752887384d + "'", double10 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.016807375752887384d + "'", double14 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.014443843596092545d + "'", double16 == 0.014443843596092545d);
    }

    @Test
    public void test8089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8089");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) (byte) -1);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor(1);
        double double18 = colorContrastRatio0.getColor((int) (byte) -1);
        double double20 = colorContrastRatio0.getColor((int) 'a');
        java.lang.Class<?> wildcardClass21 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.11953842798834562d + "'", double20 == 0.11953842798834562d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8090");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) '4');
        double double14 = colorContrastRatio0.getColor((int) '4');
        double double16 = colorContrastRatio0.getColor(10);
        double double18 = colorContrastRatio0.getColor((-1));
        double double20 = colorContrastRatio0.getColor((int) (short) 100);
        double double22 = colorContrastRatio0.getColor((int) '#');
        java.awt.Color color23 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = colorContrastRatio0.getRelativeLuminance(color23);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.003035269835488375d + "'", double16 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.12743768043564743d + "'", double20 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.016807375752887384d + "'", double22 == 0.016807375752887384d);
    }

    @Test
    public void test8091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8091");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 10);
        double double12 = colorContrastRatio0.getColor((int) ' ');
        double double14 = colorContrastRatio0.getColor((int) (byte) 100);
        double double16 = colorContrastRatio0.getColor((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.014443843596092545d + "'", double12 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8092");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor(100);
        double double16 = colorContrastRatio0.getColor((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.003035269835488375d + "'", double16 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.035269835488375E-4d + "'", double18 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.014443843596092545d + "'", double20 == 0.014443843596092545d);
    }

    @Test
    public void test8093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8093");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor(0);
        double double16 = colorContrastRatio0.getColor(1);
        java.lang.Class<?> wildcardClass17 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8094");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) ' ');
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(1);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014443843596092545d + "'", double2 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test8095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8095");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        double double14 = colorContrastRatio0.getColor((int) 'a');
        double double16 = colorContrastRatio0.getColor((int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.11953842798834562d + "'", double14 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.016807375752887384d + "'", double16 == 0.016807375752887384d);
    }

    @Test
    public void test8096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8096");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) 0);
        double double4 = colorContrastRatio0.getColor((int) (byte) 0);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        double double8 = colorContrastRatio0.getColor((int) '#');
        double double10 = colorContrastRatio0.getColor(10);
        double double12 = colorContrastRatio0.getColor((int) 'a');
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.016807375752887384d + "'", double8 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11953842798834562d + "'", double12 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
    }

    @Test
    public void test8097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8097");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor((int) (short) 1);
        double double16 = colorContrastRatio0.getColor((int) 'a');
        double double18 = colorContrastRatio0.getColor((int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.035269835488375E-4d + "'", double14 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.11953842798834562d + "'", double16 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.11953842798834562d + "'", double18 == 0.11953842798834562d);
    }

    @Test
    public void test8098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8098");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor((int) '4');
        double double16 = colorContrastRatio0.getColor((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.03433980680868217d + "'", double14 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test8099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8099");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor(100);
        double double16 = colorContrastRatio0.getColor((-1));
        double double18 = colorContrastRatio0.getColor((int) (short) 1);
        double double20 = colorContrastRatio0.getColor((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.035269835488375E-4d + "'", double18 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.035269835488375E-4d) + "'", double20 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8100");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        double double12 = colorContrastRatio0.getColor((int) (short) 100);
        double double14 = colorContrastRatio0.getColor((int) (short) 0);
        double double16 = colorContrastRatio0.getColor(0);
        double double18 = colorContrastRatio0.getColor((int) (short) 0);
        double double20 = colorContrastRatio0.getColor((int) '#');
        double double22 = colorContrastRatio0.getColor((int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.016807375752887384d + "'", double20 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.035269835488375E-4d + "'", double22 == 3.035269835488375E-4d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8101");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        double double14 = colorContrastRatio0.getColor((int) (short) -1);
        double double16 = colorContrastRatio0.getColor((int) (short) -1);
        double double18 = colorContrastRatio0.getColor((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8102");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (byte) 10);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) 'a');
        double double14 = colorContrastRatio0.getColor((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11953842798834562d + "'", double12 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
    }

    @Test
    public void test8103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8103");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) (byte) -1);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor(10);
        double double18 = colorContrastRatio0.getColor((int) (short) 100);
        double double20 = colorContrastRatio0.getColor((int) '4');
        double double22 = colorContrastRatio0.getColor(0);
        java.awt.Color color23 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = colorContrastRatio0.getRelativeLuminance(color23);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.003035269835488375d + "'", double16 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.12743768043564743d + "'", double18 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.03433980680868217d + "'", double20 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test8104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8104");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        double double14 = colorContrastRatio0.getColor((int) (byte) 10);
        double double16 = colorContrastRatio0.getColor((int) '#');
        double double18 = colorContrastRatio0.getColor((int) (short) 100);
        double double20 = colorContrastRatio0.getColor((int) '4');
        double double22 = colorContrastRatio0.getColor((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.016807375752887384d + "'", double16 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.12743768043564743d + "'", double18 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.03433980680868217d + "'", double20 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-3.035269835488375E-4d) + "'", double22 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8105");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) '4');
        double double14 = colorContrastRatio0.getColor((int) '4');
        double double16 = colorContrastRatio0.getColor((int) (short) 100);
        double double18 = colorContrastRatio0.getColor(0);
        double double20 = colorContrastRatio0.getColor((int) (byte) 100);
        double double22 = colorContrastRatio0.getColor((int) (short) 1);
        double double24 = colorContrastRatio0.getColor((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03433980680868217d + "'", double12 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.03433980680868217d + "'", double14 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.12743768043564743d + "'", double16 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.12743768043564743d + "'", double20 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.035269835488375E-4d + "'", double22 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.12743768043564743d + "'", double24 == 0.12743768043564743d);
    }

    @Test
    public void test8106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8106");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        double double12 = colorContrastRatio0.getColor((int) (short) 100);
        double double14 = colorContrastRatio0.getColor((int) (short) 0);
        double double16 = colorContrastRatio0.getColor((int) (short) 10);
        double double18 = colorContrastRatio0.getColor((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.003035269835488375d + "'", double16 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.003035269835488375d + "'", double18 == 0.003035269835488375d);
    }

    @Test
    public void test8107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8107");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        double double14 = colorContrastRatio0.getColor((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8108");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor(100);
        double double18 = colorContrastRatio0.getColor(0);
        java.awt.Color color19 = null;
        java.awt.Color color20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = colorContrastRatio0.getContrastRatio(color19, color20);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.12743768043564743d + "'", double16 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test8109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8109");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor((int) (short) 1);
        double double16 = colorContrastRatio0.getColor((int) (byte) -1);
        double double18 = colorContrastRatio0.getColor(0);
        double double20 = colorContrastRatio0.getColor(0);
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.035269835488375E-4d + "'", double14 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test8110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8110");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) '#');
        double double12 = colorContrastRatio0.getColor((int) (byte) 1);
        double double14 = colorContrastRatio0.getColor((int) 'a');
        double double16 = colorContrastRatio0.getColor((int) (byte) -1);
        double double18 = colorContrastRatio0.getColor((-1));
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.016807375752887384d + "'", double10 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.11953842798834562d + "'", double14 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8111");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor((-1));
        double double14 = colorContrastRatio0.getColor(0);
        double double16 = colorContrastRatio0.getColor(100);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.12743768043564743d + "'", double16 == 0.12743768043564743d);
    }

    @Test
    public void test8112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8112");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor((int) (short) 1);
        double double16 = colorContrastRatio0.getColor((int) (byte) 1);
        double double18 = colorContrastRatio0.getColor((int) (short) 0);
        double double20 = colorContrastRatio0.getColor(0);
        double double22 = colorContrastRatio0.getColor((int) (short) 100);
        java.lang.Class<?> wildcardClass23 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.035269835488375E-4d + "'", double14 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.12743768043564743d + "'", double22 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8113");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) (byte) 1);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.035269835488375E-4d + "'", double4 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
    }

    @Test
    public void test8114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8114");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((int) (byte) 1);
        double double12 = colorContrastRatio0.getColor((int) (short) 0);
        double double14 = colorContrastRatio0.getColor((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8115");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        double double14 = colorContrastRatio0.getColor(100);
        double double16 = colorContrastRatio0.getColor(1);
        double double18 = colorContrastRatio0.getColor((int) '#');
        double double20 = colorContrastRatio0.getColor((int) (byte) -1);
        double double22 = colorContrastRatio0.getColor((-1));
        double double24 = colorContrastRatio0.getColor((int) '#');
        java.lang.Class<?> wildcardClass25 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.016807375752887384d + "'", double18 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.035269835488375E-4d) + "'", double20 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-3.035269835488375E-4d) + "'", double22 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.016807375752887384d + "'", double24 == 0.016807375752887384d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test8116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8116");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor(10);
        double double16 = colorContrastRatio0.getColor(10);
        double double18 = colorContrastRatio0.getColor(1);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.003035269835488375d + "'", double16 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.035269835488375E-4d + "'", double18 == 3.035269835488375E-4d);
    }

    @Test
    public void test8117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8117");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) (byte) 1);
        double double6 = colorContrastRatio0.getColor((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.035269835488375E-4d + "'", double4 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
    }

    @Test
    public void test8118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8118");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor((int) (byte) 1);
        double double18 = colorContrastRatio0.getColor((int) (short) 1);
        double double20 = colorContrastRatio0.getColor(10);
        double double22 = colorContrastRatio0.getColor((int) 'a');
        double double24 = colorContrastRatio0.getColor((int) '4');
        java.awt.Color color25 = null;
        java.awt.Color color26 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double27 = colorContrastRatio0.getContrastRatio(color25, color26);
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.003035269835488375d + "'", double20 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.11953842798834562d + "'", double22 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.03433980680868217d + "'", double24 == 0.03433980680868217d);
    }

    @Test
    public void test8119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8119");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (short) 10);
        double double12 = colorContrastRatio0.getColor((int) (byte) 0);
        double double14 = colorContrastRatio0.getColor((int) 'a');
        double double16 = colorContrastRatio0.getColor((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.11953842798834562d + "'", double14 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test8120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8120");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) ' ');
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014443843596092545d + "'", double2 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8121");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) '#');
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        double double14 = colorContrastRatio0.getColor((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.016807375752887384d + "'", double6 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8122");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor((int) '4');
        double double14 = colorContrastRatio0.getColor((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03433980680868217d + "'", double12 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8123");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor(0);
        double double12 = colorContrastRatio0.getColor((int) (byte) -1);
        double double14 = colorContrastRatio0.getColor((int) 'a');
        java.awt.Color color15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = colorContrastRatio0.getRelativeLuminance(color15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.11953842798834562d + "'", double14 == 0.11953842798834562d);
    }

    @Test
    public void test8124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8124");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor((int) (byte) 10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.003035269835488375d + "'", double8 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
    }

    @Test
    public void test8125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8125");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) (short) 0);
        double double12 = colorContrastRatio0.getColor((int) '4');
        double double14 = colorContrastRatio0.getColor((int) '#');
        double double16 = colorContrastRatio0.getColor(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03433980680868217d + "'", double12 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.016807375752887384d + "'", double14 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test8126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8126");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(0);
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        double double14 = colorContrastRatio0.getColor((int) (short) 10);
        double double16 = colorContrastRatio0.getColor((int) (byte) 0);
        double double18 = colorContrastRatio0.getColor((int) (byte) 0);
        double double20 = colorContrastRatio0.getColor((int) '#');
        double double22 = colorContrastRatio0.getColor(100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.016807375752887384d + "'", double20 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.12743768043564743d + "'", double22 == 0.12743768043564743d);
    }

    @Test
    public void test8127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8127");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) '#');
        double double14 = colorContrastRatio0.getColor((int) 'a');
        double double16 = colorContrastRatio0.getColor(10);
        double double18 = colorContrastRatio0.getColor(0);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.11953842798834562d + "'", double14 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.003035269835488375d + "'", double16 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test8128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8128");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor(1);
        double double12 = colorContrastRatio0.getColor((int) 'a');
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor((int) (short) 10);
        double double18 = colorContrastRatio0.getColor((-1));
        java.lang.Class<?> wildcardClass19 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11953842798834562d + "'", double12 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.003035269835488375d + "'", double16 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8129");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor(10);
        double double12 = colorContrastRatio0.getColor((int) (short) 100);
        double double14 = colorContrastRatio0.getColor(0);
        double double16 = colorContrastRatio0.getColor(0);
        double double18 = colorContrastRatio0.getColor(10);
        double double20 = colorContrastRatio0.getColor((int) '#');
        double double22 = colorContrastRatio0.getColor((int) (byte) 10);
        double double24 = colorContrastRatio0.getColor((-1));
        java.awt.Color color25 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double26 = colorContrastRatio0.getRelativeLuminance(color25);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.003035269835488375d + "'", double18 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.016807375752887384d + "'", double20 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.003035269835488375d + "'", double22 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-3.035269835488375E-4d) + "'", double24 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8130");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) '#');
        double double14 = colorContrastRatio0.getColor((int) '#');
        double double16 = colorContrastRatio0.getColor((int) (byte) 1);
        double double18 = colorContrastRatio0.getColor(0);
        double double20 = colorContrastRatio0.getColor((int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.016807375752887384d + "'", double12 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.016807375752887384d + "'", double14 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.12743768043564743d + "'", double20 == 0.12743768043564743d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8131");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor((int) (byte) 0);
        double double16 = colorContrastRatio0.getColor((-1));
        java.lang.Class<?> wildcardClass17 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8132");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor((int) (byte) 1);
        double double18 = colorContrastRatio0.getColor((int) (short) 1);
        double double20 = colorContrastRatio0.getColor(10);
        double double22 = colorContrastRatio0.getColor((int) 'a');
        double double24 = colorContrastRatio0.getColor((int) (byte) 100);
        double double26 = colorContrastRatio0.getColor((int) (short) 10);
        double double28 = colorContrastRatio0.getColor((int) (short) 0);
        double double30 = colorContrastRatio0.getColor(0);
        java.awt.Color color31 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double32 = colorContrastRatio0.getRelativeLuminance(color31);
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.003035269835488375d + "'", double20 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.11953842798834562d + "'", double22 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.12743768043564743d + "'", double24 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.003035269835488375d + "'", double26 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test8133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8133");
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
        double double22 = colorContrastRatio0.getColor(0);
        double double24 = colorContrastRatio0.getColor((-1));
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-3.035269835488375E-4d) + "'", double24 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8134");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor(0);
        double double8 = colorContrastRatio0.getColor((-1));
        double double10 = colorContrastRatio0.getColor((int) (short) 100);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor((int) '#');
        double double16 = colorContrastRatio0.getColor(10);
        double double18 = colorContrastRatio0.getColor((-1));
        double double20 = colorContrastRatio0.getColor((int) (short) -1);
        java.lang.Class<?> wildcardClass21 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.016807375752887384d + "'", double14 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.003035269835488375d + "'", double16 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.035269835488375E-4d) + "'", double20 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8135");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) (byte) -1);
        double double12 = colorContrastRatio0.getColor(100);
        double double14 = colorContrastRatio0.getColor((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8136");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 100);
        double double6 = colorContrastRatio0.getColor((int) (byte) 1);
        double double8 = colorContrastRatio0.getColor((int) (byte) -1);
        double double10 = colorContrastRatio0.getColor((int) (byte) -1);
        double double12 = colorContrastRatio0.getColor(100);
        double double14 = colorContrastRatio0.getColor(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12743768043564743d + "'", double12 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test8137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8137");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor((int) (short) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 100);
        double double12 = colorContrastRatio0.getColor((int) (byte) -1);
        double double14 = colorContrastRatio0.getColor((int) '4');
        double double16 = colorContrastRatio0.getColor((-1));
        double double18 = colorContrastRatio0.getColor((int) ' ');
        double double20 = colorContrastRatio0.getColor((int) (short) 100);
        double double22 = colorContrastRatio0.getColor((int) (short) -1);
        java.awt.Color color23 = null;
        java.awt.Color color24 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double25 = colorContrastRatio0.getContrastRatio(color23, color24);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.03433980680868217d + "'", double14 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.014443843596092545d + "'", double18 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.12743768043564743d + "'", double20 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-3.035269835488375E-4d) + "'", double22 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8138");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) '4');
        double double10 = colorContrastRatio0.getColor(100);
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03433980680868217d + "'", double8 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12743768043564743d + "'", double10 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.016807375752887384d + "'", double14 == 0.016807375752887384d);
    }

    @Test
    public void test8139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8139");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor((int) (byte) 1);
        double double18 = colorContrastRatio0.getColor((int) (short) 1);
        double double20 = colorContrastRatio0.getColor(10);
        double double22 = colorContrastRatio0.getColor((int) 'a');
        double double24 = colorContrastRatio0.getColor((int) (byte) 100);
        double double26 = colorContrastRatio0.getColor((int) (short) 1);
        java.awt.Color color27 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double28 = colorContrastRatio0.getRelativeLuminance(color27);
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.003035269835488375d + "'", double20 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.11953842798834562d + "'", double22 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.12743768043564743d + "'", double24 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 3.035269835488375E-4d + "'", double26 == 3.035269835488375E-4d);
    }

    @Test
    public void test8140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8140");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (short) -1);
        double double10 = colorContrastRatio0.getColor((int) (byte) -1);
        double double12 = colorContrastRatio0.getColor((int) (byte) 1);
        double double14 = colorContrastRatio0.getColor((int) (byte) 10);
        double double16 = colorContrastRatio0.getColor((int) (byte) 0);
        double double18 = colorContrastRatio0.getColor((-1));
        java.awt.Color color19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = colorContrastRatio0.getRelativeLuminance(color19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.035269835488375E-4d) + "'", double8 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.003035269835488375d + "'", double14 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
    }

    @Test
    public void test8141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8141");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor(10);
        double double8 = colorContrastRatio0.getColor((int) (byte) 100);
        double double10 = colorContrastRatio0.getColor((-1));
        double double12 = colorContrastRatio0.getColor((int) (short) 10);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor(0);
        double double18 = colorContrastRatio0.getColor(100);
        double double20 = colorContrastRatio0.getColor(10);
        double double22 = colorContrastRatio0.getColor((int) (short) 0);
        double double24 = colorContrastRatio0.getColor(10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003035269835488375d + "'", double6 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.003035269835488375d + "'", double12 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.12743768043564743d + "'", double18 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.003035269835488375d + "'", double20 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.003035269835488375d + "'", double24 == 0.003035269835488375d);
    }

    @Test
    public void test8142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8142");
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
        double double22 = colorContrastRatio0.getColor(0);
        double double24 = colorContrastRatio0.getColor((int) (short) 0);
        double double26 = colorContrastRatio0.getColor((int) '4');
        double double28 = colorContrastRatio0.getColor(10);
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.03433980680868217d + "'", double26 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.003035269835488375d + "'", double28 == 0.003035269835488375d);
    }

    @Test
    public void test8143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8143");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor(100);
        double double6 = colorContrastRatio0.getColor((int) 'a');
        double double8 = colorContrastRatio0.getColor(0);
        double double10 = colorContrastRatio0.getColor((int) (short) 1);
        double double12 = colorContrastRatio0.getColor(0);
        double double14 = colorContrastRatio0.getColor(100);
        double double16 = colorContrastRatio0.getColor((-1));
        double double18 = colorContrastRatio0.getColor((-1));
        double double20 = colorContrastRatio0.getColor((int) (short) 0);
        double double22 = colorContrastRatio0.getColor((int) '#');
        double double24 = colorContrastRatio0.getColor((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.12743768043564743d + "'", double4 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.11953842798834562d + "'", double6 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.035269835488375E-4d + "'", double10 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.016807375752887384d + "'", double22 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test8144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8144");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) '#');
        double double4 = colorContrastRatio0.getColor((-1));
        double double6 = colorContrastRatio0.getColor(1);
        double double8 = colorContrastRatio0.getColor((int) (short) 100);
        java.awt.Color color9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = colorContrastRatio0.getRelativeLuminance(color9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Color.getRed()\" because \"color\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016807375752887384d + "'", double2 == 0.016807375752887384d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
    }

    @Test
    public void test8145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8145");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) '4');
        double double6 = colorContrastRatio0.getColor((int) '4');
        double double8 = colorContrastRatio0.getColor(100);
        double double10 = colorContrastRatio0.getColor((int) 'a');
        double double12 = colorContrastRatio0.getColor((int) (short) 1);
        double double14 = colorContrastRatio0.getColor(100);
        double double16 = colorContrastRatio0.getColor(1);
        double double18 = colorContrastRatio0.getColor((int) (short) -1);
        double double20 = colorContrastRatio0.getColor(10);
        double double22 = colorContrastRatio0.getColor((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03433980680868217d + "'", double4 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03433980680868217d + "'", double6 == 0.03433980680868217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.12743768043564743d + "'", double8 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.035269835488375E-4d + "'", double16 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.003035269835488375d + "'", double20 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.003035269835488375d + "'", double22 == 0.003035269835488375d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test8146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8146");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((-1));
        double double8 = colorContrastRatio0.getColor(0);
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.11953842798834562d + "'", double10 == 0.11953842798834562d);
    }

    @Test
    public void test8147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8147");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (short) -1);
        double double4 = colorContrastRatio0.getColor((int) 'a');
        double double6 = colorContrastRatio0.getColor((int) (short) -1);
        double double8 = colorContrastRatio0.getColor((int) ' ');
        double double10 = colorContrastRatio0.getColor((int) (short) 0);
        double double12 = colorContrastRatio0.getColor(1);
        double double14 = colorContrastRatio0.getColor((int) (short) 100);
        double double16 = colorContrastRatio0.getColor((int) (short) -1);
        double double18 = colorContrastRatio0.getColor((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.035269835488375E-4d) + "'", double2 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.11953842798834562d + "'", double4 == 0.11953842798834562d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.035269835488375E-4d) + "'", double6 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.014443843596092545d + "'", double8 == 0.014443843596092545d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.035269835488375E-4d + "'", double12 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12743768043564743d + "'", double14 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.035269835488375E-4d) + "'", double16 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.035269835488375E-4d) + "'", double18 == (-3.035269835488375E-4d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8148");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 10);
        double double4 = colorContrastRatio0.getColor((int) (short) 10);
        double double6 = colorContrastRatio0.getColor((int) (byte) 100);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        double double10 = colorContrastRatio0.getColor((int) (byte) 10);
        double double12 = colorContrastRatio0.getColor((-1));
        double double14 = colorContrastRatio0.getColor((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = colorContrastRatio0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003035269835488375d + "'", double2 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003035269835488375d + "'", double4 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.12743768043564743d + "'", double6 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003035269835488375d + "'", double10 == 0.003035269835488375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8149");
        com.thealgorithms.misc.ColorContrastRatio colorContrastRatio0 = new com.thealgorithms.misc.ColorContrastRatio();
        double double2 = colorContrastRatio0.getColor((int) (byte) 100);
        double double4 = colorContrastRatio0.getColor((int) (byte) -1);
        double double6 = colorContrastRatio0.getColor(1);
        double double8 = colorContrastRatio0.getColor((int) (byte) 1);
        double double10 = colorContrastRatio0.getColor((int) (short) -1);
        double double12 = colorContrastRatio0.getColor((-1));
        double double14 = colorContrastRatio0.getColor((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12743768043564743d + "'", double2 == 0.12743768043564743d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.035269835488375E-4d) + "'", double4 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.035269835488375E-4d + "'", double6 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.035269835488375E-4d + "'", double8 == 3.035269835488375E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.035269835488375E-4d) + "'", double10 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.035269835488375E-4d) + "'", double12 == (-3.035269835488375E-4d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.035269835488375E-4d) + "'", double14 == (-3.035269835488375E-4d));
    }
}

