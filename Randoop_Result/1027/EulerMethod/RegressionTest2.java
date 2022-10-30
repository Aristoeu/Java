package EulerMethod;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) 'a', (double) (byte) -1, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) '4', (double) (short) 100, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) (-1), (double) (byte) 0, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) 'a', (double) (short) 1, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) 100L, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) (-1), (double) 1, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) ' ', (double) (byte) 10, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 100L, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) (short) 100, (double) 10L, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) 100.0f, (-1.0d), (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (-1.0d), 0.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) (byte) -1, (double) (byte) 0, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) '#', (double) 0L, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) (-1.0f), (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) 0.0f, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (byte) 0, (double) 100.0f, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) (short) 10, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) 0, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) 0.0f, (double) (short) 0, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', 100.0d, (double) '4', (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) (-1.0f), (-1.0d), (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, 0.0d, (double) ' ', (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, 1.0d, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 'a', (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) 100L, 0.0d, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) 1.0f, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) (byte) 10, (double) (byte) 0, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) '#', (double) (-1), (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) (short) 10, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, 0.0d, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, 0.0d, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) 0L, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) (short) 100, (double) '#', (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (-1.0d), (double) (byte) 10, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) (byte) 100, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) 1.0f, (double) (-1), (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, 1.0d, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) (byte) 0, 100.0d, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) 0L, (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) (byte) 0, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, 1.0d, 0.0d, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) (short) 1, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) (short) 10, (double) 0.0f, (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) 1.0f, (double) (-1L), (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (-1.0f), (-1.0d), (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) (short) 100, (double) 100.0f, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) 'a', (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) (short) 1, (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) 1.0f, (double) 100, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) 0, (double) (-1.0f), (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (-1.0d), (double) (short) 1, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) (-1), (double) 100L, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 10L, 0.0d, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) 0L, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) 'a', (double) (short) 1, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, 100.0d, (double) 1.0f, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) (short) -1, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) (short) -1, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) (byte) 1, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) (byte) 1, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 100.0f, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) (short) 10, (double) (short) 100, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) (short) 0, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) (-1.0f), (-1.0d), (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, 100.0d, (double) (-1.0f), (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, 0.0d, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (byte) 10, (double) 1L, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, 100.0d, (-1.0d), (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) (byte) 1, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) 1.0f, 100.0d, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) (byte) 0, (double) 10L, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) (short) 0, (double) (-1L), (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) (short) 100, (double) (short) 10, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (short) 10, (double) 10, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, 0.0d, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 'a', (-1.0d), (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) (byte) 1, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) (byte) -1, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) 100.0f, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) (-1L), (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) 1L, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (byte) 0, (double) 0, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, 0.0d, (double) '#', 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (-1.0d), (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) (-1), (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) 10, 1.0d, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) (byte) -1, 1.0d, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) (byte) 0, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) (short) 100, (double) 10L, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) (byte) 100, 1.0d, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) 10.0f, (double) (short) 0, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) 10.0f, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) (short) 100, (double) (short) -1, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) (byte) -1, 0.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) (-1.0f), (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) '4', (double) (byte) 0, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, 0.0d, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (double) (-1.0f), (double) (byte) 10, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, 0.0d, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) 0L, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) 10, (double) '4', (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (-1.0d), (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) 1, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (byte) 0, (double) '#', (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (short) 0, (double) (byte) -1, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, 0.0d, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) (short) 100, (double) (short) 0, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) (-1), (double) 10L, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) (short) 100, (double) 10, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, 100.0d, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (byte) 100, (double) '#', 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (short) 10, (double) 100, (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) (short) 1, (double) (byte) 1, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) 100, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) 10, (double) 10.0f, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 10.0f, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, 0.0d, (double) (byte) 1, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 'a', 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) 1.0f, (double) 10L, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, 100.0d, (double) 10, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) 'a', (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (byte) 1, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, 10.0d, (double) (byte) 1, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (short) 1, (double) '4', (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) 'a', 0.0d, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) 0, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (-1.0d), (double) 0L, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) (byte) -1, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, 10.0d, (double) 0, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (byte) 1, (double) 100L, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, 0.0d, 1.0d, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, 0.0d, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) 10L, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) (short) 100, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (short) 100, (double) (byte) 10, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) (short) 1, (double) (short) 0, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, 100.0d, (double) (short) 10, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) 10, (double) 10L, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) (short) -1, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) 10.0f, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (byte) 10, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) (byte) 0, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) (-1L), (double) (byte) 100, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) (byte) -1, (double) (byte) -1, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, 0.0d, (double) 10, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (-1.0d), (double) 100.0f, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, 1.0d, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 10L, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) (short) 100, (-1.0d), (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) (byte) 0, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) '#', (double) (byte) -1, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) 100L, (double) 10.0f, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) (byte) 100, (-1.0d), (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) 'a', 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) 100, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) '4', 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) 1, (double) (byte) 10, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, 100.0d, 0.0d, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, 100.0d, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) 0L, (double) '4', (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) (-1.0f), 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) 10.0f, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) 'a', 0.0d, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 1.0f, (double) (-1), (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) (short) -1, 0.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) 1L, (double) (byte) -1, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) 1.0f, (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, 10.0d, (double) 'a', (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 100, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, 0.0d, 0.0d, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (short) 0, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (-1.0d), (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) 10, (double) (byte) 10, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) (short) 1, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) 0, (double) (short) -1, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) 'a', 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) 1.0f, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, 0.0d, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', 0.0d, (double) 10.0f, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) '4', (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) (-1), (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) 10L, (double) 10.0f, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, 1.0d, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) 0, (double) (-1), (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) '#', (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (short) 100, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) '#', (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) (short) 1, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 10.0f, (double) (byte) 1, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) (byte) 10, (double) 10L, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) '4', 1.0d, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) (short) 10, (double) (-1L), (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), 0.0d, (double) 0, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) 10, 1.0d, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (-1.0f), (double) (-1), (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) (short) 0, 100.0d, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) (byte) 100, (double) (byte) 10, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) (-1L), (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (-1), (double) (-1.0f), 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), 10.0d, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 1.0f, 10.0d, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) 100L, (double) 0, (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) (byte) 0, (double) 0, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, 0.0d, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) 0.0f, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (-1.0d), (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (byte) 100, 0.0d, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, 0.0d, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', 0.0d, (double) (-1), (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) 10L, (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) 0, (double) (-1L), 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) (byte) 0, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) (byte) 100, (double) 10.0f, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) (-1L), (double) 1, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) ' ', 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) (byte) 1, (double) 10.0f, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, 0.0d, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) (short) 0, (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) 100.0f, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (short) 1, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) '4', (double) 10L, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 10, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, 100.0d, (double) (byte) 10, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) (-1), (double) (short) 100, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) (short) 1, 0.0d, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) 1L, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) (short) 1, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) 1.0f, (double) (short) -1, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) (short) 10, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (byte) 10, (double) '#', 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) 'a', 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) (short) 100, 1.0d, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 1.0f, (double) 'a', (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) '#', (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) (short) 1, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 0, (-1.0d), (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) (short) 1, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) 100L, (double) (byte) 1, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) (short) 100, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) 0L, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) '4', (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) 1L, (double) (byte) 10, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) (-1.0f), (double) '#', (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) (-1L), (double) 1.0f, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) (short) 1, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) 100, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) 1L, (double) 'a', (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 0.0f, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (-1.0d), 0.0d, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) '4', (double) 0, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 0.0f, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, 100.0d, (double) 10, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) 10L, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) (short) 1, (double) '#', (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, 0.0d, (double) 100.0f, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, (double) (byte) 0, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, 0.0d, 0.0d, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, 0.0d, (double) (short) 100, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) 100L, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) (byte) 0, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', 100.0d, (double) (-1L), (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (byte) -1, (double) (byte) -1, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (-1.0d), (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) (-1), 0.0d, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, 0.0d, (double) (byte) 10, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) (byte) 0, (double) 'a', (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (byte) 1, 10.0d, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) (short) 1, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) 'a', (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) (byte) 1, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) (-1.0f), (double) 1L, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), 10.0d, (double) (short) 10, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) (byte) 10, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) (byte) -1, (double) (-1.0f), (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), 0.0d, (double) (short) -1, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) 0, (double) (byte) 1, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) 1, (double) 0L, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) 10L, 100.0d, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) 0.0f, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 1, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) (-1L), (double) (byte) 1, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, 0.0d, (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) (-1L), (double) (short) 100, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) (-1.0f), (double) (byte) 100, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 1L, (double) (byte) 0, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, 0.0d, (double) 'a', (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) 0.0f, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) 0L, (double) (byte) 1, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) (-1L), (double) 10L, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, 0.0d, (double) 10, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) 100L, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) (byte) 0, (double) (short) 100, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) 100, (double) (short) -1, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (short) 1, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, 0.0d, 1.0d, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) 0.0f, (double) (short) -1, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) (-1L), (double) 'a', (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 0.0f, (double) (byte) 10, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) '#', (-1.0d), (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) (-1.0f), (double) (byte) 100, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) (byte) 1, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (-1.0d), (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) '4', 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) (-1.0f), (double) 10, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) (short) 0, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) 10L, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) 1L, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) (byte) -1, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 0L, (double) 10L, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) 10L, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, 100.0d, (double) (byte) 100, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) '#', (-1.0d), (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) 'a', (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) (-1L), (double) (short) 10, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (-1.0d), (double) (byte) 0, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) '4', (double) 100, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) 1.0f, (double) 'a', (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, 1.0d, (double) '4', 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, 0.0d, 1.0d, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) 10.0f, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), 0.0d, (double) 100.0f, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) (short) 10, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, 100.0d, (double) (short) 0, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (-1.0d), 0.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (-1.0d), (double) ' ', (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) ' ', (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) 1.0f, 0.0d, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) 'a', 0.0d, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) 1, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) 100L, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 100.0f, (double) (byte) 1, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, 10.0d, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) (-1), 1.0d, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) (short) 10, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, 0.0d, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) (short) 0, (double) (byte) 10, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, 100.0d, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, 100.0d, (double) 0, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) '4', (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) '4', (double) 1, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, 0.0d, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) 'a', 1.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) (short) 10, (double) '4', (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) ' ', (double) (short) 10, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) ' ', (double) (byte) 1, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (-1.0d), 100.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) (byte) 0, (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) 'a', (double) 'a', 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) (short) 10, 10.0d, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (-1.0d), (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) 10.0f, 10.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) 100L, (double) '#', (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, 1.0d, (double) (short) 100, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 1, 0.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) (byte) 0, (double) (short) -1, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 10L, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', 0.0d, (double) 10, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (-1), (double) (byte) -1, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, 1.0d, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 10, (-1.0d), (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) (short) -1, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, 100.0d, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 10L, (double) '#', (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) (short) 100, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 100, (double) (short) 1, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (-1L), (double) 1.0f, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) (-1.0f), (double) 10.0f, (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, 0.0d, (double) 0.0f, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) (-1L), (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) '4', 1.0d, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) 'a', (-1.0d), (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) 1L, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) 0L, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 100.0f, (double) 10, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) 10.0f, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) (-1), 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, 0.0d, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) 'a', (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) 100.0f, (double) (short) -1, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (double) 1, (double) 10, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) 'a', 0.0d, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) (byte) 0, 10.0d, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) (short) -1, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (double) 100.0f, 0.0d, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) (byte) 1, 100.0d, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, 10.0d, (double) (byte) -1, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) 10L, (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) (short) 10, (double) (short) 1, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) 100, (double) (short) 100, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (-1.0d), (double) (byte) 100, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (byte) -1, (double) 10.0f, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) 10, (double) 100.0f, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) '4', 0.0d, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) (byte) 0, (double) (short) 0, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) (short) 10, (double) 100, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) (-1L), (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) (short) 0, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) (-1.0f), (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) (short) 10, (double) (byte) 10, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) 0.0f, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) (short) 100, (double) 1L, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), 100.0d, (double) 'a', (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) (-1L), 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) (-1.0f), (double) 1.0f, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (-1), (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) 1L, (double) (byte) 1, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) (short) -1, 1.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) 10L, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) 1L, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) (byte) 0, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) 1.0f, (double) 1.0f, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) (byte) 10, 100.0d, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (-1.0d), 0.0d, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 100, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 1L, 0.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) 0.0f, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) (short) 1, (double) 0L, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) (byte) 10, (double) '#', (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) (-1L), (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 1.0f, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) (short) 10, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) 10, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 1L, (double) (short) 0, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) 100.0f, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) 10.0f, (double) (byte) -1, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) 100, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 10L, (double) '#', (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) (-1L), (double) 0L, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) 10, (double) (-1.0f), (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, 0.0d, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) (-1.0f), (double) (byte) 100, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) 100L, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) 100, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) 0.0f, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) 0, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (byte) -1, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) 10, (double) (short) 0, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (double) (byte) 10, 1.0d, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) 0, (double) (short) 10, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) (-1.0f), (double) 0, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) ' ', 1.0d, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) '#', 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) (short) 10, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) 100L, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) 10, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (byte) -1, (double) 10L, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) 1L, (double) (short) -1, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, 0.0d, (double) (short) 1, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) 100.0f, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) (-1L), (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) (short) 100, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) 100.0f, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (byte) 100, (double) (-1), (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', 10.0d, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) 10.0f, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', 0.0d, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) (byte) 1, 100.0d, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) 10.0f, (double) 'a', (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) 100, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) 0.0f, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 1.0f, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) 0, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) (byte) 100, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (byte) 100, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (short) -1, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) 0.0f, 10.0d, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) (-1), (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) ' ', (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) '4', (double) 10.0f, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) 0, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (-1L), (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) (short) 10, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) (short) 1, (double) (byte) 100, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) (byte) 100, (double) 'a', (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (double) 1, (-1.0d), (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) (byte) 1, (double) (short) 1, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 100L, (double) (short) -1, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) 100L, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) '4', 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) (-1L), (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) (byte) 0, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) 10L, (double) 10L, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, 1.0d, (double) (byte) 10, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) 1, (double) 1, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) (short) -1, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) (-1L), (double) (-1L), (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) 0.0f, (double) 10L, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (-1.0d), (double) 1, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) 1.0f, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) (byte) 100, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) (short) 1, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, 0.0d, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) 10.0f, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) 1, (double) (-1L), (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, (double) 100.0f, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) 100L, (double) (short) 1, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.BiFunction.apply(Object, Object)\" because \"differentialEquation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) (byte) 0, 0.0d, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, 0.0d, 10.0d, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (-1.0d), (double) (short) 10, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) (byte) -1, (double) (short) 0, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

