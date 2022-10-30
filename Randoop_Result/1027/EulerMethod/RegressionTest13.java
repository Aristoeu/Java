package EulerMethod;

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
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (short) -1, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06502");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) (short) 0, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06503");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, 0.0d, (double) 'a', (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06504");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 10L, (double) 10.0f, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06505");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) '#', (double) (byte) 0, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06506");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) 0L, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06507");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 10L, (double) 100L, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06508");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) 0L, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06509");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) 100.0f, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06510");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, 100.0d, (double) '4', 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06511");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) (byte) -1, (double) '#', (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06512");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) (short) 0, (double) 1L, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06513");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) 0, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06514");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, 1.0d, (double) (short) 1, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06515");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) (-1), (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06516");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) 10, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06517");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) '#', 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06518");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 0.0f, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06519");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) (short) 10, (double) (-1.0f), (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06520");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) 10L, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06521");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) (byte) 10, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06522");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) (-1L), (double) (-1.0f), (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06523");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, 100.0d, (double) 0L, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06524");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) (short) 0, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06525");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, 0.0d, (double) 100.0f, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06526");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (byte) 0, (double) 1.0f, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06527");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, 0.0d, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06528");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 1.0f, (double) (short) -1, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06529");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, 0.0d, (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06530");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) '#', 10.0d, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06531");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (-1.0d), 0.0d, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06532");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 10, (double) 100, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06533");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 1L, (double) (byte) -1, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06534");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, 10.0d, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06535");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) 1L, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06536");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) 1L, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06537");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) 100L, (double) 100L, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06538");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) '#', (double) (short) -1, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06539");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) (-1), (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06540");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, 0.0d, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06541");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 1.0f, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06542");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) 0.0f, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06543");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 1L, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06544");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) (-1L), (double) '4', (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06545");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, 10.0d, 100.0d, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06546");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 1.0f, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06547");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, 0.0d, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06548");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) (short) -1, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06549");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) (byte) 10, (double) (short) 1, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06550");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) (short) 0, 0.0d, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06551");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) 10, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06552");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) ' ', (double) (short) 10, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06553");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) (byte) 0, (double) (short) 10, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06554");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) (byte) 100, (double) (byte) 1, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06555");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) (short) -1, 10.0d, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06556");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) (byte) 0, 100.0d, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06557");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) (byte) 1, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06558");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) 0, (double) 1.0f, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06559");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', 0.0d, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06560");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) (short) 10, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06561");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) (short) 0, (double) (short) 1, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06562");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) 'a', 10.0d, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06563");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) 'a', (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06564");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) (byte) 10, (double) (byte) 1, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06565");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) 1L, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06566");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', 10.0d, 0.0d, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06567");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) '#', (double) 0L, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06568");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) (short) 1, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06569");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) (byte) 10, (double) (byte) 1, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06570");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) (short) 10, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06571");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) (short) 100, (double) (byte) 10, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06572");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (short) 1, 10.0d, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06573");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) 100, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06574");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) 100.0f, (double) 1L, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06575");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) 10, (double) 10L, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06576");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) (byte) -1, (double) 100, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06577");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (short) 10, (double) (byte) 100, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06578");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) 100.0f, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06579");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (-1.0d), (double) '#', (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06580");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) (byte) 0, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06581");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (short) 0, (double) (byte) 0, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06582");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (short) 100, (double) (short) 1, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06583");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, 10.0d, (double) 100, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06584");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) (byte) 100, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06585");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) (-1.0f), (double) 10L, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06586");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) '4', (double) 10, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06587");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) 10.0f, (double) (short) 1, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06588");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (-1.0d), (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06589");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (byte) 1, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06590");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 0, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06591");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) 0, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06592");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) (byte) 100, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06593");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) (short) 0, (double) '4', (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06594");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) ' ', (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06595");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) (-1L), (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06596");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) 100, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06597");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) (short) 0, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06598");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) (-1.0f), (double) (byte) -1, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06599");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) 1L, (double) 'a', (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06600");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) (byte) 0, (double) 100.0f, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06601");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) (byte) 10, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06602");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 0L, (double) 10L, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06603");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, 100.0d, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06604");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) (byte) 1, (double) 10, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06605");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) 1L, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06606");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) 100L, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06607");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', 100.0d, (-1.0d), (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06608");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), 0.0d, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06609");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 100, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06610");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) (byte) 100, (double) (-1), (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06611");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) (-1L), (double) (short) 10, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06612");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, 10.0d, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06613");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (-1.0d), (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06614");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, 0.0d, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06615");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 'a', (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06616");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) (byte) 10, (double) (byte) 10, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06617");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) (short) -1, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06618");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) 1.0f, (double) 0.0f, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06619");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) ' ', (double) 1, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06620");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) (byte) 10, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06621");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (short) 10, (double) 1, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06622");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (short) 10, (double) 1.0f, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06623");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) (byte) 0, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06624");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) 10, 0.0d, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06625");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (-1.0d), (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06626");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), 0.0d, (double) 10, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06627");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 100L, (double) 1L, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06628");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) (short) 100, (double) 1L, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06629");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 100.0f, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06630");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) 100L, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06631");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) (short) 0, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06632");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) 100, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06633");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) 0L, (double) 10, (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06634");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) (short) 0, (double) 1, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06635");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) (short) 100, (double) 0, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06636");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, 10.0d, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06637");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) (short) 0, (double) 10, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06638");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 0, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06639");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) (byte) 10, (double) 1L, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06640");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) ' ', (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06641");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) (short) -1, 0.0d, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06642");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) (short) 10, 100.0d, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06643");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) '#', 0.0d, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06644");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (byte) 100, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06645");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (short) -1, (double) 1L, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06646");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) 100L, (double) 100L, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06647");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (short) 100, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06648");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) (byte) -1, (double) 100L, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06649");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (-1.0d), (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06650");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) (byte) 1, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06651");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) 1, (double) (byte) -1, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06652");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) (byte) -1, (double) 1L, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06653");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 10L, (double) 1L, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06654");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, 0.0d, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06655");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), 10.0d, (double) (short) 1, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06656");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (-1.0d), (double) (short) 10, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06657");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) 0, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06658");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) '#', (double) (byte) 0, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06659");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) '#', (double) 10.0f, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06660");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) 10L, (double) (byte) 10, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06661");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) 0L, 0.0d, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06662");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) (-1.0f), (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06663");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) (short) 1, (double) 1, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06664");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) 'a', (double) 100, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06665");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) (short) 10, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06666");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (-1.0d), (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06667");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) (short) 100, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06668");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) 10, (double) (byte) 100, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06669");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) (-1L), (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06670");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) 10L, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06671");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 0.0f, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06672");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, 0.0d, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06673");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) 1.0f, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06674");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) 10.0f, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06675");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) (byte) 0, (double) 1, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06676");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 0, (double) 1.0f, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06677");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) 0, (double) 1.0f, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06678");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) 1L, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06679");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) ' ', (double) 1.0f, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06680");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, 100.0d, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06681");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, 0.0d, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06682");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) (byte) 0, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06683");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) 100.0f, (double) (byte) 100, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06684");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) 10L, (double) (byte) -1, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06685");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) 0, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06686");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (-1.0d), (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06687");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) 10, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06688");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) 10, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06689");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (-1.0d), 100.0d, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06690");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (short) 1, 100.0d, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06691");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (byte) 0, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06692");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) 0L, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06693");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) (short) -1, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06694");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) 10L, (double) 'a', (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06695");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 0, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06696");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (short) 1, (double) '4', (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06697");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, 0.0d, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06698");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, 0.0d, 10.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06699");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) (short) 10, (double) (-1), (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06700");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 1.0f, (double) 1L, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06701");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (-1.0d), (double) 0, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06702");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) (byte) 10, (double) ' ', (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06703");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) '#', (double) 100.0f, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06704");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) 100L, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06705");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) 100L, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06706");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) 1, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06707");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) '4', (-1.0d), 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06708");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) (byte) -1, (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06709");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, 0.0d, (double) (byte) -1, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06710");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (-1.0f), (-1.0d), (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06711");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) 10L, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06712");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) (-1.0f), (double) ' ', (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06713");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, 0.0d, (double) (-1L), (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06714");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (short) -1, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06715");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) ' ', (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06716");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) 'a', (double) 1.0f, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06717");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) 100.0f, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06718");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) (byte) 100, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06719");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) 0L, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06720");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) (short) 10, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06721");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), 100.0d, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06722");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) 1, (double) (short) 10, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06723");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) 0L, (double) (-1.0f), (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06724");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) (-1L), (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06725");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) (-1), (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06726");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (byte) 1, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06727");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) (-1), (double) ' ', (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06728");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, 0.0d, (double) 100.0f, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06729");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, 10.0d, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06730");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', 0.0d, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06731");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) (-1L), (double) (-1L), 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06732");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 0.0f, (double) 100L, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06733");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) (byte) 1, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06734");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) 10L, (double) 1L, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06735");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) (-1), (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06736");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, 1.0d, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06737");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) (byte) -1, (double) 0, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06738");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) (byte) -1, (double) (short) 10, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06739");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) '4', (double) '4', (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06740");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) (byte) -1, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06741");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, 100.0d, (double) 100.0f, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06742");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) (-1), (double) (-1L), (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06743");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) 100.0f, (double) (short) 1, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06744");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) 0, (double) 100.0f, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06745");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) 10.0f, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06746");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, 0.0d, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06747");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) (-1L), (double) 0L, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06748");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) '#', (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06749");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (short) 1, (double) (byte) 1, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06750");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) '#', (double) 'a', (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06751");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) 100, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06752");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) 1L, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06753");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) 10.0f, (double) '4', (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06754");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) 100, (double) (short) 0, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06755");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) (short) 0, (double) 1, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06756");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, 0.0d, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06757");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) 0, 0.0d, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06758");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (-1), (double) (byte) 10, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06759");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) (short) 1, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06760");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 1, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06761");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) ' ', (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06762");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) 1, (double) (short) 10, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06763");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) 100L, 10.0d, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06764");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) '4', (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06765");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) '4', (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06766");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 100.0f, (double) (-1.0f), 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06767");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) (short) 100, (double) (-1L), (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06768");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, 100.0d, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06769");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) '4', (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06770");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) (byte) 0, (double) (-1.0f), (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06771");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) ' ', (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06772");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) 1.0f, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06773");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) 100L, (-1.0d), (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06774");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) 1L, (double) (byte) 0, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06775");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), 10.0d, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06776");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, 0.0d, (double) (-1.0f), 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06777");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) 10L, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06778");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) ' ', (double) 1, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06779");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (-1L), (-1.0d), (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06780");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, (double) (-1L), (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06781");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (short) -1, (double) 10, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06782");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) 0L, (double) (short) 0, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06783");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) (short) 10, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06784");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) (-1L), (double) (-1L), 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06785");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, 1.0d, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06786");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) 10.0f, (double) (byte) 0, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06787");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) 100L, (double) (byte) 10, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06788");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (short) 1, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06789");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) 100.0f, (double) (-1), (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06790");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) 10.0f, (double) 1.0f, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06791");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, 0.0d, (-1.0d), 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06792");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) 0L, (double) (-1L), (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06793");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, 0.0d, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06794");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) (-1.0f), (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06795");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) (short) 10, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06796");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (-1.0f), (double) (-1L), (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06797");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) ' ', 1.0d, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06798");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) ' ', (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06799");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) (byte) 1, (double) 1L, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06800");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) (byte) 10, (double) '4', (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06801");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) 100L, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06802");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 10, (double) (short) 100, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06803");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) 10, (double) (byte) 100, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06804");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, 10.0d, (double) '#', (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06805");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) 100.0f, (double) 0, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06806");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) 10.0f, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06807");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, (double) (short) -1, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06808");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, 0.0d, (double) 0L, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06809");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) 0, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06810");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', 0.0d, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06811");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) (short) 10, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06812");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, (double) 'a', 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06813");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, 0.0d, (double) 100, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06814");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, 10.0d, 10.0d, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06815");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) 0L, (double) (byte) 1, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06816");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) 'a', (double) 10.0f, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06817");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, 0.0d, (double) 0.0f, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06818");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) (-1), 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06819");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, 0.0d, (double) (short) 10, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06820");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), 0.0d, (double) 'a', (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06821");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, 10.0d, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06822");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (-1.0d), (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06823");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (byte) 0, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06824");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) 0L, (double) 100L, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06825");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, 0.0d, (double) 10, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06826");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 'a', (double) 0L, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06827");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) '4', (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06828");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) 10L, (double) (byte) 0, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06829");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', 100.0d, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06830");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, 0.0d, (double) 1.0f, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06831");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) ' ', (double) (byte) 1, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06832");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) '#', 1.0d, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06833");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) (byte) -1, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06834");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, 0.0d, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06835");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) 100L, (double) (-1.0f), (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06836");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) ' ', (double) 100.0f, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06837");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 1L, (double) 0.0f, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06838");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) 100L, (double) 10L, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06839");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) (-1), (double) (-1L), (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06840");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) (short) 0, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06841");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (byte) 1, (double) 100L, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06842");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) 'a', (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06843");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) (short) 10, (double) 100L, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06844");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) (short) -1, (double) (byte) 100, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06845");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) 1.0f, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06846");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) 10.0f, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06847");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, (double) (-1.0f), (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06848");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, 100.0d, (double) (short) 10, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06849");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) (short) 10, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06850");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) 100.0f, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06851");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) 0, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06852");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) (-1), (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06853");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) 100L, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06854");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) (short) 1, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06855");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, 0.0d, (double) 10, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06856");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) (byte) 0, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06857");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (-1.0f), (double) 'a', (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06858");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, 100.0d, 100.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06859");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) 10, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06860");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) (short) 10, 100.0d, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06861");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) (short) 1, (double) 10, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06862");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) 10L, (double) (byte) -1, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06863");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) (byte) -1, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06864");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) (byte) 100, (double) (short) 10, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06865");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (short) 0, (double) 100, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06866");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) (-1L), 100.0d, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06867");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) 'a', (double) 0, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06868");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, 0.0d, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06869");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) 10L, (double) '4', (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06870");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) 10L, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06871");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) 10, (double) (byte) -1, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06872");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) (short) 10, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06873");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, 0.0d, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06874");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) 0, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06875");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, 100.0d, (double) 'a', (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06876");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (short) 10, (double) (byte) -1, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06877");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) 1, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06878");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) 10, (double) (-1.0f), (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06879");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (-1), (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06880");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) 100L, (double) 'a', (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06881");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) (short) -1, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06882");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) '#', (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06883");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, 10.0d, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06884");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) 10, (double) 100L, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06885");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), 10.0d, (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06886");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 100.0f, (double) (-1.0f), (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06887");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, 0.0d, (double) 100, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06888");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, 1.0d, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06889");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) 1L, (double) ' ', (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06890");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) 0.0f, (double) (short) -1, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06891");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) (short) 10, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06892");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) '4', (double) (short) 1, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06893");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) (-1.0f), (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06894");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) (short) 100, 100.0d, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06895");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', 100.0d, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06896");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) (byte) 10, (double) 10, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06897");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) 0L, (double) 10, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06898");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) (short) 100, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06899");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, (double) (byte) 100, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06900");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, 0.0d, 0.0d, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06901");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) (byte) 10, (double) (byte) 0, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06902");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) 100.0f, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06903");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) 0.0f, (double) 100, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06904");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, 10.0d, (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06905");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, 10.0d, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06906");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) 0.0f, (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06907");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', 0.0d, (double) (short) 10, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06908");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (byte) -1, (double) (byte) 0, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06909");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) 100, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06910");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) (byte) 100, (double) 100L, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06911");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) 0.0f, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06912");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 100, (double) (-1L), 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06913");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) (short) 1, 10.0d, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06914");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) (short) -1, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06915");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) (byte) 0, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06916");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) (-1), (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06917");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) (short) 0, (double) 100, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06918");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) (-1.0f), (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06919");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', 0.0d, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06920");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) 10, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06921");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) (-1), (double) 1.0f, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06922");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) (-1.0f), (double) (byte) 100, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06923");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) (-1), 100.0d, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06924");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) 'a', (-1.0d), (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06925");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) (-1L), (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06926");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) 1L, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06927");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) 10.0f, (double) '#', (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06928");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 1, 0.0d, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06929");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, 100.0d, (double) 1L, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06930");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) (-1.0f), (double) 10L, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06931");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (double) (-1), (double) (-1.0f), (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06932");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 10L, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06933");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) (-1L), (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06934");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) (byte) 1, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06935");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) (byte) -1, (double) 100, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06936");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', 100.0d, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06937");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) (-1), 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06938");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, 10.0d, 0.0d, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06939");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (-1.0d), 10.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06940");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (byte) 100, (double) (-1.0f), (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06941");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) (-1), (double) 10, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06942");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, 100.0d, (double) (short) 1, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06943");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) (short) 10, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06944");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) (-1L), (double) (short) 0, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06945");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) 10.0f, (double) (short) 10, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06946");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) 100, (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06947");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) 10, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06948");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) (byte) -1, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06949");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), 0.0d, (double) (byte) 1, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06950");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) ' ', 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06951");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) 10L, (double) (byte) -1, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06952");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) 0, (double) (byte) 10, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06953");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) 0.0f, (double) (-1L), (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06954");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (short) 100, (double) 100, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06955");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) (byte) -1, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06956");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 100L, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06957");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (byte) 0, 0.0d, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06958");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (-1.0d), (double) (-1), (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06959");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (double) (short) 1, (double) ' ', (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06960");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) (-1.0f), (double) (byte) -1, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06961");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) 0.0f, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06962");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) 0L, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06963");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) 1, (double) (byte) 10, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06964");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) (short) 10, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06965");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) 1, (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06966");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) (-1.0f), (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06967");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, 0.0d, (double) (byte) 0, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06968");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) 0.0f, (double) 10.0f, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06969");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) 100L, (double) 1, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06970");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) 0L, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06971");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) (-1), (double) (short) 100, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06972");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, 1.0d, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06973");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, (double) '#', (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06974");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (byte) 1, (double) 100.0f, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06975");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) 0.0f, (double) (byte) 1, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06976");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (-1.0f), (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06977");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) 1L, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06978");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) (byte) 0, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06979");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) 1L, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06980");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) 1, (double) (-1), (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06981");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) (byte) 0, (double) (byte) 0, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06982");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 'a', (double) 100.0f, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06983");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, 0.0d, (double) 100, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06984");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) 0.0f, (double) 10, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06985");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) 0.0f, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06986");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) 'a', 0.0d, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06987");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (-1.0d), (double) 10L, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06988");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) (short) 1, (double) 0.0f, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06989");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, 0.0d, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06990");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) ' ', (double) 'a', (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06991");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) (short) 10, (double) 10, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06992");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) 1.0f, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06993");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) 10.0f, (double) 100, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06994");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (-1.0d), (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06995");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 1L, (double) 100.0f, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06996");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) 'a', (double) (short) -1, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06997");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) 10L, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06998");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) 10.0f, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06999");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) 1, (double) (byte) 100, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test07000");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 10L, (double) (short) 10, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

