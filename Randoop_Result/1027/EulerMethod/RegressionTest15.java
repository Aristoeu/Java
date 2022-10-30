package EulerMethod;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test07501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07501");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) (short) 0, (double) 'a', (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07502");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) (short) 100, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07503");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, 0.0d, (double) 1.0f, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07504");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, 100.0d, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07505");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 100.0f, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07506");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) (-1.0f), 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07507");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (byte) 100, (double) 0.0f, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07508");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 10.0f, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07509");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (short) 1, (double) (byte) 10, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07510");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) (short) -1, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07511");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (-1.0d), (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07512");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 0L, 100.0d, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07513");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) 100, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07514");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 1L, (double) '4', 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07515");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) 100.0f, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07516");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (-1.0d), (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07517");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (short) 10, (double) 0.0f, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07518");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 0L, (double) (short) 1, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07519");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (-1L), (double) (-1.0f), 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07520");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) (byte) 10, (double) 'a', 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07521");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) (short) -1, 0.0d, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07522");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) 100, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07523");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) (short) 100, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07524");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (byte) -1, 0.0d, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07525");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) (short) -1, 100.0d, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07526");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, 0.0d, (double) 100.0f, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07527");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) '#', (-1.0d), (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07528");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) (byte) -1, (double) 100L, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07529");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, 100.0d, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07530");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) (byte) 100, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07531");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) 1.0f, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07532");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 0, (double) (short) 0, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07533");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) 10, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07534");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (-1.0d), (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07535");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, (double) 10L, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07536");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) 1, (double) (-1L), (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07537");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) 10, (double) (short) 10, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07538");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, 100.0d, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07539");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) (byte) -1, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07540");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (-1), 100.0d, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07541");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) '#', (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07542");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) (byte) -1, (double) (short) -1, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07543");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, 1.0d, (double) (-1.0f), (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07544");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', 10.0d, (double) 0, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07545");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) 10, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07546");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) 1, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07547");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) 0L, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07548");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (short) 1, (double) (short) 100, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07549");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) (short) 100, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07550");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) '4', (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07551");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) 100L, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07552");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) (-1), (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07553");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) (-1L), (double) 1L, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07554");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) 10L, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07555");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) 0, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07556");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) (short) 100, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07557");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), 100.0d, (double) ' ', (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07558");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) 10L, (double) (short) -1, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07559");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) (byte) 100, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07560");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) 1.0f, (double) (byte) 1, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07561");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) '#', (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07562");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) (-1.0f), (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07563");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) 100.0f, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07564");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (double) (-1), 10.0d, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07565");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) (short) 100, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07566");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) (short) -1, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07567");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) (byte) -1, 0.0d, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07568");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 10L, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07569");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) (short) 10, (double) '#', (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07570");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) (-1L), (double) (byte) 1, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07571");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) (short) -1, (double) 1.0f, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07572");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, 0.0d, (double) (-1L), (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07573");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (short) -1, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07574");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) (-1.0f), (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07575");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) 1.0f, (double) ' ', (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07576");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (-1.0d), (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07577");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (short) 1, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07578");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) (short) -1, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07579");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) 'a', (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07580");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) ' ', (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07581");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) (-1L), 0.0d, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07582");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) (short) 100, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07583");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, 10.0d, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07584");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, 100.0d, (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07585");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, 0.0d, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07586");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) ' ', (double) '4', (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07587");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, 0.0d, (double) 10.0f, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07588");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (byte) -1, (double) '#', (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07589");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) 10L, (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07590");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) (short) -1, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07591");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) (byte) 0, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07592");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) (short) 100, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07593");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) (byte) 10, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07594");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) 1L, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07595");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (-1.0f), (double) (short) -1, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07596");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) 100.0f, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07597");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (short) 1, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07598");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) 100, (double) (short) 0, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07599");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) 10.0f, (double) 100, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07600");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) (short) 10, (-1.0d), (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07601");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) (-1.0f), (double) 100L, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07602");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), 0.0d, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07603");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) 100.0f, (double) 100.0f, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07604");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) 0.0f, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07605");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) '4', (double) 100L, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07606");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (-1.0d), (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07607");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 1, (double) 0, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07608");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, 1.0d, (double) 0L, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07609");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) 10L, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07610");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) 0L, 10.0d, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07611");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) 1, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07612");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) 1.0f, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07613");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) (-1.0f), (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07614");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, 1.0d, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07615");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) (short) 0, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07616");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, 1.0d, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07617");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) (byte) 10, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07618");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (-1.0d), (double) (short) 10, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07619");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) 10, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07620");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) 1.0f, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07621");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) (-1L), (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07622");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) 10, (double) 'a', (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07623");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, 100.0d, (double) 'a', (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07624");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) (short) 0, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07625");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) 0L, (double) (byte) 100, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07626");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) (byte) 0, (double) (-1L), 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07627");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 1, 1.0d, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07628");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) (-1.0f), (double) 100.0f, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07629");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) 1L, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07630");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (byte) 100, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07631");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) (-1), (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07632");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) (byte) 0, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07633");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) (byte) 100, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07634");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 0.0f, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07635");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) ' ', (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07636");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (byte) 1, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07637");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) (byte) -1, 0.0d, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07638");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) 10.0f, (double) (-1L), 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07639");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, 0.0d, (double) 10L, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07640");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (-1.0f), (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07641");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) 0L, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07642");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) 100L, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07643");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) 1L, (double) 1.0f, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07644");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) (short) 10, 100.0d, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07645");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) (short) 1, (double) (short) 10, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07646");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) (short) 10, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07647");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) (byte) 1, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07648");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) 'a', (double) ' ', (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07649");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) 'a', (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07650");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) 0, 0.0d, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07651");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (short) 10, (-1.0d), (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07652");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) 1, (double) (byte) 1, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07653");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) (short) -1, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07654");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) (short) 100, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07655");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) 0L, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07656");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) (short) 100, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07657");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) (byte) 1, (double) 0, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07658");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), 0.0d, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07659");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) 10.0f, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07660");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) 1, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07661");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) ' ', (double) (short) 0, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07662");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, 100.0d, (double) 0.0f, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07663");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) '4', (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07664");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) (short) 0, (double) (byte) 1, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07665");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) 100, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07666");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) (byte) 1, (double) (-1.0f), (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07667");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) (-1), (double) 0.0f, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07668");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) (short) 0, (double) ' ', (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07669");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) 1, 0.0d, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07670");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) (byte) 100, 100.0d, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07671");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) '4', (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07672");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) (-1), (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07673");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) ' ', 0.0d, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07674");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) 100, (double) (byte) -1, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07675");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 0.0f, (double) (short) 100, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07676");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) 0, (double) (short) 10, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07677");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) (byte) 0, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07678");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) 100, (double) 100, (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07679");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 100, (double) 10L, (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07680");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) 100, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07681");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) ' ', 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07682");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) (byte) -1, (double) 0.0f, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07683");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, 100.0d, (double) 0.0f, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07684");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (-1), (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07685");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) (byte) 100, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07686");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (short) -1, (double) 10.0f, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07687");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, 100.0d, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07688");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, 10.0d, (double) (short) 0, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07689");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (-1.0d), (double) 10L, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07690");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) 100, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07691");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) (-1L), (double) (-1), (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07692");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) 10, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07693");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) (byte) -1, (double) 0, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07694");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) 0.0f, 1.0d, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07695");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) ' ', 0.0d, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07696");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) (byte) -1, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07697");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) ' ', (double) 1L, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07698");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) (byte) 1, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07699");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (short) 0, 100.0d, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07700");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) (-1.0f), (double) 10.0f, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07701");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (short) 10, (double) (byte) 100, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07702");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) 100L, (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07703");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) 1L, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07704");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) (short) 1, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07705");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) (byte) 100, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07706");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) 0, (double) (byte) 100, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07707");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) ' ', 1.0d, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07708");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) (byte) 1, (double) 1, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07709");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) (byte) 100, 1.0d, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07710");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) (short) 0, (double) 0, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07711");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) (short) 10, (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07712");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) '#', 10.0d, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07713");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) (short) 100, 0.0d, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07714");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) (short) 1, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07715");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) (byte) 0, (double) (-1L), (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07716");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) (short) 100, 100.0d, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07717");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) (byte) 10, (double) 1, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07718");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), 10.0d, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07719");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) 1, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07720");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) (short) 1, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07721");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (double) 100.0f, (double) (byte) 0, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07722");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) 1.0f, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07723");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) 0, 1.0d, (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07724");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, 0.0d, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07725");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) '4', (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07726");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) 100L, (double) (byte) 0, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07727");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) (byte) 0, (double) 1.0f, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07728");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) '#', (double) 1L, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07729");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) '4', (double) (byte) 1, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07730");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) 0.0f, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07731");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) (byte) 1, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07732");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (double) (short) -1, (double) (byte) 100, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07733");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 'a', (-1.0d), (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07734");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) 100.0f, (double) (byte) 100, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07735");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (-1.0d), (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07736");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (-1.0d), 10.0d, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07737");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) (short) 10, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07738");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) 'a', (double) 100L, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07739");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) '4', (double) 100, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07740");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) (byte) -1, 1.0d, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07741");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) 100L, (double) 0.0f, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07742");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) '4', (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07743");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (short) 0, (double) (byte) 100, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07744");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) '#', (double) '4', (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07745");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) (byte) 0, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07746");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (-1), (double) 1L, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07747");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (byte) 100, (double) 'a', (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07748");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, 0.0d, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07749");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) (-1), (double) 0, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07750");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 0.0f, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07751");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (-1.0f), 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07752");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) (short) 100, (double) (short) 100, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07753");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) (short) -1, 100.0d, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07754");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (byte) 10, (double) 0.0f, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07755");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) 100, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07756");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (byte) 1, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07757");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) (short) 1, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07758");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) 1, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07759");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) (-1.0f), (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07760");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) (-1), (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07761");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) 1L, 100.0d, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07762");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) 1, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07763");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) (byte) 100, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07764");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (-1.0d), (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07765");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) (-1), 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07766");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) 0L, (double) 1L, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07767");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) 10L, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07768");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) (short) 100, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07769");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, 10.0d, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07770");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) (byte) 10, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07771");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) 100L, (double) 0, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07772");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (byte) 10, (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07773");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) 'a', (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07774");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) (byte) 10, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07775");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (-1.0f), (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07776");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) 'a', (double) (short) 100, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07777");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) (short) 1, (double) 0L, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07778");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) 100L, (double) (byte) 0, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07779");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) (short) -1, (double) 0, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07780");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) (short) 10, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07781");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) 100.0f, (double) '4', (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07782");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) 100.0f, (double) 1L, (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07783");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 10L, (double) (byte) 100, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07784");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) (-1), (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07785");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) (byte) 1, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07786");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) ' ', 100.0d, (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07787");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 'a', (double) ' ', (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07788");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (byte) 100, (double) '#', (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07789");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) 1, (double) 1L, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07790");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) (byte) 10, (double) (short) -1, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07791");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, 0.0d, (double) (byte) -1, (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07792");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, 1.0d, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07793");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) 100L, (double) (short) 1, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07794");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) (-1), (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07795");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) 1L, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07796");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) 0L, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07797");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (double) (byte) 0, (double) (-1.0f), (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07798");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) 1, (double) '#', (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07799");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) 'a', (double) 100L, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07800");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 0.0f, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07801");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) 1.0f, (double) (-1L), (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07802");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 1.0f, (double) (short) -1, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07803");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) '4', (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07804");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) (-1.0f), (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07805");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) (byte) -1, 0.0d, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07806");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) 1L, (double) (-1.0f), (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07807");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, 100.0d, 1.0d, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07808");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) (short) -1, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07809");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, 0.0d, (double) 100.0f, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07810");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (-1L), (double) 0L, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07811");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) 10L, (double) (short) 100, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07812");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) (short) -1, 100.0d, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07813");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) (short) 1, (-1.0d), (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07814");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) (byte) 10, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07815");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) (short) 10, (double) 0L, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07816");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) 100L, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07817");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) (-1L), (double) (-1), (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07818");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, 10.0d, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07819");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) (byte) 10, (double) (byte) 0, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07820");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) 10L, (double) (short) 1, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07821");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) '#', (double) 1, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07822");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) 100, (double) '#', (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07823");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) 100.0f, 1.0d, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07824");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, 10.0d, (double) (-1L), (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07825");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) 100L, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07826");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, 1.0d, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07827");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) (short) -1, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07828");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 10.0f, (double) (-1), (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07829");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, 0.0d, 1.0d, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07830");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, 1.0d, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07831");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (double) 0, (double) 10.0f, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07832");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) 0.0f, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07833");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, 10.0d, (double) 10L, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07834");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) 1.0f, 1.0d, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07835");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (-1.0d), (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07836");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) 10L, (double) (byte) -1, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07837");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) (byte) 0, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07838");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) (short) 1, (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07839");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) 10L, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07840");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 0.0f, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07841");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, 1.0d, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07842");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) (short) 100, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07843");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) (short) 0, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07844");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) (short) 100, 1.0d, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07845");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) 1, (double) (byte) 10, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07846");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (byte) 10, (double) 10L, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07847");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, 0.0d, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07848");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) 1.0f, (double) (-1.0f), (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07849");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (-1), (double) 100L, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07850");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), 1.0d, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07851");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) 100.0f, (double) (short) -1, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07852");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) 10L, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07853");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) 100.0f, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07854");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) (byte) 100, (double) (short) -1, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07855");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) (byte) -1, (double) 100L, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07856");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) (short) 0, (double) 10.0f, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07857");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) '#', (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07858");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, 10.0d, (double) (-1L), (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07859");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (byte) -1, (double) 1.0f, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07860");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) (-1), (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07861");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (double) 10.0f, (double) (-1L), (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07862");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) (short) 10, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07863");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) (-1), (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07864");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', 10.0d, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07865");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, 0.0d, 1.0d, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07866");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) '#', (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07867");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, 0.0d, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07868");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) '4', (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07869");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) 1L, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07870");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) 0L, (double) 1.0f, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07871");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) '4', (double) (short) 1, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07872");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) 1L, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07873");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, 10.0d, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07874");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) 10.0f, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07875");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 10L, 0.0d, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07876");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) (byte) 1, (double) 10, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07877");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) 1.0f, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07878");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) (-1), (-1.0d), (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07879");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) 0, (double) (short) 0, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07880");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 1.0f, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07881");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (double) 1, (double) (short) 0, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07882");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, 0.0d, (double) 'a', 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07883");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) 0, 0.0d, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07884");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) 1, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07885");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) (short) 0, (double) (short) 1, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07886");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) 1, (double) (byte) 10, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07887");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) '#', 0.0d, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07888");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) (byte) 100, (double) (-1.0f), (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07889");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (-1.0d), (double) (byte) 100, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07890");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) 10L, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07891");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) (-1.0f), (double) 10, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07892");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) (short) 10, 0.0d, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07893");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) (-1L), (double) (-1L), (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07894");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) 1, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07895");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (-1.0d), (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07896");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) 'a', (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07897");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) (byte) -1, 100.0d, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07898");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (-1), (double) 100L, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07899");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', 1.0d, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07900");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) (-1L), (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07901");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, (double) 1, (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07902");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) 100L, (double) ' ', (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07903");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) 100L, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07904");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, 1.0d, (double) 0L, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07905");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (short) -1, 0.0d, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07906");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, 1.0d, 10.0d, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07907");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) 0L, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07908");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) (short) 0, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07909");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) 100, (double) 1.0f, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07910");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, 0.0d, (double) (byte) -1, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07911");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) 0L, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07912");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (byte) 100, (double) 1L, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07913");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) ' ', (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07914");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) (byte) 10, (double) 0L, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07915");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) '4', 1.0d, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07916");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) '4', 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07917");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, 1.0d, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07918");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) (short) 10, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07919");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) 10.0f, (double) (byte) 0, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07920");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (byte) 10, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07921");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) (byte) 0, (-1.0d), 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07922");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) (short) 10, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07923");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), 0.0d, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07924");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) 10L, (double) (byte) 1, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07925");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) '#', (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07926");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) (byte) 100, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07927");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, 0.0d, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07928");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) 10L, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07929");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) 100, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07930");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, 0.0d, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07931");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) (-1L), (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07932");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) (short) 1, 10.0d, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07933");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) (-1L), 100.0d, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07934");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, (double) 1, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07935");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) ' ', (double) ' ', (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07936");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) (byte) 0, 100.0d, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07937");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) (short) 0, (double) 100L, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07938");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) 0.0f, (double) 'a', (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07939");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) 10, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07940");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) (short) 100, (double) 10.0f, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07941");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) (short) 0, (double) (byte) 10, (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07942");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) (byte) 1, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07943");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) 10L, (double) (short) -1, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07944");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) (byte) -1, (double) '#', (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07945");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) 100, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07946");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) (short) 100, 0.0d, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07947");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) (short) 1, (double) 'a', (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07948");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 0.0f, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07949");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) 0, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07950");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) (-1L), (double) 0L, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07951");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, 0.0d, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07952");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) '#', (double) 0L, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07953");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) (short) -1, (double) 0, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07954");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) (short) 100, (double) (short) 0, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07955");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) 0.0f, (double) (short) 10, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07956");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) ' ', (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07957");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) (-1.0f), (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07958");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 0L, (-1.0d), (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07959");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) 100, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07960");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, 0.0d, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07961");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, 100.0d, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07962");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) 1, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07963");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) (short) -1, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07964");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) (byte) 0, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07965");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) 1, (double) (byte) -1, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07966");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) (byte) 10, (double) (byte) 100, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07967");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) '#', (double) '4', (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07968");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) ' ', (double) 'a', (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07969");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) (short) 1, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07970");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) (byte) 0, (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07971");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) 0, (double) (byte) 0, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07972");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) 'a', (double) (byte) 10, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07973");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (-1), (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07974");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) 10, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07975");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (byte) 1, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07976");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) 10L, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07977");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, 10.0d, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07978");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), 100.0d, (double) ' ', (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07979");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) (-1L), (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07980");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 100.0f, (double) (byte) 0, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07981");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) 100, (double) 10L, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07982");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (byte) 100, (double) (short) -1, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07983");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) (byte) 100, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07984");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (-1.0d), (double) 10L, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07985");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) (-1.0f), (double) (-1), 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07986");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, 0.0d, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07987");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, 100.0d, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07988");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 100.0f, 100.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07989");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) (-1L), (double) (byte) 1, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07990");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) (-1L), (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07991");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) (short) 0, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07992");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) (short) 1, 0.0d, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07993");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) 100.0f, (double) 10L, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07994");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) (byte) -1, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07995");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) (byte) 100, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07996");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) ' ', (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07997");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', 0.0d, 0.0d, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07998");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, (double) 100L, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07999");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) 1, (double) 10L, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test08000");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (byte) 1, (double) (byte) 1, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

