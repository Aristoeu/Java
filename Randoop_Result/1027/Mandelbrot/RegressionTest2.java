package Mandelbrot;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 10, (double) (-1L), (double) 1.0f, (double) 'a', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (-1), (double) (short) 0, 1.0d, (double) (-1.0f), (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) '4', 1.0d, (double) 0.0f, (double) (byte) 10, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) 'a', (double) (byte) 100, (double) (byte) 10, (-1.0d), (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) -1, (double) 100, (double) (short) 100, (double) 0, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 0, (double) '#', 100.0d, (double) 100.0f, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 100, 0.0d, (double) (byte) 0, (double) ' ', (int) (short) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (-1), (double) 1, (double) (-1L), (double) 'a', 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '#', (double) (short) 1, (double) 'a', (double) (short) 10, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) ' ', (double) (-1.0f), (double) 10.0f, (double) 10, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 0, (double) (short) 100, (double) ' ', (double) (-1), (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 10, (double) 100L, 100.0d, (double) (short) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 10, (double) 1L, (double) 10L, (double) 10.0f, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 100, (double) 100L, (double) ' ', (double) (-1L), (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 100, 10.0d, (double) 10.0f, (double) '#', (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) '4', (double) 1.0f, (double) (short) 1, (double) 0.0f, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 10, (double) 100L, 0.0d, (double) (byte) 10, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 1, (double) 0, (double) (byte) 1, (double) '4', (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 10, 0.0d, (double) (short) -1, (double) 10, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 1, 0.0d, (double) 'a', 10.0d, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) 'a', (double) (byte) 100, (double) (-1), 0.0d, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) '#', (double) (byte) -1, (double) (byte) 1, (double) (short) 1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 10, (double) '4', (double) 10L, 0.0d, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (-1), (double) '4', (double) 100, (double) 1L, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 100, (double) 100, (double) 100, (double) (byte) -1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (-1), 0.0d, (double) 0.0f, (double) 10, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 1, (double) (short) 1, (-1.0d), (double) 'a', 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) 'a', (double) 100, (-1.0d), (double) 10, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 100, (double) (short) -1, (double) (byte) 0, (double) 10.0f, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 10, (double) '#', (double) (-1L), (double) 0L, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 10, (double) 'a', (double) 0, (double) (-1L), (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) ' ', (double) (byte) 10, (double) (short) -1, (double) (byte) -1, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 1, (double) '#', (double) 0.0f, (double) (byte) -1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 0, (double) (byte) 1, (double) (byte) 10, (double) 0.0f, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (-1), (double) (byte) 1, (double) '#', (-1.0d), (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 0, (double) 1, (double) 100L, (double) 1L, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) '4', (double) 0.0f, (-1.0d), (double) (short) 1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) 1, (double) (short) 0, (double) (short) -1, (double) 0, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 0, (double) 100.0f, (double) (byte) 0, 0.0d, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 1, (double) (byte) 0, (double) (-1), (double) 1.0f, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 0, (double) 100L, (double) 'a', (double) (short) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 100, (double) (byte) 100, (double) 100L, (double) (byte) -1, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 100, (double) (byte) -1, (double) (byte) 100, (double) (byte) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) 'a', (double) (byte) 10, (double) '4', (double) (-1), (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 0, (double) (byte) -1, (double) (short) 10, 1.0d, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 100, (double) (byte) -1, (double) 100.0f, (double) 0, (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) -1, (double) 0L, 1.0d, (double) 10L, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 1, (double) 100, (double) 10, 100.0d, (int) '#', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) ' ', (double) (short) 10, (double) (byte) 10, (double) (short) -1, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 1, (-1.0d), (double) (short) 100, (double) '#', (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 0, (double) 1L, (double) (short) 1, (double) 100, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 1, (double) (byte) 0, (double) '4', (double) '4', (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) '#', (double) (short) 100, (double) 0.0f, (double) 10.0f, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) '#', (double) (-1.0f), (double) 100.0f, (double) 1L, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (-1), (double) (-1.0f), (double) '#', (double) ' ', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 10, (double) '4', 0.0d, 10.0d, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 10, (double) 10, 0.0d, (double) 100.0f, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) 'a', (-1.0d), (double) (byte) 1, (double) 100.0f, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (-1), (double) (byte) 1, (double) 0.0f, (double) 10, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 10, (double) 1.0f, (double) (short) 100, 100.0d, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 0, (double) (byte) 100, (double) 10.0f, 1.0d, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) -1, (double) 10L, (double) (-1.0f), (double) '#', (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 0, 10.0d, (double) 1.0f, (double) (byte) 10, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 10, (double) (short) 0, (double) 'a', (double) 100, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) '#', (double) 100, (double) 100, (double) (short) 10, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 0, (double) (short) 0, 0.0d, (double) 1, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (-1), 0.0d, (double) 0L, (double) '4', (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) -1, (double) 100, (double) 1.0f, (double) (-1), (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) -1, (double) 10.0f, (double) 100L, (double) (byte) 1, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 1, (double) '#', (double) 0L, (double) (short) 100, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 0, (double) 0, (double) (-1.0f), (double) 100.0f, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 0, (double) 100.0f, (double) 100.0f, 1.0d, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) -1, (double) (short) 10, (double) (byte) 10, (double) ' ', (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 10, (double) 100L, (double) (byte) 100, 0.0d, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 1, (double) (short) 1, (double) 0L, (double) ' ', (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 1, (double) (short) 1, (double) 100L, (double) '#', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 0, (double) (-1L), (double) (short) 1, (double) 100.0f, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) 'a', (-1.0d), (double) 10, 1.0d, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) '#', (double) (byte) -1, (double) (byte) 100, 10.0d, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) 'a', (double) (byte) 10, (double) (short) 10, (double) 10, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 100, 1.0d, (double) '#', 0.0d, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) -1, (double) (byte) -1, (double) (-1), (double) (byte) 10, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 0, (double) '4', 0.0d, 1.0d, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 10, 100.0d, (double) (byte) 1, (double) (-1.0f), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) 'a', (double) (byte) 0, (double) 100, (double) 'a', (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 0, (double) 1.0f, (double) '#', (double) (byte) 0, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) 'a', 1.0d, (double) (short) 10, (double) (-1.0f), (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 100, (double) (-1.0f), (double) (short) 100, (double) 1.0f, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 0, (double) 'a', 10.0d, (double) 1.0f, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (-1), (double) 100, (double) 1L, 0.0d, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 1, 1.0d, (double) (-1), (double) 10, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) 1, (double) 0.0f, (double) 0, (-1.0d), (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 0, (double) 100.0f, (double) (short) 100, (double) (byte) 0, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) ' ', (double) 100.0f, (double) '#', (double) (byte) 100, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 100, (double) 10.0f, (double) (short) 10, (double) 0L, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 100, (double) 100.0f, (double) 0, (double) 1.0f, (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 10, (double) 100L, (double) (short) 100, (double) (byte) 100, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 10, (double) (short) 100, (double) 0.0f, (double) 10.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) -1, (double) (-1), (double) 0L, (double) ' ', (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) -1, 0.0d, (double) 1.0f, (double) (short) 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 10, (double) (short) -1, (double) (short) -1, (double) 0, (int) (short) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) '4', (double) 10, (double) '#', (double) 100L, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 1, (double) 'a', (double) 100, 100.0d, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) ' ', (double) 10, (double) (-1.0f), 0.0d, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 10, (double) (-1.0f), (double) 10L, (double) 'a', 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) ' ', (double) 1.0f, (double) (-1), (double) 1.0f, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 10, (double) '4', (double) (-1), (double) '4', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 100, (double) (byte) 10, (double) '4', (double) 1.0f, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 10, (double) (-1), (double) ' ', (double) '4', 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 0, (double) (-1L), (double) ' ', (double) ' ', (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 100, (double) 100, (double) (-1), (double) '4', (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 100, 0.0d, (double) (-1), (double) 10, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) -1, 0.0d, (-1.0d), (double) '#', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) 10, (double) 0, (double) (-1), (double) 1L, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) '4', 1.0d, (double) (-1.0f), (double) 'a', (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 100, (double) 0.0f, (double) 'a', (double) (short) 100, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) -1, (double) (short) 10, (double) 1.0f, (double) (short) 100, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 0, (double) 1L, (double) 0, (double) (-1.0f), (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) -1, 0.0d, (double) (byte) 1, (double) 100.0f, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 0, (double) 100, (double) 100.0f, 0.0d, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 0, (double) (short) -1, (double) 10L, (double) (short) 0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 10, (double) (byte) 0, (double) 1, (double) 'a', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 10, (double) 100, (double) (short) 100, 0.0d, (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (-1), (double) (short) 0, 100.0d, (double) (byte) 1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 0, (double) 0, (double) (short) 100, (double) 1L, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 0, (double) ' ', (double) 10, 10.0d, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 10, (double) (-1), (double) (byte) 0, 0.0d, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) 0, (double) (-1), (double) 1.0f, (double) (short) 1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 1, (double) (short) 10, (double) (short) -1, 100.0d, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) ' ', (double) (byte) 100, (double) (short) -1, (double) (-1L), (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 0, (double) (short) 100, (double) (short) 0, 0.0d, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 100, 1.0d, (double) 100, (double) (byte) 10, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (-1), (double) (short) 100, (double) 1L, 0.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 1, (double) 10, (double) (short) -1, (double) (-1), (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) '4', (double) (byte) 100, (double) (byte) 1, (double) (byte) 10, 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) -1, (double) 10, (double) (short) -1, (double) (short) 10, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 10, (double) (-1), (double) (-1.0f), (double) (byte) 10, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 1, (double) (short) 100, (double) (byte) 0, (double) (short) 0, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '4', (double) (short) 0, (double) 10.0f, (double) 10L, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 100, (double) 100, 0.0d, (double) (-1), (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) -1, (double) 10, 0.0d, 0.0d, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) ' ', (double) (byte) 1, (-1.0d), (double) (short) 0, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 0, 0.0d, 100.0d, (-1.0d), (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 0, (double) 1.0f, (double) 0, (double) (short) 0, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 100, (double) (short) 10, (double) '#', 10.0d, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) '4', (double) '4', (double) '4', 0.0d, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 1, (double) (byte) 1, (double) (short) 0, (double) 1L, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 100, (double) (-1.0f), 1.0d, (double) (short) -1, 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) 'a', (double) 'a', 10.0d, 10.0d, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 100, (double) (-1L), (double) 10L, (double) 0.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) 'a', (double) 0L, (double) (byte) 100, 0.0d, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) 'a', (double) (byte) 10, (double) (byte) 10, (double) 100L, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) 'a', (double) (byte) 100, (double) (short) 100, (double) (short) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 10, (-1.0d), (double) (-1), (double) (byte) -1, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) -1, (double) 10L, (double) (short) 0, (double) 10.0f, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 10, (double) '#', (double) (short) 0, (double) ' ', (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 0, (double) 100.0f, (double) '#', (double) 0L, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) 'a', 100.0d, (double) '4', (double) 10.0f, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) -1, (double) (short) -1, (double) (-1), (double) 0.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) 100, (double) '#', (double) (byte) -1, (double) (short) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) ' ', (double) '#', (double) (byte) 100, (double) (byte) 0, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 1, (double) 10, (double) (byte) 100, 0.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 0, 0.0d, (double) 10.0f, 0.0d, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 1, (double) (short) 1, (double) 1, (double) 1, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) '4', (double) 100, (double) 10, 0.0d, 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) ' ', (double) 1.0f, (double) (-1), (double) '#', 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (-1), (double) (short) 100, (double) 0L, 1.0d, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 10, 0.0d, (double) (short) 1, (double) 100, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 10, (double) (short) 0, (double) (byte) 1, (double) 100.0f, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 0, (double) 0.0f, (double) (short) -1, (double) 1.0f, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 1, (double) 0L, (double) ' ', (double) 1, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) '#', (double) (short) 100, (double) (short) 100, (double) (byte) 100, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) 'a', 0.0d, (double) (-1L), 100.0d, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) ' ', (double) '#', 1.0d, (double) 0, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 100, (double) '#', (double) 1L, 0.0d, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 10, (double) (byte) 100, (double) (short) 10, (double) (-1L), (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 10, (double) 100L, (double) 10.0f, 100.0d, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 0, (double) (byte) 100, (double) 10L, 100.0d, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 1, (double) (short) 100, (double) (-1.0f), 0.0d, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 0, (double) (short) 0, 0.0d, (double) (short) 0, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 1, (double) 1L, (-1.0d), (double) 1.0f, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 100, (double) '4', (-1.0d), (double) (-1), (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 10, (double) 100, (double) (byte) 1, (double) 10, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 1, (double) 100, (double) (byte) -1, (double) 100.0f, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 0, (double) '4', (double) '4', (double) 0.0f, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) -1, (double) 0, (double) 10.0f, (double) 0L, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) -1, (double) (short) 0, (double) (short) 1, (double) (byte) 100, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) 'a', (double) 0, (double) 100, (double) (short) 1, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) 'a', (double) 10.0f, (double) ' ', (double) (-1), (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (-1), (double) ' ', (double) 100, (double) (byte) 100, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) '#', (-1.0d), (double) (short) 10, 1.0d, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) ' ', (double) (-1), 0.0d, (double) 1L, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 10, 1.0d, 0.0d, (double) (byte) 100, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 100, (double) (byte) 0, (double) (short) 100, (double) 10, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 1, (double) 0.0f, (double) 0L, (double) '4', (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) -1, 0.0d, (double) 0L, (double) 100.0f, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 1, (double) 100L, (double) 0L, (double) (-1.0f), (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) '#', (double) 0, (double) 1.0f, (double) '4', 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) -1, 0.0d, 10.0d, (double) (byte) 1, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 0, 0.0d, (double) (byte) 0, 0.0d, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) -1, (double) 10, (double) 100L, (double) (byte) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) -1, (double) 10.0f, (double) (-1L), (double) (byte) 100, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (-1), (double) 0L, 10.0d, (double) 100L, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) ' ', 100.0d, (double) 0, 100.0d, 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 100, (double) (short) 0, (double) (-1L), (double) 10L, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 100, (double) (byte) 1, 1.0d, (double) 10, 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) -1, (double) 100.0f, (double) (short) -1, (double) (short) -1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 0, (double) 10.0f, (double) 'a', (double) 0.0f, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 0, (double) 0, (double) (byte) 10, (double) (byte) 100, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 10, (double) 10, (double) 1L, (double) (short) 1, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 100, (double) (short) 0, (double) 100, (double) (short) 0, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) -1, (double) (byte) 100, 100.0d, (double) (byte) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 1, (double) ' ', (double) (short) 0, (double) (short) 1, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) 0, (double) 0.0f, (double) 1.0f, (double) 100, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) '#', (double) (byte) 0, (double) 100.0f, 0.0d, (int) (short) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 10, (double) (byte) 100, (double) (byte) -1, (double) (short) 1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) -1, (double) 10.0f, (double) 100L, (double) (short) 100, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) '4', (double) (byte) 1, (-1.0d), 0.0d, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 1, 100.0d, (double) 100, (double) ' ', (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) -1, (double) (-1.0f), 1.0d, (double) (byte) 0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 0, (double) '#', 0.0d, (double) (short) -1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) -1, 10.0d, (double) (short) 100, (double) 1.0f, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 0, (double) (byte) 0, (double) (byte) -1, (double) 10, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 0, (double) 10.0f, (double) 0, 0.0d, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) -1, (double) 100L, (double) (byte) 10, (double) (short) 1, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 0, 0.0d, 0.0d, (double) (-1.0f), 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 100, (double) 100, (double) 0, (double) 100.0f, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) 10, 0.0d, (double) (byte) 100, (double) (byte) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) '4', (double) 1L, (double) (short) 1, (double) 1, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 10, (double) 'a', 0.0d, (double) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) '#', (double) (byte) 10, (double) 0.0f, (double) (short) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) -1, 0.0d, (double) 1L, (double) 'a', (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (-1), 0.0d, (double) '#', (double) (short) 100, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 1, (-1.0d), 0.0d, (double) (short) 1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 10, (-1.0d), (double) 0, (double) (short) 1, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 10, (double) 0, (double) (short) 0, (double) 0L, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 10, (double) 10.0f, (double) 1.0f, 0.0d, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 0, (double) 1L, (double) 10.0f, (double) ' ', (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) 'a', (double) (byte) 100, 0.0d, (double) (byte) 10, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 0, 1.0d, 10.0d, (double) (byte) 0, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (-1), (double) (byte) 10, (double) 10, (double) 100, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '#', (double) 10L, (double) (byte) 10, (double) (byte) 0, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 0, (double) (byte) 1, (double) (short) -1, (double) '#', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) ' ', (double) (short) 100, (double) (-1.0f), (double) (byte) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 100, 0.0d, (double) (byte) 100, (double) 100.0f, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 100, (double) 100.0f, (double) (byte) -1, (double) (-1), (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) -1, 1.0d, (double) (byte) 100, (double) (short) -1, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 1, (double) (short) 0, (double) (short) 0, (double) 100, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 0, (double) ' ', (double) (short) 100, (double) (short) 10, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 0, (double) 1.0f, (double) '#', (double) (byte) -1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) '4', 0.0d, (double) (short) -1, (double) (byte) 0, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 0, (double) (-1L), (double) 1L, (double) (short) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 10, (double) (short) 1, (double) (short) -1, (double) 10, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) '#', (double) 1, (double) (short) 100, (double) 0, (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) ' ', (double) '#', 1.0d, (double) 0.0f, (int) '#', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 100, 10.0d, (double) ' ', (double) (-1.0f), 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 10, (double) 1, 10.0d, 10.0d, (int) (byte) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 0, (double) (-1), (double) (-1L), (double) 0, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 1, 0.0d, (double) 10.0f, 0.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 10, (double) (byte) 10, (double) ' ', (double) (short) -1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 1, (double) (byte) 0, (double) (short) 10, 0.0d, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) ' ', (double) (-1), (double) (short) -1, (double) 10, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) '#', (double) (short) 100, (double) (byte) -1, (double) (short) 0, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) -1, (double) 0L, (double) (byte) 0, (double) (short) -1, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 10, (double) (byte) 0, (double) (-1), (double) (short) 100, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) -1, (-1.0d), (double) 'a', (double) 0.0f, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) 100, (double) ' ', (double) '#', (double) 10, (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 1, (double) '4', (double) 100, (double) (-1L), 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) 'a', (double) 0L, (double) 1L, 0.0d, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 1, (double) (byte) -1, (double) 1L, (double) 10, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 10, (double) (short) 100, (double) 0, (double) (-1L), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (-1), (double) (byte) 100, (-1.0d), (double) 0, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (short) 0, (double) (short) -1, (double) 10L, (double) 1, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 100, 0.0d, (double) '#', (double) '#', (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 100, (double) ' ', 0.0d, (double) (-1L), (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) 'a', (double) (byte) 10, (double) 10L, (double) (-1.0f), (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 0, (double) (short) 1, (double) (-1), 10.0d, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 0, (double) (short) -1, (double) 0L, (double) (-1.0f), (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 1, (double) 1L, 0.0d, (double) 1L, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 100, 0.0d, (double) 1, (double) (short) 0, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 1, 1.0d, (double) (short) 100, (double) 100, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) 0, (double) 'a', (-1.0d), (double) 'a', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, 0, (double) (byte) 10, (double) (short) 10, (double) (short) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 10, (double) (short) 1, (-1.0d), (double) (short) 0, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 0, (double) (byte) 0, 100.0d, (double) 100.0f, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 1, (double) '#', (double) (short) 1, 0.0d, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 0, (double) 100, (double) (short) -1, (double) (short) 1, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) 100, 0.0d, (double) (short) 10, 0.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) 'a', (double) (byte) -1, (double) 100L, (double) (byte) 100, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) '4', (double) (byte) -1, (double) 1.0f, (double) 1, (int) '#', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 10, (double) (short) 100, (double) (byte) 100, (double) 100, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) -1, (double) 1L, (double) '4', (double) 100.0f, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 0, (double) (byte) 100, (double) (short) 0, (double) 10.0f, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 10, 10.0d, (double) 'a', (double) 100L, (int) 'a', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) '4', 0.0d, (double) (byte) 100, 0.0d, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) -1, 0.0d, (double) (byte) 10, (double) (byte) -1, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 0, (double) '#', (double) 10L, (double) ' ', (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 100, (double) (byte) 10, (double) 0L, (double) 0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) -1, (-1.0d), (double) 0L, 10.0d, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 1, (double) ' ', 10.0d, (double) (short) 10, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 0, (double) 10, (double) (-1.0f), 0.0d, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 1, (double) 10L, (double) 0L, (double) (short) 0, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (-1), (double) (byte) 1, (double) 100, (double) (byte) 100, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 1, (double) 1L, (double) 0.0f, (-1.0d), (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) '#', (double) 100L, (double) 100L, (double) (short) -1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 100, (double) (-1.0f), (double) 1, 100.0d, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, 0, 0.0d, (double) (short) 100, (double) (byte) 10, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) -1, (double) 1L, (double) 1.0f, (double) '#', (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) '4', (double) 10.0f, (double) 1.0f, 0.0d, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '#', (double) (-1L), (double) 1L, (double) 0L, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) '4', 100.0d, (double) (short) 100, (double) 1L, (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) 100, (double) (byte) 0, (double) '4', (double) 0.0f, (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 1, (double) 10.0f, (double) 1L, (double) (short) 100, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) '#', (double) (short) 1, (double) 10, (double) (short) 0, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 0, (double) (-1), (double) 1L, (double) (-1L), (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) -1, (double) 10, (double) (short) 100, (double) (-1), (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (byte) 100, (double) (byte) 0, (double) (short) 1, (double) (short) 100, (int) (byte) 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '#', (double) (short) 100, (double) 10L, (double) 1.0f, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '4', (double) 10L, 1.0d, (double) 100, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 1, (double) 0, (double) (byte) 0, (double) (-1), (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 100, (double) '4', (double) 1.0f, (double) 10, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) '#', (double) 10.0f, (double) 100L, (double) (byte) 100, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) -1, (double) 0L, (double) (byte) 100, (double) (-1L), (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) 'a', (double) (byte) 1, (double) 1L, (double) 1.0f, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) -1, (double) 100, (double) 0.0f, (double) (short) -1, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 10, (double) (short) -1, (double) 100, 0.0d, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 0, (double) 100.0f, (double) '4', (double) 0.0f, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 1, (double) (-1.0f), 0.0d, 1.0d, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 0, (double) 100L, 1.0d, (double) '4', (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) '#', (double) '#', 0.0d, (double) '4', (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 100, (double) 'a', (double) 0, (double) 0.0f, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 0, (double) 10L, (double) 100, 10.0d, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) '#', 0.0d, (double) 'a', (double) (byte) 100, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) ' ', (double) 100, (-1.0d), (double) (-1), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) 'a', 0.0d, (double) 0.0f, (double) 'a', (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 10, (double) 10L, (double) (byte) 0, (double) '#', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 0, (double) 10L, (double) (-1), (double) 0L, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) 'a', (double) 'a', (double) 10, 1.0d, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) 'a', (double) (short) -1, (double) 10L, (double) '4', (int) (byte) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) '4', 10.0d, (double) 10L, (-1.0d), (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) 0, (double) 0L, (double) (byte) 100, (double) (-1L), (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 0, (double) ' ', 100.0d, (double) (short) 100, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 100, (double) 0.0f, 10.0d, 0.0d, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 0, (double) (short) 10, (double) (-1), (double) 'a', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (byte) 1, (-1.0d), (double) 0L, (double) (short) 1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 10, (double) (byte) 0, (double) (-1L), (double) 1.0f, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) (short) 0, (double) (byte) -1, (double) '4', (double) (short) 0, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) -1, (double) (short) 1, 1.0d, (double) 10.0f, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (-1), (double) (short) -1, (double) (short) -1, 0.0d, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (-1), (double) (byte) 0, 0.0d, (double) 100L, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (-1), (double) 10.0f, (double) 1, (double) (byte) -1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) 'a', (double) (short) 10, (double) 10.0f, (double) (byte) -1, 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) '4', (double) (-1.0f), (double) (byte) 1, (double) (short) 10, (int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, 0, (double) (-1L), (double) 100L, (double) (short) -1, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (short) -1, 0.0d, (double) 1, (double) 10.0f, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 0, (double) (byte) 100, (double) 100, 10.0d, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 100, (double) (short) 1, (double) 10.0f, 10.0d, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 100, (double) (short) 100, (double) 100L, (double) 100.0f, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) '#', (double) 0L, 100.0d, 0.0d, 10, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 10, (double) (short) 100, (double) (-1.0f), (double) (byte) 0, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 10, (double) ' ', (double) 0, (double) 'a', (int) (short) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 1, (double) 100, 1.0d, (double) (short) 0, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) 0, (double) (byte) 1, 0.0d, (double) 10L, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (-1), (double) 1, (double) (-1.0f), 10.0d, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 100, (double) 10L, (double) '#', (double) (short) 100, (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) 'a', (double) (short) 100, 10.0d, (double) (-1L), (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 100, (double) (byte) 10, (double) (byte) -1, (double) 1.0f, (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (byte) 1, (double) (-1L), (double) '4', 0.0d, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 1, (double) (byte) 100, 10.0d, (double) 100, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) -1, (double) 10, (double) 1L, (double) 0L, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 10, (double) (byte) 100, (double) 1L, 100.0d, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) 'a', (double) (short) 1, (double) (-1L), 0.0d, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) '#', (double) (short) 10, 0.0d, (double) (-1), (int) (short) 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, (int) 'a', (double) (short) -1, 10.0d, (double) (byte) 0, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 10, (double) 10, (double) (short) 1, (double) (short) 0, (int) (byte) 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', 1, (double) (byte) 100, (double) (byte) 1, 0.0d, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (short) -1, 0.0d, 0.0d, (double) 0, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 100, 100.0d, (double) 100L, (double) 'a', (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 10, (double) 1L, (double) (-1L), (double) ' ', (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 0, (double) 'a', 100.0d, 0.0d, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) '#', (double) '4', 10.0d, (double) '4', (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) -1, (double) (short) 0, 1.0d, (double) (byte) 100, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) '#', 0.0d, (double) (byte) 0, (double) (short) -1, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 10, (double) (short) -1, (double) 10.0f, (double) 100L, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, 0, (double) (short) 10, (-1.0d), (double) 100, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 1, (double) 10.0f, 0.0d, 10.0d, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 1, (double) (byte) 100, (double) '4', (double) 0.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (-1), (double) (short) 0, (double) 0, (double) (short) 100, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (short) 1, (double) (short) 0, (double) 100.0f, (double) (byte) 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 0, (double) (short) -1, 100.0d, (double) 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) '4', 1.0d, (double) 10.0f, (double) (-1.0f), (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) 'a', (double) 0, (double) (byte) 10, (double) 'a', 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) -1, (double) 'a', (double) (-1L), (double) 0.0f, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 100, (double) (short) 0, 100.0d, (double) 10.0f, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, 0, 0.0d, (double) 100L, (double) (byte) 100, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, 0, (double) (-1L), (double) (byte) 1, (-1.0d), 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 100, (double) (short) -1, (double) 1L, 10.0d, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 1, (double) ' ', (double) 0L, (double) (short) 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 0, (double) (short) -1, (double) (byte) 1, (double) 'a', (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), 100, (double) (byte) 1, (double) (byte) 10, (double) 1, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) -1, (double) 1, (double) (byte) 10, (double) 0L, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 1, (double) (byte) -1, 0.0d, (double) (byte) -1, (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 0, (double) 0, (double) (short) 0, (double) (short) 0, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '4', (int) (short) -1, (double) (byte) 100, (double) 0L, (double) 10L, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) -1, (double) (byte) -1, (-1.0d), (double) (-1L), (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 0, (double) (short) 0, (double) ' ', (double) (short) 10, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) -1, (double) (byte) -1, 100.0d, 100.0d, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 10, (double) (-1L), (double) 100.0f, (double) (short) 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) '4', 1.0d, (double) 0L, (double) 100L, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (byte) 100, (double) (-1), (double) (byte) -1, (double) (short) 1, (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (-1), (double) (-1), (double) (byte) 0, (double) (byte) 100, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) 'a', (double) (-1), (double) (byte) -1, (double) '4', 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 100, (double) (byte) 10, (double) '#', (double) (-1L), (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (short) 0, (double) (byte) -1, (double) 0L, (double) (short) 1, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (byte) 100, (double) 100L, (double) 100, (double) (-1L), (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (byte) 1, (double) 1L, (double) 10.0f, (double) 100, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) -1, (double) (short) 0, (double) 10L, (double) (byte) 1, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 0, (double) 1, (double) 0.0f, (double) 'a', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 0, (double) (byte) 1, (double) 1, (double) 10L, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) '#', (double) 1.0f, (double) 100.0f, (double) (short) -1, 100, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) -1, (double) 'a', (double) (byte) -1, (double) (byte) 100, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 10, 0.0d, (-1.0d), (double) 100L, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 0, (double) 0L, (double) (byte) 0, 10.0d, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (short) -1, (double) 1, (double) (short) 10, (double) 0, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 1, (double) (byte) 100, 0.0d, (double) 1L, (int) (short) 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (short) 100, (double) (byte) 100, (double) 1, (double) 1.0f, (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 100, (double) 100, (double) (byte) 100, (double) (short) 10, (int) '4', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) (byte) 0, (double) 1, (double) 0, (double) (-1.0f), 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 0, (double) (short) 0, 0.0d, (double) (-1L), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) 10, 10.0d, (double) 100.0f, (double) (-1L), (int) '#', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 10, 0.0d, 10.0d, 0.0d, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) '4', (double) (short) 0, 0.0d, (double) 100, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 0, (double) 0.0f, (double) '#', (double) ' ', (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) '#', (double) (byte) 1, 0.0d, 10.0d, 1, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (-1), 100.0d, (double) (short) -1, (double) (-1), 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, 1, (double) 10.0f, (double) (byte) 10, (double) 0L, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 0, (double) (-1L), (double) (short) 0, (double) 'a', (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (-1), (double) 100.0f, (double) (short) 100, (double) (short) 0, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 10, (double) 1L, 0.0d, (double) (short) -1, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) -1, (double) (byte) 100, (double) (byte) 100, (double) 100L, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) -1, (double) 'a', (double) 0.0f, (double) 10, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 10, 100.0d, (double) 1.0f, 0.0d, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) (short) 1, (double) (short) -1, (double) 10L, (double) (byte) -1, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) -1, (int) '#', (double) 10.0f, (double) (-1), (double) 0.0f, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (short) -1, (double) (-1.0f), 0.0d, 0.0d, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 100, (double) (byte) -1, (-1.0d), 0.0d, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 0, (-1.0d), 0.0d, (double) (short) 0, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) 1, (double) (short) 1, (double) 100L, 0.0d, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 0, (double) (short) 10, (double) 1.0f, (double) ' ', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, (int) (byte) 10, (double) (byte) -1, (double) 1, (double) 0.0f, 1, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', 1, (double) (byte) 100, (double) 100.0f, (double) (-1), (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 0, 1.0d, (double) 10L, (double) 0L, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, 10, 1.0d, (double) 0L, (double) 100L, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) '4', (double) 100, (double) 1L, 1.0d, (int) ' ', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 1, (int) (byte) 1, (double) 0.0f, (double) 0L, (double) 100, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) '#', (double) (-1.0f), (double) 100L, 0.0d, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (byte) 0, 10.0d, (-1.0d), 10.0d, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 0, (double) (byte) 1, (double) ' ', (double) (byte) 0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, (int) (short) 10, (double) (short) 100, (double) 1L, 10.0d, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (short) 100, (double) 10L, (double) 0, (double) (short) -1, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) '#', (double) '#', (double) 1.0f, (double) '#', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 0, (int) (byte) 0, (double) (short) -1, 0.0d, (double) 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) '4', (double) 1, 100.0d, (double) (short) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 0, 0.0d, 0.0d, (double) (short) 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 100, (double) 1, (double) 0, (double) 'a', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (short) 100, (double) (-1.0f), (double) 10.0f, (double) '4', (int) (byte) 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) (byte) 1, (double) 1, (double) (short) 0, (double) (short) 0, (int) '#', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (short) 1, 0.0d, (double) 1L, (double) 10L, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 1, 1.0d, (double) (byte) 100, (double) '#', 10, false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 1, (double) (-1.0f), (double) 1L, (double) '4', (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 0, (double) 10.0f, (double) 10L, (double) 1, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 100, (double) 10L, (double) (-1.0f), 10.0d, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', 10, (double) 1, (double) 0, (double) '#', (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 100, 100.0d, 100.0d, (double) (byte) 1, (int) '#', true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 0, (double) 0, 10.0d, 1.0d, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(100, 0, (double) '#', (double) 'a', (double) 1.0f, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 10, 0, (double) (short) 0, (double) (-1), 0.0d, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, (int) (byte) 100, (double) (short) 100, (double) (short) 100, (double) 100, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) -1, 1, (double) (byte) 1, (double) '#', (double) ' ', (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (short) 100, (double) 1L, (double) 0, (double) (byte) 0, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, 1, (double) 1, 100.0d, (double) (byte) 1, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 10, 0.0d, (double) 'a', (double) (short) 0, 100, true);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) ' ', (int) (short) 100, 10.0d, (double) '#', 100.0d, (int) '4', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 10, (int) (byte) 10, 0.0d, (double) 1L, 0.0d, (int) ' ', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 10, (double) (byte) 100, (double) 1L, (double) 1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (-1), (double) 100, (double) 10L, (double) (-1L), 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, (int) (byte) 0, (double) 10.0f, 10.0d, (double) 'a', (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 0, (int) (byte) -1, (double) 0.0f, (double) (short) 100, (double) (byte) 100, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((-1), (int) 'a', (double) 0, 100.0d, (double) (byte) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) 'a', (int) (byte) 1, (double) 0, (double) 10.0f, (double) (-1), (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(0, (int) (short) 0, 10.0d, (double) 0L, (double) 0L, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageWidth should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (-1), 0.0d, (double) (-1), (double) 0, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) '4', (double) 100.0f, 10.0d, (double) (byte) -1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', (int) 'a', (double) ' ', (double) 1.0f, (double) 'a', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (short) 100, (int) (byte) 10, (double) (-1.0f), (double) (short) 1, (double) 100L, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(1, (int) (byte) -1, (double) (-1.0f), (double) 100, (double) '4', 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage(10, (int) (short) 10, 0.0d, (double) 10.0f, (double) 100, (int) 'a', false);
        java.lang.Class<?> wildcardClass8 = bufferedImage7.getClass();
        org.junit.Assert.assertNotNull(bufferedImage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 100, 0, (double) 100.0f, 0.0d, 10.0d, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) '#', 1, 100.0d, (double) 100.0f, (-1.0d), (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxStep should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = com.thealgorithms.others.Mandelbrot.getImage((int) (byte) 1, 0, (double) 10, (double) 10L, 100.0d, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: imageHeight should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

