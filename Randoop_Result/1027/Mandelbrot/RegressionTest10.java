package Mandelbrot;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 1, (double) (byte) 0, 1.0d, (double) (byte) 10, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 1, (double) 0.0f, 100.0d, (double) (byte) 0, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) -1, (double) 10, (double) 1.0f, (double) (byte) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 100, (double) 100, (double) (short) 100, (double) 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 100, (double) (byte) 0, (double) '4', (double) (short) -1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 10, (double) '#', (double) (short) 1, (-1.0d), (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 100, (double) 10L, (double) (short) 100, (double) 1.0f, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 10, (-1.0d), (double) '#', (double) ' ', 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) 'a', (-1.0d), (double) (-1L), (double) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 100, (double) (-1L), (double) (byte) -1, (double) (short) 0, 1, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 0, (double) 100L, (double) (byte) 10, (double) (-1.0f), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 100, (double) (byte) 1, 0.0d, 0.0d, (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) -1, (double) (byte) 0, (double) 10, (double) ' ', (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 10, (double) 10, (double) (short) 100, 0.0d, (int) (short) 10, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) 'a', (double) (byte) 0, (double) '#', (double) 0L, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) '4', 0.0d, 10.0d, (double) 100, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 10, (double) ' ', 0.0d, (double) (byte) 0, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 100, (double) 10L, (double) (-1L), 0.0d, (int) (byte) 1, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 10, (double) 'a', (double) '#', 1.0d, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) '4', (double) (byte) -1, (double) (-1), (double) (-1.0f), (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 100, (double) (-1.0f), (double) (byte) 1, 0.0d, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 10, (double) 10L, (double) (-1.0f), (double) (short) 0, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '4', (double) 0.0f, (double) 1L, 100.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (-1), 0.0d, (double) 100.0f, (double) '#', (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) '#', (double) 10, (double) (byte) 100, 0.0d, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 100, (double) 1L, (-1.0d), (double) 'a', 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 1, (double) (short) -1, (double) 'a', (double) '4', (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) '#', (double) (byte) 1, (double) 0, (double) (byte) -1, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) -1, (double) ' ', 0.0d, 10.0d, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 1, 0.0d, (double) 0.0f, (double) ' ', (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 0, (double) '4', (double) (short) 10, (double) (-1L), (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 0, (double) 'a', (double) '4', 100.0d, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '4', (double) 10L, (double) 'a', 0.0d, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 1, (double) 0L, (double) (-1L), (double) '4', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 100, (double) 10L, 0.0d, (double) 'a', (int) (short) 10, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 100, (double) ' ', (double) 1, (double) 10.0f, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '#', (double) (short) -1, (-1.0d), (double) 10L, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 10, (double) 10, (double) '4', (double) 10.0f, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) ' ', (double) 100, (double) 100L, (double) '4', 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 1, (double) (byte) -1, 0.0d, (double) 10L, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 10, (double) ' ', (double) (short) 100, (double) '#', (int) '4', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (-1), (double) '4', 0.0d, (double) 1L, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 0, (double) (byte) 1, (double) (short) 100, (double) 1L, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 1, (double) (short) 10, (double) (byte) 100, (double) 100.0f, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) ' ', (double) (-1), (double) (byte) 1, (double) 1L, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) -1, (double) 'a', (double) 1.0f, (double) 0.0f, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 100, (double) (-1), (double) 'a', (double) 0.0f, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) -1, (double) 100, (double) 100, 100.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) -1, (double) (short) -1, (double) 100.0f, (double) (-1.0f), (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 0, (double) ' ', (double) (short) 1, (double) (-1), (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) '4', (double) (byte) 10, 0.0d, (double) (short) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 0, (double) 0.0f, (double) (byte) 10, (double) ' ', (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) '#', (double) (byte) -1, (double) (byte) 100, (double) (short) 100, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 0, (double) (-1.0f), (double) (byte) 100, (double) (short) 0, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 100, (double) (short) 0, (double) (short) 0, (double) (-1L), (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 10, (double) (-1.0f), (double) (short) -1, 1.0d, (int) 'a', true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 1, 100.0d, (double) (short) 10, 100.0d, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 100, (double) (short) -1, (double) (short) 1, (double) 'a', (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 1, (double) (-1.0f), (double) (-1.0f), (double) 100, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 1, (double) '#', (-1.0d), (double) 10L, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 1, (double) ' ', (double) (short) 0, 100.0d, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 100, 0.0d, (double) 'a', (double) 1, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 10, (double) (byte) 10, (double) 10.0f, (double) (short) 0, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 1, (double) 'a', (double) ' ', (double) (-1.0f), (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) -1, (double) 100, (double) '#', (double) (short) 100, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 100, (double) '#', (double) (byte) 10, (double) 1L, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) '#', (double) (byte) 0, (double) (-1L), (double) (-1), (int) ' ', true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 100, (double) (byte) -1, 0.0d, (double) 10L, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 1, (double) (byte) 100, 10.0d, (double) (short) 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) -1, (double) 0L, (double) 1, (double) ' ', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) 'a', (double) (-1.0f), (double) 1.0f, (double) (byte) 10, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) 'a', (double) (short) -1, (double) (short) -1, 100.0d, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 10, (double) '4', (double) 0, 1.0d, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 0, 0.0d, 0.0d, (double) 1.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 1, 100.0d, (double) (-1), (double) (-1), (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 0, (double) 1L, (double) (byte) 100, (double) 100.0f, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 100, (double) '#', (double) (-1), 100.0d, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '4', (double) 100, (double) (short) -1, (double) 10.0f, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) '4', (double) '#', (double) 0, (double) (short) 10, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) 'a', (double) (-1), (double) (-1), (double) 0, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) '#', (double) (byte) 10, (double) ' ', (double) 10, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 1, (double) 100, (double) 10, (double) (-1L), (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 10, (double) '4', (double) 100L, (double) (byte) 0, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 1, (double) 100, 0.0d, (double) (-1L), (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) -1, (double) (short) 0, 0.0d, (double) (-1.0f), (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) -1, (double) 1.0f, (double) (short) 0, (double) 100.0f, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 100, (double) 0.0f, (double) '4', (double) (short) -1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 1, 0.0d, (double) 0L, (double) (-1.0f), (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 10, (double) (byte) 100, (double) (short) 100, (double) 1L, (int) (byte) 100, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 0, (double) 100.0f, (double) 0L, (double) (byte) 0, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 100, (double) 1L, 10.0d, (double) (short) 1, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 100, (double) 100L, (double) (byte) -1, (double) ' ', 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 100, (double) 0.0f, (double) (byte) 1, (double) 10.0f, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 1, (double) (byte) 10, (double) ' ', (double) (short) 10, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) -1, (double) 0.0f, (double) 10.0f, (double) (byte) 1, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 1, (double) ' ', (double) 'a', (double) 'a', (int) '#', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 0, (double) (byte) 100, (double) 100.0f, (double) (byte) 1, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) 1, (double) (short) 100, (-1.0d), (double) 'a', (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 100, (double) '#', (double) (byte) 0, (double) 'a', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) -1, 100.0d, (double) (byte) 1, (double) '4', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 0, (double) 100L, (double) (short) -1, (double) (short) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 1, (double) (byte) 1, (double) (byte) 10, (double) 10.0f, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 0, 1.0d, (double) 1.0f, (double) (byte) -1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) '4', 0.0d, 0.0d, 0.0d, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 0, (double) (short) -1, (double) (byte) 100, (double) (short) 0, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) 'a', (double) 0L, (double) (short) 100, (double) '4', (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 100, (double) (-1L), (double) (byte) 0, (double) (short) 10, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) 'a', (-1.0d), (double) 100, (double) (short) -1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 100, (double) (byte) -1, (double) 0L, 1.0d, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 0, (double) (short) 100, (double) 100.0f, (double) (-1L), (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (-1), (double) (byte) 0, (double) 100L, (double) '4', (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) '4', (double) 10, 0.0d, (double) (short) 0, (int) (short) 100, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) '#', (double) (short) 10, (double) 10L, (double) 10, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) -1, (double) 1L, (double) (short) -1, 0.0d, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 100, (double) 0, (double) (short) 1, (double) (short) 10, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (-1), (double) (-1L), 100.0d, 1.0d, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 10, (double) 0L, (double) 0L, (double) 0.0f, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 100, (double) (byte) 100, (double) 100, 0.0d, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 0, (double) 0.0f, (double) ' ', (double) 1.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 10, (double) (byte) -1, 0.0d, (double) (short) -1, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) '4', (double) 10L, (double) 100.0f, (double) 10, (int) (byte) 10, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 0, (double) 10, (double) ' ', 1.0d, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) '#', (double) 10, 1.0d, (double) (-1L), 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) 1, (double) (short) 100, (double) (short) 0, (double) 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) -1, (double) 100L, (double) '#', (double) '#', 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 0, 0.0d, (double) (short) 100, (double) (-1), (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) -1, (double) 1.0f, (double) 100.0f, (double) 10, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) '4', (double) 10, (double) (short) 1, (double) (byte) 100, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 1, 0.0d, (double) (short) 1, (double) (byte) 0, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) 1, (double) (short) 100, (double) 100.0f, (double) 10, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 10, (double) 0L, 100.0d, (double) 100L, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '4', (double) (short) 0, (double) 100.0f, (double) ' ', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 0, (double) (byte) 1, (double) '#', (double) (-1), (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 1, (double) (short) -1, (double) 1, 0.0d, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 0, 1.0d, (double) 100L, (double) 1.0f, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 10, 10.0d, (double) (byte) 1, 1.0d, (int) '#', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 100, (double) 100L, (double) 0, (double) 1, (int) (short) 100, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 100, (double) (-1), (double) (short) 1, (double) 10L, (int) ' ', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 10, (-1.0d), (double) (short) 10, (double) (byte) -1, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 1, (double) 100.0f, (double) (byte) 10, (double) 0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 1, (double) (-1.0f), (double) ' ', 0.0d, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 0, (double) 10, (double) 10, (double) (short) 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 10, (double) 'a', 0.0d, (double) (short) 1, (int) (short) 10, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 0, (-1.0d), (double) 1, (double) 1.0f, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) '#', 0.0d, (double) (byte) -1, (double) 0.0f, (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 0, (-1.0d), 1.0d, (double) (short) 1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) 'a', (double) 100L, (double) (byte) -1, (double) '4', 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 0, (double) '4', (double) 0, 0.0d, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) '4', (double) (byte) 1, (double) 1.0f, (double) 10.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 0, (double) 100.0f, (double) 100.0f, (double) 10L, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (-1), 0.0d, (double) ' ', (double) (short) 1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 0, (double) (byte) 1, (double) (byte) 1, (double) (short) 10, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 10, (double) (short) 10, 1.0d, (double) (-1.0f), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 100, (double) '4', (double) (short) 1, (double) (byte) -1, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) -1, (double) (byte) 0, (double) 10L, (double) (byte) 10, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) -1, (double) 0, (double) 10, (double) 10L, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 1, (double) 1.0f, (double) 10.0f, (double) ' ', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 1, (double) (byte) -1, 100.0d, 0.0d, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 10, (double) 1.0f, (double) 0.0f, (double) (short) 0, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) ' ', (double) (short) -1, (double) (-1L), (double) 1.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) '#', (double) 10.0f, (double) '#', (double) (byte) 10, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 100, (double) 100, (double) 100L, (double) (short) 100, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 1, (double) (short) 1, (double) (byte) -1, (double) 0L, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 100, 100.0d, (double) '#', 0.0d, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 100, (double) (byte) 0, (double) (byte) 1, (double) 10, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '4', (double) (byte) 10, 0.0d, (double) (short) 0, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 0, (double) 10.0f, (double) 1, (double) 1L, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 0, (double) (short) 10, 1.0d, 1.0d, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 0, (double) (byte) 10, (double) ' ', (double) 0.0f, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 100, (double) (short) -1, 0.0d, (-1.0d), (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) 1, (double) 1L, (double) 100.0f, 1.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) '#', (double) 1.0f, (double) ' ', (double) (byte) -1, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) -1, (double) '4', (double) (byte) 0, 0.0d, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) '4', (double) (byte) 1, (double) 100L, (double) (short) 0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) 'a', (double) 0.0f, 100.0d, (double) '4', (int) (short) 1, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 0, (double) (short) 0, (double) (byte) 10, (double) (-1L), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) -1, (double) ' ', (double) 100, (double) 1.0f, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) 'a', (double) (byte) 10, 1.0d, (double) 10L, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (-1), 1.0d, (double) ' ', 1.0d, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 0, (double) (byte) 10, (double) '4', (double) 'a', (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (-1), (double) (short) -1, (double) 1, 0.0d, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 100, (double) (short) 10, (double) 10, (double) (short) 10, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) 'a', 0.0d, 0.0d, (double) 1L, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) 'a', 0.0d, 100.0d, 0.0d, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) '#', (double) (byte) 1, (double) 0.0f, 100.0d, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 100, (double) (-1), (double) 100L, (double) 0, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) 'a', (double) 100.0f, (double) 1, (double) 0L, 1, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 1, (double) 10, (double) 1.0f, (double) ' ', (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 1, 0.0d, 100.0d, (double) (byte) 100, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) '4', (double) 1L, (double) (byte) 0, (double) (short) 0, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) ' ', (double) 100.0f, (double) (-1.0f), (double) (byte) -1, 1, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '4', (double) 1, (double) (short) -1, (double) (byte) 100, 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (-1), (double) (short) 10, (double) (-1), (double) 1L, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 10, (double) (byte) 0, (double) (short) 0, 0.0d, (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 100, (double) (-1L), 100.0d, 10.0d, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) -1, (double) (byte) -1, (double) (-1.0f), 10.0d, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 100, 100.0d, (double) 100.0f, 100.0d, (int) (short) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) 10, (double) (-1.0f), (double) (short) 10, (double) 'a', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 0, (double) 1.0f, (double) (byte) 100, (double) (-1.0f), (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 10, (double) 1L, 0.0d, (double) (short) -1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) -1, 0.0d, (double) 10, (double) 0, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 0, (double) 1L, (double) (short) 100, (double) 0.0f, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) 'a', (double) 100L, (double) 10, (double) 10L, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 10, (double) 1, (double) (short) 10, (-1.0d), (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '#', (double) 10.0f, (double) 10L, (double) 10, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) '4', (double) (-1.0f), (double) 0.0f, (double) (short) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 0, 0.0d, (double) (byte) 0, (double) (byte) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 100, (double) 1L, (double) 0L, (double) (short) 0, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) '#', (double) (short) -1, (double) (-1.0f), (double) 10L, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 1, (-1.0d), (double) 10, (double) 1, (int) 'a', true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 1, (double) 1, (double) 100L, (double) (-1), (int) '#', true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 10, (double) 100L, (double) 0L, (double) (byte) 10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) -1, (double) (byte) 1, (double) (short) 0, (double) 0.0f, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 100, 0.0d, 10.0d, (double) 10.0f, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) '4', (double) (byte) 10, 10.0d, 1.0d, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) 0, (double) 100L, (double) 10.0f, (double) 100.0f, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 0, (double) 100, (double) 100L, (double) (-1L), (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 10, (double) (byte) 10, (double) (-1L), (double) 10L, (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (-1), (double) '4', (double) (byte) 10, (double) 0.0f, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 10, (double) 100, 1.0d, 0.0d, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 0, (double) 1.0f, (double) 1, (double) (byte) 1, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 1, (double) (short) 100, (double) 10, (double) '4', (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) -1, 0.0d, (double) (short) 0, (double) (byte) 10, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) '#', (double) (short) -1, (double) (-1), (double) 'a', (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 100, (double) (short) 1, 100.0d, (double) (byte) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 0, (double) 100.0f, (double) (short) -1, (double) 0L, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 10, 10.0d, (double) 10, (double) ' ', (int) (short) 10, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) -1, (double) 'a', (double) (byte) -1, (double) (byte) 1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 0, 0.0d, (double) (short) 1, 0.0d, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 0, (double) 100L, 100.0d, (double) (short) 1, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 1, 1.0d, (double) 0.0f, (double) (byte) 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 1, (double) 10L, 0.0d, (double) (byte) -1, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) 'a', (double) (short) -1, (double) (short) -1, (double) (byte) -1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 100, (double) (-1), (double) 100, (double) (-1), (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 100, (double) '#', (double) 1L, (double) (short) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 10, (double) (short) -1, (double) (byte) 0, 100.0d, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) ' ', (double) (-1.0f), (double) 1, (double) (-1), (int) (short) 10, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 100, (double) (byte) 10, (double) (short) 0, (double) (byte) -1, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 100, (double) (-1.0f), 10.0d, (double) (short) 1, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 10, (double) (short) -1, (double) '#', (double) (short) 100, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 0, 0.0d, (double) (byte) 10, 100.0d, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) -1, (double) 1.0f, (double) '4', (double) 10.0f, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) -1, 100.0d, (double) ' ', (double) (short) 100, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 100, (double) (short) 0, 0.0d, (double) 10, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 0, (double) 0L, (double) 10.0f, (double) 100L, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 10, (double) ' ', (double) (short) 10, (double) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) -1, (double) (byte) 0, (double) (-1L), (double) 0, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 10, (double) 1, (double) 'a', (double) 'a', (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) 1, (double) 0.0f, (double) (-1), (double) (-1.0f), (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 100, (double) (short) 0, (double) (-1L), (-1.0d), (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) ' ', (double) 100, 1.0d, (double) (short) -1, 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 10, (double) 100.0f, (double) 10L, (double) ' ', (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (-1), (double) (byte) -1, (double) 100, 0.0d, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 1, (double) (byte) 0, (double) '#', (double) 10, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 100, (double) (short) -1, (double) '#', 10.0d, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 100, (double) (-1), (double) (byte) 10, (double) 100.0f, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 10, (double) 100, (double) '4', (double) 10.0f, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) ' ', (double) (byte) -1, (double) (-1.0f), (double) (byte) 1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 0, 0.0d, (double) 0L, (double) (-1), (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 100, (double) (-1.0f), (double) 100, (double) 10, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) -1, (double) 1, 0.0d, (double) 10L, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 100, (double) 0, (double) 1.0f, (double) 10L, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) 1, (double) (-1), 1.0d, (double) (byte) 100, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 100, (double) 1.0f, (double) '#', 100.0d, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 100, (double) 1, (double) (short) 100, (double) (short) -1, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 100, (double) 10, (double) (-1.0f), (double) 100L, 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 0, (double) 1L, (double) (short) 0, (-1.0d), (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 0, (double) 1.0f, (double) 10, (double) (-1L), (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) 'a', 1.0d, (double) (short) 10, (double) (-1.0f), (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) -1, (-1.0d), (double) (short) 1, (double) (short) 0, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) ' ', (-1.0d), (double) (short) 100, 0.0d, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 1, (double) (short) 100, (-1.0d), 1.0d, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) 'a', 10.0d, 0.0d, 100.0d, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 0, (double) '4', (double) (short) 100, (double) 100L, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 100, (double) 0, (double) (short) 1, (double) 1.0f, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 0, (double) (-1L), 1.0d, (double) (byte) 100, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 1, (double) 1.0f, (double) (byte) 100, (double) 10.0f, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '4', (double) (byte) 1, (double) 10, (double) (byte) 100, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) -1, (double) (short) -1, (double) (byte) 100, (double) (short) 1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) 'a', (double) (-1L), (double) (short) 1, (double) '4', (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 10, (double) 10, (double) 1, (double) 100.0f, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 1, (double) (short) 1, (double) (short) 100, (double) 10.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) -1, (double) (-1L), 0.0d, (double) (-1L), (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '4', (double) 1.0f, (double) 1, (double) (byte) 10, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) 1, (double) 100L, (double) (byte) 1, (double) '4', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 10, 0.0d, (double) (short) 1, (double) 100L, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (-1), (double) (-1L), (double) ' ', (double) 10L, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 10, (double) 100, (double) (-1L), (double) (short) 1, (int) (byte) 100, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 100, (double) 'a', (double) 0.0f, (double) 0L, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 10, 0.0d, (double) (-1L), (double) (-1L), (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 0, (double) (byte) 100, (double) 0L, (double) 0L, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (-1), (double) ' ', (double) (short) 1, (double) 1.0f, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) -1, (double) (-1L), 1.0d, (double) (byte) 10, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 100, (double) (short) 100, (double) (short) 100, (double) 'a', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 0, 100.0d, (double) 'a', (double) 'a', 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 10, (double) 100L, (double) 100L, (double) 10.0f, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 10, (double) 1L, (-1.0d), (double) 10, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 1, (double) 1L, (double) (-1.0f), (double) '4', (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 100, (double) 'a', (double) (short) -1, (double) 10, (int) '#', true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 0, 1.0d, (double) (-1.0f), 0.0d, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (-1), (double) 0.0f, (double) 10.0f, (double) (byte) 10, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 1, (double) 1.0f, (double) '#', (double) 1, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 10, (double) (byte) 100, (double) (short) -1, (double) 0, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 10, (-1.0d), (double) 0L, (double) (-1L), (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 100, (double) (short) 0, (double) (byte) 1, (double) (short) 10, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 10, (double) 'a', (double) '4', (double) 10L, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '4', (double) (byte) 0, (double) 1.0f, (double) (short) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (-1), (double) (byte) 0, (double) (-1), (double) (byte) 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 0, (double) 0L, (double) 1.0f, (double) '4', 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 0, (double) (short) 10, (double) 10, 100.0d, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 10, (double) (byte) -1, (double) 1.0f, 1.0d, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 1, (double) (byte) -1, 0.0d, (double) (byte) -1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 1, (double) ' ', (double) 100L, (double) (byte) 0, (int) (byte) 1, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) '#', (double) (short) 1, (double) 100L, (double) (short) 100, (int) '#', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 1, (double) 0.0f, (double) 10.0f, (double) 'a', (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 100, (double) (short) 100, (double) (short) 10, (double) 10, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) ' ', (double) (short) 10, (double) 'a', (double) '4', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) '4', 0.0d, (double) 1.0f, 100.0d, (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) ' ', (double) 1.0f, 100.0d, (double) (byte) 1, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 0, (double) 100.0f, (double) '#', (double) (byte) 1, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 10, (double) (short) 100, (double) '4', (double) 0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 1, (double) (short) 1, 0.0d, (double) (-1), (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 100, (double) (short) 0, (double) 0L, (double) (short) 0, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) ' ', (double) (byte) -1, (double) '4', (double) (byte) 0, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) '#', (double) 10, (double) 10, (-1.0d), (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 0, (double) (-1), (double) (byte) 100, (double) 1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 0, (double) ' ', (double) (-1L), (double) 'a', 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) '#', (double) 10, (double) (-1L), (double) 100L, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 1, (double) (byte) -1, 0.0d, (double) 10L, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 100, 100.0d, (double) (byte) 1, (double) (byte) 1, (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 0, (double) 1L, (double) (short) 10, (double) 100.0f, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 10, (double) ' ', (double) 10, 0.0d, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 1, (double) '4', (double) (short) 10, (double) (-1L), (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 1, 100.0d, (double) (byte) 100, (double) (short) 1, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 10, 1.0d, (double) 0, (double) 100, (int) (byte) 100, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 100, (double) (short) 100, (double) (byte) 100, (double) (short) 100, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 1, (double) (short) 0, (double) 'a', (double) (byte) 100, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 0, (double) (byte) 10, (double) 0, (double) (-1), (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) 'a', (double) 0L, 0.0d, 0.0d, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 0, (double) 0L, (double) (short) -1, (double) (byte) 100, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 1, (double) (byte) 0, (double) 0L, (double) 100.0f, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 100, (double) 1L, (double) '#', (double) 1, (int) (short) 10, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 10, (double) (byte) 10, 0.0d, (double) 100L, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) -1, (double) (byte) 0, (double) (-1), 0.0d, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 10, (double) '4', (double) (byte) 10, (double) (byte) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) -1, (double) (-1.0f), (double) (byte) -1, (double) (byte) 100, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) '4', (double) (-1.0f), (double) ' ', (double) 0L, (int) '#', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 0, (double) (byte) 10, (double) (byte) -1, (double) (byte) 10, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 10, (double) 0, (double) (byte) 0, 1.0d, (int) (byte) 1, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) '4', (double) (-1L), (double) 1, (double) 100.0f, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 1, (double) (-1L), (double) 10.0f, (double) (short) 0, (int) '4', true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) '#', 0.0d, (double) '4', (double) (short) -1, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 1, (double) 0.0f, (double) (-1), (double) (byte) -1, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 10, (double) (byte) 100, (double) (short) 10, 100.0d, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 0, (double) ' ', 0.0d, (double) (-1L), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) ' ', 0.0d, (double) (-1.0f), (double) 0L, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) '#', (double) 0, (double) 100, (double) 1, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 0, 1.0d, (double) (byte) 0, (double) (short) 100, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 0, (double) 100.0f, (double) 100L, (double) 10L, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '4', (double) (byte) 0, (double) 100.0f, 1.0d, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (-1), (double) 10L, (double) (-1.0f), 1.0d, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) -1, (double) 0, 0.0d, (double) (short) 10, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) '4', 1.0d, (double) (-1), (double) 'a', (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) -1, (double) 0, 0.0d, (double) (short) 10, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 0, (double) 1.0f, (double) (short) 10, (double) 1.0f, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 100, (double) ' ', 0.0d, 0.0d, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 100, (double) 1L, 0.0d, (double) ' ', 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 1, 0.0d, (double) 10.0f, (double) '4', (int) '#', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 0, (double) 'a', (double) 10, (double) (short) -1, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 1, (double) 0, (double) (short) -1, (double) (short) -1, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) '#', 10.0d, (double) 0, 100.0d, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 0, (double) (byte) 100, (-1.0d), (double) 1.0f, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 100, (double) (byte) -1, (double) (-1L), 100.0d, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 0, (double) (short) 1, (double) (short) 10, (double) 0, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) '#', (double) 100, 10.0d, (double) 10L, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 1, (double) 1.0f, (double) 0L, (double) 1, 10, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 10, (double) 1.0f, (double) (short) 10, (double) '#', 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) '#', (double) 0L, (double) (byte) 0, 0.0d, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (-1), (double) (byte) 1, (double) (-1L), (double) (short) 100, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 0, (double) (byte) 0, (double) ' ', (double) 1L, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 100, (double) (byte) 10, (double) 100, (double) ' ', 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 0, (double) (short) 100, (double) ' ', (double) ' ', (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 1, (double) (-1), (double) 10, (double) 100, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 10, (double) (short) 1, (double) (-1), (double) 10, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 100, (double) (short) 0, 0.0d, (double) 1, (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 10, (double) (byte) 10, 1.0d, (double) 100, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 0, (double) 0.0f, (double) 100L, (double) (short) -1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 0, (double) ' ', (double) 0, (double) (short) 100, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 1, 0.0d, (double) 'a', (double) (byte) 10, (int) (short) 1, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '4', (double) 100.0f, (double) (short) 100, (double) 0.0f, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 0, (double) (byte) 10, (double) 'a', (double) (short) -1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) ' ', (double) 100L, (double) '#', (double) 100L, (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 10, (double) (-1L), (double) (byte) 10, 10.0d, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) ' ', 10.0d, (double) (byte) 10, 0.0d, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) 'a', (double) (-1), (double) (byte) 10, (-1.0d), (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 1, 0.0d, (double) 100L, 0.0d, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 0, 0.0d, 0.0d, 100.0d, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (-1), (double) 100, (-1.0d), (double) 0L, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 0, (double) 10L, (double) (short) 0, 100.0d, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) -1, 1.0d, (double) (byte) 10, (double) (-1.0f), (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) -1, (double) 0.0f, (double) (short) 0, (double) 'a', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) 1, (double) 10L, (double) 0, (double) (byte) 0, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 100, (double) (short) 1, (double) 'a', (double) (byte) 100, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) -1, 0.0d, (double) (byte) 100, (double) 100L, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 10, (double) 0, (double) 'a', (double) '#', (int) '#', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 1, (double) 'a', (double) 1, (double) (byte) 1, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) 'a', (double) 1, (double) (byte) 0, (-1.0d), 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 10, (double) '4', 0.0d, (double) 1.0f, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 10, 0.0d, (double) (short) 1, 100.0d, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 0, 0.0d, (double) (byte) 10, (double) (-1.0f), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) 'a', 10.0d, (double) ' ', (double) (byte) -1, (int) (short) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) 'a', (double) 100, (double) 10L, (double) 1L, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) -1, (double) '#', (double) (byte) 1, (double) ' ', (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 1, (double) (byte) 10, 0.0d, 10.0d, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 0, (double) 10.0f, (double) 0.0f, 1.0d, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 10, (double) ' ', (double) (-1), 0.0d, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) ' ', (double) ' ', 10.0d, (double) (short) 10, 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 0, (double) 'a', 0.0d, 0.0d, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 0, (double) (short) 100, (double) ' ', (double) 100.0f, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 0, (double) 10L, (double) (-1), (double) 'a', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '#', (double) (short) -1, (double) '#', (double) (byte) 0, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) 'a', (double) 100.0f, (double) 10.0f, 10.0d, 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) -1, (double) 100, (double) (-1), (double) (byte) 10, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 1, (double) 1L, 0.0d, (double) 0L, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 100, (double) (-1), (double) 'a', (double) (-1), (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 100, (double) '4', (double) (short) -1, (double) (short) 0, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 0, (double) (byte) -1, (double) (short) -1, (double) (byte) 10, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) '4', (double) 1.0f, (double) '#', (double) 1.0f, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 0, (double) (byte) 1, 1.0d, (double) '4', (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 1, (double) 1.0f, (double) 10L, (double) 100, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 1, (double) (short) 100, (double) '4', 0.0d, (int) (short) 1, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 1, (double) (short) 0, (double) (short) 100, (double) (byte) 10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 0, (double) (byte) 100, (double) 100.0f, (double) (-1), 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 1, (double) (short) 1, (double) (short) 0, (double) 10, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 1, (double) ' ', (double) (short) 0, (double) (byte) 0, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) ' ', (double) 10.0f, (double) (byte) 1, 100.0d, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) '4', (double) 100.0f, (double) (-1.0f), (double) '4', (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 1, (double) 1, 0.0d, (double) (short) 10, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 1, (-1.0d), (double) 'a', (double) (-1.0f), (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) -1, (double) (-1.0f), 0.0d, (double) '4', (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 1, 0.0d, (double) '#', (double) 10.0f, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) -1, (double) '#', (double) (-1L), (double) 0.0f, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) '#', (double) ' ', (double) 100.0f, (double) (short) 1, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 0, 1.0d, (double) 0.0f, (double) (short) 10, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 10, 0.0d, (double) (byte) -1, (double) (-1.0f), (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 10, (double) 1.0f, (double) 100.0f, (double) (byte) 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) '4', (double) 0L, 0.0d, (double) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 1, (double) 'a', (double) 10.0f, (double) '#', (int) ' ', true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 1, (double) (-1L), (double) (short) 0, (double) 0.0f, (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) '#', (double) 0.0f, (double) (short) 10, (double) 100L, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) -1, 0.0d, (double) (-1L), (double) (-1L), (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) ' ', 0.0d, 1.0d, 0.0d, (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 100, (double) (short) 100, (double) 0, 100.0d, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 10, (double) '4', (double) '4', (double) 0.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 0, 10.0d, (double) (short) 1, 1.0d, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '4', (double) 0L, (double) 1.0f, (double) (byte) 1, 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) 'a', (double) '4', (double) (-1L), (double) 0, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '4', (double) 1L, (double) (byte) -1, (double) (byte) 1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 10, (double) (short) 100, (double) 10L, (double) (byte) 100, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 0, 0.0d, (double) (-1), (double) (byte) 0, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 10, (double) (-1L), (double) '4', (double) 10L, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 100, (double) (short) 0, (double) (short) 0, 1.0d, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) 'a', (double) 10, 0.0d, 0.0d, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 100, (double) 0, (double) 10.0f, (double) (short) 0, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 100, (double) (-1), (double) 1, (double) 'a', (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 1, (double) '4', (double) '#', (double) '#', 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) -1, 0.0d, 0.0d, (double) (short) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 10, (double) 100, (double) 1, (double) 100.0f, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 0, 10.0d, (double) (-1), (double) (byte) 0, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 10, (double) (short) -1, (double) 10, 0.0d, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 0, (double) (byte) 0, (double) 0, (double) (short) -1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 0, (double) (byte) 1, (double) (short) 1, (double) (-1L), 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 10, (double) (-1), (double) 1L, (double) 10, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 0, (double) 100.0f, (double) (-1.0f), (double) (short) 0, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (-1), (double) 1, (-1.0d), (double) 100.0f, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) 'a', (double) (-1L), (double) 1, (double) (short) -1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 0, (double) 100, (double) (short) 100, 0.0d, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (-1), (double) ' ', (double) ' ', (double) 10, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) -1, (double) 1.0f, (double) 0.0f, 1.0d, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 10, (double) (byte) 10, (double) (-1L), 100.0d, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 1, (double) (byte) -1, (double) (short) 10, (double) (byte) 1, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 0, (double) '4', (double) (byte) -1, (double) 0.0f, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 10, 0.0d, (double) '4', (double) (short) 100, (int) (short) 100, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 0, (double) (short) 0, (double) ' ', (double) 0, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) 'a', (double) 10.0f, (double) 1L, (double) (short) 1, (int) (byte) 10, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) -1, (double) 1, 1.0d, (double) (short) 100, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) 'a', (double) (short) 100, (double) (byte) -1, (double) 100.0f, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) ' ', 0.0d, (double) (byte) 0, (double) (short) -1, (int) '#', true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 0, (double) 0, 0.0d, (double) (-1L), (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 10, (double) (byte) -1, (double) 0.0f, (double) '#', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) ' ', (double) 0L, (double) 0, (double) (byte) -1, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 0, (-1.0d), (double) (byte) 1, (double) (byte) 0, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 0, (double) (-1L), (double) 0.0f, (-1.0d), (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 0, (double) 1.0f, (-1.0d), (double) (short) -1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 0, (double) 10.0f, (double) (short) 10, (double) 1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 100, (double) ' ', (-1.0d), (double) 100L, (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 1, (double) 0, (double) 100.0f, (double) 100.0f, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 0, (double) (short) -1, (double) (byte) 10, (double) '#', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) 'a', (double) (-1L), (double) 0L, (double) 10L, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) '#', (double) 1L, (double) (byte) 0, (double) (short) -1, (int) (short) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

