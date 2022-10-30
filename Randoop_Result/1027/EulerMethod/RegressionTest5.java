package EulerMethod;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) (short) 0, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 100, (double) 1L, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) (byte) -1, (double) (-1L), (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) 0L, (double) 100L, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, 100.0d, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 'a', (double) (short) -1, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, (double) 10.0f, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) (short) -1, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) 10.0f, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) (short) 10, 0.0d, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) 0.0f, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) 10.0f, (double) (short) -1, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) ' ', (double) (byte) 0, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) 1.0f, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, 0.0d, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (short) 0, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) (-1L), (-1.0d), (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) 1.0f, (double) '#', 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) 10.0f, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) (byte) 0, 100.0d, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, (double) 'a', 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 1.0f, 10.0d, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, 0.0d, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) 1, (double) (short) 10, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, 0.0d, 0.0d, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 100.0f, (double) (-1L), (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) 100L, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, 0.0d, (double) (short) 0, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', 10.0d, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) (short) 10, (double) 10L, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (byte) 0, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) (byte) -1, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) 100L, (double) 10, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) 'a', (double) 1.0f, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 1.0f, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (-1.0d), (double) (short) -1, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) '4', (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) (byte) 100, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 1, (double) 100.0f, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) 1.0f, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) (byte) 100, (double) (-1L), (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) 1L, (double) (byte) -1, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, 0.0d, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) 0, (double) (byte) 100, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), 0.0d, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (byte) 100, (double) 10, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) 'a', (-1.0d), (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, 0.0d, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) (short) -1, (double) (short) 10, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) 10, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) (short) 10, (double) (-1), (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) (byte) 10, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) (short) -1, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) 0L, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 10, 0.0d, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) (byte) 1, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) 0, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (byte) 100, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) 0, (double) 1L, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) 10L, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 0L, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', 0.0d, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) ' ', (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) ' ', 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) 0, 100.0d, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, 100.0d, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, 0.0d, 1.0d, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, 10.0d, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) '#', (double) (-1.0f), (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', 1.0d, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) ' ', (double) 10.0f, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) 10L, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, 10.0d, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, 100.0d, (double) (-1L), (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) 1.0f, 0.0d, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, 0.0d, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (short) 100, (double) (short) 10, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (byte) 1, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 'a', (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) 'a', (double) (byte) 0, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (-1.0d), (double) (byte) 10, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, 10.0d, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) 0, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) (byte) 1, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) (-1.0f), 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) 10L, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) (short) 100, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, 1.0d, (double) (byte) 100, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) (byte) 0, (double) 0, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (-1.0d), (double) 1L, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) 0, (double) 100L, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) '4', (double) (-1.0f), (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) 100.0f, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) (short) -1, (double) (byte) 10, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, (double) 0.0f, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) 0.0f, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) 1, (double) (byte) 1, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) '4', (double) 10.0f, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) (byte) -1, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) 1.0f, (double) (short) -1, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, 100.0d, (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), 0.0d, (double) 0L, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) '#', 1.0d, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, 0.0d, (double) 10L, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 0, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) 'a', (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (-1L), (double) 'a', (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) 100.0f, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) 100, (double) (-1.0f), (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) 10, 10.0d, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (-1.0d), (double) '4', (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, 0.0d, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) 100L, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) 1.0f, (double) 0L, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) (byte) 1, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) (-1), 0.0d, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) 1L, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) (short) 100, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) 0, (double) (-1.0f), (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) (short) -1, (double) (-1.0f), (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, 10.0d, (-1.0d), (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) 'a', (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, 0.0d, (double) 10L, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) (short) 1, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) 100L, (double) 100, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) (short) 100, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) (short) 1, (double) 'a', (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, 10.0d, 10.0d, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, 0.0d, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (short) 100, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) 100L, (double) 100.0f, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) (short) -1, 1.0d, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) (byte) 10, 0.0d, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) '#', (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) 100.0f, (double) 'a', (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) (-1.0f), (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) 10L, 1.0d, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) 0, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, 0.0d, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) (byte) 10, (double) '#', (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (-1), (double) 10.0f, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, 10.0d, (double) 0, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, 100.0d, (double) (-1), 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) (-1L), (double) (short) 10, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (byte) 0, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) ' ', (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) (short) 100, (double) '#', (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) 10.0f, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) 100.0f, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) 0L, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) (byte) 1, (double) (short) 1, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) '#', (-1.0d), (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) 100.0f, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) 0, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) 100, (double) (byte) -1, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, 0.0d, (double) 0, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) (byte) 100, (double) (short) 1, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, 0.0d, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) 10L, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) '#', (double) ' ', (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) (short) -1, (double) 10.0f, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, 0.0d, (double) (short) -1, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, 1.0d, (double) (short) -1, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) (byte) -1, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) (byte) 100, (double) (-1.0f), (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) (byte) 10, (double) 10L, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) 1.0f, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), 0.0d, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) 100, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) 0.0f, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) 100, (double) (-1L), (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) 0, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), 0.0d, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) 0.0f, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) 1L, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) 10, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) 1L, (double) '4', (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) '4', (double) ' ', (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) 1, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) 10, (double) 1L, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) (byte) 0, (double) 1, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', 0.0d, (double) 0, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) 10, (double) '#', (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) 100L, (double) (short) 0, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) (-1L), (double) 0.0f, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) (-1), (double) (-1), 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) (byte) -1, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) ' ', (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, 0.0d, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) 10.0f, (double) '#', (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, 100.0d, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, 1.0d, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, 0.0d, (double) (byte) 100, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 'a', (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, 100.0d, 0.0d, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) '4', (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (byte) 100, (double) (-1.0f), (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) 10.0f, (double) (byte) 100, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) (short) 100, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) (byte) 10, (double) (short) 0, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) ' ', (double) 10.0f, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) (short) 10, (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), 0.0d, (double) 1L, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) (byte) 0, (double) (short) 1, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) ' ', (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', 0.0d, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) 1.0f, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) 100L, (double) 0, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) 1L, (double) 10, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, 0.0d, (double) (short) 0, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) (short) 10, (double) 10, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), 0.0d, (double) (byte) -1, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) (-1), (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) (-1.0f), (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) (-1.0f), (double) (-1L), (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) 100.0f, (double) 100, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) 0L, (double) (-1), (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) 0L, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) (byte) -1, (double) (byte) -1, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (double) (byte) -1, (double) ' ', (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, 100.0d, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) 10L, (double) (short) -1, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) (byte) 10, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) 100, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) (byte) 10, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (-1.0f), (double) 1.0f, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), 0.0d, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) (short) -1, (double) ' ', (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) (byte) 10, (double) 1, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) '#', (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) (byte) 0, 1.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) 0L, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) (-1), (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) (byte) -1, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (short) -1, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (-1.0d), (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) 1.0f, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) (byte) -1, (double) 1L, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) 'a', 0.0d, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) (-1), 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) 0L, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) 100, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 100L, (double) 0.0f, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (-1.0d), (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) 10L, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) 1, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) 1, (double) 1L, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) ' ', (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) 100L, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (-1.0d), (-1.0d), (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) (byte) 10, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) (-1L), (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) 1, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) 0.0f, (double) 1L, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) (short) -1, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) (byte) 10, (double) 100, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) (-1.0f), (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) ' ', (double) (-1), (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) (-1L), 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) (short) -1, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) (short) 10, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) 100.0f, (double) (byte) 100, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) 0L, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (short) 100, (double) ' ', (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) (short) 1, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (byte) 10, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, 0.0d, (double) (short) 100, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (short) 100, (double) 0.0f, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) (short) 10, 0.0d, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) 10.0f, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) ' ', (double) (short) 100, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) 10, 0.0d, (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) (short) 1, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) (-1L), (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, 10.0d, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) (byte) 10, (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, 1.0d, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (byte) -1, (double) (-1.0f), 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 1L, 0.0d, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) 10, (double) (-1.0f), (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) (-1.0f), (double) '4', (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) 1, (double) 100, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (-1.0f), 10.0d, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) (short) 100, (double) 0, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) '#', (double) 0L, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) (byte) 1, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, 0.0d, (double) (byte) 0, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) ' ', (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) 1, (double) 1, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) (byte) 100, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) 100, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (byte) 100, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (-1L), 10.0d, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) 'a', (double) 100.0f, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (short) 10, 10.0d, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) (short) -1, (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, 0.0d, (double) 1, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) 10, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) (byte) 10, (double) 100L, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) (short) 10, (double) 1, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, 1.0d, 100.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) 10.0f, (double) (byte) -1, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, 0.0d, (-1.0d), (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (short) 10, (double) (byte) 0, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (-1.0f), (-1.0d), (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, 0.0d, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 0, (double) 'a', (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (double) (byte) 100, (double) (byte) 100, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) 10.0f, (double) 1L, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, 0.0d, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) 0L, (double) 100L, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 10.0f, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) ' ', (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) (short) 1, (double) (short) 0, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) (byte) 10, (double) 10L, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) 10L, (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) 100.0f, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (byte) 100, (double) '#', 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (byte) -1, (double) 0, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) (short) 10, (double) 1.0f, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 100L, (double) 10.0f, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) 1.0f, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) (short) 0, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) (byte) 1, 1.0d, (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) (short) 10, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) (-1L), (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, 0.0d, 1.0d, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) 1L, (double) (short) -1, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (-1L), (double) (byte) 0, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) (-1.0f), (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) (-1L), (double) 10, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (-1.0d), (double) (byte) 10, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, 10.0d, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), 10.0d, (double) 10.0f, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) '4', (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) (short) 0, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) (short) -1, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) (byte) 1, 100.0d, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (short) 0, (double) (short) 0, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) (byte) 0, 10.0d, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 10, (double) 100, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) 0.0f, (double) (short) 1, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) 100L, (double) 0L, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) (-1L), (double) (short) 100, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (byte) 1, (double) 1, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', 10.0d, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) '#', (double) (byte) 0, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) '#', (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), 10.0d, (double) 1L, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) 0.0f, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, 1.0d, (double) (byte) 10, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) (short) 100, (double) (short) 100, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) (byte) 100, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) 'a', (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, 0.0d, (double) 10.0f, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) 0.0f, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (short) 1, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 0L, (double) 1, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) (short) 1, (double) (short) -1, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 100, (double) 0.0f, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) (short) -1, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, 10.0d, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 10.0f, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, 0.0d, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) '4', (double) 0.0f, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (-1.0d), (double) (byte) 1, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) 0.0f, (double) (short) 0, (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) 1.0f, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) 10L, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (short) 100, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) (byte) 0, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) 1L, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (byte) 10, (double) 10.0f, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 100, (double) 1.0f, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) 10L, (double) (short) 0, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) 10L, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) (byte) 0, (double) 100.0f, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, 10.0d, (double) 0.0f, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) (short) 10, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) 10L, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) 10L, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) (short) 100, (double) '#', 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) 0.0f, 100.0d, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) '4', (double) 0, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', 100.0d, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) 1L, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) (-1L), (double) 10, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) (short) -1, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) 100.0f, (double) 10L, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) ' ', (double) (byte) 10, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) (short) 1, (double) 1L, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) 10, (double) (byte) 10, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) (short) 100, (double) (short) -1, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) 100L, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) 10L, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 1L, (double) 10, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), 0.0d, (-1.0d), (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) (short) 100, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, 0.0d, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) 0L, (double) 1L, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) 100, (double) 10, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (byte) 0, (double) 100L, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) '#', (double) (byte) 10, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, 0.0d, (double) 10.0f, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 100L, (double) (byte) -1, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) (short) 10, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) 100L, (double) 100L, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, 0.0d, (double) (-1.0f), (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) (byte) 0, (double) 10, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) ' ', 1.0d, (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) 1.0f, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) ' ', 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) (short) 1, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, 100.0d, (double) (byte) 100, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) ' ', 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) (-1.0f), (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 0.0f, (double) 1.0f, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, 1.0d, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) 10, (double) 0, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) 0L, (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) 1.0f, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, (double) 1.0f, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) (short) -1, (double) (short) 10, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) (byte) 1, (double) (short) 100, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) (-1.0f), 0.0d, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, 10.0d, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, 0.0d, (double) 1, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) (-1.0f), 0.0d, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (-1), (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, 100.0d, (double) 0, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) '4', (double) 100, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) 100L, (double) (-1.0f), (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) (byte) -1, (double) 0, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (-1.0d), 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) '#', (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) (-1.0f), (double) (byte) 1, (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) 100.0f, (double) (-1L), (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 1L, (double) 100L, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (byte) -1, (double) (short) 100, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) 'a', (double) 100L, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) 1L, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (-1.0d), (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) '#', (double) (byte) 0, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (-1L), 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) '#', (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) 10, (-1.0d), (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) 0, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) (byte) -1, (double) (byte) -1, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, 100.0d, 0.0d, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, 100.0d, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) 1, (double) 1.0f, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 1L, 100.0d, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) (byte) -1, (double) (byte) 10, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (double) (-1), (double) (short) 100, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) 100, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) (byte) 0, (double) 1.0f, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) 10, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 100L, (double) 1.0f, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, 0.0d, (double) 'a', 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) 0L, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) 10, (double) '#', (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) '#', (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) 100.0f, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) (short) 100, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, 100.0d, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) 1L, (double) 100.0f, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) (-1), 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) (short) 0, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) (-1.0f), (double) (short) 100, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) 'a', (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, 0.0d, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) (byte) 0, 100.0d, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 10L, (-1.0d), (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, 0.0d, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, 10.0d, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) 10L, 10.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, 0.0d, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) (short) 10, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (short) -1, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 10, (double) (byte) 10, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, 1.0d, 10.0d, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) 100, (double) (short) 10, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, 0.0d, 0.0d, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, 10.0d, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) 0, (double) 1, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) 1L, (double) 10.0f, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) (-1L), (double) 0L, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 0L, (double) (-1.0f), (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) (byte) 100, 0.0d, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) (byte) 0, 100.0d, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) 10L, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) (short) 100, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) 1L, (double) (byte) 1, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (byte) 10, 10.0d, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) 'a', (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 1.0f, 100.0d, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) 10.0f, 0.0d, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) '4', 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) (short) -1, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) ' ', (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

