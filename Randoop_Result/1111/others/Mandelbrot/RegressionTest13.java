package others.Mandelbrot;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test06501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06501");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 1, (double) (byte) 10, (double) 100.0f, (double) 0, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06502");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 10, (double) 100.0f, 0.0d, (double) 1.0f, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06503");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 100, 10.0d, (double) 1.0f, 100.0d, (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06504");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 0, (double) (byte) 0, (double) '#', (double) 10L, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06505");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) -1, (double) (short) 0, (double) (short) 0, (double) 0L, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06506");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) -1, (double) '#', (double) 100.0f, (double) 1.0f, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06507");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 1, (double) '#', (double) (short) 1, (double) 1.0f, (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06508");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 0, (double) (-1), (double) 100.0f, (double) 10, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06509");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 1, 0.0d, (double) '4', (double) (short) 100, (int) ' ', true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06510");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 10, (double) '4', (double) 10L, (double) 1.0f, (int) (byte) 10, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06511");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) -1, (double) 10.0f, (double) (byte) 1, (double) (short) 1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06512");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) ' ', 0.0d, (double) 'a', (-1.0d), (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06513");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 0, (double) 10, (double) (short) 1, (double) 1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06514");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) -1, 1.0d, 0.0d, (double) (short) -1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06515");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 100, (double) (-1L), (double) (-1), (double) (byte) -1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06516");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 1, (double) 10.0f, (double) (byte) 1, 0.0d, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06517");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 0, 0.0d, (double) 10.0f, (double) (-1), (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06518");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 100, (double) (short) -1, (double) '#', (double) (byte) 1, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06519");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 100, (double) (short) 100, (double) 100.0f, (double) 100L, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06520");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 1, (double) (byte) 0, (double) (short) 0, (-1.0d), (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06521");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) '4', (double) (byte) 100, (double) (short) 0, (double) 0.0f, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06522");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 100, (double) 0.0f, (double) (byte) 1, (double) 0L, 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06523");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 10, (double) (byte) 1, (double) 0, 10.0d, (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06524");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) 'a', (double) (byte) 100, (double) (byte) 100, (double) '4', 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06525");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 100, (double) (-1), (double) (-1), 100.0d, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06526");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 10, (double) '#', (double) (-1.0f), (double) (byte) -1, (int) (short) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06527");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 0, (double) 10.0f, (double) 'a', (double) (-1.0f), (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06528");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 10, (double) 1L, (double) 100.0f, (double) (short) 0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06529");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 10, (double) 0L, (double) (short) -1, (-1.0d), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06530");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 0, 1.0d, (double) 1.0f, (double) (short) 1, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06531");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 10, (double) 100, (double) (-1.0f), 0.0d, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06532");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 10, (double) (short) 1, (double) (short) 0, (double) 'a', (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06533");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 0, (double) (short) 100, (double) 1, (double) '4', (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06534");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 10, (double) 0, (double) 0, (double) (byte) 1, (int) '4', true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06535");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 10, (double) 0, 0.0d, 0.0d, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06536");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) 'a', (double) 1.0f, 10.0d, 0.0d, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06537");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) -1, 0.0d, (double) (byte) 100, (double) (short) 1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06538");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) 'a', 0.0d, (double) 1.0f, (double) (-1.0f), (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06539");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) 'a', (double) (-1L), (double) (short) 1, (double) 10L, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06540");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) 'a', (double) (short) 100, (double) 'a', (double) 1, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06541");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 0, (-1.0d), (double) 10.0f, (double) (byte) 1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06542");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 0, 100.0d, (double) 100.0f, 0.0d, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06543");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 10, 0.0d, 10.0d, 10.0d, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06544");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (-1), (double) (short) 1, (double) 100, (double) 10.0f, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06545");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) -1, (double) 0L, (double) (byte) 0, (double) (-1.0f), 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06546");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (-1), 0.0d, (double) (byte) 0, (double) (-1L), (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06547");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 1, (double) ' ', (double) (short) 0, (double) (byte) -1, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06548");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 0, (double) 10L, (double) (short) 10, (double) '#', (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06549");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) -1, (double) (byte) 0, (double) (byte) 10, (double) 1, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06550");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 10, (double) 10L, (double) ' ', (double) 0, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06551");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 100, (-1.0d), (double) 10L, (double) (short) 1, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06552");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 100, (double) (byte) 100, (double) (byte) 1, 10.0d, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06553");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) ' ', (double) 100L, (double) (byte) 100, (double) 'a', (int) (short) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06554");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) ' ', (double) 'a', (double) 10, (double) 0L, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06555");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 1, (double) (byte) 100, (double) 1L, (double) 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06556");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (-1), (double) (-1), 1.0d, (double) 1.0f, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06557");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 10, (double) (-1L), (double) (-1.0f), (double) (short) 10, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06558");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) '4', (double) (short) 10, 1.0d, (double) 0.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06559");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) ' ', (double) (byte) 10, (double) (-1L), (double) (byte) 100, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06560");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 10, (double) '#', 0.0d, 100.0d, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06561");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (-1), 100.0d, 1.0d, (-1.0d), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06562");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) -1, (double) (-1L), (double) (-1), (double) 'a', (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06563");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 10, (double) 100L, (double) (short) 1, (double) (byte) -1, (int) '#', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06564");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) -1, (double) 100L, (double) 10, (double) 0.0f, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06565");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) -1, (double) (byte) 100, (double) 1L, (-1.0d), (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06566");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 1, (double) (byte) 10, 0.0d, (double) (byte) 10, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06567");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) 'a', (double) 1L, (double) (byte) 100, (double) 'a', 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06568");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 10, (double) 0, (double) (-1), (double) 1.0f, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06569");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) ' ', (-1.0d), (double) 10, (double) 100, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06570");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) ' ', (double) (byte) 1, (double) (short) 10, 100.0d, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06571");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 10, (double) 0, 1.0d, (double) ' ', (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06572");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 1, (double) 10L, (double) (byte) 10, (double) 100.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06573");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) ' ', (double) (short) 100, (double) 0.0f, (double) 0, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06574");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 0, (double) (byte) 100, (-1.0d), (double) (-1L), (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06575");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 1, 0.0d, (double) (byte) 0, (double) (byte) 1, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06576");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) 100, 100.0d, (double) 100, (double) (byte) 1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06577");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 0, (double) 100, 10.0d, (double) ' ', (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06578");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 100, (double) (byte) 1, (double) 10, (double) 0.0f, 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06579");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 10, (double) 100, 1.0d, (-1.0d), 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06580");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) -1, 1.0d, (double) ' ', (double) ' ', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06581");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 10, 0.0d, (double) (short) 0, (double) (-1L), (int) (byte) 1, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06582");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (-1), 1.0d, (double) (short) 10, (double) 1.0f, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06583");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) '#', (double) 0L, 100.0d, (double) ' ', (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06584");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) 10, (double) (-1), (double) (-1), (double) (byte) 10, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06585");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 10, (double) (short) 10, (double) (byte) 100, 0.0d, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06586");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) ' ', (double) '#', (double) (byte) 0, (double) 0, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06587");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 100, (double) (byte) 10, (double) 'a', 1.0d, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06588");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 1, (double) (short) 100, (double) (byte) 1, (double) '#', (int) 'a', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06589");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 1, (double) 100, (double) 'a', (double) (short) 0, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06590");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 0, (double) (byte) 10, 10.0d, (double) 1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06591");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) ' ', (double) 0L, (double) 1, (double) ' ', (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06592");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) -1, (-1.0d), (double) 0.0f, (double) 1L, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06593");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) '#', (-1.0d), (double) 1.0f, (double) 1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06594");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 10, (double) (short) 1, (double) (-1.0f), (double) ' ', (int) (short) 1, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06595");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 100, 0.0d, (double) 1L, (double) 10.0f, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06596");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 1, (double) (-1L), (double) 100, (double) (byte) 1, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06597");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 100, (-1.0d), 1.0d, (double) (-1L), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06598");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) 'a', (double) (short) 1, 1.0d, 1.0d, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06599");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 1, (double) 0L, (double) '4', 100.0d, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06600");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) 1, 1.0d, (double) (byte) -1, (double) (byte) 0, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06601");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 0, (double) (-1), (double) 10L, (double) 1.0f, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06602");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 100, (double) (-1.0f), (double) '4', (-1.0d), 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06603");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) '#', 10.0d, (double) (-1.0f), 0.0d, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06604");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) '#', (double) 0L, 10.0d, (double) 1.0f, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06605");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 100, (double) 10L, (double) 1, (double) (byte) 0, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06606");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 10, (double) '#', (double) 1L, (double) (short) 0, (int) 'a', true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06607");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 1, (double) (-1.0f), (double) 10, (double) 10L, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06608");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) 'a', (double) 100, 0.0d, (double) 100.0f, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06609");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) ' ', (double) (-1L), (double) 1.0f, (double) '4', (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06610");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) 1, (double) 1, (double) 'a', (double) 10.0f, 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06611");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 100, 0.0d, (double) 10, (double) 1, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06612");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 1, (double) (-1), 1.0d, (double) 0L, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06613");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 1, (double) (short) -1, (double) (short) 10, (double) (short) 10, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06614");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (-1), (double) ' ', (double) (byte) 1, (double) (-1L), (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06615");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) -1, (double) (short) -1, 10.0d, (double) (byte) 100, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06616");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 0, (double) (short) 1, (double) (short) 0, (double) (-1.0f), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06617");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) '4', (double) 1, (double) 100.0f, 100.0d, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06618");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 10, (double) 1, (double) (byte) 10, (double) (byte) 10, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06619");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) '#', (double) ' ', (double) '4', (double) 10L, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06620");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 1, (double) (short) 0, (double) 0, (double) (short) 1, 10, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06621");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 10, (double) (short) 0, (double) (short) 100, (double) 10, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06622");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 10, (double) 100L, (double) 100.0f, 0.0d, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06623");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 0, 1.0d, (double) (byte) 10, (double) 100L, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06624");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 0, (double) (short) 100, (double) (short) 10, (double) (-1), 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06625");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 0, (double) 1L, (double) 0, (double) (short) 1, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06626");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 100, (double) 10, (double) '#', (double) 1L, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06627");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (-1), (double) 0.0f, (double) 'a', (double) 100.0f, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06628");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 0, (double) (-1.0f), (double) 0.0f, 0.0d, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06629");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) 'a', (double) (byte) 0, (double) ' ', (double) (short) 1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06630");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '#', (double) ' ', (double) (-1.0f), (double) 'a', (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06631");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 10, (double) (byte) 10, (double) '#', (double) (byte) 1, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06632");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) -1, (double) (byte) 100, (double) '#', (double) 10, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06633");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 0, (double) (short) 1, (double) (short) 1, 0.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06634");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 0, (double) (short) -1, (double) (short) -1, (double) 10L, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06635");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 10, (double) 1, (double) 'a', (double) (-1L), (int) ' ', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06636");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 0, (double) (byte) 0, 1.0d, (double) ' ', (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06637");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (-1), (double) 1, (double) (short) 1, (double) (-1), 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06638");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 0, (double) (-1L), 0.0d, 100.0d, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06639");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) '4', (double) (short) 1, (double) 0.0f, (double) (-1.0f), (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06640");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) 'a', (double) '#', (double) (byte) 0, (double) 1L, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06641");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 100, (double) '4', 1.0d, (double) '4', (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06642");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 10, (double) 'a', (double) 1L, 10.0d, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06643");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) ' ', (double) 1L, (double) 1L, 0.0d, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06644");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 100, (double) (short) 10, (double) 10, (double) 0, (int) (byte) 1, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06645");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 0, (double) (short) 100, (double) (short) 1, (double) (-1.0f), 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06646");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) -1, 0.0d, (double) (byte) 10, (double) (short) 10, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06647");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 10, (double) 10L, (double) (byte) 10, 0.0d, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06648");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (-1), (double) 0, (double) 0L, (double) 0.0f, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06649");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) '4', (double) (byte) 1, (double) (short) 0, (double) 100L, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06650");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 100, (double) 100L, (double) (byte) 1, (double) '#', (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06651");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 1, (double) 1, 0.0d, 0.0d, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06652");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 100, (double) (-1), (double) 100, (double) (byte) 0, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06653");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) '#', (double) ' ', (double) (short) -1, (double) (byte) 100, (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06654");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 1, (double) (short) 100, (double) 0, 0.0d, (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06655");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 10, (double) (-1.0f), (double) ' ', (double) (-1.0f), (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06656");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 1, (double) 10, (double) (byte) 0, (double) 1.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06657");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) 'a', (double) 10L, (double) (short) 10, (double) (byte) 1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06658");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 1, (-1.0d), (-1.0d), (-1.0d), (int) (short) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06659");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 1, (double) 0L, (double) (byte) 100, (double) 100, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06660");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 1, (double) 100L, 10.0d, (double) 10.0f, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06661");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) -1, (double) 100L, 0.0d, (double) (short) 0, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06662");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 10, (double) (short) 100, (double) 10.0f, 10.0d, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06663");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) -1, (double) (-1L), (double) (byte) 0, (double) (-1.0f), 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06664");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 0, (double) (-1L), 0.0d, (double) 10, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06665");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) -1, (double) '#', (double) 0L, 0.0d, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06666");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 1, (-1.0d), (double) (short) 1, (double) (-1.0f), (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06667");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 1, 1.0d, 100.0d, (double) 0, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06668");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 0, 0.0d, (-1.0d), (-1.0d), (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06669");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) '#', (double) (short) -1, (double) 10.0f, (double) (-1), (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06670");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (-1), (double) 0, (double) (byte) 1, (double) (-1), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06671");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 100, (double) 0.0f, (double) (-1L), (double) '4', (int) ' ', true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06672");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 100, (double) (short) -1, (double) 100, (double) ' ', (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06673");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 100, (double) (byte) -1, (double) (short) -1, 1.0d, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06674");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) 'a', 0.0d, (double) (byte) -1, 1.0d, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06675");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) -1, 0.0d, (double) (-1L), 10.0d, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06676");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 1, (double) 100L, (double) (-1L), 100.0d, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06677");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 0, (double) (byte) 0, (double) (byte) -1, (double) (short) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06678");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) ' ', (-1.0d), (double) ' ', (double) 100L, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06679");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 1, (double) (short) 10, (double) (byte) 0, (double) 0, (int) '#', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06680");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '4', (double) 'a', (double) 100L, (double) 1L, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06681");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 1, (double) '4', (double) 10.0f, (double) 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06682");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 0, (double) (-1L), (double) '4', (double) (byte) 1, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06683");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 100, (double) (short) 1, (double) 10L, (-1.0d), (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06684");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 1, (double) (byte) 100, (double) (byte) 100, (double) (byte) 0, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06685");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 10, (double) (short) 0, (double) 0, (double) (byte) 10, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06686");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) '#', (double) '#', 100.0d, 0.0d, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06687");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (-1), (double) 0, (double) (short) 100, (double) (short) 1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06688");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 1, (double) 0, (double) (short) 1, (double) 100.0f, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06689");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 10, (double) (short) -1, (double) 1L, (double) (-1.0f), (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06690");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) '#', (-1.0d), (double) (byte) 1, (double) (-1.0f), (int) (byte) 1, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06691");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 1, (double) '4', (double) (-1L), (double) 10L, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06692");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 10, (double) (byte) 10, 0.0d, (double) (short) -1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06693");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 0, (double) 1L, (double) (-1), (double) (byte) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06694");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) '4', (double) (byte) 0, 0.0d, (double) '4', (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06695");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) 1, (double) (-1.0f), (double) (byte) 1, (double) (byte) 0, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06696");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) -1, 0.0d, 100.0d, (double) (short) 100, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06697");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 1, 0.0d, (double) 0, (double) (-1), (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06698");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) -1, (double) (-1.0f), (double) (-1.0f), (double) '#', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06699");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 10, (double) (byte) 100, 10.0d, (double) (short) -1, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06700");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) '#', (double) 10L, (double) (byte) 10, (-1.0d), (int) '#', true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06701");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 100, (double) 100L, 1.0d, 0.0d, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06702");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) -1, (double) 0L, (double) 100, (double) (short) 100, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06703");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 100, (double) (short) 0, (double) (-1), 0.0d, 10, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06704");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 0, (double) (short) 0, (double) 10L, (double) 10.0f, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06705");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 0, (double) (byte) 1, (double) 1.0f, (double) 1L, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06706");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 1, 0.0d, (double) (byte) -1, (double) 10L, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06707");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 100, (double) 0L, (double) (short) 0, (double) 0L, 10, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06708");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) '#', (double) (byte) -1, (double) 1L, 0.0d, (int) (short) 100, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06709");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 1, (double) (-1), (double) '4', (double) 'a', (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06710");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 100, (double) 100, 10.0d, 0.0d, (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06711");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) 1, (double) 10L, (double) 'a', 10.0d, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06712");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 0, (double) (byte) 0, (double) '4', (double) 10, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06713");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 100, (double) 100.0f, (double) 0L, (double) (-1L), (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06714");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) 1, (double) (-1), (double) (byte) 10, (double) (-1.0f), (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06715");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) ' ', 0.0d, 1.0d, (double) 0.0f, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06716");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 100, (double) (-1L), (double) 10, (double) (byte) -1, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06717");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 100, (double) (short) 0, (-1.0d), (double) (byte) 10, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06718");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 10, (double) (byte) 100, (double) (byte) 100, 1.0d, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06719");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) -1, (double) (short) 100, (double) 10L, (double) 100L, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06720");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 0, (double) (byte) 100, (double) (byte) 10, (double) '#', (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06721");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 10, (double) (byte) 0, (double) 100.0f, (double) (byte) -1, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06722");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 1, (double) (byte) -1, (double) (-1L), (double) 100.0f, (int) '#', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06723");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 100, (double) (byte) -1, (double) 100.0f, (double) (-1L), 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06724");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 10, (double) 0L, (double) (short) 100, (double) (byte) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06725");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 10, (double) 'a', 100.0d, 1.0d, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06726");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) '4', (double) (byte) 10, (double) 100, (double) (short) -1, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06727");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 1, (double) (byte) 1, (double) 0.0f, (double) (short) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06728");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 0, (double) (short) 1, (double) (byte) -1, (double) 100.0f, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06729");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 1, (double) (short) 10, (double) 100L, (double) 'a', (int) '4', true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06730");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 10, 0.0d, (-1.0d), (double) 100L, (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06731");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) -1, (double) (byte) 10, (double) (byte) 0, (double) (byte) 1, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06732");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 100, (double) 10.0f, (double) (-1.0f), (double) 1.0f, (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06733");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 10, (double) (byte) 0, 0.0d, (double) 10, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06734");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '4', 10.0d, (double) 0L, (double) (short) 1, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06735");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 0, 10.0d, (double) 0, (double) (short) 10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06736");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 10, (double) 'a', (double) (short) 100, (double) 0.0f, (int) (byte) 1, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06737");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 100, (double) (short) 100, (double) 100, (double) 1, 100, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06738");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (-1), (double) 10, (double) (short) 10, (double) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06739");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) ' ', (double) (byte) 0, (double) (short) 100, 0.0d, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06740");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '#', (double) 0L, (double) (byte) 100, (double) (short) 0, (int) '4', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06741");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (-1), (double) (-1L), (double) '#', (double) (byte) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06742");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) -1, (double) ' ', (double) 0L, (double) 1.0f, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06743");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 10, (double) (byte) -1, (double) (byte) 1, 0.0d, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06744");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (-1), (double) 0, (double) (byte) 0, (double) 1, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06745");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 0, (double) (byte) 0, (double) 100, (double) '#', (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06746");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 100, (double) '#', (double) 0L, (double) 0L, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06747");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 0, (double) '4', (double) 1L, (double) (byte) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06748");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 100, (double) (short) -1, (double) 0, (double) 100.0f, (int) '#', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06749");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 10, (double) 1, (double) (byte) 10, (double) 1L, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06750");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 100, (double) (-1), (double) (short) 10, (double) 1L, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06751");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 10, (double) '#', 1.0d, (double) (short) 0, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06752");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 10, (double) (byte) 100, (double) (-1.0f), 10.0d, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06753");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 100, (double) 1, 0.0d, 0.0d, (int) '4', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06754");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) -1, (double) (byte) 100, (double) 0, (double) (short) 1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06755");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 100, 0.0d, (-1.0d), 0.0d, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06756");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 10, (double) 0, (double) (byte) 100, (double) 1L, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06757");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 0, (double) 10, (double) (-1), (-1.0d), (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06758");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 10, (double) 100, (double) 0.0f, 100.0d, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06759");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (-1), (-1.0d), (double) (byte) 0, (double) 100, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06760");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) '#', 10.0d, (double) 1.0f, (double) (-1.0f), 1, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06761");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) -1, (double) ' ', (double) (byte) 10, (double) (short) 100, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06762");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (-1), (double) (byte) -1, (double) 1L, 100.0d, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06763");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) -1, (double) '#', (double) 0L, (double) '#', (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06764");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 10, (double) (byte) 10, (double) (-1.0f), 1.0d, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06765");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 100, (double) 100, (double) (-1), (double) '4', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06766");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 10, 0.0d, (-1.0d), (double) (short) -1, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06767");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 0, (double) 100.0f, (double) (-1.0f), (double) (-1), (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06768");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 10, (double) 'a', 10.0d, (double) (byte) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06769");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 100, (double) ' ', (double) '#', 0.0d, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06770");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) -1, (double) 0, (double) 0.0f, (double) 1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06771");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 10, (double) 100, (double) 1.0f, 10.0d, (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06772");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) 'a', (double) 100.0f, (double) 0, (double) 10L, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06773");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 10, (double) 0, 1.0d, (double) 100, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06774");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 0, (-1.0d), 10.0d, (double) (byte) 10, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06775");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 1, (double) (short) 0, (double) (-1L), (double) (byte) -1, (int) (short) 10, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06776");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 0, (double) '#', (double) 'a', (double) (-1L), (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06777");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 10, 0.0d, (double) (-1.0f), (double) 1.0f, (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06778");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) 0, (double) (short) 100, (double) 10, (double) 10, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06779");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 0, (double) (short) 10, (double) (-1), (double) (short) 100, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06780");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) -1, (double) 1, (double) 10, (double) 1L, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06781");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 1, (double) 100.0f, (double) (short) 1, (double) (byte) 100, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06782");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 0, 100.0d, 10.0d, (double) (-1), (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06783");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 0, (double) '#', (double) 0, (double) 1, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06784");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) '#', (double) 0.0f, (double) 10.0f, (double) (byte) 10, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06785");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 0, (double) 100L, (double) 0, 0.0d, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06786");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 0, (double) (byte) 100, (double) '4', (double) 100.0f, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06787");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) '#', (double) 10L, (double) 0L, (double) (byte) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06788");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 0, 0.0d, (double) (-1), 100.0d, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06789");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 100, 0.0d, (double) 1.0f, 1.0d, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06790");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (-1), (double) (-1), (double) (byte) 1, 1.0d, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06791");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 100, (-1.0d), (double) (-1.0f), (double) 1, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06792");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) -1, 0.0d, (double) (short) 0, (double) 'a', (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06793");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 1, (double) (-1L), (double) 100, (double) (short) 100, 100, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06794");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 1, (double) 0L, (double) 100L, (double) 0.0f, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06795");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 100, (double) (-1), 0.0d, (double) 100.0f, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06796");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 10, (double) 1, (double) 1L, (double) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06797");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 100, (double) (-1L), (double) (byte) 10, (double) 100.0f, (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06798");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) ' ', 100.0d, (double) (-1), (double) 100.0f, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06799");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) 'a', (double) (byte) 1, (double) 100, (double) '#', (int) (byte) 100, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06800");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 0, (double) (byte) -1, (double) (byte) 100, (double) (byte) 100, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06801");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) 'a', 0.0d, (double) (byte) 0, (double) 100, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06802");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) '4', (double) (short) 1, (double) (byte) 1, (double) (short) -1, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06803");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 1, (double) (byte) 10, (double) (byte) 10, (double) 0L, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06804");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) -1, (double) (short) 0, (double) 0L, (double) 0, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06805");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 0, (double) 100, (double) '#', 1.0d, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06806");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 10, (double) 10L, (double) (-1L), 0.0d, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06807");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 0, (double) 1, (double) (-1.0f), (double) 100.0f, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06808");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 0, (double) 10L, (double) 100L, (double) (byte) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06809");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 10, (double) (short) -1, (double) '4', (double) 100.0f, (int) '4', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06810");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 100, (double) 1, (double) (byte) -1, (double) 1L, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06811");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 10, (double) (-1), (double) (-1L), (double) 0L, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06812");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 1, (double) (short) -1, (double) 10L, (double) 10, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06813");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 1, (-1.0d), (double) 100.0f, (double) 0.0f, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06814");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 10, (double) 0L, 1.0d, (double) (byte) 10, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06815");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 1, 0.0d, (double) (byte) -1, 10.0d, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06816");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) '#', (double) (short) 1, (double) (byte) 1, (double) 1L, (int) 'a', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06817");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 10, 0.0d, 0.0d, (double) (byte) -1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06818");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 0, (double) 10.0f, (double) 1L, 0.0d, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06819");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) 'a', (double) '4', (double) 100L, 0.0d, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06820");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 0, (double) 1L, (double) 0, (double) (byte) 100, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06821");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 0, (double) ' ', (double) (short) 100, 0.0d, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06822");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) 'a', (double) 0L, 100.0d, (double) 100.0f, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06823");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) ' ', (double) (-1), (double) (byte) 100, (double) 1L, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06824");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 1, (double) (byte) -1, (double) (byte) -1, (double) (-1), 10, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06825");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 1, (double) (short) 10, 0.0d, (double) (short) 100, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06826");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) -1, (double) (byte) 10, (double) 0L, (double) 100L, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06827");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) '4', (double) 'a', (double) 1.0f, 1.0d, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06828");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) -1, (double) (byte) -1, (double) (short) -1, (double) (byte) -1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06829");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 0, (double) (short) 1, 0.0d, (double) ' ', (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06830");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) ' ', (double) 1.0f, (double) 0L, (double) 1, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06831");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 100, (double) 100, (double) 100L, (double) 10.0f, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06832");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) 'a', (double) 1L, (double) 1, (double) 0L, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06833");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 100, (double) 100L, (double) (byte) 0, (double) 0.0f, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06834");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 10, (double) 10L, (double) (-1), (double) 1L, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06835");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 1, (-1.0d), (double) 0, (double) (short) -1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06836");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (-1), (double) 1L, (double) (short) 1, 10.0d, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06837");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 1, (double) (short) 10, (double) (short) 10, (double) 'a', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06838");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) -1, (double) 10L, (double) 'a', (double) 10L, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06839");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (-1), (double) 0.0f, 0.0d, (-1.0d), (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06840");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 1, (double) (-1), (double) (byte) -1, (double) 0.0f, (int) '4', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06841");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 10, (double) (-1.0f), (double) 0, (double) 1.0f, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06842");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 0, 0.0d, (double) (byte) 10, (double) (short) 0, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06843");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 0, 1.0d, (double) 100, (double) '#', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06844");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 0, (double) (short) 1, 1.0d, (double) 1.0f, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06845");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 1, 1.0d, (double) 100.0f, 0.0d, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06846");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 0, (double) '#', (double) 1L, (double) 100L, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06847");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 1, (double) '#', (double) 100, (double) (short) -1, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06848");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 100, 10.0d, (double) 10L, (double) (-1L), (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06849");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 0, (double) (-1L), 0.0d, (double) 0L, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06850");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) 1, (double) 1L, (double) 0, (double) (byte) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06851");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 0, 1.0d, (double) (short) 100, (double) (short) 0, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06852");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (-1), (double) (byte) 0, (double) (-1.0f), 0.0d, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06853");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (-1), (double) (byte) 0, (double) 100.0f, (double) (byte) 100, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06854");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) 'a', (double) 0L, (double) '#', (double) '4', (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06855");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (-1), (double) (short) 100, (double) (byte) 0, (double) 100.0f, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06856");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) '#', (double) 10, 1.0d, (double) 0.0f, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06857");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 100, (double) (byte) 0, (double) (short) 1, 0.0d, 10, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06858");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 1, (double) 10L, (double) (-1L), (double) (short) -1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06859");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 10, 1.0d, (double) ' ', (double) '#', (int) (short) 100, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06860");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) -1, (double) 0.0f, (double) 0L, (double) '4', (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06861");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 10, (double) (byte) -1, (double) 'a', (double) (-1L), (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06862");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 0, (double) (byte) 1, (double) 1, 0.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06863");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) -1, (double) (byte) 10, (double) 0L, (double) 100, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06864");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 100, (double) (byte) 1, (double) (short) 10, (double) 0.0f, (int) 'a', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06865");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) 'a', (double) (-1L), (double) 10.0f, (double) '#', 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06866");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 100, (double) 'a', (double) 10L, (double) 100L, (int) (byte) 1, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06867");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) -1, (double) (byte) 0, (double) 10.0f, (double) (short) -1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06868");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 1, (double) (short) 10, (-1.0d), (double) (byte) 100, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06869");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (-1), 0.0d, (double) 0L, (double) 'a', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06870");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 100, (double) (-1L), (double) (-1.0f), (double) 100, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06871");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) '4', (double) 10.0f, (double) (byte) 10, (double) (short) 1, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06872");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) 'a', (double) '4', (double) 0L, (double) (-1L), (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06873");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 10, (double) '#', (double) 1L, (double) (short) 10, (int) (byte) 10, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06874");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 0, 0.0d, (double) 0L, (double) (short) 100, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06875");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 1, (double) (-1.0f), (double) 100L, (double) 10, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06876");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 10, (-1.0d), (double) 100L, (double) 10, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06877");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (-1), (double) 1L, (double) 1, (double) 10.0f, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06878");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 1, (double) 1, (double) 10, 0.0d, (int) (short) 1, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06879");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 10, (double) 1L, (double) 100L, (double) (short) 10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06880");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 0, (double) (byte) 0, (double) 10, 0.0d, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06881");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) '#', 10.0d, (double) (byte) 1, (double) 10L, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06882");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) -1, (double) 0.0f, (double) ' ', (double) '#', (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06883");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 100, (double) 1, (double) (-1.0f), (double) (byte) 0, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06884");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) -1, 10.0d, 10.0d, (-1.0d), (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06885");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 0, (double) '4', (double) (short) 10, (double) (short) 1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06886");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 100, (double) 10L, (double) (-1), (double) (short) 1, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06887");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) -1, (-1.0d), (-1.0d), (-1.0d), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06888");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 100, (double) 10.0f, (double) (byte) 10, (double) 1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06889");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) '#', (double) (byte) 1, 10.0d, (double) 10, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06890");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 1, 10.0d, (double) 'a', (double) (short) 100, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06891");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 100, (double) 0L, (double) 0, (double) (short) 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06892");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 1, (double) 1.0f, (double) '4', 0.0d, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06893");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 0, (double) 100.0f, (double) 100L, 100.0d, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06894");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 100, (double) 10, (double) (short) 1, (double) (short) 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06895");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) -1, (double) (byte) 100, 0.0d, (double) 10, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06896");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 0, (double) (-1L), (double) 10.0f, (double) 100, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06897");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 1, (double) 1.0f, (double) (byte) 100, (double) (byte) 10, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06898");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) ' ', 10.0d, (double) 1L, (double) '4', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06899");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 10, (double) (short) 10, (double) (byte) 10, 0.0d, (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06900");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) ' ', (double) (short) 0, (double) 10.0f, (double) 10, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06901");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 0, 0.0d, 10.0d, (double) (short) 100, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06902");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 0, (double) 10L, 0.0d, (double) 0.0f, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06903");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (-1), (double) (-1), (double) 100, (double) (byte) 100, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06904");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 0, (double) 100L, 0.0d, 0.0d, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06905");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (-1), (double) (-1), (double) (byte) 100, (double) (short) 100, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06906");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 0, (double) (byte) 10, (double) 0L, (double) 10, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06907");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) 'a', (double) (short) 10, (double) (byte) 100, 0.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06908");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (-1), (double) 1, (double) '4', (double) (byte) 100, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06909");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 10, (double) 1.0f, (double) 0, (double) 0L, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06910");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 1, (double) (byte) 1, (double) (-1.0f), (double) (-1L), (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06911");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 1, 10.0d, 0.0d, 1.0d, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06912");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 0, (double) (-1), (double) (short) 100, (double) (byte) -1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06913");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 0, (double) 0, (double) (byte) 0, (double) (byte) 10, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06914");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) -1, (double) 100.0f, 10.0d, (double) 0L, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06915");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) '#', (double) (byte) 10, (double) ' ', 0.0d, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06916");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 0, 0.0d, (double) 10L, (double) 0, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06917");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 0, (double) 'a', (double) 100.0f, (double) 1L, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06918");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) '4', (double) 1.0f, 10.0d, (double) ' ', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06919");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 1, 0.0d, 1.0d, 1.0d, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06920");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) ' ', 0.0d, (double) (byte) 100, (-1.0d), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06921");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 0, (double) (-1L), (double) 10.0f, (double) 1, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06922");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 100, 0.0d, (double) (short) 1, (double) '#', (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06923");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 100, (double) (-1), (double) 1, (double) (short) 0, (int) (short) 10, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06924");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) -1, (double) (-1L), (double) 0.0f, (double) 1, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06925");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 0, (double) '#', 0.0d, (double) 10.0f, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06926");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 10, (double) 10, (double) (byte) 10, (double) (short) 1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06927");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 10, 1.0d, (double) 100L, (double) '4', (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06928");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) -1, (double) 0.0f, (double) (byte) 0, (double) 10L, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06929");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 0, 10.0d, (double) (-1), 100.0d, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06930");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 1, (double) (-1), (double) (-1), (-1.0d), (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06931");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 0, 100.0d, (double) (-1L), (double) 0.0f, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06932");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) -1, (double) (byte) 10, (double) 1, (double) ' ', (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06933");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) 100, (double) '4', 0.0d, (double) '4', (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06934");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 10, 0.0d, (double) (byte) 10, (double) 100.0f, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06935");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 1, (double) 1.0f, (double) 1, (double) (short) 0, 100, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06936");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 0, (double) '4', (double) (byte) 100, (double) 100.0f, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06937");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 0, (-1.0d), 100.0d, (double) '#', (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06938");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 1, (double) 10L, (double) '4', (double) (-1), (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06939");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) 'a', (-1.0d), (double) (byte) 10, 100.0d, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06940");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) '4', (double) (byte) 100, (double) 100L, (double) '#', (int) (short) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06941");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 0, (double) (byte) 0, (double) 1.0f, (double) (byte) 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06942");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) -1, (double) 0L, 0.0d, (double) (byte) 10, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06943");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 1, (double) 100.0f, (double) (short) 0, (double) 0, (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06944");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 1, (double) (byte) 1, (double) 100L, (double) 10.0f, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06945");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 100, (double) 10.0f, (double) '4', (double) 1L, (int) (byte) 100, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06946");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '#', (double) 0, (double) 100, (double) 0L, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06947");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 10, (double) 0.0f, (double) 'a', (double) 1L, (int) (short) 10, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06948");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 1, (double) 1L, (double) 0, (double) 1.0f, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06949");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) 'a', (double) (short) 0, 10.0d, (double) 0, 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06950");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 10, (double) ' ', (double) '#', 10.0d, (int) '4', true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06951");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '4', (double) 0L, 10.0d, (double) '4', (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06952");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 1, (double) 10, (double) 1, (double) 0, (int) ' ', true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06953");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 1, (double) 100.0f, 0.0d, (double) (short) 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06954");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 10, (double) ' ', (double) 10.0f, (double) '4', (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06955");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 0, (double) (byte) 0, 100.0d, (double) '4', (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06956");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 100, 0.0d, (double) (byte) 0, (double) (-1.0f), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06957");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 100, (double) 100, (double) 'a', 10.0d, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06958");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) -1, 100.0d, (double) (short) -1, (double) (short) 100, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06959");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 0, (double) (-1.0f), (double) 1.0f, 10.0d, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06960");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 1, (double) 0L, (double) 100L, (double) 'a', (int) '4', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06961");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 100, 10.0d, (double) 1L, (double) 0, (int) (short) 100, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06962");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) 'a', (double) 'a', (double) 1L, 100.0d, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06963");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 1, (double) 10, (double) 100.0f, (double) '4', (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06964");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) -1, 100.0d, (double) (-1L), (double) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06965");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 100, (double) 1, (double) (-1L), (double) (-1), (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06966");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 0, (double) 10, (double) 100, (double) 1, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06967");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 100, (double) (short) 0, 10.0d, 100.0d, (int) 'a', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06968");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) 'a', (double) (-1L), (double) '#', (double) (byte) 100, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06969");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '4', 100.0d, (double) 10.0f, (double) 'a', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06970");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (-1), (double) 0.0f, (double) (short) -1, (double) 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06971");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) 10, (double) 'a', (double) (short) 100, (double) (short) 1, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06972");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 0, 1.0d, (double) 10, (double) 0.0f, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06973");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) ' ', (double) (short) 0, (double) (short) 0, (double) 1, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06974");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 10, (double) (short) 1, (double) 0L, 100.0d, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06975");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 10, (double) (short) 10, (double) '4', (double) (byte) 1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06976");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 100, (double) 0.0f, 0.0d, (double) (short) 10, 1, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06977");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 0, (double) (-1), (double) (-1L), (double) 100.0f, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06978");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 10, (double) (short) 1, (double) (short) 1, (double) (byte) -1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06979");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 1, (double) 100, 0.0d, (double) 'a', (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06980");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 100, (double) (byte) -1, (double) 100L, (double) 0, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06981");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) '4', (-1.0d), (double) 0L, (double) '#', (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06982");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (-1), (double) 10L, (double) 100.0f, (double) (-1.0f), (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06983");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 1, (double) (byte) 0, (double) 0.0f, (double) (short) 1, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06984");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) '4', (double) 0.0f, (double) (short) 100, (double) 1, 1, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test06985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06985");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 100, (double) '#', (-1.0d), (double) 100L, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06986");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 10, 0.0d, (double) 0L, (double) 0L, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06987");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (-1), 0.0d, (double) '4', (double) (-1L), 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06988");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (-1), (double) (short) 1, (double) (byte) 1, (double) 1.0f, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06989");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (-1), (double) (short) 0, (double) (-1), (double) 100.0f, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06990");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 10, (double) 100L, (double) 1.0f, (double) (byte) 100, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06991");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 10, (double) '#', (double) (short) 10, (double) (short) 10, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06992");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (-1), (double) 0, 1.0d, (double) ' ', 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06993");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 0, (double) ' ', (double) 10L, (double) (short) -1, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06994");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 1, (double) 1.0f, (double) 100.0f, (double) 0L, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06995");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 100, (double) 0, (double) (short) -1, (double) (short) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06996");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (-1), (double) 100.0f, (double) (short) 0, (double) 100, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06997");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 10, (double) (short) 0, 0.0d, (double) (byte) 100, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06998");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 0, 0.0d, (double) (-1), (double) (-1L), 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06999");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 1, (double) (short) 10, (double) (short) -1, (double) (short) -1, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test07000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test07000");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 0, (double) '#', (double) (byte) 10, (double) 0, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

