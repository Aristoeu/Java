package others.Mandelbrot;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test04501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04501");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 100, (double) (short) 0, (double) (byte) 100, (double) 100L, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) -1, (double) (byte) 0, (double) 0.0f, (-1.0d), (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 10, (double) 100.0f, (double) '#', (double) 10L, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) ' ', (double) 0L, (double) (-1.0f), (double) 10L, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) -1, (-1.0d), (double) 100.0f, (double) 10L, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) -1, 100.0d, (double) 100.0f, (double) 10, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) 'a', (double) 1, (double) 1, (double) 100.0f, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) '4', (double) (-1), (double) 0, (double) 10L, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 10, (double) (byte) 0, (double) 10.0f, 0.0d, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 0, (double) 1.0f, 0.0d, (double) 100L, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 0, (double) (short) 100, (double) '4', (double) (short) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) -1, (double) '4', (double) (byte) 100, (double) (byte) 1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) 'a', 10.0d, (double) ' ', (double) 100.0f, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) 'a', (double) (-1.0f), (double) (short) 100, 0.0d, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) ' ', (double) (short) 0, (double) (short) -1, (double) (byte) 0, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 100, (double) 0.0f, 10.0d, (double) (-1), (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 10, (double) (short) 0, (double) 100.0f, (double) (byte) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) 'a', 1.0d, (double) (short) 10, (-1.0d), (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 0, (double) 100L, (double) (short) 100, 0.0d, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 1, 10.0d, (double) (byte) -1, (double) (short) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) '4', 0.0d, 100.0d, (double) (byte) 100, (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '4', (double) (-1.0f), 0.0d, (double) (short) 1, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 10, (double) (short) -1, (double) (byte) 10, (double) 100L, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 10, (double) (short) 1, (double) (short) 10, (double) 10L, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) '4', (double) 0.0f, (double) 1.0f, (-1.0d), (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) '4', (double) 100L, (double) (byte) 100, (double) 'a', 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (-1), (double) 10L, (double) (byte) -1, (double) (byte) -1, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 0, (double) (byte) 1, 0.0d, (double) (byte) -1, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 1, (double) (short) -1, 0.0d, (-1.0d), (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) ' ', (double) (-1L), (double) 10L, (double) (-1.0f), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 10, (double) '4', (double) 1.0f, 0.0d, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 100, (double) (short) 10, (double) ' ', (double) 1.0f, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 10, (-1.0d), (double) 'a', (double) 1.0f, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 10, (double) (-1), (double) 'a', (double) 0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 0, 0.0d, (double) 1, (double) 100.0f, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 0, (double) 1, (double) 1.0f, (double) (short) 100, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 0, (-1.0d), (double) 0.0f, (double) 100L, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 1, (double) 0L, 0.0d, (double) 0, 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 10, (double) '4', (double) '#', (double) (short) 100, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 1, (double) 10.0f, (double) 0.0f, 0.0d, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 0, 0.0d, (double) (-1), (double) (short) 0, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 1, (double) ' ', (double) 10L, (double) (short) -1, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 0, (double) ' ', (double) (-1L), (double) '4', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 1, (double) 100L, 10.0d, (double) 100L, (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 1, (double) '#', (double) (byte) 0, (double) (-1L), (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 1, (double) (byte) -1, (double) 10L, (double) 'a', (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 0, (double) (byte) 100, (double) (byte) 0, (double) (-1.0f), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) -1, (double) 10, (double) (byte) 100, (double) 1.0f, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 100, 10.0d, (double) (byte) 0, (double) (byte) 1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 0, (double) (short) 0, (double) (byte) 1, (double) ' ', 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (-1), (double) 1.0f, (double) (-1L), (double) (-1.0f), (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 0, (double) 0, (double) 0L, (double) 1L, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 1, (double) '#', (double) (short) 0, (double) (-1), (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 10, (double) '4', (-1.0d), 1.0d, (int) (short) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 1, (double) '4', 0.0d, (double) 'a', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 10, (double) (short) -1, (double) (byte) 1, (double) 'a', (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) '4', (double) 1, (double) 1.0f, 10.0d, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) -1, 0.0d, (double) 0L, (double) (-1L), 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 10, (double) '#', (double) (short) 100, (double) '#', (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) ' ', (double) '#', (double) (short) -1, (double) 10, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) -1, (double) ' ', (double) (-1), (double) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (-1), 10.0d, (double) '4', (double) (byte) 1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) '#', (double) 10.0f, (double) 0.0f, (double) (byte) 100, (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) 'a', (double) ' ', (double) (byte) 1, (double) 'a', (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (-1), (double) (-1), (double) '4', (double) 10.0f, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) 0, (double) 10.0f, (double) 10.0f, (double) (-1), (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 100, (double) (short) 10, 1.0d, (-1.0d), (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 0, 0.0d, 10.0d, 0.0d, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 1, 100.0d, (double) (-1.0f), (double) 100, (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 0, (double) 0.0f, (double) 0L, (double) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 1, (double) 1.0f, (double) 0L, (double) 10L, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 0, (double) '#', (double) (-1), 10.0d, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 0, (double) 0L, 0.0d, (double) (short) 100, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 1, (double) '#', (double) (short) 0, (-1.0d), (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) ' ', (double) 0L, (double) '#', (double) (short) 100, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (-1), (double) 100.0f, (double) (short) 100, (double) 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 100, (double) (short) 0, (double) 100L, 0.0d, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 100, (-1.0d), (double) (short) 0, (double) 100L, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) '#', 0.0d, 10.0d, (double) 0, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) 'a', (double) (-1L), (double) 100L, 0.0d, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 100, (double) (short) 1, (double) (byte) 1, (double) (short) 1, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 100, (double) (short) 100, (double) (short) 100, (double) (short) -1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 100, (double) (byte) 100, 1.0d, (double) 1L, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 100, 100.0d, (double) 10, (double) (short) -1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) -1, 1.0d, (double) 'a', (double) 100L, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) -1, 100.0d, (double) 100L, (double) (byte) 10, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (-1), (double) (byte) 100, (double) 1, (double) (byte) 0, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (-1), (double) (byte) 0, (double) (byte) 100, (double) (byte) 100, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 100, (-1.0d), (double) ' ', (double) 1.0f, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 1, 10.0d, (double) (short) 1, (double) (short) 10, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) '4', (double) 1, (double) (byte) 10, (double) 10.0f, (int) '#', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 10, (double) ' ', (double) ' ', (double) 100.0f, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 1, (double) 0, (double) (byte) 100, (double) 0, (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) '4', (double) '#', (double) ' ', (double) (short) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 0, 1.0d, (double) (short) 100, (double) (short) -1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (-1), (double) 1.0f, 0.0d, 1.0d, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) 'a', (double) '4', (double) 100L, (double) 10.0f, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) ' ', (double) (byte) -1, (double) 100.0f, (double) (short) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 100, (-1.0d), 0.0d, (double) 100.0f, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 1, (double) 100, (double) (short) 1, (double) 0.0f, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 1, (double) (byte) 100, (double) (short) 100, (double) (short) 100, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 10, (double) 0L, (double) (-1.0f), (double) 10.0f, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 0, (double) (-1L), (double) '4', (double) (short) 10, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (-1), 1.0d, (double) 1.0f, (double) 10.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 0, (double) (-1.0f), (double) 100L, (double) (byte) 10, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 100, (double) 'a', 0.0d, 1.0d, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (-1), (double) 1L, (double) 10.0f, (double) 10L, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) -1, (double) (-1), (double) 100L, (double) 0.0f, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 10, 10.0d, (double) 1L, 10.0d, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 100, (double) (byte) 100, (double) (short) -1, (double) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 0, (double) (byte) 0, 0.0d, (double) (-1L), (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) -1, (double) '#', (double) '#', (double) (byte) -1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) '4', (double) 0, (double) (short) 1, (double) 10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 10, (double) (-1), (double) 10.0f, (double) '#', (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 10, (double) (short) 10, (double) ' ', (double) 1L, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 100, (double) 10L, (double) (short) 10, (double) 1.0f, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 0, (double) '#', (double) 1L, (double) 100L, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) -1, (double) (short) 100, (double) (byte) -1, (double) (short) -1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 100, (double) (short) 10, (double) 100L, (double) 10, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 1, (double) (short) 1, (double) (byte) 10, (double) (byte) 10, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) '4', (double) (-1L), 100.0d, (double) (-1L), (int) (short) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 100, (double) (short) 1, (double) (short) 10, (double) 1L, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) -1, (double) 100, (double) (byte) 10, (double) (byte) 1, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 1, (double) 10, (double) (byte) 0, (double) (short) 100, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 0, 100.0d, (-1.0d), (double) (-1.0f), (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 1, (double) (byte) 0, (double) (-1), (double) (short) 100, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 100, (double) (short) 0, (double) 1L, (double) (byte) -1, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 10, (double) (short) 1, (double) 100L, (double) 0, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) ' ', 10.0d, (double) 1L, (double) 100, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) ' ', (double) (short) 100, (double) (short) -1, (double) (short) -1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) '4', (double) 0L, (double) 'a', (double) (short) 10, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) -1, (double) (byte) 10, (double) 100.0f, (double) (short) -1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 10, (double) 100.0f, (double) (-1), (double) (-1L), (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 10, (double) (short) 10, (double) 0.0f, 100.0d, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 1, (double) '4', (double) (short) 0, (double) 100.0f, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) -1, (double) (short) 100, (double) 0.0f, (double) 1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 10, 10.0d, (double) 0.0f, (double) 0L, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 1, (double) (-1), (double) (byte) 1, (double) 1L, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 10, 0.0d, (double) (short) 1, (double) (byte) -1, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) -1, (double) (short) 0, 1.0d, (-1.0d), (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 1, (double) 100L, (double) '4', 1.0d, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) 'a', 100.0d, (double) (byte) 0, 0.0d, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 100, (double) 1L, 100.0d, (double) (byte) 10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) 'a', (double) ' ', 1.0d, (double) (byte) 100, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 100, (double) 0, (double) (byte) 0, (double) ' ', (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 100, (double) (-1), (double) (byte) 0, (double) 0, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) ' ', (double) 100L, (double) (byte) -1, (double) (short) -1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) 'a', (double) (byte) 100, (double) 100, (double) (byte) 0, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) 1, (double) 10L, (double) 10.0f, (double) 0.0f, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 10, (double) (-1), (double) 100.0f, (double) ' ', (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 0, 1.0d, (double) '4', 1.0d, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) -1, (double) 1L, (double) (-1L), (double) ' ', (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 1, (double) (short) 1, (double) (short) 0, (double) (-1), (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) ' ', 0.0d, (double) (byte) 10, (double) (short) 100, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 10, (double) 100.0f, (double) (byte) 1, (double) (short) 1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) ' ', (double) (short) -1, (double) 1.0f, (double) 0, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 1, (-1.0d), (double) 100.0f, (double) 1L, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 0, (double) (-1.0f), (double) (short) 10, (double) 1L, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) 'a', (double) (short) 1, (double) (short) 10, 100.0d, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 100, (double) 10, (double) '4', (double) 1L, (int) (short) 10, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 10, (double) 10L, (double) 0L, (double) '#', (int) '4', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) 'a', (double) (-1L), (double) 0, (double) 1L, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 0, (double) (byte) 10, (double) 1.0f, (double) 100L, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 100, (double) ' ', (double) 0, (double) (byte) 10, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 100, 0.0d, (-1.0d), (double) 100.0f, (int) '#', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) '#', 0.0d, 0.0d, (double) 100.0f, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) -1, (double) (short) 0, (double) '#', (double) (byte) 100, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) -1, (double) (byte) 1, (double) 'a', (double) (byte) 100, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 0, 1.0d, (double) '4', (double) 0, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) 'a', (double) 0L, (double) 0.0f, 100.0d, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) -1, (double) 10L, (double) 0L, (double) '#', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 10, (double) 0L, (double) 10, 0.0d, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) ' ', (double) 10L, (double) (byte) 10, (double) (short) 100, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 1, (double) '4', 1.0d, 1.0d, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 100, 0.0d, 100.0d, (double) 10, (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) '4', (double) (short) -1, (double) 0.0f, (-1.0d), 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) -1, (double) 0.0f, (double) (short) 100, (double) (-1), (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) -1, (double) '4', (double) 0.0f, (double) (short) -1, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 100, (double) 100.0f, (double) ' ', (double) (-1.0f), 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) -1, (double) (byte) 0, (double) (-1L), 0.0d, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 10, 100.0d, (double) (byte) 10, 0.0d, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 100, (double) (-1.0f), (double) (short) 100, (double) 0, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 0, (double) (-1), (double) '4', (double) 10L, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 100, (double) (byte) 10, (double) 'a', (double) (byte) 10, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 0, (double) 10.0f, (double) (short) 1, 0.0d, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 1, (double) (byte) 100, (double) '#', (double) 1, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '#', (double) (-1), (double) (byte) 10, 0.0d, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) '#', (double) 1L, (double) (-1.0f), (double) 100, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 1, (double) (-1L), (double) (byte) 0, (double) (byte) 10, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 10, (double) (short) 1, 0.0d, (double) 'a', (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) '#', (double) (byte) 1, (double) (-1.0f), (double) (byte) 10, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 0, (double) 1, (double) (-1L), (double) 1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) -1, (double) 0L, 100.0d, (double) (-1L), (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 100, (double) 10L, (double) (byte) -1, (double) 10, (int) (short) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) -1, 0.0d, (double) 100.0f, (double) 'a', (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 10, (double) 100.0f, (double) 'a', (double) 1.0f, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) 'a', (double) 0.0f, (double) (byte) -1, (double) 10.0f, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) '#', (double) '#', (-1.0d), (double) (byte) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '#', (double) 10.0f, (double) 1, (double) (short) 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) 'a', (double) 10, (double) 1L, (double) (byte) 10, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) -1, (double) 10L, (double) 10.0f, (double) (byte) -1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 100, (-1.0d), (double) '4', (double) (-1.0f), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 1, (double) '4', (double) 0.0f, (double) (byte) 1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 0, (double) 10, (double) (byte) 1, (double) 'a', 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 10, 0.0d, (double) 100L, (double) (byte) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 0, (double) (-1.0f), (double) 100.0f, (double) (short) 1, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 0, (double) (-1L), 10.0d, (double) 100L, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) '4', (double) 100, (double) (-1), (double) (byte) 10, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 0, (double) 100, (double) 10L, (double) (short) 0, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) -1, (double) (byte) 100, (double) 1L, 10.0d, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (-1), (double) (-1), (double) 'a', (double) 0L, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '#', (double) (byte) 10, (double) (byte) 10, (double) (short) 100, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 10, (double) 10, 0.0d, 10.0d, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 1, (double) (-1L), (double) 'a', (double) (byte) 1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 10, (double) (-1), (-1.0d), (double) (byte) 1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) 'a', (double) 'a', (double) (-1L), (double) (short) -1, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 10, (double) 10L, (double) (short) 100, (double) 0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 0, (double) 10.0f, 100.0d, (double) (short) -1, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 0, (double) 100, (double) 100.0f, (double) 1L, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) '4', 100.0d, (double) 0, (double) 100.0f, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (-1), 10.0d, (double) 0.0f, (double) 10, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) '4', (double) (short) 0, 100.0d, (double) (byte) -1, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 100, (double) 0L, (double) (short) 0, (double) (byte) 0, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 0, (double) 0, 1.0d, (double) (byte) 1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '4', (double) (-1L), 0.0d, 0.0d, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) -1, (double) 10L, (double) 0L, (double) 1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (-1), (double) 100.0f, (double) 10L, (double) (-1.0f), (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 10, 0.0d, (double) 0.0f, (-1.0d), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '#', (double) 0, (double) (short) 10, 0.0d, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (-1), (double) 'a', (double) 0, (double) 1.0f, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 10, (double) 1, (double) (-1L), (double) (byte) 100, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) 'a', (double) 1, (double) '4', (double) '4', (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) '4', (double) 10.0f, (double) (short) -1, (double) 1.0f, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) ' ', (double) '4', 0.0d, (double) (-1L), (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 0, (double) 0L, (double) (-1L), (double) 0L, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 0, (double) (byte) 1, (double) (byte) 10, (double) 1, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 0, 10.0d, (double) (byte) 0, (double) 0L, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 10, (double) 1.0f, (double) (short) -1, (double) (byte) -1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 10, (double) (byte) -1, (double) 10.0f, (double) (byte) 10, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 0, (double) ' ', (double) 10L, (double) (short) 10, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 0, 0.0d, (double) 1, (double) 1.0f, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) ' ', (double) 0.0f, (double) '4', 100.0d, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 10, (double) ' ', (double) (byte) -1, 0.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) -1, (double) 0.0f, (double) ' ', (double) (short) -1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 100, (double) 1, (double) 0L, 100.0d, 10, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 10, (-1.0d), (double) 0.0f, (double) 1L, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 1, (double) 10, (double) 10L, (double) '#', (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 0, (double) 100L, (double) (byte) 100, (double) (short) 0, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 10, (double) (byte) 0, (double) 100L, (-1.0d), (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 0, (double) 10L, (double) 0L, (double) (byte) 0, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) '#', (double) (-1.0f), (double) '4', 1.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 0, 0.0d, (double) (short) 100, (double) (-1L), 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 10, (double) 0, (double) ' ', 10.0d, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (-1), (double) 100L, (double) (byte) 1, (double) 0L, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 0, (double) 0.0f, (double) (short) 1, (double) 10.0f, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 100, 100.0d, (double) (byte) 1, (double) 'a', (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) '4', (double) 100.0f, (double) 100.0f, 100.0d, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 0, 0.0d, (double) 0.0f, (double) (byte) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 0, (double) 0L, (double) (-1L), 1.0d, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 100, (double) (short) -1, (double) 0, (double) (byte) 100, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 0, (double) 100, (double) (short) -1, (double) 100.0f, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) -1, (double) (byte) -1, (double) 10, (-1.0d), (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) '#', 0.0d, (double) 'a', 0.0d, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 1, (double) (short) 10, (double) 0L, (double) 10L, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 10, (double) (byte) 100, 10.0d, (double) (short) 1, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 10, (double) 0L, 100.0d, (double) 10L, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 0, (double) 0, (double) (-1L), (double) ' ', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 1, (double) 1L, (double) ' ', (double) 1L, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 0, (double) 100, 0.0d, (double) 100, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) -1, (double) (byte) 10, (double) (short) 1, 1.0d, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 1, (double) 10.0f, (-1.0d), 1.0d, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 100, (double) (-1), (double) 1.0f, (double) (byte) 0, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 1, (double) 100, (double) (short) -1, (double) (-1), 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) '4', (double) (-1), (double) 100L, (double) '#', (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 1, (double) (-1L), (double) 100L, 1.0d, (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 0, (double) 100, (double) '4', (double) 0.0f, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) 'a', (double) 10, (-1.0d), (double) 'a', (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 0, (double) 1, (double) (byte) 1, (double) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 10, (double) 0.0f, (double) 10, (double) 10, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) -1, (double) (-1.0f), 0.0d, (double) 1L, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 1, (double) '4', 1.0d, (double) (short) 10, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 0, 1.0d, (double) 10.0f, 1.0d, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 100, (double) (short) 1, (double) (byte) -1, (double) (byte) -1, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 1, (double) '4', (double) 100.0f, (double) (-1L), (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 1, 10.0d, (double) 10L, (double) (byte) 100, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 0, (double) 0, (double) (-1L), (double) (byte) 0, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 1, (double) (byte) 10, (double) 100L, (double) (short) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 100, 1.0d, (double) (short) 1, (double) 100L, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) -1, (double) 0L, (double) (short) 10, (double) (byte) 10, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) -1, (double) (short) 10, (double) 1, (double) (-1.0f), 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 1, (double) (byte) -1, (double) 100, (double) (short) 0, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 0, (double) 10, 0.0d, 100.0d, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 100, (double) 1L, (double) (short) 1, (double) '#', 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 1, (double) 100.0f, (double) '#', (double) 10.0f, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 100, (double) (-1L), (double) (short) 1, (double) (byte) 0, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 100, (double) 1.0f, 0.0d, (double) 1.0f, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 1, (double) '#', (double) (short) 0, (double) 0, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 0, (double) (short) 100, (double) '4', (double) 0L, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) ' ', (double) (-1.0f), (double) (short) 10, (double) (-1.0f), 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) '#', (double) (byte) 100, 100.0d, 1.0d, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 0, (double) 'a', (double) ' ', (double) 10, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) -1, 0.0d, (double) 0L, (double) (-1.0f), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 10, (double) 100L, (double) (short) 10, (double) (byte) 10, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 1, (double) (short) -1, (double) 0, (double) (short) 1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 1, (double) (short) 1, (double) 1.0f, (double) (byte) 100, (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 0, (double) (byte) 10, (double) (byte) 0, (double) 100.0f, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 0, (double) (-1L), (double) 10L, (double) (-1), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 0, (double) 10, (double) 1.0f, (double) (short) 10, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) -1, (double) 'a', (double) (short) 10, (double) 0, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 100, 0.0d, (double) (-1L), (-1.0d), (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 100, 1.0d, (double) (short) 10, (double) (short) -1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) -1, (double) (short) 10, (double) (-1), (double) (short) 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) '#', (double) 10, (double) '4', (double) '4', (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 1, (double) (-1), 0.0d, (double) (-1.0f), (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 100, (double) 0.0f, (double) (short) 100, (double) (short) 10, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) '4', (double) 100L, 0.0d, 100.0d, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 0, (double) (byte) 0, (double) (byte) 10, 0.0d, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) 0, (double) (short) 1, 0.0d, 1.0d, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '#', (double) 10L, (double) (byte) 10, 100.0d, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) 10, (double) (short) -1, 0.0d, (double) (short) -1, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 0, (double) 0, (-1.0d), (double) '#', (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) 'a', 10.0d, (double) (short) 10, (double) (-1.0f), (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) 1, (double) '#', (double) 10, (double) (short) 0, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) -1, (double) (byte) 100, (double) 0L, (double) (short) 0, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) '#', 0.0d, 0.0d, 10.0d, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 1, (double) 10, (double) (byte) 100, (double) (-1L), (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 0, (double) (byte) 10, (double) 10, (double) 100, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) -1, (double) (-1.0f), (double) 0.0f, (double) (short) 10, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 10, (double) (-1L), (-1.0d), (double) (byte) 10, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (-1), (double) (short) 0, 0.0d, (double) 0.0f, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 1, (double) (byte) 0, (double) (byte) 100, (double) 1.0f, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 1, (double) 100.0f, (double) 0.0f, (double) (byte) 10, 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) -1, 0.0d, (double) (-1L), (double) 1.0f, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 0, (double) (-1L), (double) 100.0f, 0.0d, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 0, (double) '#', 0.0d, (double) (byte) 1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 1, (double) 0L, (double) 0, (double) 10, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 0, (double) 10.0f, 0.0d, 0.0d, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 100, (double) (short) 1, (double) 1, (double) 0L, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) -1, (double) ' ', 1.0d, 0.0d, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) -1, (double) (short) -1, (double) (-1L), (-1.0d), 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) '4', 10.0d, (double) 0.0f, (double) 1L, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 1, (double) (byte) 10, (double) (short) 0, (double) 100L, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 0, (double) 10L, (double) (-1), (double) ' ', (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) -1, (double) '#', 0.0d, (double) (byte) 100, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 1, (double) 100L, (double) 'a', (double) (byte) 100, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 0, (double) ' ', (double) ' ', (double) 100L, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 100, (double) (short) 1, (-1.0d), (double) (-1), 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 0, (double) '4', (double) 1L, 100.0d, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) '#', (double) (byte) 100, (double) 0, (double) (-1), (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 100, (double) (-1), 1.0d, 1.0d, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 100, (double) (short) 1, (double) 1L, (double) 1.0f, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 0, (double) (short) 100, (double) 1L, (double) (byte) 10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 100, (double) 10L, (double) (byte) 0, 100.0d, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) -1, (double) (short) 100, 1.0d, 1.0d, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) 'a', 100.0d, (double) 1.0f, (double) 100, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 1, (double) (short) -1, 10.0d, (double) 'a', (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (-1), (double) '#', (-1.0d), 0.0d, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 10, (double) 1L, 0.0d, 0.0d, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 0, (double) 'a', (double) (-1L), 10.0d, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 100, (double) '#', (double) (short) 1, (double) (byte) 100, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) -1, 1.0d, (double) 1.0f, (double) ' ', (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 10, 1.0d, (double) '4', (double) (-1), (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 0, (double) '#', (double) 10.0f, 100.0d, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 100, (double) (short) 100, (double) ' ', 0.0d, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) '#', (double) ' ', (double) 1.0f, (double) 100L, (int) (byte) 1, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 100, (double) 10.0f, (double) '4', (double) 100L, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 0, (double) 100L, (double) (byte) 100, (double) 1.0f, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 1, (double) (short) 100, (double) 0, (double) (byte) 10, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) -1, 100.0d, (double) 0.0f, (double) (short) 100, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 1, 0.0d, (double) 'a', (double) 10L, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 10, (double) '4', (double) (byte) -1, (double) ' ', (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 0, (double) 0, (double) '4', (double) (byte) 0, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (-1), (double) (-1.0f), (double) (-1), 0.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '4', (double) (short) 1, (double) '4', (double) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 10, (double) (byte) 10, (double) (-1.0f), 0.0d, (int) 'a', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 1, (double) 100L, (double) 1L, (double) 10, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) ' ', (double) ' ', (double) (byte) 1, 0.0d, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) 'a', (double) (short) 10, (double) 1L, (double) 10, (int) (short) 10, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 10, (double) '4', (double) (byte) 10, (double) (short) 1, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) 'a', (double) (short) 0, (double) (byte) 100, (double) (byte) 0, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 1, 100.0d, 0.0d, (double) ' ', (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 10, (double) 'a', (double) (short) 0, (double) 100L, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) -1, (double) (short) 1, 0.0d, 100.0d, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) -1, (double) (byte) 1, (-1.0d), (double) 100L, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 0, 0.0d, (double) (short) 10, 0.0d, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 100, (double) (short) 10, (double) (byte) -1, (double) (-1.0f), (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 0, 100.0d, (double) 1L, (double) (short) 100, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) -1, (double) (short) 1, (double) 0.0f, 0.0d, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 10, (double) 100L, (double) (short) 100, (double) 10.0f, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 1, (double) 1, (double) 'a', (double) (byte) 100, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) '4', (double) (short) 10, (double) '#', (double) 10L, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 0, 10.0d, (double) 'a', (double) 10.0f, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 1, (double) 1L, (double) 100, (double) 10, (int) (short) 100, false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 1, (double) 10L, (double) 1, (double) (byte) 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 1, (double) 0.0f, (double) 0.0f, 100.0d, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 10, (double) (short) 1, (double) (byte) 100, (double) 'a', (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 100, (double) (short) 0, (double) ' ', (double) 0.0f, (int) '#', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 0, (double) 100.0f, (double) (-1L), 10.0d, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (-1), (double) 1, 100.0d, (double) ' ', (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 10, (double) (short) 10, (double) 1L, (double) (-1), (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) -1, (double) (byte) 1, (double) (-1L), 0.0d, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) -1, 10.0d, (double) (short) -1, (double) 10, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 1, (double) 0, (double) 1.0f, (double) 1L, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 0, (double) 100L, (double) 100L, (double) 100.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 100, (double) (-1.0f), (double) 10, 100.0d, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) 'a', (double) (byte) 1, (double) (short) -1, 10.0d, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 0, (double) '4', (double) (-1L), (double) (byte) 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 0, (double) (-1L), 0.0d, (double) '#', (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) 100, (double) (byte) 0, (double) (byte) 10, (double) (-1.0f), 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 1, (double) (short) 10, (double) (-1L), (double) (-1L), (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) ' ', (double) (byte) 100, (double) (short) 100, (double) 0.0f, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (-1), 1.0d, 0.0d, (double) 100L, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 0, (double) 0.0f, (double) (-1), (double) (byte) 100, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 10, (double) (byte) 1, (double) 10L, 10.0d, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (-1), (double) 10.0f, (double) 100, (double) (byte) 1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) ' ', (double) (-1.0f), (double) (byte) -1, 10.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 0, (double) (short) 1, (double) (short) 0, (double) 0.0f, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 100, (double) 0L, (double) 100.0f, (double) 1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 100, (double) (-1L), (double) (-1), (double) (short) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '4', (double) '#', (double) 100, (double) 0.0f, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 1, 0.0d, (double) 10.0f, (double) (-1L), (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 1, (double) (short) 10, (double) '#', (-1.0d), (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 0, (double) '4', (double) ' ', (double) (byte) 10, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 100, (double) 10.0f, (double) 100, (-1.0d), 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) 1, (double) (short) 0, (double) 0.0f, (double) 10, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) '#', 0.0d, (double) 0.0f, (double) '#', (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 0, (double) (byte) 10, (double) (byte) 10, 1.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 1, (double) (-1L), (double) (-1L), (double) (short) 0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 1, (double) 100, (double) (short) 0, (double) 1L, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 1, (double) '#', (double) 10L, (double) 'a', (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) -1, 0.0d, (double) (short) -1, (double) (-1L), (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 10, (double) (-1L), (double) 100, (double) 10.0f, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 0, (double) 0, 0.0d, (double) '4', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 100, (double) (byte) 0, 0.0d, (-1.0d), (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 1, (double) 100.0f, 0.0d, (double) '4', 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 100, (double) 100L, (double) 1L, (double) 100L, (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 100, (double) (byte) 1, (double) 0.0f, (double) (short) 100, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 0, 0.0d, (double) (-1), (double) 100L, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 1, (double) (short) 100, (double) 1, (double) (short) 10, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) ' ', (double) (byte) 1, (double) ' ', (double) 1.0f, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 0, 100.0d, (double) '4', (double) (short) 0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 1, (double) (byte) 1, (double) (-1L), (double) (byte) 10, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 10, 10.0d, (double) 100, (double) 0.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) '#', (double) 1.0f, (double) (short) 0, (double) 'a', (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) -1, (double) (byte) -1, (double) (byte) 100, (-1.0d), 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 1, 0.0d, (double) 1L, (double) 10.0f, (int) (short) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) -1, (double) (short) 100, (double) (byte) 1, (double) (-1), (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 100, (double) (short) 10, (double) 0, (double) (short) 10, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) ' ', (double) (byte) 100, (double) 'a', (double) (short) -1, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 100, (double) ' ', (double) (byte) 10, (double) 100L, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 0, (double) (short) 1, (double) (byte) 10, (double) (-1.0f), (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 0, 0.0d, (double) (-1L), (double) 100L, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 0, (double) (byte) 10, 100.0d, (-1.0d), (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 100, (double) 100.0f, (-1.0d), (-1.0d), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 10, (double) (byte) 10, (double) 10, (double) 1, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 0, (double) 1, 0.0d, (double) 100.0f, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 0, (double) (byte) 0, 0.0d, (double) 100, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 10, (double) (byte) 10, (double) (short) -1, (double) 0L, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 0, (double) 10, (double) 'a', (double) 100, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) '4', (double) (short) 1, (double) (short) 100, (double) (-1L), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 1, (double) (byte) 0, 1.0d, (double) (byte) 10, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 1, (double) 0.0f, 100.0d, (double) (byte) 0, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) -1, (double) 10, (double) 1.0f, (double) (byte) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 100, (double) 100, (double) (short) 100, (double) 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 100, (double) (byte) 0, (double) '4', (double) (short) -1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 10, (double) '#', (double) (short) 1, (-1.0d), (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 100, (double) 10L, (double) (short) 100, (double) 1.0f, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 10, (-1.0d), (double) '#', (double) ' ', 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) 'a', (-1.0d), (double) (-1L), (double) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 0, (double) 100L, (double) (byte) 10, (double) (-1.0f), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 100, (double) (byte) 1, 0.0d, 0.0d, (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) -1, (double) (byte) 0, (double) 10, (double) ' ', (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) 'a', (double) (byte) 0, (double) '#', (double) 0L, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) '4', 0.0d, 10.0d, (double) 100, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 10, (double) ' ', 0.0d, (double) (byte) 0, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 10, (double) 'a', (double) '#', 1.0d, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) '4', (double) (byte) -1, (double) (-1), (double) (-1.0f), (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 100, (double) (-1.0f), (double) (byte) 1, 0.0d, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 10, (double) 10L, (double) (-1.0f), (double) (short) 0, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '4', (double) 0.0f, (double) 1L, 100.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (-1), 0.0d, (double) 100.0f, (double) '#', (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) '#', (double) 10, (double) (byte) 100, 0.0d, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 100, (double) 1L, (-1.0d), (double) 'a', 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 1, (double) (short) -1, (double) 'a', (double) '4', (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) '#', (double) (byte) 1, (double) 0, (double) (byte) -1, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) -1, (double) ' ', 0.0d, 10.0d, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 1, 0.0d, (double) 0.0f, (double) ' ', (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 0, (double) '4', (double) (short) 10, (double) (-1L), (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 0, (double) 'a', (double) '4', 100.0d, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '4', (double) 10L, (double) 'a', 0.0d, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 1, (double) 0L, (double) (-1L), (double) '4', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 100, (double) 10L, 0.0d, (double) 'a', (int) (short) 10, true);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 100, (double) ' ', (double) 1, (double) 10.0f, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '#', (double) (short) -1, (-1.0d), (double) 10L, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 10, (double) 10, (double) '4', (double) 10.0f, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) ' ', (double) 100, (double) 100L, (double) '4', 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 1, (double) (byte) -1, 0.0d, (double) 10L, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 10, (double) ' ', (double) (short) 100, (double) '#', (int) '4', false);
        org.junit.Assert.assertNotNull(bufferedImage7);
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (-1), (double) '4', 0.0d, (double) 1L, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 0, (double) (byte) 1, (double) (short) 100, (double) 1L, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}
