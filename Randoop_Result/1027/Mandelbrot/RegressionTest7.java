package Mandelbrot;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) 10, (-1.0d), (double) (-1), (double) (-1L), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) '#', (double) 100, (double) (short) 1, (double) 1.0f, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 100, (double) 10.0f, (-1.0d), (double) (-1), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 0, (double) 0.0f, (double) (short) 100, (double) (byte) 1, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) 0, (double) 100L, (double) (byte) 10, (double) (byte) -1, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 1, (double) 'a', (double) 10.0f, (double) '#', (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 100, (double) 1.0f, (double) 100L, (double) (short) 1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 10, (double) (byte) 10, (double) (byte) 0, 0.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) ' ', (double) 1.0f, (double) 10L, (double) (short) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) ' ', (double) '4', 0.0d, (double) (byte) 0, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 100, (double) (short) -1, (double) 1.0f, (double) (short) 100, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 100, 0.0d, (double) 0, 0.0d, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (-1), (double) 0L, (double) 10L, 0.0d, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 10, (double) 100L, (double) 10, (double) (byte) 1, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 100, 10.0d, (double) 100, (double) 1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 100, (double) (short) -1, (double) 1, (double) 100.0f, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 0, (double) 'a', (double) (-1), (double) (-1.0f), (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) -1, (double) (byte) 10, (double) (byte) 100, 0.0d, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 100, (double) (byte) 10, 0.0d, (double) 100L, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 1, (double) '#', (double) (byte) 100, (double) 10.0f, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) '#', (double) (byte) 10, (double) (byte) 1, (double) (byte) 100, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 100, (double) 100L, 0.0d, (double) (byte) 10, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 1, (double) (short) -1, (double) ' ', 0.0d, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 10, (double) 10L, (double) (short) 0, (double) 0.0f, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 0, (double) (byte) 10, (double) (byte) 100, (double) (-1), 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 100, (double) '#', (double) (-1), (double) (short) 100, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 0, (double) (short) -1, (double) (-1L), (double) (short) 0, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) 10, (-1.0d), (double) 1.0f, (double) (byte) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 0, (double) 100L, 10.0d, (double) (short) 1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 0, (double) (byte) 0, (double) (byte) 100, (double) (byte) 10, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 0, (double) 10, (double) (-1.0f), (double) (short) 100, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 10, (double) 0.0f, (double) 1.0f, (double) (short) -1, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 0, (double) 'a', 100.0d, 1.0d, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) '4', (double) 0.0f, (double) ' ', (double) (-1.0f), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 10, (double) '4', (double) 100, (double) 0L, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (-1), (-1.0d), (double) (byte) 0, 1.0d, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 100, (double) (-1L), (double) 0, (double) (-1.0f), (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 1, (double) (short) 0, (double) 0, (double) 0.0f, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 10, (double) 0.0f, (double) '4', (double) (byte) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 10, (double) (short) 1, (double) '4', (double) 100L, 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 0, (double) 'a', (double) 1, (double) '4', (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) ' ', (double) (byte) 10, (double) (-1), (double) 0L, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 10, (double) 1L, 0.0d, (double) (short) 10, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) -1, (double) 'a', (double) 100L, 10.0d, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 0, 0.0d, (double) (byte) 10, (double) (short) 10, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 100, (-1.0d), 1.0d, (double) (short) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 10, (double) (-1.0f), (double) '4', (double) (byte) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 1, (double) 10L, (double) ' ', (double) 10L, (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 1, (double) (byte) 1, (double) 1L, (double) (byte) 10, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) '#', (double) (-1.0f), (double) (short) -1, (double) 0.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 100, (double) (byte) 0, (double) 10L, (double) 10L, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 1, 0.0d, (double) 0.0f, (double) 10.0f, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 100, (double) 10L, 0.0d, (double) 100L, 1, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 10, (double) 0L, (double) 100L, (double) 0L, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 10, (double) (-1.0f), (double) (short) 10, (double) '#', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) -1, (double) '#', 0.0d, (double) (byte) 10, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 1, (double) (short) 1, (double) 100, (double) 0.0f, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 100, (double) (-1L), (double) (byte) 100, (double) 1L, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 1, (double) (short) -1, (double) '#', (double) 0.0f, (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 0, (double) 'a', (double) (byte) 0, 1.0d, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) -1, (double) 100L, (double) (byte) 100, (double) 'a', (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) '4', (double) (byte) 0, (double) 10.0f, (double) 1L, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) -1, (double) 10.0f, (double) (short) 100, (double) (-1), (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 0, (double) 100L, (double) (-1L), (double) 100.0f, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) '4', (double) 1, (double) 100.0f, (double) (-1L), (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) 'a', (double) '4', (double) (byte) 100, 1.0d, (int) '#', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) ' ', (double) 0L, (double) (-1L), (double) (byte) 100, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 10, (double) 0, 1.0d, (double) '4', (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) '4', 1.0d, (double) 1, (double) (short) 100, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 1, (double) 10L, (double) 10, (double) '#', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) 0, (double) (short) 10, (double) (byte) 1, (double) 100L, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 1, (double) (short) 0, (double) 0.0f, (double) (-1.0f), (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '#', 0.0d, (double) (-1), (double) 0.0f, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) 'a', (double) (short) 1, (double) ' ', 0.0d, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 100, (double) (byte) 0, (double) (byte) 1, (double) '4', (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 100, (double) 'a', (double) (short) 1, (double) '#', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) -1, (double) 10.0f, (double) (short) 1, (double) 1.0f, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 1, (double) 10, (double) '4', (double) (short) 1, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 100, (double) '#', (double) (short) 10, (double) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 0, (double) 1L, (double) (byte) 100, (double) (byte) 1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) -1, (double) (byte) -1, 10.0d, (double) 10L, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 10, (double) 100.0f, (double) 0, (double) (short) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) '#', (double) (short) 100, (double) 10, (double) '4', (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) '#', (double) (short) 1, (double) 0L, (double) 1.0f, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 10, (double) (byte) -1, (double) 1, (double) 0L, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 0, (double) (short) 10, (double) 1L, (-1.0d), 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 100, (double) '#', (double) 100.0f, (double) (-1.0f), (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 1, (double) (short) 10, (double) 100, (double) (short) -1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) -1, (double) ' ', (double) 100.0f, (-1.0d), (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 10, (double) (-1), 0.0d, 100.0d, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 0, (double) 10, (double) 0.0f, (double) 0, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 1, (double) (byte) -1, (double) 100.0f, (double) 100.0f, 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) '#', 10.0d, (double) 100.0f, (double) 10, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '4', (double) 1L, 100.0d, (double) 10L, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 1, (double) 0.0f, 0.0d, (double) (byte) -1, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 100, (double) 100.0f, (double) 10.0f, (double) (short) -1, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) '#', (double) (byte) 10, (double) 'a', (double) (byte) 1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 10, (double) 100, (double) (short) 0, (double) (short) 1, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 0, (double) 100, (double) 1, (double) 10, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) '4', (double) '4', (double) (byte) -1, 100.0d, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 100, (double) 10, (double) 100.0f, (double) 10L, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 10, (double) 0, (double) 10L, (double) 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) 'a', (double) (byte) 0, 1.0d, 1.0d, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) 'a', (double) 0L, (double) (short) 100, (double) 0, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 0, 100.0d, (double) 'a', (double) (byte) 100, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) '4', (double) 100L, (double) (-1), (double) 10, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 10, (double) 10, (double) (short) 0, (double) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) 1, 100.0d, (double) '4', (-1.0d), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 10, (double) 100, (double) (-1), 1.0d, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 0, (double) (-1), (double) 1, (double) 100.0f, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 100, (double) 'a', (double) (byte) 10, 0.0d, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 1, (double) (-1), (double) (-1), (double) 0.0f, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) '#', (double) (-1.0f), (double) 10L, (double) ' ', (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 0, (double) (byte) -1, (double) 'a', (double) (-1.0f), (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) 'a', 0.0d, (double) 100, (double) (short) 10, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 0, 10.0d, (double) (-1.0f), (double) (byte) -1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) ' ', 0.0d, 10.0d, (double) ' ', (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) '#', (double) (byte) 10, (double) 100L, (double) (byte) 10, (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) '#', 0.0d, (double) (short) 0, (double) 0, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 1, (double) (short) -1, (double) 1, (double) (short) -1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 0, (double) (byte) 0, (double) (short) 10, (double) (byte) 10, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 1, (double) 1.0f, (double) (byte) 10, (double) 100.0f, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 100, (double) (byte) -1, (double) 10, (double) 100, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 10, 0.0d, 1.0d, (double) (short) -1, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) '4', 100.0d, 0.0d, (double) ' ', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 100, (double) 10, (double) (-1), (double) (byte) 10, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 100, (double) (short) 0, 1.0d, 100.0d, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 1, (double) (short) 100, (double) (short) -1, 0.0d, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 10, (double) (short) 100, 0.0d, (double) 1.0f, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) 0, (double) (-1), (double) (-1L), (double) 10L, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 100, (double) 100L, (double) (short) 100, (double) 100.0f, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 100, (double) (-1.0f), (double) 10L, (double) (-1), 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 100, (double) (byte) 10, (double) 1.0f, (double) 10.0f, (int) (short) 100, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (-1), (double) (short) 1, (-1.0d), (double) (byte) 1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (-1), (double) (byte) 1, (double) 100, (double) '#', 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (-1), (double) 'a', (double) (-1.0f), (double) (byte) 10, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) 10, (double) '#', 0.0d, (double) (short) -1, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) -1, 0.0d, (double) 100L, (double) (byte) 0, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 100, (double) (short) 100, (double) (short) 100, (double) (short) 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 0, (double) (short) 10, (double) 0.0f, 100.0d, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) 'a', (double) '4', (double) (short) 100, (double) '#', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (-1), 10.0d, (double) (-1), 0.0d, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 0, (double) (short) 100, (double) 10, (double) '#', (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) 0, (double) (-1L), (double) ' ', (double) (-1), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 0, (double) 10L, (double) 100.0f, (double) (short) 10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 10, (double) (byte) 0, 100.0d, (double) (byte) -1, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 1, (double) (byte) -1, (double) 10.0f, (double) (short) 100, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '#', (double) (byte) -1, (double) 'a', (double) (short) 0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) '4', (double) 1, (double) (-1), (double) (short) 100, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 1, (double) 0, (double) (-1L), (double) (short) 0, (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) '4', (double) (byte) -1, (double) 'a', 0.0d, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) 1, (double) (short) 1, 0.0d, 0.0d, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 10, (double) '#', 10.0d, (double) 0, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 0, (double) (short) 100, (double) (short) 1, (double) (byte) 10, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) 0, (double) 100, (double) '#', (double) 0L, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) -1, 10.0d, (double) 0, (double) '#', 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 0, (double) (short) -1, (double) '#', (double) (short) 1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 100, (double) (byte) 10, (double) 100L, (double) (short) 100, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) -1, (double) (byte) 100, (double) 0.0f, (double) (-1.0f), (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 10, (double) '#', 1.0d, (-1.0d), (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '4', (double) (byte) -1, (double) '#', 0.0d, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 0, (double) (-1), (-1.0d), 100.0d, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 0, (double) 0.0f, (double) 100L, (double) (byte) -1, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 100, (double) 0.0f, (double) '#', (double) 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 10, (double) (byte) 10, 1.0d, (double) 10.0f, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) '#', (double) 100L, (double) 100.0f, 0.0d, 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) -1, (double) 1L, (double) (byte) 100, (double) (-1), (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) ' ', (double) 10L, (double) 100, (double) 10, (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 100, (double) 100L, 10.0d, (double) 100.0f, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) ' ', (double) 100, (double) (byte) 10, (double) 0L, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 1, (double) 10.0f, (-1.0d), (double) (-1), 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 0, (double) (-1), (double) 100, (double) (-1.0f), (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) 1, (double) (short) 1, 0.0d, (double) (short) 100, (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 100, (double) 0.0f, (double) (short) 100, (double) 0L, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 1, (double) 1.0f, (-1.0d), (double) 0, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 100, (double) (byte) 1, 100.0d, (double) (short) 10, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) -1, (double) 100, (double) (short) -1, (double) 0.0f, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) 0, (double) 1L, (double) (short) 100, (double) (-1L), (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (-1), (double) 100, 10.0d, (double) (short) 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 1, (double) (byte) 10, 0.0d, (double) 100.0f, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 100, (double) (short) 0, (double) '4', (double) 'a', 10, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 0, (double) (byte) 100, (double) (-1L), (double) 1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 0, 10.0d, 0.0d, (double) (short) -1, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 1, (double) '#', (double) (byte) 0, (double) (short) 100, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (-1), (double) (-1L), (double) (-1L), 100.0d, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) ' ', (double) (short) -1, (double) (byte) -1, (double) 10L, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 0, (double) (-1), (double) (byte) 0, (double) 0L, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 1, 0.0d, (double) 100.0f, (double) '4', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) ' ', (double) (byte) 10, (double) 1L, (double) 100L, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 100, (double) (-1L), (double) (short) -1, (double) (byte) 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 0, (double) 10, (double) (short) -1, 100.0d, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 10, (double) 10.0f, (double) (short) 100, (double) (-1L), 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 0, (double) 0, (double) (short) 10, 0.0d, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) ' ', (double) 100L, (double) '#', (double) 'a', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 0, (double) (byte) 10, (double) 100, (double) (byte) 0, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) -1, 0.0d, (double) (byte) 100, (double) (byte) -1, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) -1, (-1.0d), 100.0d, 0.0d, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) 'a', 1.0d, (double) (short) 0, (double) 1L, (int) '#', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 0, (double) (byte) 0, (double) (byte) -1, (double) '4', (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 10, (-1.0d), (double) 'a', (double) 100L, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 1, (double) (byte) 0, (double) ' ', (double) 1.0f, 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) ' ', (double) (short) 1, (double) 0, (double) 100L, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) 'a', (double) (byte) 10, (double) (-1), (double) '#', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) 'a', 0.0d, 0.0d, (-1.0d), (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 1, (double) (byte) -1, (double) 0.0f, (double) (short) 100, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 1, (double) '#', (double) ' ', (double) (short) 0, (int) '#', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (-1), (double) (short) 10, (double) 0.0f, 0.0d, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) '#', (-1.0d), (double) '4', (double) 1L, 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 0, (double) (byte) 0, 0.0d, 0.0d, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 0, (double) 10L, (double) (byte) 100, (double) (byte) 100, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) ' ', 0.0d, (double) 100, (double) (short) 10, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 1, 0.0d, (double) (short) 10, 10.0d, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) 100, (double) (-1L), (double) (short) 100, (double) (short) 100, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) -1, (double) (-1.0f), (double) (byte) 10, (double) (short) 10, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 10, 1.0d, 1.0d, (double) (short) 0, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) 'a', (double) (byte) -1, (double) (byte) 0, 1.0d, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 1, (double) 10, (double) 1L, (double) 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (-1), (double) (byte) 10, (double) 10, (double) (byte) 10, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 100, (double) (-1.0f), 100.0d, (double) '#', (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 1, (double) 0, (double) ' ', (double) (short) 10, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) '4', (double) 0L, (double) 100, 100.0d, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 10, (double) 1, (double) 0, (double) 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 0, (double) (byte) 0, (double) 0, 1.0d, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (-1), (double) (byte) 100, 100.0d, (double) 100, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) -1, (double) 10, 0.0d, (double) 1, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 100, (double) 1.0f, (double) 1L, (double) (-1.0f), 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 0, (double) 1L, 100.0d, (double) 'a', (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) -1, (double) (byte) 10, 0.0d, (double) 100L, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 100, (double) 0.0f, 100.0d, (double) (short) 1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 10, (double) (-1.0f), 1.0d, (double) (short) 0, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 0, 10.0d, 0.0d, (double) (short) 100, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) 'a', (double) 1L, (double) 10, (double) (byte) 0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 10, (-1.0d), (double) 1L, (double) 1.0f, (int) ' ', true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (-1), (double) (short) 1, (double) 0.0f, (double) 1L, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) ' ', 100.0d, (double) (byte) 1, (double) (-1.0f), (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 10, (double) (byte) 10, 10.0d, 0.0d, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 100, (double) (short) -1, 0.0d, (double) '#', (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 10, (double) (-1), (double) (byte) -1, (double) (short) 0, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 10, (double) '#', 0.0d, (double) (-1), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 100, 100.0d, (double) (byte) 10, (double) (short) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 10, (double) (short) -1, (double) (byte) 10, (double) '#', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 10, (double) (-1.0f), (double) 1.0f, (double) (byte) -1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) '#', 10.0d, (double) 100, (double) 100L, 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 0, (double) 10.0f, 1.0d, (double) (byte) 1, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 0, (double) (byte) 10, 100.0d, (double) (byte) -1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 10, (double) (short) 1, (double) (short) 0, (double) 10.0f, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) -1, (double) '4', (double) (byte) 100, 0.0d, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 10, (double) 'a', (double) 1L, (double) (byte) 10, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 1, (double) 10L, (double) (short) -1, (double) (short) 0, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 0, (double) 100L, (double) (-1), (double) (-1), 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 100, (double) (byte) -1, 100.0d, (double) 1.0f, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) ' ', 0.0d, (double) 1, (double) (-1.0f), 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 1, 0.0d, 100.0d, 0.0d, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 10, (double) (-1L), 1.0d, 0.0d, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) 0, (double) 0, 0.0d, (double) (-1.0f), (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) -1, (double) ' ', (double) 100L, (double) 0.0f, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 100, (double) (byte) 10, (double) (-1.0f), (double) 100L, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 100, (double) (short) 100, 10.0d, 0.0d, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 1, (double) 1, (double) (short) -1, (double) 0L, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) 1, (double) (short) 10, (double) (short) 100, (double) (byte) 0, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 100, (double) '#', (double) (-1L), (double) '4', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) -1, (double) (byte) 10, 0.0d, (double) 1L, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) ' ', (double) 1.0f, 100.0d, (double) 0.0f, 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 1, (double) 100.0f, (double) 100.0f, (double) (-1L), (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '#', (-1.0d), (double) (byte) 1, (double) (byte) -1, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (-1), (double) (short) 1, 10.0d, (double) 100, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) '4', (double) (byte) 10, (double) (short) 100, (double) 1.0f, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 100, (double) (byte) -1, (double) 10.0f, (double) 10.0f, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) '#', 0.0d, (double) (short) 10, 1.0d, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 10, (double) 1L, (double) 10.0f, 0.0d, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (-1), 0.0d, (double) (short) 1, (double) 1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) '4', (double) 0, (double) (byte) 100, 100.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) 'a', (double) (short) 0, (double) 0.0f, 0.0d, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 0, (double) 0, 10.0d, 1.0d, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) -1, (double) (byte) 1, 0.0d, (double) '#', (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) -1, (double) 0, (double) (-1L), (double) (-1), (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 100, (double) 10, (double) (-1L), (double) (-1.0f), 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 1, (double) 1.0f, (double) 100, (double) (-1), 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 0, (double) 100L, (double) (short) -1, (double) 100, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 100, (double) 10L, (double) 10, (double) 100, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) 'a', (double) 0, 100.0d, (double) ' ', (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 10, (double) (short) -1, (-1.0d), (double) 10.0f, 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 0, 0.0d, 10.0d, (double) 10L, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) -1, (double) (short) -1, (double) (byte) 0, (double) (short) 1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 0, (double) ' ', 0.0d, 1.0d, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) -1, (double) 100L, (double) 10, (double) (-1L), (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) -1, (double) (byte) -1, (double) 1L, (double) (byte) -1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) -1, (double) 1L, (double) 100.0f, (double) 1, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (-1), (double) 10, 10.0d, 0.0d, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 0, (double) (byte) 100, 1.0d, 1.0d, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (-1), (double) ' ', 0.0d, (double) 100L, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) -1, (double) (byte) -1, (double) (byte) -1, (double) (short) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) -1, (double) 100L, (double) (short) 1, (double) 10.0f, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) -1, (double) 'a', 100.0d, (double) 10L, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) -1, 0.0d, (double) (byte) -1, 10.0d, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 0, (double) ' ', (double) 0L, (double) (short) 10, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 100, (double) (byte) 0, 100.0d, (double) 10L, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '4', (double) 100, (double) 100.0f, 0.0d, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 0, (double) 100L, (double) '#', 0.0d, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 100, (double) 100, (double) (short) 1, (double) (byte) -1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) -1, (double) 100L, (double) ' ', (double) ' ', 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) '4', (double) 'a', (double) (byte) 100, 1.0d, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 0, (double) 10L, (double) 100L, 0.0d, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 1, (double) ' ', (double) 10.0f, (double) 0L, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (-1), (double) (-1), (double) ' ', (double) (-1), (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) '#', (double) (-1.0f), (double) 0, (double) (short) 1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 10, 100.0d, (double) '4', 10.0d, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 100, (double) (-1.0f), (double) ' ', (-1.0d), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 0, 0.0d, (double) 1L, (double) 100.0f, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) -1, (double) (byte) 10, (double) 'a', (double) (byte) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) 10, (double) (short) 0, 1.0d, (double) '4', (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 0, (double) 10L, (double) 10, (double) 10, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 100, (double) 0.0f, (double) 0.0f, (double) (-1L), (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 100, (double) 1, (double) (byte) 0, (double) 1.0f, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 100, (double) (short) -1, (double) 10, (double) (short) 1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 10, (-1.0d), 0.0d, (double) 10.0f, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) 1, (double) (short) -1, 0.0d, (double) 1L, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) 'a', (double) 1, (double) (short) 0, (double) (byte) -1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 100, (double) ' ', (double) 0.0f, (double) ' ', (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) '4', 1.0d, (double) 'a', (double) 1.0f, (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) '4', (double) 1, (double) (short) 0, 0.0d, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 0, 10.0d, (double) (short) 1, (double) (byte) 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) -1, (double) 1L, (double) (byte) -1, (double) (short) 100, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 0, (double) 10L, 0.0d, (double) (-1), (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) ' ', 1.0d, (double) 100L, (double) 100L, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 100, (double) 10.0f, (double) 0.0f, (double) 100.0f, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 10, (double) (short) 10, (double) 100, (double) 100.0f, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 10, (double) 1, (double) (byte) 100, (double) (byte) -1, 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 100, (double) 1L, (double) (-1.0f), (double) (short) 1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (-1), 10.0d, (double) 10.0f, (double) (byte) 0, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) ' ', (double) 0, (double) (short) 0, (double) (-1.0f), (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) '#', (double) 1, 100.0d, (double) (short) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 10, (double) 10L, (double) 100, 1.0d, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 10, (double) (short) 10, (double) (byte) 0, (double) 1, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) 'a', (double) (byte) 1, (double) 100, (double) 10, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 0, (double) 100, (double) 10L, (double) ' ', (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 1, (double) 100L, (double) 1L, (double) (byte) 10, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) -1, (double) 1.0f, (double) 0L, (double) '#', (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 0, (double) 1.0f, (double) (short) 10, (double) (short) 10, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 10, (double) 0L, (double) 100, (double) 100L, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (-1), (double) (byte) 100, (double) (byte) 0, (double) 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) -1, (double) 100L, (double) (byte) 10, (double) 100, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) -1, (double) 10L, 0.0d, 0.0d, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) 'a', (double) 1.0f, (double) (byte) 1, (double) '#', (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 100, (double) (short) 0, (double) (-1L), (double) '#', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) 'a', (double) 10L, (double) (short) 0, (double) 100.0f, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) 1, 100.0d, 1.0d, (double) (short) 100, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) 'a', 0.0d, 10.0d, (double) (-1.0f), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 100, (double) ' ', (double) 0.0f, (double) (byte) 100, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 1, (double) (byte) 0, (double) 10.0f, (double) 10, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 1, (double) ' ', 10.0d, (double) (byte) 10, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) -1, (double) (-1), (double) 100L, (double) (byte) 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) 10, (double) (short) 1, (double) (-1), (double) (-1), (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 10, (double) 0L, (double) 0, 100.0d, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 100, (double) '#', (double) (byte) 0, (double) 0, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 1, (double) '4', (double) 10, (double) (byte) 0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 100, (double) (short) 100, (double) 10, (double) (-1.0f), (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 0, (double) 0, 10.0d, (double) 10, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (-1), (double) '#', 0.0d, (double) 100, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) '4', (double) (byte) 1, (double) 'a', (double) 0.0f, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) '4', (double) (-1), 100.0d, (double) 0L, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) -1, (double) (-1.0f), (double) (byte) -1, 1.0d, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) '#', (double) 1.0f, (double) 10L, 0.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 100, (double) 10L, (double) '4', (double) 0L, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) '#', (double) 10L, (double) 10.0f, 0.0d, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 10, 0.0d, (double) '4', (double) 100, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 0, (double) 100, (double) ' ', (-1.0d), (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) -1, (double) (-1L), (double) (short) 0, (double) ' ', (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) 'a', (double) (short) -1, (double) (-1.0f), (double) (byte) 0, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 10, (double) 1, (double) 0, (double) (byte) 100, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 10, (double) ' ', (double) (byte) 0, (double) (-1.0f), (int) (short) 100, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 0, 1.0d, (double) (byte) -1, (double) 1, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '#', (double) 0, (double) 100L, (double) 10L, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 1, (double) 'a', (double) 0.0f, (double) 10L, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 1, (double) '#', (double) 0, (double) 1L, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) -1, (double) (byte) 10, 10.0d, (double) 100.0f, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) 'a', (double) 10.0f, (double) (-1.0f), (double) 'a', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 0, (double) 10.0f, 100.0d, (double) (byte) 0, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 1, (double) 100, (double) (-1L), 0.0d, (int) ' ', true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) -1, (double) '4', (double) (-1.0f), (double) (short) 0, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 0, (double) 1.0f, (double) (short) 10, (double) (-1L), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 100, (double) (-1), (-1.0d), 10.0d, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 1, (double) 100.0f, (double) (short) 10, 0.0d, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 100, (double) (-1.0f), 10.0d, (double) 1L, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) 1, (double) (short) 10, (double) 0, (double) 1.0f, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) ' ', 0.0d, (double) (byte) 100, (double) (short) 0, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 1, (double) (short) 1, (double) (short) 10, (double) (-1L), (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 0, (-1.0d), (double) (short) 0, (double) 10, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (-1), (double) (-1), (double) (byte) -1, (double) ' ', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 10, 0.0d, (double) ' ', (double) 100, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 10, (double) (byte) -1, (double) (short) 1, (double) (byte) 100, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 1, 0.0d, 100.0d, (double) 1, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 0, (double) 0L, (double) (short) 10, 100.0d, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 0, (double) 100.0f, (double) (short) 1, (double) (short) 1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 1, 10.0d, (double) (short) 0, 100.0d, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 10, (double) 0.0f, (double) 100.0f, (double) (short) 1, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 0, (double) 1, (double) 1.0f, (double) 100L, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 100, (double) (byte) 100, 1.0d, (double) (short) 0, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 0, (double) '4', (double) (byte) 1, (double) (short) 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (-1), (double) (short) -1, 10.0d, (double) ' ', (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 0, 0.0d, 0.0d, (-1.0d), (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 100, (double) (byte) 10, (double) (byte) 0, (-1.0d), 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 1, 0.0d, (double) (-1L), (double) 10, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 0, (double) 'a', 0.0d, (double) 0.0f, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 100, (double) (short) -1, (double) 0.0f, (double) 10, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) '#', (double) (byte) 1, (-1.0d), (double) (byte) 0, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) 'a', (double) (byte) 0, (double) (-1L), (double) 10.0f, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 1, (double) '4', (double) (byte) 10, (double) 1L, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) '4', (double) 1.0f, (double) 0, (double) (short) 100, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 0, (double) (-1), (double) 1.0f, (double) (short) -1, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) -1, (double) 1, (double) (byte) 10, (double) (short) 1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 1, (double) 1, (-1.0d), (double) (short) 10, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 0, (double) (short) 100, (double) 0.0f, (-1.0d), (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 100, (double) (byte) 0, 0.0d, (double) 10, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) -1, (double) (short) 100, 100.0d, (double) (short) 1, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) -1, (double) 100L, (double) ' ', (double) (byte) 0, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 10, (double) 10L, (double) 1, (double) 0L, (int) (short) 10, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 1, (double) '4', (double) '4', (double) 1, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) '4', (double) 1, (double) 1, (double) (short) -1, 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) '#', (-1.0d), (double) 100L, 100.0d, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) 'a', 0.0d, (double) (-1.0f), (double) (-1.0f), (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) -1, 1.0d, (double) ' ', (-1.0d), (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 10, (double) (byte) 10, (double) 'a', (double) (byte) -1, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) 0, (double) 100L, (-1.0d), (double) 1.0f, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) ' ', (double) (byte) 100, 100.0d, (double) 0L, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 0, 100.0d, (double) (byte) 1, (double) 0, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 10, (double) 1, (double) (short) 100, 0.0d, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 10, (double) (byte) 0, (double) 10L, (double) 100, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 0, (double) 10.0f, (double) ' ', (double) 100L, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 0, (double) '4', 100.0d, 0.0d, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 10, (double) (byte) 0, (-1.0d), (double) 10, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (-1), (double) (-1), (double) (short) 1, (double) 100.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 0, (double) 100, (double) (-1.0f), 0.0d, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 0, (double) (short) -1, (double) 10, (double) (byte) 100, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 100, 0.0d, (double) (short) 10, (double) (byte) 10, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 0, (double) 10.0f, (double) 100.0f, 0.0d, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 0, (double) 1.0f, (double) 1, 0.0d, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) 'a', (double) 10L, (double) 0.0f, (double) 0L, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 0, (double) 1L, (-1.0d), (double) 1L, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 1, 1.0d, (double) (-1.0f), (-1.0d), (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 100, (double) 1.0f, (double) (-1), 0.0d, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) '4', (double) 100.0f, (double) 0L, (double) 0.0f, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 1, (-1.0d), (double) (byte) 10, (double) 10, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 0, (double) (-1L), (double) '4', (double) (short) -1, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 100, (double) (byte) -1, (double) 'a', (double) (-1L), (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 100, 10.0d, 0.0d, 0.0d, (int) '#', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) -1, (double) '#', (double) 0.0f, (double) 0, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) -1, (double) 100L, (double) (byte) -1, 0.0d, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 100, 100.0d, (double) (byte) 100, (double) 10, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 100, (double) (short) 10, (double) (-1), 10.0d, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (-1), (double) 0.0f, (double) (-1L), (double) (-1.0f), (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 1, 1.0d, (double) 100.0f, (double) (-1.0f), (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '4', (double) 100.0f, (double) '#', (double) 10L, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) '#', (double) '4', 0.0d, (double) (-1L), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) -1, 0.0d, (double) 0, (double) (-1), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) '4', (double) 0.0f, (double) (short) 0, (double) 10L, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 10, (double) (byte) 10, (double) (byte) 0, (double) 0L, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 10, (double) 0L, (double) 100, (double) (byte) 1, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 1, 1.0d, (double) (short) 100, (double) (short) 100, (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 0, 0.0d, 0.0d, (-1.0d), 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 0, (double) 0, (double) (-1L), 0.0d, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 1, (double) 100.0f, (double) 1L, (double) 100.0f, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (-1), 0.0d, (double) (-1), (double) (byte) 1, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 1, (double) (short) 100, (double) 100, (double) (-1L), 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) -1, (double) (short) 10, (double) (byte) 0, (double) 100.0f, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) 'a', (-1.0d), (double) (short) 10, (double) 0L, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) -1, (-1.0d), (double) (-1.0f), (double) (short) 0, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (-1), (double) (-1L), (double) (byte) 0, (double) 0, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 10, (double) 100.0f, (double) (-1.0f), (double) 1, (int) (short) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) '#', (double) 10.0f, (double) (short) 10, (double) (byte) 1, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 0, (double) (short) -1, 0.0d, 10.0d, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (-1), (double) 100.0f, (double) (short) 0, (double) 10L, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 0, (double) (short) 100, (double) (byte) 1, (double) (byte) 100, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 0, (double) 0.0f, (double) (byte) 10, 0.0d, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 100, (double) (short) 100, (double) (byte) 10, (double) (short) 0, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 10, (double) (byte) 10, (double) 10, (double) (-1.0f), (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) '#', (double) 0L, (double) 1L, (double) 1.0f, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) '4', (double) 10L, (double) (-1), (double) '4', (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 1, (double) 0L, (double) 100.0f, (double) (short) 10, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 1, (double) (short) 100, (double) (-1.0f), (double) 1, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 10, (double) (short) -1, (double) (-1L), (double) (-1), (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 100, 1.0d, 1.0d, (double) (byte) 1, (int) '#', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 1, (double) 10, (double) 1.0f, (double) 1L, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) '#', (double) (short) 100, (double) (-1), (double) 10L, (int) '#', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) 1, (double) (-1), (double) 10.0f, 0.0d, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 1, (double) (byte) 0, (double) 100, 0.0d, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 10, (double) (-1.0f), (double) (byte) -1, (double) 100L, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (-1), (double) 100L, (double) (byte) 10, (double) (short) 10, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) '#', (double) 10, (double) 0L, (double) 1L, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 10, 0.0d, (double) (-1.0f), (double) (-1L), (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 1, 1.0d, (double) (short) -1, (double) (byte) 0, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 1, (double) (byte) 1, (double) 1L, (double) '#', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 100, 1.0d, (double) 100.0f, (double) (byte) 10, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) 'a', (double) 100L, (double) 100.0f, 0.0d, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 100, (double) 1.0f, (double) (byte) 10, (-1.0d), 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) 1, (double) 10.0f, (double) (short) 1, (double) 1, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 100, 0.0d, (double) (-1.0f), (double) 100.0f, 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 0, (double) (-1), (double) '4', (double) 100.0f, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) -1, 0.0d, (double) (short) -1, (double) (byte) 1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 0, (double) '#', 0.0d, (double) 100.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

